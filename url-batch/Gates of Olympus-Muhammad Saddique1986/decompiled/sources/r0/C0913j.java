package r0;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913j implements InterfaceC0884F {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8160d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0884F f8161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8162f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8163g;

    public /* synthetic */ C0913j(InterfaceC0884F interfaceC0884F, int i3, int i4, int i5) {
        this.f8160d = i5;
        this.f8161e = interfaceC0884F;
        this.f8162f = i3;
        this.f8163g = i4;
    }

    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        switch (this.f8160d) {
        }
        return this.f8161e.O(i3);
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        switch (this.f8160d) {
        }
        return this.f8161e.U(i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        switch (this.f8160d) {
        }
        return this.f8161e.V(i3);
    }

    @Override // r0.InterfaceC0884F
    public final AbstractC0893O b(long j3) {
        switch (this.f8160d) {
            case 0:
                int i3 = this.f8163g;
                int i4 = this.f8162f;
                InterfaceC0884F interfaceC0884F = this.f8161e;
                if (i3 == 1) {
                    return new C0914k(i4 == 2 ? interfaceC0884F.U(O0.a.g(j3)) : interfaceC0884F.O(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 0);
                }
                return new C0914k(O0.a.d(j3) ? O0.a.h(j3) : 32767, i4 == 2 ? interfaceC0884F.c(O0.a.h(j3)) : interfaceC0884F.V(O0.a.h(j3)), 0);
            case 1:
                int i5 = this.f8163g;
                int i6 = this.f8162f;
                InterfaceC0884F interfaceC0884F2 = this.f8161e;
                if (i5 == 1) {
                    return new C0914k(i6 == 2 ? interfaceC0884F2.U(O0.a.g(j3)) : interfaceC0884F2.O(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 1);
                }
                return new C0914k(O0.a.d(j3) ? O0.a.h(j3) : 32767, i6 == 2 ? interfaceC0884F2.c(O0.a.h(j3)) : interfaceC0884F2.V(O0.a.h(j3)), 1);
            default:
                int i7 = this.f8163g;
                int i8 = this.f8162f;
                InterfaceC0884F interfaceC0884F3 = this.f8161e;
                if (i7 == 1) {
                    return new C0914k(i8 == 2 ? interfaceC0884F3.U(O0.a.g(j3)) : interfaceC0884F3.O(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 2);
                }
                return new C0914k(O0.a.d(j3) ? O0.a.h(j3) : 32767, i8 == 2 ? interfaceC0884F3.c(O0.a.h(j3)) : interfaceC0884F3.V(O0.a.h(j3)), 2);
        }
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        switch (this.f8160d) {
        }
        return this.f8161e.c(i3);
    }

    @Override // r0.InterfaceC0884F
    public final Object t() {
        switch (this.f8160d) {
        }
        return this.f8161e.t();
    }
}
