package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Task$addCompletionListener$1$1 extends s implements Function0<Unit> {
    final /* synthetic */ Throwable $errorData;
    final /* synthetic */ OnCompletionListener $onCompletionListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$addCompletionListener$1$1(OnCompletionListener onCompletionListener, Throwable th) {
        super(0);
        this.$onCompletionListener = onCompletionListener;
        this.$errorData = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m262invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m262invoke() {
        this.$onCompletionListener.onComplete(this.$errorData);
    }
}
