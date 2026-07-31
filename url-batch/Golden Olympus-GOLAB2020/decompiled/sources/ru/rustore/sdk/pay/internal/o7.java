package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o7 extends kotlin.jvm.internal.s implements Function1<u7, d3> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p7 f44725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(p7 p7Var) {
        super(1);
        this.f44725a = p7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        c3 c3Var = this.f44725a.f44779c;
        String jsonString = response.f45085c;
        c3Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONArray coupons = jSONObject.getJSONArray("coupons");
        long j4 = jSONObject.getLong("originalPrice");
        f3 f3Var = c3Var.f43898a;
        Intrinsics.checkNotNullExpressionValue(coupons, "coupons");
        f3Var.getClass();
        return new d3(f3.a(coupons), j4);
    }
}
