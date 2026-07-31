package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final b f13026a;

    /* renamed from: e, reason: collision with root package name */
    private View f13030e;

    /* renamed from: d, reason: collision with root package name */
    private int f13029d = 0;

    /* renamed from: b, reason: collision with root package name */
    final a f13027b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f13028c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f13031a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f13032b;

        a() {
        }

        private void c() {
            if (this.f13032b == null) {
                this.f13032b = new a();
            }
        }

        void a(int i4) {
            if (i4 < 64) {
                this.f13031a &= ~(1 << i4);
                return;
            }
            a aVar = this.f13032b;
            if (aVar != null) {
                aVar.a(i4 - 64);
            }
        }

        int b(int i4) {
            a aVar = this.f13032b;
            return aVar == null ? i4 >= 64 ? Long.bitCount(this.f13031a) : Long.bitCount(this.f13031a & ((1 << i4) - 1)) : i4 < 64 ? Long.bitCount(this.f13031a & ((1 << i4) - 1)) : aVar.b(i4 - 64) + Long.bitCount(this.f13031a);
        }

        boolean d(int i4) {
            if (i4 < 64) {
                return (this.f13031a & (1 << i4)) != 0;
            }
            c();
            return this.f13032b.d(i4 - 64);
        }

        void e(int i4, boolean z4) {
            if (i4 >= 64) {
                c();
                this.f13032b.e(i4 - 64, z4);
                return;
            }
            long j4 = this.f13031a;
            boolean z5 = (Long.MIN_VALUE & j4) != 0;
            long j5 = (1 << i4) - 1;
            this.f13031a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z4) {
                h(i4);
            } else {
                a(i4);
            }
            if (z5 || this.f13032b != null) {
                c();
                this.f13032b.e(0, z5);
            }
        }

        boolean f(int i4) {
            if (i4 >= 64) {
                c();
                return this.f13032b.f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f13031a;
            boolean z4 = (j5 & j4) != 0;
            long j6 = j5 & (~j4);
            this.f13031a = j6;
            long j7 = j4 - 1;
            this.f13031a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f13032b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f13032b.f(0);
            }
            return z4;
        }

        void g() {
            this.f13031a = 0L;
            a aVar = this.f13032b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i4) {
            if (i4 < 64) {
                this.f13031a |= 1 << i4;
            } else {
                c();
                this.f13032b.h(i4 - 64);
            }
        }

        public String toString() {
            if (this.f13032b == null) {
                return Long.toBinaryString(this.f13031a);
            }
            return this.f13032b.toString() + "xx" + Long.toBinaryString(this.f13031a);
        }
    }

    interface b {
        View a(int i4);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.E f(View view);

        void g(int i4);

        void h(View view);

        void i(View view, int i4);

        void j(int i4);

        void k(View view, int i4, ViewGroup.LayoutParams layoutParams);
    }

    f(b bVar) {
        this.f13026a = bVar;
    }

    private int h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int c4 = this.f13026a.c();
        int i5 = i4;
        while (i5 < c4) {
            int b4 = i4 - (i5 - this.f13027b.b(i5));
            if (b4 == 0) {
                while (this.f13027b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b4;
        }
        return -1;
    }

    private void l(View view) {
        this.f13028c.add(view);
        this.f13026a.b(view);
    }

    private boolean t(View view) {
        if (!this.f13028c.remove(view)) {
            return false;
        }
        this.f13026a.h(view);
        return true;
    }

    void a(View view, int i4, boolean z4) {
        int c4 = i4 < 0 ? this.f13026a.c() : h(i4);
        this.f13027b.e(c4, z4);
        if (z4) {
            l(view);
        }
        this.f13026a.i(view, c4);
    }

    void b(View view, boolean z4) {
        a(view, -1, z4);
    }

    void c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z4) {
        int c4 = i4 < 0 ? this.f13026a.c() : h(i4);
        this.f13027b.e(c4, z4);
        if (z4) {
            l(view);
        }
        this.f13026a.k(view, c4, layoutParams);
    }

    void d(int i4) {
        int h4 = h(i4);
        this.f13027b.f(h4);
        this.f13026a.g(h4);
    }

    View e(int i4) {
        int size = this.f13028c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f13028c.get(i5);
            RecyclerView.E f4 = this.f13026a.f(view);
            if (f4.getLayoutPosition() == i4 && !f4.isInvalid() && !f4.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i4) {
        return this.f13026a.a(h(i4));
    }

    int g() {
        return this.f13026a.c() - this.f13028c.size();
    }

    View i(int i4) {
        return this.f13026a.a(i4);
    }

    int j() {
        return this.f13026a.c();
    }

    void k(View view) {
        int e4 = this.f13026a.e(view);
        if (e4 >= 0) {
            this.f13027b.h(e4);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int e4 = this.f13026a.e(view);
        if (e4 == -1 || this.f13027b.d(e4)) {
            return -1;
        }
        return e4 - this.f13027b.b(e4);
    }

    boolean n(View view) {
        return this.f13028c.contains(view);
    }

    void o() {
        this.f13027b.g();
        for (int size = this.f13028c.size() - 1; size >= 0; size--) {
            this.f13026a.h((View) this.f13028c.get(size));
            this.f13028c.remove(size);
        }
        this.f13026a.d();
    }

    void p(View view) {
        int i4 = this.f13029d;
        if (i4 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i4 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f13029d = 1;
            this.f13030e = view;
            int e4 = this.f13026a.e(view);
            if (e4 >= 0) {
                if (this.f13027b.f(e4)) {
                    t(view);
                }
                this.f13026a.j(e4);
            }
            this.f13029d = 0;
            this.f13030e = null;
        } catch (Throwable th) {
            this.f13029d = 0;
            this.f13030e = null;
            throw th;
        }
    }

    void q(int i4) {
        int i5 = this.f13029d;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int h4 = h(i4);
            View a4 = this.f13026a.a(h4);
            if (a4 != null) {
                this.f13029d = 1;
                this.f13030e = a4;
                if (this.f13027b.f(h4)) {
                    t(a4);
                }
                this.f13026a.j(h4);
            }
            this.f13029d = 0;
            this.f13030e = null;
        } catch (Throwable th) {
            this.f13029d = 0;
            this.f13030e = null;
            throw th;
        }
    }

    boolean r(View view) {
        int i4 = this.f13029d;
        if (i4 == 1) {
            if (this.f13030e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i4 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f13029d = 2;
            int e4 = this.f13026a.e(view);
            if (e4 == -1) {
                t(view);
                return true;
            }
            if (!this.f13027b.d(e4)) {
                return false;
            }
            this.f13027b.f(e4);
            t(view);
            this.f13026a.j(e4);
            return true;
        } finally {
            this.f13029d = 0;
        }
    }

    void s(View view) {
        int e4 = this.f13026a.e(view);
        if (e4 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f13027b.d(e4)) {
            this.f13027b.a(e4);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f13027b.toString() + ", hidden list:" + this.f13028c.size();
    }
}
