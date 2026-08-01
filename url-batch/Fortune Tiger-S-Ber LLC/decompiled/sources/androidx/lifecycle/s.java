package androidx.lifecycle;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public m f598a;

    /* renamed from: b, reason: collision with root package name */
    public p f599b;

    public final void a(r rVar, l lVar) {
        m a4 = lVar.a();
        m mVar = this.f598a;
        u2.c.e(mVar, "state1");
        if (a4.compareTo(mVar) < 0) {
            mVar = a4;
        }
        this.f598a = mVar;
        this.f599b.a(rVar, lVar);
        this.f598a = a4;
    }
}
