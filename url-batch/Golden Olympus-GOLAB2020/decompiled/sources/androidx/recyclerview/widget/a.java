package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class a implements o.a {

    /* renamed from: a, reason: collision with root package name */
    private A.e f12983a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f12984b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f12985c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0121a f12986d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f12987e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f12988f;

    /* renamed from: g, reason: collision with root package name */
    final o f12989g;

    /* renamed from: h, reason: collision with root package name */
    private int f12990h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0121a {
        void a(int i4, int i5);

        void b(b bVar);

        void c(int i4, int i5, Object obj);

        void d(b bVar);

        RecyclerView.E e(int i4);

        void f(int i4, int i5);

        void g(int i4, int i5);

        void h(int i4, int i5);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f12991a;

        /* renamed from: b, reason: collision with root package name */
        int f12992b;

        /* renamed from: c, reason: collision with root package name */
        Object f12993c;

        /* renamed from: d, reason: collision with root package name */
        int f12994d;

        b(int i4, int i5, int i6, Object obj) {
            this.f12991a = i4;
            this.f12992b = i5;
            this.f12994d = i6;
            this.f12993c = obj;
        }

        String a() {
            int i4 = this.f12991a;
            return i4 != 1 ? i4 != 2 ? i4 != 4 ? i4 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f12991a;
            if (i4 != bVar.f12991a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f12994d - this.f12992b) == 1 && this.f12994d == bVar.f12992b && this.f12992b == bVar.f12994d) {
                return true;
            }
            if (this.f12994d != bVar.f12994d || this.f12992b != bVar.f12992b) {
                return false;
            }
            Object obj2 = this.f12993c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f12993c)) {
                    return false;
                }
            } else if (bVar.f12993c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f12991a * 31) + this.f12992b) * 31) + this.f12994d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + b9.i.f15550d + a() + ",s:" + this.f12992b + "c:" + this.f12994d + ",p:" + this.f12993c + b9.i.f15552e;
        }
    }

    a(InterfaceC0121a interfaceC0121a) {
        this(interfaceC0121a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z4;
        char c4;
        int i4 = bVar.f12992b;
        int i5 = bVar.f12994d + i4;
        char c5 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f12986d.e(i6) != null || h(i6)) {
                if (c5 == 0) {
                    k(b(2, i4, i7, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c4 = 1;
            } else {
                if (c5 == 1) {
                    v(b(2, i4, i7, null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c4 = 0;
            }
            if (z4) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c5 = c4;
        }
        if (i7 != bVar.f12994d) {
            a(bVar);
            bVar = b(2, i4, i7, null);
        }
        if (c5 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i4 = bVar.f12992b;
        int i5 = bVar.f12994d + i4;
        int i6 = 0;
        boolean z4 = -1;
        int i7 = i4;
        while (i4 < i5) {
            if (this.f12986d.e(i4) != null || h(i4)) {
                if (!z4) {
                    k(b(4, i7, i6, bVar.f12993c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = true;
            } else {
                if (z4) {
                    v(b(4, i7, i6, bVar.f12993c));
                    i7 = i4;
                    i6 = 0;
                }
                z4 = false;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f12994d) {
            Object obj = bVar.f12993c;
            a(bVar);
            bVar = b(4, i7, i6, obj);
        }
        if (z4) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i4) {
        int size = this.f12985c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f12985c.get(i5);
            int i6 = bVar.f12991a;
            if (i6 == 8) {
                if (n(bVar.f12994d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f12992b;
                int i8 = bVar.f12994d + i7;
                while (i7 < i8) {
                    if (n(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i4;
        int i5 = bVar.f12991a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z4 = z(bVar.f12992b, i5);
        int i6 = bVar.f12992b;
        int i7 = bVar.f12991a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f12994d; i9++) {
            int z5 = z(bVar.f12992b + (i4 * i9), bVar.f12991a);
            int i10 = bVar.f12991a;
            if (i10 == 2 ? z5 != z4 : !(i10 == 4 && z5 == z4 + 1)) {
                b b4 = b(i10, z4, i8, bVar.f12993c);
                l(b4, i6);
                a(b4);
                if (bVar.f12991a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                z4 = z5;
            } else {
                i8++;
            }
        }
        Object obj = bVar.f12993c;
        a(bVar);
        if (i8 > 0) {
            b b5 = b(bVar.f12991a, z4, i8, obj);
            l(b5, i6);
            a(b5);
        }
    }

    private void v(b bVar) {
        this.f12985c.add(bVar);
        int i4 = bVar.f12991a;
        if (i4 == 1) {
            this.f12986d.g(bVar.f12992b, bVar.f12994d);
            return;
        }
        if (i4 == 2) {
            this.f12986d.f(bVar.f12992b, bVar.f12994d);
            return;
        }
        if (i4 == 4) {
            this.f12986d.c(bVar.f12992b, bVar.f12994d, bVar.f12993c);
        } else {
            if (i4 == 8) {
                this.f12986d.a(bVar.f12992b, bVar.f12994d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f12985c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f12985c.get(size);
            int i8 = bVar.f12991a;
            if (i8 == 8) {
                int i9 = bVar.f12992b;
                int i10 = bVar.f12994d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            bVar.f12992b = i9 + 1;
                            bVar.f12994d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f12992b = i9 - 1;
                            bVar.f12994d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        bVar.f12994d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f12994d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f12992b = i9 + 1;
                    } else if (i5 == 2) {
                        bVar.f12992b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = bVar.f12992b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f12994d;
                    } else if (i8 == 2) {
                        i4 += bVar.f12994d;
                    }
                } else if (i5 == 1) {
                    bVar.f12992b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f12992b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f12985c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f12985c.get(size2);
            if (bVar2.f12991a == 8) {
                int i12 = bVar2.f12994d;
                if (i12 == bVar2.f12992b || i12 < 0) {
                    this.f12985c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f12994d <= 0) {
                this.f12985c.remove(size2);
                a(bVar2);
            }
        }
        return i4;
    }

    @Override // androidx.recyclerview.widget.o.a
    public void a(b bVar) {
        if (this.f12988f) {
            return;
        }
        bVar.f12993c = null;
        this.f12983a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.o.a
    public b b(int i4, int i5, int i6, Object obj) {
        b bVar = (b) this.f12983a.b();
        if (bVar == null) {
            return new b(i4, i5, i6, obj);
        }
        bVar.f12991a = i4;
        bVar.f12992b = i5;
        bVar.f12994d = i6;
        bVar.f12993c = obj;
        return bVar;
    }

    public int e(int i4) {
        int size = this.f12984b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f12984b.get(i5);
            int i6 = bVar.f12991a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = bVar.f12992b;
                    if (i7 <= i4) {
                        int i8 = bVar.f12994d;
                        if (i7 + i8 > i4) {
                            return -1;
                        }
                        i4 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = bVar.f12992b;
                    if (i9 == i4) {
                        i4 = bVar.f12994d;
                    } else {
                        if (i9 < i4) {
                            i4--;
                        }
                        if (bVar.f12994d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (bVar.f12992b <= i4) {
                i4 += bVar.f12994d;
            }
        }
        return i4;
    }

    void i() {
        int size = this.f12985c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f12986d.d((b) this.f12985c.get(i4));
        }
        x(this.f12985c);
        this.f12990h = 0;
    }

    void j() {
        i();
        int size = this.f12984b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f12984b.get(i4);
            int i5 = bVar.f12991a;
            if (i5 == 1) {
                this.f12986d.d(bVar);
                this.f12986d.g(bVar.f12992b, bVar.f12994d);
            } else if (i5 == 2) {
                this.f12986d.d(bVar);
                this.f12986d.h(bVar.f12992b, bVar.f12994d);
            } else if (i5 == 4) {
                this.f12986d.d(bVar);
                this.f12986d.c(bVar.f12992b, bVar.f12994d, bVar.f12993c);
            } else if (i5 == 8) {
                this.f12986d.d(bVar);
                this.f12986d.a(bVar.f12992b, bVar.f12994d);
            }
            Runnable runnable = this.f12987e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f12984b);
        this.f12990h = 0;
    }

    void l(b bVar, int i4) {
        this.f12986d.b(bVar);
        int i5 = bVar.f12991a;
        if (i5 == 2) {
            this.f12986d.h(i4, bVar.f12994d);
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f12986d.c(i4, bVar.f12994d, bVar.f12993c);
        }
    }

    int m(int i4) {
        return n(i4, 0);
    }

    int n(int i4, int i5) {
        int size = this.f12985c.size();
        while (i5 < size) {
            b bVar = (b) this.f12985c.get(i5);
            int i6 = bVar.f12991a;
            if (i6 == 8) {
                int i7 = bVar.f12992b;
                if (i7 == i4) {
                    i4 = bVar.f12994d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f12994d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f12992b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f12994d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f12994d;
                }
            }
            i5++;
        }
        return i4;
    }

    boolean o(int i4) {
        return (i4 & this.f12990h) != 0;
    }

    boolean p() {
        return this.f12984b.size() > 0;
    }

    boolean q() {
        return (this.f12985c.isEmpty() || this.f12984b.isEmpty()) ? false : true;
    }

    boolean r(int i4, int i5, Object obj) {
        if (i5 < 1) {
            return false;
        }
        this.f12984b.add(b(4, i4, i5, obj));
        this.f12990h |= 4;
        return this.f12984b.size() == 1;
    }

    boolean s(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f12984b.add(b(1, i4, i5, null));
        this.f12990h |= 1;
        return this.f12984b.size() == 1;
    }

    boolean t(int i4, int i5, int i6) {
        if (i4 == i5) {
            return false;
        }
        if (i6 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f12984b.add(b(8, i4, i5, null));
        this.f12990h |= 8;
        return this.f12984b.size() == 1;
    }

    boolean u(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f12984b.add(b(2, i4, i5, null));
        this.f12990h |= 2;
        return this.f12984b.size() == 1;
    }

    void w() {
        this.f12989g.b(this.f12984b);
        int size = this.f12984b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f12984b.get(i4);
            int i5 = bVar.f12991a;
            if (i5 == 1) {
                c(bVar);
            } else if (i5 == 2) {
                f(bVar);
            } else if (i5 == 4) {
                g(bVar);
            } else if (i5 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f12987e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f12984b.clear();
    }

    void x(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((b) list.get(i4));
        }
        list.clear();
    }

    void y() {
        x(this.f12984b);
        x(this.f12985c);
        this.f12990h = 0;
    }

    a(InterfaceC0121a interfaceC0121a, boolean z4) {
        this.f12983a = new A.f(30);
        this.f12984b = new ArrayList();
        this.f12985c = new ArrayList();
        this.f12990h = 0;
        this.f12986d = interfaceC0121a;
        this.f12988f = z4;
        this.f12989g = new o(this);
    }
}
