package K2;

import B2.RunnableC0272f;
import O2.w;
import S0.s;
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

/* loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public int f1592n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Messenger f1593u;

    /* renamed from: v, reason: collision with root package name */
    public s f1594v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayDeque f1595w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseArray f1596x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f1597y;

    public k(n nVar) {
        this.f1597y = nVar;
        Z2.e eVar = new Z2.e(Looper.getMainLooper(), new E3.e(2, this), 1);
        Looper.getMainLooper();
        this.f1593u = new Messenger(eVar);
        this.f1595w = new ArrayDeque();
        this.f1596x = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f1592n;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f1592n = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f1592n = 4;
            R2.b.a().b((Context) this.f1597y.f1605b, this);
            m mVar = new m(str, securityException);
            Iterator it = this.f1595w.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(mVar);
            }
            this.f1595w.clear();
            for (int i4 = 0; i4 < this.f1596x.size(); i4++) {
                ((l) this.f1596x.valueAt(i4)).b(mVar);
            }
            this.f1596x.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f1592n == 2 && this.f1595w.isEmpty() && this.f1596x.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f1592n = 3;
                R2.b.a().b((Context) this.f1597y.f1605b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(l lVar) {
        Throwable th;
        int i;
        R2.b a9;
        Context context;
        try {
            try {
                i = this.f1592n;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i != 0) {
                    if (i == 1) {
                        this.f1595w.add(lVar);
                        return true;
                    }
                    if (i != 2) {
                        return false;
                    }
                    this.f1595w.add(lVar);
                    ((ScheduledExecutorService) this.f1597y.f1606c).execute(new j(this, 0));
                    return true;
                }
                this.f1595w.add(lVar);
                w.k(this.f1592n == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f1592n = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a9 = R2.b.a();
                    context = (Context) this.f1597y.f1605b;
                } catch (SecurityException e6) {
                    e = e6;
                }
                try {
                    if (a9.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) this.f1597y.f1606c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
                    } else {
                        a("Unable to bind to service");
                    }
                } catch (SecurityException e9) {
                    e = e9;
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
        ((ScheduledExecutorService) this.f1597y.f1606c).execute(new RunnableC0272f(9, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f1597y.f1606c).execute(new j(this, 2));
    }
}
