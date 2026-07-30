package q6;

import y4.C1046o;

/* loaded from: classes.dex */
public final class n extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public C1046o f7397d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7398e;

    /* renamed from: i, reason: collision with root package name */
    public int f7399i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1046o f7400l;

    /* renamed from: m, reason: collision with root package name */
    public Object f7401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1046o c1046o, V5.b bVar) {
        super(bVar);
        this.f7400l = c1046o;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7398e = obj;
        this.f7399i |= Integer.MIN_VALUE;
        return this.f7400l.a(null, this);
    }
}
