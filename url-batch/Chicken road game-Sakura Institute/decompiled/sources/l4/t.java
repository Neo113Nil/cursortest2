package l4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: b, reason: collision with root package name */
    public final z4.c f6003b;

    public t(z4.c cVar) {
        super(4);
        this.f6003b = cVar;
    }

    @Override // l4.o
    public final boolean a(j jVar) {
        if (jVar.f5979h.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // l4.o
    public final j4.d[] b(j jVar) {
        if (jVar.f5979h.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // l4.o
    public final void c(Status status) {
        this.f6003b.a(new j4.g(status));
    }

    @Override // l4.o
    public final void d(Exception exc) {
        this.f6003b.a(exc);
    }

    @Override // l4.o
    public final void e(j jVar) {
        try {
            h(jVar);
        } catch (DeadObjectException e9) {
            c(o.g(e9));
            throw e9;
        } catch (RemoteException e10) {
            c(o.g(e10));
        } catch (RuntimeException e11) {
            this.f6003b.a(e11);
        }
    }

    public final void h(j jVar) {
        if (jVar.f5979h.remove(null) != null) {
            throw new ClassCastException();
        }
        z4.c cVar = this.f6003b;
        Boolean bool = Boolean.FALSE;
        z4.i iVar = cVar.f10092a;
        synchronized (iVar.f10108a) {
            try {
                if (iVar.f10110c) {
                    return;
                }
                iVar.f10110c = true;
                iVar.f10112e = bool;
                iVar.f10109b.j(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l4.o
    public final /* bridge */ /* synthetic */ void f(androidx.room.c cVar, boolean z8) {
    }
}
