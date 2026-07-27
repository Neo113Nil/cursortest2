package n1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class U extends AbstractC1307K {

    /* renamed from: b, reason: collision with root package name */
    public final I1.h f11350b;

    /* renamed from: c, reason: collision with root package name */
    public final C1321h f11351c;

    public U(C1321h c1321h, I1.h hVar) {
        super(4);
        this.f11350b = hVar;
        this.f11351c = c1321h;
    }

    @Override // n1.AbstractC1307K
    public final boolean a(C1300D c1300d) {
        if (c1300d.f11298i.get(this.f11351c) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // n1.AbstractC1307K
    public final l1.d[] b(C1300D c1300d) {
        if (c1300d.f11298i.get(this.f11351c) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // n1.AbstractC1307K
    public final void c(Status status) {
        this.f11350b.c(new m1.f(status));
    }

    @Override // n1.AbstractC1307K
    public final void d(RuntimeException runtimeException) {
        this.f11350b.c(runtimeException);
    }

    @Override // n1.AbstractC1307K
    public final void e(C1300D c1300d) {
        try {
            h(c1300d);
        } catch (DeadObjectException e3) {
            c(AbstractC1307K.g(e3));
            throw e3;
        } catch (RemoteException e6) {
            c(AbstractC1307K.g(e6));
        } catch (RuntimeException e7) {
            this.f11350b.c(e7);
        }
    }

    public final void h(C1300D c1300d) {
        if (c1300d.f11298i.remove(this.f11351c) != null) {
            throw new ClassCastException();
        }
        this.f11350b.d(Boolean.FALSE);
    }

    @Override // n1.AbstractC1307K
    public final /* bridge */ /* synthetic */ void f(S s2, boolean z) {
    }
}
