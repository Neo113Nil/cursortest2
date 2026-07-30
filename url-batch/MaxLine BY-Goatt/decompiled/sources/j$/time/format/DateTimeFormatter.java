package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    public final d a;
    public final Locale b;
    public final c0 c;
    public final e0 d;
    public final j$.time.chrono.m e;

    static {
        u uVar = new u();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        f0 f0Var = f0.EXCEEDS_PAD;
        uVar.m(aVar, 4, 10, f0Var);
        uVar.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        uVar.l(aVar2, 2);
        uVar.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        uVar.l(aVar3, 2);
        e0 e0Var = e0.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        DateTimeFormatter p = uVar.p(e0Var, tVar);
        ISO_LOCAL_DATE = p;
        u uVar2 = new u();
        p pVar = p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(p);
        j jVar = j.e;
        uVar2.c(jVar);
        uVar2.p(e0Var, tVar);
        u uVar3 = new u();
        uVar3.c(pVar);
        uVar3.a(p);
        uVar3.o();
        uVar3.c(jVar);
        uVar3.p(e0Var, tVar);
        u uVar4 = new u();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        uVar4.l(aVar4, 2);
        uVar4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar4.l(aVar5, 2);
        uVar4.o();
        uVar4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar4.l(aVar6, 2);
        uVar4.o();
        uVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter p2 = uVar4.p(e0Var, null);
        u uVar5 = new u();
        uVar5.c(pVar);
        uVar5.a(p2);
        uVar5.c(jVar);
        uVar5.p(e0Var, null);
        u uVar6 = new u();
        uVar6.c(pVar);
        uVar6.a(p2);
        uVar6.o();
        uVar6.c(jVar);
        uVar6.p(e0Var, null);
        u uVar7 = new u();
        uVar7.c(pVar);
        uVar7.a(p);
        uVar7.d('T');
        uVar7.a(p2);
        DateTimeFormatter p3 = uVar7.p(e0Var, tVar);
        u uVar8 = new u();
        uVar8.c(pVar);
        uVar8.a(p3);
        p pVar2 = p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        p pVar3 = p.STRICT;
        uVar8.c(pVar3);
        DateTimeFormatter p4 = uVar8.p(e0Var, tVar);
        u uVar9 = new u();
        uVar9.a(p4);
        uVar9.o();
        uVar9.d('[');
        p pVar4 = p.SENSITIVE;
        uVar9.c(pVar4);
        j$.time.a0 a0Var = u.h;
        uVar9.c(new s(a0Var, "ZoneRegionId()"));
        uVar9.d(']');
        uVar9.p(e0Var, tVar);
        u uVar10 = new u();
        uVar10.a(p3);
        uVar10.o();
        uVar10.c(jVar);
        uVar10.o();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new s(a0Var, "ZoneRegionId()"));
        uVar10.d(']');
        ISO_DATE_TIME = uVar10.p(e0Var, tVar);
        u uVar11 = new u();
        uVar11.c(pVar);
        uVar11.m(aVar, 4, 10, f0Var);
        uVar11.d('-');
        uVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        uVar11.o();
        uVar11.c(jVar);
        uVar11.p(e0Var, tVar);
        u uVar12 = new u();
        uVar12.c(pVar);
        uVar12.m(j$.time.temporal.j.c, 4, 10, f0Var);
        uVar12.e("-W");
        uVar12.l(j$.time.temporal.j.b, 2);
        uVar12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        uVar12.l(aVar7, 1);
        uVar12.o();
        uVar12.c(jVar);
        uVar12.p(e0Var, tVar);
        u uVar13 = new u();
        uVar13.c(pVar);
        uVar13.c(new g());
        f = uVar13.p(e0Var, null);
        u uVar14 = new u();
        uVar14.c(pVar);
        uVar14.l(aVar, 4);
        uVar14.l(aVar2, 2);
        uVar14.l(aVar3, 2);
        uVar14.o();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.p(e0Var, tVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        u uVar15 = new u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.o();
        uVar15.h(aVar7, hashMap);
        uVar15.e(", ");
        uVar15.n();
        uVar15.m(aVar3, 1, 2, f0.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.h(aVar2, hashMap2);
        uVar15.d(' ');
        uVar15.l(aVar, 4);
        uVar15.d(' ');
        uVar15.l(aVar4, 2);
        uVar15.d(':');
        uVar15.l(aVar5, 2);
        uVar15.o();
        uVar15.d(':');
        uVar15.l(aVar6, 2);
        uVar15.n();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.p(e0.SMART, tVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, e0 e0Var, j$.time.chrono.m mVar) {
        c0 c0Var = c0.a;
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        this.c = c0Var;
        Objects.requireNonNull(e0Var, "resolverStyle");
        this.d = e0Var;
        this.e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DateTimeFormatter ofPattern(String str) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        u uVar = new u();
        Objects.requireNonNull(str, "pattern");
        int i5 = 0;
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i6 = i5 + 1;
                while (i6 < str.length() && str.charAt(i6) == charAt) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (charAt == 'p') {
                    if (i6 >= str.length() || (((charAt = str.charAt(i6)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i3 = i6;
                        i4 = i7;
                        i7 = 0;
                    } else {
                        i3 = i6 + 1;
                        while (i3 < str.length() && str.charAt(i3) == charAt) {
                            i3++;
                        }
                        i4 = i3 - i6;
                    }
                    if (i7 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i7 < 1) {
                        j$.time.h.h("The pad width must be at least one but was ", i7);
                        return null;
                    }
                    u uVar2 = uVar.a;
                    uVar2.e = i7;
                    uVar2.f = ' ';
                    uVar2.g = -1;
                    i7 = i4;
                    i6 = i3;
                }
                j$.time.temporal.q qVar = (j$.time.temporal.q) ((HashMap) u.i).get(Character.valueOf(charAt));
                if (qVar != null) {
                    if (charAt != 'A') {
                        if (charAt != 'Q') {
                            if (charAt == 'S') {
                                int i8 = i7;
                                uVar.b(j$.time.temporal.a.NANO_OF_SECOND, i8, i8, false);
                            } else if (charAt != 'a') {
                                if (charAt != 'k') {
                                    if (charAt != 'q') {
                                        if (charAt != 's') {
                                            if (charAt == 'u' || charAt == 'y') {
                                                int i9 = i7;
                                                if (i9 == 2) {
                                                    LocalDate localDate = o.h;
                                                    Objects.requireNonNull(localDate, "baseDate");
                                                    uVar.j(new o(qVar, 2, 2, localDate, 0));
                                                } else if (i9 < 4) {
                                                    uVar.m(qVar, i9, 19, f0.NORMAL);
                                                } else {
                                                    uVar.m(qVar, i9, 19, f0.EXCEEDS_PAD);
                                                }
                                            } else if (charAt == 'g') {
                                                uVar.m(qVar, i7, 19, f0.NORMAL);
                                            } else if (charAt != 'h' && charAt != 'm') {
                                                if (charAt != 'n') {
                                                    switch (charAt) {
                                                        case 'D':
                                                            int i10 = i7;
                                                            if (i10 == 1) {
                                                                uVar.k(qVar);
                                                                break;
                                                            } else {
                                                                if (i10 != 2 && i10 != 3) {
                                                                    j$.time.h.j("Too many pattern letters: ", charAt);
                                                                    return null;
                                                                }
                                                                uVar.m(qVar, i10, 3, f0.NOT_NEGATIVE);
                                                                break;
                                                            }
                                                        case 'E':
                                                            break;
                                                        case 'F':
                                                            if (i7 != 1) {
                                                                j$.time.h.j("Too many pattern letters: ", charAt);
                                                                return null;
                                                            }
                                                            uVar.k(qVar);
                                                            break;
                                                        case 'G':
                                                            int i11 = i7;
                                                            if (i11 != 1 && i11 != 2 && i11 != 3) {
                                                                if (i11 == 4) {
                                                                    uVar.i(qVar, g0.FULL);
                                                                    break;
                                                                } else {
                                                                    if (i11 != 5) {
                                                                        j$.time.h.j("Too many pattern letters: ", charAt);
                                                                        return null;
                                                                    }
                                                                    uVar.i(qVar, g0.NARROW);
                                                                    break;
                                                                }
                                                            } else {
                                                                uVar.i(qVar, g0.SHORT);
                                                                break;
                                                            }
                                                        case 'H':
                                                            break;
                                                        default:
                                                            switch (charAt) {
                                                                case 'K':
                                                                    break;
                                                                case 'L':
                                                                    break;
                                                                case 'M':
                                                                    break;
                                                                case 'N':
                                                                    break;
                                                                default:
                                                                    switch (charAt) {
                                                                        case 'c':
                                                                            if (i7 != 1) {
                                                                                i = i7;
                                                                                i2 = 4;
                                                                                if (i == 2) {
                                                                                    throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                                }
                                                                                z = true;
                                                                                if (i == 1 && i != 2) {
                                                                                    if (i == 3) {
                                                                                        uVar.i(qVar, z ? g0.SHORT_STANDALONE : g0.SHORT);
                                                                                        break;
                                                                                    } else if (i == i2) {
                                                                                        uVar.i(qVar, z ? g0.FULL_STANDALONE : g0.FULL);
                                                                                        break;
                                                                                    } else {
                                                                                        if (i != 5) {
                                                                                            j$.time.h.j("Too many pattern letters: ", charAt);
                                                                                            return null;
                                                                                        }
                                                                                        uVar.i(qVar, z ? g0.NARROW_STANDALONE : g0.NARROW);
                                                                                        break;
                                                                                    }
                                                                                } else if (charAt != 'e') {
                                                                                    if (charAt != 'E') {
                                                                                        if (i != 1) {
                                                                                            uVar.l(qVar, 2);
                                                                                            break;
                                                                                        } else {
                                                                                            uVar.k(qVar);
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        uVar.i(qVar, g0.SHORT);
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    uVar.j(new r(charAt, i, i, i, 0));
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                int i12 = i7;
                                                                                uVar.j(new r(charAt, i12, i12, i12, 0));
                                                                                break;
                                                                            }
                                                                        case 'd':
                                                                            break;
                                                                        case 'e':
                                                                            break;
                                                                        default:
                                                                            if (i7 != 1) {
                                                                                uVar.l(qVar, i7);
                                                                                break;
                                                                            } else {
                                                                                uVar.k(qVar);
                                                                                break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i7;
                                    i2 = 4;
                                    z = true;
                                    if (i == 1) {
                                    }
                                    if (charAt != 'e') {
                                    }
                                }
                                int i13 = i7;
                                if (i13 == 1) {
                                    uVar.k(qVar);
                                } else {
                                    if (i13 != 2) {
                                        j$.time.h.j("Too many pattern letters: ", charAt);
                                        return null;
                                    }
                                    uVar.l(qVar, i13);
                                }
                            } else {
                                if (i7 != 1) {
                                    j$.time.h.j("Too many pattern letters: ", charAt);
                                    return null;
                                }
                                uVar.i(qVar, g0.SHORT);
                            }
                        }
                        i = i7;
                        i2 = 4;
                        z = false;
                        if (i == 1) {
                        }
                        if (charAt != 'e') {
                        }
                    }
                    uVar.m(qVar, i7, 19, f0.NOT_NEGATIVE);
                } else {
                    int i14 = i7;
                    if (charAt == 'z') {
                        if (i14 > 4) {
                            j$.time.h.j("Too many pattern letters: ", charAt);
                            return null;
                        }
                        if (i14 == 4) {
                            uVar.c(new t(g0.FULL, false));
                        } else {
                            uVar.c(new t(g0.SHORT, false));
                        }
                    } else if (charAt == 'V') {
                        if (i14 != 2) {
                            j$.time.h.j("Pattern letter count must be 2: ", charAt);
                            return null;
                        }
                        uVar.c(new s(j$.time.temporal.r.a, "ZoneId()"));
                    } else if (charAt != 'v') {
                        String str2 = "+0000";
                        if (charAt == 'Z') {
                            if (i14 < 4) {
                                uVar.g("+HHMM", "+0000");
                            } else if (i14 == 4) {
                                uVar.f(g0.FULL);
                            } else {
                                if (i14 != 5) {
                                    j$.time.h.j("Too many pattern letters: ", charAt);
                                    return null;
                                }
                                uVar.g("+HH:MM:ss", "Z");
                            }
                        } else if (charAt == 'O') {
                            if (i14 == 1) {
                                uVar.f(g0.SHORT);
                            } else {
                                if (i14 != 4) {
                                    j$.time.h.j("Pattern letter count must be 1 or 4: ", charAt);
                                    return null;
                                }
                                uVar.f(g0.FULL);
                            }
                        } else if (charAt == 'X') {
                            if (i14 > 5) {
                                j$.time.h.j("Too many pattern letters: ", charAt);
                                return null;
                            }
                            uVar.g(j.d[(i14 == 1 ? 0 : 1) + i14], "Z");
                        } else if (charAt == 'x') {
                            if (i14 > 5) {
                                j$.time.h.j("Too many pattern letters: ", charAt);
                                return null;
                            }
                            if (i14 == 1) {
                                str2 = "+00";
                            } else if (i14 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            uVar.g(j.d[(i14 == 1 ? 0 : 1) + i14], str2);
                        } else if (charAt == 'W') {
                            if (i14 > 1) {
                                j$.time.h.j("Too many pattern letters: ", charAt);
                                return null;
                            }
                            uVar.j(new r(charAt, i14, i14, i14, 0));
                        } else if (charAt == 'w') {
                            if (i14 > 2) {
                                j$.time.h.j("Too many pattern letters: ", charAt);
                                return null;
                            }
                            uVar.j(new r(charAt, i14, i14, 2, 0));
                        } else {
                            if (charAt != 'Y') {
                                j$.time.h.j("Unknown pattern letter: ", charAt);
                                return null;
                            }
                            if (i14 == 2) {
                                uVar.j(new r(charAt, i14, i14, 2, 0));
                            } else {
                                uVar.j(new r(charAt, i14, i14, 19, 0));
                            }
                        }
                    } else if (i14 == 1) {
                        uVar.c(new t(g0.SHORT, true));
                    } else {
                        if (i14 != 4) {
                            j$.time.h.j("Wrong number of  pattern letters: ", charAt);
                            return null;
                        }
                        uVar.c(new t(g0.FULL, true));
                    }
                }
                i5 = i6 - 1;
            } else if (charAt == '\'') {
                int i15 = i5 + 1;
                int i16 = i15;
                while (i16 < str.length()) {
                    if (str.charAt(i16) == '\'') {
                        int i17 = i16 + 1;
                        if (i17 < str.length() && str.charAt(i17) == '\'') {
                            i16 = i17;
                        }
                        if (i16 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i15, i16);
                        if (substring.isEmpty()) {
                            uVar.d('\'');
                        } else {
                            uVar.e(substring.replace("''", "'"));
                        }
                        i5 = i16;
                    }
                    i16++;
                }
                if (i16 < str.length()) {
                }
            } else if (charAt == '[') {
                uVar.o();
            } else if (charAt == ']') {
                if (uVar.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                uVar.n();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
                }
                uVar.d(charAt);
            }
            i5++;
        }
        return uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public final String a(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        try {
            this.a.s(new y(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0314, code lost:
    
        if (((java.util.HashMap) r9.a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 b(CharSequence charSequence) {
        long j;
        j$.time.chrono.b bVar;
        j$.time.l lVar;
        Long l;
        j$.time.s sVar;
        j$.time.s sVar2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        v vVar = new v(this);
        int B = this.a.B(vVar, charSequence, parsePosition.getIndex());
        if (B < 0) {
            parsePosition.setErrorIndex(~B);
            vVar = null;
        } else {
            parsePosition.setIndex(B);
        }
        if (vVar != null) {
            DateTimeFormatter dateTimeFormatter = vVar.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                d0 c = vVar.c();
                j$.time.chrono.m mVar = vVar.c().c;
                if (mVar == null && (mVar = dateTimeFormatter.e) == null) {
                    mVar = j$.time.chrono.t.c;
                }
                c.c = mVar;
                j$.time.y yVar = c.b;
                if (yVar == null) {
                    dateTimeFormatter.getClass();
                    yVar = null;
                }
                c.b = yVar;
                c.e = this.d;
                c.q();
                c.z(c.c.S(c.a, c.e));
                c.u();
                if (((HashMap) c.a).size() > 0) {
                    loop0: while (i < 50) {
                        Iterator it = ((HashMap) c.a).entrySet().iterator();
                        while (it.hasNext()) {
                            j$.time.temporal.q qVar = (j$.time.temporal.q) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor G = qVar.G(c.a, c, c.e);
                            if (G == null) {
                                if (!((HashMap) c.a).containsKey(qVar)) {
                                    break;
                                }
                            } else {
                                if (G instanceof j$.time.chrono.j) {
                                    j$.time.chrono.j jVar = (j$.time.chrono.j) G;
                                    j$.time.y yVar2 = c.b;
                                    if (yVar2 == null) {
                                        c.b = jVar.K();
                                    } else if (!yVar2.equals(jVar.K())) {
                                        throw new j$.time.c("ChronoZonedDateTime must use the effective parsed zone: " + c.b);
                                    }
                                    G = jVar.x();
                                }
                                if (G instanceof j$.time.chrono.e) {
                                    j$.time.chrono.e eVar = (j$.time.chrono.e) G;
                                    c.v(eVar.h(), j$.time.s.d);
                                    c.z(eVar.n());
                                } else if (G instanceof j$.time.chrono.b) {
                                    c.z((j$.time.chrono.b) G);
                                } else {
                                    if (!(G instanceof j$.time.l)) {
                                        j$.time.h.a("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                        return null;
                                    }
                                    c.v((j$.time.l) G, j$.time.s.d);
                                }
                            }
                            i++;
                        }
                    }
                    if (i == 50) {
                        j$.time.h.a("One of the parsed fields has an incorrectly implemented resolve method");
                        return null;
                    }
                    if (i > 0) {
                        c.q();
                        c.z(c.c.S(c.a, c.e));
                        c.u();
                    }
                }
                if (c.g == null) {
                    Map map = c.a;
                    j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
                    boolean containsKey = ((HashMap) map).containsKey(aVar);
                    Map map2 = c.a;
                    if (containsKey) {
                        long longValue = ((Long) ((HashMap) map2).remove(aVar)).longValue();
                        Map map3 = c.a;
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                        boolean containsKey2 = ((HashMap) map3).containsKey(aVar2);
                        Map map4 = c.a;
                        if (containsKey2) {
                            long longValue2 = (((Long) ((HashMap) map4).get(aVar2)).longValue() % 1000) + (longValue * 1000);
                            c.A(aVar, aVar2, Long.valueOf(longValue2));
                            ((HashMap) c.a).remove(aVar2);
                            ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue2 * 1000));
                        } else {
                            ((HashMap) map4).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue * 1000000));
                        }
                    } else {
                        j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map2).containsKey(aVar3)) {
                            ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c.a).remove(aVar3)).longValue() * 1000));
                        }
                    }
                    Map map5 = c.a;
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
                    Long l2 = (Long) ((HashMap) map5).get(aVar4);
                    if (l2 != null) {
                        Map map6 = c.a;
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        Long l3 = (Long) ((HashMap) map6).get(aVar5);
                        Map map7 = c.a;
                        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        Long l4 = (Long) ((HashMap) map7).get(aVar6);
                        Map map8 = c.a;
                        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
                        Long l5 = (Long) ((HashMap) map8).get(aVar7);
                        if ((l3 == null && (l4 != null || l5 != null)) || (l3 != null && l4 == null && l5 != null)) {
                            j = 1000000;
                            bVar = c.f;
                            if (bVar != null) {
                            }
                            lVar = c.g;
                            if (lVar != null) {
                            }
                            if (c.f != null) {
                                sVar = c.h;
                                sVar.getClass();
                                sVar2 = j$.time.s.d;
                                if (sVar != sVar2) {
                                }
                            }
                            if (c.g == null) {
                            }
                            if (c.f != null) {
                                l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                                if (l == null) {
                                }
                            }
                            return c;
                        }
                        j = 1000000;
                        c.s(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                        ((HashMap) c.a).remove(aVar4);
                        ((HashMap) c.a).remove(aVar5);
                        ((HashMap) c.a).remove(aVar6);
                        ((HashMap) c.a).remove(aVar7);
                        if (c.e != e0.LENIENT && ((HashMap) c.a).size() > 0) {
                            for (Map.Entry entry : ((HashMap) c.a).entrySet()) {
                                j$.time.temporal.q qVar2 = (j$.time.temporal.q) entry.getKey();
                                if (qVar2 instanceof j$.time.temporal.a) {
                                    j$.time.temporal.a aVar8 = (j$.time.temporal.a) qVar2;
                                    if (aVar8.a0()) {
                                        aVar8.Z(((Long) entry.getValue()).longValue());
                                    }
                                }
                            }
                        }
                        bVar = c.f;
                        if (bVar != null) {
                            c.p(bVar);
                        }
                        lVar = c.g;
                        if (lVar != null) {
                            c.p(lVar);
                            if (c.f != null && ((HashMap) c.a).size() > 0) {
                                c.p(c.f.L(c.g));
                            }
                        }
                        if (c.f != null && c.g != null) {
                            sVar = c.h;
                            sVar.getClass();
                            sVar2 = j$.time.s.d;
                            if (sVar != sVar2) {
                                c.f = c.f.R(c.h);
                                c.h = sVar2;
                            }
                        }
                        if (c.g == null) {
                            if (!((HashMap) c.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                                if (!((HashMap) c.a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                                }
                            }
                            Map map9 = c.a;
                            j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                            boolean containsKey3 = ((HashMap) map9).containsKey(aVar9);
                            Map map10 = c.a;
                            if (containsKey3) {
                                long longValue3 = ((Long) ((HashMap) map10).get(aVar9)).longValue();
                                ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / 1000));
                                ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue3 / j));
                            } else {
                                ((HashMap) map10).put(aVar9, 0L);
                                ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                                ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                            }
                        }
                        if (c.f != null && c.g != null) {
                            l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                            if (l == null) {
                                ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.L(c.g).F(ZoneOffset.b0(l.intValue())).Y()));
                                return c;
                            }
                            if (c.b != null) {
                                ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.L(c.g).F(c.b).Y()));
                            }
                        }
                        return c;
                    }
                }
                j = 1000000;
                if (c.e != e0.LENIENT) {
                    while (r0.hasNext()) {
                    }
                }
                bVar = c.f;
                if (bVar != null) {
                }
                lVar = c.g;
                if (lVar != null) {
                }
                if (c.f != null) {
                }
                if (c.g == null) {
                }
                if (c.f != null) {
                }
                return c;
            }
        }
        String charSequence2 = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new w(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new w(str2, charSequence);
    }

    public final String toString() {
        String dVar = this.a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
