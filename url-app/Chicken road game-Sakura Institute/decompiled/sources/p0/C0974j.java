package p0;

/* renamed from: p0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974j implements InterfaceC0944E {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9044d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0944E f9045e;

    /* renamed from: i, reason: collision with root package name */
    public final int f9046i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9047j;

    public /* synthetic */ C0974j(InterfaceC0944E interfaceC0944E, int i2, int i4, int i5) {
        this.f9044d = i5;
        this.f9045e = interfaceC0944E;
        this.f9046i = i2;
        this.f9047j = i4;
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        switch (this.f9044d) {
        }
        return this.f9045e.S(i2);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        switch (this.f9044d) {
        }
        return this.f9045e.X(i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        switch (this.f9044d) {
        }
        return this.f9045e.Z(i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        switch (this.f9044d) {
            case 0:
                int i2 = this.f9047j;
                int i4 = this.f9046i;
                InterfaceC0944E interfaceC0944E = this.f9045e;
                if (i2 == 1) {
                    return new C0975k(i4 == 2 ? interfaceC0944E.X(M0.a.h(j4)) : interfaceC0944E.S(M0.a.h(j4)), M0.a.d(j4) ? M0.a.h(j4) : 32767, 0);
                }
                return new C0975k(M0.a.e(j4) ? M0.a.i(j4) : 32767, i4 == 2 ? interfaceC0944E.b(M0.a.i(j4)) : interfaceC0944E.Z(M0.a.i(j4)), 0);
            case 1:
                int i5 = this.f9047j;
                int i6 = this.f9046i;
                InterfaceC0944E interfaceC0944E2 = this.f9045e;
                if (i5 == 1) {
                    return new C0975k(i6 == 2 ? interfaceC0944E2.X(M0.a.h(j4)) : interfaceC0944E2.S(M0.a.h(j4)), M0.a.d(j4) ? M0.a.h(j4) : 32767, 1);
                }
                return new C0975k(M0.a.e(j4) ? M0.a.i(j4) : 32767, i6 == 2 ? interfaceC0944E2.b(M0.a.i(j4)) : interfaceC0944E2.Z(M0.a.i(j4)), 1);
            default:
                int i7 = this.f9047j;
                int i8 = this.f9046i;
                InterfaceC0944E interfaceC0944E3 = this.f9045e;
                if (i7 == 1) {
                    return new C0975k(i8 == 2 ? interfaceC0944E3.X(M0.a.h(j4)) : interfaceC0944E3.S(M0.a.h(j4)), M0.a.d(j4) ? M0.a.h(j4) : 32767, 2);
                }
                return new C0975k(M0.a.e(j4) ? M0.a.i(j4) : 32767, i8 == 2 ? interfaceC0944E3.b(M0.a.i(j4)) : interfaceC0944E3.Z(M0.a.i(j4)), 2);
        }
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        switch (this.f9044d) {
        }
        return this.f9045e.b(i2);
    }

    @Override // p0.InterfaceC0944E
    public final Object r() {
        switch (this.f9044d) {
        }
        return this.f9045e.r();
    }
}
