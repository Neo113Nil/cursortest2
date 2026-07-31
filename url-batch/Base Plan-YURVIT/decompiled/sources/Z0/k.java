package Z0;

import B0.C0018t;

/* loaded from: classes.dex */
public final class k extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0018t f1103h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1104i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1105j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0018t f1106k;

    /* renamed from: l, reason: collision with root package name */
    public int f1107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0018t c0018t, I0.b bVar) {
        super(bVar);
        this.f1106k = c0018t;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f1105j = obj;
        this.f1107l |= Integer.MIN_VALUE;
        return this.f1106k.a(null, this);
    }
}
