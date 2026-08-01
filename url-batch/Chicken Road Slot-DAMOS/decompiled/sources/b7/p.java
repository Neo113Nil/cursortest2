package b7;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends o7.g {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1329e;

    public p(s sVar) {
        super(1);
        this.f1329e = new WeakReference(sVar);
    }

    @Override // o7.g
    public final void C(u7.e eVar) {
        s sVar = (s) this.f1329e.get();
        if (sVar == null) {
            return;
        }
        m mVar = new m(this, sVar, sVar, eVar);
        t tVar = sVar.f1344d.f1400h;
        tVar.sendMessage(tVar.obtainMessage(1, mVar));
    }
}
