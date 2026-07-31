package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class mi extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li f44647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f44648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(li liVar, m3 m3Var) {
        super(1);
        this.f44647a = liVar;
        this.f44648b = m3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        li.a(this.f44647a, transaction);
        transaction.b(R.id.pay_container, this.f44648b, m3.class.getSimpleName());
        return Unit.f41027a;
    }
}
