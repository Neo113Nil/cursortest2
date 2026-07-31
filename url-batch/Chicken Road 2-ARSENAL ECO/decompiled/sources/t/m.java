package t;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import x.AbstractC0724b;

/* loaded from: classes.dex */
public final class m extends r {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f5912e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f5913f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5914g;

    @Override // t.r
    public final void a(V5.u uVar) {
        Bitmap a7;
        Notification.Builder builder = (Notification.Builder) uVar.f2770d;
        Context context = (Context) uVar.f2769c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(this.f5941b);
        IconCompat iconCompat = this.f5912e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l.a(bigContentTitle, AbstractC0724b.c(iconCompat, context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f5912e;
                int i7 = iconCompat2.f3407a;
                if (i7 == -1) {
                    Object obj = iconCompat2.f3408b;
                    a7 = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i7 == 1) {
                    a7 = (Bitmap) iconCompat2.f3408b;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    a7 = IconCompat.a((Bitmap) iconCompat2.f3408b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(a7);
            }
        }
        if (this.f5914g) {
            IconCompat iconCompat3 = this.f5913f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                k.a(bigContentTitle, AbstractC0724b.c(iconCompat3, context));
            }
        }
        if (this.f5943d) {
            bigContentTitle.setSummaryText(this.f5942c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l.c(bigContentTitle, false);
            l.b(bigContentTitle, null);
        }
    }

    @Override // t.r
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
