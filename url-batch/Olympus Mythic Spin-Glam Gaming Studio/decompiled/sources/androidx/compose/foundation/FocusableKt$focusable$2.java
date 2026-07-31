package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.PinnableParent;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableKt$focusable$2 extends Lambda implements Function3 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableKt$focusable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
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
        Modifier modifier2;
        Modifier onPinnableParentAvailable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1871352361);
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
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) rememberedValue4;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new FocusRequester();
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        final FocusRequester focusRequester = (FocusRequester) rememberedValue5;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = BringIntoViewRequesterKt.BringIntoViewRequester();
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue6;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MutableState<FocusInteraction.Focus> mutableState4 = mutableState;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        FocusInteraction.Focus focus = (FocusInteraction.Focus) MutableState.this.getValue();
                        if (focus != null) {
                            FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                            MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            if (mutableInteractionSource3 != null) {
                                mutableInteractionSource3.tryEmit(unfocus);
                            }
                            MutableState.this.setValue(null);
                        }
                    }
                };
            }
        }, composer, 0);
        Boolean valueOf = Boolean.valueOf(this.$enabled);
        final boolean z = this.$enabled;
        final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        EffectsKt.DisposableEffect(valueOf, new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!z) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(mutableState, mutableInteractionSource2, null), 3, null);
                }
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }

            /* compiled from: Focusable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", l = {105}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                    super(2, continuation);
                    this.$focusedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    MutableState<FocusInteraction.Focus> mutableState;
                    MutableState<FocusInteraction.Focus> mutableState2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FocusInteraction.Focus focus = (FocusInteraction.Focus) this.$focusedInteraction.getValue();
                        if (focus != null) {
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            mutableState = this.$focusedInteraction;
                            FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                            if (mutableInteractionSource != null) {
                                this.L$0 = mutableState;
                                this.label = 1;
                                if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableState2 = mutableState;
                            }
                            mutableState.setValue(null);
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState2 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState = mutableState2;
                    mutableState.setValue(null);
                    return Unit.INSTANCE;
                }
            }
        }, composer, 0);
        if (this.$enabled) {
            if (m191invoke$lambda5(mutableState3)) {
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue7 = composer.rememberedValue();
                if (rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new FocusedBoundsModifier();
                    composer.updateRememberedValue(rememberedValue7);
                }
                composer.endReplaceableGroup();
                modifier2 = (Modifier) rememberedValue7;
            } else {
                modifier2 = Modifier.INSTANCE;
            }
            onPinnableParentAvailable = FocusableKt.onPinnableParentAvailable(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setFocused(semantics, FocusableKt$focusable$2.m191invoke$lambda5(mutableState3));
                    final FocusRequester focusRequester2 = focusRequester;
                    final MutableState<Boolean> mutableState4 = mutableState3;
                    SemanticsPropertiesKt.requestFocus$default(semantics, null, new Function0() { // from class: androidx.compose.foundation.FocusableKt.focusable.2.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            FocusRequester.this.requestFocus();
                            return Boolean.valueOf(FocusableKt$focusable$2.m191invoke$lambda5(mutableState4));
                        }
                    }, 1, null);
                }
            }, 1, null), new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PinnableParent) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable PinnableParent pinnableParent) {
                    FocusableKt$focusable$2.m190invoke$lambda3(mutableState2, pinnableParent);
                }
            });
            Modifier then = FocusRequesterModifierKt.focusRequester(BringIntoViewRequesterKt.bringIntoViewRequester(onPinnableParentAvailable, bringIntoViewRequester), focusRequester).then(modifier2);
            final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
            modifier = FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(then, new Function1() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FocusState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FocusState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    FocusableKt$focusable$2.m192invoke$lambda6(mutableState3, it.isFocused());
                    if (FocusableKt$focusable$2.m191invoke$lambda5(mutableState3)) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(bringIntoViewRequester, mutableState2, null), 1, null);
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass2(mutableState, mutableInteractionSource3, null), 3, null);
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass3(mutableState, mutableInteractionSource3, null), 3, null);
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", l = {144}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
                    final /* synthetic */ MutableState<PinnableParent> $pinnableParent$delegate;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, MutableState<PinnableParent> mutableState, Continuation continuation) {
                        super(2, continuation);
                        this.$bringIntoViewRequester = bringIntoViewRequester;
                        this.$pinnableParent$delegate = mutableState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$bringIntoViewRequester, this.$pinnableParent$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(@NotNull Object obj) {
                        PinnableParent.PinnedItemsHandle pinnedItemsHandle;
                        Throwable th;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                PinnableParent m189invoke$lambda2 = FocusableKt$focusable$2.m189invoke$lambda2(this.$pinnableParent$delegate);
                                PinnableParent.PinnedItemsHandle pinItems = m189invoke$lambda2 != null ? m189invoke$lambda2.pinItems() : null;
                                try {
                                    BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
                                    this.L$0 = pinItems;
                                    this.label = 1;
                                    if (BringIntoViewRequester.bringIntoView$default(bringIntoViewRequester, null, this, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    pinnedItemsHandle = pinItems;
                                } catch (Throwable th2) {
                                    th = th2;
                                    pinnedItemsHandle = pinItems;
                                    if (pinnedItemsHandle != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                pinnedItemsHandle = null;
                                th = th3;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pinnedItemsHandle = (PinnableParent.PinnedItemsHandle) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Throwable th4) {
                                th = th4;
                                if (pinnedItemsHandle != null) {
                                    pinnedItemsHandle.unpin();
                                }
                                throw th;
                            }
                        }
                        if (pinnedItemsHandle != null) {
                            pinnedItemsHandle.unpin();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", l = {152, 156}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                        super(2, continuation);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(@NotNull Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        FocusInteraction.Focus focus;
                        MutableInteractionSource mutableInteractionSource;
                        FocusInteraction.Focus focus2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FocusInteraction.Focus focus3 = (FocusInteraction.Focus) this.$focusedInteraction.getValue();
                            if (focus3 != null) {
                                MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus3);
                                if (mutableInteractionSource2 != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource2.emit(unfocus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            focus = new FocusInteraction.Focus();
                            mutableInteractionSource = this.$interactionSource;
                            if (mutableInteractionSource != null) {
                                this.L$0 = focus;
                                this.label = 2;
                                if (mutableInteractionSource.emit(focus, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                focus2 = focus;
                                focus = focus2;
                            }
                            this.$focusedInteraction.setValue(focus);
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                focus2 = (FocusInteraction.Focus) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                focus = focus2;
                                this.$focusedInteraction.setValue(focus);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        focus = new FocusInteraction.Focus();
                        mutableInteractionSource = this.$interactionSource;
                        if (mutableInteractionSource != null) {
                        }
                        this.$focusedInteraction.setValue(focus);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: Focusable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", l = {163}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$3, reason: invalid class name */
                static final class AnonymousClass3 extends SuspendLambda implements Function2 {
                    final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                        super(2, continuation);
                        this.$focusedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass3(this.$focusedInteraction, this.$interactionSource, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        MutableState<FocusInteraction.Focus> mutableState;
                        MutableState<FocusInteraction.Focus> mutableState2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FocusInteraction.Focus focus = (FocusInteraction.Focus) this.$focusedInteraction.getValue();
                            if (focus != null) {
                                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                mutableState = this.$focusedInteraction;
                                FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                                if (mutableInteractionSource != null) {
                                    this.L$0 = mutableState;
                                    this.label = 1;
                                    if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    mutableState2 = mutableState;
                                }
                                mutableState.setValue(null);
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutableState2 = (MutableState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutableState = mutableState2;
                        mutableState.setValue(null);
                        return Unit.INSTANCE;
                    }
                }
            }));
        } else {
            modifier = Modifier.INSTANCE;
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-6, reason: not valid java name */
    public static final void m192invoke$lambda6(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final PinnableParent m189invoke$lambda2(MutableState mutableState) {
        return (PinnableParent) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3, reason: not valid java name */
    public static final void m190invoke$lambda3(MutableState mutableState, PinnableParent pinnableParent) {
        mutableState.setValue(pinnableParent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-5, reason: not valid java name */
    public static final boolean m191invoke$lambda5(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
