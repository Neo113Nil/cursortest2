package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ak;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1<ak, Single<u7>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f45052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u7 f45053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f45054c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ki f45055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r0 r0Var, u7 u7Var, r0 r0Var2, ki kiVar) {
        super(1);
        this.f45052a = r0Var;
        this.f45053b = u7Var;
        this.f45054c = r0Var2;
        this.f45055d = kiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak session = (ak) obj;
        Intrinsics.checkNotNullParameter(session, "session");
        if (session instanceof ak.c) {
            return Single.Companion.from(new s0(this.f45052a, this.f45053b));
        }
        if (!(session instanceof ak.b ? true : session instanceof ak.a)) {
            throw new W1.m();
        }
        bk bkVar = this.f45052a.f44863b;
        bkVar.getClass();
        return SingleMapKt.map(bkVar.a(new nk(bkVar)), new t0(this.f45054c, this.f45055d));
    }
}
