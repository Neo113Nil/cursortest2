package n0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2710a;

    /* renamed from: b, reason: collision with root package name */
    public int f2711b;

    /* renamed from: c, reason: collision with root package name */
    public int f2712c;
    public Object d;

    public a0() {
        if (l2.f.f2578g == null) {
            l2.f.f2578g = new l2.f(28);
        }
    }

    public int a(int i) {
        if (i < this.f2712c) {
            return ((ByteBuffer) this.d).getShort(this.f2711b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f2711b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f2711b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f2710a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = l0.d(view);
            b bVar = d == null ? null : d instanceof a ? ((a) d).f2709a : new b(d);
            if (bVar == null) {
                bVar = new b();
            }
            l0.m(view, bVar);
            view.setTag(this.f2710a, obj);
            l0.h(view, this.f2712c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
