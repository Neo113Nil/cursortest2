package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ejm implements ejj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ejm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, koe] */
    @Override // defpackage.ejj
    public final boolean a(jkj jkjVar) {
        long startElapsedRealtime;
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            jkj k = ejb.a.k();
            jkj k2 = ejc.a.k();
            startElapsedRealtime = Process.getStartElapsedRealtime();
            jmh b = jmx.b(Instant.now().toEpochMilli() - (SystemClock.elapsedRealtime() - startElapsedRealtime));
            if (!k2.b.M()) {
                k2.t();
            }
            ejc ejcVar = (ejc) k2.b;
            b.getClass();
            ejcVar.c = b;
            ejcVar.b |= 1;
            if (!k.b.M()) {
                k.t();
            }
            Object obj = this.a;
            ejb ejbVar = (ejb) k.b;
            ejc ejcVar2 = (ejc) k2.q();
            ejcVar2.getClass();
            ejbVar.c = ejcVar2;
            ejbVar.b = 2;
            jkjVar.aj(k);
            if (!((Boolean) ((ejn) obj).a.b()).booleanValue()) {
                long myPid = Process.myPid();
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                ejf ejfVar = (ejf) jkjVar.b;
                ejf ejfVar2 = ejf.a;
                ejfVar.b |= 1;
                ejfVar.c = myPid;
                jmh b2 = jmx.b(Instant.now().toEpochMilli());
                if (!jkjVar.b.M()) {
                    jkjVar.t();
                }
                ejf ejfVar3 = (ejf) jkjVar.b;
                b2.getClass();
                ejfVar3.d = b2;
                ejfVar3.b |= 2;
            }
            return true;
        }
        jkj k3 = eje.a.k();
        ejp ejpVar = (ejp) this.a;
        emq emqVar = (emq) ejpVar.a;
        if (emqVar.b() != null) {
            String b3 = emqVar.b();
            if (!k3.b.M()) {
                k3.t();
            }
            eje ejeVar = (eje) k3.b;
            b3.getClass();
            ejeVar.b |= 1;
            ejeVar.c = b3;
        }
        emp empVar = (emp) ejpVar.b;
        if (empVar.a().intValue() > 0) {
            int intValue = empVar.a().intValue();
            if (!k3.b.M()) {
                k3.t();
            }
            eje ejeVar2 = (eje) k3.b;
            ejeVar2.b = 2 | ejeVar2.b;
            ejeVar2.d = intValue;
        }
        koe koeVar = ejpVar.c;
        if (((Integer) koeVar.b()).intValue() > 0) {
            int intValue2 = ((Integer) koeVar.b()).intValue();
            if (!k3.b.M()) {
                k3.t();
            }
            eje ejeVar3 = (eje) k3.b;
            ejeVar3.b |= 4;
            ejeVar3.e = intValue2;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!k3.b.M()) {
            k3.t();
        }
        eje ejeVar4 = (eje) k3.b;
        ejeVar4.b |= 8;
        ejeVar4.f = i2;
        jkj k4 = ejb.a.k();
        if (!k4.b.M()) {
            k4.t();
        }
        ejb ejbVar2 = (ejb) k4.b;
        eje ejeVar5 = (eje) k3.q();
        ejeVar5.getClass();
        ejbVar2.c = ejeVar5;
        ejbVar2.b = 4;
        ejb ejbVar3 = (ejb) k4.q();
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        ejf ejfVar4 = (ejf) jkjVar.b;
        ejf ejfVar5 = ejf.a;
        ejbVar3.getClass();
        ejfVar4.b();
        ejfVar4.e.add(ejbVar3);
        return true;
    }
}
