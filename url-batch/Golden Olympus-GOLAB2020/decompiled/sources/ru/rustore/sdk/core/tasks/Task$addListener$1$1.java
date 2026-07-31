package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Task$addListener$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ OnSuccessListener<T> $onSuccess;
    final /* synthetic */ T $resultData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$addListener$1$1(OnSuccessListener<T> onSuccessListener, T t4) {
        super(0);
        this.$onSuccess = onSuccessListener;
        this.$resultData = t4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m263invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m263invoke() {
        this.$onSuccess.onSuccess(this.$resultData);
    }
}
