package y5;

import j6.d0;
import j6.y;

/* loaded from: classes3.dex */
public final class p implements Comparable {
    public static final a Companion = new a(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    private /* synthetic */ p(int i8) {
        this.data = i8;
    }

    /* renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m1625andWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 & i9);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p m1626boximpl(int i8) {
        return new p(i8);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1627compareTo7apg3OU(int i8, byte b8) {
        int compare;
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, m1632constructorimpl(b8 & 255) ^ Integer.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m1628compareToVKZWuLQ(int i8, long j8) {
        int compare;
        compare = Long.compare(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m1629compareToWZ4Q5Ns(int i8) {
        return x.uintCompare(m1684unboximpl(), i8);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1631compareToxj2QHRw(int i8, short s7) {
        int compare;
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, m1632constructorimpl(s7 & u.MAX_VALUE) ^ Integer.MIN_VALUE);
        return compare;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1632constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m1633decpVg5ArA(int i8) {
        return m1632constructorimpl(i8 - 1);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m1634div7apg3OU(int i8, byte b8) {
        return j.a(i8, m1632constructorimpl(b8 & 255));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1635divVKZWuLQ(int i8, long j8) {
        return m.a(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32), j8);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m1636divWZ4Q5Ns(int i8, int i9) {
        return x.m1857uintDivideJ1ME1BU(i8, i9);
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m1637divxj2QHRw(int i8, short s7) {
        return j.a(i8, m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1638equalsimpl(int i8, Object obj) {
        return (obj instanceof p) && i8 == ((p) obj).m1684unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1639equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m1640floorDiv7apg3OU(int i8, byte b8) {
        return j.a(i8, m1632constructorimpl(b8 & 255));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1641floorDivVKZWuLQ(int i8, long j8) {
        return m.a(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32), j8);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m1642floorDivWZ4Q5Ns(int i8, int i9) {
        return j.a(i8, i9);
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m1643floorDivxj2QHRw(int i8, short s7) {
        return j.a(i8, m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1644hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m1645incpVg5ArA(int i8) {
        return m1632constructorimpl(i8 + 1);
    }

    /* renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m1646invpVg5ArA(int i8) {
        return m1632constructorimpl(~i8);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m1647minus7apg3OU(int i8, byte b8) {
        return m1632constructorimpl(i8 - m1632constructorimpl(b8 & 255));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1648minusVKZWuLQ(int i8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) - j8);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1649minusWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 - i9);
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m1650minusxj2QHRw(int i8, short s7) {
        return m1632constructorimpl(i8 - m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1651mod7apg3OU(int i8, byte b8) {
        return n.m1556constructorimpl((byte) i.a(i8, m1632constructorimpl(b8 & 255)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1652modVKZWuLQ(int i8, long j8) {
        return l.a(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32), j8);
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1653modWZ4Q5Ns(int i8, int i9) {
        return i.a(i8, i9);
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1654modxj2QHRw(int i8, short s7) {
        return u.m1788constructorimpl((short) i.a(i8, m1632constructorimpl(s7 & u.MAX_VALUE)));
    }

    /* renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m1655orWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 | i9);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1656plus7apg3OU(int i8, byte b8) {
        return m1632constructorimpl(i8 + m1632constructorimpl(b8 & 255));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1657plusVKZWuLQ(int i8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) + j8);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1658plusWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 + i9);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1659plusxj2QHRw(int i8, short s7) {
        return m1632constructorimpl(i8 + m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final y m1660rangeToWZ4Q5Ns(int i8, int i9) {
        return new y(i8, i9, null);
    }

    /* renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final y m1661rangeUntilWZ4Q5Ns(int i8, int i9) {
        y m200untilJ1ME1BU;
        m200untilJ1ME1BU = d0.m200untilJ1ME1BU(i8, i9);
        return m200untilJ1ME1BU;
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1662rem7apg3OU(int i8, byte b8) {
        return i.a(i8, m1632constructorimpl(b8 & 255));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1663remVKZWuLQ(int i8, long j8) {
        return l.a(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32), j8);
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1664remWZ4Q5Ns(int i8, int i9) {
        return x.m1858uintRemainderJ1ME1BU(i8, i9);
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1665remxj2QHRw(int i8, short s7) {
        return i.a(i8, m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m1666shlpVg5ArA(int i8, int i9) {
        return m1632constructorimpl(i8 << i9);
    }

    /* renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m1667shrpVg5ArA(int i8, int i9) {
        return m1632constructorimpl(i8 >>> i9);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1668times7apg3OU(int i8, byte b8) {
        return m1632constructorimpl(i8 * m1632constructorimpl(b8 & 255));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1669timesVKZWuLQ(int i8, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) * j8);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1670timesWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 * i9);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1671timesxj2QHRw(int i8, short s7) {
        return m1632constructorimpl(i8 * m1632constructorimpl(s7 & u.MAX_VALUE));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1672toByteimpl(int i8) {
        return (byte) i8;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1673toDoubleimpl(int i8) {
        return x.uintToDouble(i8);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1674toFloatimpl(int i8) {
        return (float) x.uintToDouble(i8);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1675toIntimpl(int i8) {
        return i8;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1676toLongimpl(int i8) {
        return i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1677toShortimpl(int i8) {
        return (short) i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1678toStringimpl(int i8) {
        return String.valueOf(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1679toUBytew2LRezQ(int i8) {
        return n.m1556constructorimpl((byte) i8);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1680toUIntpVg5ArA(int i8) {
        return i8;
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1681toULongsVKNKU(int i8) {
        return r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1682toUShortMh2AYeg(int i8) {
        return u.m1788constructorimpl((short) i8);
    }

    /* renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m1683xorWZ4Q5Ns(int i8, int i9) {
        return m1632constructorimpl(i8 ^ i9);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return x.uintCompare(m1684unboximpl(), ((p) obj).m1684unboximpl());
    }

    public boolean equals(Object obj) {
        return m1638equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1644hashCodeimpl(this.data);
    }

    public String toString() {
        return m1678toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1684unboximpl() {
        return this.data;
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m1630compareToWZ4Q5Ns(int i8, int i9) {
        return x.uintCompare(i8, i9);
    }
}
