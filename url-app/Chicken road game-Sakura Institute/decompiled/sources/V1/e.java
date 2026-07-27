package V1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i.C0669d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f4161b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4162a;

    public e(Context context) {
        this.f4162a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f4163i) {
            try {
                Iterator it = ((C0669d) f.f4164j.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4162a.unregisterReceiver(this);
    }
}
