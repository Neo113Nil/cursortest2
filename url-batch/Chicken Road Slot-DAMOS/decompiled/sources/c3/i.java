package c3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Object f1736a;

    /* renamed from: b, reason: collision with root package name */
    public k f1737b;

    /* renamed from: c, reason: collision with root package name */
    public l f1738c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1739d;

    public final void finalize() {
        l lVar;
        k kVar = this.f1737b;
        if (kVar != null) {
            j jVar = kVar.f1742e;
            if (!jVar.isDone()) {
                jVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1736a, 1));
            }
        }
        if (this.f1739d || (lVar = this.f1738c) == null) {
            return;
        }
        lVar.j(null);
    }
}
