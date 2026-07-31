package f1;

import java.util.Arrays;
import o2.a0;
import w0.m;
import w0.o;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f16121a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final a0 f16122b = new a0(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f16123c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f16124d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16125e;

    e() {
    }

    private int a(int i7) {
        int i8;
        int i9 = 0;
        this.f16124d = 0;
        do {
            int i10 = this.f16124d;
            int i11 = i7 + i10;
            f fVar = this.f16121a;
            if (i11 >= fVar.f16132g) {
                break;
            }
            int[] iArr = fVar.f16135j;
            this.f16124d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public f b() {
        return this.f16121a;
    }

    public a0 c() {
        return this.f16122b;
    }

    public boolean d(m mVar) {
        int i7;
        o2.a.f(mVar != null);
        if (this.f16125e) {
            this.f16125e = false;
            this.f16122b.K(0);
        }
        while (!this.f16125e) {
            if (this.f16123c < 0) {
                if (!this.f16121a.c(mVar) || !this.f16121a.a(mVar, true)) {
                    return false;
                }
                f fVar = this.f16121a;
                int i8 = fVar.f16133h;
                if ((fVar.f16127b & 1) == 1 && this.f16122b.f() == 0) {
                    i8 += a(0);
                    i7 = this.f16124d + 0;
                } else {
                    i7 = 0;
                }
                if (!o.e(mVar, i8)) {
                    return false;
                }
                this.f16123c = i7;
            }
            int a7 = a(this.f16123c);
            int i9 = this.f16123c + this.f16124d;
            if (a7 > 0) {
                a0 a0Var = this.f16122b;
                a0Var.c(a0Var.f() + a7);
                if (!o.d(mVar, this.f16122b.d(), this.f16122b.f(), a7)) {
                    return false;
                }
                a0 a0Var2 = this.f16122b;
                a0Var2.N(a0Var2.f() + a7);
                this.f16125e = this.f16121a.f16135j[i9 + (-1)] != 255;
            }
            if (i9 == this.f16121a.f16132g) {
                i9 = -1;
            }
            this.f16123c = i9;
        }
        return true;
    }

    public void e() {
        this.f16121a.b();
        this.f16122b.K(0);
        this.f16123c = -1;
        this.f16125e = false;
    }

    public void f() {
        if (this.f16122b.d().length == 65025) {
            return;
        }
        a0 a0Var = this.f16122b;
        a0Var.M(Arrays.copyOf(a0Var.d(), Math.max(65025, this.f16122b.f())), this.f16122b.f());
    }
}
