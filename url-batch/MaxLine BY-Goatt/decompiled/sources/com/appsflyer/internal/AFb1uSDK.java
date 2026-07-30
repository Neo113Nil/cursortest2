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
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1uSDK {
    public static Intent AFInAppEventType;
    public Map<String, String> AFInAppEventParameterName;
    private final AFc1zSDK AFLogger;
    public String[] afInfoLog;
    public long afRDLog;
    public DeepLinkListener valueOf;
    public String values;
    public List<List<String>> AFKeystoreWrapper = new ArrayList();
    public final List<String> afDebugLog = new ArrayList();

    public AFb1uSDK(AFc1zSDK aFc1zSDK) {
        this.AFLogger = aFc1zSDK;
    }

    private Uri AFInAppEventType(Object obj, Iterator<String> it) {
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[LOOP:0: B:42:0x0046->B:51:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean values(Intent intent, Context context, Map<String, Object> map) {
        String string;
        Uri AFInAppEventType2;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = AFInAppEventType;
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
                            AFInAppEventType2 = AFInAppEventType(string, it2);
                            if (AFInAppEventType2 == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                AFa1dSDK.AFInAppEventParameterName(map).put("payloadKey", this.AFKeystoreWrapper);
                                uri = AFInAppEventType2;
                                break;
                            }
                        }
                    }
                    AFInAppEventType2 = null;
                    if (AFInAppEventType2 == null) {
                    }
                }
            }
        }
        if (data != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            if (!AFInAppEventType.hasExtra("af_consumed")) {
                AFInAppEventType.putExtra("af_consumed", System.currentTimeMillis());
                AFInAppEventType(context, map, data2);
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
        if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            AFInAppEventType(context, map, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    public final void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf == null) {
            AFInAppEventType(map);
            return;
        }
        try {
            try {
                DeepLink AFInAppEventParameterName = DeepLink.AFInAppEventParameterName(map);
                AFInAppEventParameterName.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(AFInAppEventParameterName, null);
            } catch (JSONException e) {
                AFLogger.afErrorLog("[DDL] Error occurred", e, true);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            AFInAppEventParameterName(deepLinkResult);
        } catch (Throwable th) {
            AFInAppEventParameterName(new DeepLinkResult(null, null));
            throw th;
        }
    }

    public final void valueOf(Map<String, Object> map, Intent intent, Context context) {
        AFc1xSDK aFc1xSDK = (AFc1xSDK) this.AFLogger;
        if (context != null) {
            aFc1xSDK.AFInAppEventParameterName.AFInAppEventParameterName = context.getApplicationContext();
        }
        if (!values(intent, context, map) && this.valueOf != null && this.AFLogger.AFInAppEventParameterName().AFInAppEventType.AFInAppEventType("appsFlyerCount", 0) == 0 && !this.AFLogger.AFKeystoreWrapper().AFKeystoreWrapper("ddl_sent")) {
            AFb1sSDK aFb1sSDK = new AFb1sSDK(this.AFLogger);
            AFd1tSDK level = this.AFLogger.getLevel();
            level.AFKeystoreWrapper.execute(level.new AnonymousClass5(new AFd1jSDK(aFb1sSDK)));
        }
        this.AFLogger.AFKeystoreWrapper().valueOf("ddl_sent", true);
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
            sb.append(deepLinkResult.toString());
            AFLogger.afDebugLog(sb.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.afDebugLog("[DDL] skipping, no callback registered");
    }

    public final void AFInAppEventType(Context context, Map<String, Object> map, Uri uri) {
        AFd1lSDK aFd1lSDK = new AFd1lSDK(context, map, uri, this.afDebugLog);
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFd1tSDK level = this.AFLogger.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1lSDK));
        AFInAppEventType = null;
    }

    public final void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.afDebugLog("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
        } else {
            AFInAppEventType(str);
        }
    }

    private static void AFInAppEventType(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
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

    private static void AFInAppEventType(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }
}
