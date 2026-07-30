package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class RoundedPolygon {
    public static final Companion Companion = new Companion(null);
    private final float centerX;
    private final float centerY;
    private final List<Cubic> cubics;
    private final List<Feature> features;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedPolygon(List<? extends Feature> features, float f8, float f9) {
        List<Cubic> list;
        List<Cubic> list2;
        Cubic cubic;
        List<Cubic> cubics;
        s.checkNotNullParameter(features, "features");
        this.features = features;
        this.centerX = f8;
        this.centerY = f9;
        List createListBuilder = q.createListBuilder();
        int i8 = 0;
        Cubic cubic2 = null;
        if (features.size() <= 0 || ((Feature) features.get(0)).getCubics().size() != 3) {
            list = null;
            list2 = null;
        } else {
            Pair<Cubic, Cubic> split = ((Feature) features.get(0)).getCubics().get(1).split(0.5f);
            Cubic component1 = split.component1();
            Cubic component2 = split.component2();
            list2 = CollectionsKt__CollectionsKt.mutableListOf(((Feature) features.get(0)).getCubics().get(0), component1);
            list = CollectionsKt__CollectionsKt.mutableListOf(component2, ((Feature) features.get(0)).getCubics().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            Cubic cubic3 = null;
            int i9 = 0;
            while (true) {
                if (i9 == 0 && list != null) {
                    cubics = list;
                } else if (i9 != this.features.size()) {
                    cubics = this.features.get(i9).getCubics();
                } else if (list2 == null) {
                    break;
                } else {
                    cubics = list2;
                }
                int size2 = cubics.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Cubic cubic4 = cubics.get(i10);
                    if (!cubic4.zeroLength$graphics_shapes_release()) {
                        if (cubic3 != null) {
                            createListBuilder.add(cubic3);
                        }
                        if (cubic2 == null) {
                            cubic2 = cubic4;
                            cubic3 = cubic2;
                        } else {
                            cubic3 = cubic4;
                        }
                    } else if (cubic3 != null) {
                        cubic3.getPoints$graphics_shapes_release()[6] = cubic4.getAnchor1X();
                        cubic3.getPoints$graphics_shapes_release()[7] = cubic4.getAnchor1Y();
                    }
                }
                if (i9 == size) {
                    break;
                } else {
                    i9++;
                }
            }
            cubic = cubic2;
            cubic2 = cubic3;
        } else {
            cubic = null;
        }
        if (cubic2 != null && cubic != null) {
            createListBuilder.add(CubicKt.Cubic(cubic2.getAnchor0X(), cubic2.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic.getAnchor0X(), cubic.getAnchor0Y()));
        }
        List<Cubic> build = q.build(createListBuilder);
        this.cubics = build;
        Cubic cubic5 = build.get(build.size() - 1);
        int size3 = build.size();
        while (i8 < size3) {
            Cubic cubic6 = this.cubics.get(i8);
            Cubic cubic7 = cubic5;
            if (Math.abs(cubic6.getAnchor0X() - cubic7.getAnchor1X()) > 1.0E-4f || Math.abs(cubic6.getAnchor0Y() - cubic7.getAnchor1Y()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i8++;
            cubic5 = cubic6;
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i8 & 2) != 0) {
            z7 = true;
        }
        return roundedPolygon.calculateBounds(fArr, z7);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = new float[4];
        }
        return roundedPolygon.calculateMaxBounds(fArr);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public final float[] calculateMaxBounds(float[] bounds) {
        s.checkNotNullParameter(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4".toString());
        }
        int size = this.cubics.size();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            Cubic cubic = this.cubics.get(i8);
            float distanceSquared = Utils.distanceSquared(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
            long m42pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m42pointOnCurveOOQOV4g$graphics_shapes_release(0.5f);
            f8 = Math.max(f8, Math.max(distanceSquared, Utils.distanceSquared(PointKt.m54getXDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerX, PointKt.m55getYDnnuFBc(m42pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerY)));
        }
        float sqrt = (float) Math.sqrt(f8);
        float f9 = this.centerX;
        bounds[0] = f9 - sqrt;
        float f10 = this.centerY;
        bounds[1] = f10 - sqrt;
        bounds[2] = f9 + sqrt;
        bounds[3] = f10 + sqrt;
        return bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedPolygon) {
            return s.areEqual(this.features, ((RoundedPolygon) obj).features);
        }
        return false;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public final List<Feature> getFeatures$graphics_shapes_release() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final RoundedPolygon normalized() {
        float[] calculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f8 = calculateBounds$default[2] - calculateBounds$default[0];
        float f9 = calculateBounds$default[3] - calculateBounds$default[1];
        final float max = Math.max(f8, f9);
        float f10 = 2;
        final float f11 = ((max - f8) / f10) - calculateBounds$default[0];
        final float f12 = ((max - f9) / f10) - calculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon$normalized$1
            @Override // androidx.graphics.shapes.PointTransformer
            /* renamed from: transform-XgqJiTY */
            public final long mo63transformXgqJiTY(float f13, float f14) {
                float f15 = f13 + f11;
                float f16 = max;
                return FloatFloatPair.m8constructorimpl(f15 / f16, (f14 + f12) / f16);
            }
        });
    }

    public String toString() {
        String joinToString$default;
        String joinToString$default2;
        StringBuilder sb = new StringBuilder();
        sb.append("[RoundedPolygon. Cubics = ");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.cubics, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(" || Features = ");
        joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(this.features, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default2);
        sb.append(" || Center = (");
        sb.append(this.centerX);
        sb.append(", ");
        sb.append(this.centerY);
        sb.append(")]");
        return sb.toString();
    }

    public final RoundedPolygon transformed(PointTransformer f8) {
        s.checkNotNullParameter(f8, "f");
        long m61transformedso9K2fw = PointKt.m61transformedso9K2fw(FloatFloatPair.m8constructorimpl(this.centerX, this.centerY), f8);
        List createListBuilder = q.createListBuilder();
        int size = this.features.size();
        for (int i8 = 0; i8 < size; i8++) {
            createListBuilder.add(this.features.get(i8).transformed$graphics_shapes_release(f8));
        }
        return new RoundedPolygon(q.build(createListBuilder), PointKt.m54getXDnnuFBc(m61transformedso9K2fw), PointKt.m55getYDnnuFBc(m61transformedso9K2fw));
    }

    public final float[] calculateBounds(float[] bounds) {
        s.checkNotNullParameter(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    public final float[] calculateBounds(float[] bounds, boolean z7) {
        s.checkNotNullParameter(bounds, "bounds");
        if (bounds.length >= 4) {
            int size = this.cubics.size();
            float f8 = Float.MIN_VALUE;
            float f9 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            float f11 = Float.MAX_VALUE;
            for (int i8 = 0; i8 < size; i8++) {
                this.cubics.get(i8).calculateBounds$graphics_shapes_release(bounds, z7);
                f10 = Math.min(f10, bounds[0]);
                f11 = Math.min(f11, bounds[1]);
                f8 = Math.max(f8, bounds[2]);
                f9 = Math.max(f9, bounds[3]);
            }
            bounds[0] = f10;
            bounds[1] = f11;
            bounds[2] = f8;
            bounds[3] = f9;
            return bounds;
        }
        throw new IllegalArgumentException("Required bounds size of 4".toString());
    }
}
