package m;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591c extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0593d f5698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0591c(C0593d c0593d, Object obj, P1.d dVar) {
        super(1, dVar);
        this.f5698e = c0593d;
        this.f5699f = obj;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0591c(this.f5698e, this.f5699f, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        C0593d c0593d = this.f5698e;
        C0593d.b(c0593d);
        Object a3 = C0593d.a(c0593d, this.f5699f);
        c0593d.f5704c.f5803e.setValue(a3);
        c0593d.f5706e.setValue(a3);
        return L1.z.f2729a;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        C0591c c0591c = (C0591c) create((P1.d) obj);
        L1.z zVar = L1.z.f2729a;
        c0591c.invokeSuspend(zVar);
        return zVar;
    }
}
