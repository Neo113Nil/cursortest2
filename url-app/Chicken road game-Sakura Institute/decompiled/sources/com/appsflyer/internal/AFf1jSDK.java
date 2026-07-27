package com.appsflyer.internal;

import android.content.Context;
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
public final class AFf1jSDK extends AFe1dSDK<Map<String, Object>> {
    private static final int unregisterClient = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1oSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f5903d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f5904e;
    private final List<String> force;
    private final Context registerClient;

    public AFf1jSDK(Context context, AFc1oSDK aFc1oSDK, Uri uri, List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.registerClient = context;
        this.AFLogger = aFc1oSDK;
        this.f5904e = uri;
        this.force = list;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        Integer num = null;
        if (!AFInAppEventParameterName(this.f5904e.toString())) {
            AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, this.f5904e, null);
            return AFe1bSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.f5904e.toString();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        String str = null;
        while (i2 < 5) {
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(Uri.parse(obj));
            String str2 = (String) AFKeystoreWrapper.get("res");
            Integer num2 = (Integer) AFKeystoreWrapper.get("status");
            String str3 = (String) AFKeystoreWrapper.get("error");
            if (str2 == null || !AFInAppEventParameterName(str2)) {
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
        synchronized (this.AFLogger) {
            this.AFLogger.AFKeystoreWrapper("af_deeplink_r", hashMap);
            this.AFLogger.AFKeystoreWrapper("af_deeplink", this.f5904e.toString());
        }
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, obj != null ? Uri.parse(obj) : this.f5904e, this.f5904e);
        this.f5903d = hashMap;
        return AFe1bSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private boolean AFInAppEventParameterName(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(this.force);
        AFLogger.afRDLog(sb.toString());
        try {
            return this.force.contains(new URL(str).getHost());
        } catch (MalformedURLException e4) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e4);
            return false;
        }
    }

    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
            sb.append(uri.toString());
            AFLogger.afDebugLog(sb.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i2 = unregisterClient;
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.14.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th) {
            hashMap.put("error", th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
        }
        return hashMap;
    }
}
