package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        u uVar = new u();
        uVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        uVar.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        uVar.l(aVar, 2);
        uVar.d(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar.l(aVar2, 2);
        uVar.d(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar.l(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i2 = 1;
        uVar.b(aVar4, 0, 9, true);
        uVar.d('Z');
        d dVar = uVar.q(Locale.getDefault(), e0.SMART, null).a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int B = dVar.B(vVar2, charSequence, i);
        if (B < 0) {
            return B;
        }
        long longValue = vVar2.d(j$.time.temporal.a.YEAR).longValue();
        int intValue = vVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = vVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = vVar2.d(aVar).intValue();
        int intValue4 = vVar2.d(aVar2).intValue();
        Long d = vVar2.d(aVar3);
        Long d2 = vVar2.d(aVar4);
        int intValue5 = d != null ? d.intValue() : 0;
        int intValue6 = d2 != null ? d2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            intValue3 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            vVar.c().d = true;
            i2 = 0;
            intValue5 = 59;
        } else {
            i2 = 0;
        }
        int i3 = ((int) longValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate of = LocalDate.of(i3, intValue, intValue2);
            j$.time.l P = j$.time.l.P(intValue3, intValue4, intValue5, 0);
            return vVar.f(aVar4, intValue6, i, vVar.f(j$.time.temporal.a.INSTANT_SECONDS, new LocalDateTime(of, P).c0(of.f0(i2), P).w(ZoneOffset.UTC) + Math.multiplyExact(longValue / 10000, 315569520000L), i, B));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        Long a = yVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = yVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = temporalAccessor.f(aVar) ? Long.valueOf(temporalAccessor.g(aVar)) : null;
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long floorDiv = Math.floorDiv(j, 315569520000L) + 1;
            LocalDateTime P = LocalDateTime.P(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (floorDiv > 0) {
                sb.append('+');
                sb.append(floorDiv);
            }
            sb.append(P);
            if (P.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime P2 = LocalDateTime.P(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(P2);
            if (P2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (P2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
