package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HoverableKt$hoverable$2 extends Lambda implements Function3 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableKt$hoverable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1294013553);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue2;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new Function1() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<HoverInteraction.Enter> mutableState2 = mutableState;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.HoverableKt$hoverable$2$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        HoverableKt$hoverable$2.invoke$tryEmitExit(MutableState.this, mutableInteractionSource2);
                    }
                };
            }
        }, composer, 0);
        EffectsKt.LaunchedEffect(Boolean.valueOf(this.$enabled), new AnonymousClass2(this.$enabled, mutableState, this.$interactionSource, null), composer, 0);
        if (this.$enabled) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            modifier = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource2, new AnonymousClass3(coroutineScope, mutableInteractionSource2, mutableState, null));
        } else {
            modifier = Modifier.INSTANCE;
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invoke$emitEnter(MutableInteractionSource mutableInteractionSource, MutableState mutableState, Continuation continuation) {
        HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1;
        int i;
        HoverInteraction.Enter enter;
        if (continuation instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
            hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1) continuation;
            int i2 = hoverableKt$hoverable$2$invoke$emitEnter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitEnter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableKt$hoverable$2$invoke$emitEnter$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableKt$hoverable$2$invoke$emitEnter$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m193invoke$lambda1(mutableState) == null) {
                        HoverInteraction.Enter enter2 = new HoverInteraction.Enter();
                        hoverableKt$hoverable$2$invoke$emitEnter$1.L$0 = mutableState;
                        hoverableKt$hoverable$2$invoke$emitEnter$1.L$1 = enter2;
                        hoverableKt$hoverable$2$invoke$emitEnter$1.label = 1;
                        if (mutableInteractionSource.emit(enter2, hoverableKt$hoverable$2$invoke$emitEnter$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        enter = enter2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enter = (HoverInteraction.Enter) hoverableKt$hoverable$2$invoke$emitEnter$1.L$1;
                mutableState = (MutableState) hoverableKt$hoverable$2$invoke$emitEnter$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState.setValue(enter);
                return Unit.INSTANCE;
            }
        }
        hoverableKt$hoverable$2$invoke$emitEnter$1 = new HoverableKt$hoverable$2$invoke$emitEnter$1(continuation);
        Object obj2 = hoverableKt$hoverable$2$invoke$emitEnter$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableKt$hoverable$2$invoke$emitEnter$1.label;
        if (i != 0) {
        }
        mutableState.setValue(enter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object invoke$emitExit(MutableState mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1;
        int i;
        if (continuation instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
            hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1) continuation;
            int i2 = hoverableKt$hoverable$2$invoke$emitExit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableKt$hoverable$2$invoke$emitExit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableKt$hoverable$2$invoke$emitExit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableKt$hoverable$2$invoke$emitExit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HoverInteraction.Enter m193invoke$lambda1 = m193invoke$lambda1(mutableState);
                    if (m193invoke$lambda1 != null) {
                        Interaction exit = new HoverInteraction.Exit(m193invoke$lambda1);
                        hoverableKt$hoverable$2$invoke$emitExit$1.L$0 = mutableState;
                        hoverableKt$hoverable$2$invoke$emitExit$1.label = 1;
                        if (mutableInteractionSource.emit(exit, hoverableKt$hoverable$2$invoke$emitExit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) hoverableKt$hoverable$2$invoke$emitExit$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutableState.setValue(null);
                return Unit.INSTANCE;
            }
        }
        hoverableKt$hoverable$2$invoke$emitExit$1 = new HoverableKt$hoverable$2$invoke$emitExit$1(continuation);
        Object obj2 = hoverableKt$hoverable$2$invoke$emitExit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableKt$hoverable$2$invoke$emitExit$1.label;
        if (i != 0) {
        }
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$tryEmitExit(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        HoverInteraction.Enter m193invoke$lambda1 = m193invoke$lambda1(mutableState);
        if (m193invoke$lambda1 != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(m193invoke$lambda1));
            mutableState.setValue(null);
        }
    }

    /* renamed from: invoke$lambda-1, reason: not valid java name */
    private static final HoverInteraction.Enter m193invoke$lambda1(MutableState mutableState) {
        return (HoverInteraction.Enter) mutableState.getValue();
    }

    /* compiled from: Hoverable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2 {
        final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$interactionSource = mutableInteractionSource;
            this.$hoverInteraction$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Hoverable.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", l = {104}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2 {
            final /* synthetic */ CoroutineContext $currentContext;
            final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ CoroutineScope $scope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CoroutineContext coroutineContext, CoroutineScope coroutineScope, MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
                super(2, continuation);
                this.$currentContext = coroutineContext;
                this.$scope = coroutineScope;
                this.$interactionSource = mutableInteractionSource;
                this.$hoverInteraction$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", l = {106}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00021 extends SuspendLambda implements Function2 {
                final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00021(MutableInteractionSource mutableInteractionSource, MutableState<HoverInteraction.Enter> mutableState, Continuation continuation) {
                    super(2, continuation);
                    this.$interactionSource = mutableInteractionSource;
                    this.$hoverInteraction$delegate = mutableState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new C00021(this.$interactionSource, this.$hoverInteraction$delegate, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((C00021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                        this.label = 1;
                        if (HoverableKt$hoverable$2.invoke$emitEnter(mutableInteractionSource, mutableState, this) == coroutine_suspended) {
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

            /* compiled from: Hoverable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", l = {107}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                    super(2, continuation);
                    this.$hoverInteraction$delegate = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass2(this.$hoverInteraction$delegate, this.$interactionSource, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        this.label = 1;
                        if (HoverableKt$hoverable$2.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutine_suspended) {
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

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    if (JobKt.isActive(this.$currentContext)) {
                    }
                } else if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    int type = ((PointerEvent) obj).getType();
                    PointerEventType.Companion companion = PointerEventType.INSTANCE;
                    if (PointerEventType.m1853equalsimpl0(type, companion.m1857getEnter7fucELk())) {
                        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00021(this.$interactionSource, this.$hoverInteraction$delegate, null), 3, null);
                    } else if (PointerEventType.m1853equalsimpl0(type, companion.m1858getExit7fucELk())) {
                        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass2(this.$hoverInteraction$delegate, this.$interactionSource, null), 3, null);
                    }
                    if (JobKt.isActive(this.$currentContext)) {
                        this.L$0 = awaitPointerEventScope;
                        this.label = 1;
                        obj = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int type2 = ((PointerEvent) obj).getType();
                        PointerEventType.Companion companion2 = PointerEventType.INSTANCE;
                        if (PointerEventType.m1853equalsimpl0(type2, companion2.m1857getEnter7fucELk())) {
                        }
                        if (JobKt.isActive(this.$currentContext)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext(), this.$scope, this.$interactionSource, this.$hoverInteraction$delegate, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: Hoverable.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
            super(2, continuation);
            this.$enabled = z;
            this.$hoverInteraction$delegate = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.$enabled) {
                    MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    this.label = 1;
                    if (HoverableKt$hoverable$2.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
