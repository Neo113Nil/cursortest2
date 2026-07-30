package androidx.graphics.shapes;

import androidx.annotation.FloatRange;
import androidx.collection.FloatList;
import androidx.collection.MutableFloatList;
import androidx.graphics.shapes.Feature;
import j6.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.b;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.h;
import y5.w;

/* loaded from: classes.dex */
public final class MeasuredPolygon extends b {
    public static final Companion Companion = new Companion(null);
    private final List<MeasuredCubic> cubics;
    private final List<ProgressableFeature> features;
    private final Measurer measurer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final MeasuredPolygon measurePolygon$graphics_shapes_release(Measurer measurer, RoundedPolygon polygon) {
            List list;
            String unused;
            s.checkNotNullParameter(measurer, "measurer");
            s.checkNotNullParameter(polygon, "polygon");
            ArrayList<Cubic> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = polygon.getFeatures$graphics_shapes_release().size();
            for (int i8 = 0; i8 < size; i8++) {
                Feature feature = polygon.getFeatures$graphics_shapes_release().get(i8);
                int size2 = feature.getCubics().size();
                for (int i9 = 0; i9 < size2; i9++) {
                    if ((feature instanceof Feature.Corner) && i9 == feature.getCubics().size() / 2) {
                        arrayList2.add(h.to(feature, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(feature.getCubics().get(i9));
                }
            }
            Float valueOf = Float.valueOf(0.0f);
            int collectionSizeOrDefault = r.collectionSizeOrDefault(arrayList, 9);
            if (collectionSizeOrDefault == 0) {
                list = q.listOf(valueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault + 1);
                arrayList3.add(valueOf);
                for (Cubic cubic : arrayList) {
                    float floatValue = valueOf.floatValue();
                    float measureCubic = measurer.measureCubic(cubic);
                    if (measureCubic < 0.0f) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero".toString());
                    }
                    w wVar = w.INSTANCE;
                    valueOf = Float.valueOf(floatValue + measureCubic);
                    arrayList3.add(valueOf);
                }
                list = arrayList3;
            }
            float floatValue2 = ((Number) CollectionsKt___CollectionsKt.last(list)).floatValue();
            MutableFloatList mutableFloatList = new MutableFloatList(list.size());
            int size3 = list.size();
            for (int i10 = 0; i10 < size3; i10++) {
                mutableFloatList.add(((Number) list.get(i10)).floatValue() / floatValue2);
            }
            unused = PolygonMeasureKt.LOG_TAG;
            List createListBuilder = q.createListBuilder();
            int size4 = arrayList2.size();
            for (int i11 = 0; i11 < size4; i11++) {
                int intValue = ((Number) ((Pair) arrayList2.get(i11)).getSecond()).intValue();
                createListBuilder.add(new ProgressableFeature((mutableFloatList.get(intValue) + mutableFloatList.get(intValue + 1)) / 2, (Feature) ((Pair) arrayList2.get(i11)).getFirst()));
            }
            return new MeasuredPolygon(measurer, q.build(createListBuilder), arrayList, mutableFloatList, null);
        }
    }

    public final class MeasuredCubic {
        private final Cubic cubic;
        private float endOutlineProgress;
        private final float measuredSize;
        private float startOutlineProgress;
        final /* synthetic */ MeasuredPolygon this$0;

        public MeasuredCubic(MeasuredPolygon measuredPolygon, @FloatRange(from = 0.0d, to = 1.0d) Cubic cubic, @FloatRange(from = 0.0d, to = 1.0d) float f8, float f9) {
            s.checkNotNullParameter(cubic, "cubic");
            this.this$0 = measuredPolygon;
            this.cubic = cubic;
            if (f9 < f8) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress".toString());
            }
            this.measuredSize = measuredPolygon.measurer.measureCubic(cubic);
            this.startOutlineProgress = f8;
            this.endOutlineProgress = f9;
        }

        public static /* synthetic */ void updateProgressRange$graphics_shapes_release$default(MeasuredCubic measuredCubic, float f8, float f9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                f8 = measuredCubic.startOutlineProgress;
            }
            if ((i8 & 2) != 0) {
                f9 = measuredCubic.endOutlineProgress;
            }
            measuredCubic.updateProgressRange$graphics_shapes_release(f8, f9);
        }

        public final Pair<MeasuredCubic, MeasuredCubic> cutAtProgress(float f8) {
            float coerceIn;
            String unused;
            coerceIn = v.coerceIn(f8, this.startOutlineProgress, this.endOutlineProgress);
            float f9 = this.endOutlineProgress;
            float f10 = this.startOutlineProgress;
            float findCubicCutPoint = this.this$0.measurer.findCubicCutPoint(this.cubic, ((coerceIn - f10) / (f9 - f10)) * this.measuredSize);
            if (0.0f > findCubicCutPoint || findCubicCutPoint > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1".toString());
            }
            unused = PolygonMeasureKt.LOG_TAG;
            Pair<Cubic, Cubic> split = this.cubic.split(findCubicCutPoint);
            return h.to(new MeasuredCubic(this.this$0, split.component1(), this.startOutlineProgress, coerceIn), new MeasuredCubic(this.this$0, split.component2(), coerceIn, this.endOutlineProgress));
        }

        public final Cubic getCubic() {
            return this.cubic;
        }

        public final float getEndOutlineProgress() {
            return this.endOutlineProgress;
        }

        public final float getMeasuredSize() {
            return this.measuredSize;
        }

        public final float getStartOutlineProgress() {
            return this.startOutlineProgress;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.startOutlineProgress + " .. " + this.endOutlineProgress + "], size=" + this.measuredSize + ", cubic=" + this.cubic + ')';
        }

        public final void updateProgressRange$graphics_shapes_release(float f8, float f9) {
            if (f9 < f8) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress".toString());
            }
            this.startOutlineProgress = f8;
            this.endOutlineProgress = f9;
        }
    }

    public /* synthetic */ MeasuredPolygon(Measurer measurer, List list, List list2, FloatList floatList, o oVar) {
        this(measurer, list, list2, floatList);
    }

    public /* bridge */ boolean contains(MeasuredCubic measuredCubic) {
        return super.contains((Object) measuredCubic);
    }

    public final MeasuredPolygon cutAndShift(float f8) {
        List mutableListOf;
        String unused;
        if (0.0f > f8 || f8 > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1".toString());
        }
        if (f8 < 1.0E-4f) {
            return this;
        }
        Iterator<MeasuredCubic> it = this.cubics.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            MeasuredCubic next = it.next();
            float startOutlineProgress = next.getStartOutlineProgress();
            if (f8 <= next.getEndOutlineProgress() && startOutlineProgress <= f8) {
                break;
            }
            i8++;
        }
        Pair<MeasuredCubic, MeasuredCubic> cutAtProgress = this.cubics.get(i8).cutAtProgress(f8);
        MeasuredCubic component1 = cutAtProgress.component1();
        MeasuredCubic component2 = cutAtProgress.component2();
        unused = PolygonMeasureKt.LOG_TAG;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(component2.getCubic());
        int size = this.cubics.size();
        for (int i9 = 1; i9 < size; i9++) {
            List<MeasuredCubic> list = this.cubics;
            mutableListOf.add(list.get((i9 + i8) % list.size()).getCubic());
        }
        mutableListOf.add(component1.getCubic());
        MutableFloatList mutableFloatList = new MutableFloatList(this.cubics.size() + 2);
        int size2 = this.cubics.size() + 2;
        int i10 = 0;
        while (i10 < size2) {
            mutableFloatList.add(i10 == 0 ? 0.0f : i10 == this.cubics.size() + 1 ? 1.0f : Utils.positiveModulo(this.cubics.get(((i8 + i10) - 1) % this.cubics.size()).getEndOutlineProgress() - f8, 1.0f));
            i10++;
        }
        List createListBuilder = q.createListBuilder();
        int size3 = this.features.size();
        for (int i11 = 0; i11 < size3; i11++) {
            createListBuilder.add(new ProgressableFeature(Utils.positiveModulo(this.features.get(i11).getProgress() - f8, 1.0f), this.features.get(i11).getFeature()));
        }
        return new MeasuredPolygon(this.measurer, q.build(createListBuilder), mutableListOf, mutableFloatList);
    }

    public final List<ProgressableFeature> getFeatures() {
        return this.features;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.cubics.size();
    }

    public /* bridge */ int indexOf(MeasuredCubic measuredCubic) {
        return super.indexOf((Object) measuredCubic);
    }

    public /* bridge */ int lastIndexOf(MeasuredCubic measuredCubic) {
        return super.lastIndexOf((Object) measuredCubic);
    }

    private MeasuredPolygon(Measurer measurer, List<ProgressableFeature> list, List<? extends Cubic> list2, FloatList floatList) {
        if (floatList.getSize() != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1".toString());
        }
        if (floatList.first() != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero".toString());
        }
        if (floatList.last() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one".toString());
        }
        this.measurer = measurer;
        this.features = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i8 = 0;
        float f8 = 0.0f;
        while (i8 < size) {
            int i9 = i8 + 1;
            if (floatList.get(i9) - floatList.get(i8) > 1.0E-4f) {
                arrayList.add(new MeasuredCubic(this, list2.get(i8), f8, floatList.get(i9)));
                f8 = floatList.get(i9);
            }
            i8 = i9;
        }
        MeasuredCubic.updateProgressRange$graphics_shapes_release$default((MeasuredCubic) arrayList.get(CollectionsKt__CollectionsKt.getLastIndex(arrayList)), 0.0f, 1.0f, 1, null);
        this.cubics = arrayList;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return contains((MeasuredCubic) obj);
        }
        return false;
    }

    @Override // kotlin.collections.b, java.util.List
    public MeasuredCubic get(int i8) {
        return this.cubics.get(i8);
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return indexOf((MeasuredCubic) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return lastIndexOf((MeasuredCubic) obj);
        }
        return -1;
    }
}
