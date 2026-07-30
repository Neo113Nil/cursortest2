package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class or implements h82 {
    public static final nr Companion = new nr();
    public static final mr PxuCJdSBwIXG = new mr();
    public static final boolean lS5Rgt96tfkO;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, nr.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (nr.PxuCJdSBwIXG()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        lS5Rgt96tfkO = z;
    }

    @Override // defpackage.h82
    public final String PxuCJdSBwIXG(SSLSocket sSLSocket) {
        if (lS5Rgt96tfkO(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.h82
    public final boolean TSizfFm2Yiuu() {
        return lS5Rgt96tfkO;
    }

    @Override // defpackage.h82
    public final void Y1f8riQaR6yg(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (lS5Rgt96tfkO(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            km1.Companion.getClass();
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) jm1.PxuCJdSBwIXG(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.h82
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
