package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4907p;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4289zg {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f35582r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f35583a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35584b;

    /* renamed from: c, reason: collision with root package name */
    public final C5107a f35585c;

    /* renamed from: d, reason: collision with root package name */
    public final C3528la f35586d;

    /* renamed from: e, reason: collision with root package name */
    public final C3636na f35587e;

    /* renamed from: f, reason: collision with root package name */
    public final D.H f35588f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f35589g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f35590h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35591j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35592k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35593l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35594m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3804qg f35595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35596o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35597p;

    /* renamed from: q, reason: collision with root package name */
    public long f35598q;

    static {
        f35582r = C4907p.f40108g.f40113e.nextInt(100) < ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.ge)).intValue();
    }

    public C4289zg(Context context, C5107a c5107a, String str, C3636na c3636na, C3528la c3528la) {
        m.Q0 q02 = new m.Q0();
        q02.u("min_1", Double.MIN_VALUE, 1.0d);
        q02.u("1_5", 1.0d, 5.0d);
        q02.u("5_10", 5.0d, 10.0d);
        q02.u("10_20", 10.0d, 20.0d);
        q02.u("20_30", 20.0d, 30.0d);
        q02.u("30_max", 30.0d, Double.MAX_VALUE);
        this.f35588f = new D.H(q02);
        this.i = false;
        this.f35591j = false;
        this.f35592k = false;
        this.f35593l = false;
        this.f35598q = -1L;
        this.f35583a = context;
        this.f35585c = c5107a;
        this.f35584b = str;
        this.f35587e = c3636na;
        this.f35586d = c3528la;
        String str2 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31707k0);
        if (str2 == null) {
            this.f35590h = new String[0];
            this.f35589g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f35590h = new String[length];
        this.f35589g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f35589g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e6) {
                int i4 = t2.C.f40822b;
                u2.i.g("Unable to parse frame hash target time number.", e6);
                this.f35589g[i] = -1;
            }
        }
    }

    public final void a(AbstractC3804qg abstractC3804qg) {
        C3636na c3636na = this.f35587e;
        AbstractC2655Lg.j(c3636na, this.f35586d, "vpc2");
        this.i = true;
        c3636na.c("vpn", abstractC3804qg.d());
        this.f35595n = abstractC3804qg;
    }

    public final void b() {
        Bundle F8;
        if (!f35582r || this.f35596o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(com.anythink.core.common.m.b.g.f14683j, this.f35584b);
        bundle.putString("player", this.f35595n.d());
        D.H h9 = this.f35588f;
        h9.getClass();
        String[] strArr = (String[]) h9.f492v;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double d2 = ((double[]) h9.f494x)[i];
            double d3 = ((double[]) h9.f493w)[i];
            int i4 = ((int[]) h9.f495y)[i];
            arrayList.add(new t2.o(str, d2, d3, i4 / h9.f491u, i4));
            i++;
            bundle = bundle;
        }
        Bundle bundle2 = bundle;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t2.o oVar = (t2.o) it.next();
            String str2 = oVar.f40922a;
            bundle2.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(oVar.f40926e));
            bundle2.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(oVar.f40925d));
        }
        int i9 = 0;
        while (true) {
            long[] jArr = this.f35589g;
            if (i9 >= jArr.length) {
                break;
            }
            String str3 = this.f35590h[i9];
            if (str3 != null) {
                Long valueOf = Long.valueOf(jArr[i9]);
                new StringBuilder(valueOf.toString().length() + 3);
                bundle2.putString("fh_".concat(valueOf.toString()), str3);
            }
            i9++;
        }
        final t2.G g9 = p2.j.f39798C.f39803c;
        String str4 = this.f35585c.f41217n;
        g9.getClass();
        bundle2.putString("device", t2.G.O());
        C3151ea c3151ea = AbstractC3368ia.f31613a;
        q2.r rVar = q2.r.f40116e;
        bundle2.putString("eids", TextUtils.join(",", rVar.f40117a.B()));
        boolean isEmpty = bundle2.isEmpty();
        final Context context = this.f35583a;
        if (isEmpty) {
            int i10 = t2.C.f40822b;
            u2.i.a("Empty or null bundle.");
        } else {
            final String str5 = (String) rVar.f40119c.a(AbstractC3368ia.Vb);
            boolean andSet = g9.f40862d.getAndSet(true);
            AtomicReference atomicReference = g9.f40861c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: t2.F
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        G.this.f40861c.set(com.bumptech.glide.h.F(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    F8 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    F8 = com.bumptech.glide.h.F(context, str5);
                }
                atomicReference.set(F8);
            }
            bundle2.putAll((Bundle) atomicReference.get());
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        u2.d.a(context, str4, bundle2, new S0.s(17, context, str4));
        this.f35596o = true;
    }

    public final void c(AbstractC3804qg abstractC3804qg) {
        if (this.f35592k && !this.f35593l) {
            if (t2.C.m() && !this.f35593l) {
                t2.C.k("VideoMetricsMixin first frame");
            }
            AbstractC2655Lg.j(this.f35587e, this.f35586d, "vff2");
            this.f35593l = true;
        }
        p2.j.f39798C.f39810k.getClass();
        long nanoTime = System.nanoTime();
        if (this.f35594m && this.f35597p && this.f35598q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.f35598q);
            D.H h9 = this.f35588f;
            h9.f491u++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) h9.f494x;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                if (d2 <= nanos && nanos < ((double[]) h9.f493w)[i]) {
                    int[] iArr = (int[]) h9.f495y;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f35597p = this.f35594m;
        this.f35598q = nanoTime;
        long longValue = ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31716l0)).longValue();
        long k6 = abstractC3804qg.k();
        int i4 = 0;
        while (true) {
            String[] strArr = this.f35590h;
            if (i4 >= strArr.length) {
                return;
            }
            if (strArr[i4] == null && longValue > Math.abs(k6 - this.f35589g[i4])) {
                int i9 = 8;
                Bitmap bitmap = abstractC3804qg.getBitmap(8, 8);
                long j9 = 63;
                int i10 = 0;
                long j10 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j10 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j9);
                        j9--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr[i4] = String.format("%016X", Long.valueOf(j10));
                return;
            }
            i4++;
        }
    }

    public final void d() {
        this.f35594m = true;
        if (!this.f35591j || this.f35592k) {
            return;
        }
        AbstractC2655Lg.j(this.f35587e, this.f35586d, "vfp2");
        this.f35592k = true;
    }
}
