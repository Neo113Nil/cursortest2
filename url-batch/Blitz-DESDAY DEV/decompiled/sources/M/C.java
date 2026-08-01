package M;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public int f503a;

    /* renamed from: b, reason: collision with root package name */
    public int f504b;

    /* renamed from: c, reason: collision with root package name */
    public int f505c;
    public Object d;

    public C() {
        if (L0.e.f417b == null) {
            L0.e.f417b = new L0.e(11);
        }
    }

    public int a(int i) {
        if (i < this.f505c) {
            return ((ByteBuffer) this.d).getShort(this.f504b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f504b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f504b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f503a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c2 = Q.c(view);
            C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f523a : new C0001b(c2);
            if (c0001b == null) {
                c0001b = new C0001b();
            }
            Q.l(view, c0001b);
            view.setTag(this.f503a, obj);
            Q.g(view, this.f505c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
