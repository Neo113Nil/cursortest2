package defpackage;

import android.content.Context;
import java.security.Security;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gpi implements eww {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gpi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eww
    public final void a() {
        if (this.b != 0) {
            return;
        }
        fae faeVar = new fae(new fag());
        bsh bshVar = new bsh((Context) this.a);
        synchronized (fae.a) {
            if (bsh.c != null) {
                return;
            }
            bsh.c = bshVar;
            if (fae.d == null) {
                fae.d = new fai();
            }
            if (Security.insertProviderAt(fae.d, 1) != 1) {
                throw new RuntimeException("Failed to install SslGuard with top priority.");
            }
            fah fahVar = faeVar.e;
            fah fahVar2 = fak.a;
            if (fahVar == null) {
                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            fak.a = fahVar;
            fah fahVar3 = faeVar.e;
            fah fahVar4 = faj.a;
            if (fahVar3 == null) {
                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            faj.a = fahVar3;
            Security.setProperty("ssl.SocketFactory.provider", fae.b);
            Security.setProperty("ssl.ServerSocketFactory.provider", fae.c);
            fae.a();
        }
    }
}
