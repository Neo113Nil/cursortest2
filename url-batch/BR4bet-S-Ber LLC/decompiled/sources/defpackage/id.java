package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class id implements yg {
    @Override // defpackage.yg
    public final boolean b(SSLSocket sSLSocket) {
        return hd.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.yg
    public final c60 c(SSLSocket sSLSocket) {
        return new jd();
    }
}
