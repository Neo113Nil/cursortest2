package K;

/* renamed from: K.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060i extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public G1.c f1366a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G1.c f1368c;

    /* renamed from: d, reason: collision with root package name */
    public int f1369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0060i(G1.c cVar, h3.c cVar2) {
        super(cVar2);
        this.f1368c = cVar;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1367b = obj;
        this.f1369d |= Integer.MIN_VALUE;
        return this.f1368c.e(this);
    }
}
