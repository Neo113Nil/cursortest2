package y5;

import j6.b0;
import j6.d0;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public final class r implements Comparable {
    public static final a Companion = new a(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    private /* synthetic */ r(long j8) {
        this.data = j8;
    }

    /* renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m1703andVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 & j9);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r m1704boximpl(long j8) {
        return new r(j8);
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1705compareTo7apg3OU(long j8, byte b8) {
        int compare;
        compare = Long.compare(j8 ^ Long.MIN_VALUE, m1710constructorimpl(b8 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m1706compareToVKZWuLQ(long j8) {
        return x.ulongCompare(m1762unboximpl(), j8);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1708compareToWZ4Q5Ns(long j8, int i8) {
        int compare;
        compare = Long.compare(j8 ^ Long.MIN_VALUE, m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m1709compareToxj2QHRw(long j8, short s7) {
        int compare;
        compare = Long.compare(j8 ^ Long.MIN_VALUE, m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1710constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m1711decsVKNKU(long j8) {
        return m1710constructorimpl(j8 - 1);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m1712div7apg3OU(long j8, byte b8) {
        return m.a(j8, m1710constructorimpl(b8 & 255));
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1713divVKZWuLQ(long j8, long j9) {
        return x.m1859ulongDivideeb3DHEI(j8, j9);
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m1714divWZ4Q5Ns(long j8, int i8) {
        return m.a(j8, m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m1715divxj2QHRw(long j8, short s7) {
        return m.a(j8, m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1716equalsimpl(long j8, Object obj) {
        return (obj instanceof r) && j8 == ((r) obj).m1762unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1717equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m1718floorDiv7apg3OU(long j8, byte b8) {
        return m.a(j8, m1710constructorimpl(b8 & 255));
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1719floorDivVKZWuLQ(long j8, long j9) {
        return m.a(j8, j9);
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m1720floorDivWZ4Q5Ns(long j8, int i8) {
        return m.a(j8, m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m1721floorDivxj2QHRw(long j8, short s7) {
        return m.a(j8, m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1722hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    /* renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m1723incsVKNKU(long j8) {
        return m1710constructorimpl(j8 + 1);
    }

    /* renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m1724invsVKNKU(long j8) {
        return m1710constructorimpl(~j8);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m1725minus7apg3OU(long j8, byte b8) {
        return m1710constructorimpl(j8 - m1710constructorimpl(b8 & 255));
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1726minusVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 - j9);
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1727minusWZ4Q5Ns(long j8, int i8) {
        return m1710constructorimpl(j8 - m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m1728minusxj2QHRw(long j8, short s7) {
        return m1710constructorimpl(j8 - m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1729mod7apg3OU(long j8, byte b8) {
        return n.m1556constructorimpl((byte) l.a(j8, m1710constructorimpl(b8 & 255)));
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1730modVKZWuLQ(long j8, long j9) {
        return l.a(j8, j9);
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1731modWZ4Q5Ns(long j8, int i8) {
        return p.m1632constructorimpl((int) l.a(j8, m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1732modxj2QHRw(long j8, short s7) {
        return u.m1788constructorimpl((short) l.a(j8, m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m1733orVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 | j9);
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m1734plus7apg3OU(long j8, byte b8) {
        return m1710constructorimpl(j8 + m1710constructorimpl(b8 & 255));
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1735plusVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 + j9);
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m1736plusWZ4Q5Ns(long j8, int i8) {
        return m1710constructorimpl(j8 + m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m1737plusxj2QHRw(long j8, short s7) {
        return m1710constructorimpl(j8 + m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final b0 m1738rangeToVKZWuLQ(long j8, long j9) {
        return new b0(j8, j9, null);
    }

    /* renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final b0 m1739rangeUntilVKZWuLQ(long j8, long j9) {
        b0 m202untileb3DHEI;
        m202untileb3DHEI = d0.m202untileb3DHEI(j8, j9);
        return m202untileb3DHEI;
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m1740rem7apg3OU(long j8, byte b8) {
        return l.a(j8, m1710constructorimpl(b8 & 255));
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1741remVKZWuLQ(long j8, long j9) {
        return x.m1860ulongRemaindereb3DHEI(j8, j9);
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m1742remWZ4Q5Ns(long j8, int i8) {
        return l.a(j8, m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m1743remxj2QHRw(long j8, short s7) {
        return l.a(j8, m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m1744shlsVKNKU(long j8, int i8) {
        return m1710constructorimpl(j8 << i8);
    }

    /* renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m1745shrsVKNKU(long j8, int i8) {
        return m1710constructorimpl(j8 >>> i8);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m1746times7apg3OU(long j8, byte b8) {
        return m1710constructorimpl(j8 * m1710constructorimpl(b8 & 255));
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1747timesVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 * j9);
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m1748timesWZ4Q5Ns(long j8, int i8) {
        return m1710constructorimpl(j8 * m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m1749timesxj2QHRw(long j8, short s7) {
        return m1710constructorimpl(j8 * m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1750toByteimpl(long j8) {
        return (byte) j8;
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1751toDoubleimpl(long j8) {
        return x.ulongToDouble(j8);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1752toFloatimpl(long j8) {
        return (float) x.ulongToDouble(j8);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1753toIntimpl(long j8) {
        return (int) j8;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1754toLongimpl(long j8) {
        return j8;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1755toShortimpl(long j8) {
        return (short) j8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1756toStringimpl(long j8) {
        return x.ulongToString(j8);
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1757toUBytew2LRezQ(long j8) {
        return n.m1556constructorimpl((byte) j8);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1758toUIntpVg5ArA(long j8) {
        return p.m1632constructorimpl((int) j8);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1759toULongsVKNKU(long j8) {
        return j8;
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1760toUShortMh2AYeg(long j8) {
        return u.m1788constructorimpl((short) j8);
    }

    /* renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m1761xorVKZWuLQ(long j8, long j9) {
        return m1710constructorimpl(j8 ^ j9);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return x.ulongCompare(m1762unboximpl(), ((r) obj).m1762unboximpl());
    }

    public boolean equals(Object obj) {
        return m1716equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m1722hashCodeimpl(this.data);
    }

    public String toString() {
        return m1756toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1762unboximpl() {
        return this.data;
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m1707compareToVKZWuLQ(long j8, long j9) {
        return x.ulongCompare(j8, j9);
    }
}
