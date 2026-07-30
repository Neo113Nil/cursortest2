package k2;

import android.os.RemoteException;
import q2.A0;
import q2.Z0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38736a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public A0 f38737b;

    /* renamed from: c, reason: collision with root package name */
    public u f38738c;

    public final void a(u uVar) {
        Z0 z02;
        synchronized (this.f38736a) {
            this.f38738c = uVar;
            A0 a02 = this.f38737b;
            if (a02 == null) {
                return;
            }
            if (uVar == null) {
                z02 = null;
            } else {
                try {
                    z02 = new Z0(uVar);
                } catch (RemoteException e6) {
                    u2.i.d("Unable to call setVideoLifecycleCallbacks on video controller.", e6);
                }
            }
            a02.d2(z02);
        }
    }

    public final void b(A0 a02) {
        synchronized (this.f38736a) {
            try {
                this.f38737b = a02;
                u uVar = this.f38738c;
                if (uVar != null) {
                    a(uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
