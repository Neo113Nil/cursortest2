package com.my.lib;

import android.content.Context;
import com.my.lib.AbstractC0427s;
import com.my.lib.data.Agent;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.TimeoutConfig;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.lib.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0427s {
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

    public static void a(Context context, TimeoutConfig timeoutConfig, final String requestId, String identifier, String language, int i8, int i9, final f6.r onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(identifier, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (identifier.length() > 0) {
            if (language.length() > 0) {
                String str = "VlgnyhCl=all&ilTnkbKR=" + i8 + "&ilTnfnx=" + i9 + "&elapMTrR=" + language;
                String deviceId = AbstractC0422n.a(context);
                String url = C0412d.f15369b.a().f15371a + "/my/smart?" + str;
                f6.l success = new f6.l() { // from class: i5.y0
                    @Override // f6.l
                    public final Object invoke(Object obj) {
                        return AbstractC0427s.a(f6.r.this, requestId, onFailure, (String) obj);
                    }
                };
                f6.p failed = new f6.p() { // from class: i5.z0
                    @Override // f6.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC0427s.a(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
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
                    builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, "").get().url(url).build()).enqueue(new C0426r(failed, success));
                    return;
                } catch (Exception e8) {
                    B.a("onFailure: ", e8, 1);
                    failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
                    return;
                }
            }
            throw new IllegalArgumentException("language cannot be empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.r rVar, String str, f6.p pVar, String json) {
        kotlin.jvm.internal.s.checkNotNullParameter(json, "json");
        try {
            JSONObject jSONObject = new JSONObject(json);
            int optInt = jSONObject.optInt("VzQn");
            if (optInt == 0) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                int optInt2 = jSONObject2.optInt("mzgjDIlTn");
                int optInt3 = jSONObject2.optInt("VFeAwgECjyX");
                JSONArray jSONArray = jSONObject2.getJSONArray("TtfvskEyrKm");
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    int i8 = 0;
                    while (i8 < length) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("iCRBwmbhrR");
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = jSONArray2.length();
                        for (int i9 = 0; i9 < length2; i9++) {
                            String string = jSONArray2.getString(i9);
                            kotlin.jvm.internal.s.checkNotNullExpressionValue(string, "getString(...)");
                            arrayList2.add(string);
                        }
                        String optString = jSONObject3.optString("glZn");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString, "optString(...)");
                        String optString2 = jSONObject3.optString("TtfvskEpxvX");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString2, "optString(...)");
                        int optInt4 = jSONObject3.optInt("TDGHHX");
                        int optInt5 = jSONObject3.optInt("TFgqGktmnvNDRA");
                        String optString3 = jSONObject3.optString("TGNCskfeu");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString3, "optString(...)");
                        JSONArray jSONArray3 = jSONArray;
                        String optString4 = jSONObject3.optString("VCRjLhC");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString4, "optString(...)");
                        int i10 = length;
                        String optString5 = jSONObject3.optString("YtYnkbKR");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString5, "optString(...)");
                        String optString6 = jSONObject3.optString("YtYnlrAR");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString6, "optString(...)");
                        int optInt6 = jSONObject3.optInt("bycDLytYn");
                        int optInt7 = jSONObject3.optInt("bycDLBxT");
                        int optInt8 = jSONObject3.optInt("bycDLMpkC");
                        String optString7 = jSONObject3.optString("iCRBwmRenwm");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString7, "optString(...)");
                        String optString8 = jSONObject3.optString("kzYn");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString8, "optString(...)");
                        int optInt9 = jSONObject3.optInt("nDNpwvzhwL");
                        int optInt10 = jSONObject3.optInt("azZnHTrR");
                        String optString9 = jSONObject3.optString("bxTbAsp");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString9, "optString(...)");
                        String optString10 = jSONObject3.optString("bxTcQip");
                        kotlin.jvm.internal.s.checkNotNullExpressionValue(optString10, "optString(...)");
                        arrayList.add(new Agent.Data.AiSmart(optString, optString2, optInt4, optInt5, optString3, optString4, optString5, optString6, optInt6, optInt7, optInt8, optString7, arrayList2, optString8, optInt9, optInt10, optString9, optString10));
                        i8++;
                        jSONArray = jSONArray3;
                        length = i10;
                    }
                }
                rVar.invoke(str, Integer.valueOf(optInt2), Integer.valueOf(optInt3), arrayList);
            } else {
                String optString11 = jSONObject.optString("fpfBsZp");
                String valueOf = String.valueOf(optInt);
                kotlin.jvm.internal.s.checkNotNull(optString11);
                pVar.invoke(str, new ErrorCode(valueOf, optString11));
            }
        } catch (Exception e8) {
            B.a(null, e8, 3);
            pVar.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
