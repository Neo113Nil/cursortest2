package G1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x extends r {

    /* renamed from: b, reason: collision with root package name */
    public final U1.e f3163b;

    public x(U1.e eVar) {
        super(4);
        this.f3163b = eVar;
    }

    @Override // G1.r
    public final boolean a(l lVar) {
        if (lVar.f3135f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // G1.r
    public final E1.d[] b(l lVar) {
        if (lVar.f3135f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // G1.r
    public final void c(Status status) {
        this.f3163b.a(new E1.g(status));
    }

    @Override // G1.r
    public final void d(RuntimeException runtimeException) {
        this.f3163b.a(runtimeException);
    }

    @Override // G1.r
    public final void e(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e4) {
            c(r.g(e4));
            throw e4;
        } catch (RemoteException e5) {
            c(r.g(e5));
        } catch (RuntimeException e6) {
            this.f3163b.a(e6);
        }
    }

    @Override // G1.r
    public final /* bridge */ /* synthetic */ void f(y.t tVar, boolean z4) {
    }

    public final void h(l lVar) {
        if (lVar.f3135f.remove(null) != null) {
            throw new ClassCastException();
        }
        U1.e eVar = this.f3163b;
        Boolean bool = Boolean.FALSE;
        U1.k kVar = eVar.f4107a;
        synchronized (kVar.f4123a) {
            try {
                if (kVar.f4125c) {
                    return;
                }
                kVar.f4125c = true;
                kVar.f4127e = bool;
                kVar.f4124b.i(kVar);
            } finally {
            }
        }
    }
}
