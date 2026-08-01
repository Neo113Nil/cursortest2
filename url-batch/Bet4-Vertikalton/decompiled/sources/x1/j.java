package x1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4245a = new i();

    @Override // x1.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // x1.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // x1.m
    public final boolean c() {
        boolean z2 = w1.h.d;
        return w1.h.d;
    }

    @Override // x1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            w1.n nVar = w1.n.f4190a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) J0.e.c(list).toArray(new String[0]));
        }
    }
}
