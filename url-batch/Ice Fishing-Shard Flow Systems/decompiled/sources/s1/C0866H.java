package s1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: s1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866H extends AbstractC0862D {

    /* renamed from: b, reason: collision with root package name */
    public final K1.h f7621b;

    public C0866H(K1.h hVar) {
        super(4);
        this.f7621b = hVar;
    }

    @Override // s1.AbstractC0862D
    public final q1.d[] a(v vVar) {
        if (vVar.j.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // s1.AbstractC0862D
    public final boolean b(v vVar) {
        if (vVar.j.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // s1.AbstractC0862D
    public final int c(v vVar) {
        if (vVar.j.get(null) == null) {
            return -1;
        }
        throw new ClassCastException();
    }

    @Override // s1.AbstractC0862D
    public final void d(Status status) {
        this.f7621b.c(new r1.f(status));
    }

    @Override // s1.AbstractC0862D
    public final void e(Exception exc) {
        this.f7621b.c(exc);
    }

    @Override // s1.AbstractC0862D
    public final void g(v vVar) {
        try {
            i(vVar);
        } catch (DeadObjectException e7) {
            d(AbstractC0862D.h(e7));
            throw e7;
        } catch (RemoteException e8) {
            d(AbstractC0862D.h(e8));
        } catch (RuntimeException e9) {
            this.f7621b.c(e9);
        }
    }

    public final void i(v vVar) {
        if (vVar.j.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f7621b.d(Boolean.FALSE);
    }

    @Override // s1.AbstractC0862D
    public final /* bridge */ /* synthetic */ void f(P0.s sVar, boolean z7) {
    }
}
