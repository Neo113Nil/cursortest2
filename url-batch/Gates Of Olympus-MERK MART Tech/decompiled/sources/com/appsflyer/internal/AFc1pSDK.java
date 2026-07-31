package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFc1pSDK {
    public Map<String, String> AFInAppEventType;
    public DeepLinkListener AFKeystoreWrapper;
    public String[] AFLogger;
    public long d;
    public final AFd1mSDK registerClient;
    public Intent valueOf;
    public String values;
    public List<List<String>> AFInAppEventParameterName = new ArrayList();
    public final List<String> e = new ArrayList();

    public AFc1pSDK(AFd1mSDK aFd1mSDK) {
        this.registerClient = aFd1mSDK;
    }

    public final void valueOf(AFc1kSDK aFc1kSDK, Intent intent, Context context) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) this.registerClient;
        if (context != null) {
            AFd1nSDK aFd1nSDK = aFd1kSDK.values;
            if (context != null) {
                aFd1nSDK.AFKeystoreWrapper = context.getApplicationContext();
            }
        }
        if (!valueOf(intent, context, aFc1kSDK) && this.AFKeystoreWrapper != null && this.registerClient.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0) == 0 && !this.registerClient.valueOf().values("ddl_sent")) {
            AFc1oSDK aFc1oSDK = new AFc1oSDK(this.registerClient);
            AFe1cSDK i = this.registerClient.i();
            i.AFInAppEventParameterName.execute(i.new AnonymousClass5(new AFf1qSDK(aFc1oSDK)));
        }
        this.registerClient.valueOf().AFInAppEventParameterName("ddl_sent", true);
    }

    public final void values(Context context, AFc1kSDK aFc1kSDK, Uri uri) {
        AFf1pSDK aFf1pSDK = new AFf1pSDK(context, aFc1kSDK, uri, this.e);
        AFe1cSDK i = this.registerClient.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1pSDK));
        this.valueOf = null;
    }

    private Uri valueOf(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFKeystoreWrapper(String str, DeepLinkResult.Error error) {
        if (this.AFKeystoreWrapper != null) {
            AFLogger.INSTANCE.d(AFg1jSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventType(new DeepLinkResult(null, error));
        } else {
            AFInAppEventParameterName(str);
        }
    }

    public final void values(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.AFKeystoreWrapper != null) {
            try {
                try {
                    DeepLink AFKeystoreWrapper = DeepLink.AFKeystoreWrapper(map);
                    AFKeystoreWrapper.values.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(AFKeystoreWrapper, null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(AFg1jSDK.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventType(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventType(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AFKeystoreWrapper(map);
    }

    public final void AFInAppEventType(DeepLinkResult deepLinkResult) {
        if (this.AFKeystoreWrapper != null) {
            AFLogger.INSTANCE.d(AFg1jSDK.DDL, new StringBuilder("Calling onDeepLinking with:\n").append(deepLinkResult.toString()).toString());
            try {
                this.AFKeystoreWrapper.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1jSDK.DDL, "skipping, no callback registered");
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.AFInAppEventType().valueOf;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog(new StringBuilder("Calling onAppOpenAttribution with:\n").append(map.toString()).toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFInAppEventParameterName(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.AFInAppEventType().valueOf;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean valueOf(Intent intent, Context context, AFc1kSDK aFc1kSDK) {
        String string;
        Uri valueOf;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.valueOf;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.AFInAppEventParameterName.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.AFInAppEventParameterName.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            valueOf = valueOf(string, it2);
                            if (valueOf == null) {
                                AFLogger.afDebugLog(new StringBuilder("Found deeplink in push payload at ").append(next.toString()).toString());
                                List<List<String>> list = this.AFInAppEventParameterName;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> AFInAppEventParameterName = AFb1tSDK.AFInAppEventParameterName(aFc1kSDK.values);
                                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                                AFInAppEventParameterName.put("payloadKey", list);
                                AFc1qSDK aFc1qSDK = aFc1kSDK.AFKeystoreWrapper;
                                if (aFc1qSDK != null) {
                                    aFc1qSDK.AFInAppEventType(aFc1kSDK.values);
                                }
                                uri = valueOf;
                            }
                        }
                    }
                    valueOf = null;
                    if (valueOf == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFi1oSDK aFi1oSDK = new AFi1oSDK(intent);
            if (!aFi1oSDK.AFInAppEventParameterName("af_consumed")) {
                aFi1oSDK.valueOf("af_consumed", System.currentTimeMillis());
                values(context, aFc1kSDK, data);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link: ").append(data.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (data2 != null) {
            AFi1oSDK aFi1oSDK2 = new AFi1oSDK(this.valueOf);
            if (!aFi1oSDK2.AFInAppEventParameterName("af_consumed")) {
                aFi1oSDK2.valueOf("af_consumed", System.currentTimeMillis());
                values(context, aFc1kSDK, data2);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed trampoline deep link: ").append(data2.toString()).append(" w/af_consumed").toString());
            return false;
        }
        if (uri != null) {
            AFi1oSDK aFi1oSDK3 = new AFi1oSDK(intent);
            if (!aFi1oSDK3.AFInAppEventParameterName("af_consumed")) {
                aFi1oSDK3.valueOf("af_consumed", System.currentTimeMillis());
                values(context, aFc1kSDK, uri);
                return true;
            }
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link from push: ").append(uri.toString()).append(" w/af_consumed").toString());
            return false;
        }
        AFLogger.afDebugLog("No deep link detected");
        return false;
    }
}
