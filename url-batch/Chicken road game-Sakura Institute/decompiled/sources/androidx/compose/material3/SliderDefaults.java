package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", "offset", "size", "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "height", "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m3179getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m3179getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3_release;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2175colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        long m3876getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j;
        long m3876getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j2;
        long m3876getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j3;
        long m3876getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j4;
        long m3876getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j5;
        long m3876getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j6;
        long m3876getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j7;
        long m3876getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j8;
        long m3876getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j9;
        long m3876getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m3876getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        }
        SliderColors m2153copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2153copyK518z4(m3876getUnspecified0d7_KjU, m3876getUnspecified0d7_KjU2, m3876getUnspecified0d7_KjU3, m3876getUnspecified0d7_KjU4, m3876getUnspecified0d7_KjU5, m3876getUnspecified0d7_KjU6, m3876getUnspecified0d7_KjU7, m3876getUnspecified0d7_KjU8, m3876getUnspecified0d7_KjU9, m3876getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2153copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m3885compositeOverOWjLjI(Color.m3839copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m3839copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3839copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3839copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3839copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0069  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2172Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        Object rememberedValue;
        boolean z3;
        SliderDefaults$Thumb$1$1 rememberedValue2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = colors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                j3 = SliderKt.ThumbSize;
                                j2 = j3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt.mutableStateListOf();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                        int i8 = i3 & 14;
                        z3 = i8 != 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i8);
                        SpacerKt.Spacer(BackgroundKt.m235backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m727size6HolHcs(modifier2, !(snapshotStateList.isEmpty() ^ true) ? DpSize.m6390copyDwJknco$default(j2, Dp.m6299constructorimpl(DpSize.m6397getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2164thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    final Modifier modifier3 = modifier2;
                    final SliderColors sliderColors3 = sliderColors2;
                    final boolean z4 = z2;
                    final long j4 = j2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                SliderDefaults.this.m2172Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z4, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                int i82 = i3 & 14;
                if (i82 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i82);
                SpacerKt.Spacer(BackgroundKt.m235backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m727size6HolHcs(modifier2, !(snapshotStateList2.isEmpty() ^ true) ? DpSize.m6390copyDwJknco$default(j2, Dp.m6299constructorimpl(DpSize.m6397getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2164thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                final Modifier modifier32 = modifier2;
                final SliderColors sliderColors32 = sliderColors2;
                final boolean z42 = z2;
                final long j42 = j2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateList snapshotStateList22 = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
            int i822 = i3 & 14;
            if (i822 != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList22, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i822);
            SpacerKt.Spacer(BackgroundKt.m235backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m727size6HolHcs(modifier2, !(snapshotStateList22.isEmpty() ^ true) ? DpSize.m6390copyDwJknco$default(j2, Dp.m6299constructorimpl(DpSize.m6397getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2164thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier322 = modifier2;
            final SliderColors sliderColors322 = sliderColors2;
            final boolean z422 = z2;
            final long j422 = j2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        SnapshotStateList snapshotStateList222 = (SnapshotStateList) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
        int i8222 = i3 & 14;
        if (i8222 != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList222, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i8222);
        SpacerKt.Spacer(BackgroundKt.m235backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m727size6HolHcs(modifier2, !(snapshotStateList222.isEmpty() ^ true) ? DpSize.m6390copyDwJknco$default(j2, Dp.m6299constructorimpl(DpSize.m6397getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2164thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        final Modifier modifier3222 = modifier2;
        final SliderColors sliderColors3222 = sliderColors2;
        final boolean z4222 = z2;
        final long j4222 = j2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0065  */
    @Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        boolean z3;
        Composer composer2;
        boolean changed;
        Object rememberedValue;
        final SliderColors sliderColors3;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = colors;
                        }
                        if (i4 != 0) {
                            z3 = true;
                            SliderColors sliderColors4 = sliderColors2;
                            int i7 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
                            }
                            final long m2166trackColorWaAFU9c$material3_release = sliderColors4.m2166trackColorWaAFU9c$material3_release(z3, false);
                            final long m2166trackColorWaAFU9c$material3_release2 = sliderColors4.m2166trackColorWaAFU9c$material3_release(z3, true);
                            final long m2165tickColorWaAFU9c$material3_release = sliderColors4.m2165tickColorWaAFU9c$material3_release(z3, false);
                            final long m2165tickColorWaAFU9c$material3_release2 = sliderColors4.m2165tickColorWaAFU9c$material3_release(z3, true);
                            Modifier m712height3ABfNKs = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerStart(composer2, -801023075, "CC(remember):Slider.kt#9igjgp");
                            changed = composer2.changed(m2166trackColorWaAFU9c$material3_release) | ((i7 & 14) != 4) | composer2.changed(m2166trackColorWaAFU9c$material3_release2) | composer2.changed(m2165tickColorWaAFU9c$material3_release) | composer2.changed(m2165tickColorWaAFU9c$material3_release2);
                            rememberedValue = composer2.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                        long Offset = OffsetKt.Offset(0.0f, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                                        long Offset2 = OffsetKt.Offset(Size.m3668getWidthimpl(drawScope.mo4396getSizeNHjbRc()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                                        long j = z5 ? Offset2 : Offset;
                                        long j2 = z5 ? Offset : Offset2;
                                        float f = drawScope.mo373toPx0680j_4(SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM());
                                        float f2 = drawScope.mo373toPx0680j_4(SliderKt.getTrackHeight());
                                        long j3 = j2;
                                        long j4 = j;
                                        DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        float[] tickFractions = sliderPositions.getTickFractions();
                                        SliderPositions sliderPositions2 = sliderPositions;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        int length = tickFractions.length;
                                        for (int i8 = 0; i8 < length; i8++) {
                                            float f3 = tickFractions[i8];
                                            Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                            Object obj = linkedHashMap.get(valueOf);
                                            if (obj == null) {
                                                obj = (List) new ArrayList();
                                                linkedHashMap.put(valueOf, obj);
                                            }
                                            ((List) obj).add(Float.valueOf(f3));
                                        }
                                        long j5 = m2165tickColorWaAFU9c$material3_release;
                                        long j6 = m2165tickColorWaAFU9c$material3_release2;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                                            List list = (List) entry.getValue();
                                            ArrayList arrayList = new ArrayList(list.size());
                                            int size = list.size();
                                            for (int i9 = 0; i9 < size; i9++) {
                                                arrayList.add(Offset.m3588boximpl(OffsetKt.Offset(Offset.m3599getXimpl(OffsetKt.m3622lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
                                            }
                                            long j7 = j4;
                                            j3 = j3;
                                            DrawScope.m4387drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4146getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                            j6 = j6;
                                            j4 = j7;
                                        }
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(m712height3ABfNKs, (Function1) rememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            sliderColors3 = sliderColors4;
                            modifier3 = companion;
                            z4 = z3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors42 = sliderColors2;
                    int i72 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final long m2166trackColorWaAFU9c$material3_release3 = sliderColors42.m2166trackColorWaAFU9c$material3_release(z3, false);
                    final long m2166trackColorWaAFU9c$material3_release22 = sliderColors42.m2166trackColorWaAFU9c$material3_release(z3, true);
                    final long m2165tickColorWaAFU9c$material3_release3 = sliderColors42.m2165tickColorWaAFU9c$material3_release(z3, false);
                    final long m2165tickColorWaAFU9c$material3_release22 = sliderColors42.m2165tickColorWaAFU9c$material3_release(z3, true);
                    Modifier m712height3ABfNKs2 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerStart(composer2, -801023075, "CC(remember):Slider.kt#9igjgp");
                    changed = composer2.changed(m2166trackColorWaAFU9c$material3_release3) | ((i72 & 14) != 4) | composer2.changed(m2166trackColorWaAFU9c$material3_release22) | composer2.changed(m2165tickColorWaAFU9c$material3_release3) | composer2.changed(m2165tickColorWaAFU9c$material3_release22);
                    rememberedValue = composer2.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long Offset = OffsetKt.Offset(0.0f, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                            long Offset2 = OffsetKt.Offset(Size.m3668getWidthimpl(drawScope.mo4396getSizeNHjbRc()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                            long j = z5 ? Offset2 : Offset;
                            long j2 = z5 ? Offset : Offset2;
                            float f = drawScope.mo373toPx0680j_4(SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM());
                            float f2 = drawScope.mo373toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release3, j, j2, f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release22, OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i8 = 0; i8 < length; i8++) {
                                float f3 = tickFractions[i8];
                                Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(valueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(valueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = m2165tickColorWaAFU9c$material3_release3;
                            long j6 = m2165tickColorWaAFU9c$material3_release22;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    arrayList.add(Offset.m3588boximpl(OffsetKt.Offset(Offset.m3599getXimpl(OffsetKt.m3622lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
                                }
                                long j7 = j4;
                                j3 = j3;
                                DrawScope.m4387drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4146getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j4 = j7;
                            }
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CanvasKt.Canvas(m712height3ABfNKs2, (Function1) rememberedValue, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sliderColors3 = sliderColors42;
                    modifier3 = companion;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors3, z4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            z3 = z2;
            SliderColors sliderColors422 = sliderColors2;
            int i722 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final long m2166trackColorWaAFU9c$material3_release32 = sliderColors422.m2166trackColorWaAFU9c$material3_release(z3, false);
            final long m2166trackColorWaAFU9c$material3_release222 = sliderColors422.m2166trackColorWaAFU9c$material3_release(z3, true);
            final long m2165tickColorWaAFU9c$material3_release32 = sliderColors422.m2165tickColorWaAFU9c$material3_release(z3, false);
            final long m2165tickColorWaAFU9c$material3_release222 = sliderColors422.m2165tickColorWaAFU9c$material3_release(z3, true);
            Modifier m712height3ABfNKs22 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerStart(composer2, -801023075, "CC(remember):Slider.kt#9igjgp");
            changed = composer2.changed(m2166trackColorWaAFU9c$material3_release32) | ((i722 & 14) != 4) | composer2.changed(m2166trackColorWaAFU9c$material3_release222) | composer2.changed(m2165tickColorWaAFU9c$material3_release32) | composer2.changed(m2165tickColorWaAFU9c$material3_release222);
            rememberedValue = composer2.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                    long Offset = OffsetKt.Offset(0.0f, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                    long Offset2 = OffsetKt.Offset(Size.m3668getWidthimpl(drawScope.mo4396getSizeNHjbRc()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                    long j = z5 ? Offset2 : Offset;
                    long j2 = z5 ? Offset : Offset2;
                    float f = drawScope.mo373toPx0680j_4(SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM());
                    float f2 = drawScope.mo373toPx0680j_4(SliderKt.getTrackHeight());
                    long j3 = j2;
                    long j4 = j;
                    DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release32, j, j2, f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release222, OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    float[] tickFractions = sliderPositions.getTickFractions();
                    SliderPositions sliderPositions2 = sliderPositions;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length = tickFractions.length;
                    for (int i8 = 0; i8 < length; i8++) {
                        float f3 = tickFractions[i8];
                        Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                        Object obj = linkedHashMap.get(valueOf);
                        if (obj == null) {
                            obj = (List) new ArrayList();
                            linkedHashMap.put(valueOf, obj);
                        }
                        ((List) obj).add(Float.valueOf(f3));
                    }
                    long j5 = m2165tickColorWaAFU9c$material3_release32;
                    long j6 = m2165tickColorWaAFU9c$material3_release222;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            arrayList.add(Offset.m3588boximpl(OffsetKt.Offset(Offset.m3599getXimpl(OffsetKt.m3622lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
                        }
                        long j7 = j4;
                        j3 = j3;
                        DrawScope.m4387drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4146getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        j6 = j6;
                        j4 = j7;
                    }
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(m712height3ABfNKs22, (Function1) rememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            sliderColors3 = sliderColors422;
            modifier3 = companion;
            z4 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        z3 = z2;
        SliderColors sliderColors4222 = sliderColors2;
        int i7222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final long m2166trackColorWaAFU9c$material3_release322 = sliderColors4222.m2166trackColorWaAFU9c$material3_release(z3, false);
        final long m2166trackColorWaAFU9c$material3_release2222 = sliderColors4222.m2166trackColorWaAFU9c$material3_release(z3, true);
        final long m2165tickColorWaAFU9c$material3_release322 = sliderColors4222.m2165tickColorWaAFU9c$material3_release(z3, false);
        final long m2165tickColorWaAFU9c$material3_release2222 = sliderColors4222.m2165tickColorWaAFU9c$material3_release(z3, true);
        Modifier m712height3ABfNKs222 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, -801023075, "CC(remember):Slider.kt#9igjgp");
        changed = composer2.changed(m2166trackColorWaAFU9c$material3_release322) | ((i7222 & 14) != 4) | composer2.changed(m2166trackColorWaAFU9c$material3_release2222) | composer2.changed(m2165tickColorWaAFU9c$material3_release322) | composer2.changed(m2165tickColorWaAFU9c$material3_release2222);
        rememberedValue = composer2.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(0.0f, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m3668getWidthimpl(drawScope.mo4396getSizeNHjbRc()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                long j = z5 ? Offset2 : Offset;
                long j2 = z5 ? Offset : Offset2;
                float f = drawScope.mo373toPx0680j_4(SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM());
                float f2 = drawScope.mo373toPx0680j_4(SliderKt.getTrackHeight());
                long j3 = j2;
                long j4 = j;
                DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release322, j, j2, f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.m4382drawLineNGM6Ib0$default(drawScope, m2166trackColorWaAFU9c$material3_release2222, OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3599getXimpl(j4) + ((Offset.m3599getXimpl(j3) - Offset.m3599getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                float[] tickFractions = sliderPositions.getTickFractions();
                SliderPositions sliderPositions2 = sliderPositions;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = tickFractions.length;
                for (int i8 = 0; i8 < length; i8++) {
                    float f3 = tickFractions[i8];
                    Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                    Object obj = linkedHashMap.get(valueOf);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(valueOf, obj);
                    }
                    ((List) obj).add(Float.valueOf(f3));
                }
                long j5 = m2165tickColorWaAFU9c$material3_release322;
                long j6 = m2165tickColorWaAFU9c$material3_release2222;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        arrayList.add(Offset.m3588boximpl(OffsetKt.Offset(Offset.m3599getXimpl(OffsetKt.m3622lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
                    }
                    long j7 = j4;
                    j3 = j3;
                    DrawScope.m4387drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4146getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j6 = j6;
                    j4 = j7;
                }
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        CanvasKt.Canvas(m712height3ABfNKs222, (Function1) rememberedValue, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        sliderColors3 = sliderColors4222;
        modifier3 = companion;
        z4 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SliderColors sliderColors2;
        int i4;
        boolean z2;
        SliderColors sliderColors3;
        Modifier modifier3;
        SliderColors sliderColors4;
        boolean z3;
        float f;
        float f2;
        final boolean z4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(593554206);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors3 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors3 = sliderColors2;
                        }
                        if (i4 != 0) {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(593554206, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            m2174Track4EFweAY(sliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            sliderColors2 = sliderColors4;
                            z4 = z3;
                        } else {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                    }
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    m2174Track4EFweAY(sliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors4;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            SliderDefaults.this.Track(sliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2174Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        int i7;
        float f3;
        Modifier.Companion companion;
        final SliderColors sliderColors3;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        SliderDefaults$Track$5 sliderDefaults$Track$5;
        float f4;
        int i8;
        float f5;
        Function2<? super DrawScope, ? super Offset, Unit> function24;
        long j;
        boolean z3;
        boolean z4;
        Object rememberedValue;
        final SliderColors sliderColors4;
        final float f6;
        final Function2<? super DrawScope, ? super Offset, Unit> function25;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        final float f7;
        final boolean z5;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(49984771);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1114@49756L8,1115@49825L232,1137@50806L7,1138@50862L595,1133@50659L798:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        function22 = function2;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i9 = (100663296 & i) == 0 ? startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                sliderColors3 = colors(startRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                            } else {
                                sliderColors3 = sliderColors2;
                            }
                            if ((i2 & 16) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800875397, "CC(remember):Slider.kt#9igjgp");
                                boolean z6 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors3)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2179invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2179invokeUv8p0NA(DrawScope drawScope, long j2) {
                                            SliderDefaults.INSTANCE.m2169drawStopIndicatorx3O1jOs(drawScope, j2, SliderDefaults.INSTANCE.m2177getTrackStopIndicatorSizeD9Ej5fM(), SliderColors.this.m2166trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function23 = (Function2) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i3 &= -57345;
                            } else {
                                function23 = function22;
                            }
                            sliderDefaults$Track$5 = i5 == 0 ? new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                    m2180invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m3850unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                public final void m2180invokewPWG1Vc(DrawScope drawScope, long j2, long j3) {
                                    SliderDefaults.INSTANCE.m2169drawStopIndicatorx3O1jOs(drawScope, j2, SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM(), j3);
                                }
                            } : function32;
                            float f8 = i6 == 0 ? SliderKt.ThumbTrackGapSize : f;
                            f4 = i7 == 0 ? SliderKt.TrackInsideCornerSize : f3;
                            i8 = i3;
                            f5 = f8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            companion = modifier;
                            sliderColors3 = sliderColors2;
                            f4 = f3;
                            function23 = function22;
                            sliderDefaults$Track$5 = function32;
                            i8 = i3;
                            f5 = f;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(49984771, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
                        }
                        long m2166trackColorWaAFU9c$material3_release = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
                        final long m2166trackColorWaAFU9c$material3_release2 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
                        Function2<? super DrawScope, ? super Offset, Unit> function26 = function23;
                        final float f9 = f4;
                        final long m2165tickColorWaAFU9c$material3_release = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
                        final long m2165tickColorWaAFU9c$material3_release2 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
                        SliderColors sliderColors5 = sliderColors3;
                        Modifier m712height3ABfNKs = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        Modifier modifier3 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier rotate = RotateKt.rotate(m712height3ABfNKs, consume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                        boolean z7 = z2;
                        boolean changedInstance = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release2) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release2) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                            function24 = function26;
                            if (startRestartGroup.changed(function24)) {
                                j = m2166trackColorWaAFU9c$material3_release;
                                z3 = true;
                                z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final long j2 = j;
                                    final float f10 = f5;
                                    final Function2<? super DrawScope, ? super Offset, Unit> function27 = function24;
                                    final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34 = sliderDefaults$Track$5;
                                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DrawScope drawScope) {
                                            SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j2, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f10, f9, function27, function34, false);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                sliderColors4 = sliderColors5;
                                f6 = f5;
                                function25 = function24;
                                function33 = sliderDefaults$Track$5;
                                f7 = f9;
                                z5 = z7;
                                modifier2 = modifier3;
                            }
                        } else {
                            function24 = function26;
                        }
                        j = m2166trackColorWaAFU9c$material3_release;
                        if ((i8 & 24576) != 16384) {
                            z3 = false;
                            z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4) {
                            }
                            final long j22 = j;
                            final float f102 = f5;
                            final Function2<? super DrawScope, ? super Offset, Unit> function272 = function24;
                            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function342 = sliderDefaults$Track$5;
                            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j22, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f102, f9, function272, function342, false);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            sliderColors4 = sliderColors5;
                            f6 = f5;
                            function25 = function24;
                            function33 = sliderDefaults$Track$5;
                            f7 = f9;
                            z5 = z7;
                            modifier2 = modifier3;
                        }
                        z3 = true;
                        z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4) {
                        }
                        final long j222 = j;
                        final float f1022 = f5;
                        final Function2<? super DrawScope, ? super Offset, Unit> function2722 = function24;
                        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3422 = sliderDefaults$Track$5;
                        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j222, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f1022, f9, function2722, function3422, false);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sliderColors4 = sliderColors5;
                        f6 = f5;
                        function25 = function24;
                        function33 = sliderDefaults$Track$5;
                        f7 = f9;
                        z5 = z7;
                        modifier2 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z5 = z2;
                        sliderColors4 = sliderColors2;
                        f7 = f3;
                        function25 = function22;
                        function33 = function32;
                        f6 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                SliderDefaults.this.m2174Track4EFweAY(sliderState, modifier2, z5, sliderColors4, function25, function33, f6, f7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                i8 = i3;
                f5 = f8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                long m2166trackColorWaAFU9c$material3_release3 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
                final long m2166trackColorWaAFU9c$material3_release22 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
                Function2<? super DrawScope, ? super Offset, Unit> function262 = function23;
                final float f92 = f4;
                final long m2165tickColorWaAFU9c$material3_release3 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
                final long m2165tickColorWaAFU9c$material3_release22 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
                SliderColors sliderColors52 = sliderColors3;
                Modifier m712height3ABfNKs2 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                Modifier modifier32 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier rotate2 = RotateKt.rotate(m712height3ABfNKs2, consume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                boolean z72 = z2;
                boolean changedInstance2 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release22) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release22) | ((29360128 & i8) != 8388608);
                if (((57344 & i8) ^ 24576) <= 16384) {
                }
                j = m2166trackColorWaAFU9c$material3_release3;
                if ((i8 & 24576) != 16384) {
                }
                z3 = true;
                z4 = changedInstance2 | z3 | ((458752 & i8) != 131072);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                final long j2222 = j;
                final float f10222 = f5;
                final Function2<? super DrawScope, ? super Offset, Unit> function27222 = function24;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34222 = sliderDefaults$Track$5;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j2222, m2166trackColorWaAFU9c$material3_release22, m2165tickColorWaAFU9c$material3_release3, m2165tickColorWaAFU9c$material3_release22, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f10222, f92, function27222, function34222, false);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(rotate2, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                sliderColors4 = sliderColors52;
                f6 = f5;
                function25 = function24;
                function33 = sliderDefaults$Track$5;
                f7 = f92;
                z5 = z72;
                modifier2 = modifier32;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i9;
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            i8 = i3;
            f5 = f8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            long m2166trackColorWaAFU9c$material3_release32 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
            final long m2166trackColorWaAFU9c$material3_release222 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
            Function2<? super DrawScope, ? super Offset, Unit> function2622 = function23;
            final float f922 = f4;
            final long m2165tickColorWaAFU9c$material3_release32 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
            final long m2165tickColorWaAFU9c$material3_release222 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
            SliderColors sliderColors522 = sliderColors3;
            Modifier m712height3ABfNKs22 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            Modifier modifier322 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rotate22 = RotateKt.rotate(m712height3ABfNKs22, consume22 != LayoutDirection.Rtl ? 180.0f : 0.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
            boolean z722 = z2;
            boolean changedInstance22 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release222) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release222) | ((29360128 & i8) != 8388608);
            if (((57344 & i8) ^ 24576) <= 16384) {
            }
            j = m2166trackColorWaAFU9c$material3_release32;
            if ((i8 & 24576) != 16384) {
            }
            z3 = true;
            z4 = changedInstance22 | z3 | ((458752 & i8) != 131072);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            final long j22222 = j;
            final float f102222 = f5;
            final Function2<? super DrawScope, ? super Offset, Unit> function272222 = function24;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function342222 = sliderDefaults$Track$5;
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j22222, m2166trackColorWaAFU9c$material3_release222, m2165tickColorWaAFU9c$material3_release32, m2165tickColorWaAFU9c$material3_release222, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f102222, f922, function272222, function342222, false);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(rotate22, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            sliderColors4 = sliderColors522;
            f6 = f5;
            function25 = function24;
            function33 = sliderDefaults$Track$5;
            f7 = f922;
            z5 = z722;
            modifier2 = modifier322;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i9;
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        i8 = i3;
        f5 = f8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        long m2166trackColorWaAFU9c$material3_release322 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
        final long m2166trackColorWaAFU9c$material3_release2222 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
        Function2<? super DrawScope, ? super Offset, Unit> function26222 = function23;
        final float f9222 = f4;
        final long m2165tickColorWaAFU9c$material3_release322 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
        final long m2165tickColorWaAFU9c$material3_release2222 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
        SliderColors sliderColors5222 = sliderColors3;
        Modifier m712height3ABfNKs222 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        Modifier modifier3222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier rotate222 = RotateKt.rotate(m712height3ABfNKs222, consume222 != LayoutDirection.Rtl ? 180.0f : 0.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
        boolean z7222 = z2;
        boolean changedInstance222 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release2222) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release2222) | ((29360128 & i8) != 8388608);
        if (((57344 & i8) ^ 24576) <= 16384) {
        }
        j = m2166trackColorWaAFU9c$material3_release322;
        if ((i8 & 24576) != 16384) {
        }
        z3 = true;
        z4 = changedInstance222 | z3 | ((458752 & i8) != 131072);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        final long j222222 = j;
        final float f1022222 = f5;
        final Function2<? super DrawScope, ? super Offset, Unit> function2722222 = function24;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3422222 = sliderDefaults$Track$5;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), j222222, m2166trackColorWaAFU9c$material3_release2222, m2165tickColorWaAFU9c$material3_release322, m2165tickColorWaAFU9c$material3_release2222, drawScope.mo369toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo370toDpu2uoSUM(0), drawScope.mo369toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f1022222, f9222, function2722222, function3422222, false);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CanvasKt.Canvas(rotate222, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        sliderColors4 = sliderColors5222;
        f6 = f5;
        function25 = function24;
        function33 = sliderDefaults$Track$5;
        f7 = f9222;
        z5 = z7222;
        modifier2 = modifier3222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SliderColors sliderColors2;
        int i4;
        boolean z2;
        SliderColors sliderColors3;
        Modifier modifier3;
        SliderColors sliderColors4;
        boolean z3;
        float f;
        float f2;
        final boolean z4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors3 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors3 = sliderColors2;
                        }
                        if (i4 != 0) {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617869097, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            m2173Track4EFweAY(rangeSliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            sliderColors2 = sliderColors4;
                            z4 = z3;
                        } else {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                    }
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    m2173Track4EFweAY(rangeSliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors4;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            SliderDefaults.this.Track(rangeSliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2173Track4EFweAY(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        int i7;
        float f3;
        Modifier.Companion companion;
        final SliderColors sliderColors3;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        SliderDefaults$Track$10 sliderDefaults$Track$10;
        float f4;
        int i8;
        float f5;
        Function2<? super DrawScope, ? super Offset, Unit> function24;
        long j;
        boolean z3;
        boolean z4;
        Object rememberedValue;
        final SliderColors sliderColors4;
        final float f6;
        final Function2<? super DrawScope, ? super Offset, Unit> function25;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        final float f7;
        final boolean z5;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-541824132);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1222@54320L8,1223@54389L232,1245@55370L7,1246@55426L706,1241@55223L909:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        function22 = function2;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i9 = (100663296 & i) == 0 ? startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                sliderColors3 = colors(startRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                            } else {
                                sliderColors3 = sliderColors2;
                            }
                            if ((i2 & 16) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800729349, "CC(remember):Slider.kt#9igjgp");
                                boolean z6 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors3)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z6 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2181invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2181invokeUv8p0NA(DrawScope drawScope, long j2) {
                                            SliderDefaults.INSTANCE.m2169drawStopIndicatorx3O1jOs(drawScope, j2, SliderDefaults.INSTANCE.m2177getTrackStopIndicatorSizeD9Ej5fM(), SliderColors.this.m2166trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function23 = (Function2) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i3 &= -57345;
                            } else {
                                function23 = function22;
                            }
                            sliderDefaults$Track$10 = i5 == 0 ? new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$10
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                    m2178invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m3850unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                public final void m2178invokewPWG1Vc(DrawScope drawScope, long j2, long j3) {
                                    SliderDefaults.INSTANCE.m2169drawStopIndicatorx3O1jOs(drawScope, j2, SliderDefaults.INSTANCE.m2176getTickSizeD9Ej5fM(), j3);
                                }
                            } : function32;
                            float f8 = i6 == 0 ? SliderKt.ThumbTrackGapSize : f;
                            f4 = i7 == 0 ? SliderKt.TrackInsideCornerSize : f3;
                            i8 = i3;
                            f5 = f8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            companion = modifier;
                            sliderColors3 = sliderColors2;
                            f4 = f3;
                            function23 = function22;
                            sliderDefaults$Track$10 = function32;
                            i8 = i3;
                            f5 = f;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-541824132, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
                        }
                        long m2166trackColorWaAFU9c$material3_release = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
                        final long m2166trackColorWaAFU9c$material3_release2 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
                        Function2<? super DrawScope, ? super Offset, Unit> function26 = function23;
                        final float f9 = f4;
                        final long m2165tickColorWaAFU9c$material3_release = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
                        final long m2165tickColorWaAFU9c$material3_release2 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
                        SliderColors sliderColors5 = sliderColors3;
                        Modifier m712height3ABfNKs = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        Modifier modifier3 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier rotate = RotateKt.rotate(m712height3ABfNKs, consume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                        boolean z7 = z2;
                        boolean changedInstance = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release2) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release2) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                            function24 = function26;
                            if (startRestartGroup.changed(function24)) {
                                j = m2166trackColorWaAFU9c$material3_release;
                                z3 = true;
                                z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final long j2 = j;
                                    final float f10 = f5;
                                    final Function2<? super DrawScope, ? super Offset, Unit> function27 = function24;
                                    final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34 = sliderDefaults$Track$10;
                                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DrawScope drawScope) {
                                            SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j2, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f10, f9, function27, function34, true);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                sliderColors4 = sliderColors5;
                                f6 = f5;
                                function25 = function24;
                                function33 = sliderDefaults$Track$10;
                                f7 = f9;
                                z5 = z7;
                                modifier2 = modifier3;
                            }
                        } else {
                            function24 = function26;
                        }
                        j = m2166trackColorWaAFU9c$material3_release;
                        if ((i8 & 24576) != 16384) {
                            z3 = false;
                            z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4) {
                            }
                            final long j22 = j;
                            final float f102 = f5;
                            final Function2<? super DrawScope, ? super Offset, Unit> function272 = function24;
                            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function342 = sliderDefaults$Track$10;
                            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j22, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f102, f9, function272, function342, true);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            sliderColors4 = sliderColors5;
                            f6 = f5;
                            function25 = function24;
                            function33 = sliderDefaults$Track$10;
                            f7 = f9;
                            z5 = z7;
                            modifier2 = modifier3;
                        }
                        z3 = true;
                        z4 = changedInstance | z3 | ((458752 & i8) != 131072);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4) {
                        }
                        final long j222 = j;
                        final float f1022 = f5;
                        final Function2<? super DrawScope, ? super Offset, Unit> function2722 = function24;
                        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3422 = sliderDefaults$Track$10;
                        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j222, m2166trackColorWaAFU9c$material3_release2, m2165tickColorWaAFU9c$material3_release, m2165tickColorWaAFU9c$material3_release2, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f1022, f9, function2722, function3422, true);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(rotate, (Function1) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sliderColors4 = sliderColors5;
                        f6 = f5;
                        function25 = function24;
                        function33 = sliderDefaults$Track$10;
                        f7 = f9;
                        z5 = z7;
                        modifier2 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        z5 = z2;
                        sliderColors4 = sliderColors2;
                        f7 = f3;
                        function25 = function22;
                        function33 = function32;
                        f6 = f;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                SliderDefaults.this.m2173Track4EFweAY(rangeSliderState, modifier2, z5, sliderColors4, function25, function33, f6, f7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                i8 = i3;
                f5 = f8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                long m2166trackColorWaAFU9c$material3_release3 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
                final long m2166trackColorWaAFU9c$material3_release22 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
                Function2<? super DrawScope, ? super Offset, Unit> function262 = function23;
                final float f92 = f4;
                final long m2165tickColorWaAFU9c$material3_release3 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
                final long m2165tickColorWaAFU9c$material3_release22 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
                SliderColors sliderColors52 = sliderColors3;
                Modifier m712height3ABfNKs2 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                Modifier modifier32 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier rotate2 = RotateKt.rotate(m712height3ABfNKs2, consume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                boolean z72 = z2;
                boolean changedInstance2 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release22) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release22) | ((29360128 & i8) != 8388608);
                if (((57344 & i8) ^ 24576) <= 16384) {
                }
                j = m2166trackColorWaAFU9c$material3_release3;
                if ((i8 & 24576) != 16384) {
                }
                z3 = true;
                z4 = changedInstance2 | z3 | ((458752 & i8) != 131072);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                final long j2222 = j;
                final float f10222 = f5;
                final Function2<? super DrawScope, ? super Offset, Unit> function27222 = function24;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34222 = sliderDefaults$Track$10;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j2222, m2166trackColorWaAFU9c$material3_release22, m2165tickColorWaAFU9c$material3_release3, m2165tickColorWaAFU9c$material3_release22, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f10222, f92, function27222, function34222, true);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(rotate2, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                sliderColors4 = sliderColors52;
                f6 = f5;
                function25 = function24;
                function33 = sliderDefaults$Track$10;
                f7 = f92;
                z5 = z72;
                modifier2 = modifier32;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i9;
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            i8 = i3;
            f5 = f8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            long m2166trackColorWaAFU9c$material3_release32 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
            final long m2166trackColorWaAFU9c$material3_release222 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
            Function2<? super DrawScope, ? super Offset, Unit> function2622 = function23;
            final float f922 = f4;
            final long m2165tickColorWaAFU9c$material3_release32 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
            final long m2165tickColorWaAFU9c$material3_release222 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
            SliderColors sliderColors522 = sliderColors3;
            Modifier m712height3ABfNKs22 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            Modifier modifier322 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rotate22 = RotateKt.rotate(m712height3ABfNKs22, consume22 != LayoutDirection.Rtl ? 180.0f : 0.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
            boolean z722 = z2;
            boolean changedInstance22 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release222) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release222) | ((29360128 & i8) != 8388608);
            if (((57344 & i8) ^ 24576) <= 16384) {
            }
            j = m2166trackColorWaAFU9c$material3_release32;
            if ((i8 & 24576) != 16384) {
            }
            z3 = true;
            z4 = changedInstance22 | z3 | ((458752 & i8) != 131072);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            final long j22222 = j;
            final float f102222 = f5;
            final Function2<? super DrawScope, ? super Offset, Unit> function272222 = function24;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function342222 = sliderDefaults$Track$10;
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j22222, m2166trackColorWaAFU9c$material3_release222, m2165tickColorWaAFU9c$material3_release32, m2165tickColorWaAFU9c$material3_release222, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f102222, f922, function272222, function342222, true);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(rotate22, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            sliderColors4 = sliderColors522;
            f6 = f5;
            function25 = function24;
            function33 = sliderDefaults$Track$10;
            f7 = f922;
            z5 = z722;
            modifier2 = modifier322;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i9;
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        i8 = i3;
        f5 = f8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        long m2166trackColorWaAFU9c$material3_release322 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, false);
        final long m2166trackColorWaAFU9c$material3_release2222 = sliderColors3.m2166trackColorWaAFU9c$material3_release(z2, true);
        Function2<? super DrawScope, ? super Offset, Unit> function26222 = function23;
        final float f9222 = f4;
        final long m2165tickColorWaAFU9c$material3_release322 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, false);
        final long m2165tickColorWaAFU9c$material3_release2222 = sliderColors3.m2165tickColorWaAFU9c$material3_release(z2, true);
        SliderColors sliderColors5222 = sliderColors3;
        Modifier m712height3ABfNKs222 = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        Modifier modifier3222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier rotate222 = RotateKt.rotate(m712height3ABfNKs222, consume222 != LayoutDirection.Rtl ? 180.0f : 0.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
        boolean z7222 = z2;
        boolean changedInstance222 = ((i8 & 3670016) != 1048576) | startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2166trackColorWaAFU9c$material3_release2222) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2165tickColorWaAFU9c$material3_release2222) | ((29360128 & i8) != 8388608);
        if (((57344 & i8) ^ 24576) <= 16384) {
        }
        j = m2166trackColorWaAFU9c$material3_release322;
        if ((i8 & 24576) != 16384) {
        }
        z3 = true;
        z4 = changedInstance222 | z3 | ((458752 & i8) != 131072);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        final long j222222 = j;
        final float f1022222 = f5;
        final Function2<? super DrawScope, ? super Offset, Unit> function2722222 = function24;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3422222 = sliderDefaults$Track$10;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                SliderDefaults.INSTANCE.m2170drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), j222222, m2166trackColorWaAFU9c$material3_release2222, m2165tickColorWaAFU9c$material3_release322, m2165tickColorWaAFU9c$material3_release2222, drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo369toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f1022222, f9222, function2722222, function3422222, true);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CanvasKt.Canvas(rotate222, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        sliderColors4 = sliderColors5222;
        f6 = f5;
        function25 = function24;
        function33 = sliderDefaults$Track$10;
        f7 = f9222;
        z5 = z7222;
        modifier2 = modifier3222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    public final void m2170drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z) {
        float f8;
        float f9;
        int i;
        float f10;
        float f11;
        long Offset = OffsetKt.Offset(0.0f, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3668getWidthimpl(drawScope.mo4396getSizeNHjbRc()), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
        float f12 = drawScope.mo373toPx0680j_4(f3);
        long Offset3 = OffsetKt.Offset(Offset.m3599getXimpl(Offset) + ((Offset.m3599getXimpl(Offset2) - Offset.m3599getXimpl(Offset)) * f2), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
        long Offset4 = OffsetKt.Offset(Offset.m3599getXimpl(Offset) + ((Offset.m3599getXimpl(Offset2) - Offset.m3599getXimpl(Offset)) * f), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
        float f13 = 2;
        float f14 = f12 / f13;
        float f15 = drawScope.mo373toPx0680j_4(f7);
        if (Dp.m6298compareTo0680j_4(f6, Dp.m6299constructorimpl(0)) > 0) {
            f8 = (drawScope.mo373toPx0680j_4(f4) / f13) + drawScope.mo373toPx0680j_4(f6);
            f9 = (drawScope.mo373toPx0680j_4(f5) / f13) + drawScope.mo373toPx0680j_4(f6);
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        if (!z || Offset.m3599getXimpl(Offset4) <= Offset.m3599getXimpl(Offset) + f8 + f14) {
            i = 0;
            f10 = f12;
        } else {
            float m3599getXimpl = Offset.m3599getXimpl(Offset);
            i = 0;
            f10 = f12;
            m2171drawTrackPathCx2C_VA(drawScope, Offset.INSTANCE.m3615getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size((Offset.m3599getXimpl(Offset4) - f8) - m3599getXimpl, f12), j, f14, f15);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3588boximpl(OffsetKt.Offset(m3599getXimpl + f14, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
            }
        }
        if (Offset.m3599getXimpl(Offset3) < (Offset.m3599getXimpl(Offset2) - f9) - f14) {
            float m3599getXimpl2 = Offset.m3599getXimpl(Offset3) + f9;
            float m3599getXimpl3 = Offset.m3599getXimpl(Offset2);
            float f16 = f10;
            f11 = f16;
            m2171drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m3599getXimpl2, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(m3599getXimpl3 - m3599getXimpl2, f16), j, f15, f14);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3588boximpl(OffsetKt.Offset(m3599getXimpl3 - f14, Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()))));
            }
        } else {
            f11 = f10;
        }
        float m3599getXimpl4 = z ? Offset.m3599getXimpl(Offset4) + f8 : 0.0f;
        float m3599getXimpl5 = Offset.m3599getXimpl(Offset3) - f9;
        float f17 = z ? f15 : f14;
        float f18 = m3599getXimpl5 - m3599getXimpl4;
        if (f18 > f17) {
            m2171drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m3599getXimpl4, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(f18, f11), j2, f17, f15);
        }
        long Offset5 = OffsetKt.Offset(Offset.m3599getXimpl(Offset) + f14, Offset.m3600getYimpl(Offset));
        long Offset6 = OffsetKt.Offset(Offset.m3599getXimpl(Offset2) - f14, Offset.m3600getYimpl(Offset2));
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(Offset.m3599getXimpl(Offset4) - f8, Offset.m3599getXimpl(Offset4) + f8);
        ClosedFloatingPointRange<Float> rangeTo2 = RangesKt.rangeTo(Offset.m3599getXimpl(Offset3) - f9, Offset.m3599getXimpl(Offset3) + f9);
        int length = fArr.length;
        int i2 = i;
        int i3 = i2;
        while (i3 < length) {
            float f19 = fArr[i3];
            int i4 = i2 + 1;
            int i5 = 1;
            if (function2 == null || ((!z || i2 != 0) && i2 != fArr.length - 1)) {
                if (f19 <= f2 && f19 >= f) {
                    i5 = i;
                }
                long Offset7 = OffsetKt.Offset(Offset.m3599getXimpl(OffsetKt.m3622lerpWko1d7g(Offset5, Offset6, f19)), Offset.m3600getYimpl(drawScope.mo4395getCenterF1C5BW0()));
                if ((!z || !rangeTo.contains(Float.valueOf(Offset.m3599getXimpl(Offset7)))) && !rangeTo2.contains(Float.valueOf(Offset.m3599getXimpl(Offset7)))) {
                    function3.invoke(drawScope, Offset.m3588boximpl(Offset7), Color.m3830boximpl(i5 != 0 ? j3 : j4));
                    i3++;
                    i2 = i4;
                }
            }
            i3++;
            i2 = i4;
        }
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2171drawTrackPathCx2C_VA(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f, f);
        long CornerRadius2 = CornerRadiusKt.CornerRadius(f2, f2);
        RoundRect m3651RoundRectZAM2FJo = RoundRectKt.m3651RoundRectZAM2FJo(RectKt.m3639Recttz77jQw(OffsetKt.Offset(Offset.m3599getXimpl(j), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.m3668getWidthimpl(j2), Size.m3665getHeightimpl(j2))), CornerRadius, CornerRadius2, CornerRadius2, CornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, m3651RoundRectZAM2FJo, null, 2, null);
        DrawScope.m4386drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2169drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m4377drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo373toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2177getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2176getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
