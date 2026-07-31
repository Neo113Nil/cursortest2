package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import w.AbstractC3481b;

/* loaded from: classes.dex */
public abstract class s {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f11628a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f11629b;

        /* renamed from: c, reason: collision with root package name */
        private final A[] f11630c;

        /* renamed from: d, reason: collision with root package name */
        private final A[] f11631d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11632e;

        /* renamed from: f, reason: collision with root package name */
        boolean f11633f;

        /* renamed from: g, reason: collision with root package name */
        private final int f11634g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f11635h;

        /* renamed from: i, reason: collision with root package name */
        public int f11636i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f11637j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f11638k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f11639l;

        public a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i4 != 0 ? IconCompat.c(null, "", i4) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f11638k;
        }

        public boolean b() {
            return this.f11632e;
        }

        public Bundle c() {
            return this.f11628a;
        }

        public IconCompat d() {
            int i4;
            if (this.f11629b == null && (i4 = this.f11636i) != 0) {
                this.f11629b = IconCompat.c(null, "", i4);
            }
            return this.f11629b;
        }

        public A[] e() {
            return this.f11630c;
        }

        public int f() {
            return this.f11634g;
        }

        public boolean g() {
            return this.f11633f;
        }

        public CharSequence h() {
            return this.f11637j;
        }

        public boolean i() {
            return this.f11639l;
        }

        public boolean j() {
            return this.f11635h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, A[] aArr, A[] aArr2, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
            this.f11633f = true;
            this.f11629b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f11636i = iconCompat.e();
            }
            this.f11637j = e.d(charSequence);
            this.f11638k = pendingIntent;
            this.f11628a = bundle == null ? new Bundle() : bundle;
            this.f11630c = aArr;
            this.f11631d = aArr2;
            this.f11632e = z4;
            this.f11634g = i4;
            this.f11633f = z5;
            this.f11635h = z6;
            this.f11639l = z7;
        }
    }

    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f11640e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f11641f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f11642g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f11643h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f11644i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.s$b$b, reason: collision with other inner class name */
        private static class C0090b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z4) {
                bigPictureStyle.showBigPictureWhenCollapsed(z4);
            }
        }

        @Override // androidx.core.app.s.f
        public void b(r rVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(rVar.a()).setBigContentTitle(this.f11694b);
            IconCompat iconCompat = this.f11640e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0090b.a(bigContentTitle, this.f11640e.m(rVar instanceof t ? ((t) rVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f11640e.d());
                }
            }
            if (this.f11642g) {
                if (this.f11641f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f11641f.m(rVar instanceof t ? ((t) rVar).f() : null));
                }
            }
            if (this.f11696d) {
                bigContentTitle.setSummaryText(this.f11695c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0090b.c(bigContentTitle, this.f11644i);
                C0090b.b(bigContentTitle, this.f11643h);
            }
        }

        @Override // androidx.core.app.s.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f11641f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f11642g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f11640e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f11645e;

        @Override // androidx.core.app.s.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.s.f
        public void b(r rVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(rVar.a()).setBigContentTitle(this.f11694b).bigText(this.f11645e);
            if (this.f11696d) {
                bigText.setSummaryText(this.f11695c);
            }
        }

        @Override // androidx.core.app.s.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f11645e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected e f11693a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f11694b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f11695c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11696d = false;

        public void a(Bundle bundle) {
            if (this.f11696d) {
                bundle.putCharSequence("android.summaryText", this.f11695c);
            }
            CharSequence charSequence = this.f11694b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c4 = c();
            if (c4 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c4);
            }
        }

        public abstract void b(r rVar);

        protected abstract String c();

        public RemoteViews d(r rVar) {
            return null;
        }

        public RemoteViews e(r rVar) {
            return null;
        }

        public RemoteViews f(r rVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f11693a != eVar) {
                this.f11693a = eVar;
                if (eVar != null) {
                    eVar.v(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC3481b.f46496b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC3481b.f46495a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        boolean f11646A;

        /* renamed from: B, reason: collision with root package name */
        boolean f11647B;

        /* renamed from: C, reason: collision with root package name */
        String f11648C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f11649D;

        /* renamed from: E, reason: collision with root package name */
        int f11650E;

        /* renamed from: F, reason: collision with root package name */
        int f11651F;

        /* renamed from: G, reason: collision with root package name */
        Notification f11652G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f11653H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f11654I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f11655J;

        /* renamed from: K, reason: collision with root package name */
        String f11656K;

        /* renamed from: L, reason: collision with root package name */
        int f11657L;

        /* renamed from: M, reason: collision with root package name */
        String f11658M;

        /* renamed from: N, reason: collision with root package name */
        long f11659N;

        /* renamed from: O, reason: collision with root package name */
        int f11660O;

        /* renamed from: P, reason: collision with root package name */
        int f11661P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f11662Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f11663R;

        /* renamed from: S, reason: collision with root package name */
        boolean f11664S;

        /* renamed from: T, reason: collision with root package name */
        Object f11665T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f11666U;

        /* renamed from: a, reason: collision with root package name */
        public Context f11667a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f11668b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f11669c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f11670d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f11671e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f11672f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f11673g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f11674h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f11675i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f11676j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f11677k;

        /* renamed from: l, reason: collision with root package name */
        int f11678l;

        /* renamed from: m, reason: collision with root package name */
        int f11679m;

        /* renamed from: n, reason: collision with root package name */
        boolean f11680n;

        /* renamed from: o, reason: collision with root package name */
        boolean f11681o;

        /* renamed from: p, reason: collision with root package name */
        f f11682p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f11683q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f11684r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f11685s;

        /* renamed from: t, reason: collision with root package name */
        int f11686t;

        /* renamed from: u, reason: collision with root package name */
        int f11687u;

        /* renamed from: v, reason: collision with root package name */
        boolean f11688v;

        /* renamed from: w, reason: collision with root package name */
        String f11689w;

        /* renamed from: x, reason: collision with root package name */
        boolean f11690x;

        /* renamed from: y, reason: collision with root package name */
        String f11691y;

        /* renamed from: z, reason: collision with root package name */
        boolean f11692z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i4) {
                return builder.setContentType(i4);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i4) {
                return builder.setLegacyStreamType(i4);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i4) {
                return builder.setUsage(i4);
            }
        }

        public e(Context context, String str) {
            this.f11668b = new ArrayList();
            this.f11669c = new ArrayList();
            this.f11670d = new ArrayList();
            this.f11680n = true;
            this.f11692z = false;
            this.f11650E = 0;
            this.f11651F = 0;
            this.f11657L = 0;
            this.f11660O = 0;
            this.f11661P = 0;
            Notification notification = new Notification();
            this.f11663R = notification;
            this.f11667a = context;
            this.f11656K = str;
            notification.when = System.currentTimeMillis();
            this.f11663R.audioStreamType = -1;
            this.f11679m = 0;
            this.f11666U = new ArrayList();
            this.f11662Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i4, boolean z4) {
            if (z4) {
                Notification notification = this.f11663R;
                notification.flags = i4 | notification.flags;
            } else {
                Notification notification2 = this.f11663R;
                notification2.flags = (~i4) & notification2.flags;
            }
        }

        public e a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f11668b.add(new a(i4, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new t(this).c();
        }

        public Bundle c() {
            if (this.f11649D == null) {
                this.f11649D = new Bundle();
            }
            return this.f11649D;
        }

        public e e(boolean z4) {
            m(16, z4);
            return this;
        }

        public e f(String str) {
            this.f11656K = str;
            return this;
        }

        public e g(int i4) {
            this.f11650E = i4;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.f11673g = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f11672f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f11671e = d(charSequence);
            return this;
        }

        public e k(int i4) {
            Notification notification = this.f11663R;
            notification.defaults = i4;
            if ((i4 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.f11663R.deleteIntent = pendingIntent;
            return this;
        }

        public e n(Bitmap bitmap) {
            this.f11676j = bitmap == null ? null : IconCompat.b(s.b(this.f11667a, bitmap));
            return this;
        }

        public e o(int i4, int i5, int i6) {
            Notification notification = this.f11663R;
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            notification.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e p(boolean z4) {
            this.f11692z = z4;
            return this;
        }

        public e q(int i4) {
            this.f11678l = i4;
            return this;
        }

        public e r(int i4) {
            this.f11679m = i4;
            return this;
        }

        public e s(boolean z4) {
            this.f11680n = z4;
            return this;
        }

        public e t(int i4) {
            this.f11663R.icon = i4;
            return this;
        }

        public e u(Uri uri) {
            Notification notification = this.f11663R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e4 = a.e(a.c(a.b(), 4), 5);
            this.f11663R.audioAttributes = a.a(e4);
            return this;
        }

        public e v(f fVar) {
            if (this.f11682p != fVar) {
                this.f11682p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e w(CharSequence charSequence) {
            this.f11663R.tickerText = d(charSequence);
            return this;
        }

        public e x(long[] jArr) {
            this.f11663R.vibrate = jArr;
            return this;
        }

        public e y(int i4) {
            this.f11651F = i4;
            return this;
        }

        public e z(long j4) {
            this.f11663R.when = j4;
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
