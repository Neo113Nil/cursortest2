package s;

import com.luckyarcade.spinthrow.GameConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0319e;
import q.C0320f;
import t.AbstractC0337h;
import t.C0343n;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326c {

    /* renamed from: b, reason: collision with root package name */
    public int f4003b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4004c;

    /* renamed from: d, reason: collision with root package name */
    public final C0327d f4005d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4006e;

    /* renamed from: f, reason: collision with root package name */
    public C0326c f4007f;
    public C0320f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f4002a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4008g = 0;
    public int h = Integer.MIN_VALUE;

    public C0326c(C0327d c0327d, int i) {
        this.f4005d = c0327d;
        this.f4006e = i;
    }

    public final void a(C0326c c0326c, int i) {
        b(c0326c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0326c c0326c, int i, int i2, boolean z2) {
        if (c0326c == null) {
            j();
            return true;
        }
        if (!z2 && !i(c0326c)) {
            return false;
        }
        this.f4007f = c0326c;
        if (c0326c.f4002a == null) {
            c0326c.f4002a = new HashSet();
        }
        HashSet hashSet = this.f4007f.f4002a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4008g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C0343n c0343n) {
        HashSet hashSet = this.f4002a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0337h.b(((C0326c) it.next()).f4005d, i, arrayList, c0343n);
            }
        }
    }

    public final int d() {
        if (this.f4004c) {
            return this.f4003b;
        }
        return 0;
    }

    public final int e() {
        C0326c c0326c;
        if (this.f4005d.f4047g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0326c = this.f4007f) == null || c0326c.f4005d.f4047g0 != 8) ? this.f4008g : i;
    }

    public final C0326c f() {
        int i = this.f4006e;
        int a2 = AbstractC0319e.a(i);
        C0327d c0327d = this.f4005d;
        switch (a2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c0327d.f4018K;
            case 2:
                return c0327d.f4019L;
            case GameConfig.COMBO_EVERY /* 3 */:
                return c0327d.f4016I;
            case 4:
                return c0327d.f4017J;
            default:
                throw new AssertionError(X0.e.h(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f4002a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0326c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f4007f != null;
    }

    public final boolean i(C0326c c0326c) {
        if (c0326c == null) {
            return false;
        }
        int i = this.f4006e;
        C0327d c0327d = c0326c.f4005d;
        int i2 = c0326c.f4006e;
        if (i2 == i) {
            return i != 6 || (c0327d.f4013E && this.f4005d.f4013E);
        }
        switch (AbstractC0319e.a(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case GameConfig.COMBO_EVERY /* 3 */:
                boolean z2 = i2 == 2 || i2 == 4;
                if (c0327d instanceof h) {
                    return z2 || i2 == 8;
                }
                return z2;
            case 2:
            case 4:
                boolean z3 = i2 == 3 || i2 == 5;
                if (c0327d instanceof h) {
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
        C0326c c0326c = this.f4007f;
        if (c0326c != null && (hashSet = c0326c.f4002a) != null) {
            hashSet.remove(this);
            if (this.f4007f.f4002a.size() == 0) {
                this.f4007f.f4002a = null;
            }
        }
        this.f4002a = null;
        this.f4007f = null;
        this.f4008g = 0;
        this.h = Integer.MIN_VALUE;
        this.f4004c = false;
        this.f4003b = 0;
    }

    public final void k() {
        C0320f c0320f = this.i;
        if (c0320f == null) {
            this.i = new C0320f(1);
        } else {
            c0320f.c();
        }
    }

    public final void l(int i) {
        this.f4003b = i;
        this.f4004c = true;
    }

    public final String toString() {
        return this.f4005d.f4048h0 + ":" + X0.e.h(this.f4006e);
    }
}
