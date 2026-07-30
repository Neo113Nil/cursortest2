package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zs1 extends rp3 {
    public IconCompat n;
    public IconCompat o;
    public boolean p;

    @Override // defpackage.rp3
    public final void g(js0 js0Var) {
        Bitmap a;
        Notification.Builder builder = (Notification.Builder) js0Var.n;
        Context context = (Context) js0Var.m;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.n;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                ys1.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.n;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    a = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    a = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        b71.v(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    a = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a);
            }
        }
        if (this.p) {
            IconCompat iconCompat3 = this.o;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ys1.c(bigContentTitle, false);
            ys1.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.rp3
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
