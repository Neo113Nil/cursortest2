package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zg implements c60 {
    public final yg a;
    public c60 b;

    public zg(yg ygVar) {
        this.a = ygVar;
    }

    @Override // defpackage.c60
    public final String a(SSLSocket sSLSocket) {
        c60 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.c60
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.c60
    public final boolean c() {
        return true;
    }

    @Override // defpackage.c60
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        c60 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized c60 e(SSLSocket sSLSocket) {
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
