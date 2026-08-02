package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejq implements ejj {
    final /* synthetic */ fym a;

    public ejq(fym fymVar) {
        this.a = fymVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, koe] */
    @Override // defpackage.ejj
    public final boolean a(jkj jkjVar) {
        fym fymVar = this.a;
        int i = 0;
        if (!((Boolean) fymVar.c.b()).booleanValue()) {
            return false;
        }
        Object obj = fymVar.e;
        int i2 = 0;
        while (true) {
            if (i2 >= ((ejf) jkjVar.b).e.size()) {
                i2 = -1;
                break;
            }
            if (((ejb) ((ejf) jkjVar.b).e.get(i2)).b == 3) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            ejf ejfVar = (ejf) jkjVar.b;
            ejfVar.b();
            ejfVar.e.remove(i2);
        }
        jkj k = ejd.a.k();
        if (!k.b.M()) {
            k.t();
        }
        ejd ejdVar = (ejd) k.b;
        ejdVar.e = 1;
        int i3 = 2;
        ejdVar.b |= 2;
        Instant now = Instant.now();
        jmh c = jmx.c(now.getEpochSecond(), now.getNano());
        if (!k.b.M()) {
            k.t();
        }
        ejd ejdVar2 = (ejd) k.b;
        c.getClass();
        ejdVar2.d = c;
        ejdVar2.b |= 1;
        if (((Boolean) fymVar.d.b()).booleanValue()) {
            Stream map = Collection.EL.stream(((gvn) ((brn) ((gzs) obj).a).a).a()).map(new ejs(11));
            int i4 = hel.d;
            Collector collector = hby.a;
            hel a = ejw.a((List) Collection.EL.stream((hel) map.collect(collector)).map(new ejs(4)).collect(collector), ((Long) fymVar.b.b()).longValue(), ((Long) fymVar.f.b()).longValue());
            int size = a.size();
            while (i < size) {
                lhg lhgVar = (lhg) a.get(i);
                jkj k2 = lgx.a.k();
                if (!k2.b.M()) {
                    k2.t();
                }
                lgx lgxVar = (lgx) k2.b;
                lhgVar.getClass();
                lgxVar.d = lhgVar;
                lgxVar.c = 3;
                jkj k3 = lha.a.k();
                if (!k3.b.M()) {
                    k3.t();
                }
                lha lhaVar = (lha) k3.b;
                lhaVar.b |= 2;
                lhaVar.e = true;
                lha lhaVar2 = (lha) k3.q();
                if (!k2.b.M()) {
                    k2.t();
                }
                lgx lgxVar2 = (lgx) k2.b;
                lhaVar2.getClass();
                lgxVar2.e = lhaVar2;
                lgxVar2.b |= 1;
                k.ak(k2);
                i++;
            }
        } else {
            Stream map2 = Collection.EL.stream(((gvn) ((brn) ((gzs) obj).a).a).a()).map(new ejs(10));
            int i5 = hel.d;
            Collector collector2 = hby.a;
            hel a2 = ejw.a((List) Collection.EL.stream((hel) map2.collect(collector2)).map(new ejs(i3)).collect(collector2), ((Long) fymVar.b.b()).longValue(), ((Long) fymVar.f.b()).longValue());
            int size2 = a2.size();
            while (i < size2) {
                lfs lfsVar = (lfs) a2.get(i);
                jkj k4 = lgx.a.k();
                if (!k4.b.M()) {
                    k4.t();
                }
                lgx lgxVar3 = (lgx) k4.b;
                lfsVar.getClass();
                lgxVar3.d = lfsVar;
                lgxVar3.c = 1;
                jkj k5 = lha.a.k();
                if (!k5.b.M()) {
                    k5.t();
                }
                lha lhaVar3 = (lha) k5.b;
                lhaVar3.b |= 2;
                lhaVar3.e = true;
                lha lhaVar4 = (lha) k5.q();
                if (!k4.b.M()) {
                    k4.t();
                }
                lgx lgxVar4 = (lgx) k4.b;
                lhaVar4.getClass();
                lgxVar4.e = lhaVar4;
                lgxVar4.b |= 1;
                k.ak(k4);
                i++;
            }
        }
        jkj k6 = ejb.a.k();
        ejd ejdVar3 = (ejd) k.q();
        if (!k6.b.M()) {
            k6.t();
        }
        ejb ejbVar = (ejb) k6.b;
        ejdVar3.getClass();
        ejbVar.c = ejdVar3;
        ejbVar.b = 3;
        jkjVar.aj(k6);
        return true;
    }
}
