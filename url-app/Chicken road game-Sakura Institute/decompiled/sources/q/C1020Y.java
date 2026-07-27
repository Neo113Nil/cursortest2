package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: q.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020Y extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public float f9225t;

    /* renamed from: u, reason: collision with root package name */
    public float f9226u;

    /* renamed from: v, reason: collision with root package name */
    public float f9227v;

    /* renamed from: w, reason: collision with root package name */
    public float f9228w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9229x;

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        int l4 = interfaceC0947H.l(this.f9227v) + interfaceC0947H.l(this.f9225t);
        int l5 = interfaceC0947H.l(this.f9228w) + interfaceC0947H.l(this.f9226u);
        AbstractC0954O a4 = interfaceC0944E.a(u3.d.Q(-l4, -l5, j4));
        t4 = interfaceC0947H.t(u3.d.s(j4, a4.f9005d + l4), u3.d.r(j4, a4.f9006e + l5), C1412P.c(), new P.h(this, a4, interfaceC0947H, 9));
        return t4;
    }
}
