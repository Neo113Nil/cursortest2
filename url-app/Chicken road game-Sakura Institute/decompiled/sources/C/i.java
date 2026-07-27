package C;

/* loaded from: classes.dex */
public final class i extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public p f1093j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f1095l;

    /* renamed from: m, reason: collision with root package name */
    public int f1096m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, E2.c cVar) {
        super(cVar);
        this.f1095l = pVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f1094k = obj;
        this.f1096m |= Integer.MIN_VALUE;
        return this.f1095l.a(this);
    }
}
