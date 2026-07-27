package o1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n1.C1337x;

/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final U.e f11576a;

    /* renamed from: h, reason: collision with root package name */
    public final A1.c f11583h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11577b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11578c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11579d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f11580e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f11581f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f11582g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11584i = new Object();

    public o(Looper looper, U.e eVar) {
        this.f11576a = eVar;
        this.f11583h = new A1.c(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            Log.wtf("GmsClientEvents", AbstractC0279e.d(i2, "Don't know how to handle message: "), new Exception());
            return false;
        }
        m1.i iVar = (m1.i) message.obj;
        synchronized (this.f11584i) {
            try {
                if (this.f11580e && ((C1337x) this.f11576a.f3053a).f() && this.f11577b.contains(iVar)) {
                    iVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
