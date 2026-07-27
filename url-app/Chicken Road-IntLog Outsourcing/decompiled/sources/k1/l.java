package k1;

import B0.t;
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
import f2.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import r1.C1403a;

/* loaded from: classes.dex */
public final class l implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f10699a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f10700b;

    /* renamed from: c, reason: collision with root package name */
    public t f10701c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f10702d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f10703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f10704f;

    public l(n nVar) {
        this.f10704f = nVar;
        A1.c cVar = new A1.c(Looper.getMainLooper(), new Handler.Callback() { // from class: k1.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                l lVar = l.this;
                synchronized (lVar) {
                    try {
                        m mVar = (m) lVar.f10703e.get(i2);
                        if (mVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                            return true;
                        }
                        lVar.f10703e.remove(i2);
                        lVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mVar.b(new s("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (mVar.f10709e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    mVar.c(null);
                                    return true;
                                }
                                mVar.b(new s("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                mVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f10700b = new Messenger(cVar);
        this.f10702d = new ArrayDeque();
        this.f10703e = new SparseArray();
    }

    public final synchronized void a(int i2, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.f10699a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f10699a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f10699a = 4;
            C1403a.a().b((Context) this.f10704f.f10712b, this);
            s sVar = new s(str, securityException);
            Iterator it = this.f10702d.iterator();
            while (it.hasNext()) {
                ((m) it.next()).b(sVar);
            }
            this.f10702d.clear();
            for (int i3 = 0; i3 < this.f10703e.size(); i3++) {
                ((m) this.f10703e.valueAt(i3)).b(sVar);
            }
            this.f10703e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f10699a == 2 && this.f10702d.isEmpty() && this.f10703e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f10699a = 3;
                C1403a.a().b((Context) this.f10704f.f10712b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(m mVar) {
        int i2 = this.f10699a;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f10702d.add(mVar);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            this.f10702d.add(mVar);
            ((ScheduledExecutorService) this.f10704f.f10713c).execute(new j(this, 0));
            return true;
        }
        this.f10702d.add(mVar);
        if (this.f10699a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f10699a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            C1403a a6 = C1403a.a();
            Context context = (Context) this.f10704f.f10712b;
            if (a6.c(context, context.getClass().getName(), intent, this, 1, null)) {
                ((ScheduledExecutorService) this.f10704f.f10713c).schedule(new j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e3) {
            b("Unable to bind to service", e3);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f10704f.f10713c).execute(new A0.a(this, iBinder, 26, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f10704f.f10713c).execute(new j(this, 2));
    }
}
