package ru.rustore.sdk.metrics.internal;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.jn;
import f2.AbstractC2420c;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.s;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final b f43760a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.h f43761b;

    public s(b endpointProvider, q0 remoteMetricsEventDtoSerializer, w0.b logger) {
        Intrinsics.checkNotNullParameter(endpointProvider, "endpointProvider");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDtoSerializer, "remoteMetricsEventDtoSerializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43760a = endpointProvider;
        this.f43761b = W1.i.b(new p(this));
    }

    public final HttpsURLConnection a() {
        URLConnection openConnection = ((URL) this.f43761b.getValue()).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        URL backendUrl = (URL) this.f43761b.getValue();
        Intrinsics.checkNotNullExpressionValue(backendUrl, "backendUrl");
        httpsURLConnection.setHostnameVerifier(a(backendUrl));
        httpsURLConnection.setRequestMethod(jn.f16865b);
        httpsURLConnection.setRequestProperty("content-type", cc.f15719L);
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }

    public final void b(ArrayList values) {
        Intrinsics.checkNotNullParameter(values, "values");
        HttpsURLConnection httpsURLConnection = null;
        try {
            String a4 = a(values);
            HttpsURLConnection a5 = a();
            OutputStream outputStream = a5.getOutputStream();
            try {
                byte[] bytes = a4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                outputStream.flush();
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(outputStream, null);
                try {
                    q messageBuilder = new q(a5.getURL(), a5.getResponseCode(), a4, a5.getRequestProperty("X-Metrics-Request-Time"));
                    Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
                    a5.disconnect();
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = a5;
                    try {
                        r messageBuilder2 = new r(th);
                        Intrinsics.checkNotNullParameter(messageBuilder2, "messageBuilder");
                        throw new MetricsException.NetworkError("Http request was failed", th);
                    } catch (Throwable th2) {
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String a(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            p0 remoteMetricsEventDto = (p0) obj;
            Intrinsics.checkNotNullParameter(remoteMetricsEventDto, "remoteMetricsEventDto");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", remoteMetricsEventDto.f43739e.getEventName());
            jSONObject2.put("user_id", remoteMetricsEventDto.f43737c);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(b9.h.f15462V, remoteMetricsEventDto.f43735a);
            String str = remoteMetricsEventDto.f43738d;
            if (str == null) {
                str = null;
            }
            jSONObject3.put(b9.i.f15541W, str);
            jSONObject3.put("userIdSdk", remoteMetricsEventDto.f43737c);
            jSONObject3.put(CrashHianalyticsData.TIME, String.valueOf(remoteMetricsEventDto.f43739e.getEventTime$sdk_public_metrics_release()));
            for (Map.Entry<String, String> entry : remoteMetricsEventDto.f43739e.getEventData().entrySet()) {
                jSONObject3.put(entry.getKey(), entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            String jSONObject4 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject4, "jsonObject.toString()");
            jSONArray.put(new JSONObject(jSONObject4));
        }
        jSONObject.put("events", jSONArray);
        String jSONObject5 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject5, "jsonObject.toString()");
        return jSONObject5;
    }

    public static HostnameVerifier a(final URL url) {
        return new HostnameVerifier() { // from class: B3.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return s.a(url, str, sSLSession);
            }
        };
    }

    public static final boolean a(URL url, String str, SSLSession sSLSession) {
        return str.equals(url.getHost());
    }
}
