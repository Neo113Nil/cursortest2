package l;

import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final g f2343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f2344g;

    public i(l lVar, g gVar) {
        this.f2344g = lVar;
        this.f2343f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.k kVar;
        l lVar = this.f2344g;
        k.m mVar = lVar.f2361h;
        if (mVar != null && (kVar = mVar.f2063e) != null) {
            kVar.v(mVar);
        }
        View view = (View) lVar.f2365m;
        if (view != null && view.getWindowToken() != null) {
            g gVar = this.f2343f;
            if (!gVar.b()) {
                if (gVar.f2122e != null) {
                    gVar.d(0, 0, false, false);
                }
            }
            lVar.f2377y = gVar;
        }
        lVar.A = null;
    }
}
