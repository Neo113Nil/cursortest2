package H1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class I extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public J f910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f911b;

    public I(J j4, J j7) {
        this.f911b = j4;
        this.f910a = j7;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f911b.f915f.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            J j4 = this.f910a;
            if (j4 == null) {
                return;
            }
            if (j4.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                J j7 = this.f910a;
                j7.f918i.f907f.schedule(j7, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f910a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
