package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class ni extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li f44708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea f44709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(li liVar, ea eaVar) {
        super(1);
        this.f44708a = liVar;
        this.f44709b = eaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        li.a(this.f44708a, transaction);
        transaction.b(R.id.pay_container, this.f44709b, ea.class.getSimpleName());
        return Unit.f41027a;
    }
}
