package D1;

/* loaded from: classes.dex */
public final class B extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f517d;

    /* renamed from: e, reason: collision with root package name */
    public int f518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(z zVar, P1.d dVar) {
        super(dVar);
        this.f519f = zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f517d = obj;
        this.f518e |= Integer.MIN_VALUE;
        return this.f519f.emit(null, this);
    }
}
