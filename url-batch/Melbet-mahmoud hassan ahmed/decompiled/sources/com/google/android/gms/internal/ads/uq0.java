package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uq0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12912a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12913b;

    /* renamed from: c, reason: collision with root package name */
    private final po0 f12914c;

    /* renamed from: d, reason: collision with root package name */
    private final y10 f12915d;

    /* renamed from: e, reason: collision with root package name */
    private final b20 f12916e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.l0 f12917f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f12918g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f12919h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12920i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12921j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12922k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12923l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12924m;

    /* renamed from: n, reason: collision with root package name */
    private zp0 f12925n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12926o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12927p;

    /* renamed from: q, reason: collision with root package name */
    private long f12928q;

    public uq0(Context context, po0 po0Var, String str, b20 b20Var, y10 y10Var) {
        a3.j0 j0Var = new a3.j0();
        j0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        j0Var.a("1_5", 1.0d, 5.0d);
        j0Var.a("5_10", 5.0d, 10.0d);
        j0Var.a("10_20", 10.0d, 20.0d);
        j0Var.a("20_30", 20.0d, 30.0d);
        j0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f12917f = j0Var.b();
        this.f12920i = false;
        this.f12921j = false;
        this.f12922k = false;
        this.f12923l = false;
        this.f12928q = -1L;
        this.f12912a = context;
        this.f12914c = po0Var;
        this.f12913b = str;
        this.f12916e = b20Var;
        this.f12915d = y10Var;
        String str2 = (String) sw.c().b(m10.f8318v);
        if (str2 == null) {
            this.f12919h = new String[0];
            this.f12918g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f12919h = new String[length];
        this.f12918g = new long[length];
        for (int i7 = 0; i7 < split.length; i7++) {
            try {
                this.f12918g[i7] = Long.parseLong(split[i7]);
            } catch (NumberFormatException e7) {
                io0.h("Unable to parse frame hash target time number.", e7);
                this.f12918g[i7] = -1;
            }
        }
    }

    public final void a(zp0 zp0Var) {
        t10.a(this.f12916e, this.f12915d, "vpc2");
        this.f12920i = true;
        this.f12916e.d("vpn", zp0Var.q());
        this.f12925n = zp0Var;
    }

    public final void b() {
        if (!this.f12920i || this.f12921j) {
            return;
        }
        t10.a(this.f12916e, this.f12915d, "vfr2");
        this.f12921j = true;
    }

    public final void c() {
        this.f12924m = true;
        if (!this.f12921j || this.f12922k) {
            return;
        }
        t10.a(this.f12916e, this.f12915d, "vfp2");
        this.f12922k = true;
    }

    public final void d() {
        if (!p30.f10052a.e().booleanValue() || this.f12926o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f12913b);
        bundle.putString("player", this.f12925n.q());
        for (a3.i0 i0Var : this.f12917f.a()) {
            String valueOf = String.valueOf(i0Var.f87a);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(i0Var.f91e));
            String valueOf2 = String.valueOf(i0Var.f87a);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(i0Var.f90d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.f12918g;
            if (i7 >= jArr.length) {
                y2.t.q().V(this.f12912a, this.f12914c.f10301f, "gmob-apps", bundle, true);
                this.f12926o = true;
                return;
            } else {
                String str = this.f12919h[i7];
                if (str != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i7]).toString()), str);
                }
                i7++;
            }
        }
    }

    public final void e() {
        this.f12924m = false;
    }

    public final void f(zp0 zp0Var) {
        if (this.f12922k && !this.f12923l) {
            if (a3.r1.m() && !this.f12923l) {
                a3.r1.k("VideoMetricsMixin first frame");
            }
            t10.a(this.f12916e, this.f12915d, "vff2");
            this.f12923l = true;
        }
        long c7 = y2.t.a().c();
        if (this.f12924m && this.f12927p && this.f12928q != -1) {
            long nanos = TimeUnit.SECONDS.toNanos(1L);
            long j7 = this.f12928q;
            a3.l0 l0Var = this.f12917f;
            double d7 = nanos;
            double d8 = c7 - j7;
            Double.isNaN(d7);
            Double.isNaN(d8);
            l0Var.b(d7 / d8);
        }
        this.f12927p = this.f12924m;
        this.f12928q = c7;
        long longValue = ((Long) sw.c().b(m10.f8325w)).longValue();
        long g7 = zp0Var.g();
        int i7 = 0;
        while (true) {
            String[] strArr = this.f12919h;
            if (i7 >= strArr.length) {
                return;
            }
            if (strArr[i7] == null && longValue > Math.abs(g7 - this.f12918g[i7])) {
                String[] strArr2 = this.f12919h;
                int i8 = 8;
                Bitmap bitmap = zp0Var.getBitmap(8, 8);
                long j8 = 63;
                long j9 = 0;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = 0;
                    while (i10 < i8) {
                        int pixel = bitmap.getPixel(i10, i9);
                        j9 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j8);
                        i10++;
                        j8--;
                        i8 = 8;
                    }
                    i9++;
                    i8 = 8;
                }
                strArr2[i7] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i7++;
        }
    }
}
