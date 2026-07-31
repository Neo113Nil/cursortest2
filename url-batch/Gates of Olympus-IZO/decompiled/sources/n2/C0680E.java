package n2;

import k2.X;

/* renamed from: n2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680E extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0681F f6278d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0701g f6279e;

    /* renamed from: f, reason: collision with root package name */
    public C0683H f6280f;

    /* renamed from: g, reason: collision with root package name */
    public X f6281g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0681F f6283i;

    /* renamed from: j, reason: collision with root package name */
    public int f6284j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680E(C0681F c0681f, P1.d dVar) {
        super(dVar);
        this.f6283i = c0681f;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6282h = obj;
        this.f6284j |= Integer.MIN_VALUE;
        C0681F.k(this.f6283i, null, this);
        return Q1.a.f3113d;
    }
}
