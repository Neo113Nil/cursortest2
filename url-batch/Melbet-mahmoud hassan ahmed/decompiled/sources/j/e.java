package j;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f17982a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f17983b;

        /* renamed from: c, reason: collision with root package name */
        private final j[] f17984c;

        /* renamed from: d, reason: collision with root package name */
        private final j[] f17985d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17986e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17987f;

        /* renamed from: g, reason: collision with root package name */
        private final int f17988g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17989h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f17990i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f17991j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f17992k;

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.h(null, "", i7) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, j[] jVarArr, j[] jVarArr2, boolean z6, int i7, boolean z7, boolean z8) {
            this.f17987f = true;
            this.f17983b = iconCompat;
            if (iconCompat != null && iconCompat.n() == 2) {
                this.f17990i = iconCompat.i();
            }
            this.f17991j = d.h(charSequence);
            this.f17992k = pendingIntent;
            this.f17982a = bundle == null ? new Bundle() : bundle;
            this.f17984c = jVarArr;
            this.f17985d = jVarArr2;
            this.f17986e = z6;
            this.f17988g = i7;
            this.f17987f = z7;
            this.f17989h = z8;
        }

        public PendingIntent a() {
            return this.f17992k;
        }

        public boolean b() {
            return this.f17986e;
        }

        public j[] c() {
            return this.f17985d;
        }

        public Bundle d() {
            return this.f17982a;
        }

        @Deprecated
        public int e() {
            return this.f17990i;
        }

        public IconCompat f() {
            int i7;
            if (this.f17983b == null && (i7 = this.f17990i) != 0) {
                this.f17983b = IconCompat.h(null, "", i7);
            }
            return this.f17983b;
        }

        public j[] g() {
            return this.f17984c;
        }

        public int h() {
            return this.f17988g;
        }

        public boolean i() {
            return this.f17987f;
        }

        public CharSequence j() {
            return this.f17991j;
        }

        public boolean k() {
            return this.f17989h;
        }
    }

    public static class b extends AbstractC0081e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f17993e;

        @Override // j.e.AbstractC0081e
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f17993e);
            }
        }

        @Override // j.e.AbstractC0081e
        public void b(j.d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(dVar.a()).setBigContentTitle(this.f18021b).bigText(this.f17993e);
                if (this.f18023d) {
                    bigText.setSummaryText(this.f18022c);
                }
            }
        }

        @Override // j.e.AbstractC0081e
        protected String h() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b m(CharSequence charSequence) {
            this.f17993e = d.h(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        c S;
        Notification T;
        boolean U;
        Icon V;

        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a, reason: collision with root package name */
        public Context f17994a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f17995b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<i> f17996c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f17997d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f17998e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f17999f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f18000g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f18001h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f18002i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f18003j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f18004k;

        /* renamed from: l, reason: collision with root package name */
        int f18005l;

        /* renamed from: m, reason: collision with root package name */
        int f18006m;

        /* renamed from: n, reason: collision with root package name */
        boolean f18007n;

        /* renamed from: o, reason: collision with root package name */
        boolean f18008o;

        /* renamed from: p, reason: collision with root package name */
        boolean f18009p;

        /* renamed from: q, reason: collision with root package name */
        AbstractC0081e f18010q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f18011r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence f18012s;

        /* renamed from: t, reason: collision with root package name */
        CharSequence[] f18013t;

        /* renamed from: u, reason: collision with root package name */
        int f18014u;

        /* renamed from: v, reason: collision with root package name */
        int f18015v;

        /* renamed from: w, reason: collision with root package name */
        boolean f18016w;

        /* renamed from: x, reason: collision with root package name */
        String f18017x;

        /* renamed from: y, reason: collision with root package name */
        boolean f18018y;

        /* renamed from: z, reason: collision with root package name */
        String f18019z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f17995b = new ArrayList<>();
            this.f17996c = new ArrayList<>();
            this.f17997d = new ArrayList<>();
            this.f18007n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f17994a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f18006m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence h(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap i(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f17994a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(i.a.f16840b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i.a.f16839a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d7 = dimensionPixelSize;
            double max = Math.max(1, bitmap.getWidth());
            Double.isNaN(d7);
            Double.isNaN(max);
            double d8 = d7 / max;
            double d9 = dimensionPixelSize2;
            double max2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d9);
            Double.isNaN(max2);
            double min = Math.min(d8, d9 / max2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * min);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
        }

        private void q(int i7, boolean z6) {
            Notification notification;
            int i8;
            if (z6) {
                notification = this.T;
                i8 = i7 | notification.flags;
            } else {
                notification = this.T;
                i8 = (i7 ^ (-1)) & notification.flags;
            }
            notification.flags = i8;
        }

        public d A(int i7) {
            this.G = i7;
            return this;
        }

        public d B(long j7) {
            this.T.when = j7;
            return this;
        }

        public d a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f17995b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        public d b(a aVar) {
            if (aVar != null) {
                this.f17995b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new f(this).c();
        }

        public int d() {
            return this.F;
        }

        public Bundle e() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public int f() {
            return this.f18006m;
        }

        public long g() {
            if (this.f18007n) {
                return this.T.when;
            }
            return 0L;
        }

        public d j(boolean z6) {
            q(16, z6);
            return this;
        }

        public d k(String str) {
            this.L = str;
            return this;
        }

        public d l(int i7) {
            this.F = i7;
            return this;
        }

        public d m(PendingIntent pendingIntent) {
            this.f18000g = pendingIntent;
            return this;
        }

        public d n(CharSequence charSequence) {
            this.f17999f = h(charSequence);
            return this;
        }

        public d o(CharSequence charSequence) {
            this.f17998e = h(charSequence);
            return this;
        }

        public d p(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public d r(Bitmap bitmap) {
            this.f18003j = i(bitmap);
            return this;
        }

        public d s(boolean z6) {
            this.A = z6;
            return this;
        }

        public d t(boolean z6) {
            q(2, z6);
            return this;
        }

        public d u(int i7) {
            this.f18006m = i7;
            return this;
        }

        public d v(boolean z6) {
            this.f18007n = z6;
            return this;
        }

        public d w(int i7) {
            this.T.icon = i7;
            return this;
        }

        public d x(AbstractC0081e abstractC0081e) {
            if (this.f18010q != abstractC0081e) {
                this.f18010q = abstractC0081e;
                if (abstractC0081e != null) {
                    abstractC0081e.l(this);
                }
            }
            return this;
        }

        public d y(CharSequence charSequence) {
            this.f18011r = h(charSequence);
            return this;
        }

        public d z(CharSequence charSequence) {
            this.T.tickerText = h(charSequence);
            return this;
        }
    }

    /* renamed from: j.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0081e {

        /* renamed from: a, reason: collision with root package name */
        protected d f18020a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f18021b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f18022c;

        /* renamed from: d, reason: collision with root package name */
        boolean f18023d = false;

        private Bitmap e(int i7, int i8, int i9) {
            return f(IconCompat.g(this.f18020a.f17994a, i7), i8, i9);
        }

        private Bitmap f(IconCompat iconCompat, int i7, int i8) {
            Drawable s7 = iconCompat.s(this.f18020a.f17994a);
            int intrinsicWidth = i8 == 0 ? s7.getIntrinsicWidth() : i8;
            if (i8 == 0) {
                i8 = s7.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i8, Bitmap.Config.ARGB_8888);
            s7.setBounds(0, 0, intrinsicWidth, i8);
            if (i7 != 0) {
                s7.mutate().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            s7.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap g(int i7, int i8, int i9, int i10) {
            int i11 = i.b.f16849c;
            if (i10 == 0) {
                i10 = 0;
            }
            Bitmap e7 = e(i11, i10, i8);
            Canvas canvas = new Canvas(e7);
            Drawable mutate = this.f18020a.f17994a.getResources().getDrawable(i7).mutate();
            mutate.setFilterBitmap(true);
            int i12 = (i8 - i9) / 2;
            int i13 = i9 + i12;
            mutate.setBounds(i12, i12, i13, i13);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return e7;
        }

        public void a(Bundle bundle) {
            if (this.f18023d) {
                bundle.putCharSequence("android.summaryText", this.f18022c);
            }
            CharSequence charSequence = this.f18021b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String h7 = h();
            if (h7 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", h7);
            }
        }

        public abstract void b(j.d dVar);

        /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews c(boolean z6, int i7, boolean z7) {
            Bitmap d7;
            boolean z8;
            boolean z9;
            boolean z10;
            int i8;
            CharSequence charSequence;
            boolean z11;
            CharSequence charSequence2;
            int i9;
            int i10;
            Resources resources = this.f18020a.f17994a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.f18020a.f17994a.getPackageName(), i7);
            boolean z12 = true;
            boolean z13 = this.f18020a.f() < -1;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 16 && i11 < 21) {
                if (z13) {
                    remoteViews.setInt(i.c.L, "setBackgroundResource", i.b.f16848b);
                    i9 = i.c.H;
                    i10 = i.b.f16851e;
                } else {
                    remoteViews.setInt(i.c.L, "setBackgroundResource", i.b.f16847a);
                    i9 = i.c.H;
                    i10 = i.b.f16850d;
                }
                remoteViews.setInt(i9, "setBackgroundResource", i10);
            }
            d dVar = this.f18020a;
            if (dVar.f18003j != null) {
                int i12 = i.c.H;
                if (i11 >= 16) {
                    remoteViews.setViewVisibility(i12, 0);
                    remoteViews.setImageViewBitmap(i12, this.f18020a.f18003j);
                } else {
                    remoteViews.setViewVisibility(i12, 8);
                }
                if (z6 && this.f18020a.T.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(i.a.f16843e);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(i.a.f16844f) * 2);
                    if (i11 >= 21) {
                        d dVar2 = this.f18020a;
                        remoteViews.setImageViewBitmap(i.c.M, g(dVar2.T.icon, dimensionPixelSize, dimensionPixelSize2, dVar2.d()));
                    } else {
                        remoteViews.setImageViewBitmap(i.c.M, d(this.f18020a.T.icon, -1));
                    }
                    remoteViews.setViewVisibility(i.c.M, 0);
                }
            } else if (z6 && dVar.T.icon != 0) {
                int i13 = i.c.H;
                remoteViews.setViewVisibility(i13, 0);
                if (i11 >= 21) {
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(i.a.f16842d) - resources.getDimensionPixelSize(i.a.f16841c);
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(i.a.f16845g);
                    d dVar3 = this.f18020a;
                    d7 = g(dVar3.T.icon, dimensionPixelSize3, dimensionPixelSize4, dVar3.d());
                } else {
                    d7 = d(this.f18020a.T.icon, -1);
                }
                remoteViews.setImageViewBitmap(i13, d7);
            }
            CharSequence charSequence3 = this.f18020a.f17998e;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(i.c.X, charSequence3);
            }
            CharSequence charSequence4 = this.f18020a.f17999f;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(i.c.U, charSequence4);
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = i11 < 21 && this.f18020a.f18003j != null;
            d dVar4 = this.f18020a;
            CharSequence charSequence5 = dVar4.f18004k;
            if (charSequence5 != null) {
                i8 = i.c.I;
                remoteViews.setTextViewText(i8, charSequence5);
            } else {
                if (dVar4.f18005l <= 0) {
                    remoteViews.setViewVisibility(i.c.I, 8);
                    z9 = z8;
                    z10 = z14;
                    charSequence = this.f18020a.f18011r;
                    if (charSequence != null && i11 >= 16) {
                        remoteViews.setTextViewText(i.c.U, charSequence);
                        charSequence2 = this.f18020a.f17999f;
                        if (charSequence2 == null) {
                            int i14 = i.c.V;
                            remoteViews.setTextViewText(i14, charSequence2);
                            remoteViews.setViewVisibility(i14, 0);
                            z11 = true;
                            if (z11 && i11 >= 16) {
                                if (z7) {
                                    remoteViews.setTextViewTextSize(i.c.U, 0, resources.getDimensionPixelSize(i.a.f16846h));
                                }
                                remoteViews.setViewPadding(i.c.J, 0, 0, 0, 0);
                            }
                            if (this.f18020a.g() == 0) {
                                z12 = z10;
                            } else if (!this.f18020a.f18008o || i11 < 16) {
                                int i15 = i.c.W;
                                remoteViews.setViewVisibility(i15, 0);
                                remoteViews.setLong(i15, "setTime", this.f18020a.g());
                            } else {
                                int i16 = i.c.G;
                                remoteViews.setViewVisibility(i16, 0);
                                remoteViews.setLong(i16, "setBase", this.f18020a.g() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                                remoteViews.setBoolean(i16, "setStarted", true);
                                boolean z15 = this.f18020a.f18009p;
                                if (z15 && i11 >= 24) {
                                    remoteViews.setChronometerCountDown(i16, z15);
                                }
                            }
                            remoteViews.setViewVisibility(i.c.N, z12 ? 0 : 8);
                            remoteViews.setViewVisibility(i.c.K, z9 ? 0 : 8);
                            return remoteViews;
                        }
                        remoteViews.setViewVisibility(i.c.V, 8);
                    }
                    z11 = false;
                    if (z11) {
                        if (z7) {
                        }
                        remoteViews.setViewPadding(i.c.J, 0, 0, 0, 0);
                    }
                    if (this.f18020a.g() == 0) {
                    }
                    remoteViews.setViewVisibility(i.c.N, z12 ? 0 : 8);
                    remoteViews.setViewVisibility(i.c.K, z9 ? 0 : 8);
                    return remoteViews;
                }
                if (this.f18020a.f18005l > resources.getInteger(i.d.f16878a)) {
                    remoteViews.setTextViewText(i.c.I, resources.getString(i.e.f16879a));
                } else {
                    remoteViews.setTextViewText(i.c.I, NumberFormat.getIntegerInstance().format(this.f18020a.f18005l));
                }
                i8 = i.c.I;
            }
            remoteViews.setViewVisibility(i8, 0);
            z9 = true;
            z10 = true;
            charSequence = this.f18020a.f18011r;
            if (charSequence != null) {
                remoteViews.setTextViewText(i.c.U, charSequence);
                charSequence2 = this.f18020a.f17999f;
                if (charSequence2 == null) {
                }
            }
            z11 = false;
            if (z11) {
            }
            if (this.f18020a.g() == 0) {
            }
            remoteViews.setViewVisibility(i.c.N, z12 ? 0 : 8);
            remoteViews.setViewVisibility(i.c.K, z9 ? 0 : 8);
            return remoteViews;
        }

        public Bitmap d(int i7, int i8) {
            return e(i7, i8, 0);
        }

        protected String h() {
            return null;
        }

        public RemoteViews i(j.d dVar) {
            return null;
        }

        public RemoteViews j(j.d dVar) {
            return null;
        }

        public RemoteViews k(j.d dVar) {
            return null;
        }

        public void l(d dVar) {
            if (this.f18020a != dVar) {
                this.f18020a = dVar;
                if (dVar != null) {
                    dVar.x(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 19) {
            return notification.extras;
        }
        if (i7 >= 16) {
            return g.c(notification);
        }
        return null;
    }
}
