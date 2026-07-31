package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class wd extends kotlin.jvm.internal.s implements Function1<s9, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f45164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(ld ldVar) {
        super(1);
        this.f45164a = ldVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s9 s9Var = (s9) obj;
        if (s9Var != null) {
            this.f45164a.a(s9Var);
        }
        return Unit.f41027a;
    }
}
