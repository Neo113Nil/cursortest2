package K3;

import java.net.Socket;

/* loaded from: classes.dex */
public final class h extends T3.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f1560m;

    public h(i iVar) {
        this.f1560m = iVar;
    }

    @Override // T3.e
    public final void j() {
        Socket socket;
        i iVar = this.f1560m;
        if (iVar.f1573m) {
            return;
        }
        iVar.f1573m = true;
        e eVar = iVar.n;
        if (eVar != null) {
            eVar.f1547c.cancel();
        }
        k kVar = iVar.o;
        if (kVar == null || (socket = kVar.f1576c) == null) {
            return;
        }
        H3.b.d(socket);
    }
}
