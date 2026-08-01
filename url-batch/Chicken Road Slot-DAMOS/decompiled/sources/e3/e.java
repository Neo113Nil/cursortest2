package e3;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f3798e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f3799f;
    public boolean g;

    @Override // e3.i
    public final void a(o oVar) {
        Bitmap a9;
        Notification.Builder builder = (Notification.Builder) oVar.f3829c;
        Context context = (Context) oVar.f3828b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f3824b);
        IconCompat iconCompat = this.f3798e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                d.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f3798e;
                int i3 = iconCompat2.f477a;
                if (i3 == -1) {
                    Object obj = iconCompat2.f478b;
                    a9 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i3 == 1) {
                    a9 = (Bitmap) iconCompat2.f478b;
                } else {
                    if (i3 != 5) {
                        a2.r.s(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    a9 = IconCompat.a((Bitmap) iconCompat2.f478b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a9);
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f3799f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (this.f3826d) {
            bigContentTitle.setSummaryText(this.f3825c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            d.c(bigContentTitle, false);
            d.b(bigContentTitle, null);
        }
    }

    @Override // e3.i
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
