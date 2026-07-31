package r2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.r00;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21183a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private cz f21184b;

    /* renamed from: c, reason: collision with root package name */
    private a f21185c;

    public static abstract class a {
        public void a() {
        }

        public void b(boolean z6) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public void a(a aVar) {
        r00 r00Var;
        synchronized (this.f21183a) {
            this.f21185c = aVar;
            cz czVar = this.f21184b;
            if (czVar != null) {
                if (aVar == null) {
                    r00Var = null;
                } else {
                    try {
                        r00Var = new r00(aVar);
                    } catch (RemoteException e7) {
                        io0.e("Unable to call setVideoLifecycleCallbacks on video controller.", e7);
                    }
                }
                czVar.M5(r00Var);
            }
        }
    }

    public final cz b() {
        cz czVar;
        synchronized (this.f21183a) {
            czVar = this.f21184b;
        }
        return czVar;
    }

    public final void c(cz czVar) {
        synchronized (this.f21183a) {
            this.f21184b = czVar;
            a aVar = this.f21185c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }
}
