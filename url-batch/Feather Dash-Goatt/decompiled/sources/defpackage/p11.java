package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p11 implements b9 {
    public final dn0 a = new dn0();
    public final mn0 b = new mn0();
    public final Object c;

    public p11(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.b9
    public final void a(int i, Object obj) {
        dn0 dn0Var = this.a;
        dn0Var.a(5);
        dn0Var.a(i);
        this.b.a(obj);
    }

    @Override // defpackage.b9
    public final void b(Object obj) {
        this.a.a(1);
        this.b.a(obj);
    }

    @Override // defpackage.b9
    public final void c() {
        this.a.a(8);
    }

    @Override // defpackage.b9
    public final void d(int i, Object obj) {
        dn0 dn0Var = this.a;
        dn0Var.a(6);
        dn0Var.a(i);
        this.b.a(obj);
    }

    @Override // defpackage.b9
    public final void f(int i, int i2, int i3) {
        dn0 dn0Var = this.a;
        dn0Var.a(3);
        dn0Var.a(i);
        dn0Var.a(i2);
        dn0Var.a(i3);
    }

    @Override // defpackage.b9
    public final Object g() {
        return this.c;
    }

    @Override // defpackage.b9
    public final void h(int i, int i2) {
        dn0 dn0Var = this.a;
        dn0Var.a(2);
        dn0Var.a(i);
        dn0Var.a(i2);
    }

    @Override // defpackage.b9
    public final void i() {
        this.a.a(0);
    }

    @Override // defpackage.b9
    public final void j(Object obj, Function2 function2) {
        this.a.a(7);
        mn0 mn0Var = this.b;
        mn0Var.a(function2);
        mn0Var.a(obj);
    }

    public final void k(mk1 mk1Var, i21 i21Var) {
        Exception exc;
        dn0 dn0Var = this.a;
        int i = dn0Var.b;
        mn0 mn0Var = new mn0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            mn0 mn0Var2 = this.b;
            if (i2 >= i) {
                if (i3 != mn0Var2.b) {
                    kl.a("Applier operation size mismatch");
                }
                mn0Var2.d();
                dn0Var.b = 0;
                mk1Var.e();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (dn0Var.c(i2)) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            mk1Var.i();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            mk1Var.b(mn0Var2.f(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            mk1Var.h(dn0Var.c(i4), dn0Var.c(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    mk1Var.f(dn0Var.c(i4), dn0Var.c(i7), dn0Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            mk1Var.k();
                            i2 = i4;
                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            mk1Var.a(dn0Var.c(i4), mn0Var2.f(i3));
                            i3 = i9;
                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                dn0Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object f = mn0Var2.f(i3);
                            f.getClass();
                            tj1.b(2, f);
                            i3 += 2;
                            mk1Var.j(mn0Var2.f(i11), (Function2) f);
                            i2 = i4;
                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                            Object obj = mk1Var.c;
                            if (obj instanceof mk) {
                                mk mkVar = (mk) obj;
                                if (i21Var.f.j(mkVar)) {
                                    mkVar.c();
                                }
                            }
                            mn0Var.a(obj);
                            mk1Var.c();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Throwable th) {
                    mk1Var.e();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new ok(mn0Var2, mn0Var, dn0Var, i2 - 1, exc);
        }
    }
}
