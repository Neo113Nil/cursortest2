package e1;

/* renamed from: e1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357f extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public int f4693e;

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new C0357f(1, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4693e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f4693e = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        I2.l.Q(obj);
        return L1.z.f2729a;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        C0357f c0357f = (C0357f) create((P1.d) obj);
        L1.z zVar = L1.z.f2729a;
        c0357f.invokeSuspend(zVar);
        return zVar;
    }
}
