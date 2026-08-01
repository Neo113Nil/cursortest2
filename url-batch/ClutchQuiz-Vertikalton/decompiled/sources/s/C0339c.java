package s;

import X.V;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0317e;
import q.C0318f;
import t.AbstractC0350h;
import t.C0357o;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339c {

    /* renamed from: b, reason: collision with root package name */
    public int f3492b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3493c;
    public final C0340d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3494e;

    /* renamed from: f, reason: collision with root package name */
    public C0339c f3495f;
    public C0318f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f3491a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f3496g = 0;
    public int h = Integer.MIN_VALUE;

    public C0339c(C0340d c0340d, int i) {
        this.d = c0340d;
        this.f3494e = i;
    }

    public final void a(C0339c c0339c, int i) {
        b(c0339c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0339c c0339c, int i, int i2, boolean z2) {
        if (c0339c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0339c)) {
            return false;
        }
        this.f3495f = c0339c;
        if (c0339c.f3491a == null) {
            c0339c.f3491a = new HashSet();
        }
        HashSet hashSet = this.f3495f.f3491a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f3496g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0357o c0357o) {
        HashSet hashSet = this.f3491a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0350h.b(((C0339c) it.next()).d, i, arrayList, c0357o);
            }
        }
    }

    public final int d() {
        if (this.f3493c) {
            return this.f3492b;
        }
        return 0;
    }

    public final int e() {
        C0339c c0339c;
        if (this.d.f3534g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0339c = this.f3495f) == null || c0339c.d.f3534g0 != 8) ? this.f3496g : i;
    }

    public final C0339c f() {
        int i = this.f3494e;
        int a2 = AbstractC0317e.a(i);
        C0340d c0340d = this.d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0340d.f3506K;
            case 2:
                return c0340d.f3507L;
            case 3:
                return c0340d.f3504I;
            case 4:
                return c0340d.f3505J;
            default:
                throw new AssertionError(V.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f3491a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0339c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f3495f != null;
    }

    public final boolean i(C0339c c0339c) {
        if (c0339c == null) {
            return false;
        }
        int i = this.f3494e;
        C0340d c0340d = c0339c.d;
        int i2 = c0339c.f3494e;
        if (i2 == i) {
            return i != 6 || (c0340d.f3501E && this.d.f3501E);
        }
        switch (AbstractC0317e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0340d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0340d instanceof h) {
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
        C0339c c0339c = this.f3495f;
        if (c0339c != null && (hashSet = c0339c.f3491a) != null) {
            hashSet.remove(this);
            if (this.f3495f.f3491a.size() == 0) {
                this.f3495f.f3491a = null;
            }
        }
        this.f3491a = null;
        this.f3495f = null;
        this.f3496g = 0;
        this.h = Integer.MIN_VALUE;
        this.f3493c = false;
        this.f3492b = 0;
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
        this.f3492b = i;
        this.f3493c = true;
    }

    public final String toString() {
        return this.d.f3535h0 + ":" + V.h(this.f3494e);
    }
}
