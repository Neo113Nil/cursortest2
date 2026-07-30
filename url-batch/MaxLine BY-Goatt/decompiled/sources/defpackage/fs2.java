package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fs2 implements ComponentCallbacks2 {
    public final WeakReference m;
    public Context n;
    public vr1 o;
    public boolean p;
    public boolean q = true;

    public fs2(b72 b72Var) {
        this.m = new WeakReference(b72Var);
    }

    public final synchronized void a() {
        vr1 u30Var;
        try {
            b72 b72Var = (b72) this.m.get();
            if (b72Var == null) {
                b();
            } else if (this.o == null) {
                if (b72Var.d.b) {
                    Context context = b72Var.a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || o70.s(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        u30Var = new u30(8);
                    } else {
                        try {
                            u30Var = new mh(connectivityManager, this);
                        } catch (Exception unused) {
                            u30Var = new u30(8);
                        }
                    }
                } else {
                    u30Var = new u30(8);
                }
                this.o = u30Var;
                this.q = u30Var.c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.p) {
                return;
            }
            this.p = true;
            Context context = this.n;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            vr1 vr1Var = this.o;
            if (vr1Var != null) {
                vr1Var.shutdown();
            }
            this.m.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((b72) this.m.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        b72 b72Var = (b72) this.m.get();
        if (b72Var != null) {
            e72 e72Var = (e72) b72Var.c.getValue();
            if (e72Var != null) {
                e72Var.a.j(i);
                r5 r5Var = e72Var.b;
                synchronized (r5Var) {
                    if (i >= 10 && i != 20) {
                        r5Var.b();
                    }
                }
            }
        } else {
            b();
        }
    }
}
