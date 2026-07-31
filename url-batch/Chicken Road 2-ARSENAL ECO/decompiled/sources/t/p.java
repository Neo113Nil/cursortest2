package t;

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
import com.strategylink.Row.Five.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5917a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f5921e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f5922f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f5923g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f5924h;

    /* renamed from: i, reason: collision with root package name */
    public int f5925i;

    /* renamed from: j, reason: collision with root package name */
    public int f5926j;

    /* renamed from: l, reason: collision with root package name */
    public r f5928l;

    /* renamed from: m, reason: collision with root package name */
    public String f5929m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5930n;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f5932p;

    /* renamed from: s, reason: collision with root package name */
    public String f5935s;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5937u;

    /* renamed from: v, reason: collision with root package name */
    public Notification f5938v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f5939w;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5918b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5919c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5920d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f5927k = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5931o = false;

    /* renamed from: q, reason: collision with root package name */
    public int f5933q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f5934r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f5936t = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f5938v = notification;
        this.f5917a = context;
        this.f5935s = str;
        notification.when = System.currentTimeMillis();
        this.f5938v.audioStreamType = -1;
        this.f5926j = 0;
        this.f5939w = new ArrayList();
        this.f5937u = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        V5.u uVar = new V5.u(this);
        p pVar = (p) uVar.f2771e;
        r rVar = pVar.f5928l;
        if (rVar != null) {
            rVar.a(uVar);
        }
        Notification.Builder builder = (Notification.Builder) uVar.f2770d;
        int i7 = uVar.f2768b;
        if (Build.VERSION.SDK_INT >= 26) {
            notification = builder.build();
        } else {
            Notification build = builder.build();
            if (i7 != 0) {
                if (s.f(build) != null && (build.flags & 512) != 0 && i7 == 2) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
                if (s.f(build) != null && (build.flags & 512) == 0 && i7 == 1) {
                    build.sound = null;
                    build.vibrate = null;
                    build.defaults &= -4;
                }
            }
            notification = build;
        }
        if (rVar != null) {
            pVar.f5928l.getClass();
        }
        if (rVar != null && (bundle = notification.extras) != null) {
            if (rVar.f5943d) {
                bundle.putCharSequence("android.summaryText", rVar.f5942c);
            }
            CharSequence charSequence = rVar.f5941b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", rVar.b());
        }
        return notification;
    }

    public final void c(int i7) {
        Notification notification = this.f5938v;
        notification.defaults = i7;
        if ((i7 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i7, boolean z5) {
        if (z5) {
            Notification notification = this.f5938v;
            notification.flags = i7 | notification.flags;
        } else {
            Notification notification2 = this.f5938v;
            notification2.flags = (~i7) & notification2.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f5917a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f3406k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f3408b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f5924h = iconCompat;
    }

    public final void f(Uri uri) {
        Notification notification = this.f5938v;
        notification.sound = uri;
        notification.audioStreamType = -1;
        AudioAttributes.Builder e4 = o.e(o.c(o.b(), 4), 5);
        this.f5938v.audioAttributes = o.a(e4);
    }

    public final void g(r rVar) {
        if (this.f5928l != rVar) {
            this.f5928l = rVar;
            if (rVar == null || rVar.f5940a == this) {
                return;
            }
            rVar.f5940a = this;
            g(rVar);
        }
    }
}
