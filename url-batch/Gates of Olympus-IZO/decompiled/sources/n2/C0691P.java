package n2;

import k2.X;

/* renamed from: n2.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691P extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0692Q f6312d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0701g f6313e;

    /* renamed from: f, reason: collision with root package name */
    public C0693S f6314f;

    /* renamed from: g, reason: collision with root package name */
    public X f6315g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6316h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0692Q f6318j;

    /* renamed from: k, reason: collision with root package name */
    public int f6319k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691P(C0692Q c0692q, P1.d dVar) {
        super(dVar);
        this.f6318j = c0692q;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6317i = obj;
        this.f6319k |= Integer.MIN_VALUE;
        this.f6318j.collect(null, this);
        return Q1.a.f3113d;
    }
}
