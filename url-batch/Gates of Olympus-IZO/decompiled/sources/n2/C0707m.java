package n2;

/* renamed from: n2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707m extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public l.q f6358d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6359e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l.q f6361g;

    /* renamed from: h, reason: collision with root package name */
    public int f6362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0707m(l.q qVar, P1.d dVar) {
        super(dVar);
        this.f6361g = qVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6360f = obj;
        this.f6362h |= Integer.MIN_VALUE;
        return this.f6361g.emit(null, this);
    }
}
