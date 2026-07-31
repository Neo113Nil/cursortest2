package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w8 extends kotlin.jvm.internal.s implements Function1<u7, a9> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x8 f45157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(x8 x8Var) {
        super(1);
        this.f45157a = x8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        z8 z8Var = this.f45157a.f45211b;
        String jsonString = response.f45085c;
        z8Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject body = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONArray jSONArray = body.getJSONArray("availablePaymentMethods");
        JSONArray couponsResponse = body.getJSONArray("availableCoupons");
        List createListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jsonObject = jSONArray.getJSONObject(i4);
            t9 t9Var = z8Var.f45321b;
            Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
            t9Var.getClass();
            createListBuilder.add(t9.a(jsonObject));
        }
        List build = CollectionsKt.build(createListBuilder);
        f3 f3Var = z8Var.f45320a;
        Intrinsics.checkNotNullExpressionValue(couponsResponse, "couponsResponse");
        f3Var.getClass();
        List a4 = f3.a(couponsResponse);
        Intrinsics.checkNotNullExpressionValue(body, "body");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = body.getJSONObject("selectedCoupon");
            String string = jSONObject.getString("couponId");
            Intrinsics.checkNotNullExpressionValue(string, "getString(COUPON_ID_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new xj(string, jSONObject.getLong("oldPrice"), jSONObject.getLong("newPrice"), jSONObject.getLong(FirebaseAnalytics.Param.DISCOUNT)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        xj xjVar = (xj) m243constructorimpl;
        try {
            JSONObject selectedPaymentMethodResponse = body.getJSONObject("selectedPaymentMethod");
            t9 t9Var2 = z8Var.f45321b;
            Intrinsics.checkNotNullExpressionValue(selectedPaymentMethodResponse, "selectedPaymentMethodResponse");
            t9Var2.getClass();
            m243constructorimpl2 = Result.m243constructorimpl(t9.a(selectedPaymentMethodResponse));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th2));
        }
        return new a9(build, a4, xjVar, (v9) (Result.m244isFailureimpl(m243constructorimpl2) ? null : m243constructorimpl2));
    }
}
