package y;

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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8475a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8479e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8480f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f8481g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f8482h;

    /* renamed from: i, reason: collision with root package name */
    public int f8483i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public n f8485l;

    /* renamed from: m, reason: collision with root package name */
    public String f8486m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8487n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f8489p;

    /* renamed from: s, reason: collision with root package name */
    public String f8492s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8494u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f8495v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f8496w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8476b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8477c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8478d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f8484k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8488o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f8490q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f8491r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f8493t = 0;

    public l(Context context, String str) {
        Notification notification = new Notification();
        this.f8495v = notification;
        this.f8475a = context;
        this.f8492s = str;
        notification.when = System.currentTimeMillis();
        this.f8495v.audioStreamType = -1;
        this.j = 0;
        this.f8496w = new ArrayList();
        this.f8494u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        B6.v vVar = new B6.v(this);
        l lVar = (l) vVar.f262e;
        n nVar = lVar.f8485l;
        if (nVar != null) {
            nVar.a(vVar);
        }
        Notification.Builder builder = (Notification.Builder) vVar.f261d;
        int i2 = vVar.f259b;
        if (Build.VERSION.SDK_INT >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            if (i2 != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && i2 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && i2 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (nVar != null) {
            lVar.f8485l.getClass();
        }
        if (nVar != null && (bundle = notification.extras) != null) {
            if (nVar.f8500d) {
                bundle.putCharSequence("android.summaryText", nVar.f8499c);
            }
            CharSequence charSequence = nVar.f8498b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", nVar.b());
        }
        return notification;
    }

    public final void c(int i2) {
        Notification notification = this.f8495v;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i2, boolean z7) {
        if (z7) {
            Notification notification = this.f8495v;
            notification.flags = i2 | notification.flags;
        } else {
            Notification notification2 = this.f8495v;
            notification2.flags = (~i2) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f8475a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f3367k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f3369b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f8482h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f8495v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(4).setUsage(5);
        this.f8495v.audioAttributes = usage.build();
    }

    public final void g(n nVar) {
        if (this.f8485l != nVar) {
            this.f8485l = nVar;
            if (nVar == null || nVar.f8497a == this) {
                return;
            }
            nVar.f8497a = this;
            g(nVar);
        }
    }
}
