package b7;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1361a;

    public u(v vVar) {
        this.f1361a = new WeakReference(vVar);
    }

    public void a() {
        v vVar = (v) this.f1361a.get();
        if (vVar == null) {
            return;
        }
        vVar.g();
    }

    public u(a1.j jVar) {
        this.f1361a = new WeakReference(jVar);
    }
}
