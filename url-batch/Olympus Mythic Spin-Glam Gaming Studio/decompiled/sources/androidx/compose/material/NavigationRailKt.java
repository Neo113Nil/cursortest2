package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.chromium.net.NetError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001as\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\b\n2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0091\u0001\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aF\u0010$\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a?\u0010&\u001a\u00020\t2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\n2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0002\b\n2\u0006\u0010%\u001a\u00020!H\u0003¢\u0006\u0004\b&\u0010'\u001a)\u00100\u001a\u00020-*\u00020(2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a9\u00104\u001a\u00020-*\u00020(2\u0006\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010%\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020!058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u0017\u00108\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b8\u00109\"\u0017\u0010:\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b:\u00109\"\u0017\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b;\u00109\"\u0017\u0010<\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b<\u00109\"\u0017\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b=\u00109\"\u0017\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u00109\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", POBCTAOverlayData.KEY_CTA_HEADER, "content", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "activeColor", "inactiveColor", "", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "NavigationRailTransition", "iconPositionAnimationProgress", "NavigationRailItemBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailItemSize", "F", "NavigationRailItemCompactSize", "NavigationRailPadding", "HeaderPadding", "ItemLabelBaselineBottomOffset", "ItemIconTopOffset", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    private static final TweenSpec NavigationRailAnimationSpec = new TweenSpec(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m2507constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m2507constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m2507constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m2507constructorimpl(14);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008a  */
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m910NavigationRailHsRjFd4(Modifier modifier, long j, long j2, float f, Function3 function3, final Function3 content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        Function3 function32;
        final Modifier modifier3;
        final int i5;
        final Function3 function33;
        float f3;
        final float f4;
        final Function3 function34;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1790971523);
        int i9 = i2 & 1;
        if (i9 != 0) {
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
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                function32 = function3;
                i3 |= startRestartGroup.changed(function32) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    i6 = (i & 458752) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU();
                                i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = NavigationRailDefaults.INSTANCE.m909getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                i5 = i3;
                                function33 = null;
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                int i11 = i5 << 3;
                                SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j4, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        float f5;
                                        float f6;
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                                            f5 = NavigationRailKt.NavigationRailPadding;
                                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m336paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            Function3 function35 = Function3.this;
                                            int i13 = i5;
                                            Function3 function36 = content;
                                            composer2.startReplaceableGroup(-483455358);
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0 constructor = companion2.getConstructor();
                                            Function3 materializerOf = LayoutKt.materializerOf(selectableGroup);
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-1163856341);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(-497173955);
                                            composer2.startReplaceableGroup(65525382);
                                            if (function35 != null) {
                                                function35.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                                                f6 = NavigationRailKt.HeaderPadding;
                                                SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion, f6), composer2, 6);
                                            }
                                            composer2.endReplaceableGroup();
                                            function36.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
                                }), startRestartGroup, (i5 & 14) | 1572864 | (i11 & 896) | (i11 & 7168) | ((i5 << 6) & 458752), 18);
                                long j7 = j4;
                                f4 = f3;
                                function34 = function33;
                                j5 = j3;
                                j6 = j7;
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
                        i5 = i3;
                        f3 = f2;
                        function33 = function32;
                        startRestartGroup.endDefaults();
                        int i112 = i5 << 3;
                        SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j4, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                            public final void invoke(@Nullable Composer composer2, int i12) {
                                float f5;
                                float f6;
                                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                                    f5 = NavigationRailKt.NavigationRailPadding;
                                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m336paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    Function3 function35 = Function3.this;
                                    int i13 = i5;
                                    Function3 function36 = content;
                                    composer2.startReplaceableGroup(-483455358);
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion2.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(selectableGroup);
                                    if (composer2.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-1163856341);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-497173955);
                                    composer2.startReplaceableGroup(65525382);
                                    if (function35 != null) {
                                        function35.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                                        f6 = NavigationRailKt.HeaderPadding;
                                        SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion, f6), composer2, 6);
                                    }
                                    composer2.endReplaceableGroup();
                                    function36.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
                        }), startRestartGroup, (i5 & 14) | 1572864 | (i112 & 896) | (i112 & 7168) | ((i5 << 6) & 458752), 18);
                        long j72 = j4;
                        f4 = f3;
                        function34 = function33;
                        j5 = j3;
                        j6 = j72;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f2;
                        function34 = function32;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            NavigationRailKt.m910NavigationRailHsRjFd4(Modifier.this, j5, j6, f4, function34, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                i5 = i3;
                f3 = f2;
                function33 = function32;
                startRestartGroup.endDefaults();
                int i1122 = i5 << 3;
                SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j4, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                    public final void invoke(@Nullable Composer composer2, int i12) {
                        float f5;
                        float f6;
                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                            f5 = NavigationRailKt.NavigationRailPadding;
                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m336paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Function3 function35 = Function3.this;
                            int i13 = i5;
                            Function3 function36 = content;
                            composer2.startReplaceableGroup(-483455358);
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion2.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(selectableGroup);
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                            Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-1163856341);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-497173955);
                            composer2.startReplaceableGroup(65525382);
                            if (function35 != null) {
                                function35.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                                f6 = NavigationRailKt.HeaderPadding;
                                SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion, f6), composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            function36.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
                }), startRestartGroup, (i5 & 14) | 1572864 | (i1122 & 896) | (i1122 & 7168) | ((i5 << 6) & 458752), 18);
                long j722 = j4;
                f4 = f3;
                function34 = function33;
                j5 = j3;
                j6 = j722;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            i5 = i3;
            f3 = f2;
            function33 = function32;
            startRestartGroup.endDefaults();
            int i11222 = i5 << 3;
            SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j4, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                public final void invoke(@Nullable Composer composer2, int i12) {
                    float f5;
                    float f6;
                    if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                        f5 = NavigationRailKt.NavigationRailPadding;
                        Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m336paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Function3 function35 = Function3.this;
                        int i13 = i5;
                        Function3 function36 = content;
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion2.getConstructor();
                        Function3 materializerOf = LayoutKt.materializerOf(selectableGroup);
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-497173955);
                        composer2.startReplaceableGroup(65525382);
                        if (function35 != null) {
                            function35.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                            f6 = NavigationRailKt.HeaderPadding;
                            SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion, f6), composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        function36.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
            }), startRestartGroup, (i5 & 14) | 1572864 | (i11222 & 896) | (i11222 & 7168) | ((i5 << 6) & 458752), 18);
            long j7222 = j4;
            f4 = f3;
            function34 = function33;
            j5 = j3;
            j6 = j7222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        i5 = i3;
        f3 = f2;
        function33 = function32;
        startRestartGroup.endDefaults();
        int i112222 = i5 << 3;
        SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j4, null, f3, ComposableLambdaKt.composableLambda(startRestartGroup, -1571506489, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
            public final void invoke(@Nullable Composer composer2, int i12) {
                float f5;
                float f6;
                if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                    f5 = NavigationRailKt.NavigationRailPadding;
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m336paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f5, 1, null));
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Function3 function35 = Function3.this;
                    int i13 = i5;
                    Function3 function36 = content;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion2.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(selectableGroup);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-497173955);
                    composer2.startReplaceableGroup(65525382);
                    if (function35 != null) {
                        function35.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 9) & 112) | 6));
                        f6 = NavigationRailKt.HeaderPadding;
                        SpacerKt.Spacer(SizeKt.m347height3ABfNKs(companion, f6), composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    function36.invoke(columnScopeInstance, composer2, Integer.valueOf(((i13 >> 12) & 112) | 6));
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
        }), startRestartGroup, (i5 & 14) | 1572864 | (i112222 & 896) | (i112222 & 7168) | ((i5 << 6) & 458752), 18);
        long j72222 = j4;
        f4 = f3;
        function34 = function33;
        j5 = j3;
        j6 = j72222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m911NavigationRailItem0S3VyRs(final boolean z, final Function0 onClick, final Function2 icon, Modifier modifier, boolean z2, Function2 function2, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        final boolean z5;
        int i7;
        final MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        final Function2 function22;
        long j3;
        long m1445copywmQWz5c$default;
        final Function2 function23;
        final boolean z6;
        final boolean z7;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1813548445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((2 & i2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = 16 & i2;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                i5 = 32 & i2;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(function2) ? 131072 : 65536;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                    }
                }
                i7 = 128 & i2;
                if (i7 != 0) {
                    i3 |= 12582912;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                    }
                }
                if ((i & 234881024) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changed(j)) {
                        i8 = 67108864;
                        i3 |= i8;
                    }
                    i8 = 33554432;
                    i3 |= i8;
                }
                if ((1879048192 & i) == 0) {
                    i3 |= ((i2 & 512) == 0 && startRestartGroup.changed(j2)) ? 536870912 : 268435456;
                }
                if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier2 = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if (i4 != 0) {
                            z4 = true;
                        }
                        function22 = i5 != 0 ? null : function2;
                        if (i6 != 0) {
                            z5 = true;
                        }
                        if (i7 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                        }
                        if ((256 & i2) != 0) {
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m796getPrimary0d7_KjU();
                            i3 &= -234881025;
                        } else {
                            j3 = j;
                        }
                        if ((i2 & 512) != 0) {
                            m1445copywmQWz5c$default = Color.m1445copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -1879048193;
                            startRestartGroup.endDefaults();
                            final ComposableLambda composableLambda = function22 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -180398615, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
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
                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    TextStyle m2257copyHL5avdY;
                                    if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                    } else {
                                        m2257copyHL5avdY = r3.m2257copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r3.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                                        TextKt.ProvideTextStyle(m2257copyHL5avdY, Function2.this, composer2, (i3 >> 12) & 112);
                                    }
                                }
                            }) : null;
                            Modifier m357size3ABfNKs = SizeKt.m357size3ABfNKs(SelectableKt.m498selectableO2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            Function2 function24 = function22;
                            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Modifier modifier4 = modifier2;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m357size3ABfNKs);
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
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-172871267);
                            int i10 = i3 >> 24;
                            m912NavigationRailTransitionKlgxPg(j3, m1445copywmQWz5c$default, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new Function3() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(float f, @Nullable Composer composer2, int i11) {
                                    if ((i11 & 14) == 0) {
                                        i11 |= composer2.changed(f) ? 4 : 2;
                                    }
                                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                        if (z5) {
                                            f = 1.0f;
                                        }
                                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f, composer2, (i3 >> 6) & 14);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i10 & 112) | (i10 & 14) | 3072 | ((i3 << 6) & 896));
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            function23 = function24;
                            z6 = z5;
                            z7 = z4;
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((256 & i2) != 0) {
                            i3 &= -234881025;
                        }
                        if ((i2 & 512) != 0) {
                            i3 &= -1879048193;
                        }
                        modifier2 = modifier;
                        function22 = function2;
                        j3 = j;
                    }
                    m1445copywmQWz5c$default = j2;
                    startRestartGroup.endDefaults();
                    if (function22 != null) {
                    }
                    Modifier m357size3ABfNKs2 = SizeKt.m357size3ABfNKs(SelectableKt.m498selectableO2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Function2 function242 = function22;
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier42 = modifier2;
                    Function0 constructor2 = companion2.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(m357size3ABfNKs2);
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-172871267);
                    int i102 = i3 >> 24;
                    m912NavigationRailTransitionKlgxPg(j3, m1445copywmQWz5c$default, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new Function3() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(float f, @Nullable Composer composer2, int i11) {
                            if ((i11 & 14) == 0) {
                                i11 |= composer2.changed(f) ? 4 : 2;
                            }
                            if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                if (z5) {
                                    f = 1.0f;
                                }
                                NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f, composer2, (i3 >> 6) & 14);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i102 & 112) | (i102 & 14) | 3072 | ((i3 << 6) & 896));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    function23 = function242;
                    z6 = z5;
                    z7 = z4;
                    modifier3 = modifier42;
                    mutableInteractionSource2 = mutableInteractionSource2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    function23 = function2;
                    j3 = j;
                    m1445copywmQWz5c$default = j2;
                    z6 = z5;
                    z7 = z4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final long j4 = j3;
                final long j5 = m1445copywmQWz5c$default;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        NavigationRailKt.m911NavigationRailItem0S3VyRs(z, onClick, icon, modifier3, z7, function23, z6, mutableInteractionSource2, j4, j5, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z4 = z2;
            i5 = 32 & i2;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = 128 & i2;
            if (i7 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((1879048192 & i) == 0) {
            }
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((256 & i2) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            m1445copywmQWz5c$default = j2;
            startRestartGroup.endDefaults();
            if (function22 != null) {
            }
            Modifier m357size3ABfNKs22 = SizeKt.m357size3ABfNKs(SelectableKt.m498selectableO2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
            Alignment center22 = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function2 function2422 = function22;
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Modifier modifier422 = modifier2;
            Function0 constructor22 = companion22.getConstructor();
            Function3 materializerOf22 = LayoutKt.materializerOf(m357size3ABfNKs22);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-172871267);
            int i1022 = i3 >> 24;
            m912NavigationRailTransitionKlgxPg(j3, m1445copywmQWz5c$default, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new Function3() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget
                @Composable
                public final void invoke(float f, @Nullable Composer composer2, int i11) {
                    if ((i11 & 14) == 0) {
                        i11 |= composer2.changed(f) ? 4 : 2;
                    }
                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                        if (z5) {
                            f = 1.0f;
                        }
                        NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f, composer2, (i3 >> 6) & 14);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i1022 & 112) | (i1022 & 14) | 3072 | ((i3 << 6) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            function23 = function2422;
            z6 = z5;
            z7 = z4;
            modifier3 = modifier422;
            mutableInteractionSource2 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = 16 & i2;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = 32 & i2;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = 128 & i2;
        if (i7 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((1879048192 & i) == 0) {
        }
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((256 & i2) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        m1445copywmQWz5c$default = j2;
        startRestartGroup.endDefaults();
        if (function22 != null) {
        }
        Modifier m357size3ABfNKs222 = SizeKt.m357size3ABfNKs(SelectableKt.m498selectableO2vRcR0(modifier2, z, mutableInteractionSource2, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i3 >> 18) & 896) | 6, 2), z4, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), function22 != null ? NavigationRailItemCompactSize : NavigationRailItemSize);
        Alignment center222 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Function2 function24222 = function22;
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Modifier modifier4222 = modifier2;
        Function0 constructor222 = companion222.getConstructor();
        Function3 materializerOf222 = LayoutKt.materializerOf(m357size3ABfNKs222);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl222, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-172871267);
        int i10222 = i3 >> 24;
        m912NavigationRailTransitionKlgxPg(j3, m1445copywmQWz5c$default, z, ComposableLambdaKt.composableLambda(startRestartGroup, 670576792, true, new Function3() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke(((Number) obj).floatValue(), (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget
            @Composable
            public final void invoke(float f, @Nullable Composer composer2, int i11) {
                if ((i11 & 14) == 0) {
                    i11 |= composer2.changed(f) ? 4 : 2;
                }
                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                    if (z5) {
                        f = 1.0f;
                    }
                    NavigationRailKt.NavigationRailItemBaselineLayout(icon, composableLambda, f, composer2, (i3 >> 6) & 14);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i10222 & 112) | (i10222 & 14) | 3072 | ((i3 << 6) & 896));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        function23 = function24222;
        z6 = z5;
        z7 = z4;
        modifier3 = modifier4222;
        mutableInteractionSource2 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    public static final void m912NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3 function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-207161906);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        final int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m1469lerpjxsXWHM = ColorKt.m1469lerpjxsXWHM(j2, j, m913NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(Color.m1445copywmQWz5c$default(m1469lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m1469lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1688205042, true, new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                @Composable
                public final void invoke(@Nullable Composer composer2, int i4) {
                    float m913NavigationRailTransition_Klgx_Pg$lambda3;
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function3 function32 = Function3.this;
                    m913NavigationRailTransition_Klgx_Pg$lambda3 = NavigationRailKt.m913NavigationRailTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(Float.valueOf(m913NavigationRailTransition_Klgx_Pg$lambda3), composer2, Integer.valueOf((i3 >> 6) & 112));
                }
            }), startRestartGroup, 56);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                NavigationRailKt.m912NavigationRailTransitionKlgxPg(j, j2, z, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(final Function2 function2, final Function2 function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1903861684);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Placeable placeable;
                    MeasureResult m919placeLabelAndIconDIyivk0;
                    MeasureResult m918placeIcon3p2s80s;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                            Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
                            if (Function2.this != null) {
                                for (Measurable measurable2 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                        placeable = measurable2.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable = null;
                            if (Function2.this == null) {
                                m918placeIcon3p2s80s = NavigationRailKt.m918placeIcon3p2s80s(Layout, mo1944measureBRTryo0, j);
                                return m918placeIcon3p2s80s;
                            }
                            Intrinsics.checkNotNull(placeable);
                            m919placeLabelAndIconDIyivk0 = NavigationRailKt.m919placeLabelAndIconDIyivk0(Layout, placeable, mo1944measureBRTryo0, j, f);
                            return m919placeLabelAndIconDIyivk0;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1943278197);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion2.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(layoutId);
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
            startRestartGroup.startReplaceableGroup(1405563567);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(alpha);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl3 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl3, density3, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                startRestartGroup.startReplaceableGroup(2107148020);
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
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
                NavigationRailKt.NavigationRailItemBaselineLayout(Function2.this, function22, f, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m918placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        final int max = Math.max(0, (Constraints.m2487getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int max2 = Math.max(0, (Constraints.m2486getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return MeasureScope.layout$default(measureScope, Constraints.m2487getMaxWidthimpl(j), Constraints.m2486getMaxHeightimpl(j), null, new Function1() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, max, max2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m919placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        final int m2486getMaxHeightimpl = (Constraints.m2486getMaxHeightimpl(j) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo265roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int m2487getMaxWidthimpl = (Constraints.m2487getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int mo265roundToPx0680j_4 = measureScope.mo265roundToPx0680j_4(ItemIconTopOffset);
        int m2486getMaxHeightimpl2 = (Constraints.m2486getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int m2487getMaxWidthimpl2 = (Constraints.m2487getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((m2486getMaxHeightimpl2 - mo265roundToPx0680j_4) * (1 - f));
        return MeasureScope.layout$default(measureScope, Constraints.m2487getMaxWidthimpl(j), Constraints.m2486getMaxHeightimpl(j), null, new Function1() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
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
                if (f != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, m2487getMaxWidthimpl, m2486getMaxHeightimpl + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, m2487getMaxWidthimpl2, mo265roundToPx0680j_4 + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 8;
        NavigationRailPadding = Dp.m2507constructorimpl(f);
        HeaderPadding = Dp.m2507constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NavigationRailTransition_Klgx_Pg$lambda-3, reason: not valid java name */
    public static final float m913NavigationRailTransition_Klgx_Pg$lambda3(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
