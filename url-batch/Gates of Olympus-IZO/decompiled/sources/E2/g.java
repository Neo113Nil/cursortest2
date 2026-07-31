package E2;

import E.G;
import N2.C0149e;
import java.net.Socket;

/* loaded from: classes.dex */
public final class g extends C0149e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f801m;

    public g(h hVar) {
        this.f801m = hVar;
    }

    @Override // N2.C0149e
    public final void j() {
        Socket socket;
        h hVar = this.f801m;
        if (hVar.p) {
            return;
        }
        hVar.p = true;
        G g3 = hVar.f814q;
        if (g3 != null) {
            ((F2.e) g3.f624d).cancel();
        }
        k kVar = hVar.f815r;
        if (kVar == null || (socket = kVar.f822c) == null) {
            return;
        }
        B2.c.d(socket);
    }
}
