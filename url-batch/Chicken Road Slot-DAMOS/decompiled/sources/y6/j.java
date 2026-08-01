package y6;

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
import c6.s;
import c7.c0;
import com.google.android.gms.internal.measurement.z5;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f10647a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f10648b;

    /* renamed from: c, reason: collision with root package name */
    public s f10649c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f10650d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f10651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f10652f;

    public j(l lVar) {
        this.f10652f = lVar;
        z5 z5Var = new z5(Looper.getMainLooper(), new Handler.Callback() { // from class: y6.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i3 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i3);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                j jVar = j.this;
                synchronized (jVar) {
                    try {
                        SparseArray sparseArray = jVar.f10651e;
                        k kVar = (k) sparseArray.get(i3);
                        if (kVar == null) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i3);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        sparseArray.remove(i3);
                        jVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            kVar.c(new b1.j("Not supported by GmsCore", null, 8));
                            return true;
                        }
                        switch (kVar.f10657e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    kVar.b(null);
                                    return true;
                                }
                                kVar.c(new b1.j("Invalid response to one way request", null, 8));
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
        this.f10648b = new Messenger(z5Var);
        this.f10650d = new ArrayDeque();
        this.f10651e = new SparseArray();
    }

    public final synchronized boolean a(k kVar) {
        int i3 = this.f10647a;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f10650d.add(kVar);
                return true;
            }
            if (i3 != 2) {
                return false;
            }
            this.f10650d.add(kVar);
            ((ScheduledExecutorService) this.f10652f.f10661i).execute(new h(this, 1));
            return true;
        }
        this.f10650d.add(kVar);
        c0.j(this.f10647a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f10647a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            f7.a b10 = f7.a.b();
            l lVar = this.f10652f;
            if (b10.a((Context) lVar.f10660e, intent, this, 1)) {
                ((ScheduledExecutorService) lVar.f10661i).schedule(new h(this, 0), 30L, TimeUnit.SECONDS);
            } else {
                b("Unable to bind to service");
            }
        } catch (SecurityException e2) {
            c("Unable to bind to service", e2);
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i3 = this.f10647a;
            if (i3 == 0) {
                throw new IllegalStateException();
            }
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.f10647a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f10647a = 4;
            f7.a.b().c((Context) this.f10652f.f10660e, this);
            b1.j jVar = new b1.j(str, securityException, 8);
            ArrayDeque arrayDeque = this.f10650d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(jVar);
            }
            arrayDeque.clear();
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f10651e;
                if (i10 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((k) sparseArray.valueAt(i10)).c(jVar);
                    i10++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f10647a == 2 && this.f10650d.isEmpty() && this.f10651e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f10647a = 3;
                f7.a.b().c((Context) this.f10652f.f10660e, this);
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
        ((ScheduledExecutorService) this.f10652f.f10661i).execute(new u5.n(10, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f10652f.f10661i).execute(new h(this, 2));
    }
}
