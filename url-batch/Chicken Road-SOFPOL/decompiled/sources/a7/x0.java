package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x0 extends h {

    /* renamed from: l, reason: collision with root package name */
    public final m f319l;

    public x0(g6.c cVar, m mVar) {
        super(1, cVar);
        this.f319l = mVar;
    }

    @Override // a7.h
    public final Throwable r(a1 a1Var) {
        Throwable c8;
        m mVar = this.f319l;
        mVar.getClass();
        Object obj = a1.f240d.get(mVar);
        return (!(obj instanceof z0) || (c8 = ((z0) obj).c()) == null) ? obj instanceof o ? ((o) obj).f286a : a1Var.p() : c8;
    }

    @Override // a7.h
    public final String z() {
        return "AwaitContinuation";
    }
}
