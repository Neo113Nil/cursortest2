package I;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: d, reason: collision with root package name */
    public int f1142d;

    /* renamed from: e, reason: collision with root package name */
    public int f1143e;

    /* renamed from: i, reason: collision with root package name */
    public int f1144i;

    /* renamed from: l, reason: collision with root package name */
    public Object f1145l;

    public H() {
        if (c2.e.f4185d == null) {
            c2.e.f4185d = new c2.e();
        }
    }

    public int a(int i2) {
        if (i2 < this.f1144i) {
            return ((ByteBuffer) this.f1145l).getShort(this.f1143e + i2);
        }
        return 0;
    }

    public void b() {
        if (((S5.i) this.f1145l).f2536p != this.f1144i) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i2 = this.f1142d;
            S5.i iVar = (S5.i) this.f1145l;
            if (i2 >= iVar.f2534n || iVar.f2531i[i2] >= 0) {
                return;
            } else {
                this.f1142d = i2 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f1143e) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1143e) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1142d);
            if (!((Class) this.f1145l).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d7 = T.d(view);
            C0106b c0106b = d7 == null ? null : d7 instanceof C0105a ? ((C0105a) d7).f1165a : new C0106b(d7);
            if (c0106b == null) {
                c0106b = new C0106b();
            }
            T.i(view, c0106b);
            view.setTag(this.f1142d, obj);
            T.f(view, this.f1144i);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f1142d < ((S5.i) this.f1145l).f2534n;
    }

    public void remove() {
        S5.i iVar = (S5.i) this.f1145l;
        b();
        if (this.f1143e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        iVar.c();
        iVar.l(this.f1143e);
        this.f1143e = -1;
        this.f1144i = iVar.f2536p;
    }
}
