package H6;

import D6.C;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements D6.t {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1013a = new b();

    @Override // D6.t
    public final C a(I6.i chain) {
        I6.g hVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        q qVar = chain.f1296a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (qVar) {
            if (!qVar.f1082u) {
                throw new IllegalStateException("released");
            }
            if (qVar.f1081t) {
                throw new IllegalStateException("Check failed.");
            }
            if (qVar.f1080s) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f6114a;
        }
        i iVar = qVar.f1076o;
        Intrinsics.b(iVar);
        r a7 = iVar.a();
        D6.w client = qVar.f1070d;
        a7.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        D0.j jVar = a7.f1093i;
        K6.r rVar = a7.j;
        if (rVar != null) {
            hVar = new K6.s(client, a7, chain, rVar);
        } else {
            a7.f1090f.setSoTimeout(chain.f1302g);
            T6.y b7 = ((T6.q) jVar.f331i).f2640d.b();
            long j = chain.f1302g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b7.g(j);
            ((T6.p) jVar.f332l).f2637d.b().g(chain.f1303h);
            hVar = new J6.h(client, a7, jVar);
        }
        h hVar2 = new h(qVar, iVar, hVar);
        qVar.f1079r = hVar2;
        qVar.f1084w = hVar2;
        synchronized (qVar) {
            qVar.f1080s = true;
            qVar.f1081t = true;
        }
        if (qVar.f1083v) {
            throw new IOException("Canceled");
        }
        return I6.i.a(chain, 0, hVar2, null, 61).b(chain.f1300e);
    }
}
