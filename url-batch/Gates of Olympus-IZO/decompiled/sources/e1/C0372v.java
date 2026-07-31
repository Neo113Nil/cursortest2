package e1;

/* renamed from: e1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372v extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4745d;

    /* renamed from: e, reason: collision with root package name */
    public int f4746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G1.o f4747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372v(G1.o oVar, P1.d dVar) {
        super(dVar);
        this.f4747f = oVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f4745d = obj;
        this.f4746e |= Integer.MIN_VALUE;
        return this.f4747f.emit(null, this);
    }
}
