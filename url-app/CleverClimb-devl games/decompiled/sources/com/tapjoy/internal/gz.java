package com.tapjoy.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tapjoy.internal.ew;
import com.tapjoy.internal.ey;
import com.tapjoy.internal.fe;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class gz {

    /* renamed from: a, reason: collision with root package name */
    final hd f8229a;

    /* renamed from: b, reason: collision with root package name */
    final gy f8230b;

    /* renamed from: c, reason: collision with root package name */
    long f8231c;

    /* renamed from: d, reason: collision with root package name */
    private int f8232d = 1;
    private final ey.a e = new ey.a();

    gz(hd hdVar, gy gyVar) {
        this.f8229a = hdVar;
        this.f8230b = gyVar;
    }

    public final void a(String str, String str2, double d2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        double d3;
        hd hdVar = this.f8229a;
        synchronized (hdVar) {
            SharedPreferences.Editor a2 = hdVar.f8262c.a();
            int i = 1;
            if (str2.equals(hdVar.f8262c.l.a())) {
                i = 1 + hdVar.f8262c.m.b();
                hdVar.f8262c.m.a(a2, i);
                d3 = hdVar.f8262c.n.a() + d2;
                hdVar.f8262c.n.a(a2, d3);
                a2.apply();
            } else {
                hdVar.f8262c.l.a(a2, str2);
                hdVar.f8262c.m.a(a2, 1);
                hdVar.f8262c.n.a(a2, d2);
                hdVar.f8262c.o.a(a2);
                hdVar.f8262c.p.a(a2);
                a2.apply();
                hdVar.f8261b.l = str2;
                hdVar.f8261b.o = null;
                hdVar.f8261b.p = null;
                d3 = d2;
            }
            hdVar.f8261b.m = Integer.valueOf(i);
            hdVar.f8261b.n = Double.valueOf(d3);
        }
        ew.a a3 = a(ez.APP, ProductAction.ACTION_PURCHASE);
        fe.a aVar = new fe.a();
        aVar.f8079c = str;
        if (str2 != null) {
            aVar.f = str2;
        }
        aVar.e = Double.valueOf(d2);
        if (str5 != null) {
            aVar.m = str5;
        }
        if (str3 != null) {
            aVar.o = str3;
        }
        if (str4 != null) {
            aVar.p = str4;
        }
        a3.p = aVar.b();
        a(a3);
        hd hdVar2 = this.f8229a;
        long longValue = a3.e.longValue();
        synchronized (hdVar2) {
            SharedPreferences.Editor a4 = hdVar2.f8262c.a();
            hdVar2.f8262c.o.a(a4, longValue);
            hdVar2.f8262c.p.a(a4, d2);
            a4.apply();
            hdVar2.f8261b.o = Long.valueOf(longValue);
            hdVar2.f8261b.p = Double.valueOf(d2);
        }
    }

    public final void a(String str, String str2, String str3, String str4, Map map) {
        ew.a a2 = a(ez.CUSTOM, str2);
        a2.t = str;
        a2.u = str3;
        a2.v = str4;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a2.w.add(new fa((String) entry.getKey(), (Long) entry.getValue()));
            }
        }
        a(a2);
    }

    public final void a(String str, String str2, int i, long j, long j2, Map map) {
        ew.a a2 = a(ez.USAGES, str);
        a2.x = str2;
        a2.y = Integer.valueOf(i);
        a2.z = Long.valueOf(j);
        a2.A = Long.valueOf(j2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a2.w.add(new fa((String) entry.getKey(), (Long) entry.getValue()));
            }
        }
        a(a2);
    }

    public final ew.a a(ez ezVar, String str) {
        fc b2 = this.f8229a.b();
        ew.a aVar = new ew.a();
        aVar.g = hd.f8259a;
        aVar.f8046c = ezVar;
        aVar.f8047d = str;
        if (v.c()) {
            aVar.e = Long.valueOf(v.b());
            aVar.f = Long.valueOf(System.currentTimeMillis());
        } else {
            aVar.e = Long.valueOf(System.currentTimeMillis());
            aVar.h = Long.valueOf(SystemClock.elapsedRealtime());
        }
        aVar.j = b2.f8070d;
        aVar.k = b2.e;
        aVar.l = b2.f;
        return aVar;
    }

    public final synchronized void a(ew.a aVar) {
        if (aVar.f8046c != ez.USAGES) {
            int i = this.f8232d;
            this.f8232d = i + 1;
            aVar.n = Integer.valueOf(i);
            if (this.e.f8053c != null) {
                aVar.o = this.e.b();
            }
            this.e.f8053c = aVar.f8046c;
            this.e.f8054d = aVar.f8047d;
            this.e.e = aVar.t;
        }
        gy gyVar = this.f8230b;
        ew b2 = aVar.b();
        try {
            hm hmVar = gyVar.f8224a;
            synchronized (hmVar.f8296a) {
                try {
                    hmVar.f8297b.add(b2);
                } catch (Exception unused) {
                    hmVar.a();
                    try {
                        hmVar.f8297b.add(b2);
                    } catch (Exception unused2) {
                    }
                }
            }
            if (gyVar.f8225b == null) {
                gyVar.f8224a.flush();
                return;
            }
            if (!gx.f8223a && b2.n == ez.CUSTOM) {
                gyVar.a(false);
                return;
            }
            gyVar.a(true);
        } catch (Exception unused3) {
        }
    }
}
