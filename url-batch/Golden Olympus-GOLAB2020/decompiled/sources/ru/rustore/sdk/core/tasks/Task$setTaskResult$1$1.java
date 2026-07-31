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
final class Task$setTaskResult$1$1<T> extends s implements Function1<ListenerHandler<T>, Unit> {
    final /* synthetic */ T $data;
    final /* synthetic */ Task<T> this$0;

    @Metadata
    /* renamed from: ru.rustore.sdk.core.tasks.Task$setTaskResult$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        final /* synthetic */ T $data;
        final /* synthetic */ OnSuccessListener<T> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnSuccessListener<T> onSuccessListener, T t4) {
            super(0);
            this.$onSuccess = onSuccessListener;
            this.$data = t4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m266invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m266invoke() {
            this.$onSuccess.onSuccess(this.$data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$setTaskResult$1$1(Task<T> task, T t4) {
        super(1);
        this.this$0 = task;
        this.$data = t4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ListenerHandler) obj);
        return Unit.f41027a;
    }

    public final void invoke(ListenerHandler<T> listenerHandler) {
        Intrinsics.checkNotNullParameter(listenerHandler, "listenerHandler");
        OnSuccessListener<T> onSuccess = listenerHandler.getOnSuccess();
        if (onSuccess != null) {
            this.this$0.runWithFallbackToMain(listenerHandler.getExecutor(), new AnonymousClass1(onSuccess, this.$data));
        }
    }
}
