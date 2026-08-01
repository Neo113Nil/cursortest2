package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0285e;
import q.C0286f;
import t.AbstractC0305h;
import t.C0311n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294c {

    /* renamed from: b, reason: collision with root package name */
    public int f3658b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3659c;
    public final C0295d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3660e;

    /* renamed from: f, reason: collision with root package name */
    public C0294c f3661f;
    public C0286f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3657a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3662g = 0;
    public int h = Integer.MIN_VALUE;

    public C0294c(C0295d c0295d, int i) {
        this.d = c0295d;
        this.f3660e = i;
    }

    public final void a(C0294c c0294c, int i) {
        b(c0294c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0294c c0294c, int i, int i2, boolean z2) {
        if (c0294c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0294c)) {
            return false;
        }
        this.f3661f = c0294c;
        if (c0294c.f3657a == null) {
            c0294c.f3657a = new HashSet();
        }
        HashSet hashSet = this.f3661f.f3657a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3662g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0311n c0311n) {
        HashSet hashSet = this.f3657a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0305h.b(((C0294c) it.next()).d, i, arrayList, c0311n);
            }
        }
    }

    public final int d() {
        if (this.f3659c) {
            return this.f3658b;
        }
        return 0;
    }

    public final int e() {
        C0294c c0294c;
        if (this.d.f3700g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0294c = this.f3661f) == null || c0294c.d.f3700g0 != 8) ? this.f3662g : i;
    }

    public final C0294c f() {
        int i = this.f3660e;
        int a2 = AbstractC0285e.a(i);
        C0295d c0295d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0295d.f3672K;
            case 2:
                return c0295d.f3673L;
            case 3:
                return c0295d.f3670I;
            case 4:
                return c0295d.f3671J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3657a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0294c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3661f != null;
    }

    public final boolean i(C0294c c0294c) {
        if (c0294c == null) {
            return false;
        }
        int i = this.f3660e;
        C0295d c0295d = c0294c.d;
        int i2 = c0294c.f3660e;
        if (i2 == i) {
            return i != 6 || (c0295d.f3667E && this.d.f3667E);
        }
        switch (AbstractC0285e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0295d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0295d instanceof h) {
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
        C0294c c0294c = this.f3661f;
        if (c0294c != null && (hashSet = c0294c.f3657a) != null) {
            hashSet.remove(this);
            if (this.f3661f.f3657a.size() == 0) {
                this.f3661f.f3657a = null;
            }
        }
        this.f3657a = null;
        this.f3661f = null;
        this.f3662g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3659c = false;
        this.f3658b = 0;
    }

    public final void k() {
        C0286f c0286f = this.i;
        if (c0286f == null) {
            this.i = new C0286f(1);
        } else {
            c0286f.c();
        }
    }

    public final void l(int i) {
        this.f3658b = i;
        this.f3659c = true;
    }

    public final String toString() {
        return this.d.f3701h0 + ":" + V.h(this.f3660e);
    }
}
