package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p3.a;

/* loaded from: classes.dex */
public final class s0<ResultT> extends h0 {

    /* renamed from: b, reason: collision with root package name */
    private final n<a.b, ResultT> f20316b;

    /* renamed from: c, reason: collision with root package name */
    private final j4.i<ResultT> f20317c;

    /* renamed from: d, reason: collision with root package name */
    private final m f20318d;

    public s0(int i7, n<a.b, ResultT> nVar, j4.i<ResultT> iVar, m mVar) {
        super(i7);
        this.f20317c = iVar;
        this.f20316b = nVar;
        this.f20318d = mVar;
        if (i7 == 2 && nVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // q3.u0
    public final void a(Status status) {
        this.f20317c.d(this.f20318d.a(status));
    }

    @Override // q3.u0
    public final void b(Exception exc) {
        this.f20317c.d(exc);
    }

    @Override // q3.u0
    public final void c(p pVar, boolean z6) {
        pVar.a(this.f20317c, z6);
    }

    @Override // q3.u0
    public final void d(z<?> zVar) {
        try {
            this.f20316b.b(zVar.s(), this.f20317c);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            a(u0.e(e8));
        } catch (RuntimeException e9) {
            this.f20317c.d(e9);
        }
    }

    @Override // q3.h0
    public final o3.d[] f(z<?> zVar) {
        return this.f20316b.d();
    }

    @Override // q3.h0
    public final boolean g(z<?> zVar) {
        return this.f20316b.c();
    }
}
