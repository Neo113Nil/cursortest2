package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class si extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li f45019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pl f45020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(li liVar, pl plVar) {
        super(1);
        this.f45019a = liVar;
        this.f45020b = plVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        li.a(this.f45019a, transaction);
        transaction.b(R.id.pay_container, this.f45020b, pl.class.getSimpleName());
        return Unit.f41027a;
    }
}
