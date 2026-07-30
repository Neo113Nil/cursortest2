package y5;

import j6.d0;
import j6.y;

/* loaded from: classes3.dex */
public final class n implements Comparable {
    public static final a Companion = new a(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    private /* synthetic */ n(byte b8) {
        this.data = b8;
    }

    /* renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m1549and7apg3OU(byte b8, byte b9) {
        return m1556constructorimpl((byte) (b8 & b9));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ n m1550boximpl(byte b8) {
        return new n(b8);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m1551compareTo7apg3OU(byte b8) {
        return kotlin.jvm.internal.s.compare(m1606unboximpl() & 255, b8 & 255);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m1553compareToVKZWuLQ(byte b8, long j8) {
        int compare;
        compare = Long.compare(r.m1710constructorimpl(b8 & 255) ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1554compareToWZ4Q5Ns(byte b8, int i8) {
        int compare;
        compare = Integer.compare(p.m1632constructorimpl(b8 & 255) ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1555compareToxj2QHRw(byte b8, short s7) {
        return kotlin.jvm.internal.s.compare(b8 & 255, s7 & u.MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m1556constructorimpl(byte b8) {
        return b8;
    }

    /* renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m1557decw2LRezQ(byte b8) {
        return m1556constructorimpl((byte) (b8 - 1));
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m1558div7apg3OU(byte b8, byte b9) {
        return j.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1559divVKZWuLQ(byte b8, long j8) {
        return m.a(r.m1710constructorimpl(b8 & 255), j8);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m1560divWZ4Q5Ns(byte b8, int i8) {
        return j.a(p.m1632constructorimpl(b8 & 255), i8);
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m1561divxj2QHRw(byte b8, short s7) {
        return j.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1562equalsimpl(byte b8, Object obj) {
        return (obj instanceof n) && b8 == ((n) obj).m1606unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1563equalsimpl0(byte b8, byte b9) {
        return b8 == b9;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m1564floorDiv7apg3OU(byte b8, byte b9) {
        return j.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1565floorDivVKZWuLQ(byte b8, long j8) {
        return m.a(r.m1710constructorimpl(b8 & 255), j8);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m1566floorDivWZ4Q5Ns(byte b8, int i8) {
        return j.a(p.m1632constructorimpl(b8 & 255), i8);
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m1567floorDivxj2QHRw(byte b8, short s7) {
        return j.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1568hashCodeimpl(byte b8) {
        return b8;
    }

    /* renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m1569incw2LRezQ(byte b8) {
        return m1556constructorimpl((byte) (b8 + 1));
    }

    /* renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m1570invw2LRezQ(byte b8) {
        return m1556constructorimpl((byte) (~b8));
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m1571minus7apg3OU(byte b8, byte b9) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) - p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1572minusVKZWuLQ(byte b8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(b8 & 255) - j8);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1573minusWZ4Q5Ns(byte b8, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) - i8);
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m1574minusxj2QHRw(byte b8, short s7) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) - p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1575mod7apg3OU(byte b8, byte b9) {
        return m1556constructorimpl((byte) i.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1576modVKZWuLQ(byte b8, long j8) {
        return l.a(r.m1710constructorimpl(b8 & 255), j8);
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1577modWZ4Q5Ns(byte b8, int i8) {
        return i.a(p.m1632constructorimpl(b8 & 255), i8);
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1578modxj2QHRw(byte b8, short s7) {
        return u.m1788constructorimpl((short) i.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(s7 & u.MAX_VALUE)));
    }

    /* renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m1579or7apg3OU(byte b8, byte b9) {
        return m1556constructorimpl((byte) (b8 | b9));
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1580plus7apg3OU(byte b8, byte b9) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) + p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1581plusVKZWuLQ(byte b8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(b8 & 255) + j8);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1582plusWZ4Q5Ns(byte b8, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) + i8);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1583plusxj2QHRw(byte b8, short s7) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) + p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final y m1584rangeTo7apg3OU(byte b8, byte b9) {
        return new y(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255), null);
    }

    /* renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final y m1585rangeUntil7apg3OU(byte b8, byte b9) {
        y m200untilJ1ME1BU;
        m200untilJ1ME1BU = d0.m200untilJ1ME1BU(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255));
        return m200untilJ1ME1BU;
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1586rem7apg3OU(byte b8, byte b9) {
        return i.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1587remVKZWuLQ(byte b8, long j8) {
        return l.a(r.m1710constructorimpl(b8 & 255), j8);
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1588remWZ4Q5Ns(byte b8, int i8) {
        return i.a(p.m1632constructorimpl(b8 & 255), i8);
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1589remxj2QHRw(byte b8, short s7) {
        return i.a(p.m1632constructorimpl(b8 & 255), p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1590times7apg3OU(byte b8, byte b9) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) * p.m1632constructorimpl(b9 & 255));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1591timesVKZWuLQ(byte b8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(b8 & 255) * j8);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1592timesWZ4Q5Ns(byte b8, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) * i8);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1593timesxj2QHRw(byte b8, short s7) {
        return p.m1632constructorimpl(p.m1632constructorimpl(b8 & 255) * p.m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1594toByteimpl(byte b8) {
        return b8;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1595toDoubleimpl(byte b8) {
        return b8 & 255;
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1596toFloatimpl(byte b8) {
        return b8 & 255;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1597toIntimpl(byte b8) {
        return b8 & 255;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1598toLongimpl(byte b8) {
        return b8 & 255;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1599toShortimpl(byte b8) {
        return (short) (b8 & 255);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1600toStringimpl(byte b8) {
        return String.valueOf(b8 & 255);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1601toUBytew2LRezQ(byte b8) {
        return b8;
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1602toUIntpVg5ArA(byte b8) {
        return p.m1632constructorimpl(b8 & 255);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1603toULongsVKNKU(byte b8) {
        return r.m1710constructorimpl(b8 & 255);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1604toUShortMh2AYeg(byte b8) {
        return u.m1788constructorimpl((short) (b8 & 255));
    }

    /* renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m1605xor7apg3OU(byte b8, byte b9) {
        return m1556constructorimpl((byte) (b8 ^ b9));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.s.compare(m1606unboximpl() & 255, ((n) obj).m1606unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m1562equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1568hashCodeimpl(this.data);
    }

    public String toString() {
        return m1600toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m1606unboximpl() {
        return this.data;
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m1552compareTo7apg3OU(byte b8, byte b9) {
        return kotlin.jvm.internal.s.compare(b8 & 255, b9 & 255);
    }
}
