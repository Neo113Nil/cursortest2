package z0;

import D0.q;

/* loaded from: classes.dex */
public final class h extends X1.c {

    /* renamed from: g, reason: collision with root package name */
    public q f10537g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f10539i;

    /* renamed from: j, reason: collision with root package name */
    public int f10540j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, X1.c cVar) {
        super(cVar);
        this.f10539i = qVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        this.f10538h = obj;
        this.f10540j |= Integer.MIN_VALUE;
        return this.f10539i.b(0.0f, this);
    }
}
