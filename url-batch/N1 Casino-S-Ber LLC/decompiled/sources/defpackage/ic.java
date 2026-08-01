package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ic implements bf {
    @Override // defpackage.bf
    public final boolean b(SSLSocket sSLSocket) {
        return hc.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.bf
    public final a30 d(SSLSocket sSLSocket) {
        return new jc();
    }
}
