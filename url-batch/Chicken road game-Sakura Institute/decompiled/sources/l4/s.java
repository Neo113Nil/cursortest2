package l4;

import a0.s0;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: b, reason: collision with root package name */
    public final s0 f6000b;

    /* renamed from: c, reason: collision with root package name */
    public final z4.c f6001c;

    /* renamed from: d, reason: collision with root package name */
    public final j4.i f6002d;

    public s(s0 s0Var, z4.c cVar, j4.i iVar) {
        super(2);
        this.f6001c = cVar;
        this.f6000b = s0Var;
        this.f6002d = iVar;
        if (s0Var.f136b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // l4.o
    public final boolean a(j jVar) {
        return this.f6000b.f136b;
    }

    @Override // l4.o
    public final j4.d[] b(j jVar) {
        return (j4.d[]) this.f6000b.f137c;
    }

    @Override // l4.o
    public final void c(Status status) {
        this.f6002d.getClass();
        this.f6001c.a(status.f1776h != null ? new k4.f(status) : new j4.g(status));
    }

    @Override // l4.o
    public final void d(Exception exc) {
        this.f6001c.a(exc);
    }

    @Override // l4.o
    public final void e(j jVar) {
        z4.c cVar = this.f6001c;
        try {
            this.f6000b.d(jVar.f5975d, cVar);
        } catch (DeadObjectException e9) {
            throw e9;
        } catch (RemoteException e10) {
            c(o.g(e10));
        } catch (RuntimeException e11) {
            cVar.a(e11);
        }
    }

    @Override // l4.o
    public final void f(androidx.room.c cVar, boolean z8) {
        Map map = (Map) cVar.f1070h;
        Boolean valueOf = Boolean.valueOf(z8);
        z4.c cVar2 = this.f6001c;
        map.put(cVar2, valueOf);
        z4.i iVar = cVar2.f10092a;
        androidx.room.c cVar3 = new androidx.room.c(15, cVar, cVar2, false);
        iVar.getClass();
        iVar.f10109b.i(new z4.f(z4.d.f10093a, cVar3));
        iVar.f();
    }
}
