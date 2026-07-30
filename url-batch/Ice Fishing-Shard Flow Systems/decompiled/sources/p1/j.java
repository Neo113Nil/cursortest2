package p1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.messaging.y;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f7179a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f7180b;

    /* renamed from: c, reason: collision with root package name */
    public P0.e f7181c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7182d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f7183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f7184f;

    public j(l lVar) {
        this.f7184f = lVar;
        C1.e eVar = new C1.e(Looper.getMainLooper(), new Handler.Callback() { // from class: p1.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 30);
                    sb.append("Received response to request: ");
                    sb.append(i2);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                j jVar = j.this;
                synchronized (jVar) {
                    try {
                        SparseArray sparseArray = jVar.f7183e;
                        k kVar = (k) sparseArray.get(i2);
                        if (kVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 39);
                            sb2.append("Received response for unknown request: ");
                            sb2.append(i2);
                            Log.w("MessengerIpcClient", sb2.toString());
                            return true;
                        }
                        sparseArray.remove(i2);
                        jVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.c(new y("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (kVar.f7189e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    kVar.b(null);
                                    return true;
                                }
                                kVar.c(new y("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                kVar.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f7180b = new Messenger(eVar);
        this.f7182d = new ArrayDeque();
        this.f7183e = new SparseArray();
    }

    public final synchronized boolean a(k kVar) {
        Throwable th;
        int i2;
        w1.a a7;
        l lVar;
        Context context;
        try {
            try {
                i2 = this.f7179a;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.f7182d.add(kVar);
                        return true;
                    }
                    if (i2 != 2) {
                        return false;
                    }
                    this.f7182d.add(kVar);
                    ((ScheduledExecutorService) this.f7184f.f7193c).execute(new RunnableC0825h(this, 1));
                    return true;
                }
                this.f7182d.add(kVar);
                if (this.f7179a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f7179a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a7 = w1.a.a();
                    lVar = this.f7184f;
                    context = (Context) lVar.f7192b;
                } catch (SecurityException e7) {
                    e = e7;
                }
                try {
                    if (a7.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        ((ScheduledExecutorService) lVar.f7193c).schedule(new RunnableC0825h(this, 0), 30L, TimeUnit.SECONDS);
                    } else {
                        b("Unable to bind to service");
                    }
                } catch (SecurityException e8) {
                    e = e8;
                    c("Unable to bind to service", e);
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

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.f7179a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f7179a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f7179a = 4;
            w1.a.a().b((Context) this.f7184f.f7192b, this);
            y yVar = new y(str, securityException);
            ArrayDeque arrayDeque = this.f7182d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(yVar);
            }
            arrayDeque.clear();
            int i5 = 0;
            while (true) {
                SparseArray sparseArray = this.f7183e;
                if (i5 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((k) sparseArray.valueAt(i5)).c(yVar);
                    i5++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f7179a == 2 && this.f7182d.isEmpty() && this.f7183e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f7179a = 3;
                w1.a.a().b((Context) this.f7184f.f7192b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f7184f.f7193c).execute(new F.a(this, 23, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f7184f.f7193c).execute(new RunnableC0825h(this, 2));
    }
}
