package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class at1 extends rp3 {
    public CharSequence n;

    @Override // defpackage.rp3
    public final void g(js0 js0Var) {
        new Notification.BigTextStyle((Notification.Builder) js0Var.n).setBigContentTitle(null).bigText(this.n);
    }

    @Override // defpackage.rp3
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
