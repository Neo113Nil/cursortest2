package M0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f949a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f950b;

    public q(V0.e eVar) {
        this.f950b = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f950b.f1600c;
            throw null;
        }
    }
}
