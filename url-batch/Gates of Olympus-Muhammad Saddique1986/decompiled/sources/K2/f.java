package K2;

import E.F;
import T2.C0230e;
import java.net.Socket;

/* loaded from: classes.dex */
public final class f extends C0230e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f3286m;

    public f(g gVar) {
        this.f3286m = gVar;
    }

    @Override // T2.C0230e
    public final void j() {
        Socket socket;
        g gVar = this.f3286m;
        if (gVar.f3299p) {
            return;
        }
        gVar.f3299p = true;
        F f3 = gVar.f3300q;
        if (f3 != null) {
            ((L2.e) f3.f925d).cancel();
        }
        j jVar = gVar.f3301r;
        if (jVar == null || (socket = jVar.f3308c) == null) {
            return;
        }
        H2.b.d(socket);
    }
}
