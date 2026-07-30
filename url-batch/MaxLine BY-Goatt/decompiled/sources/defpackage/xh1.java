package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xh1 {
    public int m;
    public int n;
    public int o;
    public Object p;

    public xh1() {
        if (dq2.n == null) {
            dq2.n = new dq2(10);
        }
    }

    public int a(int i) {
        if (i < this.o) {
            return ((ByteBuffer) this.p).getShort(this.n + i);
        }
        return 0;
    }

    public void b() {
        if (((uh1) this.p).t != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.m;
            uh1 uh1Var = (uh1) this.p;
            if (i >= uh1Var.r || uh1Var.o[i] >= 0) {
                return;
            } else {
                this.m = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.n) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.n) {
            tag = c(view);
        } else {
            tag = view.getTag(this.m);
            if (!((Class) this.p).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d = e53.d(view);
            u1 u1Var = d != null ? d instanceof t1 ? ((t1) d).a : new u1(d) : null;
            if (u1Var == null) {
                u1Var = new u1();
            }
            e53.i(view, u1Var);
            view.setTag(this.m, obj);
            e53.f(view, this.o);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.m < ((uh1) this.p).r;
    }

    public void remove() {
        uh1 uh1Var = (uh1) this.p;
        b();
        if (this.n == -1) {
            lh.g("Call next() before removing element from the iterator.");
            return;
        }
        uh1Var.c();
        uh1Var.k(this.n);
        this.n = -1;
        this.o = uh1Var.t;
    }
}
