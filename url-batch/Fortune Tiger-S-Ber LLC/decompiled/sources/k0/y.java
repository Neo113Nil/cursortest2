package k0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public int f2793a;

    /* renamed from: b, reason: collision with root package name */
    public int f2794b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2795d;

    public y() {
        if (g2.f.g == null) {
            g2.f.g = new g2.f(22);
        }
    }

    public int a(int i4) {
        if (i4 < this.c) {
            return ((ByteBuffer) this.f2795d).getShort(this.f2794b + i4);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2794b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2794b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f2793a);
            if (!((Class) this.f2795d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d4 = j0.d(view);
            b bVar = d4 == null ? null : d4 instanceof a ? ((a) d4).f2711a : new b(d4);
            if (bVar == null) {
                bVar = new b();
            }
            j0.m(view, bVar);
            view.setTag(this.f2793a, obj);
            j0.h(view, this.c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
