package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function3 $onPress;
    final /* synthetic */ Function1 $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, Function3 function3, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$pressScope = pressGestureScopeImpl;
        this.$onPress = function3;
        this.$onTap = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$pressScope, this.$onPress, this.$onTap, continuation);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ PointerInputScope $$this$forEachGesture;
        final /* synthetic */ Function3 $onPress;
        final /* synthetic */ Function1 $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PressGestureScopeImpl pressGestureScopeImpl, PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.$pressScope = pressGestureScopeImpl;
            this.$$this$forEachGesture = pointerInputScope;
            this.$onPress = function3;
            this.$onTap = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, this.$$this$forEachGesture, this.$onPress, this.$onTap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.$pressScope.reset();
                PointerInputScope pointerInputScope = this.$$this$forEachGesture;
                C00111 c00111 = new C00111(this.$onPress, coroutineScope, this.$pressScope, this.$onTap, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00111, this) == coroutine_suspended) {
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
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {210, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00111 extends RestrictedSuspendLambda implements Function2 {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function3 $onPress;
            final /* synthetic */ Function1 $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00111(Function3 function3, CoroutineScope coroutineScope, PressGestureScopeImpl pressGestureScopeImpl, Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.$onPress = function3;
                this.$$this$coroutineScope = coroutineScope;
                this.$pressScope = pressGestureScopeImpl;
                this.$onTap = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                C00111 c00111 = new C00111(this.$onPress, this.$$this$coroutineScope, this.$pressScope, this.$onTap, continuation);
                c00111.L$0 = obj;
                return c00111;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((C00111) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Function3 function3;
                PointerInputChange pointerInputChange;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.$pressScope.cancel();
                        } else {
                            pointerInputChange.consume();
                            this.$pressScope.release();
                            Function1 function1 = this.$onTap;
                            if (function1 != null) {
                                function1.invoke(Offset.m1288boximpl(pointerInputChange.getPosition()));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                pointerInputChange2.consume();
                Function3 function32 = this.$onPress;
                function3 = TapGestureDetectorKt.NoPressGesture;
                if (function32 != function3) {
                    BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, null, new C00121(this.$onPress, this.$pressScope, pointerInputChange2, null), 3, null);
                }
                this.L$0 = null;
                this.label = 2;
                obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange != null) {
                }
                return Unit.INSTANCE;
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00121 extends SuspendLambda implements Function2 {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ Function3 $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00121(Function3 function3, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, Continuation continuation) {
                    super(2, continuation);
                    this.$onPress = function3;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00121(this.$onPress, this.$pressScope, this.$down, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pressScope, (PointerInputScope) this.L$0, this.$onPress, this.$onTap, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
