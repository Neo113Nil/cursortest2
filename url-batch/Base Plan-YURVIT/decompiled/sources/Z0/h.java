package Z0;

/* loaded from: classes.dex */
public final class h extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1090h;

    /* renamed from: i, reason: collision with root package name */
    public int f1091i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f1092j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1093k;

    /* renamed from: l, reason: collision with root package name */
    public e f1094l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, G0.d dVar) {
        super(dVar);
        this.f1092j = iVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1090h = obj;
        this.f1091i |= Integer.MIN_VALUE;
        return this.f1092j.m(null, this);
    }
}
