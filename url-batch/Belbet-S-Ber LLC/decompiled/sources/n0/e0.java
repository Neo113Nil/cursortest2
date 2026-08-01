package n0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2771a;

    /* renamed from: b, reason: collision with root package name */
    public int f2772b;

    /* renamed from: c, reason: collision with root package name */
    public int f2773c;
    public Object d;

    public e0() {
        if (w0.c.f3778a == null) {
            w0.c.f3778a = new w0.c();
        }
    }

    public int a(int i) {
        if (i < this.f2773c) {
            return ((ByteBuffer) this.d).getShort(this.f2772b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2772b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2772b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f2771a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = p0.d(view);
            b bVar = d == null ? null : d instanceof a ? ((a) d).f2748a : new b(d);
            if (bVar == null) {
                bVar = new b();
            }
            p0.m(view, bVar);
            view.setTag(this.f2771a, obj);
            p0.h(view, this.f2773c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
