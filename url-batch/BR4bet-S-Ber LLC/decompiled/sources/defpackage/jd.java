package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jd implements c60 {
    public static final id a = new id();

    @Override // defpackage.c60
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.c60
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.c60
    public final boolean c() {
        boolean z = hd.d;
        return hd.d;
    }

    @Override // defpackage.c60
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            zz zzVar = zz.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ky.d(list).toArray(new String[0]));
        }
    }
}
