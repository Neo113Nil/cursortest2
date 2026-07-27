package u;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: u.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472m extends r {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f11999e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f12000f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12001g;

    @Override // u.r
    public final void a(R4.u uVar) {
        Bitmap a6;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) uVar.f2722d).setBigContentTitle(this.f12028b);
        IconCompat iconCompat = this.f11999e;
        Context context = (Context) uVar.f2721c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC1471l.a(bigContentTitle, y.b.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f11999e;
                int i2 = iconCompat2.f4308a;
                if (i2 == -1) {
                    Object obj = iconCompat2.f4309b;
                    a6 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i2 == 1) {
                    a6 = (Bitmap) iconCompat2.f4309b;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a6 = IconCompat.a((Bitmap) iconCompat2.f4309b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a6);
            }
        }
        if (this.f12001g) {
            IconCompat iconCompat3 = this.f12000f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC1470k.a(bigContentTitle, y.b.c(iconCompat3, context));
            }
        }
        if (this.f12030d) {
            bigContentTitle.setSummaryText(this.f12029c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC1471l.c(bigContentTitle, false);
            AbstractC1471l.b(bigContentTitle, null);
        }
    }

    @Override // u.r
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
