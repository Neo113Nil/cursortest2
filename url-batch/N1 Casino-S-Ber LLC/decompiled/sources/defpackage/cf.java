package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class cf implements a30 {
    public final bf a;
    public a30 b;

    public cf(bf bfVar) {
        this.a = bfVar;
    }

    @Override // defpackage.a30
    public final String a(SSLSocket sSLSocket) {
        a30 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.a30
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.a30
    public final boolean c() {
        return true;
    }

    @Override // defpackage.a30
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        a30 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized a30 e(SSLSocket sSLSocket) {
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
