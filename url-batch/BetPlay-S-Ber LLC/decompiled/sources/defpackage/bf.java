package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bf implements l30 {
    public final af a;
    public l30 b;

    public bf(af afVar) {
        this.a = afVar;
    }

    @Override // defpackage.l30
    public final String a(SSLSocket sSLSocket) {
        l30 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.l30
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.l30
    public final boolean c() {
        return true;
    }

    @Override // defpackage.l30
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        l30 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized l30 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
