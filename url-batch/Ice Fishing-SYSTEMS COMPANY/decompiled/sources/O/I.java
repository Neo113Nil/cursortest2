package O;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import s7.C5006f;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: n, reason: collision with root package name */
    public int f2228n;

    /* renamed from: u, reason: collision with root package name */
    public int f2229u;

    /* renamed from: v, reason: collision with root package name */
    public int f2230v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2231w;

    public I() {
        if (C3.e.f381n == null) {
            C3.e.f381n = new C3.e();
        }
    }

    public int a(int i) {
        if (i < this.f2230v) {
            return ((ByteBuffer) this.f2231w).getShort(this.f2229u + i);
        }
        return 0;
    }

    public void b() {
        if (((C5006f) this.f2231w).f40507A != this.f2230v) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f2228n;
            C5006f c5006f = (C5006f) this.f2231w;
            if (i >= c5006f.f40518y || c5006f.f40515v[i] >= 0) {
                return;
            } else {
                this.f2228n = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2229u) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2229u) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f2228n);
            if (!((Class) this.f2231w).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d2 = X.d(view);
            C0336b c0336b = d2 == null ? null : d2 instanceof C0334a ? ((C0334a) d2).f2246a : new C0336b(d2);
            if (c0336b == null) {
                c0336b = new C0336b();
            }
            X.o(view, c0336b);
            view.setTag(this.f2228n, obj);
            X.i(this.f2230v, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f2228n < ((C5006f) this.f2231w).f40518y;
    }

    public void remove() {
        b();
        if (this.f2229u == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C5006f c5006f = (C5006f) this.f2231w;
        c5006f.d();
        c5006f.m(this.f2229u);
        this.f2229u = -1;
        this.f2230v = c5006f.f40507A;
    }
}
