package T0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import u0.C0673c;

/* loaded from: classes.dex */
public final class O extends H {

    /* renamed from: b, reason: collision with root package name */
    public final k1.h f2262b;

    public O(k1.h hVar) {
        super(4);
        this.f2262b = hVar;
    }

    @Override // T0.H
    public final boolean a(B b7) {
        if (b7.f2227i.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // T0.H
    public final R0.c[] b(B b7) {
        if (b7.f2227i.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // T0.H
    public final void c(Status status) {
        this.f2262b.b(new H1.z(status));
    }

    @Override // T0.H
    public final void d(Exception exc) {
        this.f2262b.b(exc);
    }

    @Override // T0.H
    public final void e(B b7) {
        try {
            h(b7);
        } catch (DeadObjectException e4) {
            c(H.g(e4));
            throw e4;
        } catch (RemoteException e7) {
            c(H.g(e7));
        } catch (RuntimeException e8) {
            this.f2262b.b(e8);
        }
    }

    public final void h(B b7) {
        if (b7.f2227i.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f2262b.c(Boolean.FALSE);
    }

    @Override // T0.H
    public final /* bridge */ /* synthetic */ void f(C0673c c0673c, boolean z5) {
    }
}
