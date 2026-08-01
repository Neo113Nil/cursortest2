package g8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f4297b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4298a;

    public f(Context context) {
        this.f4298a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.j) {
            try {
                Iterator it = ((s.d) g.f4299k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4298a.unregisterReceiver(this);
    }
}
