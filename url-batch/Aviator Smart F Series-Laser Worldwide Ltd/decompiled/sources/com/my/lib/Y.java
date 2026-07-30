package com.my.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.my.lib.Y;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15365a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.o0
            @Override // f6.a
            public final Object invoke() {
                return Y.a();
            }
        });
        f15365a = lazy;
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

    public static final y5.w b(f6.p pVar, String str, int i8, String message) {
        kotlin.jvm.internal.s.checkNotNullParameter(message, "message");
        if (i8 == 1) {
            AbstractC0410b.a(ErrorCode.TIME_OUT, message, pVar, str);
        } else if (i8 != 2) {
            AbstractC0410b.a(ErrorCode.NO_ACCESS_SERVER, message, pVar, str);
        } else {
            AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, message, pVar, str);
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w c(f6.p pVar, String str, int i8, String msg) {
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

    public static final Y a() {
        return new Y();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, final String requestId, String wid, String str, File file, String audioFormat, String imgFormat, int i8, String str2, final f6.r onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() > 0) {
            if (audioFormat.length() > 0) {
                if (file.exists()) {
                    String a8 = AbstractC0425q.a(file);
                    if (a8 == null) {
                        AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, "file processing error", onFailure, requestId);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bycDLMJcn", "audio");
                    jSONObject.put("TtfvskEpxvX", "VdJOWcRpbyrWUOmrgK");
                    jSONObject.put("VzaCwgE", "");
                    jSONObject.put("VzaCwgEvm", "");
                    jSONObject.put("lEensf", "false");
                    jSONObject.put("WCNFXhCZjL", imgFormat);
                    jSONObject.put("WCNFkmJYn", i8);
                    jSONObject.put("TFQrGuJgn", a8);
                    jSONObject.put("TFQrGMJcn", audioFormat);
                    jSONObject.put("bycDLElapMTrR", str2);
                    String a9 = AbstractC0422n.a(context);
                    String str3 = C0412d.f15369b.a().f15371a + "/my/chat";
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    X.a(timeoutConfig, str3, a9, wid, str, jSONObject2, new f6.l() { // from class: i5.m0
                        @Override // f6.l
                        public final Object invoke(Object obj) {
                            return Y.a(f6.p.this, requestId, onSuccess, (Response) obj);
                        }
                    }, new f6.p() { // from class: i5.n0
                        @Override // f6.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Y.a(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("file does not exist");
            }
            throw new IllegalArgumentException("audioFormat cannot be null or empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.p pVar, String str, f6.r rVar, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            String str2 = response.headers().get("Content-Type");
            String str3 = response.headers().get("audioText");
            Object obj = "";
            if (str3 != null && str3.length() != 0) {
                obj = AbstractC0425q.a(str3);
            }
            B.a("onResponse: headers audioText:  " + str3);
            if (!kotlin.jvm.internal.s.areEqual(str2, "text/event-stream")) {
                ResponseBody body = response.body();
                SubscriptionInfo subscriptionInfo = null;
                String string = body != null ? body.string() : null;
                B.a("onResponse: " + string);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    int optInt = jSONObject.optInt("VzQn");
                    if (optInt == 0) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                        String optString = jSONObject2.optString("bxTdJe");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("lFOBuktcCAhyvwxh");
                        if (optJSONObject != null) {
                            subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                            subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                            subscriptionInfo.setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                            subscriptionInfo.setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                            subscriptionInfo.setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                            subscriptionInfo.setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                        }
                        if (TextUtils.isEmpty(optString)) {
                            pVar.invoke(str, new ErrorCode(ErrorCode.UNKNOWN_ERROR, "imgUrl is null"));
                        } else {
                            kotlin.jvm.internal.s.checkNotNull(optString);
                            rVar.invoke(str, obj, optString, subscriptionInfo);
                        }
                    } else {
                        String optString2 = jSONObject.optString("fpfBsZp");
                        String valueOf = String.valueOf(optInt);
                        kotlin.jvm.internal.s.checkNotNull(optString2);
                        pVar.invoke(str, new ErrorCode(valueOf, optString2));
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

    public static void a(final Context context, final TimeoutConfig timeoutConfig, final String requestId, String wid, String str, byte[] fileBytes, String audioFormat, final String str2, final String imgFormat, int i8, String str3, final f6.s onSuccess, final f6.p onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(fileBytes, "fileBytes");
        kotlin.jvm.internal.s.checkNotNullParameter(audioFormat, "audioFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(imgFormat, "imgFormat");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() > 0) {
            if (fileBytes.length != 0) {
                if (audioFormat.length() > 0) {
                    String a8 = AbstractC0425q.a(fileBytes);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bycDLMJcn", "audio");
                    jSONObject.put("TtfvskEpxvX", "VdJOWcRpbyrWUOmrgK");
                    jSONObject.put("VzaCwgE", "");
                    jSONObject.put("VzaCwgEvm", "");
                    jSONObject.put("lEensf", "false");
                    jSONObject.put("WCNFXhCZjL", imgFormat);
                    jSONObject.put("WCNFkmJYn", i8);
                    jSONObject.put("TFQrGuJgn", a8);
                    jSONObject.put("TFQrGMJcn", audioFormat);
                    jSONObject.put("bycDLElapMTrR", str3);
                    String a9 = AbstractC0422n.a(context);
                    String str4 = C0412d.f15369b.a().f15371a + "/my/chat";
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.s.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    X.a(timeoutConfig, str4, a9, wid, str, jSONObject2, new f6.l() { // from class: i5.i0
                        @Override // f6.l
                        public final Object invoke(Object obj) {
                            return Y.a(str2, context, imgFormat, timeoutConfig, onFailure, requestId, onSuccess, (Response) obj);
                        }
                    }, new f6.p() { // from class: i5.j0
                        @Override // f6.p
                        public final Object invoke(Object obj, Object obj2) {
                            return Y.c(f6.p.this, requestId, ((Integer) obj).intValue(), (String) obj2);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("audioFormat cannot be null or empty");
            }
            throw new IllegalArgumentException("File bytes cannot be empty");
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, com.my.lib.data.SubscriptionInfo] */
    /* JADX WARN: Type inference failed for: r3v25, types: [T, java.lang.String] */
    public static final y5.w a(String str, Context context, final String str2, final TimeoutConfig timeoutConfig, final f6.p pVar, final String str3, final f6.s sVar, Response response) {
        String str4;
        String str5;
        String str6;
        boolean z7;
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            String str7 = response.headers().get("Content-Type");
            String str8 = response.headers().get("audioText");
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            if (str8 != null && str8.length() != 0) {
                ref$ObjectRef.element = AbstractC0425q.a(str8);
            }
            B.a("onResponse: headers audioText:  " + str8);
            if (!kotlin.jvm.internal.s.areEqual(str7, "text/event-stream")) {
                ResponseBody body = response.body();
                String string = body != null ? body.string() : null;
                StringBuilder sb = new StringBuilder();
                str4 = "onResponse: ";
                sb.append("onResponse: ");
                sb.append(string);
                B.a(sb.toString());
                try {
                    if (string != null) {
                        JSONObject jSONObject = new JSONObject(string);
                        int optInt = jSONObject.optInt("VzQn");
                        if (optInt == 0) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                            String optString = jSONObject2.optString("bxTdJe");
                            final String optString2 = jSONObject2.optString("mshvtglVu");
                            final String optString3 = jSONObject2.optString("kpfxDnEVxF");
                            final String optString4 = jSONObject2.optString("mshvtglVujXDbuMmtbw");
                            final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("lFOBuktcCAhyvwxh");
                            if (optJSONObject != null) {
                                ?? subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                                ref$ObjectRef2.element = subscriptionInfo;
                                subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                                ((SubscriptionInfo) ref$ObjectRef2.element).setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                                ((SubscriptionInfo) ref$ObjectRef2.element).setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                                ((SubscriptionInfo) ref$ObjectRef2.element).setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                                ((SubscriptionInfo) ref$ObjectRef2.element).setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                            }
                            try {
                                if (!TextUtils.isEmpty(optString)) {
                                    if (str == null || str.length() == 0) {
                                        try {
                                            str6 = context.getFilesDir().getAbsolutePath() + File.separator + "etOREZOVA";
                                            z7 = true;
                                        } catch (Exception e8) {
                                            e = e8;
                                            str5 = ErrorCode.UNKNOWN_ERROR;
                                            str4 = str5;
                                            pVar.invoke(str3, new ErrorCode(str4, String.valueOf(e.getMessage() != null ? e.getMessage() : "Unknown error")));
                                            return y5.w.INSTANCE;
                                        }
                                    } else {
                                        z7 = false;
                                        str6 = str;
                                    }
                                    final File file = new File(str6);
                                    if (!file.exists()) {
                                        file.mkdirs();
                                    }
                                    if (z7) {
                                        AbstractC0430v.a(str6);
                                    }
                                    final String str9 = file + File.separator + System.currentTimeMillis() + "." + str2;
                                    kotlin.jvm.internal.s.checkNotNull(optString);
                                    str5 = ErrorCode.UNKNOWN_ERROR;
                                    AbstractC0432x.a(timeoutConfig, optString, str9, new f6.l() { // from class: i5.k0
                                        @Override // f6.l
                                        public final Object invoke(Object obj) {
                                            return Y.a(optString3, str9, file, str2, optString4, optString2, timeoutConfig, sVar, str3, ref$ObjectRef, ref$ObjectRef2, pVar, (File) obj);
                                        }
                                    }, new f6.p() { // from class: i5.l0
                                        @Override // f6.p
                                        public final Object invoke(Object obj, Object obj2) {
                                            return Y.b(f6.p.this, str3, ((Integer) obj).intValue(), (String) obj2);
                                        }
                                    });
                                } else {
                                    str5 = ErrorCode.UNKNOWN_ERROR;
                                    str4 = str5;
                                    pVar.invoke(str3, new ErrorCode(str4, "imgUrl is null"));
                                }
                            } catch (Exception e9) {
                                e = e9;
                            }
                        } else {
                            str4 = ErrorCode.UNKNOWN_ERROR;
                            String optString5 = jSONObject.optString("fpfBsZp");
                            String valueOf = String.valueOf(optInt);
                            kotlin.jvm.internal.s.checkNotNull(optString5);
                            pVar.invoke(str3, new ErrorCode(valueOf, optString5));
                        }
                    } else {
                        str4 = ErrorCode.UNKNOWN_ERROR;
                        pVar.invoke(str3, new ErrorCode(str4, "response body is null"));
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            }
        } catch (Exception e11) {
            e = e11;
            str4 = ErrorCode.UNKNOWN_ERROR;
        }
        return y5.w.INSTANCE;
    }

    public static final y5.w a(String str, String str2, File file, String str3, String str4, String str5, TimeoutConfig timeoutConfig, f6.s sVar, String str6, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, f6.p pVar, File file2) {
        File file3;
        kotlin.jvm.internal.s.checkNotNullParameter(file2, "file");
        if (TextUtils.isEmpty(str)) {
            file3 = file2;
        } else {
            kotlin.jvm.internal.s.checkNotNull(str);
            Pair a8 = G.a(str);
            Bitmap decodeFile = BitmapFactory.decodeFile(str2);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(decodeFile, "decodeFile(...)");
            Bitmap a9 = AbstractC0416h.a(decodeFile, ((Number) a8.getFirst()).intValue(), ((Number) a8.getSecond()).intValue());
            String str7 = file + File.separator + System.currentTimeMillis() + "." + str3;
            file3 = AbstractC0416h.a(a9, str7, str3) ? new File(str7) : null;
        }
        if (file3 != null) {
            String str8 = file + File.separator + System.currentTimeMillis() + "." + str3;
            if (str4 != null && str4.length() != 0) {
                Pair a10 = G.a(str4);
                Bitmap decodeFile2 = BitmapFactory.decodeFile(str2);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(decodeFile2, "decodeFile(...)");
                sVar.invoke(str6, ref$ObjectRef.element, file3, AbstractC0416h.a(AbstractC0416h.a(decodeFile2, ((Number) a10.getFirst()).intValue(), ((Number) a10.getSecond()).intValue()), str8, str3) ? new File(str8) : null, ref$ObjectRef2.element);
            } else {
                if (!TextUtils.isEmpty(str5)) {
                    kotlin.jvm.internal.s.checkNotNull(str5);
                    r8 = AbstractC0432x.a(timeoutConfig, str5, str8);
                }
                sVar.invoke(str6, ref$ObjectRef.element, file3, r8, ref$ObjectRef2.element);
            }
        } else {
            AbstractC0410b.a(ErrorCode.UNKNOWN_ERROR, "processed imageFile failed", pVar, str6);
        }
        return y5.w.INSTANCE;
    }
}
