package G;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class w extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f2059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2060g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j3, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f2058e = j3;
        this.f2059f = interfaceC0426e;
        this.f2060g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f2060g | 1);
        z.c(this.f2058e, this.f2059f, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
