package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.R;

/* loaded from: classes3.dex */
public final class ti extends kotlin.jvm.internal.s implements Function1<androidx.fragment.app.z, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i5 f45044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(li liVar, i5 i5Var) {
        super(1);
        this.f45044a = i5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.fragment.app.z transaction = (androidx.fragment.app.z) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i4 = R.anim.sdk_pay_anim_fade_in;
        int i5 = R.anim.sdk_pay_anim_fade_out;
        Intrinsics.checkNotNullExpressionValue(transaction.p(i4, i5, i5, i5), "setCustomAnimations(\n   …_anim_fade_out,\n        )");
        transaction.o(R.id.pay_container, this.f45044a, i5.class.getSimpleName());
        return Unit.f41027a;
    }
}
