package s0;

import u0.C0247g;

/* renamed from: s0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232k extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2903i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G.d f2904j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2905k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232k(G.d dVar, String str, w0.d dVar2) {
        super(2, dVar2);
        this.f2904j = dVar;
        this.f2905k = str;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0232k c0232k = new C0232k(this.f2904j, this.f2905k, dVar);
        c0232k.f2903i = obj;
        return c0232k;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        C0232k c0232k = (C0232k) b((G.b) obj, (w0.d) obj2);
        C0247g c0247g = C0247g.f3005a;
        c0232k.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        ((G.b) this.f2903i).d(this.f2904j, this.f2905k);
        return C0247g.f3005a;
    }
}
