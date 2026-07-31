package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import io.appmetrica.analytics.impl.M2;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material/DismissDirection;", "directions", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", M2.g, "dismissContent", "SwipeToDismiss", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/DismissValue;", "from", "to", "getDismissDirection", "(Landroidx/compose/material/DismissValue;Landroidx/compose/material/DismissValue;)Landroidx/compose/material/DismissDirection;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SwipeToDismissKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final DismissState state, Modifier modifier, Set set, Function1 function1, final Function3 background, final Function3 dismissContent, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1 function12;
        Set set2;
        int i6;
        Modifier modifier3;
        Set set3;
        Function1 function13;
        Composer composer2;
        final Modifier modifier4;
        final Set set4;
        final Function1 function14;
        int i7;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer startRestartGroup = composer.startRestartGroup(634380143);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(background) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    i7 = (458752 & i) == 0 ? startRestartGroup.changed(dismissContent) ? 131072 : 65536 : 196608;
                    if (i4 == 4 || (374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                set2 = SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd});
                                i3 &= -897;
                            } else {
                                set2 = set;
                            }
                            if (i5 == 0) {
                                i6 = i3;
                                modifier3 = modifier5;
                                set3 = set2;
                                function13 = new Function1() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1
                                    @Override // kotlin.jvm.functions.Function1
                                    @NotNull
                                    public final FractionalThreshold invoke(@NotNull DismissDirection it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return new FractionalThreshold(0.5f);
                                    }
                                };
                                startRestartGroup.endDefaults();
                                final Set set5 = set3;
                                final Function1 function15 = function13;
                                final int i9 = i6;
                                composer2 = startRestartGroup;
                                BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new Function3() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i10) {
                                        int i11;
                                        Modifier m998swipeablepPrIpRY;
                                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                        if ((i10 & 14) == 0) {
                                            i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 91) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        float m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints());
                                        boolean z = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                        Float valueOf = Float.valueOf(0.0f);
                                        DismissValue dismissValue = DismissValue.Default;
                                        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(valueOf, dismissValue));
                                        Set<DismissDirection> set6 = set5;
                                        DismissDirection dismissDirection = DismissDirection.StartToEnd;
                                        if (set6.contains(dismissDirection)) {
                                            Pair pair = TuplesKt.to(Float.valueOf(m2487getMaxWidthimpl), DismissValue.DismissedToEnd);
                                            mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                        }
                                        Set<DismissDirection> set7 = set5;
                                        DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                                        if (set7.contains(dismissDirection2)) {
                                            Pair pair2 = TuplesKt.to(Float.valueOf(-m2487getMaxWidthimpl), DismissValue.DismissedToStart);
                                            mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                        }
                                        final Function1 function16 = function15;
                                        composer3.startReplaceableGroup(1157296644);
                                        boolean changed = composer3.changed(function16);
                                        Object rememberedValue = composer3.rememberedValue();
                                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function2() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @NotNull
                                                public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                                    DismissDirection dismissDirection3;
                                                    Intrinsics.checkNotNullParameter(from, "from");
                                                    Intrinsics.checkNotNullParameter(to, "to");
                                                    Function1 function17 = Function1.this;
                                                    dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                                    Intrinsics.checkNotNull(dismissDirection3);
                                                    return (ThresholdConfig) function17.invoke(dismissDirection3);
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        Function2 function2 = (Function2) rememberedValue;
                                        float f = set5.contains(dismissDirection2) ? 10.0f : 20.0f;
                                        float f2 = set5.contains(dismissDirection) ? 10.0f : 20.0f;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, state, mutableMapOf, Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : function2, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(m2487getMaxWidthimpl, f, f2), (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                        Function3 function3 = background;
                                        int i12 = i9;
                                        final DismissState dismissState = state;
                                        Function3 function32 = dismissContent;
                                        composer3.startReplaceableGroup(733328855);
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 constructor = companion3.getConstructor();
                                        Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                                        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(981834387);
                                        Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                                        int i13 = (i12 >> 3) & 7168;
                                        composer3.startReplaceableGroup(693286680);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        Function0 constructor2 = companion3.getConstructor();
                                        Function3 materializerOf2 = LayoutKt.materializerOf(matchParentSize);
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                                        Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        function3.invoke(rowScopeInstance, composer3, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.startReplaceableGroup(1157296644);
                                        boolean changed2 = composer3.changed(dismissState);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new Function1() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    return IntOffset.m2545boximpl(m996invokeBjo55l4((Density) obj));
                                                }

                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                public final long m996invokeBjo55l4(@NotNull Density offset) {
                                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                    return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DismissState.this.getOffset().getValue()).floatValue()), 0);
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier offset = OffsetKt.offset(companion, (Function1) rememberedValue2);
                                        int i14 = (i12 >> 6) & 7168;
                                        composer3.startReplaceableGroup(693286680);
                                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                        LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        Function0 constructor3 = companion3.getConstructor();
                                        Function3 materializerOf3 = LayoutKt.materializerOf(offset);
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                                        Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                        Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                        Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                        Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-678309503);
                                        function32.invoke(rowScopeInstance, composer3, Integer.valueOf(((i14 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    }
                                }), startRestartGroup, ((i6 >> 3) & 14) | 3072, 6);
                                modifier4 = modifier3;
                                set4 = set3;
                                function14 = function13;
                            } else {
                                i6 = i3;
                                modifier3 = modifier5;
                                set3 = set2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            set3 = set;
                            i6 = i3;
                            modifier3 = modifier2;
                        }
                        function13 = function12;
                        startRestartGroup.endDefaults();
                        final Set<? extends DismissDirection> set52 = set3;
                        final Function1 function152 = function13;
                        final int i92 = i6;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new Function3() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer3, int i10) {
                                int i11;
                                Modifier m998swipeablepPrIpRY;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                float m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints());
                                boolean z = composer3.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                Float valueOf = Float.valueOf(0.0f);
                                DismissValue dismissValue = DismissValue.Default;
                                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(valueOf, dismissValue));
                                Set<DismissDirection> set6 = set52;
                                DismissDirection dismissDirection = DismissDirection.StartToEnd;
                                if (set6.contains(dismissDirection)) {
                                    Pair pair = TuplesKt.to(Float.valueOf(m2487getMaxWidthimpl), DismissValue.DismissedToEnd);
                                    mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                }
                                Set<DismissDirection> set7 = set52;
                                DismissDirection dismissDirection2 = DismissDirection.EndToStart;
                                if (set7.contains(dismissDirection2)) {
                                    Pair pair2 = TuplesKt.to(Float.valueOf(-m2487getMaxWidthimpl), DismissValue.DismissedToStart);
                                    mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                }
                                final Function1 function16 = function152;
                                composer3.startReplaceableGroup(1157296644);
                                boolean changed = composer3.changed(function16);
                                Object rememberedValue = composer3.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function2() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @NotNull
                                        public final ThresholdConfig invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
                                            DismissDirection dismissDirection3;
                                            Intrinsics.checkNotNullParameter(from, "from");
                                            Intrinsics.checkNotNullParameter(to, "to");
                                            Function1 function17 = Function1.this;
                                            dismissDirection3 = SwipeToDismissKt.getDismissDirection(from, to);
                                            Intrinsics.checkNotNull(dismissDirection3);
                                            return (ThresholdConfig) function17.invoke(dismissDirection3);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                Function2 function2 = (Function2) rememberedValue;
                                float f = set52.contains(dismissDirection2) ? 10.0f : 20.0f;
                                float f2 = set52.contains(dismissDirection) ? 10.0f : 20.0f;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion, state, mutableMapOf, Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == dismissValue, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : function2, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(m2487getMaxWidthimpl, f, f2), (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                Function3 function3 = background;
                                int i12 = i92;
                                final DismissState dismissState = state;
                                Function3 function32 = dismissContent;
                                composer3.startReplaceableGroup(733328855);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion3.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(981834387);
                                Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                                int i13 = (i12 >> 3) & 7168;
                                composer3.startReplaceableGroup(693286680);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density2 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                Function0 constructor2 = companion3.getConstructor();
                                Function3 materializerOf2 = LayoutKt.materializerOf(matchParentSize);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl2, density2, companion3.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                function3.invoke(rowScopeInstance, composer3, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(1157296644);
                                boolean changed2 = composer3.changed(dismissState);
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            return IntOffset.m2545boximpl(m996invokeBjo55l4((Density) obj));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m996invokeBjo55l4(@NotNull Density offset) {
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) DismissState.this.getOffset().getValue()).floatValue()), 0);
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                Modifier offset = OffsetKt.offset(companion, (Function1) rememberedValue2);
                                int i14 = (i12 >> 6) & 7168;
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                Function0 constructor3 = companion3.getConstructor();
                                Function3 materializerOf3 = LayoutKt.materializerOf(offset);
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer3);
                                Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl3, density3, companion3.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-678309503);
                                function32.invoke(rowScopeInstance, composer3, Integer.valueOf(((i14 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                            }
                        }), startRestartGroup, ((i6 >> 3) & 14) | 3072, 6);
                        modifier4 = modifier3;
                        set4 = set3;
                        function14 = function13;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function14 = function12;
                        composer2 = startRestartGroup;
                        set4 = set;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            SwipeToDismissKt.SwipeToDismiss(DismissState.this, modifier4, set4, function14, background, dismissContent, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i7;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
            }
            function12 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        DismissValue dismissValue3 = DismissValue.Default;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}
