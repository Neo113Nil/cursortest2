package androidx.graphics.shapes;

import androidx.annotation.IntRange;
import androidx.collection.FloatFloatPair;
import androidx.collection.MutableFloatList;
import androidx.graphics.shapes.Feature;
import j6.m;
import j6.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.s;
import y5.h;

/* loaded from: classes.dex */
public final class RoundedPolygonKt {
    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8) {
        return RoundedPolygon$default(i8, 0.0f, 0.0f, 0.0f, null, null, 62, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(int i8, float f8, float f9, float f10, CornerRounding cornerRounding, List list, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            f8 = 1.0f;
        }
        float f11 = (i9 & 4) != 0 ? 0.0f : f9;
        float f12 = (i9 & 8) == 0 ? f10 : 0.0f;
        if ((i9 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        CornerRounding cornerRounding2 = cornerRounding;
        if ((i9 & 32) != 0) {
            list = null;
        }
        return RoundedPolygon(i8, f8, f11, f12, cornerRounding2, list);
    }

    private static final long calculateCenter(float[] fArr) {
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i8 = 0;
        while (i8 < fArr.length) {
            int i9 = i8 + 1;
            f8 += fArr[i8];
            i8 += 2;
            f9 += fArr[i9];
        }
        float f10 = 2;
        return FloatFloatPair.m8constructorimpl((f8 / fArr.length) / f10, (f9 / fArr.length) / f10);
    }

    private static final float[] verticesFromNumVerts(int i8, float f8, float f9, float f10) {
        float[] fArr = new float[i8 * 2];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            long m58plusybeJwSQ = PointKt.m58plusybeJwSQ(Utils.m74radialToCartesianL6JJ3z0$default(f8, (Utils.getFloatPi() / i8) * 2 * i10, 0L, 4, null), FloatFloatPair.m8constructorimpl(f9, f10));
            int i11 = i9 + 1;
            fArr[i9] = PointKt.m54getXDnnuFBc(m58plusybeJwSQ);
            i9 += 2;
            fArr[i11] = PointKt.m55getYDnnuFBc(m58plusybeJwSQ);
        }
        return fArr;
    }

    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8, float f8) {
        return RoundedPolygon$default(i8, f8, 0.0f, 0.0f, null, null, 60, null);
    }

    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8, float f8, float f9) {
        return RoundedPolygon$default(i8, f8, f9, 0.0f, null, null, 56, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(float[] fArr, CornerRounding cornerRounding, List list, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i8 & 4) != 0) {
            list = null;
        }
        if ((i8 & 8) != 0) {
            f8 = Float.MIN_VALUE;
        }
        if ((i8 & 16) != 0) {
            f9 = Float.MIN_VALUE;
        }
        return RoundedPolygon(fArr, cornerRounding, (List<CornerRounding>) list, f8, f9);
    }

    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8, float f8, float f9, float f10) {
        return RoundedPolygon$default(i8, f8, f9, f10, null, null, 48, null);
    }

    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8, float f8, float f9, float f10, CornerRounding rounding) {
        s.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(i8, f8, f9, f10, rounding, null, 32, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices) {
        s.checkNotNullParameter(vertices, "vertices");
        return RoundedPolygon$default(vertices, null, null, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding) {
        s.checkNotNullParameter(vertices, "vertices");
        s.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, null, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list) {
        s.checkNotNullParameter(vertices, "vertices");
        s.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list, float f8) {
        s.checkNotNullParameter(vertices, "vertices");
        s.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, f8, 0.0f, 16, null);
    }

    public static final RoundedPolygon RoundedPolygon(@IntRange(from = 3) int i8, float f8, float f9, float f10, CornerRounding rounding, List<CornerRounding> list) {
        s.checkNotNullParameter(rounding, "rounding");
        return RoundedPolygon(verticesFromNumVerts(i8, f8, f9, f10), rounding, list, f9, f10);
    }

    public static final RoundedPolygon RoundedPolygon(RoundedPolygon source) {
        s.checkNotNullParameter(source, "source");
        return new RoundedPolygon(source.getFeatures$graphics_shapes_release(), source.getCenterX(), source.getCenterY());
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list, float f8, float f9) {
        m until;
        long calculateCenter;
        Pair pair;
        CornerRounding cornerRounding;
        s.checkNotNullParameter(vertices, "vertices");
        s.checkNotNullParameter(rounding, "rounding");
        if (vertices.length >= 6) {
            int i8 = 1;
            if (vertices.length % 2 != 1) {
                if (list != null && list.size() * 2 != vertices.length) {
                    throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                }
                ArrayList arrayList = new ArrayList();
                int length = vertices.length / 2;
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                int i10 = 0;
                while (i10 < length) {
                    CornerRounding cornerRounding2 = (list == null || (cornerRounding = list.get(i10)) == null) ? rounding : cornerRounding;
                    int i11 = (((i10 + length) - i8) % length) * 2;
                    int i12 = i10 + 1;
                    int i13 = (i12 % length) * 2;
                    int i14 = i10 * 2;
                    arrayList2.add(new RoundedCorner(FloatFloatPair.m8constructorimpl(vertices[i11], vertices[i11 + i8]), FloatFloatPair.m8constructorimpl(vertices[i14], vertices[i14 + i8]), FloatFloatPair.m8constructorimpl(vertices[i13], vertices[i13 + i8]), cornerRounding2, null));
                    i10 = i12;
                    i8 = 1;
                }
                until = v.until(0, length);
                ArrayList arrayList3 = new ArrayList(r.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((f0) it).nextInt();
                    int i15 = (nextInt + 1) % length;
                    float expectedRoundCut = ((RoundedCorner) arrayList2.get(nextInt)).getExpectedRoundCut() + ((RoundedCorner) arrayList2.get(i15)).getExpectedRoundCut();
                    float expectedCut = ((RoundedCorner) arrayList2.get(nextInt)).getExpectedCut() + ((RoundedCorner) arrayList2.get(i15)).getExpectedCut();
                    int i16 = nextInt * 2;
                    int i17 = i15 * 2;
                    float distance = Utils.distance(vertices[i16] - vertices[i17], vertices[i16 + 1] - vertices[i17 + 1]);
                    if (expectedRoundCut > distance) {
                        pair = h.to(Float.valueOf(distance / expectedRoundCut), Float.valueOf(0.0f));
                    } else if (expectedCut > distance) {
                        pair = h.to(Float.valueOf(1.0f), Float.valueOf((distance - expectedRoundCut) / (expectedCut - expectedRoundCut)));
                    } else {
                        pair = h.to(Float.valueOf(1.0f), Float.valueOf(1.0f));
                    }
                    arrayList3.add(pair);
                }
                for (int i18 = 0; i18 < length; i18++) {
                    MutableFloatList mutableFloatList = new MutableFloatList(2);
                    for (int i19 = 0; i19 < 2; i19++) {
                        Pair pair2 = (Pair) arrayList3.get((((i18 + length) - 1) + i19) % length);
                        mutableFloatList.add((((RoundedCorner) arrayList2.get(i18)).getExpectedRoundCut() * ((Number) pair2.component1()).floatValue()) + ((((RoundedCorner) arrayList2.get(i18)).getExpectedCut() - ((RoundedCorner) arrayList2.get(i18)).getExpectedRoundCut()) * ((Number) pair2.component2()).floatValue()));
                    }
                    arrayList.add(((RoundedCorner) arrayList2.get(i18)).getCubics(mutableFloatList.get(0), mutableFloatList.get(1)));
                }
                ArrayList arrayList4 = new ArrayList();
                while (i9 < length) {
                    int i20 = i9 + 1;
                    int i21 = i20 % length;
                    int i22 = i9 * 2;
                    long m8constructorimpl = FloatFloatPair.m8constructorimpl(vertices[i22], vertices[i22 + 1]);
                    int i23 = (((i9 + length) - 1) % length) * 2;
                    long m8constructorimpl2 = FloatFloatPair.m8constructorimpl(vertices[i23], vertices[i23 + 1]);
                    int i24 = i21 * 2;
                    arrayList4.add(new Feature.Corner((List) arrayList.get(i9), m8constructorimpl, ((RoundedCorner) arrayList2.get(i9)).m66getCenter1ufDz9w(), PointKt.m45clockwiseybeJwSQ(PointKt.m57minusybeJwSQ(m8constructorimpl, m8constructorimpl2), PointKt.m57minusybeJwSQ(FloatFloatPair.m8constructorimpl(vertices[i24], vertices[i24 + 1]), m8constructorimpl)), null));
                    arrayList4.add(new Feature.Edge(q.listOf(Cubic.Companion.straightLine(((Cubic) CollectionsKt___CollectionsKt.last((List) arrayList.get(i9))).getAnchor1X(), ((Cubic) CollectionsKt___CollectionsKt.last((List) arrayList.get(i9))).getAnchor1Y(), ((Cubic) CollectionsKt___CollectionsKt.first((List) arrayList.get(i21))).getAnchor0X(), ((Cubic) CollectionsKt___CollectionsKt.first((List) arrayList.get(i21))).getAnchor0Y()))));
                    i9 = i20;
                }
                if (f8 == Float.MIN_VALUE || f9 == Float.MIN_VALUE) {
                    calculateCenter = calculateCenter(vertices);
                } else {
                    calculateCenter = FloatFloatPair.m8constructorimpl(f8, f9);
                }
                return new RoundedPolygon(arrayList4, Float.intBitsToFloat((int) (calculateCenter >> 32)), Float.intBitsToFloat((int) (calculateCenter & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
            }
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        throw new IllegalArgumentException("Polygons must have at least 3 vertices");
    }
}
