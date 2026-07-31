package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: PathNode.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "toPathNodes", "(C[F)Ljava/util/List;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PathNodeKt {
    public static final List toPathNodes(char c, float[] args) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            return CollectionsKt.listOf(PathNode.Close.INSTANCE);
        }
        if (c == 'm') {
            IntProgression step = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step, 10));
            Iterator it = step.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                float[] copyOfRange = ArraysKt.copyOfRange(args, nextInt, nextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(copyOfRange[0], copyOfRange[1]);
                if (nextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(copyOfRange[0], copyOfRange[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c == 'M') {
            IntProgression step2 = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step2, 10));
            Iterator it2 = step2.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((IntIterator) it2).nextInt();
                float[] copyOfRange2 = ArraysKt.copyOfRange(args, nextInt2, nextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(copyOfRange2[0], copyOfRange2[1]);
                if (nextInt2 > 0) {
                    moveTo = new PathNode.LineTo(copyOfRange2[0], copyOfRange2[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c == 'l') {
            IntProgression step3 = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step3, 10));
            Iterator it3 = step3.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((IntIterator) it3).nextInt();
                float[] copyOfRange3 = ArraysKt.copyOfRange(args, nextInt3, nextInt3 + 2);
                arrayList.add(new PathNode.RelativeLineTo(copyOfRange3[0], copyOfRange3[1]));
            }
        } else if (c == 'L') {
            IntProgression step4 = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step4, 10));
            Iterator it4 = step4.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((IntIterator) it4).nextInt();
                float[] copyOfRange4 = ArraysKt.copyOfRange(args, nextInt4, nextInt4 + 2);
                arrayList.add(new PathNode.LineTo(copyOfRange4[0], copyOfRange4[1]));
            }
        } else if (c == 'h') {
            IntProgression step5 = RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step5, 10));
            Iterator it5 = step5.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((IntIterator) it5).nextInt();
                arrayList.add(new PathNode.RelativeHorizontalTo(ArraysKt.copyOfRange(args, nextInt5, nextInt5 + 1)[0]));
            }
        } else if (c == 'H') {
            IntProgression step6 = RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step6, 10));
            Iterator it6 = step6.iterator();
            while (it6.hasNext()) {
                int nextInt6 = ((IntIterator) it6).nextInt();
                arrayList.add(new PathNode.HorizontalTo(ArraysKt.copyOfRange(args, nextInt6, nextInt6 + 1)[0]));
            }
        } else if (c == 'v') {
            IntProgression step7 = RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step7, 10));
            Iterator it7 = step7.iterator();
            while (it7.hasNext()) {
                int nextInt7 = ((IntIterator) it7).nextInt();
                arrayList.add(new PathNode.RelativeVerticalTo(ArraysKt.copyOfRange(args, nextInt7, nextInt7 + 1)[0]));
            }
        } else if (c == 'V') {
            IntProgression step8 = RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step8, 10));
            Iterator it8 = step8.iterator();
            while (it8.hasNext()) {
                int nextInt8 = ((IntIterator) it8).nextInt();
                arrayList.add(new PathNode.VerticalTo(ArraysKt.copyOfRange(args, nextInt8, nextInt8 + 1)[0]));
            }
        } else if (c == 'c') {
            IntProgression step9 = RangesKt.step(new IntRange(0, args.length - 6), 6);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step9, 10));
            Iterator it9 = step9.iterator();
            while (it9.hasNext()) {
                int nextInt9 = ((IntIterator) it9).nextInt();
                float[] copyOfRange5 = ArraysKt.copyOfRange(args, nextInt9, nextInt9 + 6);
                arrayList.add(new PathNode.RelativeCurveTo(copyOfRange5[0], copyOfRange5[1], copyOfRange5[2], copyOfRange5[3], copyOfRange5[4], copyOfRange5[5]));
            }
        } else if (c == 'C') {
            IntProgression step10 = RangesKt.step(new IntRange(0, args.length - 6), 6);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step10, 10));
            Iterator it10 = step10.iterator();
            while (it10.hasNext()) {
                int nextInt10 = ((IntIterator) it10).nextInt();
                float[] copyOfRange6 = ArraysKt.copyOfRange(args, nextInt10, nextInt10 + 6);
                arrayList.add(new PathNode.CurveTo(copyOfRange6[0], copyOfRange6[1], copyOfRange6[2], copyOfRange6[3], copyOfRange6[4], copyOfRange6[5]));
            }
        } else if (c == 's') {
            IntProgression step11 = RangesKt.step(new IntRange(0, args.length - 4), 4);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step11, 10));
            Iterator it11 = step11.iterator();
            while (it11.hasNext()) {
                int nextInt11 = ((IntIterator) it11).nextInt();
                float[] copyOfRange7 = ArraysKt.copyOfRange(args, nextInt11, nextInt11 + 4);
                arrayList.add(new PathNode.RelativeReflectiveCurveTo(copyOfRange7[0], copyOfRange7[1], copyOfRange7[2], copyOfRange7[3]));
            }
        } else if (c == 'S') {
            IntProgression step12 = RangesKt.step(new IntRange(0, args.length - 4), 4);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step12, 10));
            Iterator it12 = step12.iterator();
            while (it12.hasNext()) {
                int nextInt12 = ((IntIterator) it12).nextInt();
                float[] copyOfRange8 = ArraysKt.copyOfRange(args, nextInt12, nextInt12 + 4);
                arrayList.add(new PathNode.ReflectiveCurveTo(copyOfRange8[0], copyOfRange8[1], copyOfRange8[2], copyOfRange8[3]));
            }
        } else if (c == 'q') {
            IntProgression step13 = RangesKt.step(new IntRange(0, args.length - 4), 4);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step13, 10));
            Iterator it13 = step13.iterator();
            while (it13.hasNext()) {
                int nextInt13 = ((IntIterator) it13).nextInt();
                float[] copyOfRange9 = ArraysKt.copyOfRange(args, nextInt13, nextInt13 + 4);
                arrayList.add(new PathNode.RelativeQuadTo(copyOfRange9[0], copyOfRange9[1], copyOfRange9[2], copyOfRange9[3]));
            }
        } else if (c == 'Q') {
            IntProgression step14 = RangesKt.step(new IntRange(0, args.length - 4), 4);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step14, 10));
            Iterator it14 = step14.iterator();
            while (it14.hasNext()) {
                int nextInt14 = ((IntIterator) it14).nextInt();
                float[] copyOfRange10 = ArraysKt.copyOfRange(args, nextInt14, nextInt14 + 4);
                arrayList.add(new PathNode.QuadTo(copyOfRange10[0], copyOfRange10[1], copyOfRange10[2], copyOfRange10[3]));
            }
        } else if (c == 't') {
            IntProgression step15 = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step15, 10));
            Iterator it15 = step15.iterator();
            while (it15.hasNext()) {
                int nextInt15 = ((IntIterator) it15).nextInt();
                float[] copyOfRange11 = ArraysKt.copyOfRange(args, nextInt15, nextInt15 + 2);
                arrayList.add(new PathNode.RelativeReflectiveQuadTo(copyOfRange11[0], copyOfRange11[1]));
            }
        } else if (c == 'T') {
            IntProgression step16 = RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step16, 10));
            Iterator it16 = step16.iterator();
            while (it16.hasNext()) {
                int nextInt16 = ((IntIterator) it16).nextInt();
                float[] copyOfRange12 = ArraysKt.copyOfRange(args, nextInt16, nextInt16 + 2);
                arrayList.add(new PathNode.ReflectiveQuadTo(copyOfRange12[0], copyOfRange12[1]));
            }
        } else if (c == 'a') {
            IntProgression step17 = RangesKt.step(new IntRange(0, args.length - 7), 7);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step17, 10));
            Iterator it17 = step17.iterator();
            while (it17.hasNext()) {
                int nextInt17 = ((IntIterator) it17).nextInt();
                float[] copyOfRange13 = ArraysKt.copyOfRange(args, nextInt17, nextInt17 + 7);
                arrayList.add(new PathNode.RelativeArcTo(copyOfRange13[0], copyOfRange13[1], copyOfRange13[2], Float.compare(copyOfRange13[3], 0.0f) != 0, Float.compare(copyOfRange13[4], 0.0f) != 0, copyOfRange13[5], copyOfRange13[6]));
            }
        } else {
            if (c != 'A') {
                throw new IllegalArgumentException("Unknown command for: " + c);
            }
            IntProgression step18 = RangesKt.step(new IntRange(0, args.length - 7), 7);
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(step18, 10));
            Iterator it18 = step18.iterator();
            while (it18.hasNext()) {
                int nextInt18 = ((IntIterator) it18).nextInt();
                float[] copyOfRange14 = ArraysKt.copyOfRange(args, nextInt18, nextInt18 + 7);
                arrayList.add(new PathNode.ArcTo(copyOfRange14[0], copyOfRange14[1], copyOfRange14[2], Float.compare(copyOfRange14[3], 0.0f) != 0, Float.compare(copyOfRange14[4], 0.0f) != 0, copyOfRange14[5], copyOfRange14[6]));
            }
        }
        return arrayList;
    }
}
