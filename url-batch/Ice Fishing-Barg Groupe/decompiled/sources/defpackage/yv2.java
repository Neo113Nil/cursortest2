package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yv2 extends BroadcastReceiver {
    public Context PxuCJdSBwIXG;
    public final cr1 lS5Rgt96tfkO;

    public yv2(cr1 cr1Var) {
        this.lS5Rgt96tfkO = cr1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.lS5Rgt96tfkO.wdg6QnbFHrFF;
            throw null;
        }
    }
}
