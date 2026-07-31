package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2876toDpGaN1DYA(Density density, long j) {
            return Density.super.mo1784toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2883toSp0xMU5do(Density density, float f) {
            return Density.super.mo1791toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2881toPx0680j_4(Density density, float f) {
            return Density.super.mo1789toPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2875roundToPx0680j_4(Density density, float f) {
            return Density.super.mo1783roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2880toPxR2X_6o(Density density, long j) {
            return Density.super.mo1788toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2874roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo1782roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2878toDpu2uoSUM(Density density, int i) {
            return Density.super.mo1786toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2885toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo1793toSpkPz2Gy4(i);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2877toDpu2uoSUM(Density density, float f) {
            return Density.super.mo1785toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2884toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo1792toSpkPz2Gy4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2882toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo1790toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2879toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo1787toDpSizekrfVVM(j);
        }
    }

    /* renamed from: toPx-0680j_4 */
    default float mo1789toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo1783roundToPx0680j_4(float f) {
        float mo1789toPx0680j_4 = mo1789toPx0680j_4(f);
        if (Float.isInfinite(mo1789toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return MathKt.roundToInt(mo1789toPx0680j_4);
    }

    /* renamed from: toPx--R2X_6o */
    default float mo1788toPxR2X_6o(long j) {
        if (!TextUnitType.m3107equalsimpl0(TextUnit.m3078getTypeUIouoOA(j), TextUnitType.INSTANCE.m3112getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return mo1789toPx0680j_4(mo1784toDpGaN1DYA(j));
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo1782roundToPxR2X_6o(long j) {
        return MathKt.roundToInt(mo1788toPxR2X_6o(j));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo1786toDpu2uoSUM(int i) {
        return Dp.m2888constructorimpl(i / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo1793toSpkPz2Gy4(int i) {
        return mo1791toSp0xMU5do(mo1786toDpu2uoSUM(i));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo1785toDpu2uoSUM(float f) {
        return Dp.m2888constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo1792toSpkPz2Gy4(float f) {
        return mo1791toSp0xMU5do(mo1785toDpu2uoSUM(f));
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo1789toPx0680j_4(dpRect.m2971getLeftD9Ej5fM()), mo1789toPx0680j_4(dpRect.m2973getTopD9Ej5fM()), mo1789toPx0680j_4(dpRect.m2972getRightD9Ej5fM()), mo1789toPx0680j_4(dpRect.m2970getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo1790toSizeXkaWNTQ(long j) {
        if (j != DpSize.INSTANCE.m2995getUnspecifiedMYxV2XQ()) {
            return SizeKt.Size(mo1789toPx0680j_4(DpSize.m2986getWidthD9Ej5fM(j)), mo1789toPx0680j_4(DpSize.m2984getHeightD9Ej5fM(j)));
        }
        return Size.INSTANCE.m370getUnspecifiedNHjbRc();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo1787toDpSizekrfVVM(long j) {
        if (j != Size.INSTANCE.m370getUnspecifiedNHjbRc()) {
            return DpKt.m2910DpSizeYgX7TsA(mo1785toDpu2uoSUM(Size.m362getWidthimpl(j)), mo1785toDpu2uoSUM(Size.m359getHeightimpl(j)));
        }
        return DpSize.INSTANCE.m2995getUnspecifiedMYxV2XQ();
    }
}
