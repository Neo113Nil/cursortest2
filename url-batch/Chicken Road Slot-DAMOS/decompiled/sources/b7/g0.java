package b7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Context f1289b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1290c;

    public g0(u uVar) {
        this.f1290c = uVar;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f1290c;
        if (xVar != null) {
            Context context = xVar.f3184i.f3079b;
            this.f1289b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public synchronized void b() {
        try {
            Context context = this.f1289b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f1289b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1288a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((u) this.f1290c).a();
                    b();
                    break;
                }
                break;
            default:
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f1290c;
                if (xVar != null && xVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.x xVar2 = (com.google.firebase.messaging.x) this.f1290c;
                    xVar2.f3184i.getClass();
                    FirebaseMessaging.b(xVar2, 0L);
                    Context context2 = this.f1289b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f1290c = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0() {
    }
}
