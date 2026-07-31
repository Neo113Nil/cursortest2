package r3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;

/* loaded from: classes.dex */
final class d1 extends h {

    /* renamed from: e, reason: collision with root package name */
    private final Context f21249e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f21250f;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<z0, b1> f21248d = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final u3.a f21251g = u3.a.b();

    /* renamed from: h, reason: collision with root package name */
    private final long f21252h = 5000;

    /* renamed from: i, reason: collision with root package name */
    private final long f21253i = 300000;

    d1(Context context) {
        this.f21249e = context.getApplicationContext();
        this.f21250f = new b4.d(context.getMainLooper(), new c1(this, null));
    }

    @Override // r3.h
    protected final boolean d(z0 z0Var, ServiceConnection serviceConnection, String str) {
        boolean e7;
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21248d) {
            b1 b1Var = this.f21248d.get(z0Var);
            if (b1Var == null) {
                b1Var = new b1(this, z0Var);
                b1Var.c(serviceConnection, serviceConnection, str);
                b1Var.a(str);
                this.f21248d.put(z0Var, b1Var);
            } else {
                this.f21250f.removeMessages(0, z0Var);
                if (b1Var.g(serviceConnection)) {
                    String valueOf = String.valueOf(z0Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                b1Var.c(serviceConnection, serviceConnection, str);
                int f7 = b1Var.f();
                if (f7 == 1) {
                    serviceConnection.onServiceConnected(b1Var.j(), b1Var.i());
                } else if (f7 == 2) {
                    b1Var.a(str);
                }
            }
            e7 = b1Var.e();
        }
        return e7;
    }

    @Override // r3.h
    protected final void e(z0 z0Var, ServiceConnection serviceConnection, String str) {
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f21248d) {
            b1 b1Var = this.f21248d.get(z0Var);
            if (b1Var == null) {
                String valueOf = String.valueOf(z0Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!b1Var.g(serviceConnection)) {
                String valueOf2 = String.valueOf(z0Var);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            b1Var.d(serviceConnection, str);
            if (b1Var.h()) {
                this.f21250f.sendMessageDelayed(this.f21250f.obtainMessage(0, z0Var), this.f21252h);
            }
        }
    }
}
