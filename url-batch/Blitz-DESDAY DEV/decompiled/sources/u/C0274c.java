package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.AbstractC0267e;
import s.C0268f;
import v.AbstractC0285h;
import v.C0291n;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274c {

    /* renamed from: b, reason: collision with root package name */
    public int f3636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3637c;
    public final C0275d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3638e;

    /* renamed from: f, reason: collision with root package name */
    public C0274c f3639f;
    public C0268f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3635a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3640g = 0;
    public int h = Integer.MIN_VALUE;

    public C0274c(C0275d c0275d, int i) {
        this.d = c0275d;
        this.f3638e = i;
    }

    public final void a(C0274c c0274c, int i) {
        b(c0274c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0274c c0274c, int i, int i2, boolean z2) {
        if (c0274c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0274c)) {
            return false;
        }
        this.f3639f = c0274c;
        if (c0274c.f3635a == null) {
            c0274c.f3635a = new HashSet();
        }
        HashSet hashSet = this.f3639f.f3635a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3640g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0291n c0291n) {
        HashSet hashSet = this.f3635a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0285h.b(((C0274c) it.next()).d, i, arrayList, c0291n);
            }
        }
    }

    public final int d() {
        if (this.f3637c) {
            return this.f3636b;
        }
        return 0;
    }

    public final int e() {
        C0274c c0274c;
        if (this.d.f3678g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0274c = this.f3639f) == null || c0274c.d.f3678g0 != 8) ? this.f3640g : i;
    }

    public final C0274c f() {
        int i = this.f3638e;
        int a2 = AbstractC0267e.a(i);
        C0275d c0275d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0275d.f3650K;
            case 2:
                return c0275d.f3651L;
            case 3:
                return c0275d.f3648I;
            case 4:
                return c0275d.f3649J;
            default:
                throw new AssertionError(X0.a.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3635a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0274c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3639f != null;
    }

    public final boolean i(C0274c c0274c) {
        if (c0274c == null) {
            return false;
        }
        int i = this.f3638e;
        C0275d c0275d = c0274c.d;
        int i2 = c0274c.f3638e;
        if (i2 == i) {
            return i != 6 || (c0275d.f3645E && this.d.f3645E);
        }
        switch (AbstractC0267e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0275d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0275d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(X0.a.i(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0274c c0274c = this.f3639f;
        if (c0274c != null && (hashSet = c0274c.f3635a) != null) {
            hashSet.remove(this);
            if (this.f3639f.f3635a.size() == 0) {
                this.f3639f.f3635a = null;
            }
        }
        this.f3635a = null;
        this.f3639f = null;
        this.f3640g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3637c = false;
        this.f3636b = 0;
    }

    public final void k() {
        C0268f c0268f = this.i;
        if (c0268f == null) {
            this.i = new C0268f(1);
        } else {
            c0268f.c();
        }
    }

    public final void l(int i) {
        this.f3636b = i;
        this.f3637c = true;
    }

    public final String toString() {
        return this.d.f3679h0 + ":" + X0.a.i(this.f3638e);
    }
}
