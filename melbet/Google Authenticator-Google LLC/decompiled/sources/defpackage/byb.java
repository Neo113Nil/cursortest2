package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byb implements gxu {
    final /* synthetic */ bya a;

    public byb(bya byaVar) {
        this.a = byaVar;
    }

    @Override // defpackage.gxu
    public final /* bridge */ /* synthetic */ gxv a(gxq gxqVar) {
        bya byaVar = this.a;
        hel e = hdb.c(byaVar.i).b(new bwt(3)).d(new bpf(byaVar, 17)).e();
        try {
            jkj k = bzk.a.k();
            heg hegVar = new heg(4);
            Iterator it = e.iterator();
            while (it.hasNext()) {
                try {
                    hegVar.h(((bpc) it.next()).a());
                } catch (boz | bps e2) {
                    throw new bzi(e2);
                }
            }
            hel g = hegVar.g();
            int ceil = (int) Math.ceil(e.size() / 10.0d);
            heg hegVar2 = new heg(4);
            bmu bmuVar = bmu.a;
            jkj k2 = bmuVar.k();
            int i = ((his) g).c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                bmv bmvVar = (bmv) g.get(i3);
                if (((bmu) k2.b).c.size() == 10) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    jkp jkpVar = k2.b;
                    bmu bmuVar2 = (bmu) jkpVar;
                    bmuVar2.b |= 1;
                    bmuVar2.d = 2;
                    if (!jkpVar.M()) {
                        k2.t();
                    }
                    jkp jkpVar2 = k2.b;
                    bmu bmuVar3 = (bmu) jkpVar2;
                    bmuVar3.b |= 4;
                    bmuVar3.f = i2;
                    if (!jkpVar2.M()) {
                        k2.t();
                    }
                    bmu bmuVar4 = (bmu) k2.b;
                    bmuVar4.b = 2 | bmuVar4.b;
                    bmuVar4.e = ceil;
                    hegVar2.h((bmu) k2.q());
                    k2 = bmuVar.k();
                    i2++;
                }
                if (!k2.b.M()) {
                    k2.t();
                }
                bmu bmuVar5 = (bmu) k2.b;
                bmvVar.getClass();
                jkx jkxVar = bmuVar5.c;
                if (!jkxVar.c()) {
                    bmuVar5.c = jkp.A(jkxVar);
                }
                bmuVar5.c.add(bmvVar);
            }
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar3 = k2.b;
            bmu bmuVar6 = (bmu) jkpVar3;
            bmuVar6.b |= 1;
            bmuVar6.d = 2;
            if (!jkpVar3.M()) {
                k2.t();
            }
            jkp jkpVar4 = k2.b;
            bmu bmuVar7 = (bmu) jkpVar4;
            bmuVar7.b = 4 | bmuVar7.b;
            bmuVar7.f = i2;
            if (!jkpVar4.M()) {
                k2.t();
            }
            bmu bmuVar8 = (bmu) k2.b;
            bmuVar8.b |= 2;
            bmuVar8.e = ceil;
            hegVar2.h((bmu) k2.q());
            hel g2 = hegVar2.g();
            if (!k.b.M()) {
                k.t();
            }
            bzk bzkVar = (bzk) k.b;
            jkx jkxVar2 = bzkVar.b;
            if (!jkxVar2.c()) {
                bzkVar.b = jkp.A(jkxVar2);
            }
            jiz.f(g2, bzkVar.b);
            return new gxv(new bxu((bzk) k.q()));
        } catch (bzi unused) {
            return gxv.a;
        }
    }
}
