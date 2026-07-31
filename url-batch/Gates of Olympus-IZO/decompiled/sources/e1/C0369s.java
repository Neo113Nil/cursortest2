package e1;

import k2.C0542n;

/* renamed from: e1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369s extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f4736d;

    /* renamed from: e, reason: collision with root package name */
    public C0351N f4737e;

    /* renamed from: f, reason: collision with root package name */
    public C0542n f4738f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0351N f4740h;

    /* renamed from: i, reason: collision with root package name */
    public int f4741i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369s(C0351N c0351n, R1.c cVar) {
        super(cVar);
        this.f4740h = c0351n;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4739g = obj;
        this.f4741i |= Integer.MIN_VALUE;
        return C0351N.a(this.f4740h, null, this);
    }
}
