package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1pSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1zSDK implements AFc1iSDK {
    Map<String, Object> AFInAppEventParameterName;
    private final AFd1lSDK AFKeystoreWrapper;
    private boolean values;

    public AFd1zSDK(AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.AFKeystoreWrapper = aFd1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFKeystoreWrapper() {
        Context context;
        if (values() && (context = this.AFKeystoreWrapper.AFKeystoreWrapper) != null) {
            this.AFInAppEventParameterName = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1pSDK.3
                    private /* synthetic */ AFa1ySDK AFInAppEventParameterName;
                    private /* synthetic */ Class AFInAppEventType;

                    public AnonymousClass3(Class cls3, AFa1ySDK aFa1zSDK2) {
                        r1 = cls3;
                        r2 = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1ySDK aFa1ySDK = r2;
                            if (aFa1ySDK != null) {
                                aFa1ySDK.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", null).invoke(r1.cast(obj2), null));
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
                            AFa1ySDK aFa1ySDK2 = r2;
                            if (aFa1ySDK2 != null) {
                                aFa1ySDK2.AFInAppEventParameterName(str2, str3, str);
                            }
                        } else {
                            AFa1ySDK aFa1ySDK3 = r2;
                            if (aFa1ySDK3 != null) {
                                aFa1ySDK3.AFInAppEventParameterName(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.AFInAppEventParameterName("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e4);
                aFa1zSDK2.AFInAppEventParameterName(e4.toString());
            } catch (IllegalAccessException e5) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e5);
                aFa1zSDK2.AFInAppEventParameterName(e5.toString());
            } catch (NoSuchMethodException e6) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e6);
                aFa1zSDK2.AFInAppEventParameterName(e6.toString());
            } catch (InvocationTargetException e7) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e7);
                aFa1zSDK2.AFInAppEventParameterName(e7.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final boolean valueOf() {
        if (!values()) {
            return false;
        }
        Map<String, Object> map = this.AFInAppEventParameterName;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void values(boolean z4) {
        this.values = z4;
    }

    private boolean values() {
        return this.values;
    }

    public static final class AFa1zSDK implements AFa1pSDK.AFa1ySDK {
        private /* synthetic */ long AFInAppEventParameterName;

        public AFa1zSDK(long j4) {
            this.AFInAppEventParameterName = j4;
        }

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFd1zSDK.this.AFInAppEventParameterName) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFd1zSDK aFd1zSDK = AFd1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFd1zSDK.AFInAppEventParameterName;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName);
            Map<String, Object> map5 = AFd1zSDK.this.AFInAppEventParameterName;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str) {
            Map<String, Object> map = AFd1zSDK.this.AFInAppEventParameterName;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
