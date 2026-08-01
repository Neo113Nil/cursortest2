package kotlin;

import com.facebook.common.util.UriUtil;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: UShort.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001d\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\"\u0010\rJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b'\u0010\rJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b,\u0010\rJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b1\u0010\rJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00109J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00109J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00109J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b\\\u0010QJ\u0010\u0010]\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b^\u0010\u0005J\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, d2 = {"Lkotlin/UShort;", "", UriUtil.DATA_SCHEME, "", "constructor-impl", "(S)S", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "compareTo-xj2QHRw", "(SS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(SJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div", "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(SB)B", "mod-xj2QHRw", "(SS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-Mh2AYeg", "dec", "dec-Mh2AYeg", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "and", "and-xj2QHRw", "or", "or-xj2QHRw", "xor", "xor-xj2QHRw", "inv", "inv-Mh2AYeg", "toByte", "", "toByte-impl", "(S)B", "toShort", "toShort-impl", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(S)F", "toDouble", "", "toDouble-impl", "(S)D", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class UShort implements Comparable<UShort> {
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m1065boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m1071constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1077equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1078equalsimpl0(short s, short s2) {
        return s == s2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1083hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    private static final byte m1109toByteimpl(short s) {
        return (byte) s;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    private static final int m1112toIntimpl(short s) {
        return s & 65535;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    private static final long m1113toLongimpl(short s) {
        return s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    private static final short m1114toShortimpl(short s) {
        return s;
    }

    /* renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m1119toUShortMh2AYeg(short s) {
        return s;
    }

    public boolean equals(Object other) {
        return m1077equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m1083hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & 65535, uShort.getData() & 65535);
    }

    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    /* renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m1066compareTo7apg3OU(short s, byte b) {
        return Intrinsics.compare(s & 65535, b & UByte.MAX_VALUE);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m1069compareToxj2QHRw(short s) {
        return Intrinsics.compare(getData() & 65535, s & 65535);
    }

    /* renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m1070compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare(s & 65535, s2 & 65535);
    }

    /* renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m1068compareToWZ4Q5Ns(short s, int i) {
        int compare;
        compare = Integer.compare(UInt.m885constructorimpl(s & 65535) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    /* renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m1067compareToVKZWuLQ(short s, long j) {
        int compare;
        compare = Long.compare(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    /* renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m1095plus7apg3OU(short s, byte b) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) + UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m1098plusxj2QHRw(short s, short s2) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) + UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1097plusWZ4Q5Ns(short s, int i) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) + i);
    }

    /* renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m1096plusVKZWuLQ(short s, long j) {
        return ULong.m964constructorimpl(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    /* renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m1086minus7apg3OU(short s, byte b) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) - UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m1089minusxj2QHRw(short s, short s2) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) - UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m1088minusWZ4Q5Ns(short s, int i) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) - i);
    }

    /* renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m1087minusVKZWuLQ(short s, long j) {
        return ULong.m964constructorimpl(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    /* renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m1105times7apg3OU(short s, byte b) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) * UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m1108timesxj2QHRw(short s, short s2) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) * UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m1107timesWZ4Q5Ns(short s, int i) {
        return UInt.m885constructorimpl(UInt.m885constructorimpl(s & 65535) * i);
    }

    /* renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m1106timesVKZWuLQ(short s, long j) {
        return ULong.m964constructorimpl(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    /* renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m1073div7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m1076divxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m1075divWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), i);
    }

    /* renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m1074divVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    /* renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m1101rem7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m1104remxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m1103remWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), i);
    }

    /* renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m1102remVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport0.m857m(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    /* renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m1079floorDiv7apg3OU(short s, byte b) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(b & UByte.MAX_VALUE));
    }

    /* renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m1082floorDivxj2QHRw(short s, short s2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m1081floorDivWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m885constructorimpl(s & 65535), i);
    }

    /* renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m1080floorDivVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    /* renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m1090mod7apg3OU(short s, byte b) {
        return UByte.m806constructorimpl((byte) UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(b & UByte.MAX_VALUE)));
    }

    /* renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m1093modxj2QHRw(short s, short s2) {
        return m1071constructorimpl((short) UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535)));
    }

    /* renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m1092modWZ4Q5Ns(short s, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m885constructorimpl(s & 65535), i);
    }

    /* renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m1091modVKZWuLQ(short s, long j) {
        return UByte$$ExternalSyntheticBackport0.m857m(ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    /* renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m1084incMh2AYeg(short s) {
        return m1071constructorimpl((short) (s + 1));
    }

    /* renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m1072decMh2AYeg(short s) {
        return m1071constructorimpl((short) (s - 1));
    }

    /* renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m1099rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535), null);
    }

    /* renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m1100rangeUntilxj2QHRw(short s, short s2) {
        return URangesKt.m2066untilJ1ME1BU(UInt.m885constructorimpl(s & 65535), UInt.m885constructorimpl(s2 & 65535));
    }

    /* renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m1064andxj2QHRw(short s, short s2) {
        return m1071constructorimpl((short) (s & s2));
    }

    /* renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m1094orxj2QHRw(short s, short s2) {
        return m1071constructorimpl((short) (s | s2));
    }

    /* renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m1120xorxj2QHRw(short s, short s2) {
        return m1071constructorimpl((short) (s ^ s2));
    }

    /* renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m1085invMh2AYeg(short s) {
        return m1071constructorimpl((short) (~s));
    }

    /* renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m1116toUBytew2LRezQ(short s) {
        return UByte.m806constructorimpl((byte) s);
    }

    /* renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m1117toUIntpVg5ArA(short s) {
        return UInt.m885constructorimpl(s & 65535);
    }

    /* renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m1118toULongsVKNKU(short s) {
        return ULong.m964constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    private static final float m1111toFloatimpl(short s) {
        return (float) UnsignedKt.uintToDouble(s & 65535);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    private static final double m1110toDoubleimpl(short s) {
        return UnsignedKt.uintToDouble(s & 65535);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1115toStringimpl(short s) {
        return String.valueOf(s & 65535);
    }

    public String toString() {
        return m1115toStringimpl(this.data);
    }
}
