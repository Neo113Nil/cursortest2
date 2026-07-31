package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n7 extends kotlin.jvm.internal.s implements Function1<u7, g4> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p7 f44683a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(p7 p7Var) {
        super(1);
        this.f44683a = p7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        w3 w3Var = this.f44683a.f44778b;
        String jsonString = response.f45085c;
        w3Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONArray coupons = jSONObject.getJSONArray("coupons");
        long j4 = jSONObject.getLong("oldPrice");
        long j5 = jSONObject.getLong("newPrice");
        long j6 = jSONObject.getLong(FirebaseAnalytics.Param.DISCOUNT);
        f3 f3Var = w3Var.f45150a;
        Intrinsics.checkNotNullExpressionValue(coupons, "coupons");
        f3Var.getClass();
        return new g4(f3.a(coupons), j4, j5, j6);
    }
}
