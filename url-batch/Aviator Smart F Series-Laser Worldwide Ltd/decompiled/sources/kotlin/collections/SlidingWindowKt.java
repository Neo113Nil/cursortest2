package kotlin.collections;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SlidingWindowKt {

    public static final class a implements kotlin.sequences.m {
        final /* synthetic */ boolean $partialWindows$inlined;
        final /* synthetic */ boolean $reuseBuffer$inlined;
        final /* synthetic */ int $size$inlined;
        final /* synthetic */ int $step$inlined;
        final /* synthetic */ kotlin.sequences.m $this_windowedSequence$inlined;

        public a(kotlin.sequences.m mVar, int i8, int i9, boolean z7, boolean z8) {
            this.$this_windowedSequence$inlined = mVar;
            this.$size$inlined = i8;
            this.$step$inlined = i9;
            this.$partialWindows$inlined = z7;
            this.$reuseBuffer$inlined = z8;
        }

        @Override // kotlin.sequences.m
        public Iterator<List<? extends T>> iterator() {
            return SlidingWindowKt.windowedIterator(this.$this_windowedSequence$inlined.iterator(), this.$size$inlined, this.$step$inlined, this.$partialWindows$inlined, this.$reuseBuffer$inlined);
        }
    }

    public static final void checkWindowSizeStep(int i8, int i9) {
        String str;
        if (i8 <= 0 || i9 <= 0) {
            if (i8 != i9) {
                str = "Both size " + i8 + " and step " + i9 + " must be greater than zero.";
            } else {
                str = "size " + i8 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> windowedIterator(Iterator<? extends T> iterator, int i8, int i9, boolean z7, boolean z8) {
        Iterator<List<T>> it;
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        if (!iterator.hasNext()) {
            return z.INSTANCE;
        }
        it = kotlin.sequences.q.iterator(new SlidingWindowKt$windowedIterator$1(i8, i9, iterator, z8, z7, null));
        return it;
    }

    public static final <T> kotlin.sequences.m windowedSequence(kotlin.sequences.m mVar, int i8, int i9, boolean z7, boolean z8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        checkWindowSizeStep(i8, i9);
        return new a(mVar, i8, i9, z7, z8);
    }
}
