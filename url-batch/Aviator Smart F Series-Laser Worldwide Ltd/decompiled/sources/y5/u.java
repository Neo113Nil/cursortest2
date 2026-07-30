package y5;

import j6.d0;
import j6.y;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class u implements Comparable {
    public static final a Companion = new a(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    private /* synthetic */ u(short s7) {
        this.data = s7;
    }

    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m1781andxj2QHRw(short s7, short s8) {
        return m1788constructorimpl((short) (s7 & s8));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u m1782boximpl(short s7) {
        return new u(s7);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1783compareTo7apg3OU(short s7, byte b8) {
        return kotlin.jvm.internal.s.compare(s7 & MAX_VALUE, b8 & 255);
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m1784compareToVKZWuLQ(short s7, long j8) {
        int compare;
        compare = Long.compare(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j8 ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1785compareToWZ4Q5Ns(short s7, int i8) {
        int compare;
        compare = Integer.compare(p.m1632constructorimpl(s7 & MAX_VALUE) ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m1786compareToxj2QHRw(short s7) {
        return kotlin.jvm.internal.s.compare(m1838unboximpl() & MAX_VALUE, s7 & MAX_VALUE);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m1788constructorimpl(short s7) {
        return s7;
    }

    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m1789decMh2AYeg(short s7) {
        return m1788constructorimpl((short) (s7 - 1));
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m1790div7apg3OU(short s7, byte b8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1791divVKZWuLQ(short s7, long j8) {
        return m.a(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j8);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m1792divWZ4Q5Ns(short s7, int i8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), i8);
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m1793divxj2QHRw(short s7, short s8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1794equalsimpl(short s7, Object obj) {
        return (obj instanceof u) && s7 == ((u) obj).m1838unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1795equalsimpl0(short s7, short s8) {
        return s7 == s8;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m1796floorDiv7apg3OU(short s7, byte b8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1797floorDivVKZWuLQ(short s7, long j8) {
        return m.a(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j8);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m1798floorDivWZ4Q5Ns(short s7, int i8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), i8);
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m1799floorDivxj2QHRw(short s7, short s8) {
        return j.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1800hashCodeimpl(short s7) {
        return s7;
    }

    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m1801incMh2AYeg(short s7) {
        return m1788constructorimpl((short) (s7 + 1));
    }

    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m1802invMh2AYeg(short s7) {
        return m1788constructorimpl((short) (~s7));
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m1803minus7apg3OU(short s7, byte b8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) - p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1804minusVKZWuLQ(short s7, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j8);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1805minusWZ4Q5Ns(short s7, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) - i8);
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m1806minusxj2QHRw(short s7, short s8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) - p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1807mod7apg3OU(short s7, byte b8) {
        return n.m1556constructorimpl((byte) i.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(b8 & 255)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1808modVKZWuLQ(short s7, long j8) {
        return l.a(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j8);
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1809modWZ4Q5Ns(short s7, int i8) {
        return i.a(p.m1632constructorimpl(s7 & MAX_VALUE), i8);
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1810modxj2QHRw(short s7, short s8) {
        return m1788constructorimpl((short) i.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE)));
    }

    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m1811orxj2QHRw(short s7, short s8) {
        return m1788constructorimpl((short) (s7 | s8));
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1812plus7apg3OU(short s7, byte b8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) + p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1813plusVKZWuLQ(short s7, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j8);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1814plusWZ4Q5Ns(short s7, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) + i8);
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1815plusxj2QHRw(short s7, short s8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) + p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final y m1816rangeToxj2QHRw(short s7, short s8) {
        return new y(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE), null);
    }

    /* renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final y m1817rangeUntilxj2QHRw(short s7, short s8) {
        y m200untilJ1ME1BU;
        m200untilJ1ME1BU = d0.m200untilJ1ME1BU(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE));
        return m200untilJ1ME1BU;
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1818rem7apg3OU(short s7, byte b8) {
        return i.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1819remVKZWuLQ(short s7, long j8) {
        return l.a(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX), j8);
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1820remWZ4Q5Ns(short s7, int i8) {
        return i.a(p.m1632constructorimpl(s7 & MAX_VALUE), i8);
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1821remxj2QHRw(short s7, short s8) {
        return i.a(p.m1632constructorimpl(s7 & MAX_VALUE), p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1822times7apg3OU(short s7, byte b8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) * p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1823timesVKZWuLQ(short s7, long j8) {
        return r.m1710constructorimpl(r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j8);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1824timesWZ4Q5Ns(short s7, int i8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) * i8);
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1825timesxj2QHRw(short s7, short s8) {
        return p.m1632constructorimpl(p.m1632constructorimpl(s7 & MAX_VALUE) * p.m1632constructorimpl(s8 & MAX_VALUE));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1826toByteimpl(short s7) {
        return (byte) s7;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1827toDoubleimpl(short s7) {
        return s7 & MAX_VALUE;
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1828toFloatimpl(short s7) {
        return s7 & MAX_VALUE;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1829toIntimpl(short s7) {
        return s7 & MAX_VALUE;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1830toLongimpl(short s7) {
        return s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1831toShortimpl(short s7) {
        return s7;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1832toStringimpl(short s7) {
        return String.valueOf(s7 & MAX_VALUE);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1833toUBytew2LRezQ(short s7) {
        return n.m1556constructorimpl((byte) s7);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1834toUIntpVg5ArA(short s7) {
        return p.m1632constructorimpl(s7 & MAX_VALUE);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1835toULongsVKNKU(short s7) {
        return r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1836toUShortMh2AYeg(short s7) {
        return s7;
    }

    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m1837xorxj2QHRw(short s7, short s8) {
        return m1788constructorimpl((short) (s7 ^ s8));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.s.compare(m1838unboximpl() & MAX_VALUE, ((u) obj).m1838unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m1794equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1800hashCodeimpl(this.data);
    }

    public String toString() {
        return m1832toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m1838unboximpl() {
        return this.data;
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m1787compareToxj2QHRw(short s7, short s8) {
        return kotlin.jvm.internal.s.compare(s7 & MAX_VALUE, s8 & MAX_VALUE);
    }
}
