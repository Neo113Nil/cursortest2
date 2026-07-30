package com.my.lib;

import android.content.Context;
import com.my.lib.D;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15342a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.b
            @Override // f6.a
            public final Object invoke() {
                return D.a();
            }
        });
        f15342a = lazy;
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

    public static final D a() {
        return new D();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, String str, String str2, String str3, final f6.p pVar, final f6.l lVar) {
        AbstractC0419k.a(timeoutConfig, C0412d.f15369b.a().f15371a + "/my/chat", AbstractC0422n.a(context), str, str2, str3, new f6.l() { // from class: i5.c
            @Override // f6.l
            public final Object invoke(Object obj) {
                return D.a(f6.p.this, lVar, (Response) obj);
            }
        }, new f6.p() { // from class: i5.d
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                return D.a(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public static final y5.w a(f6.p pVar, f6.l lVar, Response response) {
        kotlin.jvm.internal.s.checkNotNullParameter(response, "response");
        try {
            String str = response.headers().get("Content-Type");
            response.headers().get("audioText");
            if (!kotlin.jvm.internal.s.areEqual(str, "text/event-stream")) {
                ResponseBody body = response.body();
                SubscriptionInfo subscriptionInfo = null;
                String string = body != null ? body.string() : null;
                B.a("onResponse: " + string);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    int optInt = jSONObject.optInt("VzQn");
                    if (optInt == 0) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("Wlgj");
                        Object optString = jSONObject2.optString("VzaCwgE");
                        JSONObject optJSONObject = jSONObject2.optJSONObject("lFOBuktcCAhyvwxh");
                        if (optJSONObject != null) {
                            subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                            subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                            subscriptionInfo.setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                            subscriptionInfo.setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                            subscriptionInfo.setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                            subscriptionInfo.setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                        }
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
            }
        } catch (Exception e8) {
            lVar.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
