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
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.AFf1ySDK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1oSDK {
    public Intent AFAdRevenueData;
    public final AFc1dSDK areAllFieldsValid;
    public long component3;
    public String[] component4;
    public String getCurrencyIso4217Code;
    public DeepLinkListener getMonetizationNetwork;
    public Map<String, String> getRevenue;
    public List<List<String>> getMediationNetwork = new ArrayList();
    public final List<String> component2 = new ArrayList();

    public AFa1oSDK(AFc1dSDK aFc1dSDK) {
        this.areAllFieldsValid = aFc1dSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g_(Intent intent, AFa1jSDK aFa1jSDK) {
        String string;
        Uri h_;
        Uri uri = null;
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        Intent intent2 = this.AFAdRevenueData;
        Uri data2 = (intent2 == null || !"android.intent.action.VIEW".equals(intent2.getAction())) ? null : intent2.getData();
        if (intent == null) {
            AFLogger.afDebugLog("Could not extract deeplink from null intent");
        } else {
            Bundle extras = intent.getExtras();
            if (!this.getMediationNetwork.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.getMediationNetwork.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            h_ = h_(string, it2);
                            if (h_ == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                List<List<String>> list = this.getMediationNetwork;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> revenue = AFa1tSDK.getRevenue(aFa1jSDK.getMediationNetwork);
                                Intrinsics.checkNotNullExpressionValue(revenue, "");
                                revenue.put("payloadKey", list);
                                AFa1gSDK aFa1gSDK = aFa1jSDK.getMonetizationNetwork;
                                if (aFa1gSDK != null) {
                                    aFa1gSDK.getMediationNetwork(aFa1jSDK.getMediationNetwork);
                                }
                                uri = h_;
                            }
                        }
                    }
                    h_ = null;
                    if (h_ == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1jSDK aFj1jSDK = new AFj1jSDK(intent);
            if (!aFj1jSDK.getMonetizationNetwork("af_consumed")) {
                aFj1jSDK.I_("af_consumed", System.currentTimeMillis());
                f_(aFa1jSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1jSDK aFj1jSDK2 = new AFj1jSDK(this.AFAdRevenueData);
            if (!aFj1jSDK2.getMonetizationNetwork("af_consumed")) {
                aFj1jSDK2.I_("af_consumed", System.currentTimeMillis());
                f_(aFa1jSDK, data2);
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
        AFj1jSDK aFj1jSDK3 = new AFj1jSDK(intent);
        if (!aFj1jSDK3.getMonetizationNetwork("af_consumed")) {
            aFj1jSDK3.I_("af_consumed", System.currentTimeMillis());
            f_(aFa1jSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    private static void getCurrencyIso4217Code(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    private Uri h_(Object obj, Iterator<String> it) {
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

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork == null) {
            getCurrencyIso4217Code(str);
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getRevenue(new DeepLinkResult(null, error));
        }
    }

    public final void e_(AFa1jSDK aFa1jSDK, Intent intent, Context context) {
        AFc1eSDK aFc1eSDK = (AFc1eSDK) this.areAllFieldsValid;
        if (context != null) {
            aFc1eSDK.AFAdRevenueData.getMonetizationNetwork = context.getApplicationContext();
        }
        if (!g_(intent, aFa1jSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component2().getMediationNetwork("ddl_sent", false)) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1lSDK copydefault = this.areAllFieldsValid.copydefault();
            copydefault.getRevenue.execute(copydefault.new AnonymousClass5(new AFf1xSDK(aFa1pSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.component2().getCurrencyIso4217Code("ddl_sent", true);
    }

    public final void f_(AFa1jSDK aFa1jSDK, Uri uri) {
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this, aFa1jSDK, uri, this.component2);
        AFe1lSDK copydefault = this.areAllFieldsValid.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFe1aSDK));
        this.AFAdRevenueData = null;
    }

    public final void getMediationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink revenue = DeepLink.getRevenue(map);
                    revenue.getCurrencyIso4217Code.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(revenue, null);
                } catch (JSONException e4) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e4, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getRevenue(deepLinkResult);
                return;
            } catch (Throwable th) {
                getRevenue(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    public final void getRevenue(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(aFg1cSDK, sb.toString());
        try {
            this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void i_(AFa1jSDK aFa1jSDK, Uri uri, Uri uri2) {
        if (!aFa1jSDK.getCurrencyIso4217Code("af_deeplink")) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                String substring = indexOf == -1 ? "" : obj.substring(indexOf);
                if (substring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (substring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                    } else {
                        arrayList.add(substring);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append("&");
                            } else if (!str.startsWith("?")) {
                                sb.append("?");
                            }
                            sb.append(str);
                        }
                    }
                    obj = obj.replace(substring, sb.toString());
                }
            }
            String str2 = this.getCurrencyIso4217Code;
            if (str2 != null && this.getRevenue != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getRevenue.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1jSDK.getMediationNetwork.put("appended_query_params", encodedQuery);
                AFa1gSDK aFa1gSDK = aFa1jSDK.getMonetizationNetwork;
                if (aFa1gSDK != null) {
                    aFa1gSDK.getMediationNetwork(aFa1jSDK.getMediationNetwork);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1jSDK.getMediationNetwork.put("af_deeplink", obj);
            AFa1gSDK aFa1gSDK2 = aFa1jSDK.getMonetizationNetwork;
            if (aFa1gSDK2 != null) {
                aFa1gSDK2.getMediationNetwork(aFa1jSDK.getMediationNetwork);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFj1iSDK.M_(this.areAllFieldsValid.AFInAppEventType().getMonetizationNetwork, hashMap, uri);
        AFf1ySDK aFf1ySDK = new AFf1ySDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1ySDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1jSDK.getMediationNetwork.put("isBrandedDomain", bool);
            AFa1gSDK aFa1gSDK3 = aFa1jSDK.getMonetizationNetwork;
            if (aFa1gSDK3 != null) {
                aFa1gSDK3.getMediationNetwork(aFa1jSDK.getMediationNetwork);
            }
        }
        if (!aFf1ySDK.equals()) {
            this.areAllFieldsValid.d().getMediationNetwork(hashMap);
            return;
        }
        aFf1ySDK.component2 = new AFf1ySDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1oSDK.5
            @Override // com.appsflyer.internal.AFf1ySDK.AFa1ySDK
            public final void getRevenue(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1ySDK.AFa1ySDK
            public final void getRevenue(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFa1oSDK.this.getMediationNetwork(hashMap);
            }
        };
        AFe1lSDK copydefault = this.areAllFieldsValid.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass5(aFf1ySDK));
    }
}
