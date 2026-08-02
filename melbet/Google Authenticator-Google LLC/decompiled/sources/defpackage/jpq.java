package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpq {
    public final List a = new ArrayList();
    public final jpk b;
    final /* synthetic */ bse c;

    public jpq(bse bseVar, jpk jpkVar, jpo jpoVar) {
        int i;
        int i2;
        this.c = bseVar;
        jpo jpoVar2 = jpoVar;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (jpoVar2 == null) {
                break;
            }
            int i5 = i3 + jpoVar2.d;
            jpo jpoVar3 = jpoVar2.e;
            if ((jpoVar2.a != jpi.BYTE || jpoVar3 != null || jpoVar2.c == 0) && (jpoVar3 == null || jpoVar2.c == jpoVar3.c)) {
                i = 0;
            }
            int i6 = i | i4;
            if (jpoVar3 != null && jpoVar3.a == jpoVar2.a && i == 0) {
                i2 = i5;
            } else {
                this.a.add(0, new jpp(this, jpoVar2.a, jpoVar2.b, jpoVar2.c, i5));
                i2 = 0;
            }
            if (i != 0) {
                this.a.add(0, new jpp(this, jpi.ECI, jpoVar2.b, jpoVar2.c, 0));
            }
            jpoVar2 = jpoVar3;
            i4 = i6;
            i3 = i2;
        }
        if (bseVar.a) {
            jpp jppVar = (jpp) this.a.get(0);
            if (jppVar != null) {
                jpi jpiVar = jppVar.a;
                int i7 = i4;
                jpi jpiVar2 = jpi.ECI;
                if (jpiVar != jpiVar2 && i7 != 0) {
                    this.a.add(0, new jpp(this, jpiVar2, 0, 0, 0));
                }
            }
            this.a.add(((jpp) this.a.get(0)).a == jpi.ECI ? 1 : 0, new jpp(this, jpi.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i8 = jpkVar.a;
        int i9 = 26;
        int ordinal = (i8 <= 9 ? jpr.SMALL : i8 <= 26 ? jpr.MEDIUM : jpr.LARGE).ordinal();
        if (ordinal == 0) {
            i9 = 9;
        } else if (ordinal != 1) {
            i9 = 40;
            i = 27;
        } else {
            i = 10;
        }
        int a = a(jpkVar);
        while (i8 < i9 && !jpm.f(a, jpk.a(i8), (jph) bseVar.b)) {
            i8++;
        }
        while (i8 > i) {
            int i10 = i8 - 1;
            if (!jpm.f(a, jpk.a(i10), (jph) bseVar.b)) {
                break;
            } else {
                i8 = i10;
            }
        }
        this.b = jpk.a(i8);
    }

    public final int a(jpk jpkVar) {
        int a;
        int i = 0;
        for (jpp jppVar : this.a) {
            jpi jpiVar = jppVar.a;
            int a2 = jpiVar.a(jpkVar);
            int i2 = a2 + 4;
            int ordinal = jpiVar.ordinal();
            if (ordinal == 1) {
                int i3 = jppVar.d;
                int i4 = i2 + ((i3 / 3) * 10);
                int i5 = i3 % 3;
                i2 = i4 + (i5 != 1 ? i5 == 2 ? 7 : 0 : 4);
            } else if (ordinal != 2) {
                if (ordinal == 4) {
                    a = jppVar.a() * 8;
                } else if (ordinal == 5) {
                    i2 = a2 + 12;
                } else if (ordinal == 6) {
                    a = jppVar.d * 13;
                }
                i2 += a;
            } else {
                int i6 = jppVar.d;
                i2 = i2 + ((i6 / 2) * 11) + (i6 % 2 != 1 ? 0 : 6);
            }
            i += i2;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        jpp jppVar = null;
        for (jpp jppVar2 : this.a) {
            if (jppVar != null) {
                sb.append(",");
            }
            sb.append(jppVar2.toString());
            jppVar = jppVar2;
        }
        return sb.toString();
    }
}
