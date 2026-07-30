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
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.AFf1zSDK;
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
    public String[] component2;
    public long component3;
    public final AFd1zSDK component4;
    public Map<String, String> getCurrencyIso4217Code;
    public String getMonetizationNetwork;
    public DeepLinkListener getRevenue;
    public List<List<String>> getMediationNetwork = new ArrayList();
    public final List<String> areAllFieldsValid = new ArrayList();

    public AFa1oSDK(AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private static void getRevenue(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1tSDK.getMediationNetwork().getCurrencyIso4217Code;
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
    private boolean h_(Intent intent, AFa1jSDK aFa1jSDK) {
        String string;
        Uri i_;
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
                            i_ = i_(string, it2);
                            if (i_ == null) {
                                StringBuilder sb = new StringBuilder("Found deeplink in push payload at ");
                                sb.append(next.toString());
                                AFLogger.afDebugLog(sb.toString());
                                List<List<String>> list = this.getMediationNetwork;
                                Intrinsics.checkNotNullParameter("payloadKey", "");
                                Map<String, Object> monetizationNetwork = AFa1tSDK.getMonetizationNetwork(aFa1jSDK.getMonetizationNetwork);
                                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                                monetizationNetwork.put("payloadKey", list);
                                AFa1gSDK aFa1gSDK = aFa1jSDK.AFAdRevenueData;
                                if (aFa1gSDK != null) {
                                    aFa1gSDK.getMonetizationNetwork(aFa1jSDK.getMonetizationNetwork);
                                }
                                uri = i_;
                            }
                        }
                    }
                    i_ = null;
                    if (i_ == null) {
                    }
                }
            }
        }
        if (data != null) {
            AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
            if (!aFj1nSDK.AFAdRevenueData("af_consumed")) {
                aFj1nSDK.I_("af_consumed", System.currentTimeMillis());
                g_(aFa1jSDK, data);
                return true;
            }
            StringBuilder sb2 = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb2.append(data.toString());
            sb2.append(" w/af_consumed");
            AFLogger.afInfoLog(sb2.toString());
            return false;
        }
        if (data2 != null) {
            AFj1nSDK aFj1nSDK2 = new AFj1nSDK(this.AFAdRevenueData);
            if (!aFj1nSDK2.AFAdRevenueData("af_consumed")) {
                aFj1nSDK2.I_("af_consumed", System.currentTimeMillis());
                g_(aFa1jSDK, data2);
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
        AFj1nSDK aFj1nSDK3 = new AFj1nSDK(intent);
        if (!aFj1nSDK3.AFAdRevenueData("af_consumed")) {
            aFj1nSDK3.I_("af_consumed", System.currentTimeMillis());
            g_(aFa1jSDK, uri);
            return true;
        }
        StringBuilder sb4 = new StringBuilder("skipping re-use of previously consumed deep link from push: ");
        sb4.append(uri.toString());
        sb4.append(" w/af_consumed");
        AFLogger.afInfoLog(sb4.toString());
        return false;
    }

    private Uri i_(Object obj, Iterator<String> it) {
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
            } catch (JSONException e7) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e7);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getRevenue == null) {
            getRevenue(str);
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getCurrencyIso4217Code(new DeepLinkResult(null, error));
        }
    }

    public final void f_(AFa1jSDK aFa1jSDK, Intent intent, Context context) {
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component4;
        if (context != null) {
            aFc1cSDK.AFAdRevenueData.getCurrencyIso4217Code = context.getApplicationContext();
        }
        if (!h_(intent, aFa1jSDK) && this.getRevenue != null && this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) == 0 && !this.component4.getMediationNetwork().getRevenue("ddl_sent")) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1qSDK equals = this.component4.equals();
            equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(new AFf1wSDK(aFa1pSDK, this.component4)));
        }
        this.component4.getMediationNetwork().getRevenue("ddl_sent", true);
    }

    public final void g_(AFa1jSDK aFa1jSDK, Uri uri) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(this, aFa1jSDK, uri, this.areAllFieldsValid);
        AFe1qSDK equals = this.component4.equals();
        equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFf1ySDK));
        this.AFAdRevenueData = null;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult) {
        if (this.getRevenue == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(aFg1cSDK, sb.toString());
        try {
            this.getRevenue.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th);
        }
    }

    public final void j_(AFa1jSDK aFa1jSDK, Uri uri, Uri uri2) {
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
            String str2 = this.getMonetizationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1jSDK.getMonetizationNetwork.put("appended_query_params", encodedQuery);
                AFa1gSDK aFa1gSDK = aFa1jSDK.AFAdRevenueData;
                if (aFa1gSDK != null) {
                    aFa1gSDK.getMonetizationNetwork(aFa1jSDK.getMonetizationNetwork);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1jSDK.getMonetizationNetwork.put("af_deeplink", obj);
            AFa1gSDK aFa1gSDK2 = aFa1jSDK.AFAdRevenueData;
            if (aFa1gSDK2 != null) {
                aFa1gSDK2.getMonetizationNetwork(aFa1jSDK.getMonetizationNetwork);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFj1pSDK.M_(this.component4.AFAdRevenueData().n_(), hashMap, uri);
        AFf1zSDK aFf1zSDK = new AFf1zSDK(this.component4, UUID.randomUUID(), uri);
        if (aFf1zSDK.equals()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1jSDK.getMonetizationNetwork.put("isBrandedDomain", bool);
            AFa1gSDK aFa1gSDK3 = aFa1jSDK.AFAdRevenueData;
            if (aFa1gSDK3 != null) {
                aFa1gSDK3.getMonetizationNetwork(aFa1jSDK.getMonetizationNetwork);
            }
        }
        if (!aFf1zSDK.copydefault()) {
            this.component4.i().AFAdRevenueData(hashMap);
            return;
        }
        aFf1zSDK.component2 = new AFf1zSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1oSDK.5
            @Override // com.appsflyer.internal.AFf1zSDK.AFa1vSDK
            public final void getMonetizationNetwork(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFa1oSDK.this.AFAdRevenueData(hashMap);
            }

            @Override // com.appsflyer.internal.AFf1zSDK.AFa1vSDK
            public final void getRevenue(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }
        };
        AFe1qSDK equals = this.component4.equals();
        equals.getMonetizationNetwork.execute(equals.new AnonymousClass1(aFf1zSDK));
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        if (this.getRevenue != null) {
            try {
                try {
                    DeepLink mediationNetwork = DeepLink.getMediationNetwork(map);
                    mediationNetwork.getMediationNetwork.put("is_deferred", false);
                    getCurrencyIso4217Code(new DeepLinkResult(mediationNetwork, null));
                    return;
                } catch (JSONException e7) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e7, true);
                    getCurrencyIso4217Code(new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED));
                    return;
                }
            } catch (Throwable th) {
                getCurrencyIso4217Code(new DeepLinkResult(null, null));
                throw th;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1tSDK.getMediationNetwork().getCurrencyIso4217Code;
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
}
