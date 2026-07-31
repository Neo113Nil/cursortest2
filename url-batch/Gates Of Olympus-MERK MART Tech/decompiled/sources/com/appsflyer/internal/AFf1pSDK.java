package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class AFf1pSDK extends AFe1dSDK<Map<String, Object>> {
    private static final int AFLogger = (int) TimeUnit.SECONDS.toMillis(2);
    private Map<String, Object> d;
    private final Uri e;
    private final List<String> force;
    private final AFc1kSDK registerClient;
    private final Context unregisterClient;

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return DurationKt.MILLIS_IN_MINUTE;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean AFKeystoreWrapper() {
        return false;
    }

    public AFf1pSDK(Context context, AFc1kSDK aFc1kSDK, Uri uri, List<String> list) {
        super(AFe1eSDK.RESOLVE_ESP, new AFe1eSDK[]{AFe1eSDK.RC_CDN}, "ResolveEsp");
        this.unregisterClient = context;
        this.registerClient = aFc1kSDK;
        this.e = uri;
        this.force = list;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK values() throws Exception {
        Integer num = null;
        if (!values(this.e.toString())) {
            AFb1tSDK.AFInAppEventType().AFKeystoreWrapper(this.unregisterClient, this.registerClient, this.e, null);
            return AFe1bSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.e.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> values = values(Uri.parse(obj));
            String str2 = (String) values.get("res");
            Integer num2 = (Integer) values.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) values.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (str2 == null || !values(str2)) {
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
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.registerClient) {
            this.registerClient.AFInAppEventType("af_deeplink_r", hashMap);
            this.registerClient.AFInAppEventType("af_deeplink", this.e.toString());
        }
        AFb1tSDK.AFInAppEventType().AFKeystoreWrapper(this.unregisterClient, this.registerClient, obj != null ? Uri.parse(obj) : this.e, this.e);
        this.d = hashMap;
        return AFe1bSDK.SUCCESS;
    }

    private static Map<String, Object> values(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = AFLogger;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.12.6");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return hashMap;
        } catch (Throwable th) {
            hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th.getLocalizedMessage());
            AFLogger.afErrorLog(th.getMessage(), th);
            return hashMap;
        }
    }

    private boolean values(String str) {
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
