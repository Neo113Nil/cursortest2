package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ej implements fe0 {
    public final dj a;
    public fe0 b;

    public ej(dj djVar) {
        this.a = djVar;
    }

    @Override // defpackage.fe0
    public final String a(SSLSocket sSLSocket) {
        fe0 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fe0
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.fe0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fe0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        fe0 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized fe0 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
