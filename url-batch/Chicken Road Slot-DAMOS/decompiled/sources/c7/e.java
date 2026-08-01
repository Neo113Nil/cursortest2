package c7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1876a;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f1876a = fVar;
    }

    @Override // c7.d
    public final void a(z6.b bVar) {
        boolean c10 = bVar.c();
        f fVar = this.f1876a;
        if (c10) {
            fVar.k(null, fVar.l());
            return;
        }
        c cVar = fVar.f1896u;
        if (cVar != null) {
            cVar.onConnectionFailed(bVar);
        }
    }
}
