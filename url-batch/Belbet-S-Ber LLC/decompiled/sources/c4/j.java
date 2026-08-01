package c4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f894a = new i();

    @Override // c4.m
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // c4.m
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // c4.m
    public final boolean c() {
        boolean z4 = b4.h.d;
        return b4.h.d;
    }

    @Override // c4.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i3.d.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            b4.n nVar = b4.n.f853a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) o2.f.d(list).toArray(new String[0]));
        }
    }
}
