package c2;

import a2.C0164d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    public final t2.d f5723b;

    public w(t2.d dVar) {
        super(4);
        this.f5723b = dVar;
    }

    @Override // c2.q
    public final boolean a(m mVar) {
        if (mVar.f5687f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // c2.q
    public final C0164d[] b(m mVar) {
        if (mVar.f5687f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // c2.q
    public final void c(Status status) {
        this.f5723b.a(new b2.d(status));
    }

    @Override // c2.q
    public final void d(Exception exc) {
        this.f5723b.a(exc);
    }

    @Override // c2.q
    public final void e(m mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e4) {
            c(q.g(e4));
            throw e4;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            this.f5723b.a(e6);
        }
    }

    public final void h(m mVar) {
        if (mVar.f5687f.remove(null) != null) {
            throw new ClassCastException();
        }
        t2.d dVar = this.f5723b;
        Boolean bool = Boolean.FALSE;
        t2.j jVar = dVar.f15407a;
        synchronized (jVar.f15418a) {
            try {
                if (jVar.f15420c) {
                    return;
                }
                jVar.f15420c = true;
                jVar.f15422e = bool;
                jVar.f15419b.c(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c2.q
    public final /* bridge */ /* synthetic */ void f(l2.e eVar, boolean z) {
    }
}
