package l3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import k3.o;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2894a = new i();

    @Override // l3.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // l3.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // l3.m
    public final boolean c() {
        boolean z3 = k3.h.f2831d;
        return k3.h.f2831d;
    }

    @Override // l3.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            o oVar = o.f2841a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) g2.f.g(list).toArray(new String[0]));
        }
    }
}
