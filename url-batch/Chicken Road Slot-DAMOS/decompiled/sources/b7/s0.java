package b7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final a8.l f1356b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.g f1357c;

    /* renamed from: d, reason: collision with root package name */
    public final u8.d f1358d;

    public s0(int i3, a8.l lVar, w7.g gVar, u8.d dVar) {
        super(i3);
        this.f1357c = gVar;
        this.f1356b = lVar;
        this.f1358d = dVar;
        if (i3 == 2 && lVar.f356a) {
            a1.e("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // b7.l0
    public final z6.d[] a(b0 b0Var) {
        return (z6.d[]) this.f1356b.f358c;
    }

    @Override // b7.l0
    public final boolean b(b0 b0Var) {
        return this.f1356b.f356a;
    }

    @Override // b7.l0
    public final int c(b0 b0Var) {
        return this.f1356b.f357b;
    }

    @Override // b7.l0
    public final void d(Status status) {
        this.f1358d.getClass();
        this.f1357c.b(status.f2121i != null ? new a7.m(status) : new a7.e(status));
    }

    @Override // b7.l0
    public final void e(Exception exc) {
        this.f1357c.b(exc);
    }

    @Override // b7.l0
    public final void f(c6.c cVar, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Map map = (Map) cVar.f1810i;
        w7.g gVar = this.f1357c;
        map.put(gVar, valueOf);
        gVar.f10117a.addOnCompleteListener(new c6.e(cVar, gVar));
    }

    @Override // b7.l0
    public final void g(b0 b0Var) {
        w7.g gVar = this.f1357c;
        try {
            a8.l lVar = this.f1356b;
            ((i) ((a8.l) lVar.f359d).f358c).accept(b0Var.f1242e, gVar);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e9) {
            d(l0.h(e9));
        } catch (RuntimeException e10) {
            gVar.b(e10);
        }
    }
}
