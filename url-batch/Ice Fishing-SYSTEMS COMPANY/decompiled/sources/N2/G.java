package N2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class G extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2003a;

    /* renamed from: b, reason: collision with root package name */
    public final U2.a f2004b;

    public G(U2.a aVar) {
        this.f2004b = aVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f2003a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f2003a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2004b.q();
            a();
        }
    }
}
