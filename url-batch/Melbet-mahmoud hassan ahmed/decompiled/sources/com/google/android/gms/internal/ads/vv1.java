package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class vv1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f13513a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wv1 f13514b;

    vv1(wv1 wv1Var) {
        this.f13514b = wv1Var;
    }

    static /* bridge */ /* synthetic */ vv1 a(vv1 vv1Var) {
        vv1Var.f13513a.putAll(vv1Var.f13514b.f13952c);
        return vv1Var;
    }

    public final vv1 b(String str, String str2) {
        this.f13513a.put(str, str2);
        return this;
    }

    public final vv1 c(rr2 rr2Var) {
        this.f13513a.put("aai", rr2Var.f11401x);
        return this;
    }

    public final vv1 d(ur2 ur2Var) {
        this.f13513a.put("gqi", ur2Var.f12947b);
        return this;
    }

    public final String e() {
        return this.f13514b.f13950a.a(this.f13513a);
    }

    public final void f() {
        this.f13514b.f13951b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uv1
            @Override // java.lang.Runnable
            public final void run() {
                vv1.this.g();
            }
        });
    }

    final /* synthetic */ void g() {
        this.f13514b.f13950a.b(this.f13513a);
    }
}
