package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mr implements ox {
    @Override // defpackage.ox
    public final h82 Y1f8riQaR6yg(SSLSocket sSLSocket) {
        return new or();
    }

    @Override // defpackage.ox
    public final boolean lS5Rgt96tfkO(SSLSocket sSLSocket) {
        or.Companion.getClass();
        return or.lS5Rgt96tfkO && Conscrypt.isConscrypt(sSLSocket);
    }
}
