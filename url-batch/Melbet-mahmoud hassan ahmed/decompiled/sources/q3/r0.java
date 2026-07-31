package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class r0<T> extends h0 {

    /* renamed from: b, reason: collision with root package name */
    protected final j4.i<T> f20314b;

    public r0(int i7, j4.i<T> iVar) {
        super(i7);
        this.f20314b = iVar;
    }

    @Override // q3.u0
    public final void a(Status status) {
        this.f20314b.d(new p3.b(status));
    }

    @Override // q3.u0
    public final void b(Exception exc) {
        this.f20314b.d(exc);
    }

    @Override // q3.u0
    public final void d(z<?> zVar) {
        try {
            h(zVar);
        } catch (DeadObjectException e7) {
            a(u0.e(e7));
            throw e7;
        } catch (RemoteException e8) {
            a(u0.e(e8));
        } catch (RuntimeException e9) {
            this.f20314b.d(e9);
        }
    }

    protected abstract void h(z<?> zVar);
}
