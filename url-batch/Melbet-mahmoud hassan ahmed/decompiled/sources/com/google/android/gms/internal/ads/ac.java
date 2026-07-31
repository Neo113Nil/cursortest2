package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ac implements v23 {

    /* renamed from: a, reason: collision with root package name */
    private final w03 f2723a;

    /* renamed from: b, reason: collision with root package name */
    private final o13 f2724b;

    /* renamed from: c, reason: collision with root package name */
    private final nc f2725c;

    /* renamed from: d, reason: collision with root package name */
    private final zb f2726d;

    /* renamed from: e, reason: collision with root package name */
    private final jb f2727e;

    ac(w03 w03Var, o13 o13Var, nc ncVar, zb zbVar, jb jbVar) {
        this.f2723a = w03Var;
        this.f2724b = o13Var;
        this.f2725c = ncVar;
        this.f2726d = zbVar;
        this.f2727e = jbVar;
    }

    private final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        a9 b7 = this.f2724b.b();
        hashMap.put("v", this.f2723a.b());
        hashMap.put("gms", Boolean.valueOf(this.f2723a.c()));
        hashMap.put("int", b7.y0());
        hashMap.put("up", Boolean.valueOf(this.f2726d.a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.v23
    public final Map<String, Object> a() {
        Map<String, Object> d7 = d();
        a9 a7 = this.f2724b.a();
        d7.put("gai", Boolean.valueOf(this.f2723a.d()));
        d7.put("did", a7.x0());
        d7.put("dst", Integer.valueOf(a7.m0() - 1));
        d7.put("doo", Boolean.valueOf(a7.j0()));
        jb jbVar = this.f2727e;
        if (jbVar != null) {
            d7.put("nt", Long.valueOf(jbVar.a()));
        }
        return d7;
    }

    final void b(View view) {
        this.f2725c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.v23
    public final Map<String, Object> c() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.v23
    public final Map<String, Object> zza() {
        Map<String, Object> d7 = d();
        d7.put("lts", Long.valueOf(this.f2725c.a()));
        return d7;
    }
}
