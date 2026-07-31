package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public int f8925h;
    public final /* synthetic */ y i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, g6.c cVar) {
        super(1, cVar);
        this.i = yVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        return new q(this.i, (g6.c) obj).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f8925h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
            return obj;
        }
        s6.a.K(obj);
        this.f8925h = 1;
        Object i8 = this.i.i(this);
        h6.a aVar = h6.a.f3204d;
        return i8 == aVar ? aVar : i8;
    }
}
