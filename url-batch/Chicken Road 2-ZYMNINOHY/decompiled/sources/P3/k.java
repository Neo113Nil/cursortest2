package P3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2108a = new j();

    @Override // P3.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // P3.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // P3.n
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            O3.n nVar = O3.n.f2081a;
            Object[] array = a2.i.i(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // P3.n
    public final boolean isSupported() {
        boolean z = O3.h.f2066d;
        return O3.h.f2066d;
    }
}
