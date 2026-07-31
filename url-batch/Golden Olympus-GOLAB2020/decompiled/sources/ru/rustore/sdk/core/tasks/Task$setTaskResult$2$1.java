package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class Task$setTaskResult$2$1<T> extends s implements Function1<ListenerHandler<T>, Unit> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ Task<T> this$0;

    @Metadata
    /* renamed from: ru.rustore.sdk.core.tasks.Task$setTaskResult$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ OnFailureListener $onFailure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnFailureListener onFailureListener, Throwable th) {
            super(0);
            this.$onFailure = onFailureListener;
            this.$error = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m267invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m267invoke() {
            this.$onFailure.onFailure(this.$error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$setTaskResult$2$1(Task<T> task, Throwable th) {
        super(1);
        this.this$0 = task;
        this.$error = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ListenerHandler) obj);
        return Unit.f41027a;
    }

    public final void invoke(ListenerHandler<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        OnFailureListener onFailure = listener.getOnFailure();
        if (onFailure != null) {
            this.this$0.runWithFallbackToMain(listener.getExecutor(), new AnonymousClass1(onFailure, this.$error));
        }
    }
}
