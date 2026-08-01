package A1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final k f82a = new k();

    @Override // A1.o
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // A1.o
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // A1.o
    public final boolean c() {
        boolean z2 = z1.h.d;
        return z1.h.d;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        g1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            z1.o oVar = z1.o.f4365a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) z1.n.a(list).toArray(new String[0]));
        }
    }
}
