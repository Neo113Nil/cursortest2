package d1;

import Y0.AbstractC0127v;

/* loaded from: classes.dex */
public final class q extends Q0.i implements P0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P0.l f2101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H0.i f2103h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(P0.l lVar, Object obj, H0.i iVar) {
        super(1);
        this.f2101f = lVar;
        this.f2102g = obj;
        this.f2103h = iVar;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        F0.b a2 = AbstractC0184a.a(this.f2101f, this.f2102g, null);
        if (a2 != null) {
            AbstractC0127v.d(this.f2103h, a2);
        }
        return F0.h.f469a;
    }
}
