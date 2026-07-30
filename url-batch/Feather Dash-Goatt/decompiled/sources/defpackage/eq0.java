package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class eq0 extends hq0 {
    public CharSequence e;

    @Override // defpackage.hq0
    public final void a(i8 i8Var) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) i8Var.e).setBigContentTitle(this.b).bigText(this.e);
        if (this.d) {
            bigText.setSummaryText(this.c);
        }
    }

    @Override // defpackage.hq0
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
