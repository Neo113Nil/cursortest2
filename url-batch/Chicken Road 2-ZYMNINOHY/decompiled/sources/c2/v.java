package c2;

import a0.C0144j;
import a2.C0164d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final i f5720b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.d f5721c;

    /* renamed from: d, reason: collision with root package name */
    public final C0144j f5722d;

    public v(int i4, i iVar, t2.d dVar, C0144j c0144j) {
        super(i4);
        this.f5721c = dVar;
        this.f5720b = iVar;
        this.f5722d = c0144j;
        if (i4 == 2 && iVar.f5676b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // c2.q
    public final boolean a(m mVar) {
        return this.f5720b.f5676b;
    }

    @Override // c2.q
    public final C0164d[] b(m mVar) {
        return this.f5720b.f5675a;
    }

    @Override // c2.q
    public final void c(Status status) {
        this.f5722d.getClass();
        this.f5721c.a(status.f5775c != null ? new b2.j(status) : new b2.d(status));
    }

    @Override // c2.q
    public final void d(Exception exc) {
        this.f5721c.a(exc);
    }

    @Override // c2.q
    public final void e(m mVar) {
        t2.d dVar = this.f5721c;
        try {
            i iVar = this.f5720b;
            ((h) ((i) iVar.f5678d).f5678d).accept(mVar.f5683b, dVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            dVar.a(e6);
        }
    }

    @Override // c2.q
    public final void f(l2.e eVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) eVar.f14271c;
        t2.d dVar = this.f5721c;
        map.put(dVar, valueOf);
        t2.j jVar = dVar.f15407a;
        l2.e eVar2 = new l2.e(eVar, dVar, 27, false);
        jVar.getClass();
        jVar.f15419b.b(new t2.f(t2.e.f15408a, eVar2));
        jVar.g();
    }
}
