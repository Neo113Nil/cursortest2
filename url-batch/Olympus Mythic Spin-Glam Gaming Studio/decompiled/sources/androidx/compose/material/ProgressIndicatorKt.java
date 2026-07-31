package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0013\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0016\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a9\u0010#\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a9\u0010%\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\"\u001aA\u0010(\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\u0017\u0010)\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010*\"\u0017\u0010+\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010*\"\u0017\u0010,\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b,\u0010*\"\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00103\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"", "progress", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "backgroundColor", "", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicator", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "drawLinearIndicatorBackground", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/Stroke;", VastAttributes.STROKE_COLOR, "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawDeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawIndeterminateCircularIndicator", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "CircularEasing", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProgressIndicatorKt {
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m925getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m2507constructorimpl(240);
    private static final float CircularIndicatorDiameter = Dp.m2507constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005d  */
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m933LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Modifier modifier3;
        final long m796getPrimary0d7_KjU;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-850309746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j3 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j4 = j2;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    m796getPrimary0d7_KjU = (i2 & 4) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m796getPrimary0d7_KjU() : j3;
                    if ((i2 & 8) != 0) {
                        j4 = Color.m1445copywmQWz5c$default(m796getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    m796getPrimary0d7_KjU = j3;
                }
                startRestartGroup.endDefaults();
                Modifier m359sizeVpY3zN4 = SizeKt.m359sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                Color m1441boximpl = Color.m1441boximpl(j4);
                Float valueOf = Float.valueOf(f);
                Color m1441boximpl2 = Color.m1441boximpl(m796getPrimary0d7_KjU);
                startRestartGroup.startReplaceableGroup(1618982084);
                changed = startRestartGroup.changed(m1441boximpl) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(m1441boximpl2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j5 = j4;
                    final long j6 = m796getPrimary0d7_KjU;
                    rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float m1333getHeightimpl = Size.m1333getHeightimpl(Canvas.mo1708getSizeNHjbRc());
                            ProgressIndicatorKt.m954drawLinearIndicatorBackgroundbw27NRU(Canvas, j5, m1333getHeightimpl);
                            ProgressIndicatorKt.m953drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j6, m1333getHeightimpl);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(m359sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                m796getPrimary0d7_KjU = j3;
            }
            final long j7 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
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
                    ProgressIndicatorKt.m933LinearProgressIndicatoreaDK9VM(f, modifier3, m796getPrimary0d7_KjU, j7, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        startRestartGroup.endDefaults();
        Modifier m359sizeVpY3zN42 = SizeKt.m359sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        Color m1441boximpl3 = Color.m1441boximpl(j4);
        Float valueOf2 = Float.valueOf(f);
        Color m1441boximpl22 = Color.m1441boximpl(m796getPrimary0d7_KjU);
        startRestartGroup.startReplaceableGroup(1618982084);
        changed = startRestartGroup.changed(m1441boximpl3) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(m1441boximpl22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j52 = j4;
        final long j62 = m796getPrimary0d7_KjU;
        rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float m1333getHeightimpl = Size.m1333getHeightimpl(Canvas.mo1708getSizeNHjbRc());
                ProgressIndicatorKt.m954drawLinearIndicatorBackgroundbw27NRU(Canvas, j52, m1333getHeightimpl);
                ProgressIndicatorKt.m953drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j62, m1333getHeightimpl);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(m359sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
        final long j72 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final void m932LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final Modifier modifier3;
        final long m796getPrimary0d7_KjU;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
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
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                m796getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m796getPrimary0d7_KjU() : j3;
                if ((i2 & 4) != 0) {
                    j4 = Color.m1445copywmQWz5c$default(m796getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                m796getPrimary0d7_KjU = j3;
            }
            startRestartGroup.endDefaults();
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
            InfiniteRepeatableSpec m106infiniteRepeatable9IiC70o$default = AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 0);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }), null, 0L, 6, null);
            int i7 = InfiniteTransition.$stable;
            int i8 = InfiniteRepeatableSpec.$stable;
            final State animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, m106infiniteRepeatable9IiC70o$default, startRestartGroup, i7 | 432 | (i8 << 9));
            final State animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 333);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
            final State animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 1000);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
            final State animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 1267);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
            Modifier m359sizeVpY3zN4 = SizeKt.m359sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr = {Color.m1441boximpl(j4), animateFloat, animateFloat2, Color.m1441boximpl(m796getPrimary0d7_KjU), animateFloat3, animateFloat4};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i9 = 0; i9 < 6; i9++) {
                z |= startRestartGroup.changed(objArr[i9]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final long j5 = j4;
                final long j6 = m796getPrimary0d7_KjU;
                rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                        float m934LinearProgressIndicator_RIQooxk$lambda1;
                        float m935LinearProgressIndicator_RIQooxk$lambda2;
                        float m936LinearProgressIndicator_RIQooxk$lambda3;
                        float m937LinearProgressIndicator_RIQooxk$lambda4;
                        float m936LinearProgressIndicator_RIQooxk$lambda32;
                        float m937LinearProgressIndicator_RIQooxk$lambda42;
                        float m934LinearProgressIndicator_RIQooxk$lambda12;
                        float m935LinearProgressIndicator_RIQooxk$lambda22;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        float m1333getHeightimpl = Size.m1333getHeightimpl(Canvas.mo1708getSizeNHjbRc());
                        ProgressIndicatorKt.m954drawLinearIndicatorBackgroundbw27NRU(Canvas, j5, m1333getHeightimpl);
                        m934LinearProgressIndicator_RIQooxk$lambda1 = ProgressIndicatorKt.m934LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                        m935LinearProgressIndicator_RIQooxk$lambda2 = ProgressIndicatorKt.m935LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                        if (m934LinearProgressIndicator_RIQooxk$lambda1 - m935LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
                            m934LinearProgressIndicator_RIQooxk$lambda12 = ProgressIndicatorKt.m934LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                            m935LinearProgressIndicator_RIQooxk$lambda22 = ProgressIndicatorKt.m935LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                            ProgressIndicatorKt.m953drawLinearIndicator42QJj7c(Canvas, m934LinearProgressIndicator_RIQooxk$lambda12, m935LinearProgressIndicator_RIQooxk$lambda22, j6, m1333getHeightimpl);
                        }
                        m936LinearProgressIndicator_RIQooxk$lambda3 = ProgressIndicatorKt.m936LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                        m937LinearProgressIndicator_RIQooxk$lambda4 = ProgressIndicatorKt.m937LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                        if (m936LinearProgressIndicator_RIQooxk$lambda3 - m937LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
                            m936LinearProgressIndicator_RIQooxk$lambda32 = ProgressIndicatorKt.m936LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                            m937LinearProgressIndicator_RIQooxk$lambda42 = ProgressIndicatorKt.m937LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                            ProgressIndicatorKt.m953drawLinearIndicator42QJj7c(Canvas, m936LinearProgressIndicator_RIQooxk$lambda32, m937LinearProgressIndicator_RIQooxk$lambda42, j6, m1333getHeightimpl);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m359sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            m796getPrimary0d7_KjU = j3;
        }
        final long j7 = j4;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                ProgressIndicatorKt.m932LinearProgressIndicatorRIQooxk(Modifier.this, m796getPrimary0d7_KjU, j7, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-42QJj7c, reason: not valid java name */
    public static final void m953drawLinearIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, float f3) {
        float m1335getWidthimpl = Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc());
        float m1333getHeightimpl = Size.m1333getHeightimpl(drawScope.mo1708getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        DrawScope.m1698drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset((z ? f : 1.0f - f2) * m1335getWidthimpl, m1333getHeightimpl), OffsetKt.Offset((z ? f2 : 1.0f - f) * m1335getWidthimpl, m1333getHeightimpl), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m954drawLinearIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, float f) {
        m953drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0058  */
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m926CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final long j2;
        int i4;
        float f3;
        final long j3;
        float f4;
        Modifier modifier3;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-409649739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        long m796getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m796getPrimary0d7_KjU() : j2;
                        if (i4 != 0) {
                            modifier3 = modifier4;
                            j3 = m796getPrimary0d7_KjU;
                            f4 = ProgressIndicatorDefaults.INSTANCE.m925getStrokeWidthD9Ej5fM();
                        } else {
                            j3 = m796getPrimary0d7_KjU;
                            f4 = f3;
                            modifier3 = modifier4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j3 = j2;
                        f4 = f3;
                        modifier3 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    final Stroke stroke = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1594getButtKaPHkGw(), 0, null, 26, null);
                    CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.m951drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke);
                        }
                    }, startRestartGroup, 0);
                    modifier2 = modifier3;
                    j2 = j3;
                    f5 = f4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f5 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
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
                        ProgressIndicatorKt.m926CircularProgressIndicatorMBs18nI(f, modifier2, j2, f5, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f3 = f2;
            if ((i3 & 5851) == 1170) {
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
            startRestartGroup.endDefaults();
            final Stroke stroke2 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1594getButtKaPHkGw(), 0, null, 26, null);
            CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.m951drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke2);
                }
            }, startRestartGroup, 0);
            modifier2 = modifier3;
            j2 = j3;
            f5 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i3 & 5851) == 1170) {
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
        startRestartGroup.endDefaults();
        final Stroke stroke22 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m1594getButtKaPHkGw(), 0, null, 26, null);
        CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier3, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                ProgressIndicatorKt.m951drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke22);
            }
        }, startRestartGroup, 0);
        modifier2 = modifier3;
        j2 = j3;
        f5 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m927CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        Modifier modifier3;
        long m796getPrimary0d7_KjU;
        float m925getStrokeWidthD9Ej5fM;
        final Modifier modifier4;
        final long j3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-392089979);
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
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    m796getPrimary0d7_KjU = (i2 & 2) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m796getPrimary0d7_KjU() : j2;
                    if (i6 != 0) {
                        m925getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m925getStrokeWidthD9Ej5fM();
                        startRestartGroup.endDefaults();
                        final Stroke stroke = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(m925getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1596getSquareKaPHkGw(), 0, null, 26, null);
                        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                        TwoWayConverter vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        InfiniteRepeatableSpec m106infiniteRepeatable9IiC70o$default = AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i7 = InfiniteTransition.$stable;
                        int i8 = InfiniteRepeatableSpec.$stable;
                        final State animateValue = InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, vectorConverter, m106infiniteRepeatable9IiC70o$default, startRestartGroup, i7 | 4528 | (i8 << 12));
                        final State animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 286.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
                        final State animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 0);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                            }
                        }), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
                        final State animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                            }
                        }), null, 0L, 6, null), startRestartGroup, i7 | 432 | (i8 << 9));
                        final float f4 = m925getStrokeWidthD9Ej5fM;
                        final long j4 = m796getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                                int m930CircularProgressIndicator_aM_cp0Q$lambda8;
                                float m928CircularProgressIndicator_aM_cp0Q$lambda10;
                                float m929CircularProgressIndicator_aM_cp0Q$lambda11;
                                float m931CircularProgressIndicator_aM_cp0Q$lambda9;
                                float m929CircularProgressIndicator_aM_cp0Q$lambda112;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                m930CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m930CircularProgressIndicator_aM_cp0Q$lambda8(animateValue);
                                m928CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m928CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat2);
                                m929CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                float abs = Math.abs(m928CircularProgressIndicator_aM_cp0Q$lambda10 - m929CircularProgressIndicator_aM_cp0Q$lambda11);
                                m931CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m931CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat);
                                float f5 = (((m930CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m931CircularProgressIndicator_aM_cp0Q$lambda9;
                                m929CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                ProgressIndicatorKt.m952drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m929CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f4, abs, j4, stroke);
                            }
                        }, startRestartGroup, 0);
                        modifier4 = modifier3;
                        j3 = m796getPrimary0d7_KjU;
                        f3 = m925getStrokeWidthD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    m796getPrimary0d7_KjU = j2;
                }
                m925getStrokeWidthD9Ej5fM = f2;
                startRestartGroup.endDefaults();
                final Stroke stroke2 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(m925getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1596getSquareKaPHkGw(), 0, null, 26, null);
                InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                TwoWayConverter vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                InfiniteRepeatableSpec m106infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                int i72 = InfiniteTransition.$stable;
                int i82 = InfiniteRepeatableSpec.$stable;
                final State<Integer> animateValue2 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, vectorConverter2, m106infiniteRepeatable9IiC70o$default2, startRestartGroup, i72 | 4528 | (i82 << 12));
                final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 286.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, i72 | 432 | (i82 << 9));
                final State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 0);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                    }
                }), null, 0L, 6, null), startRestartGroup, i72 | 432 | (i82 << 9));
                final State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), startRestartGroup, i72 | 432 | (i82 << 9));
                final float f42 = m925getStrokeWidthD9Ej5fM;
                final long j42 = m796getPrimary0d7_KjU;
                CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                        int m930CircularProgressIndicator_aM_cp0Q$lambda8;
                        float m928CircularProgressIndicator_aM_cp0Q$lambda10;
                        float m929CircularProgressIndicator_aM_cp0Q$lambda11;
                        float m931CircularProgressIndicator_aM_cp0Q$lambda9;
                        float m929CircularProgressIndicator_aM_cp0Q$lambda112;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m930CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m930CircularProgressIndicator_aM_cp0Q$lambda8(animateValue2);
                        m928CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m928CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat22);
                        m929CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        float abs = Math.abs(m928CircularProgressIndicator_aM_cp0Q$lambda10 - m929CircularProgressIndicator_aM_cp0Q$lambda11);
                        m931CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m931CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat4);
                        float f5 = (((m930CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m931CircularProgressIndicator_aM_cp0Q$lambda9;
                        m929CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        ProgressIndicatorKt.m952drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m929CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f42, abs, j42, stroke2);
                    }
                }, startRestartGroup, 0);
                modifier4 = modifier3;
                j3 = m796getPrimary0d7_KjU;
                f3 = m925getStrokeWidthD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j3 = j2;
                f3 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
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
                    ProgressIndicatorKt.m927CircularProgressIndicatoraMcp0Q(Modifier.this, j3, f3, composer2, i | 1, i2);
                }
            });
            return;
        }
        f2 = f;
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i6 != 0) {
        }
        m925getStrokeWidthD9Ej5fM = f2;
        startRestartGroup.endDefaults();
        final Stroke stroke22 = new Stroke(((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo271toPx0680j_4(m925getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m1596getSquareKaPHkGw(), 0, null, 26, null);
        InfiniteTransition rememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
        TwoWayConverter vectorConverter22 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        InfiniteRepeatableSpec m106infiniteRepeatable9IiC70o$default22 = AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
        int i722 = InfiniteTransition.$stable;
        int i822 = InfiniteRepeatableSpec.$stable;
        final State<Integer> animateValue22 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition22, 0, 5, vectorConverter22, m106infiniteRepeatable9IiC70o$default22, startRestartGroup, i722 | 4528 | (i822 << 12));
        final State<Float> animateFloat42 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, 286.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, i722 | 432 | (i822 << 9));
        final State<Float> animateFloat222 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                CubicBezierEasing cubicBezierEasing;
                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), 0);
                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at(Float.valueOf(290.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
            }
        }), null, 0L, 6, null), startRestartGroup, i722 | 432 | (i822 << 9));
        final State<Float> animateFloat322 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition22, 0.0f, 290.0f, AnimationSpecKt.m106infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeyframesSpec.KeyframesSpecConfig<Float>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                CubicBezierEasing cubicBezierEasing;
                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                keyframes.setDurationMillis(1332);
                KeyframesSpec.KeyframeEntity at = keyframes.at(Float.valueOf(0.0f), TTAdConstant.STYLE_SIZE_RADIO_2_3);
                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                keyframes.with(at, cubicBezierEasing);
                keyframes.at(Float.valueOf(290.0f), keyframes.getDurationMillis());
            }
        }), null, 0L, 6, null), startRestartGroup, i722 | 432 | (i822 << 9));
        final float f422 = m925getStrokeWidthD9Ej5fM;
        final long j422 = m796getPrimary0d7_KjU;
        CanvasKt.Canvas(SizeKt.m357size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                int m930CircularProgressIndicator_aM_cp0Q$lambda8;
                float m928CircularProgressIndicator_aM_cp0Q$lambda10;
                float m929CircularProgressIndicator_aM_cp0Q$lambda11;
                float m931CircularProgressIndicator_aM_cp0Q$lambda9;
                float m929CircularProgressIndicator_aM_cp0Q$lambda112;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                m930CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m930CircularProgressIndicator_aM_cp0Q$lambda8(animateValue22);
                m928CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m928CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat222);
                m929CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                float abs = Math.abs(m928CircularProgressIndicator_aM_cp0Q$lambda10 - m929CircularProgressIndicator_aM_cp0Q$lambda11);
                m931CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m931CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat42);
                float f5 = (((m930CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m931CircularProgressIndicator_aM_cp0Q$lambda9;
                m929CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m929CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat322);
                ProgressIndicatorKt.m952drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m929CircularProgressIndicator_aM_cp0Q$lambda112 + f5, f422, abs, j422, stroke22);
            }
        }, startRestartGroup, 0);
        modifier4 = modifier3;
        j3 = m796getPrimary0d7_KjU;
        f3 = m925getStrokeWidthD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m950drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m1335getWidthimpl = Size.m1335getWidthimpl(drawScope.mo1708getSizeNHjbRc()) - (f3 * width);
        DrawScope.m1693drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m1335getWidthimpl, m1335getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m951drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m950drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m952drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m950drawCircularIndicator42QJj7c(drawScope, f + (((f2 / Dp.m2507constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-1, reason: not valid java name */
    public static final float m934LinearProgressIndicator_RIQooxk$lambda1(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-2, reason: not valid java name */
    public static final float m935LinearProgressIndicator_RIQooxk$lambda2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-3, reason: not valid java name */
    public static final float m936LinearProgressIndicator_RIQooxk$lambda3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-4, reason: not valid java name */
    public static final float m937LinearProgressIndicator_RIQooxk$lambda4(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8, reason: not valid java name */
    public static final int m930CircularProgressIndicator_aM_cp0Q$lambda8(State state) {
        return ((Number) state.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9, reason: not valid java name */
    public static final float m931CircularProgressIndicator_aM_cp0Q$lambda9(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10, reason: not valid java name */
    public static final float m928CircularProgressIndicator_aM_cp0Q$lambda10(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11, reason: not valid java name */
    public static final float m929CircularProgressIndicator_aM_cp0Q$lambda11(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
