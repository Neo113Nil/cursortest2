package U;

/* loaded from: classes.dex */
public final class b extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public c f4060j;

    /* renamed from: k, reason: collision with root package name */
    public Y2.c f4061k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f4063m;

    /* renamed from: n, reason: collision with root package name */
    public int f4064n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, E2.c cVar2) {
        super(cVar2);
        this.f4063m = cVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f4062l = obj;
        this.f4064n |= Integer.MIN_VALUE;
        return this.f4063m.c(this);
    }
}
