package y1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4303a = new i();

    @Override // y1.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // y1.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // y1.m
    public final boolean c() {
        boolean z2 = x1.h.d;
        return x1.h.d;
    }

    @Override // y1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        e1.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            x1.n nVar = x1.n.f4286a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) I0.e.c(list).toArray(new String[0]));
        }
    }
}
