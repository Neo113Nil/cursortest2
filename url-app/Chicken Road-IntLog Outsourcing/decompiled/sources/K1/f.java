package K1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import r.C1400j;

/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f1383b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1384a;

    public f(Context context) {
        this.f1384a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f1385j) {
            try {
                Iterator it = ((C1400j) g.f1386k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1384a.unregisterReceiver(this);
    }
}
