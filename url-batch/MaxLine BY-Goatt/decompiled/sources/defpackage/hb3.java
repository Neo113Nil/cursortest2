package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hb3 extends yd3 {
    public final pj3 a;
    public final jm3 b;

    public hb3(pj3 pj3Var) {
        ll3.v(pj3Var);
        this.a = pj3Var;
        jm3 jm3Var = pj3Var.y;
        pj3.l(jm3Var);
        this.b = jm3Var;
    }

    @Override // defpackage.km3
    public final void zza(String str, String str2, Bundle bundle) {
        jm3 jm3Var = this.b;
        ((pj3) jm3Var.m).w.getClass();
        jm3Var.B(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.km3
    public final Map zzd(String str, String str2, boolean z) {
        jm3 jm3Var = this.b;
        pj3 pj3Var = (pj3) jm3Var.m;
        lj3 lj3Var = pj3Var.s;
        vh3 vh3Var = pj3Var.r;
        pj3.m(lj3Var);
        if (lj3Var.C()) {
            pj3.m(vh3Var);
            vh3Var.r.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (dq2.j()) {
            pj3.m(vh3Var);
            vh3Var.r.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        lj3Var2.G(atomicReference, 5000L, "get user properties", new fi3(jm3Var, atomicReference, str, str2, z));
        List<tq3> list = (List) atomicReference.get();
        if (list == null) {
            pj3.m(vh3Var);
            vh3Var.r.c(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        hi hiVar = new hi(list.size());
        for (tq3 tq3Var : list) {
            Object a = tq3Var.a();
            if (a != null) {
                hiVar.put(tq3Var.n, a);
            }
        }
        return hiVar;
    }

    @Override // defpackage.km3
    public final String zzh() {
        dn3 dn3Var = ((pj3) this.b.m).x;
        pj3.l(dn3Var);
        tm3 tm3Var = dn3Var.o;
        if (tm3Var != null) {
            return tm3Var.a;
        }
        return null;
    }

    @Override // defpackage.km3
    public final String zzi() {
        dn3 dn3Var = ((pj3) this.b.m).x;
        pj3.l(dn3Var);
        tm3 tm3Var = dn3Var.o;
        if (tm3Var != null) {
            return tm3Var.b;
        }
        return null;
    }

    @Override // defpackage.km3
    public final String zzj() {
        return (String) this.b.s.get();
    }

    @Override // defpackage.km3
    public final String zzk() {
        return this.b.L();
    }

    @Override // defpackage.km3
    public final long zzl() {
        zq3 zq3Var = this.a.u;
        pj3.k(zq3Var);
        return zq3Var.t0();
    }

    @Override // defpackage.km3
    public final void zzm(String str) {
        pj3 pj3Var = this.a;
        se3 se3Var = pj3Var.z;
        pj3.j(se3Var);
        pj3Var.w.getClass();
        se3Var.x(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.km3
    public final void zzn(String str) {
        pj3 pj3Var = this.a;
        se3 se3Var = pj3Var.z;
        pj3.j(se3Var);
        pj3Var.w.getClass();
        se3Var.y(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.km3
    public final void zzo(Bundle bundle) {
        jm3 jm3Var = this.b;
        ((pj3) jm3Var.m).w.getClass();
        jm3Var.J(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.km3
    public final void zzp(String str, String str2, Bundle bundle) {
        jm3 jm3Var = this.a.y;
        pj3.l(jm3Var);
        jm3Var.K(str, str2, bundle);
    }

    @Override // defpackage.km3
    public final List zzq(String str, String str2) {
        jm3 jm3Var = this.b;
        pj3 pj3Var = (pj3) jm3Var.m;
        lj3 lj3Var = pj3Var.s;
        vh3 vh3Var = pj3Var.r;
        pj3.m(lj3Var);
        if (lj3Var.C()) {
            pj3.m(vh3Var);
            vh3Var.r.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (dq2.j()) {
            pj3.m(vh3Var);
            vh3Var.r.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        lj3 lj3Var2 = pj3Var.s;
        pj3.m(lj3Var2);
        lj3Var2.G(atomicReference, 5000L, "get conditional user properties", new ys(jm3Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zq3.m0(list);
        }
        pj3.m(vh3Var);
        vh3Var.r.c(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.km3
    public final int zzr(String str) {
        jm3 jm3Var = this.b;
        jm3Var.getClass();
        ll3.s(str);
        ((pj3) jm3Var.m).getClass();
        return 25;
    }
}
