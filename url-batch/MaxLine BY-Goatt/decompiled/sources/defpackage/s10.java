package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s10 implements in2 {
    public static final r10 a = new r10();

    @Override // defpackage.in2
    public final String a(SSLSocket sSLSocket) {
        if (c(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.in2
    public final boolean b() {
        boolean z = q10.d;
        return q10.d;
    }

    @Override // defpackage.in2
    public final boolean c(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.in2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (c(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            r12 r12Var = r12.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) nm1.k(list).toArray(new String[0]));
        }
    }
}
