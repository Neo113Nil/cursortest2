package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: TextUnit.kt */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0014\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0005R\u001a\u0010\u001a\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getRawType-impl", "getRawType$annotations", "()V", "rawType", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "type", "", "getValue-impl", "(J)F", "value", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m2573boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2574constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2575equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2576equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m2577getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2580hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m2575equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2580hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    public String toString() {
        return m2581toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2581toStringimpl(long j) {
        long m2578getTypeUIouoOA = m2578getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2598getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2597getSpUIouoOA())) {
            return m2579getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m2592equalsimpl0(m2578getTypeUIouoOA, companion.m2596getEmUIouoOA())) {
            return "Invalid";
        }
        return m2579getValueimpl(j) + ".em";
    }

    /* compiled from: TextUnit.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R)\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnit;", "Unspecified", "J", "getUnspecified-XSAIIZE", "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m2583getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m2589boximpl(companion.m2598getUnspecifiedUIouoOA()), TextUnitType.m2589boximpl(companion.m2597getSpUIouoOA()), TextUnitType.m2589boximpl(companion.m2596getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m2578getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m2577getRawTypeimpl(j) >>> 32)].getType();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m2579getValueimpl(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
