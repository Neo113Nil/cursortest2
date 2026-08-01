package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0285e;
import q.C0286f;
import t.AbstractC0303h;
import t.C0309n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292c {

    /* renamed from: b, reason: collision with root package name */
    public int f3520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3521c;
    public final C0293d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3522e;

    /* renamed from: f, reason: collision with root package name */
    public C0292c f3523f;
    public C0286f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3519a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3524g = 0;
    public int h = Integer.MIN_VALUE;

    public C0292c(C0293d c0293d, int i) {
        this.d = c0293d;
        this.f3522e = i;
    }

    public final void a(C0292c c0292c, int i) {
        b(c0292c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0292c c0292c, int i, int i2, boolean z2) {
        if (c0292c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0292c)) {
            return false;
        }
        this.f3523f = c0292c;
        if (c0292c.f3519a == null) {
            c0292c.f3519a = new HashSet();
        }
        HashSet hashSet = this.f3523f.f3519a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3524g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0309n c0309n) {
        HashSet hashSet = this.f3519a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0303h.b(((C0292c) it.next()).d, i, arrayList, c0309n);
            }
        }
    }

    public final int d() {
        if (this.f3521c) {
            return this.f3520b;
        }
        return 0;
    }

    public final int e() {
        C0292c c0292c;
        if (this.d.f3562g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0292c = this.f3523f) == null || c0292c.d.f3562g0 != 8) ? this.f3524g : i;
    }

    public final C0292c f() {
        int i = this.f3522e;
        int a2 = AbstractC0285e.a(i);
        C0293d c0293d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0293d.f3534K;
            case 2:
                return c0293d.f3535L;
            case 3:
                return c0293d.f3532I;
            case 4:
                return c0293d.f3533J;
            default:
                throw new AssertionError(T0.c.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3519a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0292c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3523f != null;
    }

    public final boolean i(C0292c c0292c) {
        if (c0292c == null) {
            return false;
        }
        int i = this.f3522e;
        C0293d c0293d = c0292c.d;
        int i2 = c0292c.f3522e;
        if (i2 == i) {
            return i != 6 || (c0293d.f3529E && this.d.f3529E);
        }
        switch (AbstractC0285e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0293d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0293d instanceof h) {
                    return z3 || i2 == 9;
                }
                return z3;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(T0.c.h(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0292c c0292c = this.f3523f;
        if (c0292c != null && (hashSet = c0292c.f3519a) != null) {
            hashSet.remove(this);
            if (this.f3523f.f3519a.size() == 0) {
                this.f3523f.f3519a = null;
            }
        }
        this.f3519a = null;
        this.f3523f = null;
        this.f3524g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3521c = false;
        this.f3520b = 0;
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
        this.f3520b = i;
        this.f3521c = true;
    }

    public final String toString() {
        return this.d.f3563h0 + ":" + T0.c.h(this.f3522e);
    }
}
