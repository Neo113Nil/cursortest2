package N2;

import a0.C0239d;
import android.R;
import android.view.Menu;
import e2.InterfaceC0422a;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3611a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3612b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3613c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3614d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3615e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3616f;

    public g(t0.D d3) {
        C0239d c0239d = C0239d.f4723e;
        this.f3611a = d3;
        this.f3612b = c0239d;
        this.f3613c = null;
        this.f3614d = null;
        this.f3615e = null;
        this.f3616f = null;
    }

    public static void a(int i3, Menu menu) {
        int i4;
        int b3 = AbstractC0625j.b(i3);
        int b4 = AbstractC0625j.b(i3);
        if (b4 == 0) {
            i4 = R.string.copy;
        } else if (b4 == 1) {
            i4 = R.string.paste;
        } else if (b4 == 2) {
            i4 = R.string.cut;
        } else {
            if (b4 != 3) {
                throw new C1.c();
            }
            i4 = R.string.selectAll;
        }
        menu.add(0, b3, AbstractC0625j.b(i3), i4).setShowAsAction(1);
    }

    public static void b(Menu menu, int i3, InterfaceC0422a interfaceC0422a) {
        if (interfaceC0422a != null && menu.findItem(AbstractC0625j.b(i3)) == null) {
            a(i3, menu);
        } else {
            if (interfaceC0422a != null || menu.findItem(AbstractC0625j.b(i3)) == null) {
                return;
            }
            menu.removeItem(AbstractC0625j.b(i3));
        }
    }

    public g(J2.e eVar) {
        f2.j.f(eVar, "taskRunner");
        this.f3611a = eVar;
        this.f3616f = i.f3617a;
    }
}
