package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public int f355a;

    /* renamed from: b, reason: collision with root package name */
    public int f356b;

    /* renamed from: c, reason: collision with root package name */
    public int f357c;
    public Object d;

    public D() {
        if (O0.e.f511b == null) {
            O0.e.f511b = new O0.e(11);
        }
    }

    public int a(int i) {
        if (i < this.f357c) {
            return ((ByteBuffer) this.d).getShort(this.f356b + i);
        }
        return 0;
    }

    public void b() {
        if (((W0.f) this.d).h != this.f357c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f355a;
            W0.f fVar = (W0.f) this.d;
            if (i >= fVar.f913f || fVar.f911c[i] >= 0) {
                return;
            } else {
                this.f355a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f356b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f356b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f355a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate c2 = S.c(view);
            C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f375a : new C0001b(c2);
            if (c0001b == null) {
                c0001b = new C0001b();
            }
            S.l(view, c0001b);
            view.setTag(this.f355a, obj);
            S.g(view, this.f357c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f355a < ((W0.f) this.d).f913f;
    }

    public void remove() {
        b();
        if (this.f356b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        W0.f fVar = (W0.f) this.d;
        fVar.c();
        fVar.l(this.f356b);
        this.f356b = -1;
        this.f357c = fVar.h;
    }
}
