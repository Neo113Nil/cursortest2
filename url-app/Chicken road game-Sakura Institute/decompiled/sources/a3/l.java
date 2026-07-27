package a3;

/* loaded from: classes.dex */
public final class l extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public m f4966j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4967k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f4969m;

    /* renamed from: n, reason: collision with root package name */
    public int f4970n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, C2.a aVar) {
        super(aVar);
        this.f4969m = mVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f4968l = obj;
        this.f4970n |= Integer.MIN_VALUE;
        return this.f4969m.d(null, this);
    }
}
