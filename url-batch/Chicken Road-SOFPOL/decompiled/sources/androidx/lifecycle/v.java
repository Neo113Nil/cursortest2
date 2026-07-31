package androidx.lifecycle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public p f865a;

    /* renamed from: b, reason: collision with root package name */
    public s f866b;

    public final void a(u uVar, o oVar) {
        p a8 = oVar.a();
        p pVar = this.f865a;
        q6.i.e(pVar, "state1");
        if (a8.compareTo(pVar) < 0) {
            pVar = a8;
        }
        this.f865a = pVar;
        this.f866b.b(uVar, oVar);
        this.f865a = a8;
    }
}
