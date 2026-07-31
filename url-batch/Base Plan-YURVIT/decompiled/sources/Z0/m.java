package Z0;

import B0.C0015p;

/* loaded from: classes.dex */
public final class m extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0015p f1112h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1113i;

    /* renamed from: j, reason: collision with root package name */
    public int f1114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0015p f1115k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0015p c0015p, I0.b bVar) {
        super(bVar);
        this.f1115k = c0015p;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1113i = obj;
        this.f1114j |= Integer.MIN_VALUE;
        return this.f1115k.a(null, this);
    }
}
