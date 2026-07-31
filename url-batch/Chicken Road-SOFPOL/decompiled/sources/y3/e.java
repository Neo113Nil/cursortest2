package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public int f8858h;

    @Override // p6.c
    public final Object i(Object obj) {
        e eVar = new e(1, (g6.c) obj);
        c6.m mVar = c6.m.f1757a;
        eVar.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f8858h;
        if (i == 0) {
            s6.a.K(obj);
            this.f8858h = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s6.a.K(obj);
        return c6.m.f1757a;
    }
}
