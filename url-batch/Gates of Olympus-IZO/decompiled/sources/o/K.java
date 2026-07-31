package o;

/* loaded from: classes.dex */
public final class K extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public M f6446d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f6448f;

    /* renamed from: g, reason: collision with root package name */
    public int f6449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m3, R1.c cVar) {
        super(cVar);
        this.f6448f = m3;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6447e = obj;
        this.f6449g |= Integer.MIN_VALUE;
        return this.f6448f.b(this);
    }
}
