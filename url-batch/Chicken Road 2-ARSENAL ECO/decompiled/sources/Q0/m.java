package Q0;

import H1.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u0.C0689s;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f1992a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f1993b;

    /* renamed from: c, reason: collision with root package name */
    public C0689s f1994c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f1995d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f1996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1997f;

    public m(o oVar) {
        this.f1997f = oVar;
        c1.e eVar = new c1.e(Looper.getMainLooper(), new l(0, this));
        Looper.getMainLooper();
        this.f1993b = new Messenger(eVar);
        this.f1995d = new ArrayDeque();
        this.f1996e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i7 = this.f1992a;
            if (i7 == 0) {
                throw new IllegalStateException();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.f1992a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f1992a = 4;
            X0.a.a().b((Context) this.f1997f.f2005b, this);
            z zVar = new z(str, securityException);
            Iterator it = this.f1995d.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(zVar);
            }
            this.f1995d.clear();
            for (int i8 = 0; i8 < this.f1996e.size(); i8++) {
                ((n) this.f1996e.valueAt(i8)).b(zVar);
            }
            this.f1996e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f1992a == 2 && this.f1995d.isEmpty() && this.f1996e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f1992a = 3;
                X0.a.a().b((Context) this.f1997f.f2005b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(n nVar) {
        Throwable th;
        int i7;
        X0.a a7;
        Context context;
        try {
            try {
                i7 = this.f1992a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        this.f1995d.add(nVar);
                        return true;
                    }
                    if (i7 != 2) {
                        return false;
                    }
                    this.f1995d.add(nVar);
                    ((ScheduledExecutorService) this.f1997f.f2006c).execute(new k(this, 0));
                    return true;
                }
                this.f1995d.add(nVar);
                if (this.f1992a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f1992a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a7 = X0.a.a();
                    context = (Context) this.f1997f.f2005b;
                } catch (SecurityException e4) {
                    e = e4;
                }
                try {
                    if (a7.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f1997f.f2006c).schedule(new k(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e7) {
                    e = e7;
                    b("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f1997f.f2006c).execute(new A.a(this, 5, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f1997f.f2006c).execute(new k(this, 2));
    }
}
