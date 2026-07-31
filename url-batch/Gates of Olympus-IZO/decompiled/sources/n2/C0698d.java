package n2;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698d extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l.q f6333e;

    /* renamed from: f, reason: collision with root package name */
    public int f6334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0698d(l.q qVar, P1.d dVar) {
        super(dVar);
        this.f6333e = qVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6332d = obj;
        this.f6334f |= Integer.MIN_VALUE;
        return this.f6333e.emit(null, this);
    }
}
