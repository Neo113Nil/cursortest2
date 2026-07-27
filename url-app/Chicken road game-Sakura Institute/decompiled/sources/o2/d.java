package o2;

/* loaded from: classes.dex */
public final class d extends u3.d {

    /* renamed from: h, reason: collision with root package name */
    public boolean f8921h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f8922i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f8923j;

    public d(f fVar, e eVar) {
        super(22);
        this.f8923j = fVar;
        this.f8922i = eVar;
        this.f8921h = false;
    }

    @Override // u3.d
    public final void V(Object obj, Object obj2) {
        C0924c c0924c = (C0924c) obj;
        s sVar = (s) obj2;
        boolean z4 = this.f8921h;
        e eVar = this.f8922i;
        if (!z4) {
            C0924c c0924c2 = C0924c.f8919j;
            if (c0924c.compareTo(c0924c2) > 0) {
                this.f8921h = true;
                eVar.W(c0924c2, this.f8923j.k());
            }
        }
        eVar.W(c0924c, sVar);
    }
}
