package M0;

import E1.B;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class w extends r {

    /* renamed from: b, reason: collision with root package name */
    public final B f971b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.e f972c;

    /* renamed from: d, reason: collision with root package name */
    public final K0.j f973d;

    public w(int i3, B b3, d1.e eVar, K0.j jVar) {
        super(i3);
        this.f972c = eVar;
        this.f971b = b3;
        this.f973d = jVar;
        if (i3 == 2 && b3.f310a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // M0.r
    public final boolean a(m mVar) {
        return this.f971b.f310a;
    }

    @Override // M0.r
    public final K0.d[] b(m mVar) {
        return (K0.d[]) this.f971b.f312c;
    }

    @Override // M0.r
    public final void c(Status status) {
        this.f973d.getClass();
        this.f972c.a(status.f2679c != null ? new L0.j(status) : new L0.d(status));
    }

    @Override // M0.r
    public final void d(RuntimeException runtimeException) {
        this.f972c.a(runtimeException);
    }

    @Override // M0.r
    public final void e(m mVar) {
        d1.e eVar = this.f972c;
        try {
            B b3 = this.f971b;
            ((h) ((B) b3.f313d).f312c).accept(mVar.f931c, eVar);
        } catch (DeadObjectException e3) {
            throw e3;
        } catch (RemoteException e4) {
            c(r.g(e4));
        } catch (RuntimeException e5) {
            eVar.a(e5);
        }
    }

    @Override // M0.r
    public final void f(V0.e eVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) eVar.f1600c;
        d1.e eVar2 = this.f972c;
        map.put(eVar2, valueOf);
        V0.e eVar3 = new V0.e(eVar, eVar2, 9, false);
        d1.k kVar = eVar2.f4931a;
        kVar.getClass();
        kVar.f4943b.d(new d1.g(d1.f.f4932a, eVar3));
        kVar.g();
    }
}
