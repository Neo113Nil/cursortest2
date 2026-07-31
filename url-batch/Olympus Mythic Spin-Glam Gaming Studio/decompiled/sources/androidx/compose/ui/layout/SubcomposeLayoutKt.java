package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePolicy", "", "SubcomposeLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "state", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubcomposeLayoutKt {
    public static final void SubcomposeLayout(final Modifier modifier, final Function2 measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SubcomposeLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i5 = i3 << 3;
            SubcomposeLayout((SubcomposeLayoutState) rememberedValue, modifier, measurePolicy, startRestartGroup, (i5 & 112) | 8 | (i5 & 896), 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                SubcomposeLayoutKt.SubcomposeLayout(Modifier.this, measurePolicy, composer2, i | 1, i2);
            }
        });
    }

    public static final void SubcomposeLayout(final SubcomposeLayoutState state, Modifier modifier, final Function2 measurePolicy, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(-511989831);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier2);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        final Function0 constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
        startRestartGroup.startReplaceableGroup(1886828752);
        if (startRestartGroup.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new Function0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final LayoutNode mo4828invoke() {
                    return Function0.this.mo4828invoke();
                }
            });
        } else {
            startRestartGroup.useNode();
        }
        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl, state, state.getSetRoot());
        Updater.m1153setimpl(m1149constructorimpl, rememberCompositionContext, state.getSetCompositionContext());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.m1153setimpl(m1149constructorimpl, materialize, companion.getSetModifier());
        Updater.m1153setimpl(m1149constructorimpl, measurePolicy, state.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-607848778);
        if (!startRestartGroup.getSkipping()) {
            EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m1977invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1977invoke() {
                    SubcomposeLayoutState.this.forceRecomposeChildren$ui_release();
                }
            }, startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(state, startRestartGroup, 8);
        Unit unit = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(rememberUpdatedState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final State<SubcomposeLayoutState> state2 = rememberUpdatedState;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            ((SubcomposeLayoutState) State.this.getValue()).disposeCurrentNodes$ui_release();
                        }
                    };
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(unit, (Function1) rememberedValue, startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                SubcomposeLayoutKt.SubcomposeLayout(SubcomposeLayoutState.this, modifier2, measurePolicy, composer2, i | 1, i2);
            }
        });
    }
}
