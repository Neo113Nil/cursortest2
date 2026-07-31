package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RepeatOnLifecycle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ Function2 $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = coroutineScope;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            Job job;
            LifecycleEventObserver lifecycleEventObserver;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                    return Unit.INSTANCE;
                }
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                try {
                    Lifecycle.State state = this.$state;
                    Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                    final CoroutineScope coroutineScope = this.$$this$coroutineScope;
                    final Function2 function2 = this.$block;
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = ref$ObjectRef4;
                    this.L$2 = state;
                    this.L$3 = lifecycle;
                    this.L$4 = coroutineScope;
                    this.L$5 = function2;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                    final Lifecycle.Event upTo = companion.upTo(state);
                    final Lifecycle.Event downFrom = companion.downFrom(state);
                    final Mutex Mutex$default = MutexKt.Mutex$default(false, 1, null);
                    ?? r10 = new LifecycleEventObserver() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
                        /* JADX WARN: Type inference failed for: r9v5, types: [T, kotlinx.coroutines.Job] */
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                            ?? launch$default;
                            Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
                            Intrinsics.checkNotNullParameter(event, "event");
                            if (event == Lifecycle.Event.this) {
                                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef3;
                                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(Mutex$default, function2, null), 3, null);
                                ref$ObjectRef5.element = launch$default;
                                return;
                            }
                            if (event == downFrom) {
                                Job job2 = (Job) ref$ObjectRef3.element;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, null, 1, null);
                                }
                                ref$ObjectRef3.element = null;
                            }
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion2 = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                            }
                        }

                        /* compiled from: RepeatOnLifecycle.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
                        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                            final /* synthetic */ Function2 $block;
                            final /* synthetic */ Mutex $mutex;
                            Object L$0;
                            Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(Mutex mutex, Function2 function2, Continuation continuation) {
                                super(2, continuation);
                                this.$mutex = mutex;
                                this.$block = function2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object obj, Continuation continuation) {
                                return new AnonymousClass1(this.$mutex, this.$block, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Mutex mutex;
                                Function2 function2;
                                Mutex mutex2;
                                Throwable th;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                try {
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        mutex = this.$mutex;
                                        function2 = this.$block;
                                        this.L$0 = mutex;
                                        this.L$1 = function2;
                                        this.label = 1;
                                        if (mutex.lock(null, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            mutex2 = (Mutex) this.L$0;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                                Unit unit = Unit.INSTANCE;
                                                mutex2.unlock(null);
                                                return Unit.INSTANCE;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                mutex2.unlock(null);
                                                throw th;
                                            }
                                        }
                                        function2 = (Function2) this.L$1;
                                        Mutex mutex3 = (Mutex) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        mutex = mutex3;
                                    }
                                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                    this.L$0 = mutex;
                                    this.L$1 = null;
                                    this.label = 2;
                                    if (CoroutineScopeKt.coroutineScope(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutex2 = mutex;
                                    Unit unit2 = Unit.INSTANCE;
                                    mutex2.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    mutex2 = mutex;
                                    th = th3;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                        }
                    };
                    ref$ObjectRef4.element = r10;
                    Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver((LifecycleEventObserver) r10);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } catch (Throwable th) {
                    th = th;
                    ref$ObjectRef = ref$ObjectRef3;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    job = (Job) ref$ObjectRef.element;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef2.element;
                    if (lifecycleEventObserver != null) {
                        this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    job = (Job) ref$ObjectRef.element;
                    if (job != null) {
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) ref$ObjectRef2.element;
                    if (lifecycleEventObserver != null) {
                    }
                    throw th;
                }
            }
            Job job2 = (Job) ref$ObjectRef.element;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            LifecycleEventObserver lifecycleEventObserver2 = (LifecycleEventObserver) ref$ObjectRef2.element;
            if (lifecycleEventObserver2 != null) {
                this.$this_repeatOnLifecycle.removeObserver(lifecycleEventObserver2);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, coroutineScope, this.$block, null);
            this.label = 1;
            if (BuildersKt.withContext(immediate, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
