package kotlin.text;

import i2.InterfaceC2471a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
final class b implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f41262a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41263b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41264c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2 f41265d;

    public static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private int f41266b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f41267c;

        /* renamed from: d, reason: collision with root package name */
        private int f41268d;

        /* renamed from: e, reason: collision with root package name */
        private IntRange f41269e;

        /* renamed from: f, reason: collision with root package name */
        private int f41270f;

        a() {
            int k4 = kotlin.ranges.g.k(b.this.f41263b, 0, b.this.f41262a.length());
            this.f41267c = k4;
            this.f41268d = k4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            if (r0 < r6.f41271g.f41264c) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void a() {
            if (this.f41268d < 0) {
                this.f41266b = 0;
                this.f41269e = null;
                return;
            }
            if (b.this.f41264c > 0) {
                int i4 = this.f41270f + 1;
                this.f41270f = i4;
            }
            if (this.f41268d <= b.this.f41262a.length()) {
                Pair pair = (Pair) b.this.f41265d.invoke(b.this.f41262a, Integer.valueOf(this.f41268d));
                if (pair == null) {
                    this.f41269e = new IntRange(this.f41267c, StringsKt__StringsKt.W(b.this.f41262a));
                    this.f41268d = -1;
                } else {
                    int intValue = ((Number) pair.component1()).intValue();
                    int intValue2 = ((Number) pair.component2()).intValue();
                    this.f41269e = kotlin.ranges.g.p(this.f41267c, intValue);
                    int i5 = intValue + intValue2;
                    this.f41267c = i5;
                    this.f41268d = i5 + (intValue2 == 0 ? 1 : 0);
                }
                this.f41266b = 1;
            }
            this.f41269e = new IntRange(this.f41267c, StringsKt__StringsKt.W(b.this.f41262a));
            this.f41268d = -1;
            this.f41266b = 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f41266b == -1) {
                a();
            }
            if (this.f41266b == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f41269e;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f41269e = null;
            this.f41266b = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41266b == -1) {
                a();
            }
            return this.f41266b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, int i4, int i5, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f41262a = input;
        this.f41263b = i4;
        this.f41264c = i5;
        this.f41265d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
