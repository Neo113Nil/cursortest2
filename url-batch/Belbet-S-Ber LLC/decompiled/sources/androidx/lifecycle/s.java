package androidx.lifecycle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public m f730a;

    /* renamed from: b, reason: collision with root package name */
    public p f731b;

    public final void a(r rVar, l lVar) {
        m a5 = lVar.a();
        m mVar = this.f730a;
        i3.d.e(mVar, "state1");
        if (a5.compareTo(mVar) < 0) {
            mVar = a5;
        }
        this.f730a = mVar;
        this.f731b.a(rVar, lVar);
        this.f730a = a5;
    }
}
