package K;

/* renamed from: K.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070t extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public M f1413a;

    /* renamed from: b, reason: collision with root package name */
    public F3.d f1414b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1416d;

    /* renamed from: e, reason: collision with root package name */
    public int f1417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070t(M m4, h3.c cVar) {
        super(cVar);
        this.f1416d = m4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1415c = obj;
        this.f1417e |= Integer.MIN_VALUE;
        return M.b(this.f1416d, this);
    }
}
