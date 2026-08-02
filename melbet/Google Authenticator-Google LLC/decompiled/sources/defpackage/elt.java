package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elt extends elu {
    public static final elt a = new elt();

    @Override // defpackage.elu
    public final /* synthetic */ jll a(String str, Object obj) {
        HealthStats m3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        jkj k = lep.a.k();
        long m = eos.m(m3m, 30001);
        if (m != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar = (lep) k.b;
            lepVar.b |= 1;
            lepVar.c = m;
        }
        long m2 = eos.m(m3m, 30002);
        if (m2 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar2 = (lep) k.b;
            lepVar2.b |= 2;
            lepVar2.d = m2;
        }
        long m3 = eos.m(m3m, 30003);
        if (m3 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar3 = (lep) k.b;
            lepVar3.b |= 4;
            lepVar3.e = m3;
        }
        long m4 = eos.m(m3m, 30004);
        if (m4 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar4 = (lep) k.b;
            lepVar4.b |= 8;
            lepVar4.f = m4;
        }
        long m5 = eos.m(m3m, 30005);
        if (m5 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar5 = (lep) k.b;
            lepVar5.b |= 16;
            lepVar5.g = m5;
        }
        long m6 = eos.m(m3m, 30006);
        if (m6 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar6 = (lep) k.b;
            lepVar6.b |= 32;
            lepVar6.h = m6;
        }
        if (str != null) {
            lem p = eos.p(str);
            if (!k.b.M()) {
                k.t();
            }
            lep lepVar7 = (lep) k.b;
            p.getClass();
            lepVar7.i = p;
            lepVar7.b |= 64;
        }
        lep lepVar8 = (lep) k.q();
        if (eos.u(lepVar8)) {
            return null;
        }
        return lepVar8;
    }

    @Override // defpackage.elu
    public final /* synthetic */ jll b(jll jllVar, jll jllVar2) {
        lep lepVar = (lep) jllVar;
        lep lepVar2 = (lep) jllVar2;
        if (lepVar == null || lepVar2 == null) {
            return lepVar;
        }
        jkj k = lep.a.k();
        if ((lepVar.b & 1) != 0) {
            long j = lepVar.c - lepVar2.c;
            if (j != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar3 = (lep) k.b;
                lepVar3.b |= 1;
                lepVar3.c = j;
            }
        }
        if ((lepVar.b & 2) != 0) {
            long j2 = lepVar.d - lepVar2.d;
            if (j2 != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar4 = (lep) k.b;
                lepVar4.b |= 2;
                lepVar4.d = j2;
            }
        }
        if ((lepVar.b & 4) != 0) {
            long j3 = lepVar.e - lepVar2.e;
            if (j3 != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar5 = (lep) k.b;
                lepVar5.b |= 4;
                lepVar5.e = j3;
            }
        }
        if ((lepVar.b & 8) != 0) {
            long j4 = lepVar.f - lepVar2.f;
            if (j4 != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar6 = (lep) k.b;
                lepVar6.b |= 8;
                lepVar6.f = j4;
            }
        }
        if ((lepVar.b & 16) != 0) {
            long j5 = lepVar.g - lepVar2.g;
            if (j5 != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar7 = (lep) k.b;
                lepVar7.b |= 16;
                lepVar7.g = j5;
            }
        }
        if ((lepVar.b & 32) != 0) {
            long j6 = lepVar.h - lepVar2.h;
            if (j6 != 0) {
                if (!k.b.M()) {
                    k.t();
                }
                lep lepVar8 = (lep) k.b;
                lepVar8.b |= 32;
                lepVar8.h = j6;
            }
        }
        lem lemVar = lepVar.i;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if (!k.b.M()) {
            k.t();
        }
        lep lepVar9 = (lep) k.b;
        lemVar.getClass();
        lepVar9.i = lemVar;
        lepVar9.b |= 64;
        lep lepVar10 = (lep) k.q();
        if (eos.u(lepVar10)) {
            return null;
        }
        return lepVar10;
    }

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ String c(jll jllVar) {
        lem lemVar = ((lep) jllVar).i;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        return lemVar.d;
    }
}
