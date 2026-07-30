package P1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import u.C0933d;

/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f2266b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2267a;

    public f(Context context) {
        this.f2267a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f2268k) {
            try {
                Iterator it = ((C0933d) g.f2269l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2267a.unregisterReceiver(this);
    }
}
