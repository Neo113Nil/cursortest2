package I1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f559a = new j();

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
        boolean z2 = H1.h.d;
        return H1.h.d;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            H1.n nVar = H1.n.f525a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) R0.e.d(list).toArray(new String[0]));
        }
    }
}
