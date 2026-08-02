package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elv extends elu {
    public static final elv a = new elv();

    @Override // defpackage.elu
    public final /* synthetic */ jll a(String str, Object obj) {
        HealthStats m3m = a$$ExternalSyntheticApiModelOutline0.m3m(obj);
        jkj k = leq.a.k();
        int m = (int) eos.m(m3m, 50001);
        if (m != 0) {
            if (!k.b.M()) {
                k.t();
            }
            leq leqVar = (leq) k.b;
            leqVar.b |= 1;
            leqVar.c = m;
        }
        int m2 = (int) eos.m(m3m, 50002);
        if (m2 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            leq leqVar2 = (leq) k.b;
            leqVar2.b |= 2;
            leqVar2.d = m2;
        }
        if (str != null) {
            lem p = eos.p(str);
            if (!k.b.M()) {
                k.t();
            }
            leq leqVar3 = (leq) k.b;
            p.getClass();
            leqVar3.e = p;
            leqVar3.b |= 4;
        }
        leq leqVar4 = (leq) k.q();
        if (eos.v(leqVar4)) {
            return null;
        }
        return leqVar4;
    }

    @Override // defpackage.elu
    public final /* synthetic */ jll b(jll jllVar, jll jllVar2) {
        int i;
        int i2;
        leq leqVar = (leq) jllVar;
        leq leqVar2 = (leq) jllVar2;
        if (leqVar == null || leqVar2 == null) {
            return leqVar;
        }
        jkj k = leq.a.k();
        if ((leqVar.b & 1) != 0 && (i2 = leqVar.c - leqVar2.c) != 0) {
            if (!k.b.M()) {
                k.t();
            }
            leq leqVar3 = (leq) k.b;
            leqVar3.b |= 1;
            leqVar3.c = i2;
        }
        if ((leqVar.b & 2) != 0 && (i = leqVar.d - leqVar2.d) != 0) {
            if (!k.b.M()) {
                k.t();
            }
            leq leqVar4 = (leq) k.b;
            leqVar4.b |= 2;
            leqVar4.d = i;
        }
        lem lemVar = leqVar.e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        if (!k.b.M()) {
            k.t();
        }
        leq leqVar5 = (leq) k.b;
        lemVar.getClass();
        leqVar5.e = lemVar;
        leqVar5.b |= 4;
        leq leqVar6 = (leq) k.q();
        if (eos.v(leqVar6)) {
            return null;
        }
        return leqVar6;
    }

    @Override // defpackage.elu
    public final /* bridge */ /* synthetic */ String c(jll jllVar) {
        lem lemVar = ((leq) jllVar).e;
        if (lemVar == null) {
            lemVar = lem.a;
        }
        return lemVar.d;
    }
}
