package kotlin.collections.unsigned;

import f6.l;
import j6.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.f0;
import y5.n;
import y5.o;
import y5.p;
import y5.q;
import y5.r;
import y5.s;
import y5.u;
import y5.v;
import y5.x;

/* loaded from: classes4.dex */
class b {

    public static final class a extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ int[] $this_asList;

        a(int[] iArr) {
            this.$this_asList = iArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof p) {
                return m1170containsWZ4Q5Ns(((p) obj).m1684unboximpl());
            }
            return false;
        }

        /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
        public boolean m1170containsWZ4Q5Ns(int i8) {
            return q.m1688containsWZ4Q5Ns(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return p.m1626boximpl(m1171getpVg5ArA(i8));
        }

        /* renamed from: get-pVg5ArA, reason: not valid java name */
        public int m1171getpVg5ArA(int i8) {
            return q.m1692getpVg5ArA(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return q.m1693getSizeimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof p) {
                return m1172indexOfWZ4Q5Ns(((p) obj).m1684unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
        public int m1172indexOfWZ4Q5Ns(int i8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, i8);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return q.m1695isEmptyimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof p) {
                return m1173lastIndexOfWZ4Q5Ns(((p) obj).m1684unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
        public int m1173lastIndexOfWZ4Q5Ns(int i8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, i8);
        }
    }

    /* renamed from: kotlin.collections.unsigned.b$b, reason: collision with other inner class name */
    public static final class C0361b extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ long[] $this_asList;

        C0361b(long[] jArr) {
            this.$this_asList = jArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof r) {
                return m1174containsVKZWuLQ(((r) obj).m1762unboximpl());
            }
            return false;
        }

        /* renamed from: contains-VKZWuLQ, reason: not valid java name */
        public boolean m1174containsVKZWuLQ(long j8) {
            return s.m1766containsVKZWuLQ(this.$this_asList, j8);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return r.m1704boximpl(m1175getsVKNKU(i8));
        }

        /* renamed from: get-s-VKNKU, reason: not valid java name */
        public long m1175getsVKNKU(int i8) {
            return s.m1770getsVKNKU(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return s.m1771getSizeimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof r) {
                return m1176indexOfVKZWuLQ(((r) obj).m1762unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-VKZWuLQ, reason: not valid java name */
        public int m1176indexOfVKZWuLQ(long j8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, j8);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return s.m1773isEmptyimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof r) {
                return m1177lastIndexOfVKZWuLQ(((r) obj).m1762unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
        public int m1177lastIndexOfVKZWuLQ(long j8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, j8);
        }
    }

    public static final class c extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ byte[] $this_asList;

        c(byte[] bArr) {
            this.$this_asList = bArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof n) {
                return m1178contains7apg3OU(((n) obj).m1606unboximpl());
            }
            return false;
        }

        /* renamed from: contains-7apg3OU, reason: not valid java name */
        public boolean m1178contains7apg3OU(byte b8) {
            return o.m1610contains7apg3OU(this.$this_asList, b8);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return n.m1550boximpl(m1179getw2LRezQ(i8));
        }

        /* renamed from: get-w2LRezQ, reason: not valid java name */
        public byte m1179getw2LRezQ(int i8) {
            return o.m1614getw2LRezQ(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return o.m1615getSizeimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof n) {
                return m1180indexOf7apg3OU(((n) obj).m1606unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-7apg3OU, reason: not valid java name */
        public int m1180indexOf7apg3OU(byte b8) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, b8);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return o.m1617isEmptyimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof n) {
                return m1181lastIndexOf7apg3OU(((n) obj).m1606unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
        public int m1181lastIndexOf7apg3OU(byte b8) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, b8);
        }
    }

    public static final class d extends kotlin.collections.b implements RandomAccess {
        final /* synthetic */ short[] $this_asList;

        d(short[] sArr) {
            this.$this_asList = sArr;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof u) {
                return m1182containsxj2QHRw(((u) obj).m1838unboximpl());
            }
            return false;
        }

        /* renamed from: contains-xj2QHRw, reason: not valid java name */
        public boolean m1182containsxj2QHRw(short s7) {
            return v.m1842containsxj2QHRw(this.$this_asList, s7);
        }

        @Override // kotlin.collections.b, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i8) {
            return u.m1782boximpl(m1183getMh2AYeg(i8));
        }

        /* renamed from: get-Mh2AYeg, reason: not valid java name */
        public short m1183getMh2AYeg(int i8) {
            return v.m1846getMh2AYeg(this.$this_asList, i8);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return v.m1847getSizeimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof u) {
                return m1184indexOfxj2QHRw(((u) obj).m1838unboximpl());
            }
            return -1;
        }

        /* renamed from: indexOf-xj2QHRw, reason: not valid java name */
        public int m1184indexOfxj2QHRw(short s7) {
            return ArraysKt___ArraysKt.indexOf(this.$this_asList, s7);
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return v.m1849isEmptyimpl(this.$this_asList);
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof u) {
                return m1185lastIndexOfxj2QHRw(((u) obj).m1838unboximpl());
            }
            return -1;
        }

        /* renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
        public int m1185lastIndexOfxj2QHRw(short s7) {
            return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, s7);
        }
    }

    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<p> m1130asListajY9A(int[] asList) {
        kotlin.jvm.internal.s.checkNotNullParameter(asList, "$this$asList");
        return new a(asList);
    }

    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<n> m1131asListGBYM_sE(byte[] asList) {
        kotlin.jvm.internal.s.checkNotNullParameter(asList, "$this$asList");
        return new c(asList);
    }

    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<r> m1132asListQwZRm1k(long[] asList) {
        kotlin.jvm.internal.s.checkNotNullParameter(asList, "$this$asList");
        return new C0361b(asList);
    }

    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<u> m1133asListrL5Bavg(short[] asList) {
        kotlin.jvm.internal.s.checkNotNullParameter(asList, "$this$asList");
        return new d(asList);
    }

    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m1134binarySearch2fe2U9s(int[] binarySearch, int i8, int i9, int i10) {
        kotlin.jvm.internal.s.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i9, i10, q.m1693getSizeimpl(binarySearch));
        int i11 = i10 - 1;
        while (i9 <= i11) {
            int i12 = (i9 + i11) >>> 1;
            int uintCompare = x.uintCompare(binarySearch[i12], i8);
            if (uintCompare < 0) {
                i9 = i12 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m1135binarySearch2fe2U9s$default(int[] iArr, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = q.m1693getSizeimpl(iArr);
        }
        return m1134binarySearch2fe2U9s(iArr, i8, i9, i10);
    }

    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m1136binarySearchEtDCXyQ(short[] binarySearch, short s7, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, v.m1847getSizeimpl(binarySearch));
        int i10 = s7 & u.MAX_VALUE;
        int i11 = i9 - 1;
        while (i8 <= i11) {
            int i12 = (i8 + i11) >>> 1;
            int uintCompare = x.uintCompare(binarySearch[i12], i10);
            if (uintCompare < 0) {
                i8 = i12 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m1137binarySearchEtDCXyQ$default(short[] sArr, short s7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = v.m1847getSizeimpl(sArr);
        }
        return m1136binarySearchEtDCXyQ(sArr, s7, i8, i9);
    }

    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m1138binarySearchK6DWlUc(long[] binarySearch, long j8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, s.m1771getSizeimpl(binarySearch));
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int ulongCompare = x.ulongCompare(binarySearch[i11], j8);
            if (ulongCompare < 0) {
                i8 = i11 + 1;
            } else {
                if (ulongCompare <= 0) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m1139binarySearchK6DWlUc$default(long[] jArr, long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = s.m1771getSizeimpl(jArr);
        }
        return m1138binarySearchK6DWlUc(jArr, j8, i8, i9);
    }

    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m1140binarySearchWpHrYlw(byte[] binarySearch, byte b8, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, o.m1615getSizeimpl(binarySearch));
        int i10 = b8 & 255;
        int i11 = i9 - 1;
        while (i8 <= i11) {
            int i12 = (i8 + i11) >>> 1;
            int uintCompare = x.uintCompare(binarySearch[i12], i10);
            if (uintCompare < 0) {
                i8 = i12 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i12;
                }
                i11 = i12 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m1141binarySearchWpHrYlw$default(byte[] bArr, byte b8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = o.m1615getSizeimpl(bArr);
        }
        return m1140binarySearchWpHrYlw(bArr, b8, i8, i9);
    }

    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m1142elementAtPpDY95g(byte[] elementAt, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(elementAt, "$this$elementAt");
        return o.m1614getw2LRezQ(elementAt, i8);
    }

    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m1143elementAtnggk6HY(short[] elementAt, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(elementAt, "$this$elementAt");
        return v.m1846getMh2AYeg(elementAt, i8);
    }

    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m1144elementAtqFRl0hI(int[] elementAt, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(elementAt, "$this$elementAt");
        return q.m1692getpVg5ArA(elementAt, i8);
    }

    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m1145elementAtr7IrZao(long[] elementAt, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(elementAt, "$this$elementAt");
        return s.m1770getsVKNKU(elementAt, i8);
    }

    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ p m1146maxajY9A(int[] max) {
        kotlin.jvm.internal.s.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m794maxOrNullajY9A(max);
    }

    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ n m1147maxGBYM_sE(byte[] max) {
        kotlin.jvm.internal.s.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m795maxOrNullGBYM_sE(max);
    }

    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ r m1148maxQwZRm1k(long[] max) {
        kotlin.jvm.internal.s.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m796maxOrNullQwZRm1k(max);
    }

    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ u m1149maxrL5Bavg(short[] max) {
        kotlin.jvm.internal.s.checkNotNullParameter(max, "$this$max");
        return UArraysKt___UArraysKt.m797maxOrNullrL5Bavg(max);
    }

    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> n m1150maxByJOV_ifY(byte[] maxBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(maxBy)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                    comparable = comparable2;
                }
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> r m1151maxByMShoTSo(long[] maxBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (s.m1773isEmptyimpl(maxBy)) {
            return null;
        }
        long m1770getsVKNKU = s.m1770getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = s.m1770getsVKNKU(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                    comparable = comparable2;
                }
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> p m1152maxByjgv0xPQ(int[] maxBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(maxBy)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                int m1692getpVg5ArA2 = q.m1692getpVg5ArA(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1692getpVg5ArA = m1692getpVg5ArA2;
                    comparable = comparable2;
                }
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> u m1153maxByxTcfx_M(short[] maxBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(maxBy)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(maxBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
                if (comparable.compareTo(comparable2) < 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                    comparable = comparable2;
                }
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ n m1154maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m802maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ p m1155maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m803maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ u m1156maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m804maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ r m1157maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m805maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ p m1158minajY9A(int[] min) {
        kotlin.jvm.internal.s.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m850minOrNullajY9A(min);
    }

    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ n m1159minGBYM_sE(byte[] min) {
        kotlin.jvm.internal.s.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m851minOrNullGBYM_sE(min);
    }

    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ r m1160minQwZRm1k(long[] min) {
        kotlin.jvm.internal.s.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m852minOrNullQwZRm1k(min);
    }

    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ u m1161minrL5Bavg(short[] min) {
        kotlin.jvm.internal.s.checkNotNullParameter(min, "$this$min");
        return UArraysKt___UArraysKt.m853minOrNullrL5Bavg(min);
    }

    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> n m1162minByJOV_ifY(byte[] minBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (o.m1617isEmptyimpl(minBy)) {
            return null;
        }
        byte m1614getw2LRezQ = o.m1614getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte m1614getw2LRezQ2 = o.m1614getw2LRezQ(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(n.m1550boximpl(m1614getw2LRezQ2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1614getw2LRezQ = m1614getw2LRezQ2;
                    comparable = comparable2;
                }
            }
        }
        return n.m1550boximpl(m1614getw2LRezQ);
    }

    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> r m1163minByMShoTSo(long[] minBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (s.m1773isEmptyimpl(minBy)) {
            return null;
        }
        long m1770getsVKNKU = s.m1770getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                long m1770getsVKNKU2 = s.m1770getsVKNKU(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(r.m1704boximpl(m1770getsVKNKU2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1770getsVKNKU = m1770getsVKNKU2;
                    comparable = comparable2;
                }
            }
        }
        return r.m1704boximpl(m1770getsVKNKU);
    }

    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> p m1164minByjgv0xPQ(int[] minBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (q.m1695isEmptyimpl(minBy)) {
            return null;
        }
        int m1692getpVg5ArA = q.m1692getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                int m1692getpVg5ArA2 = q.m1692getpVg5ArA(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(p.m1626boximpl(m1692getpVg5ArA2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1692getpVg5ArA = m1692getpVg5ArA2;
                    comparable = comparable2;
                }
            }
        }
        return p.m1626boximpl(m1692getpVg5ArA);
    }

    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> u m1165minByxTcfx_M(short[] minBy, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (v.m1849isEmptyimpl(minBy)) {
            return null;
        }
        short m1846getMh2AYeg = v.m1846getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg));
            f0 it = new m(1, lastIndex).iterator();
            while (it.hasNext()) {
                short m1846getMh2AYeg2 = v.m1846getMh2AYeg(minBy, it.nextInt());
                Comparable comparable2 = (Comparable) selector.invoke(u.m1782boximpl(m1846getMh2AYeg2));
                if (comparable.compareTo(comparable2) > 0) {
                    m1846getMh2AYeg = m1846getMh2AYeg2;
                    comparable = comparable2;
                }
            }
        }
        return u.m1782boximpl(m1846getMh2AYeg);
    }

    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ n m1166minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m858minWithOrNullXMRcp5o(minWith, comparator);
    }

    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ p m1167minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m859minWithOrNullYmdZ_VM(minWith, comparator);
    }

    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ u m1168minWitheOHTfZs(short[] minWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m860minWithOrNulleOHTfZs(minWith, comparator);
    }

    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ r m1169minWithzrEWJaI(long[] minWith, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return UArraysKt___UArraysKt.m861minWithOrNullzrEWJaI(minWith, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(int[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1693getSizeimpl = q.m1693getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1693getSizeimpl; i8++) {
            valueOf = valueOf.add((BigInteger) selector.invoke(p.m1626boximpl(q.m1692getpVg5ArA(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigDecimal sumOfBigDecimal(long[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1771getSizeimpl = s.m1771getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(r.m1704boximpl(s.m1770getsVKNKU(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1771getSizeimpl = s.m1771getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1771getSizeimpl; i8++) {
            valueOf = valueOf.add((BigInteger) selector.invoke(r.m1704boximpl(s.m1770getsVKNKU(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1615getSizeimpl = o.m1615getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1615getSizeimpl; i8++) {
            valueOf = valueOf.add((BigInteger) selector.invoke(n.m1550boximpl(o.m1614getw2LRezQ(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sumOf, l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        int m1847getSizeimpl = v.m1847getSizeimpl(sumOf);
        for (int i8 = 0; i8 < m1847getSizeimpl; i8++) {
            valueOf = valueOf.add((BigInteger) selector.invoke(u.m1782boximpl(v.m1846getMh2AYeg(sumOf, i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }
}
