package e3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3802a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f3806e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3807f;
    public PendingIntent g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f3808h;

    /* renamed from: i, reason: collision with root package name */
    public int f3809i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public i f3811l;

    /* renamed from: m, reason: collision with root package name */
    public String f3812m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3813n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f3815p;

    /* renamed from: s, reason: collision with root package name */
    public String f3818s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3820u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f3821v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f3822w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3803b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3804c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3805d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f3810k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3814o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f3816q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3817r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f3819t = 0;

    public g(Context context, String str) {
        Notification notification = new Notification();
        this.f3821v = notification;
        this.f3802a = context;
        this.f3818s = str;
        notification.when = System.currentTimeMillis();
        this.f3821v.audioStreamType = -1;
        this.j = 0;
        this.f3822w = new ArrayList();
        this.f3820u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification build;
        Bundle bundle;
        o oVar = new o(this);
        g gVar = (g) oVar.f3830d;
        i iVar = gVar.f3811l;
        if (iVar != null) {
            iVar.a(oVar);
        }
        int i3 = oVar.f3827a;
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) oVar.f3829c;
        if (i10 >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
            if (i3 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i3 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i3 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
        }
        if (iVar != null) {
            gVar.f3811l.getClass();
        }
        if (iVar != null && (bundle = build.extras) != null) {
            if (iVar.f3826d) {
                bundle.putCharSequence("android.summaryText", iVar.f3825c);
            }
            CharSequence charSequence = iVar.f3824b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", iVar.b());
        }
        return build;
    }

    public final void c(int i3) {
        Notification notification = this.f3821v;
        notification.defaults = i3;
        if ((i3 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i3, boolean z10) {
        Notification notification = this.f3821v;
        if (z10) {
            notification.flags = i3 | notification.flags;
        } else {
            notification.flags = (~i3) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f3802a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f476k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f478b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f3808h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f3821v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(4).setUsage(5);
        this.f3821v.audioAttributes = usage.build();
    }

    public final void g(i iVar) {
        if (this.f3811l != iVar) {
            this.f3811l = iVar;
            if (iVar == null || iVar.f3823a == this) {
                return;
            }
            iVar.f3823a = this;
            g(iVar);
        }
    }
}
