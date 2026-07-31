package D1;

/* loaded from: classes.dex */
public final class y extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f580d;

    /* renamed from: e, reason: collision with root package name */
    public int f581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, P1.d dVar) {
        super(dVar);
        this.f582f = zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f580d = obj;
        this.f581e |= Integer.MIN_VALUE;
        return this.f582f.emit(null, this);
    }
}
