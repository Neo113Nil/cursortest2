package o2;

import n.C0670z;

/* loaded from: classes.dex */
public final class l extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0670z f6718d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6719e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0670z f6721g;

    /* renamed from: h, reason: collision with root package name */
    public int f6722h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0670z c0670z, P1.d dVar) {
        super(dVar);
        this.f6721g = c0670z;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6720f = obj;
        this.f6722h |= Integer.MIN_VALUE;
        return this.f6721g.emit(null, this);
    }
}
