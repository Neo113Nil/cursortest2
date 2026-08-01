package I1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f617a = new j();

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // I1.n
    public final boolean c() {
        boolean z2 = H1.h.f554d;
        return H1.h.f554d;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        j1.h.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            H1.n nVar = H1.n.f570a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) N0.e.c(list).toArray(new String[0]));
        }
    }
}
