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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tu1 implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public c51 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ xu1 f;

    public tu1(xu1 xu1Var) {
        this.f = xu1Var;
        gt1 gt1Var = new gt1(Looper.getMainLooper(), new pu1(0, this));
        Looper.getMainLooper();
        this.b = new Messenger(gt1Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            s40.s().C((Context) this.f.b, this);
            d91 d91Var = new d91(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((vu1) it.next()).b(d91Var);
            }
            this.d.clear();
            int i2 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((vu1) sparseArray.valueAt(i2)).b(d91Var);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                s40.s().C((Context) this.f.b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(vu1 vu1Var) {
        tu1 tu1Var;
        Throwable th;
        int i;
        try {
            try {
                i = this.a;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    tu1Var = this;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            tu1Var = this;
            th = th;
            throw th;
        }
        if (i != 0) {
            if (i == 1) {
                this.d.add(vu1Var);
                return true;
            }
            int i2 = 0;
            if (i != 2) {
                return false;
            }
            this.d.add(vu1Var);
            ((ScheduledExecutorService) this.f.c).execute(new lu1(this, i2));
            return true;
        }
        this.d.add(vu1Var);
        try {
            if (this.a == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    s40 s = s40.s();
                    try {
                        Context context = (Context) this.f.b;
                        try {
                            tu1Var = this;
                            try {
                                try {
                                    if (s.F(context, context.getClass().getName(), intent, tu1Var, 1, null)) {
                                        ((ScheduledExecutorService) tu1Var.f.c).schedule(new lu1(tu1Var, 1), 30L, TimeUnit.SECONDS);
                                    } else {
                                        tu1Var.a("Unable to bind to service");
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (SecurityException e) {
                                e = e;
                                tu1Var.b("Unable to bind to service", e);
                                return true;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            tu1Var = this;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        tu1Var = this;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    tu1Var = this;
                }
                return true;
            }
            tu1Var = this;
            try {
                throw new IllegalStateException();
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        th = th;
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new lf(this, 11, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new lu1(this, i));
    }
}
