package G1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f3152a;

    /* renamed from: b, reason: collision with root package name */
    public final y.t f3153b;

    public q(y.t tVar) {
        this.f3153b = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((j) this.f3153b.f11495i).getClass();
            throw null;
        }
    }
}
