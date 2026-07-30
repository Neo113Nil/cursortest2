package b8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1416a = new j();

    @Override // b8.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // b8.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // b8.n
    public final boolean c() {
        boolean z8 = a8.h.f551d;
        return a8.h.f551d;
    }

    @Override // b8.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            a8.o oVar = a8.o.f570a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j4.i.h(list).toArray(new String[0]));
        }
    }
}
