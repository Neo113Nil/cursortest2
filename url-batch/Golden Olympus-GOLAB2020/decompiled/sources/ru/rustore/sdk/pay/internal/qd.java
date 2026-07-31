package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.pay.internal.ld;

/* loaded from: classes3.dex */
public final class qd extends kotlin.jvm.internal.s implements Function1<u8, ld.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f44825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qb f44826b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(ld ldVar, qb qbVar) {
        super(1);
        this.f44825a = ldVar;
        this.f44826b = qbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u8 paymentExtras = (u8) obj;
        Intrinsics.checkNotNullParameter(paymentExtras, "paymentExtras");
        return new ld.a(paymentExtras, this.f44826b, (((jn) this.f44825a.f44514a.f45559q1.getValue()).f44400a.f43878d.f44190a.get() instanceof ak.b) || (((jn) this.f44825a.f44514a.f45559q1.getValue()).f44400a.f43878d.f44190a.get() instanceof ak.c));
    }
}
