package T0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import u0.C0673c;
import u0.C0689s;

/* loaded from: classes.dex */
public final class N extends H {

    /* renamed from: b, reason: collision with root package name */
    public final M f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final k1.h f2260c;

    /* renamed from: d, reason: collision with root package name */
    public final U0.h f2261d;

    public N(M m4, k1.h hVar, U0.h hVar2) {
        super(2);
        this.f2260c = hVar;
        this.f2259b = m4;
        this.f2261d = hVar2;
        if (m4.f2256a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // T0.H
    public final boolean a(B b7) {
        return this.f2259b.f2256a;
    }

    @Override // T0.H
    public final R0.c[] b(B b7) {
        return (R0.c[]) this.f2259b.f2257b;
    }

    @Override // T0.H
    public final void c(Status status) {
        this.f2261d.getClass();
        this.f2260c.b(status.f3861h != null ? new S0.g(status) : new H1.z(status));
    }

    @Override // T0.H
    public final void d(Exception exc) {
        this.f2260c.b(exc);
    }

    @Override // T0.H
    public final void e(B b7) {
        k1.h hVar = this.f2260c;
        try {
            this.f2259b.a(b7.f2223e, hVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e7) {
            c(H.g(e7));
        } catch (RuntimeException e8) {
            hVar.b(e8);
        }
    }

    @Override // T0.H
    public final void f(C0673c c0673c, boolean z5) {
        Map map = (Map) c0673c.f5969g;
        Boolean valueOf = Boolean.valueOf(z5);
        k1.h hVar = this.f2260c;
        map.put(hVar, valueOf);
        k1.n nVar = hVar.f5157a;
        C0689s c0689s = new C0689s(c0673c, hVar);
        nVar.getClass();
        nVar.f5170b.c(new k1.k(k1.i.f5158a, c0689s));
        nVar.n();
    }
}
