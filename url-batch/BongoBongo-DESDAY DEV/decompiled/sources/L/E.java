package L;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f480a;

    /* renamed from: b, reason: collision with root package name */
    public int f481b;

    /* renamed from: c, reason: collision with root package name */
    public int f482c;
    public Object d;

    public E() {
        if (K0.e.f380b == null) {
            K0.e.f380b = new K0.e(12);
        }
    }

    public int a(int i) {
        if (i < this.f482c) {
            return ((ByteBuffer) this.d).getShort(this.f481b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f481b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f481b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f480a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c2 = T.c(view);
            C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f502a : new C0002b(c2);
            if (c0002b == null) {
                c0002b = new C0002b();
            }
            T.l(view, c0002b);
            view.setTag(this.f480a, obj);
            T.g(view, this.f482c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
