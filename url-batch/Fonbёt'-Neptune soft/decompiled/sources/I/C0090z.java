package I;

/* renamed from: I.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090z implements b1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f732f;

    public /* synthetic */ C0090z(int i2, Object obj) {
        this.f731e = i2;
        this.f732f = obj;
    }

    @Override // b1.e
    public final Object a(Object obj, H0.d dVar) {
        Object e2;
        switch (this.f731e) {
            case 0:
                P p2 = (P) this.f732f;
                boolean z2 = p2.f576l.m() instanceof b0;
                F0.h hVar = F0.h.f469a;
                return (z2 || (e2 = P.e(p2, true, dVar)) != I0.a.f733e) ? hVar : e2;
            case 1:
                ((a0.i) this.f732f).accept(obj);
                return F0.h.f469a;
            default:
                ((Q0.o) this.f732f).f983e = obj;
                throw new c1.a(this);
        }
    }
}
