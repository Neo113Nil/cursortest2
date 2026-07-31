package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.BuildConfig;
import ru.rustore.sdk.pay.internal.ki;

/* loaded from: classes3.dex */
public final class lb extends kotlin.jvm.internal.s implements Function1<ki.b, Pair<? extends String, ? extends ki.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nb f44511a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(nb nbVar) {
        super(1);
        this.f44511a = nbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ki.b request = (ki.b) obj;
        Intrinsics.checkNotNullParameter(request, "request");
        this.f44511a.f44687c.getClass();
        return TuplesKt.to(BuildConfig.PRODUCT_CATALOG_GATEWAY_HOST, request);
    }
}
