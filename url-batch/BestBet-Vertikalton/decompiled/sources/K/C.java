package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public int f568a;

    /* renamed from: b, reason: collision with root package name */
    public int f569b;

    /* renamed from: c, reason: collision with root package name */
    public int f570c;
    public Object d;

    public C() {
        if (R0.e.f901b == null) {
            R0.e.f901b = new R0.e(11);
        }
    }

    public int a(int i) {
        if (i < this.f570c) {
            return ((ByteBuffer) this.d).getShort(this.f569b + i);
        }
        return 0;
    }

    public void b() {
        if (((Z0.f) this.d).h != this.f570c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f568a;
            Z0.f fVar = (Z0.f) this.d;
            if (i >= fVar.f1544f || fVar.f1542c[i] >= 0) {
                return;
            } else {
                this.f568a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f569b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f569b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f568a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate c2 = Q.c(view);
            C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f592a : new C0006b(c2);
            if (c0006b == null) {
                c0006b = new C0006b();
            }
            Q.l(view, c0006b);
            view.setTag(this.f568a, obj);
            Q.g(view, this.f570c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f568a < ((Z0.f) this.d).f1544f;
    }

    public void remove() {
        b();
        if (this.f569b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        Z0.f fVar = (Z0.f) this.d;
        fVar.c();
        fVar.l(this.f569b);
        this.f569b = -1;
        this.f570c = fVar.h;
    }
}
