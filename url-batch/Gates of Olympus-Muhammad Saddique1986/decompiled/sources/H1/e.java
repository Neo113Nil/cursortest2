package H1;

import B.Y;

/* loaded from: classes.dex */
public final class e extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public J1.a f2623g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y f2625i;

    /* renamed from: j, reason: collision with root package name */
    public int f2626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y y3, X1.c cVar) {
        super(cVar);
        this.f2625i = y3;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f2624h = obj;
        this.f2626j |= Integer.MIN_VALUE;
        return this.f2625i.u(null, this);
    }
}
