package j$.time.format;

import j$.time.b0;
import j$.time.c0;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class i implements g {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // j$.time.format.g
    public final boolean f(q qVar, StringBuilder sb) {
        int i = 0;
        switch (this.a) {
            case 0:
                Long a = qVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.k kVar = (j$.time.temporal.k) qVar.c;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long valueOf = kVar.c(aVar) ? Long.valueOf(kVar.o(aVar)) : null;
                if (a != null) {
                    long longValue = a.longValue();
                    int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
                    if (longValue >= -62167219200L) {
                        long j = longValue - 253402300800L;
                        long B = j$.nio.file.attribute.a.B(j, 315569520000L) + 1;
                        j$.time.l x = j$.time.l.x(j$.nio.file.attribute.a.C(j, 315569520000L) - 62167219200L, 0, c0.e);
                        if (B > 0) {
                            sb.append('+');
                            sb.append(B);
                        }
                        sb.append(x);
                        if (x.b.c == 0) {
                            sb.append(":00");
                        }
                    } else {
                        long j2 = longValue + 62167219200L;
                        long j3 = j2 / 315569520000L;
                        long j4 = j2 % 315569520000L;
                        j$.time.l x2 = j$.time.l.x(j4 - 62167219200L, 0, c0.e);
                        int length = sb.length();
                        sb.append(x2);
                        if (x2.b.c == 0) {
                            sb.append(":00");
                        }
                        if (j3 < 0) {
                            if (x2.a.a == -10000) {
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
                            if (a2 > 0 || i % 3 != 0 || i < -2) {
                                int i3 = a2 / i2;
                                sb.append((char) (i3 + 48));
                                a2 -= i3 * i2;
                                i2 /= 10;
                                i++;
                            }
                        }
                    }
                    sb.append('Z');
                    break;
                } else {
                    break;
                }
                break;
            default:
                b bVar = o.f;
                j$.time.temporal.k kVar2 = (j$.time.temporal.k) qVar.c;
                Object k = kVar2.k(bVar);
                if (k != null || qVar.b != 0) {
                    b0 b0Var = (b0) k;
                    if (b0Var != null) {
                        sb.append(b0Var.u());
                        break;
                    }
                } else {
                    j$.time.i.d(j$.time.g.a("Unable to extract ", String.valueOf(bVar), " from temporal ", String.valueOf(kVar2)));
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
