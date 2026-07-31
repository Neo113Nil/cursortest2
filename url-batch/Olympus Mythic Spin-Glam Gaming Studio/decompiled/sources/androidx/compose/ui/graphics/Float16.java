package androidx.compose.ui.graphics;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.NetError;

/* compiled from: Float16.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081@\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001f\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\u0088\u0001\u0007\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "", "value", "constructor-impl", "(F)S", "", "halfValue", "(S)S", "toFloat-impl", "(S)F", "toFloat", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "other", "", "compareTo-41bOqos", "(SS)I", "compareTo", "", "isNaN-impl", "(S)Z", "isNaN", "hashCode-impl", "(S)I", "hashCode", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "S", "getHalfValue", "()S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Float16 implements Comparable<Float16> {
    private static final float FP32_DENORMAL_FLOAT;
    private final short halfValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final short Epsilon = m1486constructorimpl((short) 5120);
    private static final short LowestValue = m1486constructorimpl((short) -1025);
    private static final short MaxValue = m1486constructorimpl((short) 31743);
    private static final short MinNormal = m1486constructorimpl((short) 1024);
    private static final short MinValue = m1486constructorimpl((short) 1);
    private static final short NaN = m1486constructorimpl((short) 32256);
    private static final short NegativeInfinity = m1486constructorimpl((short) -1024);
    private static final short NegativeZero = m1486constructorimpl(Short.MIN_VALUE);
    private static final short PositiveInfinity = m1486constructorimpl((short) 31744);
    private static final short PositiveZero = m1486constructorimpl((short) 0);
    private static final short One = m1485constructorimpl(1.0f);
    private static final short NegativeOne = m1485constructorimpl(-1.0f);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m1486constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1487equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).getHalfValue();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1488hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m1489isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > 31744;
    }

    public boolean equals(Object obj) {
        return m1487equalsimpl(this.halfValue, obj);
    }

    public int hashCode() {
        return m1488hashCodeimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getHalfValue() {
        return this.halfValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m1492compareTo41bOqos(float16.getHalfValue());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m1485constructorimpl(float f) {
        return m1486constructorimpl(INSTANCE.floatToHalf(f));
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m1490toFloatimpl(short s) {
        int i;
        int i2;
        int i3;
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - FP32_DENORMAL_FLOAT;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        int i9 = (i3 << 23) | (i4 << 16) | i2;
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i9);
    }

    public String toString() {
        return m1491toStringimpl(this.halfValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1491toStringimpl(short s) {
        return String.valueOf(m1490toFloatimpl(s));
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m1492compareTo41bOqos(short s) {
        return m1484compareTo41bOqos(this.halfValue, s);
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m1484compareTo41bOqos(short s, short s2) {
        if (m1489isNaNimpl(s)) {
            return !m1489isNaNimpl(s2) ? 1 : 0;
        }
        if (m1489isNaNimpl(s2)) {
            return -1;
        }
        Companion companion = INSTANCE;
        return Intrinsics.compare(companion.toCompareValue(s), companion.toCompareValue(s2));
    }

    /* compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u001d\u0010\"\u001a\u00020!8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010$\u001a\u00020!8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "<init>", "()V", "", "value", "", "toCompareValue", "(S)I", "", InneractiveMediationDefs.GENDER_FEMALE, "floatToHalf", "(F)S", "FP16_COMBINED", "I", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "F", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "MaxExponent", "MinExponent", "Landroidx/compose/ui/graphics/Float16;", "NegativeOne", "S", "One", "Size", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short value) {
            return (value & 32768) != 0 ? 32768 - (value & 65535) : value & 65535;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f) {
            int i;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = floatToRawIntBits >>> 31;
            int i3 = (floatToRawIntBits >>> 23) & 255;
            int i4 = 8388607 & floatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 != 255) {
                int i7 = i3 + NetError.ERR_NO_SSL_VERSIONS_ENABLED;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((floatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                } else if (i7 >= -10) {
                    int i8 = (8388608 | i4) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i5 = 0;
                    i6 = i8 >> 13;
                } else {
                    i5 = 0;
                }
            } else if (i4 != 0) {
                i6 = 512;
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(1056964608);
    }
}
