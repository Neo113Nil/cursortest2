package l;

import F.C0047j0;
import F.D0;
import I.InterfaceC0088c0;
import m.l0;
import r0.InterfaceC0840m;

/* renamed from: l.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567l implements InterfaceC0840m {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f5476a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0088c0 f5477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0568m f5478c;

    public C0567l(C0568m c0568m, l0 l0Var, InterfaceC0088c0 interfaceC0088c0) {
        this.f5478c = c0568m;
        this.f5476a = l0Var;
        this.f5477b = interfaceC0088c0;
    }

    @Override // r0.InterfaceC0840m
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        r0.H b2 = zVar.b(j3);
        C0568m c0568m = this.f5478c;
        long e3 = o3.B() ? I2.l.e(b2.f7114d, b2.f7115e) : ((M0.i) this.f5476a.a(new D0(c0568m, 13, this), new C0047j0(17, c0568m)).getValue()).f2774a;
        return o3.Y((int) (e3 >> 32), (int) (4294967295L & e3), M1.v.f2804d, new C0566k(c0568m, b2, e3));
    }
}
