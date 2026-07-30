package j6;

import com.jieli.jl_audio_decode.constant.ErrorCode;
import j6.a;
import j6.k;
import j6.n;
import java.util.NoSuchElementException;
import kotlin.random.Random;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class v extends u {
    public static final /* synthetic */ boolean byteRangeContains(h hVar, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d8);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b8, byte b9) {
        return b8 < b9 ? b9 : b8;
    }

    public static final byte coerceAtMost(byte b8, byte b9) {
        return b8 > b9 ? b9 : b8;
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t7, T t8, T t9) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        if (t8 == null || t9 == null) {
            if (t8 != null && t7.compareTo(t8) < 0) {
                return t8;
            }
            if (t9 != null && t7.compareTo(t9) > 0) {
                return t9;
            }
        } else {
            if (t8.compareTo(t9) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t9 + " is less than minimum " + t8 + '.');
            }
            if (t7.compareTo(t8) < 0) {
                return t8;
            }
            if (t7.compareTo(t9) > 0) {
                return t9;
            }
        }
        return t7;
    }

    private static final boolean contains(m mVar, Integer num) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return num != null && mVar.contains(num.intValue());
    }

    public static final /* synthetic */ boolean doubleRangeContains(h hVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(b8));
    }

    public static final k downTo(int i8, byte b8) {
        return k.Companion.fromClosedRange(i8, b8, -1);
    }

    public static final int first(k kVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + kVar + " is empty.");
    }

    public static final Integer firstOrNull(k kVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.getFirst());
    }

    public static final /* synthetic */ boolean floatRangeContains(h hVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(b8));
    }

    public static final boolean intRangeContains(h hVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Integer.valueOf(b8));
    }

    public static final int last(k kVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return kVar.getLast();
        }
        throw new NoSuchElementException("Progression " + kVar + " is empty.");
    }

    public static final Integer lastOrNull(k kVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        if (kVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kVar.getLast());
    }

    public static final boolean longRangeContains(h hVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(b8));
    }

    private static final int random(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return random(mVar, Random.Default);
    }

    private static final Integer randomOrNull(m mVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return randomOrNull(mVar, Random.Default);
    }

    public static final k reversed(k kVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        return k.Companion.fromClosedRange(kVar.getLast(), kVar.getFirst(), -kVar.getStep());
    }

    public static final boolean shortRangeContains(h hVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Short.valueOf(b8));
    }

    public static k step(k kVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(kVar, "<this>");
        u.checkStepIsPositive(i8 > 0, Integer.valueOf(i8));
        k.a aVar = k.Companion;
        int first = kVar.getFirst();
        int last = kVar.getLast();
        if (kVar.getStep() <= 0) {
            i8 = -i8;
        }
        return aVar.fromClosedRange(first, last, i8);
    }

    public static final Byte toByteExactOrNull(int i8) {
        if (new m(ErrorCode.ERR_OUTPUT_EXCEPTION, 127).contains(i8)) {
            return Byte.valueOf((byte) i8);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j8) {
        if (new p(-2147483648L, 2147483647L).contains(j8)) {
            return Integer.valueOf((int) j8);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d8) {
        if (-9.223372036854776E18d > d8 || d8 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d8);
    }

    public static final Short toShortExactOrNull(int i8) {
        if (new m(-32768, 32767).contains(i8)) {
            return Short.valueOf((short) i8);
        }
        return null;
    }

    public static final m until(int i8, byte b8) {
        return new m(i8, b8 - 1);
    }

    public static final /* synthetic */ boolean byteRangeContains(h hVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f8);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d8, double d9) {
        return d8 < d9 ? d9 : d8;
    }

    public static final double coerceAtMost(double d8, double d9) {
        return d8 > d9 ? d9 : d8;
    }

    private static final boolean contains(p pVar, Long l8) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return l8 != null && pVar.contains(l8.longValue());
    }

    public static final boolean doubleRangeContains(h hVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(f8));
    }

    public static final n downTo(long j8, byte b8) {
        return n.Companion.fromClosedRange(j8, b8, -1L);
    }

    public static final Long firstOrNull(n nVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.getFirst());
    }

    public static final boolean floatRangeContains(h hVar, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf((float) d8));
    }

    public static final boolean intRangeContains(s sVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Integer.valueOf(b8));
    }

    public static final Long lastOrNull(n nVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        if (nVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(nVar.getLast());
    }

    public static final boolean longRangeContains(s sVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Long.valueOf(b8));
    }

    private static final long random(p pVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return random(pVar, Random.Default);
    }

    private static final Long randomOrNull(p pVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return randomOrNull(pVar, Random.Default);
    }

    public static final n reversed(n nVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        return n.Companion.fromClosedRange(nVar.getLast(), nVar.getFirst(), -nVar.getStep());
    }

    public static final boolean shortRangeContains(s sVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Short.valueOf(b8));
    }

    public static final Byte toByteExactOrNull(long j8) {
        if (new p(-128L, 127L).contains(j8)) {
            return Byte.valueOf((byte) j8);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d8) {
        if (-2.147483648E9d > d8 || d8 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d8);
    }

    public static final Long toLongExactOrNull(float f8) {
        if (-9.223372E18f > f8 || f8 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f8);
    }

    public static final Short toShortExactOrNull(long j8) {
        if (new p(-32768L, 32767L).contains(j8)) {
            return Short.valueOf((short) j8);
        }
        return null;
    }

    public static final p until(long j8, byte b8) {
        return new p(j8, b8 - 1);
    }

    public static final boolean byteRangeContains(h hVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i8);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f8, float f9) {
        return f8 < f9 ? f9 : f8;
    }

    public static final float coerceAtMost(float f8, float f9) {
        return f8 > f9 ? f9 : f8;
    }

    private static final boolean contains(c cVar, Character ch) {
        kotlin.jvm.internal.s.checkNotNullParameter(cVar, "<this>");
        return ch != null && cVar.contains(ch.charValue());
    }

    public static final boolean doubleRangeContains(s sVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Double.valueOf(f8));
    }

    public static final k downTo(byte b8, byte b9) {
        return k.Companion.fromClosedRange(b8, b9, -1);
    }

    public static final Character firstOrNull(a aVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getFirst());
    }

    public static final /* synthetic */ boolean floatRangeContains(h hVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(i8));
    }

    public static final /* synthetic */ boolean intRangeContains(h hVar, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d8);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final Character lastOrNull(a aVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.getLast());
    }

    public static final /* synthetic */ boolean longRangeContains(h hVar, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(d8);
        if (longExactOrNull != null) {
            return hVar.contains(longExactOrNull);
        }
        return false;
    }

    private static final char random(c cVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(cVar, "<this>");
        return random(cVar, Random.Default);
    }

    private static final Character randomOrNull(c cVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(cVar, "<this>");
        return randomOrNull(cVar, Random.Default);
    }

    public static final a reversed(a aVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        return a.Companion.fromClosedRange(aVar.getLast(), aVar.getFirst(), -aVar.getStep());
    }

    public static final /* synthetic */ boolean shortRangeContains(h hVar, double d8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d8);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final n step(n nVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        u.checkStepIsPositive(j8 > 0, Long.valueOf(j8));
        n.a aVar = n.Companion;
        long first = nVar.getFirst();
        long last = nVar.getLast();
        if (nVar.getStep() <= 0) {
            j8 = -j8;
        }
        return aVar.fromClosedRange(first, last, j8);
    }

    public static final Byte toByteExactOrNull(short s7) {
        if (intRangeContains((h) new m(ErrorCode.ERR_OUTPUT_EXCEPTION, 127), s7)) {
            return Byte.valueOf((byte) s7);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(float f8) {
        if (-2.1474836E9f > f8 || f8 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f8);
    }

    public static final Short toShortExactOrNull(double d8) {
        if (-32768.0d > d8 || d8 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d8);
    }

    public static final m until(byte b8, byte b9) {
        return new m(b8, b9 - 1);
    }

    public static final boolean byteRangeContains(s sVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i8);
        if (byteExactOrNull != null) {
            return sVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i8, int i9) {
        return i8 < i9 ? i9 : i8;
    }

    public static int coerceAtMost(int i8, int i9) {
        return i8 > i9 ? i9 : i8;
    }

    private static final boolean contains(m mVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return intRangeContains((h) mVar, b8);
    }

    public static final /* synthetic */ boolean doubleRangeContains(h hVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(i8));
    }

    public static final k downTo(short s7, byte b8) {
        return k.Companion.fromClosedRange(s7, b8, -1);
    }

    public static final long first(n nVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    public static final /* synthetic */ boolean floatRangeContains(h hVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(j8));
    }

    public static final /* synthetic */ boolean intRangeContains(h hVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f8);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final long last(n nVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(nVar, "<this>");
        if (!nVar.isEmpty()) {
            return nVar.getLast();
        }
        throw new NoSuchElementException("Progression " + nVar + " is empty.");
    }

    public static final /* synthetic */ boolean longRangeContains(h hVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Long longExactOrNull = toLongExactOrNull(f8);
        if (longExactOrNull != null) {
            return hVar.contains(longExactOrNull);
        }
        return false;
    }

    public static final int random(m mVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.d.nextInt(random, mVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Integer randomOrNull(m mVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (mVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.d.nextInt(random, mVar));
    }

    public static final /* synthetic */ boolean shortRangeContains(h hVar, float f8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f8);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final Byte toByteExactOrNull(double d8) {
        if (-128.0d > d8 || d8 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d8);
    }

    public static final Short toShortExactOrNull(float f8) {
        if (-32768.0f > f8 || f8 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f8);
    }

    public static final m until(short s7, byte b8) {
        return new m(s7, b8 - 1);
    }

    public static final boolean byteRangeContains(h hVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j8);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j8, long j9) {
        return j8 < j9 ? j9 : j8;
    }

    public static long coerceAtMost(long j8, long j9) {
        return j8 > j9 ? j9 : j8;
    }

    private static final boolean contains(p pVar, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return longRangeContains((h) pVar, b8);
    }

    public static final /* synthetic */ boolean doubleRangeContains(h hVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(j8));
    }

    public static final a downTo(char c8, char c9) {
        return a.Companion.fromClosedRange(c8, c9, -1);
    }

    public static final /* synthetic */ boolean floatRangeContains(h hVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Float.valueOf(s7));
    }

    public static final boolean intRangeContains(h hVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j8);
        if (intExactOrNull != null) {
            return hVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(h hVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(i8));
    }

    public static final boolean shortRangeContains(h hVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i8);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final a step(a aVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        u.checkStepIsPositive(i8 > 0, Integer.valueOf(i8));
        a.C0357a c0357a = a.Companion;
        char first = aVar.getFirst();
        char last = aVar.getLast();
        if (aVar.getStep() <= 0) {
            i8 = -i8;
        }
        return c0357a.fromClosedRange(first, last, i8);
    }

    public static final Byte toByteExactOrNull(float f8) {
        if (-128.0f > f8 || f8 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f8);
    }

    public static final c until(char c8, char c9) {
        return kotlin.jvm.internal.s.compare((int) c9, 0) <= 0 ? c.Companion.getEMPTY() : new c(c8, (char) (c9 - 1));
    }

    public static final boolean byteRangeContains(s sVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j8);
        if (byteExactOrNull != null) {
            return sVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s7, short s8) {
        return s7 < s8 ? s8 : s7;
    }

    public static final short coerceAtMost(short s7, short s8) {
        return s7 > s8 ? s8 : s7;
    }

    private static final boolean contains(p pVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return longRangeContains((h) pVar, i8);
    }

    public static final /* synthetic */ boolean doubleRangeContains(h hVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Double.valueOf(s7));
    }

    public static k downTo(int i8, int i9) {
        return k.Companion.fromClosedRange(i8, i9, -1);
    }

    public static final boolean intRangeContains(s sVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j8);
        if (intExactOrNull != null) {
            return sVar.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean longRangeContains(s sVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Long.valueOf(i8));
    }

    public static final long random(p pVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.d.nextLong(random, pVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Long randomOrNull(p pVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (pVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.d.nextLong(random, pVar));
    }

    public static final boolean shortRangeContains(s sVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i8);
        if (shortExactOrNull != null) {
            return sVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(h hVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s7);
        if (byteExactOrNull != null) {
            return hVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t7, T minimumValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(minimumValue, "minimumValue");
        return t7.compareTo(minimumValue) < 0 ? minimumValue : t7;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t7, T maximumValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(maximumValue, "maximumValue");
        return t7.compareTo(maximumValue) > 0 ? maximumValue : t7;
    }

    public static final byte coerceIn(byte b8, byte b9, byte b10) {
        if (b9 <= b10) {
            return b8 < b9 ? b9 : b8 > b10 ? b10 : b8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b10) + " is less than minimum " + ((int) b9) + '.');
    }

    private static final boolean contains(m mVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return intRangeContains((h) mVar, j8);
    }

    public static final n downTo(long j8, int i8) {
        return n.Companion.fromClosedRange(j8, i8, -1L);
    }

    public static final char first(a aVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.getFirst();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    public static final boolean intRangeContains(h hVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Integer.valueOf(s7));
    }

    public static final char last(a aVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.getLast();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    public static final boolean longRangeContains(h hVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        return hVar.contains(Long.valueOf(s7));
    }

    public static final boolean shortRangeContains(h hVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(hVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j8);
        if (shortExactOrNull != null) {
            return hVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static m until(int i8, int i9) {
        if (i9 <= Integer.MIN_VALUE) {
            return m.Companion.getEMPTY();
        }
        return new m(i8, i9 - 1);
    }

    public static final boolean byteRangeContains(s sVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s7);
        if (byteExactOrNull != null) {
            return sVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s7, short s8, short s9) {
        if (s8 <= s9) {
            return s7 < s8 ? s8 : s7 > s9 ? s9 : s7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s9) + " is less than minimum " + ((int) s8) + '.');
    }

    private static final boolean contains(m mVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(mVar, "<this>");
        return intRangeContains((h) mVar, s7);
    }

    public static final k downTo(byte b8, int i8) {
        return k.Companion.fromClosedRange(b8, i8, -1);
    }

    public static final boolean intRangeContains(s sVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Integer.valueOf(s7));
    }

    public static final boolean longRangeContains(s sVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        return sVar.contains(Long.valueOf(s7));
    }

    public static final char random(c cVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(cVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final Character randomOrNull(c cVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(cVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(cVar.getFirst(), cVar.getLast() + 1));
    }

    public static final boolean shortRangeContains(s sVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j8);
        if (shortExactOrNull != null) {
            return sVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i8, int i9, int i10) {
        if (i9 <= i10) {
            return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i10 + " is less than minimum " + i9 + '.');
    }

    private static final boolean contains(p pVar, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(pVar, "<this>");
        return longRangeContains((h) pVar, s7);
    }

    public static final k downTo(short s7, int i8) {
        return k.Companion.fromClosedRange(s7, i8, -1);
    }

    public static final p until(long j8, int i8) {
        return new p(j8, i8 - 1);
    }

    public static long coerceIn(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static final n downTo(int i8, long j8) {
        return n.Companion.fromClosedRange(i8, j8, -1L);
    }

    public static final m until(byte b8, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            return m.Companion.getEMPTY();
        }
        return new m(b8, i8 - 1);
    }

    public static float coerceIn(float f8, float f9, float f10) {
        if (f9 <= f10) {
            return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f10 + " is less than minimum " + f9 + '.');
    }

    public static final n downTo(long j8, long j9) {
        return n.Companion.fromClosedRange(j8, j9, -1L);
    }

    public static final double coerceIn(double d8, double d9, double d10) {
        if (d9 <= d10) {
            return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static final n downTo(byte b8, long j8) {
        return n.Companion.fromClosedRange(b8, j8, -1L);
    }

    public static final m until(short s7, int i8) {
        if (i8 <= Integer.MIN_VALUE) {
            return m.Companion.getEMPTY();
        }
        return new m(s7, i8 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t7, g range) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t7, range.getStart()) || range.lessThanOrEquals(range.getStart(), t7)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t7) || range.lessThanOrEquals(t7, range.getEndInclusive())) ? t7 : (T) range.getEndInclusive() : (T) range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final n downTo(short s7, long j8) {
        return n.Companion.fromClosedRange(s7, j8, -1L);
    }

    public static final k downTo(int i8, short s7) {
        return k.Companion.fromClosedRange(i8, s7, -1);
    }

    public static final p until(int i8, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return p.Companion.getEMPTY();
        }
        return new p(i8, j8 - 1);
    }

    public static final n downTo(long j8, short s7) {
        return n.Companion.fromClosedRange(j8, s7, -1L);
    }

    public static final k downTo(byte b8, short s7) {
        return k.Companion.fromClosedRange(b8, s7, -1);
    }

    public static final p until(long j8, long j9) {
        if (j9 <= Long.MIN_VALUE) {
            return p.Companion.getEMPTY();
        }
        return new p(j8, j9 - 1);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t7, h range) {
        kotlin.jvm.internal.s.checkNotNullParameter(t7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (range instanceof g) {
            return (T) coerceIn((Comparable) t7, (g) range);
        }
        if (!range.isEmpty()) {
            return t7.compareTo(range.getStart()) < 0 ? (T) range.getStart() : t7.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final k downTo(short s7, short s8) {
        return k.Companion.fromClosedRange(s7, s8, -1);
    }

    public static final p until(byte b8, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return p.Companion.getEMPTY();
        }
        return new p(b8, j8 - 1);
    }

    public static final p until(short s7, long j8) {
        if (j8 <= Long.MIN_VALUE) {
            return p.Companion.getEMPTY();
        }
        return new p(s7, j8 - 1);
    }

    public static final m until(int i8, short s7) {
        return new m(i8, s7 - 1);
    }

    public static final int coerceIn(int i8, h range) {
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (range instanceof g) {
            return ((Number) coerceIn(Integer.valueOf(i8), (g) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i8 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i8 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final p until(long j8, short s7) {
        return new p(j8, s7 - 1);
    }

    public static final m until(byte b8, short s7) {
        return new m(b8, s7 - 1);
    }

    public static final m until(short s7, short s8) {
        return new m(s7, s8 - 1);
    }

    public static long coerceIn(long j8, h range) {
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (range instanceof g) {
            return ((Number) coerceIn(Long.valueOf(j8), (g) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j8 < ((Number) range.getStart()).longValue() ? ((Number) range.getStart()).longValue() : j8 > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
