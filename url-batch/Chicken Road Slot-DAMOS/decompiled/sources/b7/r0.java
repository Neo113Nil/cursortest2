package b7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.h1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f1341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1342c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1343d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(e eVar, w7.g gVar) {
        this(4, gVar);
        this.f1342c = 1;
        this.f1343d = eVar;
    }

    @Override // b7.l0
    public final z6.d[] a(b0 b0Var) {
        switch (this.f1342c) {
            case 0:
                return (z6.d[]) ((n0) this.f1343d).f1320a.f1327c;
            default:
                n0 n0Var = (n0) b0Var.f1245i.get((e) this.f1343d);
                if (n0Var == null) {
                    return null;
                }
                return (z6.d[]) n0Var.f1320a.f1327c;
        }
    }

    @Override // b7.l0
    public final boolean b(b0 b0Var) {
        switch (this.f1342c) {
            case 0:
                return ((n0) this.f1343d).f1320a.f1325a;
            default:
                n0 n0Var = (n0) b0Var.f1245i.get((e) this.f1343d);
                return n0Var != null && n0Var.f1320a.f1325a;
        }
    }

    @Override // b7.l0
    public final int c(b0 b0Var) {
        switch (this.f1342c) {
            case 0:
                return 0;
            default:
                return ((n0) b0Var.f1245i.get((e) this.f1343d)) != null ? 0 : -1;
        }
    }

    @Override // b7.l0
    public final void d(Status status) {
        this.f1341b.b(new a7.e(status));
    }

    @Override // b7.l0
    public final void e(Exception exc) {
        this.f1341b.b(exc);
    }

    @Override // b7.l0
    public final /* bridge */ /* synthetic */ void f(c6.c cVar, boolean z10) {
        int i3 = this.f1342c;
    }

    @Override // b7.l0
    public final void g(b0 b0Var) {
        try {
            k(b0Var);
        } catch (DeadObjectException e2) {
            d(l0.h(e2));
            throw e2;
        } catch (RemoteException e9) {
            d(l0.h(e9));
        } catch (RuntimeException e10) {
            this.f1341b.b(e10);
        }
    }

    public final void k(b0 b0Var) {
        switch (this.f1342c) {
            case 0:
                n0 n0Var = (n0) this.f1343d;
                o0 o0Var = n0Var.f1320a;
                ((a1.n) ((h) o0Var.f1328d).f1293b).accept(b0Var.f1242e, this.f1341b);
                e eVar = ((f) o0Var.f1326b).f1286b;
                if (eVar != null) {
                    b0Var.f1245i.put(eVar, n0Var);
                    break;
                }
                break;
            default:
                n0 n0Var2 = (n0) b0Var.f1245i.remove((e) this.f1343d);
                if (n0Var2 == null) {
                    this.f1341b.c(Boolean.FALSE);
                    break;
                } else {
                    c7.i iVar = b0Var.f1242e;
                    ((h1) ((h) n0Var2.f1321b.f3701e).f1294c).getClass();
                    int i3 = da.f2231k;
                    ((f) n0Var2.f1320a.f1326b).f1286b = null;
                    break;
                }
        }
    }

    public r0(int i3, w7.g gVar) {
        super(i3);
        this.f1341b = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(n0 n0Var, w7.g gVar) {
        this(3, gVar);
        this.f1342c = 0;
        this.f1343d = n0Var;
    }

    private final /* bridge */ /* synthetic */ void i(c6.c cVar, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(c6.c cVar, boolean z10) {
    }
}
