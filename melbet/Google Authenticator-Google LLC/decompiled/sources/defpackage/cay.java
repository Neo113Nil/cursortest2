package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cay implements gzf {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cay(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            hel e = hdb.c(((jnb) obj).b).d(new bwv(11)).b(new bwt(4)).d(new bwv(9)).e();
            jkj k = hqs.a.k();
            if (!k.b.M()) {
                k.t();
            }
            long j = this.a;
            hqs hqsVar = (hqs) k.b;
            hqsVar.c = 17;
            hqsVar.b = 1 | hqsVar.b;
            long epochMilli = Instant.now().toEpochMilli() - j;
            if (!k.b.M()) {
                k.t();
            }
            Object obj2 = this.b;
            jkp jkpVar = k.b;
            hqs hqsVar2 = (hqs) jkpVar;
            hqsVar2.b |= 8;
            hqsVar2.f = epochMilli;
            if (!jkpVar.M()) {
                k.t();
            }
            caz cazVar = (caz) obj2;
            String str = cazVar.e;
            bov bovVar = cazVar.b;
            hqs hqsVar3 = (hqs) k.b;
            str.getClass();
            hqsVar3.b |= 64;
            hqsVar3.g = str;
            bovVar.a((hqs) k.q());
            return e;
        }
        if (i == 1) {
            jnh jnhVar = (jnh) obj;
            jkj k2 = hqs.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            long j2 = this.a;
            hqs hqsVar4 = (hqs) k2.b;
            hqsVar4.c = 7;
            hqsVar4.b = 1 | hqsVar4.b;
            long epochMilli2 = Instant.now().toEpochMilli() - j2;
            if (!k2.b.M()) {
                k2.t();
            }
            Object obj3 = this.b;
            jkp jkpVar2 = k2.b;
            hqs hqsVar5 = (hqs) jkpVar2;
            hqsVar5.b |= 8;
            hqsVar5.f = epochMilli2;
            if (!jkpVar2.M()) {
                k2.t();
            }
            caz cazVar2 = (caz) obj3;
            String str2 = cazVar2.e;
            bov bovVar2 = cazVar2.b;
            hqs hqsVar6 = (hqs) k2.b;
            str2.getClass();
            hqsVar6.b |= 64;
            hqsVar6.g = str2;
            bovVar2.a((hqs) k2.q());
            jmh jmhVar = jnhVar.b;
            if (jmhVar == null) {
                jmhVar = jmh.a;
            }
            return Long.valueOf(jmx.a(jmhVar));
        }
        jkj k3 = hqs.a.k();
        if (!k3.b.M()) {
            k3.t();
        }
        hqs hqsVar7 = (hqs) k3.b;
        hqsVar7.c = 101;
        hqsVar7.b |= 1;
        jkj k4 = hqy.a.k();
        if (!k4.b.M()) {
            k4.t();
        }
        long j3 = this.a;
        hqy hqyVar = (hqy) k4.b;
        hqyVar.b |= 1;
        hqyVar.c = true;
        long epochMilli3 = Instant.now().toEpochMilli() - j3;
        if (!k4.b.M()) {
            k4.t();
        }
        hqy hqyVar2 = (hqy) k4.b;
        hqyVar2.b |= 2;
        hqyVar2.d = epochMilli3;
        hqy hqyVar3 = (hqy) k4.q();
        if (!k3.b.M()) {
            k3.t();
        }
        Object obj4 = this.b;
        hqs hqsVar8 = (hqs) k3.b;
        hqyVar3.getClass();
        hqsVar8.h = hqyVar3;
        hqsVar8.b |= 128;
        cbe cbeVar = (cbe) obj4;
        String a = cch.a(cbeVar.b);
        if (!k3.b.M()) {
            k3.t();
        }
        bov bovVar3 = cbeVar.d;
        hqs hqsVar9 = (hqs) k3.b;
        a.getClass();
        hqsVar9.b |= 64;
        hqsVar9.g = a;
        bovVar3.a((hqs) k3.q());
        return null;
    }
}
