package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gq3 implements ServiceConnection {
    public int m = 0;
    public final Messenger n;
    public tt1 o;
    public final ArrayDeque p;
    public final SparseArray q;
    public final /* synthetic */ vs3 r;

    public gq3(vs3 vs3Var) {
        this.r = vs3Var;
        bb3 bb3Var = new bb3(Looper.getMainLooper(), new cn3(0, this));
        Looper.getMainLooper();
        this.n = new Messenger(bb3Var);
        this.p = new ArrayDeque();
        this.q = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.m;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.m = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.m = 4;
            i10.b().c((Context) this.r.b, this);
            ne neVar = new ne(str, securityException);
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((ds3) it.next()).b(neVar);
            }
            this.p.clear();
            int i2 = 0;
            while (true) {
                int size = this.q.size();
                SparseArray sparseArray = this.q;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((ds3) sparseArray.valueAt(i2)).b(neVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.m == 2 && this.p.isEmpty() && this.q.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.m = 3;
                i10.b().c((Context) this.r.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(ds3 ds3Var) {
        int i = this.m;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.p.add(ds3Var);
                return true;
            }
            int i3 = 0;
            if (i != 2) {
                return false;
            }
            this.p.add(ds3Var);
            ((ScheduledExecutorService) this.r.c).execute(new kk3(this, i3));
            return true;
        }
        this.p.add(ds3Var);
        if (this.m != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.m = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (i10.b().a((Context) this.r.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.r.c).schedule(new kk3(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.r.c).execute(new iu0(20, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.r.c).execute(new kk3(this, i));
    }
}
