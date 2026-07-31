package P2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3939a = new j();

    @Override // P2.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // P2.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // P2.n
    public final boolean c() {
        boolean z3 = O2.h.f3894d;
        return O2.h.f3894d;
    }

    @Override // P2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            O2.n nVar = O2.n.f3910a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) A1.i.e(list).toArray(new String[0]));
        }
    }
}
