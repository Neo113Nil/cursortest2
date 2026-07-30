package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class Wu implements Vu {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28509a;

    /* renamed from: p, reason: collision with root package name */
    public final int f28523p;

    /* renamed from: b, reason: collision with root package name */
    public long f28510b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f28511c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28512d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f28524q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f28525r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f28513e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f28514f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f28515g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f28516h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f28517j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f28518k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f28519l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f28520m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f28521n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28522o = false;

    public Wu(Context context, int i) {
        this.f28509a = context;
        this.f28523p = i;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu C(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final /* bridge */ /* synthetic */ Vu a() {
        n();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu b(boolean z8) {
        synchronized (this) {
            this.f28512d = z8;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu c(Throwable th) {
        synchronized (this) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Y9)).booleanValue()) {
                String d2 = u2.d.d(C4287ze.d(th), "SHA-256");
                if (d2 == null) {
                    d2 = "";
                }
                this.f28519l = d2;
                String d3 = C4287ze.d(th);
                com.bumptech.glide.manager.o d9 = com.bumptech.glide.manager.o.d(new TA('\n'));
                d3.getClass();
                this.f28518k = (String) ((AbstractC3298hB) ((InterfaceC3352iB) d9.f23625w).g(d9, d3)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final synchronized boolean d() {
        return this.f28522o;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu g(C4927z0 c4927z0) {
        synchronized (this) {
            try {
                IBinder iBinder = c4927z0.f40126x;
                if (iBinder != null) {
                    BinderC3754pk binderC3754pk = (BinderC3754pk) iBinder;
                    String str = binderC3754pk.f33487w;
                    if (!TextUtils.isEmpty(str)) {
                        this.f28514f = str;
                    }
                    String str2 = binderC3754pk.f33485u;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f28515g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu h(String str) {
        synchronized (this) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Y9)).booleanValue()) {
                this.f28520m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final /* bridge */ /* synthetic */ Vu i() {
        o();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2.f28515g = r0;
     */
    @Override // com.google.android.gms.internal.ads.Vu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Vu j(C2518Df c2518Df) {
        synchronized (this) {
            try {
                String str = ((Wt) c2518Df.f24454v).f28491b;
                if (!TextUtils.isEmpty(str)) {
                    this.f28514f = str;
                }
                Iterator it = ((List) c2518Df.f24453u).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = ((Ut) it.next()).f28142b0;
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final boolean k() {
        return !TextUtils.isEmpty(this.f28516h);
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu l(int i) {
        synchronized (this) {
            this.f28524q = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final synchronized Xu m() {
        try {
            if (this.f28521n) {
                return null;
            }
            this.f28521n = true;
            if (!this.f28522o) {
                n();
            }
            if (this.f28511c < 0) {
                o();
            }
            return new Xu(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        Configuration configuration;
        p2.j jVar = p2.j.f39798C;
        W3.e eVar = jVar.f39806f;
        Context context = this.f28509a;
        this.f28513e = eVar.F(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f28525r = i;
        jVar.f39810k.getClass();
        this.f28510b = SystemClock.elapsedRealtime();
        this.f28522o = true;
    }

    public final synchronized void o() {
        p2.j.f39798C.f39810k.getClass();
        this.f28511c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu p0(String str) {
        synchronized (this) {
            this.f28516h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Vu
    public final Vu s(int i) {
        synchronized (this) {
            this.f28517j = i;
        }
        return this;
    }
}
