package androidx.lifecycle;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public m f626a;

    /* renamed from: b, reason: collision with root package name */
    public p f627b;

    public final void a(r rVar, l lVar) {
        m a2 = lVar.a();
        m mVar = this.f626a;
        f3.d.e(mVar, "state1");
        if (a2.compareTo(mVar) < 0) {
            mVar = a2;
        }
        this.f626a = mVar;
        this.f627b.b(rVar, lVar);
        this.f626a = a2;
    }
}
