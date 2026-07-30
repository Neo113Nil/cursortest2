package n1;

import m1.q;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends x0.b {

    /* renamed from: e, reason: collision with root package name */
    public q f939e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f941g;

    /* renamed from: h, reason: collision with root package name */
    public int f942h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, x0.b bVar2) {
        super(bVar2);
        this.f941g = bVar;
    }

    @Override // x0.b
    public final Object i(Object obj) {
        this.f940f = obj;
        this.f942h |= Integer.MIN_VALUE;
        return this.f941g.b(null, this);
    }
}
