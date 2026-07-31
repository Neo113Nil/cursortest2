package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mm extends kotlin.jvm.internal.s implements Function1<rb, qb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pm f44657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(pm pmVar) {
        super(1);
        this.f44657a = pmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rb dto = (rb) obj;
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.f44657a.f44800c.a(dto);
    }
}
