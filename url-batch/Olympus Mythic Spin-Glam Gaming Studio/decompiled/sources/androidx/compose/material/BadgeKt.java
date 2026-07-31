package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001aK\u0010\b\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\"\u0017\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001d\u0010\u001b\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u001d\u0010\u001d\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u001d\u0010\u001f\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "BadgeRadius", "F", "getBadgeRadius", "()F", "BadgeWithContentRadius", "getBadgeWithContentRadius", "Landroidx/compose/ui/unit/TextUnit;", "BadgeContentFontSize", "J", "BadgeWithContentHorizontalPadding", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalOffset", "getBadgeWithContentHorizontalOffset", "BadgeHorizontalOffset", "getBadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BadgeKt {
    private static final float BadgeHorizontalOffset;
    private static final float BadgeRadius;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentRadius = Dp.m2507constructorimpl(8);
    private static final long BadgeContentFontSize = TextUnitKt.getSp(10);
    private static final float BadgeWithContentHorizontalOffset = Dp.m2507constructorimpl(-Dp.m2507constructorimpl(6));

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BadgedBox(final Function3 badge, Modifier modifier, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(859805272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(badge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(content) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo37measure3p2s80s(final MeasureScope Layout, List measurables, long j) {
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        List<Measurable> list = measurables;
                        for (Measurable measurable : list) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                                final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                for (Measurable measurable2 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                        final Placeable mo1944measureBRTryo02 = measurable2.mo1944measureBRTryo0(j);
                                        return Layout.layout(mo1944measureBRTryo02.getWidth(), mo1944measureBRTryo02.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mo1944measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mo1944measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new Function1() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                                float badgeWithContentHorizontalOffset = Placeable.this.getWidth() > Layout.mo265roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo02, 0, 0, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, mo1944measureBRTryo02.getWidth() + Layout.mo265roundToPx0680j_4(badgeWithContentHorizontalOffset), (-Placeable.this.getHeight()) / 2, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 constructor = companion.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(modifier4);
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
                Updater.m1153setimpl(m1149constructorimpl, badgeKt$BadgedBox$2, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(1799938959);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment center = companion3.getCenter();
                int i5 = ((i3 << 3) & 7168) | 54;
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor2 = companion.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(layoutId);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor2);
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                modifier3 = modifier4;
                Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier layoutId2 = LayoutIdKt.layoutId(companion2, "badge");
                int i6 = ((i3 << 9) & 7168) | 6;
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(layoutId2);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor3);
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                badge.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(6 | ((i6 >> 6) & 112)));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            final Modifier modifier5 = modifier3;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BadgeKt$BadgedBox$3
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
                    BadgeKt.BadgedBox(Function3.this, modifier5, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        BadgeKt$BadgedBox$2 badgeKt$BadgedBox$22 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo37measure3p2s80s(final MeasureScope Layout, List measurables, long j) {
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                List<Measurable> list = measurables;
                for (Measurable measurable : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                        for (Measurable measurable2 : list) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                                final Placeable mo1944measureBRTryo02 = measurable2.mo1944measureBRTryo0(j);
                                return Layout.layout(mo1944measureBRTryo02.getWidth(), mo1944measureBRTryo02.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mo1944measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mo1944measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new Function1() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$measure$1
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
                                        float badgeWithContentHorizontalOffset = Placeable.this.getWidth() > Layout.mo265roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
                                        Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo02, 0, 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, mo1944measureBRTryo02.getWidth() + Layout.mo265roundToPx0680j_4(badgeWithContentHorizontalOffset), (-Placeable.this.getHeight()) / 2, 0.0f, 4, null);
                                    }
                                });
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0 constructor4 = companion4.getConstructor();
        Function3 materializerOf4 = LayoutKt.materializerOf(modifier4);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl4 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl4, badgeKt$BadgedBox$22, companion4.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl4, density4, companion4.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf4.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(1799938959);
        Modifier.Companion companion22 = Modifier.INSTANCE;
        Modifier layoutId3 = LayoutIdKt.layoutId(companion22, "anchor");
        Alignment.Companion companion32 = Alignment.INSTANCE;
        Alignment center2 = companion32.getCenter();
        int i52 = ((i3 << 3) & 7168) | 54;
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor22 = companion4.getConstructor();
        Function3 materializerOf22 = LayoutKt.materializerOf(layoutId3);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        modifier3 = modifier4;
        Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22, density22, companion4.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion4.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion4.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        content.invoke(boxScopeInstance2, startRestartGroup, Integer.valueOf(((i52 >> 6) & 112) | 6));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier layoutId22 = LayoutIdKt.layoutId(companion22, "badge");
        int i62 = ((i3 << 9) & 7168) | 6;
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density32 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection32 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration32 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor32 = companion4.getConstructor();
        Function3 materializerOf32 = LayoutKt.materializerOf(layoutId22);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl32 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl32, rememberBoxMeasurePolicy22, companion4.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl32, density32, companion4.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl32, layoutDirection32, companion4.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl32, viewConfiguration32, companion4.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf32.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        badge.invoke(boxScopeInstance2, startRestartGroup, Integer.valueOf(6 | ((i62 >> 6) & 112)));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* renamed from: Badge-eopBjH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m733BadgeeopBjH0(Modifier modifier, long j, long j2, Function3 function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        final int i3;
        long j3;
        long j4;
        final Function3 function32;
        Modifier modifier3;
        final long j5;
        final long j6;
        final Function3 function33;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1133484502);
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
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j4 = j2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j4 = j2;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changed(function32) ? 2048 : 1024;
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m790getError0d7_KjU();
                        i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i7 != 0) {
                        function32 = null;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                startRestartGroup.endDefaults();
                float f = function32 == null ? BadgeWithContentRadius : BadgeRadius;
                RoundedCornerShape m510RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(f);
                float f2 = f * 2;
                Modifier m336paddingVpY3zN4$default = PaddingKt.m336paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m345defaultMinSizeVpY3zN4(modifier3, Dp.m2507constructorimpl(f2), Dp.m2507constructorimpl(f2)), j3, m510RoundedCornerShape0680j_4), m510RoundedCornerShape0680j_4), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 constructor = companion.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(m336paddingVpY3zN4$default);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                Modifier modifier5 = modifier3;
                Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1024875974);
                if (function32 != null) {
                    final int i8 = 6;
                    CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(j4))}, ComposableLambdaKt.composableLambda(startRestartGroup, 1784526485, true, new Function2() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                        public final void invoke(@Nullable Composer composer2, int i9) {
                            long j7;
                            TextStyle m2257copyHL5avdY;
                            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton();
                                j7 = BadgeKt.BadgeContentFontSize;
                                m2257copyHL5avdY = button.m2257copyHL5avdY((r42 & 1) != 0 ? button.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? button.spanStyle.getFontSize() : j7, (r42 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? button.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? button.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? button.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? button.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? button.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? button.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? button.paragraphStyle.getTextAlign() : null, (r42 & 32768) != 0 ? button.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? button.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? button.paragraphStyle.getTextIndent() : null);
                                final Function3 function34 = Function3.this;
                                final RowScope rowScope = rowScopeInstance;
                                final int i10 = i8;
                                final int i11 = i3;
                                TextKt.ProvideTextStyle(m2257copyHL5avdY, ComposableLambdaKt.composableLambda(composer2, 915155142, true, new Function2() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
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
                                    public final void invoke(@Nullable Composer composer3, int i12) {
                                        if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                        } else {
                                            Function3.this.invoke(rowScope, composer3, Integer.valueOf((i10 & 14) | ((i11 >> 6) & 112)));
                                        }
                                    }
                                }), composer2, 48);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 56);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                j5 = j3;
                j6 = j4;
                function33 = function32;
                modifier4 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j5 = j3;
                j6 = j4;
                function33 = function32;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BadgeKt$Badge$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i9) {
                    BadgeKt.m733BadgeeopBjH0(Modifier.this, j5, j6, function33, composer2, i | 1, i2);
                }
            });
            return;
        }
        function32 = function3;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (function32 == null) {
        }
        RoundedCornerShape m510RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m510RoundedCornerShape0680j_4(f);
        float f22 = f * 2;
        Modifier m336paddingVpY3zN4$default2 = PaddingKt.m336paddingVpY3zN4$default(ClipKt.clip(BackgroundKt.m157backgroundbw27NRU(SizeKt.m345defaultMinSizeVpY3zN4(modifier3, Dp.m2507constructorimpl(f22), Dp.m2507constructorimpl(f22)), j3, m510RoundedCornerShape0680j_42), m510RoundedCornerShape0680j_42), BadgeWithContentHorizontalPadding, 0.0f, 2, null);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0 constructor2 = companion2.getConstructor();
        Function3 materializerOf2 = LayoutKt.materializerOf(m336paddingVpY3zN4$default2);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
        Modifier modifier52 = modifier3;
        Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1024875974);
        if (function32 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        j5 = j3;
        j6 = j4;
        function33 = function32;
        modifier4 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 4;
        BadgeRadius = Dp.m2507constructorimpl(f);
        BadgeWithContentHorizontalPadding = Dp.m2507constructorimpl(f);
        BadgeHorizontalOffset = Dp.m2507constructorimpl(-Dp.m2507constructorimpl(f));
    }

    public static final float getBadgeRadius() {
        return BadgeRadius;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeHorizontalOffset() {
        return BadgeHorizontalOffset;
    }
}
