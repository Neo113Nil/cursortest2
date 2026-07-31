package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Task$addListener$1$2 extends s implements Function0<Unit> {
    final /* synthetic */ OnFailureListener $onFailure;
    final /* synthetic */ Throwable $resultError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$addListener$1$2(OnFailureListener onFailureListener, Throwable th) {
        super(0);
        this.$onFailure = onFailureListener;
        this.$resultError = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m264invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m264invoke() {
        this.$onFailure.onFailure(this.$resultError);
    }
}
