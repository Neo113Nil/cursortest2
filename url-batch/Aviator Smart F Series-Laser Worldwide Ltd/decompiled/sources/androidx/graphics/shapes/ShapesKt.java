package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.graphics.shapes.RoundedPolygon;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import j6.m;
import j6.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class ShapesKt {
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion) {
        s.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i8, float f8, float f9, float f10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 8;
        }
        if ((i9 & 2) != 0) {
            f8 = 1.0f;
        }
        if ((i9 & 4) != 0) {
            f9 = 0.0f;
        }
        if ((i9 & 8) != 0) {
            f10 = 0.0f;
        }
        return circle(companion, i8, f8, f9, f10);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion) {
        s.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f8, float f9, float f10, float f11, float f12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 2.0f;
        }
        return pill(companion, f8, (i8 & 2) != 0 ? 1.0f : f9, (i8 & 4) != 0 ? 0.0f : f10, (i8 & 8) != 0 ? 0.0f : f11, (i8 & 16) == 0 ? f12 : 0.0f);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion) {
        s.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f8, float f9, int i8, float f10, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f11, float f12, float f13, float f14, int i9, Object obj) {
        return pillStar(companion, (i9 & 1) != 0 ? 2.0f : f8, (i9 & 2) != 0 ? 1.0f : f9, (i9 & 4) != 0 ? 8 : i8, (i9 & 8) != 0 ? 0.5f : f10, (i9 & 16) != 0 ? CornerRounding.Unrounded : cornerRounding, (i9 & 32) != 0 ? null : cornerRounding2, (i9 & 64) == 0 ? list : null, (i9 & 128) == 0 ? f11 : 0.5f, (i9 & 256) != 0 ? 0.0f : f12, (i9 & 512) != 0 ? 0.0f : f13, (i9 & 1024) == 0 ? f14 : 0.0f);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i8, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        float coerceAtLeast;
        float coerceAtLeast2;
        float f15;
        float f16;
        float f17;
        long j8;
        long m8constructorimpl;
        float f18 = f10;
        float min = Math.min(f8, f9);
        coerceAtLeast = v.coerceAtLeast(f9 - f8, 0.0f);
        coerceAtLeast2 = v.coerceAtLeast(f8 - f9, 0.0f);
        float f19 = 2;
        float f20 = coerceAtLeast / f19;
        float f21 = coerceAtLeast2 / f19;
        float twoPi = Utils.getTwoPi() * min * Utils.interpolate(f18, 1.0f, f11);
        float f22 = (f19 * coerceAtLeast2) + (f19 * coerceAtLeast) + twoPi;
        float f23 = twoPi / 4;
        float f24 = f20 + f23;
        float f25 = f24 + coerceAtLeast2;
        float f26 = f25 + f23;
        float f27 = f26 + coerceAtLeast;
        float f28 = f27 + f23;
        float f29 = f28 + coerceAtLeast2;
        float f30 = f29 + f23;
        float[] fArr = {0.0f, f20, f24, f25, f26, f27, f28, f29, f30, f30 + f20, f22};
        int i9 = i8 * 2;
        float f31 = f22 / i9;
        float f32 = f12 * f22;
        float[] fArr2 = new float[i8 * 4];
        long m8constructorimpl2 = FloatFloatPair.m8constructorimpl(f21, f20);
        float f33 = -f21;
        long m8constructorimpl3 = FloatFloatPair.m8constructorimpl(f33, f20);
        float f34 = -f20;
        long j9 = m8constructorimpl2;
        long m8constructorimpl4 = FloatFloatPair.m8constructorimpl(f33, f34);
        long m8constructorimpl5 = FloatFloatPair.m8constructorimpl(f21, f34);
        float f35 = f20;
        int i10 = 0;
        float f36 = 0.0f;
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i9) {
            float f37 = f32 % f22;
            if (f37 < f36) {
                i11 = 0;
            }
            while (true) {
                int i13 = (i11 + 1) % 11;
                float f38 = fArr[i13];
                if (f37 >= f38) {
                    f35 = fArr[(i13 + 1) % 11];
                    i11 = i13;
                    f36 = f38;
                } else {
                    float f39 = (f37 - f36) / (f35 - f36);
                    float f40 = z7 ? min * f18 : min;
                    switch (i11) {
                        case 0:
                            f15 = min;
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            m8constructorimpl = FloatFloatPair.m8constructorimpl(f40, f39 * f20);
                            break;
                        case 1:
                            f15 = min;
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            m8constructorimpl = PointKt.m58plusybeJwSQ(Utils.m74radialToCartesianL6JJ3z0$default(f40, (f39 * Utils.getFloatPi()) / f19, 0L, 4, null), j8);
                            break;
                        case 2:
                            f15 = min;
                            f16 = coerceAtLeast;
                            f17 = f33;
                            m8constructorimpl = FloatFloatPair.m8constructorimpl(f21 - (f39 * coerceAtLeast2), f40);
                            j8 = j9;
                            break;
                        case 3:
                            f15 = min;
                            f16 = coerceAtLeast;
                            f17 = f33;
                            m8constructorimpl = PointKt.m58plusybeJwSQ(Utils.m74radialToCartesianL6JJ3z0$default(f40, (Utils.getFloatPi() / f19) + ((f39 * Utils.getFloatPi()) / f19), 0L, 4, null), m8constructorimpl3);
                            j8 = j9;
                            break;
                        case 4:
                            f15 = min;
                            m8constructorimpl = FloatFloatPair.m8constructorimpl(-f40, f20 - (f39 * coerceAtLeast));
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            break;
                        case 5:
                            f15 = min;
                            m8constructorimpl = PointKt.m58plusybeJwSQ(Utils.m74radialToCartesianL6JJ3z0$default(f40, Utils.getFloatPi() + ((f39 * Utils.getFloatPi()) / f19), 0L, 4, null), m8constructorimpl4);
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            break;
                        case 6:
                            f15 = min;
                            m8constructorimpl = FloatFloatPair.m8constructorimpl(f33 + (f39 * coerceAtLeast2), -f40);
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            break;
                        case 7:
                            f15 = min;
                            m8constructorimpl = PointKt.m58plusybeJwSQ(Utils.m74radialToCartesianL6JJ3z0$default(f40, (Utils.getFloatPi() * 1.5f) + ((f39 * Utils.getFloatPi()) / f19), 0L, 4, null), m8constructorimpl5);
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            break;
                        default:
                            f15 = min;
                            m8constructorimpl = FloatFloatPair.m8constructorimpl(f40, f34 + (f39 * f20));
                            f16 = coerceAtLeast;
                            f17 = f33;
                            j8 = j9;
                            break;
                    }
                    int i14 = i12 + 1;
                    fArr2[i12] = PointKt.m54getXDnnuFBc(m8constructorimpl) + f13;
                    i12 += 2;
                    fArr2[i14] = PointKt.m55getYDnnuFBc(m8constructorimpl) + f14;
                    f32 += f31;
                    z7 = !z7;
                    i10++;
                    f18 = f10;
                    j9 = j8;
                    min = f15;
                    coerceAtLeast = f16;
                    f33 = f17;
                }
            }
        }
        return fArr2;
    }

    public static final RoundedPolygon rectangle(RoundedPolygon.Companion companion, float f8, float f9, CornerRounding rounding, List<CornerRounding> list, float f10, float f11) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        float f12 = 2;
        float f13 = f8 / f12;
        float f14 = f10 - f13;
        float f15 = f9 / f12;
        float f16 = f11 - f15;
        float f17 = f13 + f10;
        float f18 = f15 + f11;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f17, f18, f14, f18, f14, f16, f17, f16}, rounding, list, f10, f11);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f8, float f9, CornerRounding cornerRounding, List list, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 2.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 2.0f;
        }
        if ((i8 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i8 & 8) != 0) {
            list = null;
        }
        if ((i8 & 16) != 0) {
            f10 = 0.0f;
        }
        if ((i8 & 32) != 0) {
            f11 = 0.0f;
        }
        return rectangle(companion, f8, f9, cornerRounding, list, f10, f11);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8) {
        s.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i8, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, GattError.GATT_PRC_IN_PROGRESS, null);
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f10, float f11, int i9, Object obj) {
        return star(companion, i8, (i9 & 2) != 0 ? 1.0f : f8, (i9 & 4) != 0 ? 0.5f : f9, (i9 & 8) != 0 ? CornerRounding.Unrounded : cornerRounding, (i9 & 16) != 0 ? null : cornerRounding2, (i9 & 32) == 0 ? list : null, (i9 & 64) != 0 ? 0.0f : f10, (i9 & 128) == 0 ? f11 : 0.0f);
    }

    private static final float[] starVerticesFromNumVerts(int i8, float f8, float f9, float f10, float f11) {
        float[] fArr = new float[i8 * 4];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            float f12 = i8;
            long m74radialToCartesianL6JJ3z0$default = Utils.m74radialToCartesianL6JJ3z0$default(f8, (Utils.getFloatPi() / f12) * 2 * i10, 0L, 4, null);
            fArr[i9] = PointKt.m54getXDnnuFBc(m74radialToCartesianL6JJ3z0$default) + f10;
            fArr[i9 + 1] = PointKt.m55getYDnnuFBc(m74radialToCartesianL6JJ3z0$default) + f11;
            long m74radialToCartesianL6JJ3z0$default2 = Utils.m74radialToCartesianL6JJ3z0$default(f9, (Utils.getFloatPi() / f12) * ((i10 * 2) + 1), 0L, 4, null);
            int i11 = i9 + 3;
            fArr[i9 + 2] = PointKt.m54getXDnnuFBc(m74radialToCartesianL6JJ3z0$default2) + f10;
            i9 += 4;
            fArr[i11] = PointKt.m55getYDnnuFBc(m74radialToCartesianL6JJ3z0$default2) + f11;
        }
        return fArr;
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i8) {
        s.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8) {
        s.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f8, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8) {
        s.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f8, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8) {
        s.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i8, f8, 0.0f, null, null, null, 0.0f, 0.0f, 252, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i8, float f8) {
        s.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i8, f8, 0.0f, 0.0f, 12, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f9) {
        s.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f8, f9, 0.0f, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9) {
        s.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f8, f9, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9) {
        s.checkNotNullParameter(companion, "<this>");
        return star$default(companion, i8, f8, f9, null, null, null, 0.0f, 0.0f, 248, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i8, float f8, float f9) {
        s.checkNotNullParameter(companion, "<this>");
        return circle$default(companion, i8, f8, f9, 0.0f, 8, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f9, float f10) {
        s.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f8, f9, f10, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8) {
        s.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f8, f9, i8, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding rounding) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i8, f8, f9, rounding, null, null, 0.0f, 0.0f, 240, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, @IntRange(from = 3) int i8, float f8, float f9, float f10) {
        s.checkNotNullParameter(companion, "<this>");
        if (i8 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i8, f8 / ((float) Math.cos(Utils.getFloatPi() / i8)), f9, f10, new CornerRounding(f8, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f9, float f10, float f11) {
        s.checkNotNullParameter(companion, "<this>");
        return pill$default(companion, f8, f9, f10, f11, 0.0f, 16, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10) {
        s.checkNotNullParameter(companion, "<this>");
        return pillStar$default(companion, f8, f9, i8, f10, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding rounding, CornerRounding cornerRounding) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i8, f8, f9, rounding, cornerRounding, null, 0.0f, 0.0f, 224, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f8, float f9, float f10, float f11, float f12) {
        s.checkNotNullParameter(companion, "<this>");
        if (f8 > 0.0f && f9 > 0.0f) {
            float f13 = 2;
            float f14 = f8 / f13;
            float f15 = f9 / f13;
            float f16 = f14 + f11;
            float f17 = f15 + f12;
            float f18 = (-f14) + f11;
            float f19 = (-f15) + f12;
            return RoundedPolygonKt.RoundedPolygon$default(new float[]{f16, f17, f18, f17, f18, f19, f16, f19}, new CornerRounding(Math.min(f14, f15), f10), null, f11, f12, 4, null);
        }
        throw new IllegalArgumentException("Pill shapes must have positive width and height");
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i8, f8, f9, rounding, cornerRounding, list, 0.0f, 0.0f, PsExtractor.AUDIO_STREAM, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, cornerRounding, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f10) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return star$default(companion, i8, f8, f9, rounding, cornerRounding, list, f10, 0.0f, 128, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, cornerRounding, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i8, float f8, float f9, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f10, float f11) {
        m until;
        List listOf;
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        if (f8 <= 0.0f || f9 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f9 < f8) {
            if (list == null && cornerRounding != null) {
                until = v.until(0, i8);
                ArrayList arrayList = new ArrayList();
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    ((f0) it).nextInt();
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding});
                    kotlin.collections.v.addAll(arrayList, listOf);
                }
                list = arrayList;
            }
            return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i8, f8, f9, f10, f11), rounding, list, f10, f11);
        }
        throw new IllegalArgumentException("innerRadius must be less than radius");
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, cornerRounding, list, f11, 0.0f, 0.0f, 0.0f, 1792, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, cornerRounding, list, f11, f12, 0.0f, 0.0f, 1536, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13) {
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        return pillStar$default(companion, f8, f9, i8, f10, rounding, cornerRounding, list, f11, f12, f13, 0.0f, 1024, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f8, float f9, int i8, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, float f13, float f14) {
        List<CornerRounding> list2;
        m until;
        List listOf;
        s.checkNotNullParameter(companion, "<this>");
        s.checkNotNullParameter(rounding, "rounding");
        if (f8 <= 0.0f || f9 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f10 > 0.0f && f10 <= 1.0f) {
            if (list != null || cornerRounding == null) {
                list2 = list;
            } else {
                until = v.until(0, i8);
                ArrayList arrayList = new ArrayList();
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    ((f0) it).nextInt();
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CornerRounding[]{rounding, cornerRounding});
                    kotlin.collections.v.addAll(arrayList, listOf);
                }
                list2 = arrayList;
            }
            return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i8, f8, f9, f10, f11, f12, f13, f14), rounding, list2, f13, f14);
        }
        throw new IllegalArgumentException("innerRadius must be between 0 and 1");
    }
}
