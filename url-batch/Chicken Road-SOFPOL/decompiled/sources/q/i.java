package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.l0[] f5846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f5847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u1.l0[] l0VarArr, j jVar, int i, int i8) {
        super(1);
        this.f5846e = l0VarArr;
        this.f5847f = jVar;
        this.f5848g = i;
        this.f5849h = i8;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        u1.k0 k0Var = (u1.k0) obj;
        for (u1.l0 l0Var : this.f5846e) {
            if (l0Var != null) {
                long a8 = this.f5847f.f5854a.f5887b.a((l0Var.f7230d << 32) | (l0Var.f7231e & 4294967295L), (this.f5848g << 32) | (this.f5849h & 4294967295L), r2.l.f6529d);
                u1.k0.g(k0Var, l0Var, (int) (a8 >> 32), (int) (a8 & 4294967295L));
            }
        }
        return c6.m.f1757a;
    }
}
