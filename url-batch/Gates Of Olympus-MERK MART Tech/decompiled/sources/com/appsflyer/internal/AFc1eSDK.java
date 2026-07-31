package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1qSDK;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFc1eSDK implements AFc1iSDK {
    private boolean AFInAppEventParameterName;
    private final AFd1nSDK AFInAppEventType;
    Map<String, Object> values;

    public AFc1eSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFInAppEventType = aFd1nSDK;
    }

    private boolean AFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFInAppEventType(boolean z) {
        this.AFInAppEventParameterName = z;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final Map<String, Object> valueOf() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFInAppEventType() {
        Context context;
        if (AFInAppEventParameterName() && (context = this.AFInAppEventType.AFKeystoreWrapper) != null) {
            this.values = new LinkedHashMap();
            AFa1vSDK aFa1vSDK = new AFa1vSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1qSDK.4
                    private /* synthetic */ AFa1tSDK AFInAppEventType;
                    private /* synthetic */ Class values;

                    public AnonymousClass4(Class cls3, AFa1tSDK aFa1vSDK2) {
                        r1 = cls3;
                        r2 = aFa1vSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            Object obj2 = objArr[0];
                            if (obj2 != null) {
                                Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", new Class[0]).invoke(r1.cast(obj2), new Object[0]));
                                if (bundle2 != null) {
                                    str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                    str3 = bundle2.getString("target_url");
                                    Bundle bundle3 = bundle2.getBundle("extras");
                                    str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                                } else {
                                    str = null;
                                    str2 = null;
                                    str3 = null;
                                }
                                AFa1tSDK aFa1tSDK = r2;
                                if (aFa1tSDK != null) {
                                    aFa1tSDK.valueOf(str2, str3, str);
                                }
                            } else {
                                AFa1tSDK aFa1tSDK2 = r2;
                                if (aFa1tSDK2 != null) {
                                    aFa1tSDK2.valueOf(null, null, null);
                                }
                            }
                            return null;
                        }
                        AFa1tSDK aFa1tSDK3 = r2;
                        if (aFa1tSDK3 != null) {
                            aFa1tSDK3.values("onDeferredAppLinkDataFetched invocation failed");
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", TypedValues.Custom.S_STRING, context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1vSDK2.values("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1vSDK2.values(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1vSDK2.values(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1vSDK2.values(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1vSDK2.values(e4.toString());
            }
        }
    }

    public static final class AFa1vSDK implements AFa1qSDK.AFa1tSDK {
        private /* synthetic */ long values;

        AFa1vSDK(long j) {
            this.values = j;
        }

        @Override // com.appsflyer.internal.AFa1qSDK.AFa1tSDK
        public final void valueOf(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                Map<String, Object> map2 = AFc1eSDK.this.values;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFc1eSDK.this.values) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFc1eSDK aFc1eSDK = AFc1eSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFc1eSDK.values;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFc1eSDK.this.values;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.values);
            Map<String, Object> map5 = AFc1eSDK.this.values;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1qSDK.AFa1tSDK
        public final void values(String str) {
            Map<String, Object> map = AFc1eSDK.this.values;
            if (map != null) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final boolean values() {
        if (!AFInAppEventParameterName()) {
            return false;
        }
        Map<String, Object> map = this.values;
        return map == null || map.isEmpty();
    }
}
