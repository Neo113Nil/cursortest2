package ru.rustore.sdk.pay.internal;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class md extends kotlin.jvm.internal.s implements Function1<u8, Pair<? extends u8, ? extends f0>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f44643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(f0 f0Var) {
        super(1);
        this.f44643a = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u8 paymentExtras = (u8) obj;
        Intrinsics.checkNotNullParameter(paymentExtras, "paymentExtras");
        return TuplesKt.to(paymentExtras, this.f44643a);
    }
}
