package p8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes2.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final i f39847a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f39848b;

    static {
        boolean z8 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j.a()) {
                    z8 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f39848b = z8;
    }

    @Override // p8.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p8.n
    public final boolean b() {
        return f39848b;
    }

    @Override // p8.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p8.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            o8.f fVar = o8.f.f39739a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3.e.j(protocols).toArray(new String[0]));
        }
    }
}
