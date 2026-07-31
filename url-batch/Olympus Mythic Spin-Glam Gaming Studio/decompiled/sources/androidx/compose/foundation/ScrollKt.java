package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a6\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a2\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\u0011"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "isVertical", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollKt {
    public static final ScrollState rememberScrollState(final int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1464256199);
        if ((i3 & 1) != 0) {
            i = 0;
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.rememberSaveable(new Object[0], ScrollState.INSTANCE.getSaver(), null, new Function0() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final ScrollState mo4828invoke() {
                return new ScrollState(i);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, final ScrollState scrollState, final boolean z, final FlingBehavior flingBehavior, final boolean z2, final boolean z3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("scroll");
                inspectorInfo.getProperties().set("state", ScrollState.this);
                inspectorInfo.getProperties().set("reverseScrolling", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(z3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
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
                composer.startReplaceableGroup(1478351300);
                OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(composer, 6);
                composer.startReplaceableGroup(773894976);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                final boolean z4 = z;
                final boolean z5 = z3;
                final boolean z6 = z2;
                final ScrollState scrollState2 = scrollState;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, new Function1() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
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
                        final ScrollState scrollState3 = scrollState2;
                        Function0 function0 = new Function0() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Float mo4828invoke() {
                                return Float.valueOf(ScrollState.this.getValue());
                            }
                        };
                        final ScrollState scrollState4 = scrollState2;
                        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(function0, new Function0() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            /* renamed from: invoke */
                            public final Float mo4828invoke() {
                                return Float.valueOf(ScrollState.this.getMaxValue());
                            }
                        }, z4);
                        if (z5) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                        } else {
                            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                        }
                        if (z6) {
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            final boolean z7 = z5;
                            final ScrollState scrollState5 = scrollState2;
                            SemanticsPropertiesKt.scrollBy$default(semantics, null, new Function2() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                                }

                                @NotNull
                                public final Boolean invoke(float f, float f2) {
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00041(z7, scrollState5, f2, f, null), 3, null);
                                    return Boolean.TRUE;
                                }

                                /* compiled from: Scroll.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {276, 278}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00041 extends SuspendLambda implements Function2 {
                                    final /* synthetic */ boolean $isVertical;
                                    final /* synthetic */ ScrollState $state;
                                    final /* synthetic */ float $x;
                                    final /* synthetic */ float $y;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00041(boolean z, ScrollState scrollState, float f, float f2, Continuation continuation) {
                                        super(2, continuation);
                                        this.$isVertical = z;
                                        this.$state = scrollState;
                                        this.$y = f;
                                        this.$x = f2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        return new C00041(this.$isVertical, this.$state, this.$y, this.$x, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                        return ((C00041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            if (this.$isVertical) {
                                                ScrollState scrollState = this.$state;
                                                float f = this.$y;
                                                this.label = 1;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                ScrollState scrollState2 = this.$state;
                                                float f2 = this.$x;
                                                this.label = 2;
                                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f2, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1 && i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null);
                boolean z7 = z3;
                Orientation orientation = z7 ? Orientation.Vertical : Orientation.Horizontal;
                boolean z8 = z;
                Modifier then = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(semantics$default, orientation), overscrollEffect).then(ScrollableKt.scrollable(companion, scrollState, orientation, overscrollEffect, z2, (composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl || z7) ? !z8 : z8, flingBehavior, scrollState.getInternalInteractionSource())).then(new ScrollingLayoutModifier(scrollState, z, z3, overscrollEffect));
                composer.endReplaceableGroup();
                return then;
            }
        });
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final Modifier verticalScroll(Modifier modifier, ScrollState state, boolean z, FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final Modifier horizontalScroll(Modifier modifier, ScrollState state, boolean z, FlingBehavior flingBehavior, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return scroll(modifier, state, z2, flingBehavior, z, false);
    }
}
