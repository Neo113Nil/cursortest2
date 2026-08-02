package M0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class x extends r {

    /* renamed from: b, reason: collision with root package name */
    public final d1.e f974b;

    public x(d1.e eVar) {
        super(4);
        this.f974b = eVar;
    }

    @Override // M0.r
    public final boolean a(m mVar) {
        if (mVar.f934g.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // M0.r
    public final K0.d[] b(m mVar) {
        if (mVar.f934g.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // M0.r
    public final void c(Status status) {
        this.f974b.a(new L0.d(status));
    }

    @Override // M0.r
    public final void d(RuntimeException runtimeException) {
        this.f974b.a(runtimeException);
    }

    @Override // M0.r
    public final void e(m mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e3) {
            c(r.g(e3));
            throw e3;
        } catch (RemoteException e4) {
            c(r.g(e4));
        } catch (RuntimeException e5) {
            this.f974b.a(e5);
        }
    }

    public final void h(m mVar) {
        if (mVar.f934g.remove(null) != null) {
            throw new ClassCastException();
        }
        d1.e eVar = this.f974b;
        Boolean bool = Boolean.FALSE;
        d1.k kVar = eVar.f4931a;
        synchronized (kVar.f4942a) {
            try {
                if (kVar.f4944c) {
                    return;
                }
                kVar.f4944c = true;
                kVar.f4946e = bool;
                kVar.f4943b.e(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.r
    public final /* bridge */ /* synthetic */ void f(V0.e eVar, boolean z) {
    }
}
