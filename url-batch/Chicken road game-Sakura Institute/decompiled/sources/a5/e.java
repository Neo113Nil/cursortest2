package a5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f495b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f496a;

    public e(Context context) {
        this.f496a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f497i) {
            try {
                Iterator it = ((i.d) f.f498j.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f496a.unregisterReceiver(this);
    }
}
