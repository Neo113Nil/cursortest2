package com.linecorp.linesdk.api.internal;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.api.LineApiClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class AutoRefreshLineApiClientProxy {

    private static class TokenAutoRefreshInvocationHandler implements InvocationHandler {

        @NonNull
        private final Map<Method, Boolean> autoRefreshStateCache;

        @NonNull
        private final LineApiClient target;

        private boolean isAutoRefreshEnabled(@NonNull Method method) {
            Boolean bool = this.autoRefreshStateCache.get(method);
            if (bool != null) {
                return bool.booleanValue();
            }
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls = this.target.getClass(); cls != null; cls = cls.getSuperclass()) {
                if (((TokenAutoRefresh) cls.getDeclaredMethod(name, parameterTypes).getAnnotation(TokenAutoRefresh.class)) != null) {
                    this.autoRefreshStateCache.put(method, Boolean.TRUE);
                    return true;
                }
                continue;
            }
            this.autoRefreshStateCache.put(method, Boolean.FALSE);
            return false;
        }

        private static boolean shouldRefreshToken(@NonNull Object obj) {
            return (obj instanceof LineApiResponse) && ((LineApiResponse) obj).getErrorData().getHttpResponseCode() == 401;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(this.target, objArr);
                if (isAutoRefreshEnabled(method) && shouldRefreshToken(invoke)) {
                    LineApiResponse<LineAccessToken> refreshAccessToken = this.target.refreshAccessToken();
                    if (refreshAccessToken.isSuccess()) {
                        try {
                            return method.invoke(this.target, objArr);
                        } catch (InvocationTargetException e4) {
                            throw e4.getTargetException();
                        }
                    }
                    if (refreshAccessToken.isNetworkError()) {
                        return refreshAccessToken;
                    }
                }
                return invoke;
            } catch (InvocationTargetException e5) {
                throw e5.getTargetException();
            }
        }

        private TokenAutoRefreshInvocationHandler(@NonNull LineApiClient lineApiClient) {
            this.target = lineApiClient;
            this.autoRefreshStateCache = new ConcurrentHashMap(0);
        }
    }

    private AutoRefreshLineApiClientProxy() {
    }

    @NonNull
    public static LineApiClient newProxy(@NonNull LineApiClient lineApiClient) {
        return (LineApiClient) Proxy.newProxyInstance(lineApiClient.getClass().getClassLoader(), new Class[]{LineApiClient.class}, new TokenAutoRefreshInvocationHandler(lineApiClient));
    }
}
