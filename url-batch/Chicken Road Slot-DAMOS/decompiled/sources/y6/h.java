package y6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import c6.s;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f10645e;

    public /* synthetic */ h(j jVar, int i3) {
        this.f10644d = i3;
        this.f10645e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10644d) {
            case 0:
                j jVar = this.f10645e;
                synchronized (jVar) {
                    if (jVar.f10647a == 1) {
                        jVar.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.f10645e.b("Service disconnected");
                return;
        }
        while (true) {
            j jVar2 = this.f10645e;
            synchronized (jVar2) {
                try {
                    if (jVar2.f10647a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = jVar2.f10650d;
                    if (arrayDeque.isEmpty()) {
                        jVar2.d();
                        return;
                    }
                    k kVar = (k) arrayDeque.poll();
                    SparseArray sparseArray = jVar2.f10651e;
                    int i3 = kVar.f10653a;
                    sparseArray.put(i3, kVar);
                    ((ScheduledExecutorService) jVar2.f10652f.f10661i).schedule(new u5.n(11, jVar2, kVar, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                    }
                    l lVar = jVar2.f10652f;
                    Messenger messenger = jVar2.f10648b;
                    int i10 = kVar.f10655c;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = i3;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", ((Context) lVar.f10660e).getPackageName());
                    bundle.putBundle("data", kVar.f10656d);
                    obtain.setData(bundle);
                    try {
                        s sVar = jVar2.f10649c;
                        Messenger messenger2 = (Messenger) sVar.f1868d;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            f fVar = (f) sVar.f1869e;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            fVar.f10641d.send(obtain);
                        }
                    } catch (RemoteException e2) {
                        jVar2.b(e2.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
