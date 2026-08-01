package M;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public int f699a;

    /* renamed from: b, reason: collision with root package name */
    public int f700b;

    /* renamed from: c, reason: collision with root package name */
    public int f701c;

    /* renamed from: d, reason: collision with root package name */
    public Object f702d;

    public B() {
        if (N0.e.f884b == null) {
            N0.e.f884b = new N0.e(12);
        }
    }

    public int a(int i) {
        if (i < this.f701c) {
            return ((ByteBuffer) this.f702d).getShort(this.f700b + i);
        }
        return 0;
    }

    public void b() {
        if (((Y0.f) this.f702d).f1411h != this.f701c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f699a;
            Y0.f fVar = (Y0.f) this.f702d;
            if (i >= fVar.f1409f || fVar.f1407c[i] >= 0) {
                return;
            } else {
                this.f699a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f700b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f700b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f699a);
            if (!((Class) this.f702d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate c2 = P.c(view);
            C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f723a : new C0006b(c2);
            if (c0006b == null) {
                c0006b = new C0006b();
            }
            P.l(view, c0006b);
            view.setTag(this.f699a, obj);
            P.g(view, this.f701c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f699a < ((Y0.f) this.f702d).f1409f;
    }

    public void remove() {
        b();
        if (this.f700b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        Y0.f fVar = (Y0.f) this.f702d;
        fVar.c();
        fVar.l(this.f700b);
        this.f700b = -1;
        this.f701c = fVar.f1411h;
    }
}
