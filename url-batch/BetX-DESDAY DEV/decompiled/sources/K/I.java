package K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public int f407a;

    /* renamed from: b, reason: collision with root package name */
    public int f408b;

    /* renamed from: c, reason: collision with root package name */
    public int f409c;

    /* renamed from: d, reason: collision with root package name */
    public Object f410d;

    public I() {
        if (H0.e.f255b == null) {
            H0.e.f255b = new H0.e(9);
        }
    }

    public int a(int i) {
        if (i < this.f409c) {
            return ((ByteBuffer) this.f410d).getShort(this.f408b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f408b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f408b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f407a);
            if (!((Class) this.f410d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate c2 = X.c(view);
            C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f425a : new C0002b(c2);
            if (c0002b == null) {
                c0002b = new C0002b();
            }
            X.l(view, c0002b);
            view.setTag(this.f407a, obj);
            X.g(view, this.f409c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
