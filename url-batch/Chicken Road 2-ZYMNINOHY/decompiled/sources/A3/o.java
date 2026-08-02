package A3;

/* loaded from: classes.dex */
public final class o extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public p f116a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f117b;

    /* renamed from: c, reason: collision with root package name */
    public int f118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f119d;

    /* renamed from: e, reason: collision with root package name */
    public Object f120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, h3.c cVar) {
        super(cVar);
        this.f119d = pVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f117b = obj;
        this.f118c |= Integer.MIN_VALUE;
        return this.f119d.emit(null, this);
    }
}
