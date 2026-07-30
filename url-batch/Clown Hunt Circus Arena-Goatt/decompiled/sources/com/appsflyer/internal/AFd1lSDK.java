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

/* loaded from: classes.dex */
public final class AFd1lSDK extends AFd1uSDK<Map<String, Object>> {
    private static final int afRDLog = (int) TimeUnit.SECONDS.toMillis(2);
    private final Map<String, Object> AFLogger;
    private final List<String> AFVersionDeclaration;
    private final Context afDebugLog;
    private Map<String, Object> afErrorLog;
    private final Uri afInfoLog;

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final long AFKeystoreWrapper() {
        return 60000L;
    }

    public AFd1lSDK(Context context, Map<String, Object> map, Uri uri, List<String> list) {
        super(AFd1vSDK.RESOLVE_ESP, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, "ResolveEsp");
        this.afDebugLog = context;
        this.AFLogger = map;
        this.afInfoLog = uri;
        this.AFVersionDeclaration = list;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final AFd1ySDK values() throws Exception {
        if (!AFKeystoreWrapper(this.afInfoLog.toString())) {
            AFa1dSDK.valueOf().values(this.afDebugLog, this.AFLogger, this.afInfoLog);
            return AFd1ySDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.afInfoLog.toString();
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> AFInAppEventParameterName = AFInAppEventParameterName(Uri.parse(obj));
            String str2 = (String) AFInAppEventParameterName.get("res");
            Integer num2 = (Integer) AFInAppEventParameterName.get(NotificationCompat.CATEGORY_STATUS);
            String str3 = (String) AFInAppEventParameterName.get(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (str2 == null || !AFKeystoreWrapper(str2)) {
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
        synchronized (this.AFLogger) {
            this.AFLogger.put("af_deeplink_r", hashMap);
            this.AFLogger.put("af_deeplink", this.afInfoLog.toString());
        }
        AFa1dSDK.valueOf().values(this.afDebugLog, this.AFLogger, obj != null ? Uri.parse(obj) : this.afInfoLog);
        this.afErrorLog = hashMap;
        return AFd1ySDK.SUCCESS;
    }

    private static Map<String, Object> AFInAppEventParameterName(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = afRDLog;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.12.1");
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

    private boolean AFKeystoreWrapper(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate if link ").append(str).append(" belongs to ESP domains: ").append(this.AFVersionDeclaration).toString());
        try {
            return this.AFVersionDeclaration.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }
}
