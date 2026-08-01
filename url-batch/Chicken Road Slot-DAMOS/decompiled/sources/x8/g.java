package x8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final w7.g f10559a;

    public g(w7.g gVar) {
        this.f10559a = gVar;
    }

    @Override // x8.i
    public final boolean a(y8.b bVar) {
        int i3 = bVar.f10676b;
        if (i3 != 3 && i3 != 4 && i3 != 5) {
            return false;
        }
        this.f10559a.c(bVar.f10675a);
        return true;
    }

    @Override // x8.i
    public final boolean b(Exception exc) {
        return false;
    }
}
