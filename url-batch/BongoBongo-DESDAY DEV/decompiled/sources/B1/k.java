package B1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f58a = new j();

    @Override // B1.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // B1.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // B1.n
    public final boolean c() {
        boolean z2 = A1.h.d;
        return A1.h.d;
    }

    @Override // B1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            A1.o oVar = A1.o.f39a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) K0.e.c(list).toArray(new String[0]));
        }
    }
}
