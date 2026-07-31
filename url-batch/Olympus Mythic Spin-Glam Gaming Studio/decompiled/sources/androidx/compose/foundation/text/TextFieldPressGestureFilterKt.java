package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldPressGestureFilter.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"tapPressTextFieldModifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onTap", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, final MutableInteractionSource mutableInteractionSource, boolean z, final Function1 onTap) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        return z ? ComposedModifierKt.composed$default(modifier, null, new Function3() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-102778667);
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
                State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Function1.this, composer, 0);
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                EffectsKt.DisposableEffect(mutableInteractionSource2, new Function1() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final MutableState<PressInteraction.Press> mutableState2 = mutableState;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                PressInteraction.Press press = (PressInteraction.Press) MutableState.this.getValue();
                                if (press != null) {
                                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    if (mutableInteractionSource4 != null) {
                                        mutableInteractionSource4.tryEmit(cancel);
                                    }
                                    MutableState.this.setValue(null);
                                }
                            }
                        };
                    }
                }, composer, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, mutableInteractionSource3, new AnonymousClass2(coroutineScope, mutableState, mutableInteractionSource3, rememberUpdatedState, null));
                composer.endReplaceableGroup();
                return pointerInput;
            }

            /* compiled from: TextFieldPressGestureFilter.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ State<Function1> $onTapState;
                final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1> state, Continuation continuation) {
                    super(2, continuation);
                    this.$scope = coroutineScope;
                    this.$pressedInteraction = mutableState;
                    this.$interactionSource = mutableInteractionSource;
                    this.$onTapState = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TextFieldPressGestureFilter.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {68}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function3 {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                    final /* synthetic */ CoroutineScope $scope;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CoroutineScope coroutineScope, MutableState<PressInteraction.Press> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                        super(3, continuation);
                        this.$scope = coroutineScope;
                        this.$pressedInteraction = mutableState;
                        this.$interactionSource = mutableInteractionSource;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m587invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (Continuation) obj3);
                    }

                    @Nullable
                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m587invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, continuation);
                        anonymousClass1.L$0 = pressGestureScope;
                        anonymousClass1.J$0 = j;
                        return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                    }

                    /* compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {61, 65}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00191 extends SuspendLambda implements Function2 {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ long $it;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00191(MutableState<PressInteraction.Press> mutableState, long j, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                            super(2, continuation);
                            this.$pressedInteraction = mutableState;
                            this.$it = j;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new C00191(this.$pressedInteraction, this.$it, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                            return ((C00191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(@NotNull Object obj) {
                            MutableState<PressInteraction.Press> mutableState;
                            MutableState<PressInteraction.Press> mutableState2;
                            PressInteraction.Press press;
                            MutableInteractionSource mutableInteractionSource;
                            PressInteraction.Press press2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressInteraction.Press press3 = (PressInteraction.Press) this.$pressedInteraction.getValue();
                                if (press3 != null) {
                                    MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                                    mutableState = this.$pressedInteraction;
                                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press3);
                                    if (mutableInteractionSource2 != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource2.emit(cancel, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutableState2 = mutableState;
                                    }
                                    mutableState.setValue(null);
                                }
                                press = new PressInteraction.Press(this.$it, null);
                                mutableInteractionSource = this.$interactionSource;
                                if (mutableInteractionSource != null) {
                                    this.L$0 = press;
                                    this.label = 2;
                                    if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    press2 = press;
                                    press = press2;
                                }
                                this.$pressedInteraction.setValue(press);
                                return Unit.INSTANCE;
                            }
                            if (i != 1) {
                                if (i == 2) {
                                    press2 = (PressInteraction.Press) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    press = press2;
                                    this.$pressedInteraction.setValue(press);
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutableState2 = (MutableState) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutableState = mutableState2;
                            mutableState.setValue(null);
                            press = new PressInteraction.Press(this.$it, null);
                            mutableInteractionSource = this.$interactionSource;
                            if (mutableInteractionSource != null) {
                            }
                            this.$pressedInteraction.setValue(press);
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: TextFieldPressGestureFilter.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
                    static final class C00202 extends SuspendLambda implements Function2 {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
                        final /* synthetic */ boolean $success;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00202(MutableState<PressInteraction.Press> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
                            super(2, continuation);
                            this.$pressedInteraction = mutableState;
                            this.$success = z;
                            this.$interactionSource = mutableInteractionSource;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                            return new C00202(this.$pressedInteraction, this.$success, this.$interactionSource, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                            return ((C00202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            MutableState<PressInteraction.Press> mutableState;
                            Interaction cancel;
                            MutableState<PressInteraction.Press> mutableState2;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressInteraction.Press press = (PressInteraction.Press) this.$pressedInteraction.getValue();
                                if (press != null) {
                                    boolean z = this.$success;
                                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                                    mutableState = this.$pressedInteraction;
                                    if (z) {
                                        cancel = new PressInteraction.Release(press);
                                    } else {
                                        cancel = new PressInteraction.Cancel(press);
                                    }
                                    if (mutableInteractionSource != null) {
                                        this.L$0 = mutableState;
                                        this.label = 1;
                                        if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
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

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00191(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                            this.label = 1;
                            obj = pressGestureScope.tryAwaitRelease(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00202(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                        return Unit.INSTANCE;
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
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                        final State<Function1> state = this.$onTapState;
                        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m588invokek4lQ0M(((Offset) obj2).getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m588invokek4lQ0M(long j) {
                                ((Function1) state.getValue()).invoke(Offset.m1288boximpl(j));
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, anonymousClass1, function1, this) == coroutine_suspended) {
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
        }, 1, null) : modifier;
    }
}
