package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import io.appmetrica.analytics.impl.M2;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\r\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001d\u001a\u00020\u001a*\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010&\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", "color", "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", M2.g, "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "v", "saturate", "(F)F", "toArgb-8_81llA", "(J)I", "toArgb", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ColorKt {
    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f <= colorSpace.getMaxValue(0) && minValue <= f) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f2 <= colorSpace.getMaxValue(1) && minValue2 <= f2) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f3 <= colorSpace.getMaxValue(2) && minValue3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.getIsSrgb()) {
                        return Color.m1442constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int id = colorSpace.getId();
                    if (id == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short m1485constructorimpl = Float16.m1485constructorimpl(f);
                    return Color.m1442constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(Float16.m1485constructorimpl(f2)) & 65535) << 32) | ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(m1485constructorimpl) & 65535) << 48)) | ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(Float16.m1485constructorimpl(f3)) & 65535) << 16)) | ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m8077constructorimpl(ULong.m8077constructorimpl(id) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static final long Color(int i) {
        return Color.m1442constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m1442constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(ULong.m8077constructorimpl(j) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1469lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m1443convertvNxB06k = Color.m1443convertvNxB06k(j, oklab);
        long m1443convertvNxB06k2 = Color.m1443convertvNxB06k(j2, oklab);
        float m1448getAlphaimpl = Color.m1448getAlphaimpl(m1443convertvNxB06k);
        float m1452getRedimpl = Color.m1452getRedimpl(m1443convertvNxB06k);
        float m1451getGreenimpl = Color.m1451getGreenimpl(m1443convertvNxB06k);
        float m1449getBlueimpl = Color.m1449getBlueimpl(m1443convertvNxB06k);
        float m1448getAlphaimpl2 = Color.m1448getAlphaimpl(m1443convertvNxB06k2);
        float m1452getRedimpl2 = Color.m1452getRedimpl(m1443convertvNxB06k2);
        float m1451getGreenimpl2 = Color.m1451getGreenimpl(m1443convertvNxB06k2);
        float m1449getBlueimpl2 = Color.m1449getBlueimpl(m1443convertvNxB06k2);
        return Color.m1443convertvNxB06k(Color(MathHelpersKt.lerp(m1452getRedimpl, m1452getRedimpl2, f), MathHelpersKt.lerp(m1451getGreenimpl, m1451getGreenimpl2, f), MathHelpersKt.lerp(m1449getBlueimpl, m1449getBlueimpl2, f), MathHelpersKt.lerp(m1448getAlphaimpl, m1448getAlphaimpl2, f), oklab), Color.m1450getColorSpaceimpl(j2));
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1467compositeOverOWjLjI(long j, long j2) {
        long m1443convertvNxB06k = Color.m1443convertvNxB06k(j, Color.m1450getColorSpaceimpl(j2));
        float m1448getAlphaimpl = Color.m1448getAlphaimpl(j2);
        float m1448getAlphaimpl2 = Color.m1448getAlphaimpl(m1443convertvNxB06k);
        float f = 1.0f - m1448getAlphaimpl2;
        float f2 = (m1448getAlphaimpl * f) + m1448getAlphaimpl2;
        return Color(f2 == 0.0f ? 0.0f : ((Color.m1452getRedimpl(m1443convertvNxB06k) * m1448getAlphaimpl2) + ((Color.m1452getRedimpl(j2) * m1448getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m1451getGreenimpl(m1443convertvNxB06k) * m1448getAlphaimpl2) + ((Color.m1451getGreenimpl(j2) * m1448getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((Color.m1449getBlueimpl(m1443convertvNxB06k) * m1448getAlphaimpl2) + ((Color.m1449getBlueimpl(j2) * m1448getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m1450getColorSpaceimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    public static final float[] m1468getComponents8_81llA(long j) {
        return new float[]{Color.m1452getRedimpl(j), Color.m1451getGreenimpl(j), Color.m1449getBlueimpl(j), Color.m1448getAlphaimpl(j)};
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1470luminance8_81llA(long j) {
        ColorSpace m1450getColorSpaceimpl = Color.m1450getColorSpaceimpl(j);
        if (!ColorModel.m1637equalsimpl0(m1450getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m1643getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m1640toStringimpl(m1450getColorSpaceimpl.getModel()))).toString());
        }
        Function1 eotf = ((Rgb) m1450getColorSpaceimpl).getEotf();
        return saturate((float) ((((Number) eotf.invoke(Double.valueOf(Color.m1452getRedimpl(j)))).doubleValue() * 0.2126d) + (((Number) eotf.invoke(Double.valueOf(Color.m1451getGreenimpl(j)))).doubleValue() * 0.7152d) + (((Number) eotf.invoke(Double.valueOf(Color.m1449getBlueimpl(j)))).doubleValue() * 0.0722d)));
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1471toArgb8_81llA(long j) {
        ColorSpace m1450getColorSpaceimpl = Color.m1450getColorSpaceimpl(j);
        if (m1450getColorSpaceimpl.getIsSrgb()) {
            return (int) ULong.m8077constructorimpl(j >>> 32);
        }
        float[] m1468getComponents8_81llA = m1468getComponents8_81llA(j);
        ColorSpaceKt.m1647connectYBCOT_4$default(m1450getColorSpaceimpl, null, 0, 3, null).transform(m1468getComponents8_81llA);
        return ((int) ((m1468getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m1468getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m1468getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m1468getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }
}
