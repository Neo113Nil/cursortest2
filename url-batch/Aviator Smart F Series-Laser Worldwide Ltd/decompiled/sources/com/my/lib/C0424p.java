package com.my.lib;

import android.content.Context;
import com.my.lib.C0424p;
import com.my.lib.data.DrawStyle;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.TimeoutConfig;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.lib.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0424p {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15381a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.v0
            @Override // f6.a
            public final Object invoke() {
                return C0424p.a();
            }
        });
        f15381a = lazy;
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

    public static final C0424p a() {
        return new C0424p();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, final String requestId, String identifier, String language, final f6.p onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        String deviceId = AbstractC0422n.a(context);
        String str = C0412d.f15369b.a().f15371a;
        String url = str + "/my/drawStyle?" + ("elapMTrR=" + language);
        f6.l success = new f6.l() { // from class: i5.w0
            @Override // f6.l
            public final Object invoke(Object obj) {
                return C0424p.a(f6.p.this, requestId, onFailure, (String) obj);
            }
        };
        f6.p failed = new f6.p() { // from class: i5.x0
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return C0424p.a(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
            }
        };
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
        kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
        kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
        try {
            B.a(url);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long connectTimeout = timeoutConfig.getConnectTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, "").get().url(url).build()).enqueue(new C0423o(failed, success));
        } catch (Exception e8) {
            B.a("onFailure: ", e8, 1);
            failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
        }
    }

    public static final y5.w a(f6.p pVar, String str, f6.p pVar2, String json) {
        kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
        try {
            JSONObject jSONObject = new JSONObject(json);
            int optInt = jSONObject.optInt("VzQn");
            if (optInt == 0) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONObject("Wlgj").getJSONArray("WCNFkmJYndbDg");
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                        String optString = jSONObject2.optString("glZn");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, "optString(...)");
                        String optString2 = jSONObject2.optString("TGNCskfeu");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString2, "optString(...)");
                        arrayList.add(new DrawStyle(optString2, jSONObject2.optInt("WCNFkmJYnnTwhn"), optString));
                    }
                }
                pVar.invoke(str, arrayList);
            } else {
                String optString3 = jSONObject.optString("fpfBsZp");
                String valueOf = String.valueOf(optInt);
                kotlin.jvm.internal.s.checkNotNull(optString3);
                pVar2.invoke(str, new ErrorCode(valueOf, optString3));
            }
        } catch (Exception e8) {
            B.a(null, e8, 3);
            pVar2.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
