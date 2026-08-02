package K;

/* renamed from: K.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076z extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public M f1438a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f1439b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1440c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f1442e;

    /* renamed from: f, reason: collision with root package name */
    public int f1443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076z(M m4, h3.c cVar) {
        super(cVar);
        this.f1442e = m4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1441d = obj;
        this.f1443f |= Integer.MIN_VALUE;
        return M.e(this.f1442e, false, this);
    }
}
