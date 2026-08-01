package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0273e;
import q.C0274f;
import t.AbstractC0291h;
import t.C0297n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280c {

    /* renamed from: b, reason: collision with root package name */
    public int f3598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3599c;
    public final C0281d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3600e;

    /* renamed from: f, reason: collision with root package name */
    public C0280c f3601f;
    public C0274f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3597a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3602g = 0;
    public int h = Integer.MIN_VALUE;

    public C0280c(C0281d c0281d, int i) {
        this.d = c0281d;
        this.f3600e = i;
    }

    public final void a(C0280c c0280c, int i) {
        b(c0280c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0280c c0280c, int i, int i2, boolean z2) {
        if (c0280c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0280c)) {
            return false;
        }
        this.f3601f = c0280c;
        if (c0280c.f3597a == null) {
            c0280c.f3597a = new HashSet();
        }
        HashSet hashSet = this.f3601f.f3597a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3602g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0297n c0297n) {
        HashSet hashSet = this.f3597a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0291h.b(((C0280c) it.next()).d, i, arrayList, c0297n);
            }
        }
    }

    public final int d() {
        if (this.f3599c) {
            return this.f3598b;
        }
        return 0;
    }

    public final int e() {
        C0280c c0280c;
        if (this.d.f3640g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0280c = this.f3601f) == null || c0280c.d.f3640g0 != 8) ? this.f3602g : i;
    }

    public final C0280c f() {
        int i = this.f3600e;
        int a2 = AbstractC0273e.a(i);
        C0281d c0281d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0281d.f3612K;
            case 2:
                return c0281d.f3613L;
            case 3:
                return c0281d.f3610I;
            case 4:
                return c0281d.f3611J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3597a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0280c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3601f != null;
    }

    public final boolean i(C0280c c0280c) {
        if (c0280c == null) {
            return false;
        }
        int i = this.f3600e;
        C0281d c0281d = c0280c.d;
        int i2 = c0280c.f3600e;
        if (i2 == i) {
            return i != 6 || (c0281d.f3607E && this.d.f3607E);
        }
        switch (AbstractC0273e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0281d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0281d instanceof h) {
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
        C0280c c0280c = this.f3601f;
        if (c0280c != null && (hashSet = c0280c.f3597a) != null) {
            hashSet.remove(this);
            if (this.f3601f.f3597a.size() == 0) {
                this.f3601f.f3597a = null;
            }
        }
        this.f3597a = null;
        this.f3601f = null;
        this.f3602g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3599c = false;
        this.f3598b = 0;
    }

    public final void k() {
        C0274f c0274f = this.i;
        if (c0274f == null) {
            this.i = new C0274f(1);
        } else {
            c0274f.c();
        }
    }

    public final void l(int i) {
        this.f3598b = i;
        this.f3599c = true;
    }

    public final String toString() {
        return this.d.f3641h0 + ":" + V.h(this.f3600e);
    }
}
