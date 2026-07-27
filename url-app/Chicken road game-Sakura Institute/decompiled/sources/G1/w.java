package G1;

import A.V;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: b, reason: collision with root package name */
    public final V f3160b;

    /* renamed from: c, reason: collision with root package name */
    public final U1.e f3161c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.f f3162d;

    public w(V v4, U1.e eVar, H1.f fVar) {
        super(2);
        this.f3161c = eVar;
        this.f3160b = v4;
        this.f3162d = fVar;
        if (v4.f61b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // G1.r
    public final boolean a(l lVar) {
        return this.f3160b.f61b;
    }

    @Override // G1.r
    public final E1.d[] b(l lVar) {
        return (E1.d[]) this.f3160b.f62c;
    }

    @Override // G1.r
    public final void c(Status status) {
        this.f3162d.getClass();
        this.f3161c.a(status.f6031i != null ? new F1.f(status) : new E1.g(status));
    }

    @Override // G1.r
    public final void d(RuntimeException runtimeException) {
        this.f3161c.a(runtimeException);
    }

    @Override // G1.r
    public final void e(l lVar) {
        U1.e eVar = this.f3161c;
        try {
            this.f3160b.c(lVar.f3131b, eVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            c(r.g(e5));
        } catch (RuntimeException e6) {
            eVar.a(e6);
        }
    }

    @Override // G1.r
    public final void f(y.t tVar, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) tVar.f11495i;
        U1.e eVar = this.f3161c;
        map.put(eVar, valueOf);
        y.t tVar2 = new y.t(7, tVar, eVar, false);
        U1.k kVar = eVar.f4107a;
        kVar.getClass();
        kVar.f4124b.h(new U1.h(U1.f.f4108a, tVar2));
        kVar.j();
    }
}
