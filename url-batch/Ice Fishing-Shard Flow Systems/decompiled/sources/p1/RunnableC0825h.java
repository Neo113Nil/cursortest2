package p1;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: p1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0825h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7177e;

    public /* synthetic */ RunnableC0825h(j jVar, int i2) {
        this.f7176d = i2;
        this.f7177e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7176d) {
            case 0:
                j jVar = this.f7177e;
                synchronized (jVar) {
                    if (jVar.f7179a == 1) {
                        jVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.f7177e.b("Service disconnected");
                return;
        }
        while (true) {
            j jVar2 = this.f7177e;
            synchronized (jVar2) {
                try {
                    if (jVar2.f7179a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = jVar2.f7182d;
                    if (arrayDeque.isEmpty()) {
                        jVar2.d();
                        return;
                    }
                    k kVar = (k) arrayDeque.poll();
                    SparseArray sparseArray = jVar2.f7183e;
                    int i2 = kVar.f7185a;
                    sparseArray.put(i2, kVar);
                    ((ScheduledExecutorService) jVar2.f7184f.f7193c).schedule(new F.a(jVar2, 24, kVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar2.f7184f;
                    Messenger messenger = jVar2.f7180b;
                    int i5 = kVar.f7187c;
                    Message obtain = Message.obtain();
                    obtain.what = i5;
                    obtain.arg1 = i2;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", ((Context) lVar.f7192b).getPackageName());
                    bundle.putBundle("data", kVar.f7188d);
                    obtain.setData(bundle);
                    try {
                        P0.e eVar = jVar2.f7181c;
                        Messenger messenger2 = (Messenger) eVar.f2194e;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            C0822e c0822e = (C0822e) eVar.f2195i;
                            if (c0822e == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            c0822e.f7169d.send(obtain);
                        }
                    } catch (RemoteException e7) {
                        jVar2.b(e7.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
