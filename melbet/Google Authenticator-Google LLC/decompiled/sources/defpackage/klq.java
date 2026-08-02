package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klq implements kmb {
    @Override // defpackage.kmp
    public final void d(kmo kmoVar) {
        while (true) {
            InputStream e = kmoVar.e();
            if (e == null) {
                return;
            }
            try {
                e.close();
            } catch (IOException e2) {
                while (true) {
                    InputStream e3 = kmoVar.e();
                    if (e3 == null) {
                        throw new RuntimeException(e2);
                    }
                    try {
                        e3.close();
                    } catch (IOException e4) {
                        klw.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e4);
                    }
                }
            }
        }
    }

    @Override // defpackage.kmb
    public final void b() {
    }

    @Override // defpackage.kmp
    public final void e() {
    }

    @Override // defpackage.kmb
    public final void a(kbq kbqVar) {
    }
}
