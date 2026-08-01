package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0288e;
import q.C0289f;
import t.AbstractC0306h;
import t.C0312n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295c {

    /* renamed from: b, reason: collision with root package name */
    public int f3544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3545c;
    public final C0296d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3546e;

    /* renamed from: f, reason: collision with root package name */
    public C0295c f3547f;
    public C0289f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3543a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3548g = 0;
    public int h = Integer.MIN_VALUE;

    public C0295c(C0296d c0296d, int i) {
        this.d = c0296d;
        this.f3546e = i;
    }

    public final void a(C0295c c0295c, int i) {
        b(c0295c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0295c c0295c, int i, int i2, boolean z2) {
        if (c0295c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0295c)) {
            return false;
        }
        this.f3547f = c0295c;
        if (c0295c.f3543a == null) {
            c0295c.f3543a = new HashSet();
        }
        HashSet hashSet = this.f3547f.f3543a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3548g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0312n c0312n) {
        HashSet hashSet = this.f3543a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0306h.b(((C0295c) it.next()).d, i, arrayList, c0312n);
            }
        }
    }

    public final int d() {
        if (this.f3545c) {
            return this.f3544b;
        }
        return 0;
    }

    public final int e() {
        C0295c c0295c;
        if (this.d.f3586g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0295c = this.f3547f) == null || c0295c.d.f3586g0 != 8) ? this.f3548g : i;
    }

    public final C0295c f() {
        int i = this.f3546e;
        int a2 = AbstractC0288e.a(i);
        C0296d c0296d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0296d.f3558K;
            case 2:
                return c0296d.f3559L;
            case 3:
                return c0296d.f3556I;
            case 4:
                return c0296d.f3557J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3543a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0295c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3547f != null;
    }

    public final boolean i(C0295c c0295c) {
        if (c0295c == null) {
            return false;
        }
        int i = this.f3546e;
        C0296d c0296d = c0295c.d;
        int i2 = c0295c.f3546e;
        if (i2 == i) {
            return i != 6 || (c0296d.f3553E && this.d.f3553E);
        }
        switch (AbstractC0288e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0296d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0296d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0295c c0295c = this.f3547f;
        if (c0295c != null && (hashSet = c0295c.f3543a) != null) {
            hashSet.remove(this);
            if (this.f3547f.f3543a.size() == 0) {
                this.f3547f.f3543a = null;
            }
        }
        this.f3543a = null;
        this.f3547f = null;
        this.f3548g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3545c = false;
        this.f3544b = 0;
    }

    public final void k() {
        C0289f c0289f = this.i;
        if (c0289f == null) {
            this.i = new C0289f(1);
        } else {
            c0289f.c();
        }
    }

    public final void l(int i) {
        this.f3544b = i;
        this.f3545c = true;
    }

    public final String toString() {
        return this.d.f3587h0 + ":" + V.h(this.f3546e);
    }
}
