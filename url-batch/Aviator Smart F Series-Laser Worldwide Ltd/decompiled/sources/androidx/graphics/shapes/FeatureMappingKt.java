package androidx.graphics.shapes;

import androidx.graphics.shapes.Feature;
import j6.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q;
import kotlin.jvm.internal.s;
import y5.h;

/* loaded from: classes.dex */
public final class FeatureMappingKt {
    private static final String LOG_TAG = "FeatureMapping";

    public static final List<ProgressableFeature> doMapping(List<ProgressableFeature> f12, List<ProgressableFeature> f22) {
        m indices;
        List<ProgressableFeature> mutableListOf;
        s.checkNotNullParameter(f12, "f1");
        s.checkNotNullParameter(f22, "f2");
        indices = CollectionsKt__CollectionsKt.getIndices(f22);
        Iterator it = indices.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        f0 f0Var = (f0) it;
        int nextInt = f0Var.nextInt();
        if (it.hasNext()) {
            float featureDistSquared = featureDistSquared(f12.get(0).getFeature(), f22.get(nextInt).getFeature());
            do {
                int nextInt2 = f0Var.nextInt();
                float featureDistSquared2 = featureDistSquared(f12.get(0).getFeature(), f22.get(nextInt2).getFeature());
                if (Float.compare(featureDistSquared, featureDistSquared2) > 0) {
                    nextInt = nextInt2;
                    featureDistSquared = featureDistSquared2;
                }
            } while (it.hasNext());
        }
        int size = f12.size();
        int size2 = f22.size();
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(f22.get(nextInt));
        int i8 = nextInt;
        for (int i9 = 1; i9 < size; i9++) {
            int i10 = nextInt - (size - i9);
            if (i10 <= i8) {
                i10 += size2;
            }
            Iterator it2 = new m(i8 + 1, i10).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            f0 f0Var2 = (f0) it2;
            int nextInt3 = f0Var2.nextInt();
            if (it2.hasNext()) {
                float featureDistSquared3 = featureDistSquared(f12.get(i9).getFeature(), f22.get(nextInt3 % size2).getFeature());
                do {
                    int nextInt4 = f0Var2.nextInt();
                    float featureDistSquared4 = featureDistSquared(f12.get(i9).getFeature(), f22.get(nextInt4 % size2).getFeature());
                    if (Float.compare(featureDistSquared3, featureDistSquared4) > 0) {
                        nextInt3 = nextInt4;
                        featureDistSquared3 = featureDistSquared4;
                    }
                } while (it2.hasNext());
            }
            i8 = nextInt3;
            mutableListOf.add(f22.get(i8 % size2));
        }
        return mutableListOf;
    }

    public static final float featureDistSquared(Feature f12, Feature f22) {
        s.checkNotNullParameter(f12, "f1");
        s.checkNotNullParameter(f22, "f2");
        if ((f12 instanceof Feature.Corner) && (f22 instanceof Feature.Corner) && ((Feature.Corner) f12).getConvex() != ((Feature.Corner) f22).getConvex()) {
            return Float.MAX_VALUE;
        }
        float anchor0X = (((Cubic) CollectionsKt___CollectionsKt.first((List) f12.getCubics())).getAnchor0X() + ((Cubic) CollectionsKt___CollectionsKt.last((List) f12.getCubics())).getAnchor1X()) / 2.0f;
        float anchor0Y = (((Cubic) CollectionsKt___CollectionsKt.first((List) f12.getCubics())).getAnchor0Y() + ((Cubic) CollectionsKt___CollectionsKt.last((List) f12.getCubics())).getAnchor1Y()) / 2.0f;
        float anchor0X2 = anchor0X - ((((Cubic) CollectionsKt___CollectionsKt.first((List) f22.getCubics())).getAnchor0X() + ((Cubic) CollectionsKt___CollectionsKt.last((List) f22.getCubics())).getAnchor1X()) / 2.0f);
        float anchor0Y2 = anchor0Y - ((((Cubic) CollectionsKt___CollectionsKt.first((List) f22.getCubics())).getAnchor0Y() + ((Cubic) CollectionsKt___CollectionsKt.last((List) f22.getCubics())).getAnchor1Y()) / 2.0f);
        return (anchor0X2 * anchor0X2) + (anchor0Y2 * anchor0Y2);
    }

    public static final DoubleMapper featureMapper(List<ProgressableFeature> features1, List<ProgressableFeature> features2) {
        s.checkNotNullParameter(features1, "features1");
        s.checkNotNullParameter(features2, "features2");
        List createListBuilder = q.createListBuilder();
        int size = features1.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (features1.get(i8).getFeature() instanceof Feature.Corner) {
                createListBuilder.add(features1.get(i8));
            }
        }
        List build = q.build(createListBuilder);
        List createListBuilder2 = q.createListBuilder();
        int size2 = features2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            if (features2.get(i9).getFeature() instanceof Feature.Corner) {
                createListBuilder2.add(features2.get(i9));
            }
        }
        List build2 = q.build(createListBuilder2);
        Pair pair = build.size() > build2.size() ? h.to(doMapping(build2, build), build2) : h.to(build, doMapping(build, build2));
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        List createListBuilder3 = q.createListBuilder();
        int size3 = list.size();
        for (int i10 = 0; i10 < size3 && i10 != list2.size(); i10++) {
            createListBuilder3.add(h.to(Float.valueOf(((ProgressableFeature) list.get(i10)).getProgress()), Float.valueOf(((ProgressableFeature) list2.get(i10)).getProgress())));
        }
        Pair[] pairArr = (Pair[]) q.build(createListBuilder3).toArray(new Pair[0]);
        return new DoubleMapper((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
