package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0013\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u001c\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\"\u001d\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u001d\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!\"\u001d\u0010$\u001a\u00020\u001d8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0017\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010\u001f\"\u0017\u0010'\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0017\u0010(\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b(\u0010\u001f\"\u0017\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010\u001f\"\u0017\u0010*\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b*\u0010\u001f\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"\u0017\u0010.\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b.\u0010\u001f\"\u0017\u0010/\u001a\u00020\u001d8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b/\u0010\u001f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SwitchColors;", "colors", "Switch", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/State;", "", "thumbValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "SwitchImpl", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Landroidx/compose/runtime/State;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "trackColor", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "drawTrack", "Landroidx/compose/ui/unit/Dp;", "TrackWidth", "F", "getTrackWidth", "()F", "TrackStrokeWidth", "getTrackStrokeWidth", "ThumbDiameter", "getThumbDiameter", "ThumbRippleRadius", "DefaultSwitchPadding", "SwitchWidth", "SwitchHeight", "ThumbPathLength", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "ThumbDefaultElevation", "ThumbPressedElevation", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SwitchKt {
    private static final TweenSpec AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final Function1 function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        Modifier modifier3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource4;
        SwitchColors switchColors3;
        Composer composer2;
        Modifier modifier4;
        Modifier m998swipeablepPrIpRY;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource5;
        final SwitchColors switchColors4;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(25866825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        switchColors2 = switchColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                modifier3 = modifier5;
                                z4 = z6;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColors3 = SwitchDefaults.INSTANCE.m1000colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                            } else {
                                i6 = i3;
                                modifier3 = modifier5;
                                z4 = z6;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                switchColors3 = switchColors2;
                                startRestartGroup.endDefaults();
                                float mo271toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(ThumbPathLength);
                                SwipeableState rememberSwipeableStateFor = SwipeableKt.rememberSwipeableStateFor(Boolean.valueOf(z), function1 != null ? new Function1() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                                    public final void invoke(boolean z7) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Boolean) obj).booleanValue());
                                        return Unit.INSTANCE;
                                    }
                                } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | 384, 0);
                                boolean z7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl;
                                if (function1 == null) {
                                    composer2 = startRestartGroup;
                                    modifier4 = ToggleableKt.m500toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource4, null, z4, Role.m2157boximpl(Role.INSTANCE.m2168getSwitcho7Vup1c()), function1);
                                } else {
                                    composer2 = startRestartGroup;
                                    modifier4 = Modifier.INSTANCE;
                                }
                                Modifier modifier6 = Modifier.INSTANCE;
                                if (function1 != null) {
                                    modifier6 = TouchTargetKt.minimumTouchTargetSize(modifier6);
                                }
                                m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(modifier3.then(modifier6).then(modifier4), rememberSwipeableStateFor, r20, Orientation.Horizontal, (r26 & 8) != 0 ? true : (z4 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z7, (r26 & 32) != 0 ? null : mutableInteractionSource4, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                    @Override // kotlin.jvm.functions.Function2
                                    @NotNull
                                    public final FixedThreshold invoke(Object obj2, Object obj22) {
                                        return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                                    }
                                } : new Function2() { // from class: androidx.compose.material.SwitchKt$Switch$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                                    }

                                    @NotNull
                                    public final ThresholdConfig invoke(boolean z8, boolean z9) {
                                        return new FractionalThreshold(0.5f);
                                    }
                                }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(mo271toPx0680j_4), Boolean.TRUE)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                Modifier m353requiredSizeVpY3zN4 = SizeKt.m353requiredSizeVpY3zN4(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(m998swipeablepPrIpRY, companion.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion2.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(m353requiredSizeVpY3zN4);
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(1571176015);
                                int i9 = i6 << 3;
                                startRestartGroup = composer2;
                                SwitchImpl(boxScopeInstance, z, z4, switchColors3, rememberSwipeableStateFor.getOffset(), mutableInteractionSource4, startRestartGroup, (i9 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i9 & 458752));
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                modifier2 = modifier3;
                                z5 = z4;
                                mutableInteractionSource5 = mutableInteractionSource4;
                                switchColors4 = switchColors3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            switchColors3 = switchColors2;
                        }
                        i6 = i3;
                        startRestartGroup.endDefaults();
                        float mo271toPx0680j_42 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(ThumbPathLength);
                        SwipeableState rememberSwipeableStateFor2 = SwipeableKt.rememberSwipeableStateFor(Boolean.valueOf(z), function1 != null ? new Function1() { // from class: androidx.compose.material.SwitchKt$Switch$swipeableState$1
                            public final void invoke(boolean z72) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke(((Boolean) obj).booleanValue());
                                return Unit.INSTANCE;
                            }
                        } : function1, AnimationSpec, startRestartGroup, (i6 & 14) | 384, 0);
                        if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl) {
                        }
                        if (function1 == null) {
                        }
                        Modifier modifier62 = Modifier.INSTANCE;
                        if (function1 != null) {
                        }
                        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(modifier3.then(modifier62).then(modifier4), rememberSwipeableStateFor2, r20, Orientation.Horizontal, (r26 & 8) != 0 ? true : (z4 || function1 == null) ? false : true, (r26 & 16) != 0 ? false : z7, (r26 & 32) != 0 ? null : mutableInteractionSource4, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final FixedThreshold invoke(Object obj2, Object obj22) {
                                return new FixedThreshold(Dp.m2507constructorimpl(56), null);
                            }
                        } : new Function2() { // from class: androidx.compose.material.SwitchKt$Switch$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                            }

                            @NotNull
                            public final ThresholdConfig invoke(boolean z8, boolean z9) {
                                return new FractionalThreshold(0.5f);
                            }
                        }, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, MapsKt.mapOf(TuplesKt.to(Float.valueOf(0.0f), Boolean.FALSE), TuplesKt.to(Float.valueOf(mo271toPx0680j_42), Boolean.TRUE)).keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Modifier m353requiredSizeVpY3zN42 = SizeKt.m353requiredSizeVpY3zN4(PaddingKt.m334padding3ABfNKs(SizeKt.wrapContentSize$default(m998swipeablepPrIpRY, companion3.getCenter(), false, 2, null), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0 constructor2 = companion22.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(m353requiredSizeVpY3zN42);
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composer2.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion22.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1571176015);
                        int i92 = i6 << 3;
                        startRestartGroup = composer2;
                        SwitchImpl(boxScopeInstance2, z, z4, switchColors3, rememberSwipeableStateFor2.getOffset(), mutableInteractionSource4, startRestartGroup, (i92 & 112) | 6 | ((i6 >> 3) & 896) | ((i6 >> 6) & 7168) | (i92 & 458752));
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        modifier2 = modifier3;
                        z5 = z4;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        switchColors4 = switchColors3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        switchColors4 = switchColors2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwitchKt$Switch$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i10) {
                            SwitchKt.Switch(z, function1, modifier2, z5, mutableInteractionSource5, switchColors4, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
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
                if ((i2 & 32) == 0) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
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
            if ((i2 & 32) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
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
        if ((i2 & 32) == 0) {
        }
    }

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl(34);
        TrackWidth = m2507constructorimpl;
        TrackStrokeWidth = Dp.m2507constructorimpl(14);
        float m2507constructorimpl2 = Dp.m2507constructorimpl(20);
        ThumbDiameter = m2507constructorimpl2;
        ThumbRippleRadius = Dp.m2507constructorimpl(24);
        DefaultSwitchPadding = Dp.m2507constructorimpl(2);
        SwitchWidth = m2507constructorimpl;
        SwitchHeight = m2507constructorimpl2;
        ThumbPathLength = Dp.m2507constructorimpl(m2507constructorimpl - m2507constructorimpl2);
        AnimationSpec = new TweenSpec(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m2507constructorimpl(1);
        ThumbPressedElevation = Dp.m2507constructorimpl(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final State state, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        int i3;
        long m1002SwitchImpl$lambda7;
        Composer startRestartGroup = composer.startRestartGroup(-1834839253);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i4 = (i2 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, startRestartGroup, i4);
            float f = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            int i5 = ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112);
            final State trackColor = switchColors.trackColor(z2, z, startRestartGroup, i5);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull DrawScope Canvas) {
                        long m1001SwitchImpl$lambda5;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1001SwitchImpl$lambda5 = SwitchKt.m1001SwitchImpl$lambda5(trackColor);
                        SwitchKt.m1005drawTrackRPmYEkk(Canvas, m1001SwitchImpl$lambda5, Canvas.mo271toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo271toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i5);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m2507constructorimpl = Dp.m2507constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).getValue() + f);
            startRestartGroup.startReplaceableGroup(-539245361);
            if (!Color.m1447equalsimpl0(m1002SwitchImpl$lambda7(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m800getSurface0d7_KjU()) || elevationOverlay == null) {
                i3 = 1157296644;
                m1002SwitchImpl$lambda7 = m1002SwitchImpl$lambda7(thumbColor);
            } else {
                i3 = 1157296644;
                m1002SwitchImpl$lambda7 = elevationOverlay.mo830apply7g2Lkgo(m1002SwitchImpl$lambda7(thumbColor), m2507constructorimpl, startRestartGroup, 0);
            }
            long j = m1002SwitchImpl$lambda7;
            startRestartGroup.endReplaceableGroup();
            Modifier align = boxScope.align(companion2, companion3.getCenterStart());
            startRestartGroup.startReplaceableGroup(i3);
            boolean changed3 = startRestartGroup.changed(state);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return IntOffset.m2545boximpl(m1006invokeBjo55l4((Density) obj));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1006invokeBjo55l4(@NotNull Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffsetKt.IntOffset(MathKt.roundToInt(((Number) state.getValue()).floatValue()), 0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m157backgroundbw27NRU(ShadowKt.m1242shadows4CzXII$default(SizeKt.m352requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m1075rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), ThumbDiameter), f, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), j, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
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
                SwitchKt.SwitchImpl(BoxScope.this, z, z2, switchColors, state, interactionSource, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1005drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        DrawScope.m1698drawLineNGM6Ib0$default(drawScope, j, androidx.compose.ui.geometry.OffsetKt.Offset(f3, Offset.m1298getYimpl(drawScope.mo1707getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f - f3, Offset.m1298getYimpl(drawScope.mo1707getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m1595getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchImpl$lambda-5, reason: not valid java name */
    public static final long m1001SwitchImpl$lambda5(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* renamed from: SwitchImpl$lambda-7, reason: not valid java name */
    private static final long m1002SwitchImpl$lambda7(State state) {
        return ((Color) state.getValue()).getValue();
    }
}
