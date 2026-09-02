package U0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class n implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final J1.c f2555a;

    /* renamed from: h, reason: collision with root package name */
    public final c1.e f2562h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2556b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2557c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2558d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f2559e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f2560f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f2561g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2563i = new Object();

    public n(Looper looper, J1.c cVar) {
        this.f2555a = cVar;
        this.f2562h = new c1.e(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i7);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        S0.e eVar = (S0.e) message.obj;
        synchronized (this.f2563i) {
            try {
                if (this.f2559e && ((T0.u) this.f2555a.f1289g).c() && this.f2556b.contains(eVar)) {
                    eVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
