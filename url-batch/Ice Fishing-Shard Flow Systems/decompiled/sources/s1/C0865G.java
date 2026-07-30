package s1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: s1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865G extends AbstractC0862D {

    /* renamed from: b, reason: collision with root package name */
    public final h4.w f7618b;

    /* renamed from: c, reason: collision with root package name */
    public final K1.h f7619c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.b f7620d;

    public C0865G(int i2, h4.w wVar, K1.h hVar, r4.b bVar) {
        super(i2);
        this.f7619c = hVar;
        this.f7618b = wVar;
        this.f7620d = bVar;
        if (i2 == 2 && wVar.f5278a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // s1.AbstractC0862D
    public final q1.d[] a(v vVar) {
        return (q1.d[]) this.f7618b.f5280c;
    }

    @Override // s1.AbstractC0862D
    public final boolean b(v vVar) {
        return this.f7618b.f5278a;
    }

    @Override // s1.AbstractC0862D
    public final int c(v vVar) {
        return this.f7618b.f5279b;
    }

    @Override // s1.AbstractC0862D
    public final void d(Status status) {
        this.f7620d.getClass();
        this.f7619c.c(status.f4371i != null ? new r1.m(status) : new r1.f(status));
    }

    @Override // s1.AbstractC0862D
    public final void e(Exception exc) {
        this.f7619c.c(exc);
    }

    @Override // s1.AbstractC0862D
    public final void f(P0.s sVar, boolean z7) {
        Boolean valueOf = Boolean.valueOf(z7);
        Map map = (Map) sVar.f2252e;
        K1.h hVar = this.f7619c;
        map.put(hVar, valueOf);
        hVar.f1428a.addOnCompleteListener(new P0.c(sVar, hVar));
    }

    @Override // s1.AbstractC0862D
    public final void g(v vVar) {
        K1.h hVar = this.f7619c;
        try {
            h4.w wVar = this.f7618b;
            ((InterfaceC0875f) ((h4.w) wVar.f5281d).f5280c).accept(vVar.f7736f, hVar);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e8) {
            d(AbstractC0862D.h(e8));
        } catch (RuntimeException e9) {
            hVar.c(e9);
        }
    }
}
