package c7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.z5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final d9.c f1982a;

    /* renamed from: h, reason: collision with root package name */
    public final z5 f1988h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1983b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1984c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1985d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1986e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f1987f = new AtomicInteger(0);
    public boolean g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1989i = new Object();

    public u(Looper looper, d9.c cVar) {
        this.f1982a = cVar;
        this.f1988h = new z5(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.wtf("GmsClientEvents", v4.a.n(new StringBuilder(String.valueOf(i3).length() + 34), "Don't know how to handle message: ", i3), new Exception());
            return false;
        }
        a7.k kVar = (a7.k) message.obj;
        synchronized (this.f1989i) {
            try {
                if (this.f1986e && ((b7.v) this.f1982a.f3701e).d() && this.f1983b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
