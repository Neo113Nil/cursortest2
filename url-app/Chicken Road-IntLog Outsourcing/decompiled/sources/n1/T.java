package n1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class T extends AbstractC1307K {

    /* renamed from: b, reason: collision with root package name */
    public final C1313Q f11347b;

    /* renamed from: c, reason: collision with root package name */
    public final I1.h f11348c;

    /* renamed from: d, reason: collision with root package name */
    public final l1.j f11349d;

    public T(int i2, C1313Q c1313q, I1.h hVar, l1.j jVar) {
        super(i2);
        this.f11348c = hVar;
        this.f11347b = c1313q;
        this.f11349d = jVar;
        if (i2 == 2 && c1313q.f11341b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // n1.AbstractC1307K
    public final boolean a(C1300D c1300d) {
        return this.f11347b.f11341b;
    }

    @Override // n1.AbstractC1307K
    public final l1.d[] b(C1300D c1300d) {
        return (l1.d[]) this.f11347b.f11342c;
    }

    @Override // n1.AbstractC1307K
    public final void c(Status status) {
        this.f11349d.getClass();
        this.f11348c.c(status.f4979c != null ? new m1.k(status) : new m1.f(status));
    }

    @Override // n1.AbstractC1307K
    public final void d(RuntimeException runtimeException) {
        this.f11348c.c(runtimeException);
    }

    @Override // n1.AbstractC1307K
    public final void e(C1300D c1300d) {
        I1.h hVar = this.f11348c;
        try {
            C1313Q c1313q = this.f11347b;
            ((InterfaceC1324k) ((U.e) c1313q.f11343d).f3053a).accept(c1300d.f11294e, hVar);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e6) {
            c(AbstractC1307K.g(e6));
        } catch (RuntimeException e7) {
            hVar.c(e7);
        }
    }

    @Override // n1.AbstractC1307K
    public final void f(S s2, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) s2.f11346b;
        I1.h hVar = this.f11348c;
        map.put(hVar, valueOf);
        S s4 = new S(s2, hVar);
        I1.o oVar = hVar.f1248a;
        oVar.getClass();
        oVar.f1264b.b(new I1.l(I1.i.f1249a, s4));
        oVar.n();
    }
}
