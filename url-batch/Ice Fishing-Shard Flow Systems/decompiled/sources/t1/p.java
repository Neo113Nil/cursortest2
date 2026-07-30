package t1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import i.C0511M;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s1.C0885p;

/* loaded from: classes.dex */
public final class p implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C0511M f7976a;

    /* renamed from: h, reason: collision with root package name */
    public final C1.e f7983h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7977b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7978c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7979d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f7980e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f7981f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f7982g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7984i = new Object();

    public p(Looper looper, C0511M c0511m) {
        this.f7976a = c0511m;
        this.f7983h = new C1.e(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("GmsClientEvents", sb.toString(), new Exception());
            return false;
        }
        r1.k kVar = (r1.k) message.obj;
        synchronized (this.f7984i) {
            try {
                if (this.f7980e && ((C0885p) this.f7976a.f5381e).a() && this.f7977b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
