package l;

import e2.InterfaceC0424c;
import r0.AbstractC0892N;
import r0.AbstractC0893O;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584j extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0586l f6495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0893O f6496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584j(C0586l c0586l, AbstractC0893O abstractC0893O, long j3) {
        super(1);
        this.f6495e = c0586l;
        this.f6496f = abstractC0893O;
        this.f6497g = j3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        U.d dVar = this.f6495e.f6502b;
        AbstractC0893O abstractC0893O = this.f6496f;
        AbstractC0892N.e((AbstractC0892N) obj, abstractC0893O, dVar.a(O2.d.d(abstractC0893O.f8126d, abstractC0893O.f8127e), this.f6497g, O0.k.f3741d));
        return R1.y.f4171a;
    }
}
