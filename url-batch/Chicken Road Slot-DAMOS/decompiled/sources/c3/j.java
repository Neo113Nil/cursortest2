package c3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f1740v;

    public j(k kVar) {
        this.f1740v = kVar;
    }

    @Override // c3.h
    public final String h() {
        i iVar = (i) this.f1740v.f1741d.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f1736a + "]";
    }
}
