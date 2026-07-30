package j6;

import j6.w;
import j6.z;
import java.util.NoSuchElementException;
import kotlin.random.Random;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class d0 {
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m173coerceAtLeast5PvTz6A(short s7, short s8) {
        return kotlin.jvm.internal.s.compare(s7 & y5.u.MAX_VALUE, 65535 & s8) < 0 ? s8 : s7;
    }

    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m174coerceAtLeastJ1ME1BU(int i8, int i9) {
        int compare;
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
        return compare < 0 ? i9 : i8;
    }

    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m175coerceAtLeastKr8caGY(byte b8, byte b9) {
        return kotlin.jvm.internal.s.compare(b8 & 255, b9 & 255) < 0 ? b9 : b8;
    }

    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m176coerceAtLeasteb3DHEI(long j8, long j9) {
        int compare;
        compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
        return compare < 0 ? j9 : j8;
    }

    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m177coerceAtMost5PvTz6A(short s7, short s8) {
        return kotlin.jvm.internal.s.compare(s7 & y5.u.MAX_VALUE, 65535 & s8) > 0 ? s8 : s7;
    }

    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m178coerceAtMostJ1ME1BU(int i8, int i9) {
        int compare;
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
        return compare > 0 ? i9 : i8;
    }

    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m179coerceAtMostKr8caGY(byte b8, byte b9) {
        return kotlin.jvm.internal.s.compare(b8 & 255, b9 & 255) > 0 ? b9 : b8;
    }

    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m180coerceAtMosteb3DHEI(long j8, long j9) {
        int compare;
        compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
        return compare > 0 ? j9 : j8;
    }

    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m181coerceInJPwROB0(long j8, h range) {
        int compare;
        int compare2;
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (range instanceof g) {
            return ((y5.r) v.coerceIn(y5.r.m1704boximpl(j8), (g) range)).m1762unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        compare = Long.compare(j8 ^ Long.MIN_VALUE, ((y5.r) range.getStart()).m1762unboximpl() ^ Long.MIN_VALUE);
        if (compare < 0) {
            return ((y5.r) range.getStart()).m1762unboximpl();
        }
        compare2 = Long.compare(j8 ^ Long.MIN_VALUE, ((y5.r) range.getEndInclusive()).m1762unboximpl() ^ Long.MIN_VALUE);
        return compare2 > 0 ? ((y5.r) range.getEndInclusive()).m1762unboximpl() : j8;
    }

    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m182coerceInVKSA0NQ(short s7, short s8, short s9) {
        int i8 = s8 & y5.u.MAX_VALUE;
        int i9 = s9 & y5.u.MAX_VALUE;
        if (kotlin.jvm.internal.s.compare(i8, i9) <= 0) {
            int i10 = 65535 & s7;
            return kotlin.jvm.internal.s.compare(i10, i8) < 0 ? s8 : kotlin.jvm.internal.s.compare(i10, i9) > 0 ? s9 : s7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y5.u.m1832toStringimpl(s9)) + " is less than minimum " + ((Object) y5.u.m1832toStringimpl(s8)) + '.');
    }

    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m183coerceInWZ9TVnA(int i8, int i9, int i10) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i8 ^ Integer.MIN_VALUE, i9 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i9;
            }
            compare3 = Integer.compare(i8 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
            return compare3 > 0 ? i10 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y5.p.m1678toStringimpl(i10)) + " is less than minimum " + ((Object) y5.p.m1678toStringimpl(i9)) + '.');
    }

    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m184coerceInb33U2AM(byte b8, byte b9, byte b10) {
        int i8 = b9 & 255;
        int i9 = b10 & 255;
        if (kotlin.jvm.internal.s.compare(i8, i9) <= 0) {
            int i10 = b8 & 255;
            return kotlin.jvm.internal.s.compare(i10, i8) < 0 ? b9 : kotlin.jvm.internal.s.compare(i10, i9) > 0 ? b10 : b8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y5.n.m1600toStringimpl(b10)) + " is less than minimum " + ((Object) y5.n.m1600toStringimpl(b9)) + '.');
    }

    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m185coerceInsambcqE(long j8, long j9, long j10) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j9;
            }
            compare3 = Long.compare(j8 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
            return compare3 > 0 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y5.r.m1756toStringimpl(j10)) + " is less than minimum " + ((Object) y5.r.m1756toStringimpl(j9)) + '.');
    }

    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m186coerceInwuiCnnA(int i8, h range) {
        int compare;
        int compare2;
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        if (range instanceof g) {
            return ((y5.p) v.coerceIn(y5.p.m1626boximpl(i8), (g) range)).m1684unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        compare = Integer.compare(i8 ^ Integer.MIN_VALUE, ((y5.p) range.getStart()).m1684unboximpl() ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return ((y5.p) range.getStart()).m1684unboximpl();
        }
        compare2 = Integer.compare(i8 ^ Integer.MIN_VALUE, ((y5.p) range.getEndInclusive()).m1684unboximpl() ^ Integer.MIN_VALUE);
        return compare2 > 0 ? ((y5.p) range.getEndInclusive()).m1684unboximpl() : i8;
    }

    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m187contains68kG9v0(y contains, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return contains.m208containsWZ4Q5Ns(y5.p.m1632constructorimpl(b8 & 255));
    }

    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m188containsGYNo2lE(b0 contains, y5.r rVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return rVar != null && contains.m167containsVKZWuLQ(rVar.m1762unboximpl());
    }

    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m189containsGab390E(b0 contains, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return contains.m167containsVKZWuLQ(y5.r.m1710constructorimpl(i8 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
    }

    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m190containsULbyJY(b0 contains, byte b8) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return contains.m167containsVKZWuLQ(y5.r.m1710constructorimpl(b8 & 255));
    }

    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m191containsZsK3CEQ(y contains, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return contains.m208containsWZ4Q5Ns(y5.p.m1632constructorimpl(s7 & y5.u.MAX_VALUE));
    }

    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m192containsbiwQdVI(y contains, y5.p pVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return pVar != null && contains.m208containsWZ4Q5Ns(pVar.m1684unboximpl());
    }

    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m193containsfz5IDCE(y contains, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return y5.r.m1710constructorimpl(j8 >>> 32) == 0 && contains.m208containsWZ4Q5Ns(y5.p.m1632constructorimpl((int) j8));
    }

    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m194containsuhHAxoY(b0 contains, short s7) {
        kotlin.jvm.internal.s.checkNotNullParameter(contains, "$this$contains");
        return contains.m167containsVKZWuLQ(y5.r.m1710constructorimpl(s7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final w m195downTo5PvTz6A(short s7, short s8) {
        return w.Companion.m205fromClosedRangeNkh28Cs(y5.p.m1632constructorimpl(s7 & y5.u.MAX_VALUE), y5.p.m1632constructorimpl(s8 & y5.u.MAX_VALUE), -1);
    }

    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final w m196downToJ1ME1BU(int i8, int i9) {
        return w.Companion.m205fromClosedRangeNkh28Cs(i8, i9, -1);
    }

    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final w m197downToKr8caGY(byte b8, byte b9) {
        return w.Companion.m205fromClosedRangeNkh28Cs(y5.p.m1632constructorimpl(b8 & 255), y5.p.m1632constructorimpl(b9 & 255), -1);
    }

    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final z m198downToeb3DHEI(long j8, long j9) {
        return z.Companion.m214fromClosedRange7ftBX0g(j8, j9, -1L);
    }

    public static final int first(w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        if (!wVar.isEmpty()) {
            return wVar.m203getFirstpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + wVar + " is empty.");
    }

    public static final y5.p firstOrNull(w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        if (wVar.isEmpty()) {
            return null;
        }
        return y5.p.m1626boximpl(wVar.m203getFirstpVg5ArA());
    }

    public static final int last(w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        if (!wVar.isEmpty()) {
            return wVar.m204getLastpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + wVar + " is empty.");
    }

    public static final y5.p lastOrNull(w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        if (wVar.isEmpty()) {
            return null;
        }
        return y5.p.m1626boximpl(wVar.m204getLastpVg5ArA());
    }

    private static final int random(y yVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(yVar, "<this>");
        return random(yVar, Random.Default);
    }

    private static final y5.p randomOrNull(y yVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(yVar, "<this>");
        return randomOrNull(yVar, Random.Default);
    }

    public static final w reversed(w wVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        return w.Companion.m205fromClosedRangeNkh28Cs(wVar.m204getLastpVg5ArA(), wVar.m203getFirstpVg5ArA(), -wVar.getStep());
    }

    public static final w step(w wVar, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(wVar, "<this>");
        u.checkStepIsPositive(i8 > 0, Integer.valueOf(i8));
        w.a aVar = w.Companion;
        int m203getFirstpVg5ArA = wVar.m203getFirstpVg5ArA();
        int m204getLastpVg5ArA = wVar.m204getLastpVg5ArA();
        if (wVar.getStep() <= 0) {
            i8 = -i8;
        }
        return aVar.m205fromClosedRangeNkh28Cs(m203getFirstpVg5ArA, m204getLastpVg5ArA, i8);
    }

    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final y m199until5PvTz6A(short s7, short s8) {
        return kotlin.jvm.internal.s.compare(s8 & y5.u.MAX_VALUE, 0) <= 0 ? y.Companion.getEMPTY() : new y(y5.p.m1632constructorimpl(s7 & y5.u.MAX_VALUE), y5.p.m1632constructorimpl(y5.p.m1632constructorimpl(r3) - 1), null);
    }

    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static y m200untilJ1ME1BU(int i8, int i9) {
        int compare;
        compare = Integer.compare(i9 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare <= 0 ? y.Companion.getEMPTY() : new y(i8, y5.p.m1632constructorimpl(i9 - 1), null);
    }

    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final y m201untilKr8caGY(byte b8, byte b9) {
        return kotlin.jvm.internal.s.compare(b9 & 255, 0) <= 0 ? y.Companion.getEMPTY() : new y(y5.p.m1632constructorimpl(b8 & 255), y5.p.m1632constructorimpl(y5.p.m1632constructorimpl(r3) - 1), null);
    }

    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static b0 m202untileb3DHEI(long j8, long j9) {
        int compare;
        compare = Long.compare(j9 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        return compare <= 0 ? b0.Companion.getEMPTY() : new b0(j8, y5.r.m1710constructorimpl(j9 - y5.r.m1710constructorimpl(1 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32)), null);
    }

    public static final y5.r firstOrNull(z zVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        if (zVar.isEmpty()) {
            return null;
        }
        return y5.r.m1704boximpl(zVar.m212getFirstsVKNKU());
    }

    public static final y5.r lastOrNull(z zVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        if (zVar.isEmpty()) {
            return null;
        }
        return y5.r.m1704boximpl(zVar.m213getLastsVKNKU());
    }

    private static final long random(b0 b0Var) {
        kotlin.jvm.internal.s.checkNotNullParameter(b0Var, "<this>");
        return random(b0Var, Random.Default);
    }

    private static final y5.r randomOrNull(b0 b0Var) {
        kotlin.jvm.internal.s.checkNotNullParameter(b0Var, "<this>");
        return randomOrNull(b0Var, Random.Default);
    }

    public static final z reversed(z zVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        return z.Companion.m214fromClosedRange7ftBX0g(zVar.m213getLastsVKNKU(), zVar.m212getFirstsVKNKU(), -zVar.getStep());
    }

    public static final int random(y yVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(yVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.e.nextUInt(random, yVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final y5.p randomOrNull(y yVar, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(yVar, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (yVar.isEmpty()) {
            return null;
        }
        return y5.p.m1626boximpl(kotlin.random.e.nextUInt(random, yVar));
    }

    public static final z step(z zVar, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        u.checkStepIsPositive(j8 > 0, Long.valueOf(j8));
        z.a aVar = z.Companion;
        long m212getFirstsVKNKU = zVar.m212getFirstsVKNKU();
        long m213getLastsVKNKU = zVar.m213getLastsVKNKU();
        if (zVar.getStep() <= 0) {
            j8 = -j8;
        }
        return aVar.m214fromClosedRange7ftBX0g(m212getFirstsVKNKU, m213getLastsVKNKU, j8);
    }

    public static final long first(z zVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        if (!zVar.isEmpty()) {
            return zVar.m212getFirstsVKNKU();
        }
        throw new NoSuchElementException("Progression " + zVar + " is empty.");
    }

    public static final long last(z zVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(zVar, "<this>");
        if (!zVar.isEmpty()) {
            return zVar.m213getLastsVKNKU();
        }
        throw new NoSuchElementException("Progression " + zVar + " is empty.");
    }

    public static final long random(b0 b0Var, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(b0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.e.nextULong(random, b0Var);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final y5.r randomOrNull(b0 b0Var, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(b0Var, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (b0Var.isEmpty()) {
            return null;
        }
        return y5.r.m1704boximpl(kotlin.random.e.nextULong(random, b0Var));
    }
}
