package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function1<ak, u7> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f45026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ki f45027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r0 r0Var, ki kiVar) {
        super(1);
        this.f45026a = r0Var;
        this.f45027b = kiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ak newSession = (ak) obj;
        Intrinsics.checkNotNullParameter(newSession, "newSession");
        return r0.a(this.f45026a, this.f45027b, newSession);
    }
}
