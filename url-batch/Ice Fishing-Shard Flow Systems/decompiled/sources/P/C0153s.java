package P;

/* renamed from: P.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153s extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2154d;

    /* renamed from: e, reason: collision with root package name */
    public int f2155e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0154t f2156i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153s(C0154t c0154t, V5.b bVar) {
        super(bVar);
        this.f2156i = c0154t;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2154d = obj;
        this.f2155e |= Integer.MIN_VALUE;
        return this.f2156i.a(null, this);
    }
}
