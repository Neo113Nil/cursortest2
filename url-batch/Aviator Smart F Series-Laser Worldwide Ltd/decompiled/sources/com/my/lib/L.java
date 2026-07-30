package com.my.lib;

import android.content.Context;
import com.my.lib.L;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15350a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.p
            @Override // f6.a
            public final Object invoke() {
                return L.a();
            }
        });
        f15350a = lazy;
    }

    public static final y5.w a(f6.p pVar, String str, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0410b.a(ErrorCode.TIME_OUT, msg, pVar, str);
        } else if (i8 != 2) {
            AbstractC0410b.a(ErrorCode.NO_ACCESS_SERVER, msg, pVar, str);
        } else {
            AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, msg, pVar, str);
        }
        return y5.w.INSTANCE;
    }

    public static final L a() {
        return new L();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, final String requestId, String identifier, String str, final String inputContent, String contentId, String str2, final f6.s onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(inputContent, "inputContent");
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (identifier.length() > 0) {
            if (inputContent.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bycDLMJcn", "text");
                jSONObject.put("TtfvskEpxvX", "xtGQKuQDUYTMuVDLGE");
                jSONObject.put("VzaCwgE", inputContent);
                jSONObject.put("VzaCwgEvm", contentId);
                jSONObject.put("lEensf", "false");
                jSONObject.put("bycDLElapMTrR", str2);
                String deviceId = AbstractC0422n.a(context);
                String url = C0412d.f15369b.a().f15371a + "/my/chat";
                String params = jSONObject.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(params, "toString(...)");
                f6.l success = new f6.l() { // from class: i5.q
                    @Override // f6.l
                    public final Object invoke(Object obj) {
                        return L.a(f6.s.this, requestId, inputContent, onFailure, (Response) obj);
                    }
                };
                f6.p failed = new f6.p() { // from class: i5.r
                    @Override // f6.p
                    public final Object invoke(Object obj, Object obj2) {
                        return L.a(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
                    }
                };
                kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
                kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
                kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
                kotlin.jvm.internal.s.checkNotNullParameter(params, "params");
                kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
                kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
                try {
                    B.a(url);
                    B.a(params);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long connectTimeout = timeoutConfig.getConnectTimeout();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, str).post(RequestBody.Companion.create(params, MediaType.Companion.parse(com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON))).url(url).build()).enqueue(new K(failed, success));
                    return;
                } catch (Exception e8) {
                    B.a("onFailure: ", e8, 1);
                    failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
                    return;
                }
            }
            throw new IllegalArgumentException("inputContent cannot be empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.s sVar, String str, String str2, f6.p pVar, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            if (!kotlin.jvm.internal.s.areEqual(response.headers().get("Content-Type"), "text/event-stream")) {
                ResponseBody body = response.body();
                SubscriptionInfo subscriptionInfo = null;
                String string = body != null ? body.string() : null;
                B.a("onResponse: " + string);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    int optInt = jSONObject.optInt("VzQn");
                    if (optInt == 0) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                        String optString = jSONObject2.optString("VzaCwgE");
                        String optString2 = jSONObject2.optString("VzaCwgEvm");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("lFOBuktcCAhyvwxh");
                        if (optJSONObject != null) {
                            subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                            subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                            subscriptionInfo.setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                            subscriptionInfo.setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                            subscriptionInfo.setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                            subscriptionInfo.setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                        }
                        kotlin.jvm.internal.s.checkNotNull(optString);
                        kotlin.jvm.internal.s.checkNotNull(optString2);
                        sVar.invoke(str, str2, optString, optString2, subscriptionInfo);
                    } else {
                        String optString3 = jSONObject.optString("fpfBsZp");
                        String valueOf = String.valueOf(optInt);
                        kotlin.jvm.internal.s.checkNotNull(optString3);
                        pVar.invoke(str, new ErrorCode(valueOf, optString3));
                    }
                } else {
                    pVar.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
                }
            }
        } catch (Exception e8) {
            pVar.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
