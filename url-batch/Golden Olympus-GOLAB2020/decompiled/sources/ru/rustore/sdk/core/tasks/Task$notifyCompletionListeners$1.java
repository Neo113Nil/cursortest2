package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Task$notifyCompletionListeners$1 extends s implements Function1<CompletionHandler, Unit> {
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ Task<T> this$0;

    @Metadata
    /* renamed from: ru.rustore.sdk.core.tasks.Task$notifyCompletionListeners$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        final /* synthetic */ Throwable $cause;
        final /* synthetic */ CompletionHandler $completionListenerHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CompletionHandler completionHandler, Throwable th) {
            super(0);
            this.$completionListenerHandler = completionHandler;
            this.$cause = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m265invoke();
            return Unit.f41027a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m265invoke() {
            this.$completionListenerHandler.getOnCompletionListener().onComplete(this.$cause);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Task$notifyCompletionListeners$1(Task<T> task, Throwable th) {
        super(1);
        this.this$0 = task;
        this.$cause = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CompletionHandler) obj);
        return Unit.f41027a;
    }

    public final void invoke(CompletionHandler completionListenerHandler) {
        Intrinsics.checkNotNullParameter(completionListenerHandler, "completionListenerHandler");
        this.this$0.runWithFallbackToMain(completionListenerHandler.getExecutor(), new AnonymousClass1(completionListenerHandler, this.$cause));
    }
}
