package androidx.graphics.shapes;

import androidx.graphics.shapes.MeasuredPolygon;
import f6.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.h;

/* loaded from: classes.dex */
public final class Morph {
    public static final Companion Companion = new Companion(null);
    private final List<Pair<Cubic, Cubic>> _morphMatch;
    private final RoundedPolygon end;
    private final RoundedPolygon start;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final List<Pair<Cubic, Cubic>> match$graphics_shapes_release(RoundedPolygon p12, RoundedPolygon p22) {
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pair;
            Pair<MeasuredPolygon.MeasuredCubic, MeasuredPolygon.MeasuredCubic> pair2;
            String unused;
            String unused2;
            String unused3;
            String unused4;
            String unused5;
            s.checkNotNullParameter(p12, "p1");
            s.checkNotNullParameter(p22, "p2");
            MeasuredPolygon.Companion companion = MeasuredPolygon.Companion;
            MeasuredPolygon measurePolygon$graphics_shapes_release = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p12.getCenterX(), p12.getCenterY()), p12);
            MeasuredPolygon measurePolygon$graphics_shapes_release2 = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p22.getCenterX(), p22.getCenterY()), p22);
            DoubleMapper featureMapper = FeatureMappingKt.featureMapper(measurePolygon$graphics_shapes_release.getFeatures(), measurePolygon$graphics_shapes_release2.getFeatures());
            float map = featureMapper.map(0.0f);
            unused = MorphKt.LOG_TAG;
            MeasuredPolygon cutAndShift = measurePolygon$graphics_shapes_release2.cutAndShift(map);
            ArrayList arrayList = new ArrayList();
            MeasuredPolygon.MeasuredCubic measuredCubic = (MeasuredPolygon.MeasuredCubic) CollectionsKt___CollectionsKt.getOrNull(measurePolygon$graphics_shapes_release, 0);
            MeasuredPolygon.MeasuredCubic measuredCubic2 = (MeasuredPolygon.MeasuredCubic) CollectionsKt___CollectionsKt.getOrNull(cutAndShift, 0);
            int i8 = 1;
            int i9 = 1;
            while (measuredCubic != null && measuredCubic2 != null) {
                float endOutlineProgress = i8 == measurePolygon$graphics_shapes_release.size() ? 1.0f : measuredCubic.getEndOutlineProgress();
                float mapBack = i9 == cutAndShift.size() ? 1.0f : featureMapper.mapBack(Utils.positiveModulo(measuredCubic2.getEndOutlineProgress() + map, 1.0f));
                float min = Math.min(endOutlineProgress, mapBack);
                unused2 = MorphKt.LOG_TAG;
                float f8 = 1.0E-6f + min;
                if (endOutlineProgress > f8) {
                    unused3 = MorphKt.LOG_TAG;
                    pair = measuredCubic.cutAtProgress(min);
                } else {
                    pair = h.to(measuredCubic, CollectionsKt___CollectionsKt.getOrNull(measurePolygon$graphics_shapes_release, i8));
                    i8++;
                }
                MeasuredPolygon.MeasuredCubic component1 = pair.component1();
                measuredCubic = pair.component2();
                if (mapBack > f8) {
                    unused4 = MorphKt.LOG_TAG;
                    pair2 = measuredCubic2.cutAtProgress(Utils.positiveModulo(featureMapper.map(min) - map, 1.0f));
                } else {
                    pair2 = h.to(measuredCubic2, CollectionsKt___CollectionsKt.getOrNull(cutAndShift, i9));
                    i9++;
                }
                MeasuredPolygon.MeasuredCubic component12 = pair2.component1();
                measuredCubic2 = pair2.component2();
                unused5 = MorphKt.LOG_TAG;
                arrayList.add(h.to(component1.getCubic(), component12.getCubic()));
            }
            if (measuredCubic == null && measuredCubic2 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched".toString());
        }
    }

    public Morph(RoundedPolygon start, RoundedPolygon end) {
        s.checkNotNullParameter(start, "start");
        s.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this._morphMatch = Companion.match$graphics_shapes_release(start, end);
    }

    public static /* synthetic */ float[] calculateBounds$default(Morph morph, float[] fArr, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i8 & 2) != 0) {
            z7 = true;
        }
        return morph.calculateBounds(fArr, z7);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(Morph morph, float[] fArr, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            fArr = new float[4];
        }
        return morph.calculateMaxBounds(fArr);
    }

    public static /* synthetic */ void forEachCubic$default(Morph morph, float f8, MutableCubic mutableCubic, l callback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            mutableCubic = new MutableCubic();
        }
        s.checkNotNullParameter(mutableCubic, "mutableCubic");
        s.checkNotNullParameter(callback, "callback");
        int size = morph.getMorphMatch().size();
        for (int i9 = 0; i9 < size; i9++) {
            mutableCubic.interpolate(morph.getMorphMatch().get(i9).getFirst(), morph.getMorphMatch().get(i9).getSecond(), f8);
            callback.invoke(mutableCubic);
        }
    }

    public static /* synthetic */ void getMorphMatch$annotations() {
    }

    public final List<Cubic> asCubics(float f8) {
        List createListBuilder = q.createListBuilder();
        int size = this._morphMatch.size();
        Cubic cubic = null;
        Cubic cubic2 = null;
        int i8 = 0;
        while (i8 < size) {
            float[] fArr = new float[8];
            for (int i9 = 0; i9 < 8; i9++) {
                fArr[i9] = Utils.interpolate(this._morphMatch.get(i8).getFirst().getPoints$graphics_shapes_release()[i9], this._morphMatch.get(i8).getSecond().getPoints$graphics_shapes_release()[i9], f8);
            }
            Cubic cubic3 = new Cubic(fArr);
            if (cubic2 == null) {
                cubic2 = cubic3;
            }
            if (cubic != null) {
                createListBuilder.add(cubic);
            }
            i8++;
            cubic = cubic3;
        }
        if (cubic != null && cubic2 != null) {
            createListBuilder.add(CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor0X(), cubic2.getAnchor0Y()));
        }
        return q.build(createListBuilder);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public final float[] calculateMaxBounds(float[] bounds) {
        s.checkNotNullParameter(bounds, "bounds");
        this.start.calculateMaxBounds(bounds);
        float f8 = bounds[0];
        float f9 = bounds[1];
        float f10 = bounds[2];
        float f11 = bounds[3];
        this.end.calculateMaxBounds(bounds);
        bounds[0] = Math.min(f8, bounds[0]);
        bounds[1] = Math.min(f9, bounds[1]);
        bounds[2] = Math.max(f10, bounds[2]);
        bounds[3] = Math.max(f11, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float f8, MutableCubic mutableCubic, l callback) {
        s.checkNotNullParameter(mutableCubic, "mutableCubic");
        s.checkNotNullParameter(callback, "callback");
        int size = getMorphMatch().size();
        for (int i8 = 0; i8 < size; i8++) {
            mutableCubic.interpolate(getMorphMatch().get(i8).getFirst(), getMorphMatch().get(i8).getSecond(), f8);
            callback.invoke(mutableCubic);
        }
    }

    public final List<Pair<Cubic, Cubic>> getMorphMatch() {
        return this._morphMatch;
    }

    public final float[] calculateBounds(float[] bounds) {
        s.checkNotNullParameter(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    public final float[] calculateBounds(float[] bounds, boolean z7) {
        s.checkNotNullParameter(bounds, "bounds");
        this.start.calculateBounds(bounds, z7);
        float f8 = bounds[0];
        float f9 = bounds[1];
        float f10 = bounds[2];
        float f11 = bounds[3];
        this.end.calculateBounds(bounds, z7);
        bounds[0] = Math.min(f8, bounds[0]);
        bounds[1] = Math.min(f9, bounds[1]);
        bounds[2] = Math.max(f10, bounds[2]);
        bounds[3] = Math.max(f11, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float f8, l callback) {
        s.checkNotNullParameter(callback, "callback");
        MutableCubic mutableCubic = new MutableCubic();
        int size = getMorphMatch().size();
        for (int i8 = 0; i8 < size; i8++) {
            mutableCubic.interpolate(getMorphMatch().get(i8).getFirst(), getMorphMatch().get(i8).getSecond(), f8);
            callback.invoke(mutableCubic);
        }
    }
}
