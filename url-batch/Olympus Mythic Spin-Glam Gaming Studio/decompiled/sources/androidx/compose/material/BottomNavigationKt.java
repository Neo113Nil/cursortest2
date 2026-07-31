package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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

/* compiled from: BottomNavigation.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aV\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0095\u0001\u0010\u001d\u001a\u00020\t*\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001aF\u0010#\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a?\u0010%\u001a\u00020\t2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\n2\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011¢\u0006\u0002\b\n2\u0006\u0010$\u001a\u00020 H\u0003¢\u0006\u0004\b%\u0010&\u001a)\u0010/\u001a\u00020,*\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a9\u00103\u001a\u00020,*\u00020'2\u0006\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010$\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u0017\u00107\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b7\u00108\"\u0017\u00109\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b9\u00108\"\u0017\u0010:\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b:\u00108\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "content", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationItem", "activeColor", "inactiveColor", "", "BottomNavigationTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationTransition", "iconPositionAnimationProgress", "BottomNavigationItemBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationHeight", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavigationKt {
    private static final TweenSpec BottomNavigationAnimationSpec = new TweenSpec(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m2507constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m735BottomNavigationPEIptTM(Modifier modifier, long j, long j2, float f, final Function3 content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        final Modifier modifier3;
        final float m734getElevationD9Ej5fM;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(456489494);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j3 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
            }
            if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                        i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    }
                    if ((i2 & 4) != 0) {
                        j4 = ColorsKt.m814contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        m734getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m734getElevationD9Ej5fM();
                        long j7 = j4;
                        final int i7 = i3;
                        startRestartGroup.endDefaults();
                        int i8 = i7 << 3;
                        SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j7, null, m734getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
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
                                float f3;
                                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    f3 = BottomNavigationKt.BottomNavigationHeight;
                                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m347height3ABfNKs(fillMaxWidth$default, f3));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Function3 function3 = Function3.this;
                                    int i10 = ((i7 >> 3) & 7168) | 48;
                                    composer2.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
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
                                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i7 & 14) | 1572864 | (i8 & 896) | (i8 & 7168) | ((i7 << 6) & 458752), 18);
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
                m734getElevationD9Ej5fM = f2;
                long j72 = j4;
                final int i72 = i3;
                startRestartGroup.endDefaults();
                int i82 = i72 << 3;
                SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j72, null, m734getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
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
                        float f3;
                        if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            f3 = BottomNavigationKt.BottomNavigationHeight;
                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m347height3ABfNKs(fillMaxWidth$default, f3));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Function3 function3 = Function3.this;
                            int i10 = ((i72 >> 3) & 7168) | 48;
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
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
                            Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i72 & 14) | 1572864 | (i82 & 896) | (i82 & 7168) | ((i72 << 6) & 458752), 18);
                j5 = j3;
                j6 = j72;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
                m734getElevationD9Ej5fM = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$2
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
                    BottomNavigationKt.m735BottomNavigationPEIptTM(Modifier.this, j5, j6, m734getElevationD9Ej5fM, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        f2 = f;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i6 != 0) {
        }
        m734getElevationD9Ej5fM = f2;
        long j722 = j4;
        final int i722 = i3;
        startRestartGroup.endDefaults();
        int i822 = i722 << 3;
        SurfaceKt.m988SurfaceFjzlyU(modifier3, null, j3, j722, null, m734getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(startRestartGroup, 678339930, true, new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
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
                float f3;
                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    f3 = BottomNavigationKt.BottomNavigationHeight;
                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m347height3ABfNKs(fillMaxWidth$default, f3));
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Function3 function3 = Function3.this;
                    int i10 = ((i722 >> 3) & 7168) | 48;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
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
                    Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    function3.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i722 & 14) | 1572864 | (i822 & 896) | (i822 & 7168) | ((i722 << 6) & 458752), 18);
        j5 = j3;
        j6 = j722;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    public static final void m736BottomNavigationItemjY6E1Zs(final RowScope BottomNavigationItem, final boolean z, final Function0 onClick, final Function2 icon, Modifier modifier, boolean z2, Function2 function2, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2, final int i3) {
        final int i4;
        Modifier modifier2;
        boolean z4;
        final Function2 function22;
        int i5;
        Modifier modifier3;
        final boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        long j4;
        final boolean z6;
        final boolean z7;
        final Function2 function23;
        final long j5;
        final Modifier modifier4;
        final MutableInteractionSource mutableInteractionSource3;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(BottomNavigationItem, "$this$BottomNavigationItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1473735525);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(BottomNavigationItem) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
        }
        int i9 = 16 & i3;
        if (i9 != 0) {
            i4 |= 196608;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
            }
        }
        int i10 = 32 & i3;
        if (i10 != 0) {
            i4 |= 1572864;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(function22) ? 1048576 : 524288;
            }
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        int i12 = 128 & i3;
        if (i12 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
        }
        if ((i & 1879048192) == 0) {
            if ((i3 & 512) == 0 && startRestartGroup.changed(j)) {
                i7 = 536870912;
                i4 |= i7;
            }
            i7 = 268435456;
            i4 |= i7;
        }
        if ((i2 & 14) == 0) {
            if ((1024 & i3) == 0 && startRestartGroup.changed(j2)) {
                i6 = 4;
                i5 = i2 | i6;
            }
            i6 = 2;
            i5 = i2 | i6;
        } else {
            i5 = i2;
        }
        if ((i4 & 1533916891) != 306783378 || (i5 & 11) != 2 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                if (i9 != 0) {
                    z4 = true;
                }
                if (i10 != 0) {
                    function22 = null;
                }
                z5 = i11 != 0 ? true : z3;
                if (i12 != 0) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((256 & i3) != 0) {
                    j3 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).getValue();
                    i4 &= -1879048193;
                } else {
                    j3 = j;
                }
                if ((i3 & 512) != 0) {
                    j4 = Color.m1445copywmQWz5c$default(j3, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i5 &= -15;
                } else {
                    j4 = j2;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((256 & i3) != 0) {
                    i4 &= -1879048193;
                }
                if ((i3 & 512) != 0) {
                    i5 &= -15;
                }
                z5 = z3;
                mutableInteractionSource2 = mutableInteractionSource;
                j3 = j;
                j4 = j2;
                modifier3 = modifier2;
            }
            startRestartGroup.endDefaults();
            final ComposableLambda composableLambda = function22 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, 1343298261, true, new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
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
                public final void invoke(@Nullable Composer composer2, int i13) {
                    TextStyle m2257copyHL5avdY;
                    if ((i13 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        m2257copyHL5avdY = r3.m2257copyHL5avdY((r42 & 1) != 0 ? r3.spanStyle.m2225getColor0d7_KjU() : 0L, (r42 & 2) != 0 ? r3.spanStyle.getFontSize() : 0L, (r42 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r42 & 8) != 0 ? r3.spanStyle.getFontStyle() : null, (r42 & 16) != 0 ? r3.spanStyle.getFontSynthesis() : null, (r42 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r42 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r42 & 128) != 0 ? r3.spanStyle.getLetterSpacing() : 0L, (r42 & 256) != 0 ? r3.spanStyle.getBaselineShift() : null, (r42 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r42 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r42 & 2048) != 0 ? r3.spanStyle.getBackground() : 0L, (r42 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r42 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r42 & 16384) != 0 ? r3.paragraphStyle.getTextAlign() : TextAlign.m2439boximpl(TextAlign.INSTANCE.m2446getCentere0LSkKk()), (r42 & 32768) != 0 ? r3.paragraphStyle.getTextDirection() : null, (r42 & 65536) != 0 ? r3.paragraphStyle.getLineHeight() : 0L, (r42 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption().paragraphStyle.getTextIndent() : null);
                        TextKt.ProvideTextStyle(m2257copyHL5avdY, Function2.this, composer2, (i4 >> 15) & 112);
                    }
                }
            }) : null;
            Modifier weight$default = RowScope.weight$default(BottomNavigationItem, SelectableKt.m498selectableO2vRcR0(modifier3, z, mutableInteractionSource2, RippleKt.m1075rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m2157boximpl(Role.INSTANCE.m2169getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier modifier5 = modifier3;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(weight$default);
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
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1538530399);
            m737BottomNavigationTransitionKlgxPg(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new Function3() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2$1
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
                public final void invoke(float f, @Nullable Composer composer2, int i13) {
                    if ((i13 & 14) == 0) {
                        i13 |= composer2.changed(f) ? 4 : 2;
                    }
                    if ((i13 & 91) != 18 || !composer2.getSkipping()) {
                        if (z5) {
                            f = 1.0f;
                        }
                        BottomNavigationKt.BottomNavigationItemBaselineLayout(icon, composableLambda, f, composer2, (i4 >> 9) & 14);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i4 >> 27) & 14) | 3072 | ((i5 << 3) & 112) | ((i4 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            z6 = z5;
            z7 = z4;
            function23 = function22;
            j5 = j4;
            modifier4 = modifier5;
            mutableInteractionSource3 = mutableInteractionSource4;
        } else {
            startRestartGroup.skipToGroupEnd();
            z6 = z3;
            j3 = j;
            z7 = z4;
            modifier4 = modifier2;
            function23 = function22;
            mutableInteractionSource3 = mutableInteractionSource;
            j5 = j2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final long j6 = j3;
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i13) {
                BottomNavigationKt.m736BottomNavigationItemjY6E1Zs(RowScope.this, z, onClick, icon, modifier4, z7, function23, z6, mutableInteractionSource3, j6, j5, composer2, i | 1, i2, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final void m737BottomNavigationTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3 function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
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
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, BottomNavigationAnimationSpec, 0.0f, null, startRestartGroup, 48, 12);
            long m1469lerpjxsXWHM = ColorKt.m1469lerpjxsXWHM(j2, j, m738BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m1441boximpl(Color.m1445copywmQWz5c$default(m1469lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m1448getAlphaimpl(m1469lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(startRestartGroup, -138092754, true, new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
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
                    float m738BottomNavigationTransition_Klgx_Pg$lambda3;
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    Function3 function32 = Function3.this;
                    m738BottomNavigationTransition_Klgx_Pg$lambda3 = BottomNavigationKt.m738BottomNavigationTransition_Klgx_Pg$lambda3(animateFloatAsState);
                    function32.invoke(Float.valueOf(m738BottomNavigationTransition_Klgx_Pg$lambda3), composer2, Integer.valueOf((i3 >> 6) & 112));
                }
            }), startRestartGroup, 56);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
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
                BottomNavigationKt.m737BottomNavigationTransitionKlgxPg(j, j2, z, function3, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomNavigationItemBaselineLayout(final Function2 function2, final Function2 function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
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
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Placeable placeable;
                    MeasureResult m744placeLabelAndIconDIyivk0;
                    MeasureResult m743placeIcon3p2s80s;
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
                                m743placeIcon3p2s80s = BottomNavigationKt.m743placeIcon3p2s80s(Layout, mo1944measureBRTryo0, j);
                                return m743placeIcon3p2s80s;
                            }
                            Intrinsics.checkNotNull(placeable);
                            m744placeLabelAndIconDIyivk0 = BottomNavigationKt.m744placeLabelAndIconDIyivk0(Layout, placeable, mo1944measureBRTryo0, j, f);
                            return m744placeLabelAndIconDIyivk0;
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
            startRestartGroup.startReplaceableGroup(395677717);
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
            startRestartGroup.startReplaceableGroup(-1943403697);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier m336paddingVpY3zN4$default = PaddingKt.m336paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0 constructor3 = companion2.getConstructor();
                Function3 materializerOf3 = LayoutKt.materializerOf(m336paddingVpY3zN4$default);
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
                startRestartGroup.startReplaceableGroup(150842644);
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
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
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
                BottomNavigationKt.BottomNavigationItemBaselineLayout(Function2.this, function22, f, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m743placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        int m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
        final int height = (m2486getMaxHeightimpl - placeable.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), m2486getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, height, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m744placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        int m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
        int i = placeable.get(AlignmentLineKt.getLastBaseline());
        int mo265roundToPx0680j_4 = measureScope.mo265roundToPx0680j_4(CombinedItemTextBaseline);
        final int i2 = (m2486getMaxHeightimpl - i) - mo265roundToPx0680j_4;
        int height = (m2486getMaxHeightimpl - placeable2.getHeight()) / 2;
        final int height2 = (m2486getMaxHeightimpl - (mo265roundToPx0680j_4 * 2)) - placeable2.getHeight();
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (max - placeable.getWidth()) / 2;
        final int width2 = (max - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((height - height2) * (1 - f));
        return MeasureScope.layout$default(measureScope, max, m2486getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
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
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, width, i2 + roundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(layout, placeable2, width2, height2 + roundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    static {
        float f = 12;
        BottomNavigationItemHorizontalPadding = Dp.m2507constructorimpl(f);
        CombinedItemTextBaseline = Dp.m2507constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomNavigationTransition_Klgx_Pg$lambda-3, reason: not valid java name */
    public static final float m738BottomNavigationTransition_Klgx_Pg$lambda3(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
