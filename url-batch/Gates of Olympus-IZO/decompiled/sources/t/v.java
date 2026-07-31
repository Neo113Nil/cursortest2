package t;

import n.X;

/* loaded from: classes.dex */
public final class v extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public y f7676d;

    /* renamed from: e, reason: collision with root package name */
    public X f7677e;

    /* renamed from: f, reason: collision with root package name */
    public Y1.e f7678f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f7680h;

    /* renamed from: i, reason: collision with root package name */
    public int f7681i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, R1.c cVar) {
        super(cVar);
        this.f7680h = yVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f7679g = obj;
        this.f7681i |= Integer.MIN_VALUE;
        return this.f7680h.e(null, null, this);
    }
}
