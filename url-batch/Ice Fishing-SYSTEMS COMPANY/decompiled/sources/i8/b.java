package i8;

import com.google.android.gms.internal.ads.C4088vv;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import u8.z;

/* loaded from: classes2.dex */
public final class b implements e8.p {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38335a = new b();

    @Override // e8.p
    public final e8.w a(j8.h hVar) {
        j8.f gVar;
        q qVar = hVar.f38594a;
        qVar.getClass();
        synchronized (qVar) {
            try {
                if (!qVar.f38395F) {
                    throw new IllegalStateException("released");
                }
                if (qVar.f38394E) {
                    throw new IllegalStateException("Check failed.");
                }
                if (qVar.f38393D) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = qVar.f38405z;
        kotlin.jvm.internal.h.b(iVar);
        r f6 = iVar.f();
        e8.s client = qVar.f38399n;
        f6.getClass();
        kotlin.jvm.internal.h.e(client, "client");
        l8.r rVar = f6.f38414k;
        if (rVar != null) {
            gVar = new l8.s(client, f6, hVar, rVar);
        } else {
            Socket socket = f6.f38410f;
            int i = hVar.f38600g;
            socket.setSoTimeout(i);
            Y2.e eVar = f6.i;
            z L8 = ((u8.r) eVar.f3964v).f41308n.L();
            long j9 = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            L8.g(j9);
            ((u8.p) eVar.f3965w).f41304n.L().g(hVar.f38601h);
            gVar = new k8.g(client, f6, eVar);
        }
        C4088vv c4088vv = new C4088vv(qVar, iVar, gVar);
        qVar.f38392C = c4088vv;
        qVar.f38397H = c4088vv;
        synchronized (qVar) {
            qVar.f38393D = true;
            qVar.f38394E = true;
        }
        if (qVar.f38396G) {
            throw new IOException("Canceled");
        }
        return j8.h.a(hVar, 0, c4088vv, null, 61).b(hVar.f38598e);
    }
}
