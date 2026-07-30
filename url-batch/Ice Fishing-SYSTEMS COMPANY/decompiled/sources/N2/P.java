package N2;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class P extends I {

    /* renamed from: b, reason: collision with root package name */
    public final h3.h f2029b;

    public P(h3.h hVar) {
        super(4);
        this.f2029b = hVar;
    }

    @Override // N2.I
    public final boolean a(C c4) {
        if (c4.f1993y.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // N2.I
    public final L2.d[] b(C c4) {
        if (c4.f1993y.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // N2.I
    public final void c(Status status) {
        this.f2029b.c(new M2.f(status));
    }

    @Override // N2.I
    public final void d(RuntimeException runtimeException) {
        this.f2029b.c(runtimeException);
    }

    @Override // N2.I
    public final void e(C c4) {
        try {
            h(c4);
        } catch (DeadObjectException e6) {
            c(I.g(e6));
            throw e6;
        } catch (RemoteException e9) {
            c(I.g(e9));
        } catch (RuntimeException e10) {
            this.f2029b.c(e10);
        }
    }

    public final void h(C c4) {
        if (c4.f1993y.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2029b.d(Boolean.FALSE);
    }

    @Override // N2.I
    public final /* bridge */ /* synthetic */ void f(S0.c cVar, boolean z8) {
    }
}
