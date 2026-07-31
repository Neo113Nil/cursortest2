package ru.rustore.sdk.core.tasks;

import a2.AbstractC1241b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import ru.rustore.sdk.core.tasks.Task;

@Metadata
/* loaded from: classes3.dex */
final class TaskHelper$wrap$1 extends s implements Function1<Task<T>.TaskResultProvider, Unit> {
    final /* synthetic */ InterfaceC3316J $coroutineScope;
    final /* synthetic */ Function1<kotlin.coroutines.d, Object> $task;

    @f(c = "ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1", f = "TaskHelper.kt", l = {20}, m = "invokeSuspend")
    @Metadata
    /* renamed from: ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {
        final /* synthetic */ Function1<kotlin.coroutines.d, Object> $task;
        final /* synthetic */ Task<T>.TaskResultProvider $this_create;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Task<T>.TaskResultProvider taskResultProvider, Function1<? super kotlin.coroutines.d, ? extends Object> function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.$this_create = taskResultProvider;
            this.$task = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_create, this.$task, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object m243constructorimpl;
            Object f4 = AbstractC1241b.f();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.a(obj);
                    Function1<kotlin.coroutines.d, Object> function1 = this.$task;
                    Result.Companion companion = Result.Companion;
                    this.label = 1;
                    obj = function1.invoke(this);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                m243constructorimpl = Result.m243constructorimpl(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Task<T>.TaskResultProvider taskResultProvider = this.$this_create;
            if (Result.f(m243constructorimpl)) {
                taskResultProvider.setTaskSuccessResult(m243constructorimpl);
            }
            Task<T>.TaskResultProvider taskResultProvider2 = this.$this_create;
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                taskResultProvider2.setTaskErrorResult(d4);
            }
            return Unit.f41027a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((AnonymousClass1) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaskHelper$wrap$1(InterfaceC3316J interfaceC3316J, Function1<? super kotlin.coroutines.d, ? extends Object> function1) {
        super(1);
        this.$coroutineScope = interfaceC3316J;
        this.$task = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Task.TaskResultProvider) obj);
        return Unit.f41027a;
    }

    public final void invoke(Task<T>.TaskResultProvider create) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        AbstractC3337k.d(this.$coroutineScope, null, null, new AnonymousClass1(create, this.$task, null), 3, null);
    }
}
