package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.BuildConfig;
import ru.rustore.sdk.pay.internal.ki;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function0<Pair<? extends String, ? extends ki.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f44765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(0);
        this.f44765a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = this.f44765a;
        rVar.getClass();
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("packageName", rVar.f44861d.getPackageName()), TuplesKt.to("signature", rVar.f44860c.a()))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            …  ),\n        ).toString()");
        ki.b bVar = new ki.b("v1/monetization/api/token/anonymous", MapsKt.emptyMap(), StringsKt.G(jSONObject, "\\", "", false, 4, null));
        o oVar = this.f44765a.f44859b;
        return TuplesKt.to(BuildConfig.ANONYMOUS_SESSION_HOST, bVar);
    }
}
