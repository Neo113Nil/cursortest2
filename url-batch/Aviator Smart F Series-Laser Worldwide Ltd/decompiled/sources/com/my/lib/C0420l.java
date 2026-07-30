package com.my.lib;

import android.content.Context;
import com.my.lib.C0420l;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* renamed from: com.my.lib.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0420l {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15378a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.s0
            @Override // f6.a
            public final Object invoke() {
                return C0420l.a();
            }
        });
        f15378a = lazy;
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

    public static final C0420l a() {
        return new C0420l();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, final String str, String str2, String str3, final String str4, String str5, final f6.v vVar, final f6.p pVar) {
        AbstractC0419k.a(timeoutConfig, C0412d.f15369b.a().f15371a + "/my/chat", AbstractC0422n.a(context), str2, str3, str5, new f6.l() { // from class: i5.t0
            @Override // f6.l
            public final Object invoke(Object obj) {
                return C0420l.a(str4, vVar, str, pVar, (Response) obj);
            }
        }, new f6.p() { // from class: i5.u0
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return C0420l.a(f6.p.this, str, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public static final y5.w a(String str, f6.v vVar, String str2, f6.p pVar, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            String str3 = response.headers().get("Content-Type");
            String str4 = response.headers().get("audioText");
            if (str4 != null && str4.length() != 0) {
                str = AbstractC0425q.a(str4);
            }
            Object obj = str;
            B.a("onResponse: headers audioText:  " + str4);
            if (!kotlin.jvm.internal.s.areEqual(str3, "text/event-stream")) {
                ResponseBody body = response.body();
                SubscriptionInfo subscriptionInfo = null;
                String string = body != null ? body.string() : null;
                B.a("onResponse: " + string);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    int optInt = jSONObject.optInt("VzQn");
                    if (optInt == 0) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                        String optString = jSONObject2.optString("hFgyMmelyw");
                        String optString2 = jSONObject2.optString("VzaCwgE");
                        String optString3 = jSONObject2.optString("VzaCwgEvm");
                        String optString4 = jSONObject2.optString("bxTdJe");
                        String optString5 = jSONObject2.optString("mshvtglVu");
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
                        kotlin.jvm.internal.s.checkNotNull(optString3);
                        vVar.invoke(str2, obj, optString, optString3, optString2, optString4, optString5, subscriptionInfo);
                    } else {
                        String optString6 = jSONObject.optString("fpfBsZp");
                        String valueOf = String.valueOf(optInt);
                        kotlin.jvm.internal.s.checkNotNull(optString6);
                        pVar.invoke(str2, new ErrorCode(valueOf, optString6));
                    }
                } else {
                    pVar.invoke(str2, new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
                }
            }
        } catch (Exception e8) {
            pVar.invoke(str2, new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
