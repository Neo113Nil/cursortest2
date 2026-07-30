package com.my.lib;

import android.content.Context;
import com.my.lib.E;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15343a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.k
            @Override // f6.a
            public final Object invoke() {
                return E.a();
            }
        });
        f15343a = lazy;
    }

    public static final y5.w a(f6.l lVar, int i8, String msg) {
        kotlin.jvm.internal.s.checkNotNullParameter(msg, "msg");
        if (i8 == 1) {
            AbstractC0409a.a(ErrorCode.TIME_OUT, msg, lVar);
        } else if (i8 != 2) {
            AbstractC0409a.a(ErrorCode.NO_ACCESS_SERVER, msg, lVar);
        } else {
            AbstractC0409a.a(ErrorCode.UNKNOWN_ERROR, msg, lVar);
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w b(f6.l lVar, ErrorCode errorCode) {
        kotlin.jvm.internal.s.checkNotNullParameter(errorCode, "errorCode");
        lVar.invoke(errorCode);
        return y5.w.INSTANCE;
    }

    public static final E a() {
        return new E();
    }

    public final void a(Context context, final TimeoutConfig timeoutConfig, final String wid, final String str, File audioFile, final String fileFormat, final String inputLanguage, final f6.p onSuccess, final f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFile, "audioFile");
        kotlin.jvm.internal.s.checkNotNullParameter(fileFormat, "fileFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(inputLanguage, "inputLanguage");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (!audioFile.exists()) {
            B.a("The file does not exist");
            onFailure.invoke(new ErrorCode(ErrorCode.UPLOAD_FILE_ERROR, "The file does not exist"));
            return;
        }
        String filePath = audioFile.getPath();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(filePath, "getPath(...)");
        kotlin.jvm.internal.s.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        long length = file.exists() ? file.length() : -1L;
        if (length > 157286400) {
            B.a("文件大小超过限制: " + length + " 字节 > 157286400 字节");
            onFailure.invoke(new ErrorCode(ErrorCode.UPLOAD_FILE_ERROR, "The file size exceeds 150 MB"));
            return;
        }
        String path = audioFile.getPath();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(path, "getPath(...)");
        final long a8 = AbstractC0413e.a(path);
        if (a8 > 7200) {
            B.a("音频时长超过限制: " + a8 + " 秒 > 7200 秒");
            onFailure.invoke(new ErrorCode(ErrorCode.UPLOAD_FILE_ERROR, "The file length exceeds 2 hours"));
            return;
        }
        final String a9 = AbstractC0422n.a(context);
        if (a8 > 0) {
            AbstractC0428t.a(audioFile, fileFormat, timeoutConfig, new f6.l() { // from class: i5.g
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return E.a(E.this, fileFormat, timeoutConfig, wid, str, a9, inputLanguage, a8, onSuccess, onFailure, (String) obj);
                }
            }, new f6.l() { // from class: i5.h
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return E.b(f6.l.this, (ErrorCode) obj);
                }
            });
        } else {
            AbstractC0409a.a(ErrorCode.UPLOAD_FILE_ERROR, "The duration of the audio file is too short or the duration resolution fails", onFailure);
        }
    }

    public static final y5.w a(E e8, String str, TimeoutConfig timeoutConfig, String str2, String str3, String str4, String str5, long j8, final f6.p pVar, final f6.l lVar, String s3Url) {
        kotlin.jvm.internal.s.checkNotNullParameter(s3Url, "s3Url");
        f6.p pVar2 = new f6.p() { // from class: i5.e
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return E.a(f6.p.this, (String) obj, (SubscriptionInfo) obj2);
            }
        };
        f6.l lVar2 = new f6.l() { // from class: i5.f
            @Override // f6.l
            public final Object invoke(Object obj) {
                return E.a(f6.l.this, (ErrorCode) obj);
            }
        };
        e8.getClass();
        a(s3Url, str, timeoutConfig, str2, str3, str4, str5, j8, pVar2, lVar2);
        return y5.w.INSTANCE;
    }

    public static final y5.w a(f6.p pVar, String contentId, SubscriptionInfo subscriptionInfo) {
        kotlin.jvm.internal.s.checkNotNullParameter(contentId, "contentId");
        pVar.invoke(contentId, subscriptionInfo);
        return y5.w.INSTANCE;
    }

    public static final y5.w a(f6.l lVar, ErrorCode errorCode) {
        kotlin.jvm.internal.s.checkNotNullParameter(errorCode, "errorCode");
        lVar.invoke(errorCode);
        return y5.w.INSTANCE;
    }

    public static void a(String str, String str2, TimeoutConfig timeoutConfig, String identifier, String str3, String deviceId, String str4, long j8, final f6.p pVar, final f6.l lVar) {
        if (identifier.length() > 0) {
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("TFQrGMJcn", str2);
                jSONObject.put("TFQrGNCY", str);
                jSONObject.put("bycDLElapMTrR", str4);
                jSONObject.put("VzaBMfpGrEX", j8);
                String params = jSONObject.toString();
                kotlin.jvm.internal.s.checkNotNullExpressionValue(params, "toString(...)");
                String url = C0412d.f15369b.a().f15371a + "/my/big/stt";
                f6.l success = new f6.l() { // from class: i5.i
                    @Override // f6.l
                    public final Object invoke(Object obj) {
                        return E.a(f6.p.this, lVar, (Response) obj);
                    }
                };
                f6.p failed = new f6.p() { // from class: i5.j
                    @Override // f6.p
                    public final Object invoke(Object obj, Object obj2) {
                        return E.a(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
                    }
                };
                kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
                kotlin.jvm.internal.s.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.s.checkNotNullParameter(params, "params");
                kotlin.jvm.internal.s.checkNotNullParameter(deviceId, "deviceId");
                kotlin.jvm.internal.s.checkNotNullParameter(identifier, "identifier");
                kotlin.jvm.internal.s.checkNotNullParameter(success, "success");
                kotlin.jvm.internal.s.checkNotNullParameter(failed, "failed");
                try {
                    B.a(url);
                    B.a(params);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long connectTimeout = timeoutConfig.getConnectTimeout();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    builder.connectTimeout(connectTimeout, timeUnit).readTimeout(timeoutConfig.getReadTimeout(), timeUnit).writeTimeout(timeoutConfig.getWriteTimeout(), timeUnit).retryOnConnectionFailure(false).build().newCall(F.a(new Request.Builder(), deviceId, identifier, str3).post(RequestBody.Companion.create(params, MediaType.Companion.parse(com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON))).url(url).build()).enqueue(new C(failed, success));
                    return;
                } catch (Exception e8) {
                    B.a("onFailure: ", e8, 1);
                    failed.invoke(0, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error"));
                    return;
                }
            }
            throw new IllegalArgumentException("s3Url cannot be null or empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.p pVar, f6.l lVar, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            ResponseBody body = response.body();
            SubscriptionInfo subscriptionInfo = null;
            String string = body != null ? body.string() : null;
            B.a("onResponse: " + string);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                int optInt = jSONObject.optInt("VzQn");
                if (optInt == 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                    Object optString = jSONObject2.optString("kpdDwlEvm");
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
                    pVar.invoke(optString, subscriptionInfo);
                } else {
                    String optString2 = jSONObject.optString("fpfBsZp");
                    String valueOf = String.valueOf(optInt);
                    kotlin.jvm.internal.s.checkNotNull(optString2);
                    lVar.invoke(new ErrorCode(valueOf, optString2));
                }
            } else {
                lVar.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
            }
        } catch (Exception e8) {
            lVar.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
