package w7;

import c0.w;
import java.net.Socket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends f8.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f9550m;

    public f(g gVar) {
        this.f9550m = gVar;
    }

    @Override // f8.e
    public final void j() {
        Socket socket;
        g gVar = this.f9550m;
        if (gVar.f9563r) {
            return;
        }
        gVar.f9563r = true;
        w wVar = gVar.f9564s;
        if (wVar != null) {
            ((x7.d) wVar.f1516d).cancel();
        }
        i iVar = gVar.f9565t;
        if (iVar == null || (socket = iVar.f9568c) == null) {
            return;
        }
        t7.b.d(socket);
    }
}
