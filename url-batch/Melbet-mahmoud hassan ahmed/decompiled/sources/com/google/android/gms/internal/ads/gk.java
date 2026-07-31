package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class gk implements kk, jk {

    /* renamed from: f, reason: collision with root package name */
    private final Uri f5661f;

    /* renamed from: g, reason: collision with root package name */
    private final sl f5662g;

    /* renamed from: h, reason: collision with root package name */
    private final eh f5663h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5664i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f5665j;

    /* renamed from: k, reason: collision with root package name */
    private final fk f5666k;

    /* renamed from: l, reason: collision with root package name */
    private final gf f5667l = new gf();

    /* renamed from: m, reason: collision with root package name */
    private final int f5668m;

    /* renamed from: n, reason: collision with root package name */
    private jk f5669n;

    /* renamed from: o, reason: collision with root package name */
    private Cif f5670o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5671p;

    public gk(Uri uri, sl slVar, eh ehVar, int i7, Handler handler, fk fkVar, String str, int i8) {
        this.f5661f = uri;
        this.f5662g = slVar;
        this.f5663h = ehVar;
        this.f5664i = i7;
        this.f5665j = handler;
        this.f5666k = fkVar;
        this.f5668m = i8;
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void a(me meVar, boolean z6, jk jkVar) {
        this.f5669n = jkVar;
        yk ykVar = new yk(-9223372036854775807L, false);
        this.f5670o = ykVar;
        jkVar.c(ykVar, null);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void b(ik ikVar) {
        ((ek) ikVar).F();
    }

    @Override // com.google.android.gms.internal.ads.jk
    public final void c(Cif cif, Object obj) {
        gf gfVar = this.f5667l;
        cif.d(0, gfVar, false);
        boolean z6 = gfVar.f5595c != -9223372036854775807L;
        if (!this.f5671p || z6) {
            this.f5670o = cif;
            this.f5671p = z6;
            this.f5669n.c(cif, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final ik d(int i7, wl wlVar) {
        jm.c(i7 == 0);
        return new ek(this.f5661f, this.f5662g.zza(), this.f5663h.zza(), this.f5664i, this.f5665j, this.f5666k, this, wlVar, null, this.f5668m, null);
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void g() {
        this.f5669n = null;
    }

    @Override // com.google.android.gms.internal.ads.kk
    public final void zza() {
    }
}
