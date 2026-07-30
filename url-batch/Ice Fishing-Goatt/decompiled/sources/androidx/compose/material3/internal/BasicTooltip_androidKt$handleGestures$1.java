package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BasicTooltip.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class BasicTooltip_androidKt$handleGestures$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TooltipState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltip_androidKt$handleGestures$1(TooltipState tooltipState, Continuation<? super BasicTooltip_androidKt$handleGestures$1> continuation) {
        super(2, continuation);
        this.$state = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.$state, continuation);
        basicTooltip_androidKt$handleGestures$1.L$0 = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((BasicTooltip_androidKt$handleGestures$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: BasicTooltip.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ TooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BasicTooltip.android.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 0, 1, 1, 1, 2}, l = {171, 177, 197}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
        /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00471 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ TooltipState $state;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00471(CoroutineScope coroutineScope, TooltipState tooltipState, Continuation<? super C00471> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.$state = tooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00471 c00471 = new C00471(this.$$this$coroutineScope, this.$state, continuation);
                c00471.L$0 = obj;
                return c00471;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00471) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
            
                if (r5 == r1) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x00fe A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001a, B:10:0x00fa, B:12:0x00fe), top: B:7:0x001a }] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                MutableStateFlow MutableStateFlow;
                long longPressTimeoutMillis;
                PointerEventPass pointerEventPass;
                Object awaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope2;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                Object waitForUpOrCancellation;
                PointerInputChange pointerInputChange;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
                    longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                    pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = MutableStateFlow;
                    this.L$2 = pointerEventPass;
                    this.J$0 = longPressTimeoutMillis;
                    this.label = 1;
                    awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, pointerEventPass, this, 1, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableStateFlow2 = (MutableStateFlow) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                waitForUpOrCancellation = obj;
                                pointerInputChange = (PointerInputChange) waitForUpOrCancellation;
                                if (pointerInputChange != null) {
                                    pointerInputChange.consume();
                                }
                                mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                                throw th;
                            }
                        }
                        PointerEventPass pointerEventPass2 = (PointerEventPass) this.L$2;
                        mutableStateFlow = (MutableStateFlow) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            mutableStateFlow.tryEmit(Boxing.boxBoolean(false));
                        } catch (PointerEventTimeoutCancellationException unused) {
                            pointerEventPass = pointerEventPass2;
                            MutableStateFlow = mutableStateFlow;
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(MutableStateFlow, this.$state, null), 1, null);
                            this.L$0 = MutableStateFlow;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope2, pointerEventPass, this);
                            if (waitForUpOrCancellation != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            mutableStateFlow2 = mutableStateFlow;
                            mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                            throw th;
                        }
                        return Unit.INSTANCE;
                    }
                    long j = this.J$0;
                    PointerEventPass pointerEventPass3 = (PointerEventPass) this.L$2;
                    MutableStateFlow mutableStateFlow3 = (MutableStateFlow) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    longPressTimeoutMillis = j;
                    awaitPointerEventScope = awaitPointerEventScope3;
                    pointerEventPass = pointerEventPass3;
                    MutableStateFlow = mutableStateFlow3;
                    awaitFirstDown$default = obj;
                }
                int type = ((PointerInputChange) awaitFirstDown$default).getType();
                if (PointerType.m5095equalsimpl0(type, PointerType.INSTANCE.m5102getTouchT8wyACA()) || PointerType.m5095equalsimpl0(type, PointerType.INSTANCE.m5101getStylusT8wyACA())) {
                    try {
                        try {
                            this.L$0 = awaitPointerEventScope;
                            this.L$1 = MutableStateFlow;
                            this.L$2 = pointerEventPass;
                            this.label = 2;
                            if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, new C00481(pointerEventPass, null), this) != coroutine_suspended) {
                                mutableStateFlow = MutableStateFlow;
                                mutableStateFlow.tryEmit(Boxing.boxBoolean(false));
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(MutableStateFlow, this.$state, null), 1, null);
                            this.L$0 = MutableStateFlow;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope2, pointerEventPass, this);
                            if (waitForUpOrCancellation != coroutine_suspended) {
                                mutableStateFlow2 = MutableStateFlow;
                                pointerInputChange = (PointerInputChange) waitForUpOrCancellation;
                                if (pointerInputChange != null) {
                                }
                                mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        mutableStateFlow2 = MutableStateFlow;
                        mutableStateFlow2.tryEmit(Boxing.boxBoolean(false));
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00481 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                final /* synthetic */ PointerEventPass $pass;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00481(PointerEventPass pointerEventPass, Continuation<? super C00481> continuation) {
                    super(2, continuation);
                    this.$pass = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00481 c00481 = new C00481(this.$pass, continuation);
                    c00481.L$0 = obj;
                    return c00481;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                    return ((C00481) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    Object waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) this.L$0, this.$pass, this);
                    return waitForUpOrCancellation == coroutine_suspended ? coroutine_suspended : waitForUpOrCancellation;
                }
            }

            /* compiled from: BasicTooltip.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {185, 187, 187}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MutableStateFlow<Boolean> $isLongPressedFlow;
                final /* synthetic */ TooltipState $state;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(MutableStateFlow<Boolean> mutableStateFlow, TooltipState tooltipState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$isLongPressedFlow = mutableStateFlow;
                    this.$state = tooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$isLongPressedFlow, this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
                
                    if (r7 == r0) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
                
                    if (r7.$state.show(androidx.compose.foundation.MutatePriority.PreventUserInput, r7) == r0) goto L26;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.material3.TooltipState] */
                /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    AnonymousClass2 anonymousClass2 = null;
                    int i2 = 3;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.$isLongPressedFlow.tryEmit(Boxing.boxBoolean(true));
                            this.label = 1;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th = (Throwable) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        MutableStateFlow<Boolean> mutableStateFlow = this.$isLongPressedFlow;
                        i2 = this.$state;
                        C00491 c00491 = new C00491(i2, null);
                        anonymousClass2 = this;
                        this.label = 2;
                        this = FlowKt.collectLatest(mutableStateFlow, c00491, anonymousClass2);
                    } catch (Throwable th2) {
                        this.L$0 = th2;
                        this.label = i2;
                        if (FlowKt.collectLatest(this.$isLongPressedFlow, new C00491(this.$state, anonymousClass2), this) != coroutine_suspended) {
                            throw th2;
                        }
                    }
                }

                /* compiled from: BasicTooltip.android.kt */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isLongPressed", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.internal.BasicTooltip_androidKt$handleGestures$1$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C00491 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    final /* synthetic */ TooltipState $state;
                    /* synthetic */ boolean Z$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00491(TooltipState tooltipState, Continuation<? super C00491> continuation) {
                        super(2, continuation);
                        this.$state = tooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C00491 c00491 = new C00491(this.$state, continuation);
                        c00491.Z$0 = ((Boolean) obj).booleanValue();
                        return c00491;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return invoke(bool.booleanValue(), continuation);
                    }

                    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                        return ((C00491) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (!this.Z$0) {
                            this.$state.dismiss();
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C00471(coroutineScope, this.$state, null), this) == coroutine_suspended) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null), this) == coroutine_suspended) {
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
