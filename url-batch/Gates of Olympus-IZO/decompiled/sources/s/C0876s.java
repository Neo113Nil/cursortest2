package s;

import n.X;

/* renamed from: s.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876s extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0880w f7460d;

    /* renamed from: e, reason: collision with root package name */
    public X f7461e;

    /* renamed from: f, reason: collision with root package name */
    public Y1.e f7462f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0880w f7464h;

    /* renamed from: i, reason: collision with root package name */
    public int f7465i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0876s(C0880w c0880w, R1.c cVar) {
        super(cVar);
        this.f7464h = c0880w;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f7463g = obj;
        this.f7465i |= Integer.MIN_VALUE;
        return this.f7464h.e(null, null, this);
    }
}
