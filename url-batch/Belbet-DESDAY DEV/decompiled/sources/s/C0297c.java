package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0290e;
import q.C0291f;
import t.AbstractC0308h;
import t.C0314n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297c {

    /* renamed from: b, reason: collision with root package name */
    public int f3609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3610c;
    public final C0298d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3611e;

    /* renamed from: f, reason: collision with root package name */
    public C0297c f3612f;
    public C0291f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3608a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3613g = 0;
    public int h = Integer.MIN_VALUE;

    public C0297c(C0298d c0298d, int i) {
        this.d = c0298d;
        this.f3611e = i;
    }

    public final void a(C0297c c0297c, int i) {
        b(c0297c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0297c c0297c, int i, int i2, boolean z2) {
        if (c0297c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0297c)) {
            return false;
        }
        this.f3612f = c0297c;
        if (c0297c.f3608a == null) {
            c0297c.f3608a = new HashSet();
        }
        HashSet hashSet = this.f3612f.f3608a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3613g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0314n c0314n) {
        HashSet hashSet = this.f3608a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0308h.b(((C0297c) it.next()).d, i, arrayList, c0314n);
            }
        }
    }

    public final int d() {
        if (this.f3610c) {
            return this.f3609b;
        }
        return 0;
    }

    public final int e() {
        C0297c c0297c;
        if (this.d.f3651g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0297c = this.f3612f) == null || c0297c.d.f3651g0 != 8) ? this.f3613g : i;
    }

    public final C0297c f() {
        int i = this.f3611e;
        int a2 = AbstractC0290e.a(i);
        C0298d c0298d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0298d.f3623K;
            case 2:
                return c0298d.f3624L;
            case 3:
                return c0298d.f3621I;
            case 4:
                return c0298d.f3622J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3608a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0297c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3612f != null;
    }

    public final boolean i(C0297c c0297c) {
        if (c0297c == null) {
            return false;
        }
        int i = this.f3611e;
        C0298d c0298d = c0297c.d;
        int i2 = c0297c.f3611e;
        if (i2 == i) {
            return i != 6 || (c0298d.f3618E && this.d.f3618E);
        }
        switch (AbstractC0290e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0298d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0298d instanceof h) {
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
        C0297c c0297c = this.f3612f;
        if (c0297c != null && (hashSet = c0297c.f3608a) != null) {
            hashSet.remove(this);
            if (this.f3612f.f3608a.size() == 0) {
                this.f3612f.f3608a = null;
            }
        }
        this.f3608a = null;
        this.f3612f = null;
        this.f3613g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3610c = false;
        this.f3609b = 0;
    }

    public final void k() {
        C0291f c0291f = this.i;
        if (c0291f == null) {
            this.i = new C0291f(1);
        } else {
            c0291f.c();
        }
    }

    public final void l(int i) {
        this.f3609b = i;
        this.f3610c = true;
    }

    public final String toString() {
        return this.d.f3652h0 + ":" + V.h(this.f3611e);
    }
}
