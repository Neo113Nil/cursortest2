package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zk extends kotlin.jvm.internal.s implements Function0<yk> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl f45843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7 f45844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(cl clVar, u7 u7Var) {
        super(0);
        this.f45843a = clVar;
        this.f45844b = u7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xk xkVar = this.f45843a.f43935b;
        String jsonString = this.f45844b.f45085c;
        xkVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString("signatureKeyId");
        Intrinsics.checkNotNullExpressionValue(string, "getString(SIGNATURE_KEY_ID)");
        String string2 = jSONObject.getString("signature");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(SIGNATURE)");
        return new yk(string, string2, StringsKt.G(jSONObject.get(b9.h.f15438E0).toString(), "\\/", "/", false, 4, null));
    }
}
