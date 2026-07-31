package J2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2631a = new j();

    @Override // J2.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // J2.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // J2.n
    public final boolean c() {
        boolean z3 = I2.h.f2501d;
        return I2.h.f2501d;
    }

    @Override // J2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            I2.n nVar = I2.n.f2519a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) F0.a.e(list).toArray(new String[0]));
        }
    }
}
