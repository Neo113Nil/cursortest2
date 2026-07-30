package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t0.AbstractC5051n;
import u.AbstractC5088e;
import u.C5089f;
import x.AbstractC5191h;
import x.C5198o;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5143c {

    /* renamed from: b, reason: collision with root package name */
    public int f41407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41408c;

    /* renamed from: d, reason: collision with root package name */
    public final C5144d f41409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41410e;

    /* renamed from: f, reason: collision with root package name */
    public C5143c f41411f;
    public C5089f i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f41406a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f41412g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f41413h = Integer.MIN_VALUE;

    public C5143c(C5144d c5144d, int i) {
        this.f41409d = c5144d;
        this.f41410e = i;
    }

    public final void a(C5143c c5143c, int i) {
        b(c5143c, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C5143c c5143c, int i, int i4, boolean z8) {
        if (c5143c == null) {
            j();
            return true;
        }
        if (!z8 && !i(c5143c)) {
            return false;
        }
        this.f41411f = c5143c;
        if (c5143c.f41406a == null) {
            c5143c.f41406a = new HashSet();
        }
        HashSet hashSet = this.f41411f.f41406a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f41412g = i;
        this.f41413h = i4;
        return true;
    }

    public final void c(int i, ArrayList arrayList, C5198o c5198o) {
        HashSet hashSet = this.f41406a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC5191h.b(((C5143c) it.next()).f41409d, i, arrayList, c5198o);
            }
        }
    }

    public final int d() {
        if (this.f41408c) {
            return this.f41407b;
        }
        return 0;
    }

    public final int e() {
        C5143c c5143c;
        if (this.f41409d.f41451g0 == 8) {
            return 0;
        }
        int i = this.f41413h;
        return (i == Integer.MIN_VALUE || (c5143c = this.f41411f) == null || c5143c.f41409d.f41451g0 != 8) ? this.f41412g : i;
    }

    public final C5143c f() {
        int i = this.f41410e;
        int d2 = AbstractC5088e.d(i);
        C5144d c5144d = this.f41409d;
        switch (d2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c5144d.f41423K;
            case 2:
                return c5144d.f41424L;
            case 3:
                return c5144d.f41422I;
            case 4:
                return c5144d.J;
            default:
                throw new AssertionError(AbstractC5051n.l(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f41406a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C5143c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f41411f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(C5143c c5143c) {
        if (c5143c != null) {
            int i = this.f41410e;
            C5144d c5144d = c5143c.f41409d;
            int i4 = c5143c.f41410e;
            if (i4 != i) {
                switch (AbstractC5088e.d(i)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z8 = i4 == 2 || i4 == 4;
                        if (!(c5144d instanceof h)) {
                            return z8;
                        }
                        if (z8 || i4 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z9 = i4 == 3 || i4 == 5;
                        if (!(c5144d instanceof h)) {
                            return z9;
                        }
                        if (z9 || i4 == 9) {
                        }
                        break;
                    case 5:
                        if (i4 == 2 || i4 == 4) {
                        }
                        break;
                    case 6:
                        if (i4 == 6 || i4 == 8 || i4 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC5051n.l(i));
                }
            } else if (i != 6 || (c5144d.f41418E && this.f41409d.f41418E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        C5143c c5143c = this.f41411f;
        if (c5143c != null && (hashSet = c5143c.f41406a) != null) {
            hashSet.remove(this);
            if (this.f41411f.f41406a.size() == 0) {
                this.f41411f.f41406a = null;
            }
        }
        this.f41406a = null;
        this.f41411f = null;
        this.f41412g = 0;
        this.f41413h = Integer.MIN_VALUE;
        this.f41408c = false;
        this.f41407b = 0;
    }

    public final void k() {
        C5089f c5089f = this.i;
        if (c5089f == null) {
            this.i = new C5089f(1);
        } else {
            c5089f.c();
        }
    }

    public final void l(int i) {
        this.f41407b = i;
        this.f41408c = true;
    }

    public final String toString() {
        return this.f41409d.f41453h0 + ":" + AbstractC5051n.l(this.f41410e);
    }
}
