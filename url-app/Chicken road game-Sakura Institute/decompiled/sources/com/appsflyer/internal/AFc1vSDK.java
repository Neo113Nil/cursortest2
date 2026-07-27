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
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1vSDK {
    public String AFInAppEventParameterName;
    public Intent AFInAppEventType;
    public List<List<String>> AFKeystoreWrapper = new ArrayList();
    public final List<String> AFLogger = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final AFd1kSDK f5863e;
    public long registerClient;
    public String[] unregisterClient;
    public DeepLinkListener valueOf;
    public Map<String, String> values;

    public AFc1vSDK(AFd1kSDK aFd1kSDK) {
        this.f5863e = aFd1kSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean AFInAppEventType(Intent intent, Context context, AFc1oSDK aFc1oSDK) {
        String string;
        Uri values;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.AFInAppEventType;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.AFKeystoreWrapper.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.AFKeystoreWrapper.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            values = values(string, it2);
                            if (values == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                List<List<String>> list = this.AFKeystoreWrapper;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(aFc1oSDK.AFInAppEventParameterName);
                                Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
                                AFInAppEventParameterName.put("payloadKey", list);
                                AFc1kSDK aFc1kSDK = aFc1oSDK.values;
                                if (aFc1kSDK != null) {
                                    aFc1kSDK.values(aFc1oSDK.AFInAppEventParameterName);
                                }
                                uri = values;
                            }
                        }
                    }
                    values = null;
                    if (values == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
            if (!aFj1ySDK.values("af_consumed")) {
                aFj1ySDK.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, aFc1oSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1ySDK aFj1ySDK2 = new AFj1ySDK(this.AFInAppEventType);
            if (!aFj1ySDK2.values("af_consumed")) {
                aFj1ySDK2.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
                AFKeystoreWrapper(context, aFc1oSDK, data2);
                return true;
            }
            StringBuilder sb3 = new StringBuilder("skipping re-use of previously consumed trampoline deep link: ");
            sb3.append(data2.toString());
            sb3.append(" w/af_consumed");
            AFLogger.afInfoLog(sb3.toString());
            return false;
        }
        if (uri == null) {
            AFLogger.afDebugLog("No deep link detected");
            return false;
        }
        AFj1ySDK aFj1ySDK3 = new AFj1ySDK(intent);
        if (!aFj1ySDK3.values("af_consumed")) {
            aFj1ySDK3.AFInAppEventParameterName("af_consumed", System.currentTimeMillis());
            AFKeystoreWrapper(context, aFc1oSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    private Uri values(Object obj, Iterator<String> it) {
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
            } catch (JSONException e4) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e4);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) this.f5863e;
        if (context != null) {
            aFd1nSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        if (!AFInAppEventType(intent, context, aFc1oSDK) && this.valueOf != null && this.f5863e.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0 && !this.f5863e.valueOf().AFInAppEventType("ddl_sent")) {
            AFc1jSDK aFc1jSDK = new AFc1jSDK();
            AFe1cSDK afInfoLog = this.f5863e.afInfoLog();
            afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(new AFf1kSDK(aFc1jSDK, this.f5863e)));
        }
        this.f5863e.valueOf().valueOf("ddl_sent", true);
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1jSDK aFf1jSDK = new AFf1jSDK(context, aFc1oSDK, uri, this.AFLogger);
        AFe1cSDK afInfoLog = this.f5863e.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFf1jSDK));
        this.AFInAppEventType = null;
    }

    public final void AFKeystoreWrapper(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf != null) {
            try {
                try {
                    DeepLink values = DeepLink.values(map);
                    values.AFKeystoreWrapper.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(values, null);
                } catch (JSONException e4) {
                    AFLogger.INSTANCE.e(AFg1aSDK.DDL, "Error occurred", e4, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                values(deepLinkResult);
                return;
            } catch (Throwable th) {
                values(new DeepLinkResult(null, null));
                throw th;
            }
        }
        values(map);
    }

    public final void values(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.INSTANCE.d(AFg1aSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        } else {
            AFKeystoreWrapper(str);
        }
    }

    public final void values(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
            StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            aFLogger.d(aFg1aSDK, sb.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1aSDK.DDL, "skipping, no callback registered");
    }

    private static void AFKeystoreWrapper(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void values(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
