package H1;

import L1.z;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import h1.C0438i;
import java.io.IOException;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class q implements Y1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1894d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1896f;

    public /* synthetic */ q(V v3, Object obj, int i3) {
        this.f1894d = i3;
        this.f1895e = v3;
        this.f1896f = obj;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f1894d) {
            case 0:
                ((y) this.f1895e).e(new j((com.gates.olympus.miruv.data.d) this.f1896f));
                return z.f2729a;
            case 1:
                ((y) this.f1895e).e(new k(((com.gates.olympus.miruv.data.b) this.f1896f).getId()));
                return z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                H2.p pVar = (H2.p) this.f1896f;
                H2.t tVar = (H2.t) this.f1895e;
                try {
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                } catch (Throwable th) {
                    pVar.a(3, 3, null);
                    B2.c.c(tVar);
                    throw th;
                }
                if (!tVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (tVar.a(false, this)) {
                }
                pVar.a(1, 9, null);
                B2.c.c(tVar);
                return z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((I1.m) this.f1895e).f(new I1.d(((I1.c) this.f1896f).f2457a));
                return z.f2729a;
            default:
                J1.d dVar = new J1.d(((com.gates.olympus.miruv.data.b) this.f1896f).getId());
                J1.k kVar = (J1.k) this.f1895e;
                AbstractC0552y.q(P.j(kVar), null, null, new J1.j(kVar, dVar, null), 3);
                return z.f2729a;
        }
    }

    public q(H2.p pVar, H2.t tVar) {
        this.f1894d = 2;
        this.f1896f = pVar;
        this.f1895e = tVar;
    }
}
