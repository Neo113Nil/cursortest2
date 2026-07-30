package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;
import com.github.mikephil.charting.utils.i;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.mHue = f8;
        this.mChroma = f9;
        this.mJ = f10;
        this.mQ = f11;
        this.mM = f12;
        this.mS = f13;
        this.mJstar = f14;
        this.mAstar = f15;
        this.mBstar = f16;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 100.0d) float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        CamColor camColor = null;
        float f13 = 1000.0f;
        float f14 = 0.0f;
        while (Math.abs(f14 - f11) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f15 = ((f11 - f14) / 2.0f) + f14;
            int viewedInSrgb = fromJch(f15, f9, f8).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f10 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f8));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f12 = abs;
                    f13 = distance;
                }
            }
            if (f12 == 0.0f && f13 == 0.0f) {
                break;
            }
            if (lStarFromInt < f10) {
                f14 = f15;
            } else {
                f11 = f15;
            }
        }
        return camColor;
    }

    @NonNull
    static CamColor fromColor(@ColorInt int i8) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i8, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void fromColorInViewingConditions(@ColorInt int i8, @NonNull ViewingConditions viewingConditions, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        CamUtils.xyzFromInt(i8, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f8 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f9 = fArr4[0] * f8;
        float f10 = fArr2[1];
        float f11 = f9 + (fArr4[1] * f10);
        float f12 = fArr2[2];
        float f13 = f11 + (fArr4[2] * f12);
        float[] fArr5 = fArr3[1];
        float f14 = (fArr5[0] * f8) + (fArr5[1] * f10) + (fArr5[2] * f12);
        float[] fArr6 = fArr3[2];
        float f15 = (f8 * fArr6[0]) + (f10 * fArr6[1]) + (f12 * fArr6[2]);
        float f16 = viewingConditions.getRgbD()[0] * f13;
        float f17 = viewingConditions.getRgbD()[1] * f14;
        float f18 = viewingConditions.getRgbD()[2] * f15;
        float pow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f18)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d8 = signum3;
        float f19 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d8)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d8 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f23 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c8 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d9 = f24;
        float cos = ((float) Math.cos(d9)) * log;
        float sin = log * ((float) Math.sin(d9));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = c8;
            fArr[2] = flRoot;
            fArr[3] = sqrt2;
            fArr[4] = f25;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 360.0d) float f10) {
        return fromJchInFrame(f8, f9, f10, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 360.0d) float f10, ViewingConditions viewingConditions) {
        float c8 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f8 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f9 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f9 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f11 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f10) / 180.0f;
        return new CamColor(f10, f9, f8, c8, flRoot, sqrt, f11, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static void getM3HCTfromColor(@ColorInt int i8, @NonNull @Size(3) float[] fArr) {
        fromColorInViewingConditions(i8, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i8);
    }

    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 100.0d) float f10) {
        return toColor(f8, f9, f10, ViewingConditions.DEFAULT);
    }

    float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = Double.NEGATIVE_INFINITY, fromInclusive = false, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = 360.0d, toInclusive = false)
    float getHue() {
        return this.mHue;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = 100.0d)
    float getJ() {
        return this.mJ;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = 100.0d)
    float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getM() {
        return this.mM;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getQ() {
        return this.mQ;
    }

    @FloatRange(from = i.DOUBLE_EPSILON, to = Double.POSITIVE_INFINITY, toInclusive = false)
    float getS() {
        return this.mS;
    }

    @ColorInt
    int viewed(@NonNull ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((((double) getChroma()) == i.DOUBLE_EPSILON || ((double) getJ()) == i.DOUBLE_EPSILON) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = cos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f8 = (((0.305f + nbb) * 23.0f) * pow) / (((nc * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f9 = cos2 * f8;
        float f10 = f8 * sin;
        float f11 = nbb * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float signum = Math.signum(f12) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(i.DOUBLE_EPSILON, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum2 = Math.signum(f13) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(i.DOUBLE_EPSILON, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float signum3 = Math.signum(((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(i.DOUBLE_EPSILON, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f14 = signum / viewingConditions.getRgbD()[0];
        float f15 = signum2 / viewingConditions.getRgbD()[1];
        float f16 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    @ColorInt
    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    @ColorInt
    static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f9, @FloatRange(from = 0.0d, to = 100.0d) float f10, @NonNull ViewingConditions viewingConditions) {
        if (f9 < 1.0d || Math.round(f10) <= i.DOUBLE_EPSILON || Math.round(f10) >= 100.0d) {
            return CamUtils.intFromLStar(f10);
        }
        float min = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
        float f11 = f9;
        CamColor camColor = null;
        float f12 = 0.0f;
        boolean z7 = true;
        while (Math.abs(f12 - f9) >= 0.4f) {
            CamColor findCamByJ = findCamByJ(min, f11, f10);
            if (!z7) {
                if (findCamByJ == null) {
                    f9 = f11;
                } else {
                    f12 = f11;
                    camColor = findCamByJ;
                }
                f11 = ((f9 - f12) / 2.0f) + f12;
            } else {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                f11 = ((f9 - f12) / 2.0f) + f12;
                z7 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f10) : camColor.viewed(viewingConditions);
    }
}
