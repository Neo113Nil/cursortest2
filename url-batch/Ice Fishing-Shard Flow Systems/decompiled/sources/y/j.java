package y;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f8470e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f8471f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8472g;

    @Override // y.n
    public final void a(B6.v vVar) {
        Bitmap a7;
        Notification.Builder builder = (Notification.Builder) vVar.f261d;
        Context context = (Context) vVar.f260c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f8498b);
        IconCompat iconCompat = this.f8470e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f8470e;
                int i2 = iconCompat2.f3368a;
                if (i2 == -1) {
                    Object obj = iconCompat2.f3369b;
                    a7 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i2 == 1) {
                    a7 = (Bitmap) iconCompat2.f3369b;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a7 = IconCompat.a((Bitmap) iconCompat2.f3369b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a7);
            }
        }
        if (this.f8472g) {
            IconCompat iconCompat3 = this.f8471f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat3.f(context));
            }
        }
        if (this.f8500d) {
            bigContentTitle.setSummaryText(this.f8499c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            i.c(bigContentTitle, false);
            i.b(bigContentTitle, null);
        }
    }

    @Override // y.n
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
