package m1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import q.C0590j;

/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f5421b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5422a;

    public f(Context context) {
        this.f5422a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f5423j) {
            try {
                Iterator it = ((C0590j) g.f5424k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5422a.unregisterReceiver(this);
    }
}
