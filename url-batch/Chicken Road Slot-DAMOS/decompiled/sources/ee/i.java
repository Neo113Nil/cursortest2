package ee;

import c6.s;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3975a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3976b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3977c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3978d = {1, 2, 4, 5, 7, 8};

    public static final long a(long j, long j3) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : be.f.d(j + j3);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long b(long j) {
        long j3 = (j << 1) + 1;
        b.f3956e.getClass();
        int i3 = c.f3961a;
        return j3;
    }

    public static final long c(long j) {
        long j3 = j << 1;
        b.f3956e.getClass();
        int i3 = c.f3961a;
        return j3;
    }

    public static final void d(StringBuilder sb2, StringBuilder sb3, int i3) {
        if (i3 < 10) {
            sb2.append('0');
        }
        sb3.append(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        if (r8 == r23.length()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bf, code lost:
    
        if (r23.charAt(r8) != 'S') goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
    
        r2 = (r13 * 1000000000) + r14;
        r4 = r10;
        r13 = ee.d.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d1, code lost:
    
        switch(r13.ordinal()) {
            case 0: goto L132;
            case 1: goto L131;
            case 2: goto L130;
            case 3: goto L129;
            case 4: goto L128;
            case 5: goto L127;
            case 6: goto L126;
            default: goto L125;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d4, code lost:
    
        a2.r.n(r13, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020a, code lost:
    
        r13 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01dc, code lost:
    
        r13 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0205, code lost:
    
        r2 = yd.c.b(r2 * r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e2, code lost:
    
        r13 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e8, code lost:
    
        r13 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ee, code lost:
    
        r13 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01f4, code lost:
    
        r13 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01fa, code lost:
    
        r13 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0200, code lost:
    
        r13 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00f1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r8 >= r23.length()) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r4 = r23.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if ('0' > r4) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r4 >= ':') goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r8 == r23.length()) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r3 == '+') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r3 == '-') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
    
        if (r8 == (r20 + r3)) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        r6 = r7.f3982a;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[LOOP:5: B:75:0x0154->B:76:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193 A[LOOP:7: B:88:0x0191->B:89:0x0193, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long e(String str) {
        int i3;
        int i10;
        int i11;
        int i12;
        long j;
        int i13;
        int i14;
        int i15;
        int i16;
        int min;
        int i17;
        int i18;
        int i19;
        char charAt;
        char charAt2;
        int i20;
        int i21;
        if (str.length() == 0) {
            a1.e("The string is empty");
            return 0L;
        }
        char charAt3 = str.charAt(0);
        char c10 = '-';
        char c11 = '+';
        if (charAt3 != '+') {
            i10 = charAt3 != '-' ? 0 : 1;
            i3 = i10;
        } else {
            i3 = 0;
            i10 = 1;
        }
        if (str.length() <= i10) {
            a1.e("No components");
            return 0L;
        }
        if (str.charAt(i10) != 'P') {
            a1.e("");
            return 0L;
        }
        int i22 = i10 + 1;
        if (i22 == str.length()) {
            a1.e("");
            return 0L;
        }
        boolean z10 = false;
        d dVar = null;
        long j3 = 0;
        long j10 = 0;
        while (i22 < str.length()) {
            char charAt4 = str.charAt(i22);
            if (charAt4 != 'T') {
                l lVar = l.f3981e;
                if (lVar.f3983b) {
                    char charAt5 = str.charAt(i22);
                    if (charAt5 == c11) {
                        i11 = i22 + 1;
                        i12 = 1;
                        while (i11 < str.length()) {
                            i11++;
                        }
                        j = 0;
                        while (true) {
                            if (i11 < str.length()) {
                            }
                            j = (j << 3) + (j << 1) + i21;
                            i11++;
                            i3 = i14;
                            i22 = i13;
                        }
                        i14 = i3;
                        if (i11 != str.length()) {
                        }
                        a1.e("");
                        return 0L;
                    }
                    if (charAt5 == c10) {
                        i11 = i22 + 1;
                        i12 = -1;
                        while (i11 < str.length() && str.charAt(i11) == '0') {
                            i11++;
                        }
                        j = 0;
                        while (true) {
                            if (i11 < str.length()) {
                                char charAt6 = str.charAt(i11);
                                i13 = i22;
                                if ('0' <= charAt6 && charAt6 < ':') {
                                    i21 = charAt6 - '0';
                                    i14 = i3;
                                    long j11 = lVar.f3984c;
                                    if (j <= j11 && (j != j11 || i21 <= lVar.f3985d)) {
                                        j = (j << 3) + (j << 1) + i21;
                                        i11++;
                                        i3 = i14;
                                        i22 = i13;
                                    }
                                }
                            } else {
                                i13 = i22;
                            }
                        }
                        i14 = i3;
                        if (i11 != str.length()) {
                            if (i11 != i13 + ((charAt4 == '+' || charAt4 == '-') ? 1 : 0)) {
                                long j12 = j;
                                if (str.charAt(i11) == '.') {
                                    int i23 = i11 + 1;
                                    int min2 = Math.min(i11 + 7, str.length());
                                    int i24 = 0;
                                    for (int i25 = i23; i25 < min2; i25++) {
                                        char charAt7 = str.charAt(i25);
                                        if ('0' <= charAt7 && charAt7 < ':') {
                                            i24 = (charAt7 - '0') + (i24 << 3) + (i24 << 1);
                                        }
                                        for (i16 = 0; i16 < 6 - (i25 - i23); i16++) {
                                            i24 = (i24 << 1) + (i24 << 3);
                                        }
                                        min = Math.min(i25 + 9, str.length());
                                        i17 = i25;
                                        i18 = 0;
                                        while (true) {
                                            i15 = i14;
                                            if (i17 >= min) {
                                                charAt2 = str.charAt(i17);
                                                i20 = min;
                                                if ('0' <= charAt2 && charAt2 < ':') {
                                                    i18 = (charAt2 - '0') + (i18 << 3) + (i18 << 1);
                                                    i17++;
                                                    i14 = i15;
                                                    min = i20;
                                                }
                                            }
                                        }
                                        for (i19 = 0; i19 < 9 - (i17 - i25); i19++) {
                                            i18 = (i18 << 1) + (i18 << 3);
                                        }
                                        i11 = i17;
                                        while (i11 < str.length() && '0' <= (charAt = str.charAt(i11)) && charAt < ':') {
                                            i11++;
                                        }
                                        a1.e("");
                                        return 0L;
                                    }
                                    while (i16 < 6 - (i25 - i23)) {
                                    }
                                    min = Math.min(i25 + 9, str.length());
                                    i17 = i25;
                                    i18 = 0;
                                    while (true) {
                                        i15 = i14;
                                        if (i17 >= min) {
                                        }
                                        i18 = (charAt2 - '0') + (i18 << 3) + (i18 << 1);
                                        i17++;
                                        i14 = i15;
                                        min = i20;
                                    }
                                    while (i19 < 9 - (i17 - i25)) {
                                    }
                                    i11 = i17;
                                    while (i11 < str.length()) {
                                        i11++;
                                    }
                                    a1.e("");
                                    return 0L;
                                }
                                i15 = i14;
                                char charAt8 = str.charAt(i11);
                                d dVar2 = charAt8 != 'D' ? charAt8 != 'H' ? charAt8 != 'M' ? charAt8 != 'S' ? null : d.SECONDS : d.MINUTES : d.HOURS : d.DAYS;
                                if (dVar2 == null) {
                                    throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i11));
                                }
                                if (dVar != null && dVar.compareTo(dVar2) <= 0) {
                                    a1.e("Unexpected order of duration components");
                                    return 0L;
                                }
                                if (dVar2 == d.DAYS) {
                                    if (z10) {
                                        a1.e("");
                                        return 0L;
                                    }
                                    j3 = f.a(j12, dVar2) * i12;
                                } else {
                                    if (!z10) {
                                        a1.e("");
                                        return 0L;
                                    }
                                    long a9 = a(j3, f.a(j12, dVar2) * i12);
                                    if (a9 == 9223372036854759646L) {
                                        a1.e("");
                                        return 0L;
                                    }
                                    j3 = a9;
                                }
                                d dVar3 = dVar2;
                                i22 = i11 + 1;
                                dVar = dVar3;
                                i3 = i15;
                                c10 = '-';
                                c11 = '+';
                            }
                        }
                        a1.e("");
                        return 0L;
                    }
                }
                i11 = i22;
                i12 = 1;
                while (i11 < str.length()) {
                }
                j = 0;
                while (true) {
                    if (i11 < str.length()) {
                    }
                    j = (j << 3) + (j << 1) + i21;
                    i11++;
                    i3 = i14;
                    i22 = i13;
                }
                i14 = i3;
                if (i11 != str.length()) {
                }
                a1.e("");
                return 0L;
            }
            if (z10 || (i22 = i22 + 1) == str.length()) {
                a1.e("");
                return 0L;
            }
            z10 = true;
        }
        int i26 = i3;
        long e2 = b.e(i(j3, d.MILLISECONDS), i(j10, d.NANOSECONDS));
        if (i26 == 0) {
            return e2;
        }
        b.f3956e.getClass();
        return e2 == b.f3959s ? e2 : b.h(e2);
    }

    public static final s f(String str, String str2, int i3, Function1 function1) {
        char charAt = str.charAt(i3);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return g(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i3);
    }

    public static final s g(String str, String str2) {
        return new s(str2 + " when parsing an Instant from \"" + j(64, str) + '\"', str);
    }

    public static final int h(int i3, String str) {
        return (str.charAt(i3 + 1) - '0') + ((str.charAt(i3) - '0') * 10);
    }

    public static final long i(long j, d dVar) {
        d dVar2 = d.NANOSECONDS;
        TimeUnit timeUnit = dVar.f3970d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return c(timeUnit2.convert(j, timeUnit));
        }
        if (dVar.compareTo(d.MILLISECONDS) < 0) {
            return b(be.f.d(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return b(f.a(Math.abs(j), dVar) * signum);
    }

    public static final String j(int i3, String str) {
        if (str.length() <= i3) {
            return str.toString();
        }
        return str.subSequence(0, i3).toString() + "...";
    }
}
