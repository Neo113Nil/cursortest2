package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AFf1jSDK extends AFe1dSDK<Map<String, Object>> {
    private static final int unregisterClient = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1oSDK AFLogger;
    private Map<String, Object> d;
    private final Uri e;
    private final List<String> force;
    private final Context registerClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public AFf1jSDK(Context context, AFc1oSDK aFc1oSDK, Uri uri, List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.registerClient = context;
        this.AFLogger = aFc1oSDK;
        this.e = uri;
        this.force = list;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        Integer num = null;
        if (!AFInAppEventParameterName(this.e.toString())) {
            AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, this.e, null);
            return AFe1bSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.e.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(Uri.parse(obj));
            String str2 = (String) AFKeystoreWrapper.get("res");
            Integer num2 = (Integer) AFKeystoreWrapper.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) AFKeystoreWrapper.get("error");
            if (str2 == null || !AFInAppEventParameterName(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.AFLogger) {
            this.AFLogger.AFKeystoreWrapper("af_deeplink_r", hashMap);
            this.AFLogger.AFKeystoreWrapper("af_deeplink", this.e.toString());
        }
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, obj != null ? Uri.parse(obj) : this.e, this.e);
        this.d = hashMap;
        return AFe1bSDK.SUCCESS;
    }

    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = unregisterClient;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.14.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
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

    private boolean AFInAppEventParameterName(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate if link ").append(str).append(" belongs to ESP domains: ").append(this.force).toString());
        try {
            return this.force.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
