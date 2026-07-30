package com.my.lib;

import android.content.Context;
import com.my.lib.J;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import com.my.lib.data.TimeoutConfig;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final y5.f f15347a;

    static {
        y5.f lazy;
        lazy = kotlin.b.lazy(new f6.a() { // from class: i5.o
            @Override // f6.a
            public final Object invoke() {
                return J.a();
            }
        });
        f15347a = lazy;
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

    public static final J a() {
        return new J();
    }

    public static void a(Context context, TimeoutConfig timeoutConfig, String wid, final f6.l onSuccess, final f6.l onFailure) {
        kotlin.jvm.internal.s.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.s.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        kotlin.jvm.internal.s.checkNotNullParameter(wid, "wid");
        kotlin.jvm.internal.s.checkNotNullParameter(onSuccess, "onSuccess");
        kotlin.jvm.internal.s.checkNotNullParameter(onFailure, "onFailure");
        if (wid.length() > 0) {
            String str = C0412d.f15369b.a().f15371a;
            I.a(timeoutConfig, str + "/my/time?" + ("ptQ=" + wid), AbstractC0422n.a(context), wid, new f6.l() { // from class: i5.m
                @Override // f6.l
                public final Object invoke(Object obj) {
                    return J.a(f6.l.this, onFailure, (Response) obj);
                }
            }, new f6.p() { // from class: i5.n
                @Override // f6.p
                public final Object invoke(Object obj, Object obj2) {
                    return J.a(f6.l.this, ((Integer) obj).intValue(), (String) obj2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("wid cannot be null or empty");
    }

    public static final y5.w a(f6.l lVar, f6.l lVar2, Response response) {
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
                    JSONObject optJSONObject = jSONObject.getJSONObject("Wlgj").optJSONObject("lFOBuktcCAhyvwxh");
                    if (optJSONObject != null) {
                        subscriptionInfo = new SubscriptionInfo(optJSONObject.optInt("boRwLbElcQip"));
                        subscriptionInfo.setValidTimeToB(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhM")));
                        subscriptionInfo.setValidTimeToC(Long.valueOf(optJSONObject.optLong("olYrvMtZnlhN")));
                        subscriptionInfo.setValidCountToB(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzo")));
                        subscriptionInfo.setValidCountToC(Integer.valueOf(optJSONObject.optInt("olYrvvzhwLMzp")));
                        subscriptionInfo.setFreeDays(Integer.valueOf(optJSONObject.optInt("YCRnVTJf")));
                    }
                    lVar.invoke(subscriptionInfo);
                } else {
                    String optString = jSONObject.optString("fpfBsZp");
                    String valueOf = String.valueOf(optInt);
                    kotlin.jvm.internal.s.checkNotNull(optString);
                    lVar2.invoke(new ErrorCode(valueOf, optString));
                }
            } else {
                lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, "response body is null"));
            }
        } catch (Exception e8) {
            lVar2.invoke(new ErrorCode(ErrorCode.UNKNOWN_ERROR, String.valueOf(e8.getMessage() != null ? e8.getMessage() : "Unknown error")));
        }
        return y5.w.INSTANCE;
    }
}
