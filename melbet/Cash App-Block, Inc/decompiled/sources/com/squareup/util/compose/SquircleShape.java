package com.squareup.util.compose;

import android.graphics.Path;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.collection.FloatFloatPair;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.graphics.shapes.CornerRounding;
import androidx.graphics.shapes.Cubic;
import androidx.graphics.shapes.CubicKt;
import androidx.graphics.shapes.Feature;
import androidx.graphics.shapes.PointKt;
import androidx.graphics.shapes.RoundedCorner;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.RoundedPolygonKt;
import androidx.graphics.shapes.Utils;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class SquircleShape extends CornerBasedShape {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquircleShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        cornerSize.getClass();
        cornerSize2.getClass();
        cornerSize3.getClass();
        cornerSize4.getClass();
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final CornerBasedShape copy(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        cornerSize.getClass();
        cornerSize2.getClass();
        cornerSize3.getClass();
        cornerSize4.getClass();
        return new SquircleShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public final ColorKt mo338createOutlineLjSzlW0(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection) {
        float f5;
        ArrayList arrayList;
        List listOf;
        Cubic Cubic;
        CornerRounding cornerRounding;
        layoutDirection.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new CornerRounding[]{new CornerRounding(f3, 0.6f), new CornerRounding(f4, 0.6f), new CornerRounding(f, 0.6f), new CornerRounding(f2, 0.6f)});
        float intBitsToFloat3 = Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(j) >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (DimensionKt.m1466getCenteruvyYCjk(j) & BodyPartID.bodyIdMax));
        float f6 = intBitsToFloat / 2.0f;
        float f7 = intBitsToFloat3 - f6;
        float f8 = intBitsToFloat2 / 2.0f;
        float f9 = intBitsToFloat4 - f8;
        float f10 = f6 + intBitsToFloat3;
        float f11 = f8 + intBitsToFloat4;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 4;
        char c = 5;
        float[] fArr = {f10, f11, f7, f11, f7, f9, f10, f9};
        Float valueOf = Float.valueOf(1.0f);
        if (listOf2 != null) {
            f5 = 1.0f;
            if (listOf2.size() * 2 != 8) {
                a$$ExternalSyntheticBUOutline0.m$3("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                return null;
            }
        } else {
            f5 = 1.0f;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (i5 < 4) {
            if (listOf2 == null || (cornerRounding = (CornerRounding) listOf2.get(i5)) == null) {
                cornerRounding = CornerRounding.Unrounded;
            }
            CornerRounding cornerRounding2 = cornerRounding;
            int i6 = ((i5 + 3) % 4) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % 4) * 2;
            int i9 = i5 * 2;
            arrayList3.add(new RoundedCorner(FloatFloatPair.m127constructorimpl(fArr[i6], fArr[i6 + 1]), FloatFloatPair.m127constructorimpl(fArr[i9], fArr[i9 + 1]), FloatFloatPair.m127constructorimpl(fArr[i8], fArr[i8 + 1]), cornerRounding2));
            c = c;
            i5 = i7;
        }
        char c2 = c;
        IntRange until = RangesKt___RangesKt.until(0, 4);
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            int nextInt = it.nextInt();
            int i10 = (nextInt + 1) % 4;
            int i11 = i;
            float f12 = ((RoundedCorner) arrayList3.get(nextInt)).expectedRoundCut + ((RoundedCorner) arrayList3.get(i10)).expectedRoundCut;
            float expectedCut = ((RoundedCorner) arrayList3.get(i10)).getExpectedCut() + ((RoundedCorner) arrayList3.get(nextInt)).getExpectedCut();
            int i12 = nextInt * i3;
            float f13 = fArr[i12];
            float f14 = fArr[i12 + 1];
            int i13 = i10 * i3;
            float f15 = f13 - fArr[i13];
            float f16 = f14 - fArr[i13 + 1];
            int i14 = Utils.$r8$clinit;
            ArrayList arrayList5 = arrayList2;
            float sqrt = (float) Math.sqrt((f16 * f16) + (f15 * f15));
            arrayList4.add(f12 > sqrt ? new Pair(Float.valueOf(sqrt / f12), Float.valueOf(RecyclerView.DECELERATION_RATE)) : expectedCut > sqrt ? new Pair(valueOf, Float.valueOf((sqrt - f12) / (expectedCut - f12))) : new Pair(valueOf, valueOf));
            i = i11;
            arrayList2 = arrayList5;
            i3 = 2;
        }
        int i15 = i;
        int i16 = i15;
        while (true) {
            ArrayList arrayList6 = arrayList2;
            if (i16 >= i4) {
                float[] fArr2 = fArr;
                int i17 = i2;
                ArrayList arrayList7 = new ArrayList();
                int i18 = i15;
                for (int i19 = i4; i18 < i19; i19 = 4) {
                    int i20 = (i18 + 3) % i19;
                    int i21 = i18 + 1;
                    int i22 = i21 % 4;
                    int i23 = i18 * 2;
                    long m127constructorimpl = FloatFloatPair.m127constructorimpl(fArr2[i23], fArr2[i23 + 1]);
                    int i24 = i20 * 2;
                    long m127constructorimpl2 = FloatFloatPair.m127constructorimpl(fArr2[i24], fArr2[i24 + 1]);
                    int i25 = i22 * 2;
                    long m127constructorimpl3 = FloatFloatPair.m127constructorimpl(fArr2[i25], fArr2[i25 + 1]);
                    int i26 = Utils.$r8$clinit;
                    long m1135minusybeJwSQ = PointKt.m1135minusybeJwSQ(m127constructorimpl, m127constructorimpl2);
                    long m1135minusybeJwSQ2 = PointKt.m1135minusybeJwSQ(m127constructorimpl3, m127constructorimpl);
                    arrayList7.add(new Feature.Corner((List) arrayList6.get(i18), (PointKt.m1134getYDnnuFBc(m1135minusybeJwSQ2) * PointKt.m1133getXDnnuFBc(m1135minusybeJwSQ)) - (PointKt.m1133getXDnnuFBc(m1135minusybeJwSQ2) * PointKt.m1134getYDnnuFBc(m1135minusybeJwSQ)) > RecyclerView.DECELERATION_RATE ? i17 : i15));
                    float anchor1X = ((Cubic) CollectionsKt.last((List) arrayList6.get(i18))).getAnchor1X();
                    float anchor1Y = ((Cubic) CollectionsKt.last((List) arrayList6.get(i18))).getAnchor1Y();
                    float f17 = ((Cubic) CollectionsKt.first((List) arrayList6.get(i22))).points[i15];
                    float f18 = ((Cubic) CollectionsKt.first((List) arrayList6.get(i22))).points[i17];
                    List listOf3 = CollectionsKt__CollectionsJVMKt.listOf(CubicKt.Cubic(anchor1X, anchor1Y, Utils.interpolate(anchor1X, f17, 0.33333334f), Utils.interpolate(anchor1Y, f18, 0.33333334f), Utils.interpolate(anchor1X, f17, 0.6666667f), Utils.interpolate(anchor1Y, f18, 0.6666667f), f17, f18));
                    listOf3.getClass();
                    arrayList7.add(new Feature.Edge(listOf3));
                    i18 = i21;
                }
                long calculateCenter = (intBitsToFloat3 == Float.MIN_VALUE || intBitsToFloat4 == Float.MIN_VALUE) ? RoundedPolygonKt.calculateCenter(fArr2) : FloatFloatPair.m127constructorimpl(intBitsToFloat3, intBitsToFloat4);
                float intBitsToFloat5 = Float.intBitsToFloat((int) (calculateCenter >> 32));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (calculateCenter & BodyPartID.bodyIdMax));
                if (arrayList7.size() < 2) {
                    a$$ExternalSyntheticBUOutline0.m$3("Polygons must have at least 2 features");
                    return null;
                }
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    for (Cubic cubic : ((Feature) it2.next()).cubics) {
                        createListBuilder.add(Float.valueOf(cubic.points[i15]));
                        createListBuilder.add(Float.valueOf(cubic.points[i17]));
                    }
                }
                float[] floatArray = CollectionsKt.toFloatArray(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                if (Float.isNaN(intBitsToFloat5)) {
                    intBitsToFloat5 = Float.intBitsToFloat((int) (RoundedPolygonKt.calculateCenter(floatArray) >> 32));
                }
                if (Float.isNaN(intBitsToFloat6)) {
                    intBitsToFloat6 = Float.intBitsToFloat((int) (RoundedPolygonKt.calculateCenter(floatArray) & BodyPartID.bodyIdMax));
                }
                RoundedPolygon roundedPolygon = new RoundedPolygon(arrayList7, FloatFloatPair.m127constructorimpl(intBitsToFloat5, intBitsToFloat6));
                Path path = new Path();
                path.rewind();
                ListBuilder listBuilder = roundedPolygon.cubics;
                int size = listBuilder.getSize();
                int i27 = i17;
                for (int i28 = i15; i28 < size; i28++) {
                    Cubic cubic2 = (Cubic) listBuilder.get(i28);
                    if (i27 != 0) {
                        float[] fArr3 = cubic2.points;
                        path.moveTo(fArr3[i15], fArr3[i17]);
                        i27 = i15;
                    }
                    float[] fArr4 = cubic2.points;
                    path.cubicTo(fArr4[2], fArr4[3], fArr4[4], fArr4[c2], cubic2.getAnchor1X(), cubic2.getAnchor1Y());
                }
                path.close();
                return new Outline$Generic(new AndroidPath(path));
            }
            float[] fArr5 = new float[2];
            int i29 = i15;
            int i30 = i29;
            for (int i31 = 2; i29 < i31; i31 = 2) {
                Pair pair = (Pair) arrayList4.get(((i16 + 3) + i29) % i4);
                int i32 = i4;
                float m = CameraState$Type$EnumUnboxingLocalUtility.m(((RoundedCorner) arrayList3.get(i16)).getExpectedCut(), ((RoundedCorner) arrayList3.get(i16)).expectedRoundCut, ((Number) pair.second).floatValue(), ((RoundedCorner) arrayList3.get(i16)).expectedRoundCut * ((Number) pair.first).floatValue());
                int i33 = i30 + 1;
                if (fArr5.length < i33) {
                    fArr5 = Arrays.copyOf(fArr5, Math.max(i33, (fArr5.length * 3) / 2));
                }
                fArr5[i30] = m;
                i29++;
                i30 = i33;
                i4 = i32;
            }
            int i34 = i4;
            RoundedCorner roundedCorner = (RoundedCorner) arrayList3.get(i16);
            if (i30 <= 0) {
                Path$$ExternalSyntheticBUOutline0.m("Index must be between 0 and size");
                return null;
            }
            float f19 = fArr5[i15];
            if (i2 >= i30) {
                Path$$ExternalSyntheticBUOutline0.m("Index must be between 0 and size");
                return null;
            }
            float f20 = fArr5[i2];
            long j2 = roundedCorner.d2;
            ArrayList arrayList8 = arrayList3;
            long j3 = roundedCorner.d1;
            int i35 = i2;
            float f21 = roundedCorner.cornerRadius;
            float[] fArr6 = fArr;
            long j4 = roundedCorner.p1;
            float min = Math.min(f19, f20);
            int i36 = i16;
            float f22 = roundedCorner.expectedRoundCut;
            if (f22 < 1.0E-4f || min < 1.0E-4f || f21 < 1.0E-4f) {
                arrayList = arrayList4;
                roundedCorner.center = j4;
                float m1133getXDnnuFBc = PointKt.m1133getXDnnuFBc(j4);
                float m1134getYDnnuFBc = PointKt.m1134getYDnnuFBc(j4);
                float m1133getXDnnuFBc2 = PointKt.m1133getXDnnuFBc(j4);
                float m1134getYDnnuFBc2 = PointKt.m1134getYDnnuFBc(j4);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(CubicKt.Cubic(m1133getXDnnuFBc, m1134getYDnnuFBc, Utils.interpolate(m1133getXDnnuFBc, m1133getXDnnuFBc2, 0.33333334f), Utils.interpolate(m1134getYDnnuFBc, m1134getYDnnuFBc2, 0.33333334f), Utils.interpolate(m1133getXDnnuFBc, m1133getXDnnuFBc2, 0.6666667f), Utils.interpolate(m1134getYDnnuFBc, m1134getYDnnuFBc2, 0.6666667f), m1133getXDnnuFBc2, m1134getYDnnuFBc2));
            } else {
                float min2 = Math.min(min, f22);
                float calculateActualSmoothingValue = roundedCorner.calculateActualSmoothingValue(f19);
                float calculateActualSmoothingValue2 = roundedCorner.calculateActualSmoothingValue(f20);
                float f23 = (f21 * min2) / f22;
                int i37 = Utils.$r8$clinit;
                ArrayList arrayList9 = arrayList4;
                float sqrt2 = (float) Math.sqrt((min2 * min2) + (f23 * f23));
                arrayList = arrayList9;
                long m1130divso9K2fw = PointKt.m1130divso9K2fw(PointKt.m1136plusybeJwSQ(j3, j2), 2.0f);
                float m1132getDistanceDnnuFBc = PointKt.m1132getDistanceDnnuFBc(m1130divso9K2fw);
                if (m1132getDistanceDnnuFBc <= RecyclerView.DECELERATION_RATE) {
                    a$$ExternalSyntheticBUOutline0.m$3("Can't get the direction of a 0-length vector");
                    return null;
                }
                roundedCorner.center = PointKt.m1136plusybeJwSQ(j4, PointKt.m1137timesso9K2fw(PointKt.m1130divso9K2fw(m1130divso9K2fw, m1132getDistanceDnnuFBc), sqrt2));
                long m1136plusybeJwSQ = PointKt.m1136plusybeJwSQ(j4, PointKt.m1137timesso9K2fw(j3, min2));
                long m1136plusybeJwSQ2 = PointKt.m1136plusybeJwSQ(j4, PointKt.m1137timesso9K2fw(j2, min2));
                Cubic m1138computeFlankingCurveoAJzIJU = RoundedCorner.m1138computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue, roundedCorner.p1, roundedCorner.p0, m1136plusybeJwSQ, m1136plusybeJwSQ2, roundedCorner.center, f23);
                Cubic m1138computeFlankingCurveoAJzIJU2 = RoundedCorner.m1138computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue2, roundedCorner.p1, roundedCorner.p2, m1136plusybeJwSQ2, m1136plusybeJwSQ, roundedCorner.center, f23);
                float anchor1X2 = m1138computeFlankingCurveoAJzIJU2.getAnchor1X();
                float anchor1Y2 = m1138computeFlankingCurveoAJzIJU2.getAnchor1Y();
                float[] fArr7 = m1138computeFlankingCurveoAJzIJU2.points;
                Cubic Cubic2 = CubicKt.Cubic(anchor1X2, anchor1Y2, fArr7[i34], fArr7[c2], fArr7[2], fArr7[3], fArr7[i15], fArr7[i35]);
                float m1133getXDnnuFBc3 = PointKt.m1133getXDnnuFBc(roundedCorner.center);
                float m1134getYDnnuFBc3 = PointKt.m1134getYDnnuFBc(roundedCorner.center);
                float anchor1X3 = m1138computeFlankingCurveoAJzIJU.getAnchor1X();
                float anchor1Y3 = m1138computeFlankingCurveoAJzIJU.getAnchor1Y();
                float[] fArr8 = Cubic2.points;
                float f24 = fArr8[i15];
                float f25 = fArr8[i35];
                long directionVector = Utils.directionVector(anchor1X3 - m1133getXDnnuFBc3, anchor1Y3 - m1134getYDnnuFBc3);
                float f26 = f24 - m1133getXDnnuFBc3;
                float f27 = f25 - m1134getYDnnuFBc3;
                long directionVector2 = Utils.directionVector(f26, f27);
                long m127constructorimpl4 = FloatFloatPair.m127constructorimpl(-PointKt.m1134getYDnnuFBc(directionVector), PointKt.m1133getXDnnuFBc(directionVector));
                long m127constructorimpl5 = FloatFloatPair.m127constructorimpl(-PointKt.m1134getYDnnuFBc(directionVector2), PointKt.m1133getXDnnuFBc(directionVector2));
                int i38 = (PointKt.m1134getYDnnuFBc(m127constructorimpl4) * f27) + (PointKt.m1133getXDnnuFBc(m127constructorimpl4) * f26) >= RecyclerView.DECELERATION_RATE ? i35 : i15;
                float m1131dotProductybeJwSQ = PointKt.m1131dotProductybeJwSQ(directionVector, directionVector2);
                if (m1131dotProductybeJwSQ > 0.999f) {
                    Cubic = CubicKt.Cubic(anchor1X3, anchor1Y3, Utils.interpolate(anchor1X3, f24, 0.33333334f), Utils.interpolate(anchor1Y3, f25, 0.33333334f), Utils.interpolate(anchor1X3, f24, 0.6666667f), Utils.interpolate(anchor1Y3, f25, 0.6666667f), f24, f25);
                } else {
                    float sqrt3 = (((((float) Math.sqrt(2.0f * r10)) - ((float) Math.sqrt(f5 - (m1131dotProductybeJwSQ * m1131dotProductybeJwSQ)))) * ((((float) Math.sqrt((r12 * r12) + (r11 * r11))) * 4.0f) / 3.0f)) / (f5 - m1131dotProductybeJwSQ)) * (i38 != 0 ? f5 : -1.0f);
                    Cubic = CubicKt.Cubic(anchor1X3, anchor1Y3, (PointKt.m1133getXDnnuFBc(m127constructorimpl4) * sqrt3) + anchor1X3, (PointKt.m1134getYDnnuFBc(m127constructorimpl4) * sqrt3) + anchor1Y3, f24 - (PointKt.m1133getXDnnuFBc(m127constructorimpl5) * sqrt3), f25 - (PointKt.m1134getYDnnuFBc(m127constructorimpl5) * sqrt3), f24, f25);
                }
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Cubic[]{m1138computeFlankingCurveoAJzIJU, Cubic, Cubic2});
            }
            arrayList2 = arrayList6;
            arrayList2.add(listOf);
            i16 = i36 + 1;
            i2 = i35;
            i4 = i34;
            fArr = fArr6;
            arrayList3 = arrayList8;
            arrayList4 = arrayList;
        }
    }
}
