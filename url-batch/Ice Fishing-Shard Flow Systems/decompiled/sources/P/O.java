package P;

/* loaded from: classes.dex */
public final class O extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.C f2006d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2007e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f2008i;

    /* renamed from: l, reason: collision with root package name */
    public int f2009l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q4, X5.c cVar) {
        super(cVar);
        this.f2008i = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2007e = obj;
        this.f2009l |= Integer.MIN_VALUE;
        return this.f2008i.j(null, false, this);
    }
}
