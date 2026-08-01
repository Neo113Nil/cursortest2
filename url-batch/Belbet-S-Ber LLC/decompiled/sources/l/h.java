package l;

import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final f f2456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f2457g;

    public h(j jVar, f fVar) {
        this.f2457g = jVar;
        this.f2456f = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.k kVar;
        j jVar = this.f2457g;
        k.m mVar = jVar.h;
        if (mVar != null && (kVar = mVar.f2214e) != null) {
            kVar.z(mVar);
        }
        View view = (View) jVar.f2467m;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.f2456f;
            if (!fVar.b()) {
                if (fVar.f2271f != null) {
                    fVar.d(0, 0, false, false);
                }
            }
            jVar.f2478x = fVar;
        }
        jVar.f2480z = null;
    }
}
