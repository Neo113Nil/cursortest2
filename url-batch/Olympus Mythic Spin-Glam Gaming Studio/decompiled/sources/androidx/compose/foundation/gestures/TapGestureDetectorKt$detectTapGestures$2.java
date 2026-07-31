package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function1 $onDoubleTap;
    final /* synthetic */ Function1 $onLongPress;
    final /* synthetic */ Function3 $onPress;
    final /* synthetic */ Function1 $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = function3;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pressGestureScopeImpl, this.$onPress, coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, null);
            this.label = 1;
            if (ForEachGestureKt.forEachGesture(pointerInputScope, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ CoroutineScope $$this$coroutineScope;
        final /* synthetic */ Function1 $onDoubleTap;
        final /* synthetic */ Function1 $onLongPress;
        final /* synthetic */ Function3 $onPress;
        final /* synthetic */ Function1 $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, Function3 function3, CoroutineScope coroutineScope, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
            super(2, continuation);
            this.$pressScope = pressGestureScopeImpl;
            this.$onPress = function3;
            this.$$this$coroutineScope = coroutineScope;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {94, 106, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 127, 140, 158}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00131 extends RestrictedSuspendLambda implements Function2 {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function1 $onDoubleTap;
            final /* synthetic */ Function1 $onLongPress;
            final /* synthetic */ Function3 $onPress;
            final /* synthetic */ Function1 $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00131(PressGestureScopeImpl pressGestureScopeImpl, Function3 function3, CoroutineScope coroutineScope, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
                super(2, continuation);
                this.$pressScope = pressGestureScopeImpl;
                this.$onPress = function3;
                this.$$this$coroutineScope = coroutineScope;
                this.$onLongPress = function1;
                this.$onDoubleTap = function12;
                this.$onTap = function13;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00131 c00131 = new C00131(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, continuation);
                c00131.L$0 = obj;
                return c00131;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((C00131) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x01cf  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x01e9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: PointerEventTimeoutCancellationException -> 0x00ef, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x00ef, blocks: (B:57:0x00e3, B:59:0x00e9, B:62:0x00f3), top: B:56:0x00e3 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[Catch: PointerEventTimeoutCancellationException -> 0x00ef, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x00ef, blocks: (B:57:0x00e3, B:59:0x00e9, B:62:0x00f3), top: B:56:0x00e3 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0120 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x00df A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x00bd  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object awaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange;
                Function3 function3;
                Function3 function32;
                long longPressTimeoutMillis;
                Ref$ObjectRef ref$ObjectRef;
                Object withTimeout;
                AwaitPointerEventScope awaitPointerEventScope3;
                PointerInputChange pointerInputChange2;
                Ref$ObjectRef ref$ObjectRef2;
                AwaitPointerEventScope awaitPointerEventScope4;
                Function1 function1;
                Object consumeUntilUp;
                T t;
                T t2;
                T t3;
                Object awaitSecondDown;
                Ref$ObjectRef ref$ObjectRef3;
                AwaitPointerEventScope awaitPointerEventScope5;
                PointerInputChange pointerInputChange3;
                Function3 function33;
                Ref$ObjectRef ref$ObjectRef4;
                AwaitPointerEventScope awaitPointerEventScope6;
                Function1 function12;
                Function1 function13;
                Object consumeUntilUp2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, this, 1, null);
                        if (awaitFirstDown$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                        pointerInputChange.consume();
                        this.$pressScope.reset();
                        function3 = this.$onPress;
                        function32 = TapGestureDetectorKt.NoPressGesture;
                        if (function3 != function32) {
                            BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00141(this.$onPress, this.$pressScope, pointerInputChange, null), 3, null);
                        }
                        longPressTimeoutMillis = this.$onLongPress == null ? awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis() : 4611686018427387903L;
                        ref$ObjectRef = new Ref$ObjectRef();
                        try {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange;
                            this.L$2 = ref$ObjectRef;
                            this.L$3 = ref$ObjectRef;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 2;
                            withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, anonymousClass2, this);
                        } catch (PointerEventTimeoutCancellationException unused) {
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                                function1.invoke(Offset.m1288boximpl(pointerInputChange.getPosition()));
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = ref$ObjectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$pressScope.release();
                            ref$ObjectRef2 = ref$ObjectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            t3 = ref$ObjectRef2.element;
                            if (t3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (withTimeout != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        pointerInputChange2 = pointerInputChange;
                        ref$ObjectRef2 = ref$ObjectRef;
                        t = withTimeout;
                        try {
                            ref$ObjectRef.element = t;
                            t2 = ref$ObjectRef2.element;
                            if (t2 != 0) {
                                this.$pressScope.cancel();
                            } else {
                                ((PointerInputChange) t2).consume();
                                this.$pressScope.release();
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            ref$ObjectRef = ref$ObjectRef2;
                            pointerInputChange = pointerInputChange2;
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = ref$ObjectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                            }
                            this.$pressScope.release();
                            ref$ObjectRef2 = ref$ObjectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            t3 = ref$ObjectRef2.element;
                            if (t3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        t3 = ref$ObjectRef2.element;
                        if (t3 != 0) {
                            if (this.$onDoubleTap == null) {
                                Function1 function14 = this.$onTap;
                                if (function14 != null) {
                                    function14.invoke(Offset.m1288boximpl(((PointerInputChange) t3).getPosition()));
                                }
                            } else {
                                this.L$0 = awaitPointerEventScope3;
                                this.L$1 = ref$ObjectRef2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.J$0 = longPressTimeoutMillis;
                                this.label = 4;
                                awaitSecondDown = TapGestureDetectorKt.awaitSecondDown(awaitPointerEventScope3, (PointerInputChange) t3, this);
                                if (awaitSecondDown == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ref$ObjectRef3 = ref$ObjectRef2;
                                awaitPointerEventScope5 = awaitPointerEventScope3;
                                pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                                if (pointerInputChange3 != null) {
                                    Function1 function15 = this.$onTap;
                                    if (function15 != null) {
                                        function15.invoke(Offset.m1288boximpl(((PointerInputChange) ref$ObjectRef3.element).getPosition()));
                                    }
                                } else {
                                    this.$pressScope.reset();
                                    Function3 function34 = this.$onPress;
                                    function33 = TapGestureDetectorKt.NoPressGesture;
                                    if (function34 != function33) {
                                        BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new AnonymousClass3(this.$onPress, this.$pressScope, pointerInputChange3, null), 3, null);
                                    }
                                    try {
                                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$pressScope, this.$onDoubleTap, this.$onTap, ref$ObjectRef3, null);
                                        this.L$0 = awaitPointerEventScope5;
                                        this.L$1 = ref$ObjectRef3;
                                        this.L$2 = pointerInputChange3;
                                        this.label = 5;
                                        if (awaitPointerEventScope5.withTimeout(longPressTimeoutMillis, anonymousClass4, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (PointerEventTimeoutCancellationException unused3) {
                                        ref$ObjectRef4 = ref$ObjectRef3;
                                        awaitPointerEventScope6 = awaitPointerEventScope5;
                                        function12 = this.$onTap;
                                        if (function12 != null) {
                                        }
                                        function13 = this.$onLongPress;
                                        if (function13 != null) {
                                        }
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                        consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                                        if (consumeUntilUp2 == coroutine_suspended) {
                                        }
                                        this.$pressScope.release();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        awaitFirstDown$default = obj;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                        pointerInputChange.consume();
                        this.$pressScope.reset();
                        function3 = this.$onPress;
                        function32 = TapGestureDetectorKt.NoPressGesture;
                        if (function3 != function32) {
                        }
                        if (this.$onLongPress == null) {
                        }
                        ref$ObjectRef = new Ref$ObjectRef();
                        AnonymousClass2 anonymousClass22 = new AnonymousClass2(null);
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = ref$ObjectRef;
                        this.L$3 = ref$ObjectRef;
                        this.J$0 = longPressTimeoutMillis;
                        this.label = 2;
                        withTimeout = awaitPointerEventScope2.withTimeout(longPressTimeoutMillis, anonymousClass22, this);
                        if (withTimeout != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        longPressTimeoutMillis = this.J$0;
                        ref$ObjectRef = (Ref$ObjectRef) this.L$3;
                        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.L$2;
                        pointerInputChange = (PointerInputChange) this.L$1;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            pointerInputChange2 = pointerInputChange;
                            ref$ObjectRef2 = ref$ObjectRef5;
                            t = obj;
                            ref$ObjectRef.element = t;
                            t2 = ref$ObjectRef2.element;
                            if (t2 != 0) {
                            }
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            ref$ObjectRef = ref$ObjectRef5;
                            awaitPointerEventScope4 = awaitPointerEventScope2;
                            function1 = this.$onLongPress;
                            if (function1 != null) {
                            }
                            this.L$0 = awaitPointerEventScope4;
                            this.L$1 = ref$ObjectRef;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = longPressTimeoutMillis;
                            this.label = 3;
                            consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                            if (consumeUntilUp == coroutine_suspended) {
                            }
                            this.$pressScope.release();
                            ref$ObjectRef2 = ref$ObjectRef;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            t3 = ref$ObjectRef2.element;
                            if (t3 != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                        t3 = ref$ObjectRef2.element;
                        if (t3 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        longPressTimeoutMillis = this.J$0;
                        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                        awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        this.$pressScope.release();
                        ref$ObjectRef2 = ref$ObjectRef;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                        t3 = ref$ObjectRef2.element;
                        if (t3 != 0) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        longPressTimeoutMillis = this.J$0;
                        Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.L$1;
                        AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ref$ObjectRef3 = ref$ObjectRef6;
                        awaitPointerEventScope5 = awaitPointerEventScope7;
                        awaitSecondDown = obj;
                        pointerInputChange3 = (PointerInputChange) awaitSecondDown;
                        if (pointerInputChange3 != null) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        pointerInputChange3 = (PointerInputChange) this.L$2;
                        ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
                        awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (PointerEventTimeoutCancellationException unused5) {
                            function12 = this.$onTap;
                            if (function12 != null) {
                                function12.invoke(Offset.m1288boximpl(((PointerInputChange) ref$ObjectRef4.element).getPosition()));
                            }
                            function13 = this.$onLongPress;
                            if (function13 != null) {
                                function13.invoke(Offset.m1288boximpl(pointerInputChange3.getPosition()));
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope6, this);
                            if (consumeUntilUp2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.$pressScope.release();
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        this.$pressScope.release();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", l = {98}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00141 extends SuspendLambda implements Function2 {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3 $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00141(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00141(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m1288boximpl = Offset.m1288boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m1288boximpl, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", l = {107}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2 {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", l = {135}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2 {
                final /* synthetic */ Function3 $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass3(this.$onPress, this.$pressScope, this.$secondDown, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset m1288boximpl = Offset.m1288boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (function3.invoke(pressGestureScopeImpl, m1288boximpl, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends RestrictedSuspendLambda implements Function2 {
                final /* synthetic */ Function1 $onDoubleTap;
                final /* synthetic */ Function1 $onTap;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ Ref$ObjectRef<PointerInputChange> $upOrCancel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, Function1 function1, Function1 function12, Ref$ObjectRef<PointerInputChange> ref$ObjectRef, Continuation continuation) {
                    super(2, continuation);
                    this.$pressScope = pressGestureScopeImpl;
                    this.$onDoubleTap = function1;
                    this.$onTap = function12;
                    this.$upOrCancel = ref$ObjectRef;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$pressScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass4) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        this.$pressScope.release();
                        this.$onDoubleTap.invoke(Offset.m1288boximpl(pointerInputChange.getPosition()));
                        return Unit.INSTANCE;
                    }
                    this.$pressScope.cancel();
                    Function1 function1 = this.$onTap;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(Offset.m1288boximpl(this.$upOrCancel.element.getPosition()));
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C00131 c00131 = new C00131(this.$pressScope, this.$onPress, this.$$this$coroutineScope, this.$onLongPress, this.$onDoubleTap, this.$onTap, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00131, this) == coroutine_suspended) {
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
}
