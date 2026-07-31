package r;

import java.util.List;
import r0.InterfaceC0827A;

/* renamed from: r.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817n implements InterfaceC0827A {

    /* renamed from: b, reason: collision with root package name */
    public static final C0817n f7073b = new C0817n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0817n f7074c = new C0817n(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7075a;

    public /* synthetic */ C0817n(int i3) {
        this.f7075a = i3;
    }

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        switch (this.f7075a) {
            case 0:
                return o3.Y(M0.a.j(j3), M0.a.i(j3), M1.v.f2804d, C0816m.f7069f);
            default:
                return o3.Y(M0.a.f(j3) ? M0.a.h(j3) : 0, M0.a.e(j3) ? M0.a.g(j3) : 0, M1.v.f2804d, C0816m.f7071h);
        }
    }
}
