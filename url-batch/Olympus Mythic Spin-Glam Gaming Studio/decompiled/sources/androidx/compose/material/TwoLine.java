package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J~\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010\u001eR\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0010\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0011\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0012\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/TwoLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "OverlineBaselineOffset", "OverlineToPrimaryBaselineOffset", "PrimaryBaselineOffsetNoIcon", "PrimaryBaselineOffsetWithIcon", "PrimaryToSecondaryBaselineOffsetNoIcon", "PrimaryToSecondaryBaselineOffsetWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TwoLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconVerticalPadding;
    private static final float OverlineToPrimaryBaselineOffset;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;
    private static final float TrailingRightPadding;
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float MinHeight = Dp.m2507constructorimpl(64);
    private static final float MinHeightWithIcon = Dp.m2507constructorimpl(72);
    private static final float IconMinPaddedWidth = Dp.m2507constructorimpl(40);
    private static final float OverlineBaselineOffset = Dp.m2507constructorimpl(24);
    private static final float PrimaryBaselineOffsetNoIcon = Dp.m2507constructorimpl(28);
    private static final float PrimaryBaselineOffsetWithIcon = Dp.m2507constructorimpl(32);

    static {
        float f = 16;
        IconLeftPadding = Dp.m2507constructorimpl(f);
        IconVerticalPadding = Dp.m2507constructorimpl(f);
        ContentLeftPadding = Dp.m2507constructorimpl(f);
        ContentRightPadding = Dp.m2507constructorimpl(f);
        float f2 = 20;
        OverlineToPrimaryBaselineOffset = Dp.m2507constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.m2507constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.m2507constructorimpl(f2);
        TrailingRightPadding = Dp.m2507constructorimpl(f);
    }

    private TwoLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ListItem(Modifier modifier, final Function2 function2, final Function2 text, final Function2 function22, final Function2 function23, final Function2 function24, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final int i4;
        final float f;
        boolean z;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1340612993);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            i5 = (458752 & i) == 0 ? startRestartGroup.changed(function24) ? 131072 : 65536 : 196608;
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                i3 |= startRestartGroup.changed(this) ? 1048576 : 524288;
            }
            i4 = i3;
            if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                float f2 = function2 != null ? MinHeight : MinHeightWithIcon;
                Modifier m349heightInVpY3zN4$default = SizeKt.m349heightInVpY3zN4$default(modifier4, f2, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier5 = modifier4;
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor = companion2.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(m349heightInVpY3zN4$default);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1912737507);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(-269995367);
                if (function2 != null) {
                    float f3 = IconLeftPadding;
                    Modifier m361sizeInqDBjuR0$default = SizeKt.m361sizeInqDBjuR0$default(companion3, Dp.m2507constructorimpl(IconMinPaddedWidth + f3), f2, 0.0f, 0.0f, 12, null);
                    float f4 = IconVerticalPadding;
                    Modifier m338paddingqDBjuR0$default2 = PaddingKt.m338paddingqDBjuR0$default(m361sizeInqDBjuR0$default, f3, f4, 0.0f, f4, 4, null);
                    Alignment topStart = companion.getTopStart();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0 constructor2 = companion2.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(m338paddingqDBjuR0$default2);
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(1698757508);
                    function2.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                if (function23 == null) {
                    startRestartGroup.startReplaceableGroup(-269994745);
                    f = f2;
                    z = true;
                    ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) new Dp[]{Dp.m2505boximpl(OverlineBaselineOffset), Dp.m2505boximpl(OverlineToPrimaryBaselineOffset)}), m338paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(startRestartGroup, -1675021441, true, new Function2() { // from class: androidx.compose.material.TwoLine$ListItem$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i7) {
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                Function2.this.invoke(composer2, Integer.valueOf((i4 >> 12) & 14));
                                text.invoke(composer2, Integer.valueOf((i4 >> 6) & 14));
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }), startRestartGroup, 384, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    f = f2;
                    z = true;
                    startRestartGroup.startReplaceableGroup(-269994465);
                    ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) new Dp[]{Dp.m2505boximpl(function2 != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon), Dp.m2505boximpl(function2 != null ? PrimaryToSecondaryBaselineOffsetWithIcon : PrimaryToSecondaryBaselineOffsetNoIcon)}), m338paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(startRestartGroup, 993836488, true, new Function2() { // from class: androidx.compose.material.TwoLine$ListItem$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i7) {
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                Function2.this.invoke(composer2, Integer.valueOf((i4 >> 6) & 14));
                                Function2 function25 = function22;
                                Intrinsics.checkNotNull(function25);
                                function25.invoke(composer2, 0);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 384, 0);
                    startRestartGroup.endReplaceableGroup();
                }
                if (function24 != null) {
                    ListItemKt.m889OffsetToBaselineOrCenterKz89ssw(function2 != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1696992176, z, new Function2() { // from class: androidx.compose.material.TwoLine$ListItem$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i7) {
                            float f5;
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                Modifier m349heightInVpY3zN4$default2 = SizeKt.m349heightInVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null);
                                f5 = TwoLine.TrailingRightPadding;
                                Modifier m338paddingqDBjuR0$default3 = PaddingKt.m338paddingqDBjuR0$default(m349heightInVpY3zN4$default2, 0.0f, 0.0f, f5, 0.0f, 11, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2 function25 = function24;
                                int i8 = i4;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0 constructor3 = companion4.getConstructor();
                                Function3 materializerOf3 = LayoutKt.materializerOf(m338paddingqDBjuR0$default3);
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(composer2);
                                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl3, density3, companion4.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(868648534);
                                function25.invoke(composer2, Integer.valueOf((i8 >> 15) & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 384, 2);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TwoLine$ListItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    TwoLine.this.ListItem(modifier3, function2, text, function22, function23, function24, composer2, i | 1, i2);
                }
            });
            return;
        }
        i3 |= i5;
        if ((i2 & 64) == 0) {
        }
        i4 = i3;
        if ((2995931 & i4) == 599186) {
        }
        if (i6 == 0) {
        }
        float f22 = function2 != null ? MinHeight : MinHeightWithIcon;
        Modifier m349heightInVpY3zN4$default2 = SizeKt.m349heightInVpY3zN4$default(modifier4, f22, 0.0f, 2, null);
        startRestartGroup.startReplaceableGroup(693286680);
        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion4.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Modifier modifier52 = modifier4;
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0 constructor3 = companion22.getConstructor();
        Function3 materializerOf3 = LayoutKt.materializerOf(m349heightInVpY3zN4$default2);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl3, rowMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl3, density3, companion22.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion22.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1912737507);
        Modifier.Companion companion32 = Modifier.INSTANCE;
        Modifier m338paddingqDBjuR0$default3 = PaddingKt.m338paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance2, companion32, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
        startRestartGroup.startReplaceableGroup(-269995367);
        if (function2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (function23 == null) {
        }
        if (function24 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
