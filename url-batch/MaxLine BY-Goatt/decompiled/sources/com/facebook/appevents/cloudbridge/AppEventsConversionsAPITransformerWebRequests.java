package com.facebook.appevents.cloudbridge;

import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import defpackage.ah0;
import defpackage.b23;
import defpackage.in1;
import defpackage.k3;
import defpackage.k71;
import defpackage.li1;
import defpackage.ll3;
import defpackage.m71;
import defpackage.rj2;
import defpackage.s03;
import defpackage.up2;
import defpackage.zv;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;
    private static final String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static List<Map<String, Object>> transformedEvents;
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();
    private static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = rj2.c(200, 202);
    private static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = rj2.c(503, 504, 429);

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CloudBridgeCredentials {
        private final String accessKey;
        private final String cloudBridgeURL;
        private final String datasetID;

        public CloudBridgeCredentials(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.datasetID = str;
            this.cloudBridgeURL = str2;
            this.accessKey = str3;
        }

        public static /* synthetic */ CloudBridgeCredentials copy$default(CloudBridgeCredentials cloudBridgeCredentials, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        public final String component1() {
            return this.datasetID;
        }

        public final String component2() {
            return this.cloudBridgeURL;
        }

        public final String component3() {
            return this.accessKey;
        }

        public final CloudBridgeCredentials copy(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new CloudBridgeCredentials(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) obj;
            return Intrinsics.b(this.datasetID, cloudBridgeCredentials.datasetID) && Intrinsics.b(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && Intrinsics.b(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public final String getAccessKey() {
            return this.accessKey;
        }

        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        public final String getDatasetID() {
            return this.datasetID;
        }

        public int hashCode() {
            return this.accessKey.hashCode() + in1.j(this.cloudBridgeURL, this.datasetID.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb.append(this.datasetID);
            sb.append(", cloudBridgeURL=");
            sb.append(this.cloudBridgeURL);
            sb.append(", accessKey=");
            return in1.m(sb, this.accessKey, ')');
        }
    }

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    public static final void configure(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new CloudBridgeCredentials(str, str2, str3));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new ArrayList());
    }

    public static final String getCredentials() {
        try {
            CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release != null) {
                return credentials$facebook_core_release.toString();
            }
            return null;
        } catch (b23 unused) {
            return null;
        }
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, Integer num, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i);
    }

    public static /* synthetic */ void makeHttpRequest$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, String str, String str2, String str3, Map map, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = TIMEOUT_INTERVAL;
        }
        appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, str2, str3, map, i, function2);
    }

    private final List<Map<String, Object>> transformAppEventRequestForCAPIG(GraphRequest graphRequest) {
        JSONObject graphObject = graphRequest.getGraphObject();
        if (graphObject == null) {
            return null;
        }
        Map<String, Object> convertJSONObjectToHashMap = Utility.convertJSONObjectToHashMap(graphObject);
        convertJSONObjectToHashMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(convertJSONObjectToHashMap);
        Object tag = graphRequest.getTag();
        tag.getClass();
        linkedHashMap.put("custom_events", tag);
        StringBuilder sb = new StringBuilder();
        for (String str : linkedHashMap.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(linkedHashMap.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nGraph Request data: \n\n%s \n\n", sb);
        return AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(linkedHashMap);
    }

    public static final void transformGraphRequestAndSendToCAPIGEndPoint(GraphRequest graphRequest) {
        graphRequest.getClass();
        Utility.runOnNonUiThread(new k3(6, graphRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transformGraphRequestAndSendToCAPIGEndPoint$lambda$0(GraphRequest graphRequest) {
        graphRequest.getClass();
        String graphPath = graphRequest.getGraphPath();
        List F = graphPath != null ? up2.F(0, 6, graphPath, new String[]{"/"}) : null;
        if (F == null || F.size() != 2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            List<Map<String, Object>> transformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(graphRequest);
            if (transformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(transformAppEventRequestForCAPIG);
            int min = Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            List<Map<String, Object>> transformedEvents$facebook_core_release = appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release();
            IntRange intRange = new IntRange(0, min - 1, 1);
            transformedEvents$facebook_core_release.getClass();
            List M = intRange.isEmpty() ? ah0.m : zv.M(transformedEvents$facebook_core_release.subList(0, intRange.n + 1));
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) M);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, "POST", new JSONObject(linkedHashMap).toString(), li1.b(new Pair("Content-Type", "application/json")), TIMEOUT_INTERVAL, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(M));
        } catch (b23 e) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    public final void appendEvents$facebook_core_release(List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            getTransformedEvents$facebook_core_release().addAll(list);
        }
        int max = Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (max > 0) {
            List<Map<String, Object>> r = zv.r(max, getTransformedEvents$facebook_core_release());
            r.getClass();
            if (!(r instanceof k71) || (r instanceof m71)) {
                setTransformedEvents$facebook_core_release(r);
            } else {
                s03.O(r, "kotlin.collections.MutableList");
                throw null;
            }
        }
    }

    public final CloudBridgeCredentials getCredentials$facebook_core_release() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        Intrinsics.f("credentials");
        throw null;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    public final List<Map<String, Object>> getTransformedEvents$facebook_core_release() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        Intrinsics.f("transformedEvents");
        throw null;
    }

    public final void handleError$facebook_core_release(Integer num, List<? extends Map<String, ? extends Object>> list, int i) {
        list.getClass();
        if (zv.q(RETRY_EVENTS_HTTP_RESPONSE, num)) {
            if (currentRetryCount >= i) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
            } else {
                getTransformedEvents$facebook_core_release().addAll(0, list);
                currentRetryCount++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[Catch: IOException -> 0x003f, UnknownHostException -> 0x0042, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0042, IOException -> 0x003f, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0023, B:8:0x0029, B:10:0x002f, B:12:0x0045, B:14:0x0051, B:18:0x0061, B:20:0x009b, B:27:0x00b7, B:35:0x00bd, B:36:0x00c0, B:38:0x00c1, B:40:0x00dc), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc A[Catch: IOException -> 0x003f, UnknownHostException -> 0x0042, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0042, IOException -> 0x003f, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0023, B:8:0x0029, B:10:0x002f, B:12:0x0045, B:14:0x0051, B:18:0x0061, B:20:0x009b, B:27:0x00b7, B:35:0x00bd, B:36:0x00c0, B:38:0x00c1, B:40:0x00dc), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeHttpRequest$facebook_core_release(String str, String str2, String str3, Map<String, String> map, int i, Function2<? super String, ? super Integer, Unit> function2) {
        boolean z;
        Set<String> keySet;
        str.getClass();
        str2.getClass();
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(str2);
            if (map != null && (keySet = map.keySet()) != null) {
                for (String str4 : keySet) {
                    httpURLConnection.setRequestProperty(str4, map.get(str4));
                }
            }
            if (!httpURLConnection.getRequestMethod().equals("POST") && !httpURLConnection.getRequestMethod().equals("PUT")) {
                z = false;
                httpURLConnection.setDoOutput(z);
                httpURLConnection.setConnectTimeout(i);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                bufferedWriter.write(str3);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedOutputStream.close();
                StringBuilder sb = new StringBuilder();
                if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                sb.append(readLine);
                            }
                        } finally {
                            try {
                                throw th;
                            } catch (Throwable th) {
                                ll3.y(bufferedReader, th);
                            }
                        }
                    }
                    Unit unit = Unit.a;
                    bufferedReader.close();
                }
                String sb2 = sb.toString();
                Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                if (function2 == null) {
                    function2.invoke(sb2, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                }
                return;
            }
            z = true;
            httpURLConnection.setDoOutput(z);
            httpURLConnection.setConnectTimeout(i);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
            bufferedWriter2.write(str3);
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedOutputStream2.close();
            StringBuilder sb3 = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
            }
            String sb22 = sb3.toString();
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb22, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (function2 == null) {
            }
        } catch (UnknownHostException e) {
            Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "Connection failed, retrying: \n%s", e.toString());
            if (function2 != null) {
                function2.invoke(null, 503);
            }
        } catch (IOException e2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Send to server failed: \n%s", e2.toString());
        }
    }

    public final void setCredentials$facebook_core_release(CloudBridgeCredentials cloudBridgeCredentials) {
        cloudBridgeCredentials.getClass();
        credentials = cloudBridgeCredentials;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i) {
        currentRetryCount = i;
    }

    public final void setTransformedEvents$facebook_core_release(List<Map<String, Object>> list) {
        list.getClass();
        transformedEvents = list;
    }
}
