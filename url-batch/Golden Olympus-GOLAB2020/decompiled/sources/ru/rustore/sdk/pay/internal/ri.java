package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class ri extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li f44929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf f44930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(li liVar, lf lfVar) {
        super(1);
        this.f44929a = liVar;
        this.f44930b = lfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        li.a(this.f44929a, transaction);
        transaction.o(R.id.pay_container, this.f44930b, lf.class.getSimpleName());
        return Unit.f41027a;
    }
}
