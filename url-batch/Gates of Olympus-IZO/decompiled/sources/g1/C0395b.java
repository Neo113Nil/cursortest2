package g1;

import N2.z;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395b extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0396c f4797d;

    /* renamed from: e, reason: collision with root package name */
    public z f4798e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0396c f4800g;

    /* renamed from: h, reason: collision with root package name */
    public int f4801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0395b(C0396c c0396c, R1.c cVar) {
        super(cVar);
        this.f4800g = c0396c;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4799f = obj;
        this.f4801h |= Integer.MIN_VALUE;
        return C0396c.a(this.f4800g, this);
    }
}
