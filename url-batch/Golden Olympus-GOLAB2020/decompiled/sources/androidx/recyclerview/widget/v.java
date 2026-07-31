package androidx.recyclerview.widget;

import android.view.View;
import com.ironsource.InterfaceC1490j3;

/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    final b f13178a;

    /* renamed from: b, reason: collision with root package name */
    a f13179b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f13180a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f13181b;

        /* renamed from: c, reason: collision with root package name */
        int f13182c;

        /* renamed from: d, reason: collision with root package name */
        int f13183d;

        /* renamed from: e, reason: collision with root package name */
        int f13184e;

        a() {
        }

        void a(int i4) {
            this.f13180a = i4 | this.f13180a;
        }

        boolean b() {
            int i4 = this.f13180a;
            if ((i4 & 7) != 0 && (i4 & c(this.f13183d, this.f13181b)) == 0) {
                return false;
            }
            int i5 = this.f13180a;
            if ((i5 & InterfaceC1490j3.d.b.f16818j) != 0 && (i5 & (c(this.f13183d, this.f13182c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f13180a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f13184e, this.f13181b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f13180a;
            return (i7 & 28672) == 0 || (i7 & (c(this.f13184e, this.f13182c) << 12)) != 0;
        }

        int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        void d() {
            this.f13180a = 0;
        }

        void e(int i4, int i5, int i6, int i7) {
            this.f13181b = i4;
            this.f13182c = i5;
            this.f13183d = i6;
            this.f13184e = i7;
        }
    }

    interface b {
        View a(int i4);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.f13178a = bVar;
    }

    View a(int i4, int i5, int i6, int i7) {
        int c4 = this.f13178a.c();
        int d4 = this.f13178a.d();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View a4 = this.f13178a.a(i4);
            this.f13179b.e(c4, d4, this.f13178a.b(a4), this.f13178a.e(a4));
            if (i6 != 0) {
                this.f13179b.d();
                this.f13179b.a(i6);
                if (this.f13179b.b()) {
                    return a4;
                }
            }
            if (i7 != 0) {
                this.f13179b.d();
                this.f13179b.a(i7);
                if (this.f13179b.b()) {
                    view = a4;
                }
            }
            i4 += i8;
        }
        return view;
    }

    boolean b(View view, int i4) {
        this.f13179b.e(this.f13178a.c(), this.f13178a.d(), this.f13178a.b(view), this.f13178a.e(view));
        if (i4 == 0) {
            return false;
        }
        this.f13179b.d();
        this.f13179b.a(i4);
        return this.f13179b.b();
    }
}
