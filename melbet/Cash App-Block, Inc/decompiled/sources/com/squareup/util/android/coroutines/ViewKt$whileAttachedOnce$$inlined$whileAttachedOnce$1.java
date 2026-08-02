package com.squareup.util.android.coroutines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ JobImpl $controllerJob;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 $work;
    public /* synthetic */ Object L$0;

    /* renamed from: com.squareup.util.android.coroutines.ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ JobImpl $controllerJob;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ JobImpl $workJob;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(JobImpl jobImpl, JobImpl jobImpl2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$controllerJob = jobImpl;
            this.$workJob = jobImpl2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            JobImpl jobImpl = this.$workJob;
            JobImpl jobImpl2 = this.$controllerJob;
            switch (i) {
                case 0:
                    return new AnonymousClass1(jobImpl2, jobImpl, continuation, 0);
                default:
                    return new AnonymousClass1(jobImpl2, jobImpl, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            JobImpl jobImpl = this.$workJob;
            JobImpl jobImpl2 = this.$controllerJob;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (jobImpl2.join(this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    jobImpl.cancel(null);
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        if (jobImpl2.join(this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    jobImpl.cancel(null);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.util.android.coroutines.ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ StandaloneCoroutine $waitForJobCancellation;
        public final /* synthetic */ Function2 $work;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Function2 function2, StandaloneCoroutine standaloneCoroutine, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$work = function2;
            this.$waitForJobCancellation = standaloneCoroutine;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            StandaloneCoroutine standaloneCoroutine = this.$waitForJobCancellation;
            Function2 function2 = this.$work;
            switch (i) {
                case 0:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(function2, standaloneCoroutine, continuation, 0);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                default:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(function2, standaloneCoroutine, continuation, 1);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            StandaloneCoroutine standaloneCoroutine = this.$waitForJobCancellation;
            Function2 function2 = this.$work;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (function2.invoke(coroutineScope, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    standaloneCoroutine.cancel(null);
                    break;
                default:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (function2.invoke(coroutineScope2, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    standaloneCoroutine.cancel(null);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1(JobImpl jobImpl, Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$controllerJob = jobImpl;
        this.$work = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function2 function2 = this.$work;
        JobImpl jobImpl = this.$controllerJob;
        switch (i) {
            case 0:
                ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1 viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1 = new ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1(jobImpl, function2, continuation, 0);
                viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1.L$0 = obj;
                return viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1;
            default:
                ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1 viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$12 = new ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1(jobImpl, function2, continuation, 1);
                viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$12.L$0 = obj;
                return viewKt$whileAttachedOnce$$inlined$whileAttachedOnce$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ViewKt$whileAttachedOnce$$inlined$whileAttachedOnce$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.$work;
        JobImpl jobImpl = this.$controllerJob;
        Continuation continuation = null;
        int i2 = 1;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (jobImpl.isActive()) {
                    JobImpl jobImpl2 = new JobImpl(JobKt.getJob(coroutineScope.getCoroutineContext()));
                    int i3 = 0;
                    JobKt.launch(coroutineScope, jobImpl2, CoroutineStart.DEFAULT, new AnonymousClass2(function2, JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(jobImpl, jobImpl2, continuation, i3), 1), continuation, i3));
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (jobImpl.isActive()) {
                    JobImpl jobImpl3 = new JobImpl(JobKt.getJob(coroutineScope.getCoroutineContext()));
                    JobKt.launch(coroutineScope, jobImpl3, CoroutineStart.DEFAULT, new AnonymousClass2(function2, JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(jobImpl, jobImpl3, continuation, i2), 1), continuation, i2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
