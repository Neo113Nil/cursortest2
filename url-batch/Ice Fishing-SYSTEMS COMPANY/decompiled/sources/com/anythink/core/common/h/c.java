package com.anythink.core.common.h;

import android.os.Looper;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;

/* loaded from: classes.dex */
public class c implements Comparable<c> {

    /* renamed from: b, reason: collision with root package name */
    private int f14024b;

    /* renamed from: c, reason: collision with root package name */
    private long f14025c;

    /* renamed from: d, reason: collision with root package name */
    private ATBaseAdAdapter f14026d;

    /* renamed from: e, reason: collision with root package name */
    private BaseAd f14027e;

    /* renamed from: f, reason: collision with root package name */
    private int f14028f;

    /* renamed from: g, reason: collision with root package name */
    private long f14029g;

    /* renamed from: h, reason: collision with root package name */
    private int f14030h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14031j;

    /* renamed from: a, reason: collision with root package name */
    private String f14023a = getClass().getSimpleName();

    /* renamed from: k, reason: collision with root package name */
    private String f14032k = "1";

    private long q() {
        return this.f14029g;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(c cVar) {
        c cVar2 = cVar;
        bv unitGroupInfo = this.f14026d.getUnitGroupInfo();
        bv unitGroupInfo2 = cVar2.f14026d.getUnitGroupInfo();
        int b9 = com.anythink.core.common.v.l.b(unitGroupInfo, unitGroupInfo2);
        if (b9 < 0) {
            return -1;
        }
        if (b9 > 0) {
            return 1;
        }
        int i = unitGroupInfo.f13970m;
        int i4 = unitGroupInfo2.f13970m;
        if (i < i4) {
            return -1;
        }
        if (i != i4) {
            return 1;
        }
        if (b() < cVar2.b()) {
            return -1;
        }
        return b() != cVar2.b() ? 1 : 0;
    }

    public final long d() {
        return this.f14025c;
    }

    public final ATBaseAdAdapter e() {
        return this.f14026d;
    }

    public final BaseAd f() {
        return this.f14027e;
    }

    public final boolean g() {
        BaseAd baseAd;
        try {
        } catch (Exception e6) {
            Log.e("AdCacheInfo", "isNetworkAdReady()  >>> " + e6.getMessage());
        }
        if (this.f14031j || this.f14028f > 0) {
            return false;
        }
        if (this.f14026d != null && (baseAd = this.f14027e) != null && baseAd.isValid()) {
            return true;
        }
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
        } catch (Throwable unused) {
        }
        ATBaseAdAdapter aTBaseAdAdapter = this.f14026d;
        if (aTBaseAdAdapter != null) {
            return aTBaseAdAdapter.internalIsAdReady();
        }
        return false;
    }

    public final boolean h() {
        return this.f14031j;
    }

    public final n i() {
        BaseAd baseAd = this.f14027e;
        return baseAd != null ? baseAd.getDetail() : this.f14026d.getTrackingInfo();
    }

    public final boolean j() {
        return this.f14025c + this.f14029g > System.currentTimeMillis();
    }

    public final boolean k() {
        return j() && g();
    }

    public final String l() {
        return this.f14032k;
    }

    public final synchronized void m() {
        if (this.f14031j) {
            return;
        }
        this.f14031j = true;
        if (this.f14028f <= 0) {
            com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.core.common.h.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (c.this.f14028f <= 0) {
                            if (c.this.f14026d != null) {
                                c.this.f14026d.internalDestory();
                            }
                            if (c.this.f14027e != null) {
                                c.this.f14027e.destroy();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public final double n() {
        return com.anythink.core.common.v.p.a(this.f14026d.getUnitGroupInfo());
    }

    public final bv o() {
        return this.f14026d.getUnitGroupInfo();
    }

    public final ATAdInfo p() {
        BaseAd baseAd = this.f14027e;
        ATBaseAdAdapter aTBaseAdAdapter = this.f14026d;
        if (baseAd != null) {
            return com.anythink.core.common.d.l.a(baseAd, aTBaseAdAdapter, 4);
        }
        if (aTBaseAdAdapter != null) {
            return com.anythink.core.common.d.l.a(aTBaseAdAdapter, 4);
        }
        return null;
    }

    public String toString() {
        return "AdCacheInfo{UnitGroupInfo:" + this.f14026d.getUnitGroupInfo().toString() + ", showTime=" + this.f14028f + ", cacheTime=" + this.f14029g + ", upStatus=" + this.f14030h + ", upStatusOutDateTime=" + (this.f14025c + this.i) + ", hasDestroy=" + this.f14031j + '}';
    }

    private int d(c cVar) {
        bv unitGroupInfo = this.f14026d.getUnitGroupInfo();
        bv unitGroupInfo2 = cVar.f14026d.getUnitGroupInfo();
        int b9 = com.anythink.core.common.v.l.b(unitGroupInfo, unitGroupInfo2);
        if (b9 < 0) {
            return -1;
        }
        if (b9 > 0) {
            return 1;
        }
        int i = unitGroupInfo.f13970m;
        int i4 = unitGroupInfo2.f13970m;
        if (i < i4) {
            return -1;
        }
        if (i != i4) {
            return 1;
        }
        if (b() < cVar.b()) {
            return -1;
        }
        return b() != cVar.b() ? 1 : 0;
    }

    public final boolean a() {
        return this.f14030h == 1 && System.currentTimeMillis() - this.f14025c < this.i;
    }

    public final long b() {
        return this.f14025c + this.i;
    }

    public final int c() {
        return this.f14028f;
    }

    public final void a(long j9) {
        this.i = j9;
    }

    public final void b(long j9) {
        this.f14029g = j9;
    }

    public final void c(long j9) {
        this.f14030h = 1;
        this.f14025c = j9;
    }

    public final void a(int i) {
        bv unitGroupInfo;
        ad R8;
        this.f14028f = i;
        if (i > 0) {
            this.f14030h = 0;
            ATBaseAdAdapter aTBaseAdAdapter = this.f14026d;
            if (aTBaseAdAdapter == null || (unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo()) == null || (R8 = unitGroupInfo.R()) == null) {
                return;
            }
            R8.q();
        }
    }

    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f14026d = aTBaseAdAdapter;
    }

    public final void a(BaseAd baseAd) {
        this.f14027e = baseAd;
        ATBaseAdAdapter aTBaseAdAdapter = this.f14026d;
        if ((!(aTBaseAdAdapter != null) || !(aTBaseAdAdapter.getUnitGroupInfo() != null)) || this.f14026d.getUnitGroupInfo().aX() != null) {
            return;
        }
        this.f14026d.getUnitGroupInfo().a(baseAd);
    }

    public final void a(String str) {
        this.f14032k = str;
    }
}
