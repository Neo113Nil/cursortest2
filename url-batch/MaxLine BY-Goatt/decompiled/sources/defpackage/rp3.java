package defpackage;

import android.content.Context;
import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class rp3 implements qk3 {
    public Object m;

    public rp3(int i) {
        switch (i) {
            case 3:
                this.m = ij2.j(Boolean.FALSE);
                break;
            default:
                this.m = new ArrayList();
                break;
        }
    }

    @Override // defpackage.qk3
    public vh3 a() {
        throw null;
    }

    @Override // defpackage.qk3
    public lj3 c() {
        throw null;
    }

    @Override // defpackage.qk3
    public Context d() {
        throw null;
    }

    @Override // defpackage.qk3
    public qb2 e() {
        throw null;
    }

    @Override // defpackage.qk3
    public dq2 f() {
        throw null;
    }

    public abstract void g(js0 js0Var);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(rw0 rw0Var, Object obj) {
        ArrayList arrayList = rw0Var.a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj2 = arrayList.get(i);
            if (!(obj2 instanceof m6)) {
                if (!(obj2 instanceof rw0)) {
                    dm0.i(obj2, "Unexpected child source info ");
                    break;
                }
                if (h((rw0) obj2, obj)) {
                    break;
                }
                i++;
            } else {
                if (obj2 == obj) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public abstract String i();

    public abstract Object j();

    public abstract Object k();

    public abstract void m(Object obj);

    public abstract void n(fz2 fz2Var);

    public abstract void o();

    public abstract void p(Object obj, long j, byte b);

    public abstract boolean q(long j, Object obj);

    public abstract void r(Object obj, long j, boolean z);

    public abstract float s(long j, Object obj);

    public abstract void t(Object obj, long j, float f);

    public abstract double u(long j, Object obj);

    public void v() {
        lj3 lj3Var = ((pj3) this.m).s;
        pj3.m(lj3Var);
        lj3Var.v();
    }

    public abstract void w(Object obj, long j, double d);

    public rp3(pj3 pj3Var) {
        ll3.v(pj3Var);
        this.m = pj3Var;
    }

    public rp3(Unsafe unsafe) {
        this.m = unsafe;
    }

    public void l(rw0 rw0Var, Object obj) {
    }
}
