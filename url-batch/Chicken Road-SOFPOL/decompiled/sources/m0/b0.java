package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4878b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p6.a aVar) {
        super(aVar);
        v0 v0Var = v0.i;
        this.f4879c = v0Var;
    }

    @Override // m0.r1
    public final l.q a(Object obj) {
        switch (this.f4878b) {
            case 0:
                return new l.q(this, obj, obj == null, null, true);
            default:
                return new l.q(this, obj, obj == null, (n2) this.f4879c, true);
        }
    }

    @Override // m0.r1
    public w2 b() {
        switch (this.f4878b) {
            case 0:
                return (c0) this.f4879c;
            default:
                return super.b();
        }
    }

    public b0(p6.c cVar) {
        super(new c.e(18));
        this.f4879c = new c0(cVar);
    }
}
