package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yb extends kotlin.jvm.internal.s implements Function1<rb, qb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bc f45266a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(bc bcVar) {
        super(1);
        this.f45266a = bcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rb dto = (rb) obj;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f45266a.f43861c.a(dto);
    }
}
