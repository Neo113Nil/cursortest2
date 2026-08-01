package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0317e;
import q.C0318f;
import t.AbstractC0335h;
import t.C0341n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324c {

    /* renamed from: b, reason: collision with root package name */
    public int f3999b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4000c;

    /* renamed from: d, reason: collision with root package name */
    public final C0325d f4001d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4002e;

    /* renamed from: f, reason: collision with root package name */
    public C0324c f4003f;
    public C0318f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3998a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4004g = 0;
    public int h = Integer.MIN_VALUE;

    public C0324c(C0325d c0325d, int i) {
        this.f4001d = c0325d;
        this.f4002e = i;
    }

    public final void a(C0324c c0324c, int i) {
        b(c0324c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0324c c0324c, int i, int i2, boolean z2) {
        if (c0324c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0324c)) {
            return false;
        }
        this.f4003f = c0324c;
        if (c0324c.f3998a == null) {
            c0324c.f3998a = new HashSet();
        }
        HashSet hashSet = this.f4003f.f3998a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4004g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0341n c0341n) {
        HashSet hashSet = this.f3998a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0335h.b(((C0324c) it.next()).f4001d, i, arrayList, c0341n);
            }
        }
    }

    public final int d() {
        if (this.f4000c) {
            return this.f3999b;
        }
        return 0;
    }

    public final int e() {
        C0324c c0324c;
        if (this.f4001d.f4043g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0324c = this.f4003f) == null || c0324c.f4001d.f4043g0 != 8) ? this.f4004g : i;
    }

    public final C0324c f() {
        int i = this.f4002e;
        int a2 = AbstractC0317e.a(i);
        C0325d c0325d = this.f4001d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0325d.f4014K;
            case 2:
                return c0325d.f4015L;
            case 3:
                return c0325d.f4012I;
            case 4:
                return c0325d.f4013J;
            default:
                throw new AssertionError(X0.e.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3998a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0324c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f4003f != null;
    }

    public final boolean i(C0324c c0324c) {
        if (c0324c == null) {
            return false;
        }
        int i = this.f4002e;
        C0325d c0325d = c0324c.f4001d;
        int i2 = c0324c.f4002e;
        if (i2 == i) {
            return i != 6 || (c0325d.f4009E && this.f4001d.f4009E);
        }
        switch (AbstractC0317e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0325d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0325d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(X0.e.h(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0324c c0324c = this.f4003f;
        if (c0324c != null && (hashSet = c0324c.f3998a) != null) {
            hashSet.remove(this);
            if (this.f4003f.f3998a.size() == 0) {
                this.f4003f.f3998a = null;
            }
        }
        this.f3998a = null;
        this.f4003f = null;
        this.f4004g = 0;
        this.h = Integer.MIN_VALUE;
        this.f4000c = false;
        this.f3999b = 0;
    }

    public final void k() {
        C0318f c0318f = this.i;
        if (c0318f == null) {
            this.i = new C0318f(1);
        } else {
            c0318f.c();
        }
    }

    public final void l(int i) {
        this.f3999b = i;
        this.f4000c = true;
    }

    public final String toString() {
        return this.f4001d.f4044h0 + ":" + X0.e.h(this.f4002e);
    }
}
