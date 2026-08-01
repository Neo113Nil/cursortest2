package k;

import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final g f2554f;
    public final /* synthetic */ k g;

    public i(k kVar, g gVar) {
        this.g = kVar;
        this.f2554f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.k kVar;
        k kVar2 = this.g;
        j.m mVar = kVar2.h;
        if (mVar != null && (kVar = mVar.f2192e) != null) {
            kVar.j(mVar);
        }
        View view = (View) kVar2.f2572m;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f2554f;
            if (!gVar.b()) {
                if (gVar.f2248f != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            kVar2.f2583x = gVar;
        }
        kVar2.f2585z = null;
    }
}
