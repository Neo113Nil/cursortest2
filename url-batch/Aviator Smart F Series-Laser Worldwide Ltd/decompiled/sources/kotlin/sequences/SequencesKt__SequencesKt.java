package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.random.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class SequencesKt__SequencesKt extends r {

    public static final class a implements m {
        final /* synthetic */ f6.a $iterator;

        public a(f6.a aVar) {
            this.$iterator = aVar;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            return (Iterator) this.$iterator.invoke();
        }
    }

    public static final class b implements m {
        final /* synthetic */ Iterator $this_asSequence$inlined;

        public b(Iterator it) {
            this.$this_asSequence$inlined = it;
        }

        @Override // kotlin.sequences.m
        public Iterator<T> iterator() {
            return this.$this_asSequence$inlined;
        }
    }

    private static final <T> m Sequence(f6.a iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        return new a(iterator);
    }

    public static <T> m asSequence(Iterator<? extends T> it) {
        m constrainOnce;
        kotlin.jvm.internal.s.checkNotNullParameter(it, "<this>");
        constrainOnce = constrainOnce(new b(it));
        return constrainOnce;
    }

    public static <T> m constrainOnce(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return mVar instanceof kotlin.sequences.a ? mVar : new kotlin.sequences.a(mVar);
    }

    public static <T> m emptySequence() {
        return g.INSTANCE;
    }

    public static final <T, C, R> m flatMapIndexed(m source, f6.p transform, f6.l iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        return q.sequence(new SequencesKt__SequencesKt$flatMapIndexed$1(source, transform, iterator, null));
    }

    public static final <T> m flatten(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return flatten$SequencesKt__SequencesKt(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$1
            @Override // f6.l
            public final Iterator<T> invoke(m it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.iterator();
            }
        });
    }

    private static final <T, R> m flatten$SequencesKt__SequencesKt(m mVar, f6.l lVar) {
        return mVar instanceof w ? ((w) mVar).flatten$kotlin_stdlib(lVar) : new i(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$3
            @Override // f6.l
            public final T invoke(T t7) {
                return t7;
            }
        }, lVar);
    }

    public static final <T> m flattenSequenceOfIterable(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return flatten$SequencesKt__SequencesKt(mVar, new f6.l() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f6.l
            public final Iterator<T> invoke(Iterable<? extends T> it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.iterator();
            }
        });
    }

    public static final <T> m generateSequence(final f6.a nextFunction) {
        m constrainOnce;
        kotlin.jvm.internal.s.checkNotNullParameter(nextFunction, "nextFunction");
        constrainOnce = constrainOnce(new j(nextFunction, new f6.l() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
            @Override // f6.l
            public final T invoke(T it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return f6.a.this.invoke();
            }
        }));
        return constrainOnce;
    }

    public static final <T> m ifEmpty(m mVar, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return q.sequence(new SequencesKt__SequencesKt$ifEmpty$1(mVar, defaultValue, null));
    }

    private static final <T> m orEmpty(m mVar) {
        return mVar == null ? emptySequence() : mVar;
    }

    public static final <T> m sequenceOf(T... elements) {
        m asSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return emptySequence();
        }
        asSequence = ArraysKt___ArraysKt.asSequence(elements);
        return asSequence;
    }

    public static final <T> m shuffled(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return shuffled(mVar, Random.Default);
    }

    public static final <T, R> Pair<List<T>, List<R>> unzip(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = mVar.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return y5.h.to(arrayList, arrayList2);
    }

    public static <T> m generateSequence(final T t7, f6.l nextFunction) {
        kotlin.jvm.internal.s.checkNotNullParameter(nextFunction, "nextFunction");
        return t7 == null ? g.INSTANCE : new j(new f6.a() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final T invoke() {
                return t7;
            }
        }, nextFunction);
    }

    public static final <T> m shuffled(m mVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        return q.sequence(new SequencesKt__SequencesKt$shuffled$1(mVar, random, null));
    }

    public static <T> m generateSequence(f6.a seedFunction, f6.l nextFunction) {
        kotlin.jvm.internal.s.checkNotNullParameter(seedFunction, "seedFunction");
        kotlin.jvm.internal.s.checkNotNullParameter(nextFunction, "nextFunction");
        return new j(seedFunction, nextFunction);
    }
}
