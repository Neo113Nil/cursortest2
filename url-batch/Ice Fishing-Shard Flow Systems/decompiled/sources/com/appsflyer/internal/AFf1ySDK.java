package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFf1ySDK extends AFe1uSDK<Map<String, Object>> {
    private static final int component2 = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> areAllFieldsValid;
    private final AFa1oSDK component1;
    private final AFa1jSDK component3;
    private final Uri component4;
    private final List<String> hashCode;

    public AFf1ySDK(AFa1oSDK aFa1oSDK, AFa1jSDK aFa1jSDK, Uri uri, List<String> list) {
        super(AFe1lSDK.RESOLVE_ESP, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1oSDK;
        this.component3 = aFa1jSDK;
        this.component4 = uri;
        this.hashCode = list;
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i2 = component2;
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.18.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return hashMap;
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return hashMap;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final AFe1rSDK getMediationNetwork() {
        Integer num = null;
        if (!getRevenue(this.component4.toString())) {
            this.component1.j_(this.component3, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        String str = null;
        while (i2 < 5) {
            Map<String, Object> r_ = r_(Uri.parse(obj));
            String str2 = (String) r_.get("res");
            Integer num2 = (Integer) r_.get("status");
            String str3 = (String) r_.get("error");
            if (str2 == null || !getRevenue(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i2 < 4) {
                arrayList.add(str2);
            }
            i2++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.component3) {
            this.component3.getMediationNetwork("af_deeplink_r", hashMap);
            this.component3.getMediationNetwork("af_deeplink", this.component4.toString());
        }
        this.component1.j_(this.component3, obj != null ? Uri.parse(obj) : this.component4, this.component4);
        this.areAllFieldsValid = hashMap;
        return AFe1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 60000L;
    }

    private boolean getRevenue(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.hashCode);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.hashCode.contains(new URL(str).getHost());
        } catch (MalformedURLException e7) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e7);
            return false;
        }
    }
}
