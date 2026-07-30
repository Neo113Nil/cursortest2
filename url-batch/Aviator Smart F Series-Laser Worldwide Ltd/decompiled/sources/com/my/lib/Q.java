package com.my.lib;

import android.content.Context;
import com.my.lib.Q;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.TimeoutConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15356a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.z
            @Override // f6.a
            public final Object invoke() {
                return Q.a();
            }
        });
        f15356a = lazy;
    }

    public static final y5.w a(f6.p pVar, String str, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0410b.a(ErrorCode.TIME_OUT, msg, pVar, str);
        } else if (i8 == 2) {
            AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, msg, pVar, str);
        } else if (i8 != 10) {
            AbstractC0410b.a(ErrorCode.NO_ACCESS_SERVER, msg, pVar, str);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(msg);
                int optInt = jSONObject.optInt("VzQn");
                String optString = jSONObject.optString("fpfBsZp");
                String valueOf = String.valueOf(optInt);
                kotlin.jvm.internal.s.checkNotNull(optString);
                pVar.invoke(str, new ErrorCode(valueOf, optString));
            } catch (Exception e8) {
                pVar.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
            }
        }
        return y5.w.INSTANCE;
    }

    public static final Q a() {
        return new Q();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, final String requestId, String identifier, String str, String text, String fileFormat, final f6.p onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (identifier.length() > 0) {
            if (text.length() > 0) {
                if (fileFormat.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mpkC", text);
                    jSONObject.put("kpfyGgDROGkxNC", fileFormat);
                    String deviceId = AbstractC0422n.a(context);
                    String url = C0412d.f15369b.a().f15371a + "/my/tts";
                    String params = jSONObject.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(params, "toString(...)");
                    f6.l complete = new f6.l() { // from class: i5.a0
                        @Override // f6.l
                        public final Object invoke(Object obj) {
                            return Q.a(f6.p.this, requestId, (byte[]) obj);
                        }
                    };
                    f6.p failed = new f6.p() { // from class: i5.b0
                        @Override // f6.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Q.a(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
                        }
                    };
                    kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
                    kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
                    kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
                    kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
                    kotlin.jvm.internal.s.checkNotNullParameter(params, "params");
                    kotlin.jvm.internal.s.checkNotNullParameter(complete, "complete");
                    kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
                    try {
                        B.a(url);
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long connectTimeout = timeoutConfig.getConnectTimeout();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, str).post(RequestBody.Companion.create(params, MediaType.Companion.parse(com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON))).url(url).build()).enqueue(new P(failed, complete));
                        return;
                    } catch (Exception e8) {
                        B.a("onFailure: ", e8, 1);
                        failed.invoke(2, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
                        return;
                    }
                }
                throw new IllegalArgumentException("fileFormat cannot be null or empty");
            }
            throw new IllegalArgumentException("text cannot be null or empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.p pVar, String str, byte[] fileBytes) {
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        pVar.invoke(str, fileBytes);
        return y5.w.INSTANCE;
    }
}
