package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class rz {
    public int f;
    public int g;
    public int h;
    public Object i;

    public rz() {
        if (xy.g == null) {
            xy.g = new xy(24);
        }
    }

    public int a(int i) {
        if (i < this.h) {
            return ((ByteBuffer) this.i).getShort(this.g + i);
        }
        return 0;
    }

    public void b() {
        if (((sz) this.i).m != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f;
            sz szVar = (sz) this.i;
            if (i >= szVar.k || szVar.h[i] >= 0) {
                return;
            } else {
                this.f = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.g) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.g) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f);
            if (!((Class) this.i).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d = hm0.d(view);
            a0 a0Var = d != null ? d instanceof z ? ((z) d).a : new a0(d) : null;
            if (a0Var == null) {
                a0Var = new a0();
            }
            hm0.m(view, a0Var);
            view.setTag(this.f, obj);
            hm0.h(view, this.h);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f < ((sz) this.i).k;
    }

    public void remove() {
        sz szVar = (sz) this.i;
        b();
        if (this.g == -1) {
            s9.u("Call next() before removing element from the iterator.");
            return;
        }
        szVar.c();
        szVar.k(this.g);
        this.g = -1;
        this.h = szVar.m;
    }
}
