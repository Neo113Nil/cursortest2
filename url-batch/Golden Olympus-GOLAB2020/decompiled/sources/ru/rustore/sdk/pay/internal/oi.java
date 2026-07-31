package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class oi extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd f44760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(fd fdVar) {
        super(1);
        this.f44760a = fdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i4 = R.anim.sdk_pay_anim_fade_in_move_up;
        int i5 = R.anim.sdk_pay_anim_fade_out;
        transaction.p(i4, i5, i5, i5);
        transaction.o(R.id.pay_container, this.f44760a, fd.class.getSimpleName());
        return Unit.f41027a;
    }
}
