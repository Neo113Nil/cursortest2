package androidx.compose.foundation.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\u0014\u001a\u00020\u0013*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001a\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001e\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d\"\u001a\u0010#\u001a\u0004\u0018\u00010 *\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010&\u001a\u00020\u0002*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/Alignment;", "alignment", "", "propagateMinConstraints", "Landroidx/compose/ui/layout/MeasurePolicy;", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "boxMeasurePolicy", "(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "boxWidth", "boxHeight", "", "placeInBox", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/unit/LayoutDirection;IILandroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Box", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/BoxChildData;", "getBoxChildData", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildData;", "boxChildData", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BoxKt {
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo37measure3p2s80s(MeasureScope MeasurePolicy, List list, long j) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasureScope.layout$default(MeasurePolicy, Constraints.m2489getMinWidthimpl(j), Constraints.m2488getMinHeightimpl(j), null, new Function1() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1$measure$1
                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
    };

    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z, Composer composer, int i) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (Intrinsics.areEqual(alignment, Alignment.INSTANCE.getTopStart()) && !z) {
            measurePolicy = DefaultBoxMeasurePolicy;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(alignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = boxMeasurePolicy(alignment, z);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final MeasurePolicy boxMeasurePolicy(final Alignment alignment, final boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo37measure3p2s80s(final MeasureScope MeasurePolicy, final List measurables, long j) {
                boolean matchesParentSize;
                boolean matchesParentSize2;
                boolean matchesParentSize3;
                int m2489getMinWidthimpl;
                final Placeable mo1944measureBRTryo0;
                int i;
                Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.layout$default(MeasurePolicy, Constraints.m2489getMinWidthimpl(j), Constraints.m2488getMinHeightimpl(j), null, new Function1() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$1
                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                long m2478copyZbe2FdA$default = z ? j : Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                if (measurables.size() == 1) {
                    final Measurable measurable = (Measurable) measurables.get(0);
                    matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
                    if (!matchesParentSize3) {
                        Placeable mo1944measureBRTryo02 = measurable.mo1944measureBRTryo0(m2478copyZbe2FdA$default);
                        int max = Math.max(Constraints.m2489getMinWidthimpl(j), mo1944measureBRTryo02.getWidth());
                        i = Math.max(Constraints.m2488getMinHeightimpl(j), mo1944measureBRTryo02.getHeight());
                        mo1944measureBRTryo0 = mo1944measureBRTryo02;
                        m2489getMinWidthimpl = max;
                    } else {
                        m2489getMinWidthimpl = Constraints.m2489getMinWidthimpl(j);
                        int m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(j);
                        mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(Constraints.m2489getMinWidthimpl(j), Constraints.m2488getMinHeightimpl(j)));
                        i = m2488getMinHeightimpl;
                    }
                    final Alignment alignment2 = alignment;
                    final int i2 = m2489getMinWidthimpl;
                    final int i3 = i;
                    return MeasureScope.layout$default(MeasurePolicy, m2489getMinWidthimpl, i, null, new Function1() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((Placeable.PlacementScope) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            BoxKt.placeInBox(layout, Placeable.this, measurable, MeasurePolicy.getLayoutDirection(), i2, i3, alignment2);
                        }
                    }, 4, null);
                }
                final Placeable[] placeableArr = new Placeable[measurables.size()];
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = Constraints.m2489getMinWidthimpl(j);
                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = Constraints.m2488getMinHeightimpl(j);
                int size = measurables.size();
                boolean z2 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    Measurable measurable2 = (Measurable) measurables.get(i4);
                    matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
                    if (matchesParentSize2) {
                        z2 = true;
                    } else {
                        Placeable mo1944measureBRTryo03 = measurable2.mo1944measureBRTryo0(m2478copyZbe2FdA$default);
                        placeableArr[i4] = mo1944measureBRTryo03;
                        ref$IntRef.element = Math.max(ref$IntRef.element, mo1944measureBRTryo03.getWidth());
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, mo1944measureBRTryo03.getHeight());
                    }
                }
                if (z2) {
                    int i5 = ref$IntRef.element;
                    int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
                    int i7 = ref$IntRef2.element;
                    long Constraints = ConstraintsKt.Constraints(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
                    int size2 = measurables.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Measurable measurable3 = (Measurable) measurables.get(i8);
                        matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                        if (matchesParentSize) {
                            placeableArr[i8] = measurable3.mo1944measureBRTryo0(Constraints);
                        }
                    }
                }
                int i9 = ref$IntRef.element;
                int i10 = ref$IntRef2.element;
                final Alignment alignment3 = alignment;
                return MeasureScope.layout$default(MeasurePolicy, i9, i10, null, new Function1() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1$measure$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        Placeable[] placeableArr2 = placeableArr;
                        List<Measurable> list = measurables;
                        MeasureScope measureScope = MeasurePolicy;
                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                        Ref$IntRef ref$IntRef4 = ref$IntRef2;
                        Alignment alignment4 = alignment3;
                        int length = placeableArr2.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 < length) {
                            Placeable placeable = placeableArr2[i12];
                            int i13 = i11 + 1;
                            if (placeable != null) {
                                BoxKt.placeInBox(layout, placeable, list.get(i11), measureScope.getLayoutDirection(), ref$IntRef3.element, ref$IntRef4.element, alignment4);
                                i12++;
                                i11 = i13;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                            }
                        }
                    }
                }, 4, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        BoxChildData boxChildData = getBoxChildData(measurable);
        Placeable.PlacementScope.m1961place70tqf50$default(placementScope, placeable, ((boxChildData == null || (alignment2 = boxChildData.getAlignment()) == null) ? alignment : alignment2).mo1228alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i, i2), layoutDirection), 0.0f, 2, null);
    }

    public static final void Box(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(modifier);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1021196736);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.layout.BoxKt$Box$3
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
                BoxKt.Box(Modifier.this, composer2, i | 1);
            }
        });
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildData) {
            return (BoxChildData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null) {
            return boxChildData.getMatchParentSize();
        }
        return false;
    }
}
