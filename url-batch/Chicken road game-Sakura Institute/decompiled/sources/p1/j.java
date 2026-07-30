package p1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7049f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f7050g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7051h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7052i;

    public /* synthetic */ j(e0 e0Var, int i7, int i8, int i9) {
        this.f7049f = i9;
        this.f7050g = e0Var;
        this.f7051h = i7;
        this.f7052i = i8;
    }

    @Override // p1.e0
    public final int a0(int i7) {
        switch (this.f7049f) {
        }
        return this.f7050g.a0(i7);
    }

    @Override // p1.e0
    public final n0 b(long j8) {
        switch (this.f7049f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i7 = this.f7052i;
                int i8 = this.f7051h;
                e0 e0Var = this.f7050g;
                if (i7 == 1) {
                    return new k(i8 == 2 ? e0Var.d0(m2.a.g(j8)) : e0Var.a0(m2.a.g(j8)), m2.a.c(j8) ? m2.a.g(j8) : 32767, 0);
                }
                return new k(m2.a.d(j8) ? m2.a.h(j8) : 32767, i8 == 2 ? e0Var.c(m2.a.h(j8)) : e0Var.e0(m2.a.h(j8)), 0);
            case 1:
                int i9 = this.f7052i;
                int i10 = this.f7051h;
                e0 e0Var2 = this.f7050g;
                if (i9 == 1) {
                    return new k(i10 == 2 ? e0Var2.d0(m2.a.g(j8)) : e0Var2.a0(m2.a.g(j8)), m2.a.c(j8) ? m2.a.g(j8) : 32767, 1);
                }
                return new k(m2.a.d(j8) ? m2.a.h(j8) : 32767, i10 == 2 ? e0Var2.c(m2.a.h(j8)) : e0Var2.e0(m2.a.h(j8)), 1);
            default:
                int i11 = this.f7052i;
                int i12 = this.f7051h;
                e0 e0Var3 = this.f7050g;
                if (i11 == 1) {
                    return new k(i12 == 2 ? e0Var3.d0(m2.a.g(j8)) : e0Var3.a0(m2.a.g(j8)), m2.a.c(j8) ? m2.a.g(j8) : 32767, 2);
                }
                return new k(m2.a.d(j8) ? m2.a.h(j8) : 32767, i12 == 2 ? e0Var3.c(m2.a.h(j8)) : e0Var3.e0(m2.a.h(j8)), 2);
        }
    }

    @Override // p1.e0
    public final int c(int i7) {
        switch (this.f7049f) {
        }
        return this.f7050g.c(i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        switch (this.f7049f) {
        }
        return this.f7050g.d0(i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        switch (this.f7049f) {
        }
        return this.f7050g.e0(i7);
    }

    @Override // p1.e0
    public final Object g() {
        switch (this.f7049f) {
        }
        return this.f7050g.g();
    }
}
