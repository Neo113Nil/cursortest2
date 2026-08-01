package t1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3884a = new i();

    @Override // t1.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // t1.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // t1.m
    public final boolean c() {
        boolean z2 = s1.h.d;
        return s1.h.d;
    }

    @Override // t1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z0.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            s1.n nVar = s1.n.f3825a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) I0.e.c(list).toArray(new String[0]));
        }
    }
}
