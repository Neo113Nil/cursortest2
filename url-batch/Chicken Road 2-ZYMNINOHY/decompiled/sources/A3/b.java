package A3;

/* loaded from: classes.dex */
public final class b extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public z3.p f72a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f73b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f74c;

    /* renamed from: d, reason: collision with root package name */
    public int f75d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h3.c cVar2) {
        super(cVar2);
        this.f74c = cVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f73b = obj;
        this.f75d |= Integer.MIN_VALUE;
        return this.f74c.a(null, this);
    }
}
