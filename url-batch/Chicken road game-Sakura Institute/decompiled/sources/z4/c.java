package z4;

import m4.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i f10092a = new i();

    public final void a(Exception exc) {
        i iVar = this.f10092a;
        iVar.getClass();
        o.e(exc, "Exception must not be null");
        synchronized (iVar.f10108a) {
            try {
                if (iVar.f10110c) {
                    return;
                }
                iVar.f10110c = true;
                iVar.f10113f = exc;
                iVar.f10109b.j(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
