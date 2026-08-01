package u;

import G1.AbstractC0001b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.AbstractC0380e;
import s.C0381f;
import v.AbstractC0399h;
import v.C0405n;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386c {

    /* renamed from: b, reason: collision with root package name */
    public int f4223b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4224c;

    /* renamed from: d, reason: collision with root package name */
    public final C0387d f4225d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public C0386c f4226f;
    public C0381f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f4222a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4227g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4228h = Integer.MIN_VALUE;

    public C0386c(C0387d c0387d, int i) {
        this.f4225d = c0387d;
        this.e = i;
    }

    public final void a(C0386c c0386c, int i) {
        b(c0386c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0386c c0386c, int i, int i2, boolean z2) {
        if (c0386c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0386c)) {
            return false;
        }
        this.f4226f = c0386c;
        if (c0386c.f4222a == null) {
            c0386c.f4222a = new HashSet();
        }
        HashSet hashSet = this.f4226f.f4222a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4227g = i;
        this.f4228h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0405n c0405n) {
        HashSet hashSet = this.f4222a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0399h.b(((C0386c) it.next()).f4225d, i, arrayList, c0405n);
            }
        }
    }

    public final int d() {
        if (this.f4224c) {
            return this.f4223b;
        }
        return 0;
    }

    public final int e() {
        C0386c c0386c;
        if (this.f4225d.f4266g0 == 8) {
            return 0;
        }
        int i = this.f4228h;
        return (i == Integer.MIN_VALUE || (c0386c = this.f4226f) == null || c0386c.f4225d.f4266g0 != 8) ? this.f4227g : i;
    }

    public final C0386c f() {
        int i = this.e;
        int a2 = AbstractC0380e.a(i);
        C0387d c0387d = this.f4225d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0387d.f4238K;
            case 2:
                return c0387d.f4239L;
            case 3:
                return c0387d.f4236I;
            case 4:
                return c0387d.f4237J;
            default:
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f4222a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0386c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f4226f != null;
    }

    public final boolean i(C0386c c0386c) {
        if (c0386c == null) {
            return false;
        }
        int i = this.e;
        C0387d c0387d = c0386c.f4225d;
        int i2 = c0386c.e;
        if (i2 == i) {
            return i != 6 || (c0387d.f4233E && this.f4225d.f4233E);
        }
        switch (AbstractC0380e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0387d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0387d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0001b.k(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0386c c0386c = this.f4226f;
        if (c0386c != null && (hashSet = c0386c.f4222a) != null) {
            hashSet.remove(this);
            if (this.f4226f.f4222a.size() == 0) {
                this.f4226f.f4222a = null;
            }
        }
        this.f4222a = null;
        this.f4226f = null;
        this.f4227g = 0;
        this.f4228h = Integer.MIN_VALUE;
        this.f4224c = false;
        this.f4223b = 0;
    }

    public final void k() {
        C0381f c0381f = this.i;
        if (c0381f == null) {
            this.i = new C0381f(1);
        } else {
            c0381f.c();
        }
    }

    public final void l(int i) {
        this.f4223b = i;
        this.f4224c = true;
    }

    public final String toString() {
        return this.f4225d.f4268h0 + ":" + AbstractC0001b.k(this.e);
    }
}
