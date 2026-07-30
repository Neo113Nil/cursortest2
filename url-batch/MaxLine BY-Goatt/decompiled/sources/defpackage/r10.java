package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r10 implements j90 {
    @Override // defpackage.j90
    public final boolean c(SSLSocket sSLSocket) {
        return q10.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.j90
    public final in2 e(SSLSocket sSLSocket) {
        return new s10();
    }
}
