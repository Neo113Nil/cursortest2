package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class rd {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2747k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.m f2749b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.m f2750c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.m f2751d;

    /* renamed from: e, reason: collision with root package name */
    public final a8.m f2752e;

    /* renamed from: f, reason: collision with root package name */
    public final a8.m f2753f;
    public final Uri g;

    /* renamed from: h, reason: collision with root package name */
    public volatile vb f2754h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f2755i;

    public rd(Context context, a8.m mVar, a8.m mVar2, a8.m mVar3) {
        this.f2748a = context;
        this.f2750c = mVar;
        this.f2749b = mVar3;
        this.f2751d = mVar2;
        Pattern pattern = de.f2235a;
        ra raVar = new ra(context);
        raVar.j("phenotype_storage_info");
        raVar.k("storage-info.pb");
        this.g = raVar.l();
        ra raVar2 = new ra(context);
        raVar2.j("phenotype_storage_info");
        raVar2.k("device-encrypted-storage-info.pb");
        Set set = de.f2238d;
        oa.e(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        raVar2.f2738b = "directboot-files";
        this.f2755i = raVar2.l();
        this.f2752e = z4.w.D(new v5(16, this));
        this.f2753f = z4.w.D(new va(mVar, 1));
    }

    public final void a() {
        if (!ia.s(this.f2748a) || c().x() + 86400000 >= System.currentTimeMillis()) {
            f8.o0 o0Var = f8.o0.f4157e;
            return;
        }
        f8.u0 u0Var = (f8.u0) this.f2750c.get();
        u0Var.getClass();
        ListenableFuture e2 = f8.l0.e((ListenableFuture) this.f2753f.get());
        int i3 = f8.h0.f4150v;
        f8.l0.g(e2 instanceof f8.h0 ? (f8.h0) e2 : new f8.i0(e2), new qc(2, this), u0Var);
    }

    public final kd b() {
        vb c10 = c();
        return new kd(c10.v(), b8.g.n(c10.A()), c10.u(), c10.w(), (c10.B() && c10.C().u() == ((long) Build.VERSION.SDK_INT)) ? c10.C().t() : "", b8.g.n(c10.y()), b8.g.n(c10.z()), c10.t(), c10.E(), c10.D(), c10.F());
    }

    public final vb c() {
        vb vbVar;
        vb vbVar2 = this.f2754h;
        if (vbVar2 != null) {
            return vbVar2;
        }
        synchronized (j) {
            vbVar = this.f2754h;
            if (vbVar == null) {
                vbVar = vb.H();
                if (ia.s(this.f2748a)) {
                    j2 j2Var = (j2) vbVar.s(7);
                    c1 c1Var = c1.f2180a;
                    int i3 = q0.f2690a;
                    c1 c1Var2 = c1.f2181b;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream d10 = hg.d(((zd) this.f2751d.get()).b(this.g));
                        try {
                            k1 a9 = ((j1) j2Var).a(d10, c1Var2);
                            if (d10 != null) {
                                d10.close();
                            }
                            vbVar = (vb) a9;
                        } catch (Throwable th) {
                            if (d10 != null) {
                                try {
                                    d10.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    this.f2754h = vbVar;
                }
            }
        }
        return vbVar;
    }
}
