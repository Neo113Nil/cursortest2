package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class aa1 {

    /* renamed from: a, reason: collision with root package name */
    private final nw2 f2691a;

    /* renamed from: b, reason: collision with root package name */
    private final po0 f2692b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f2693c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2694d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f2695e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f2696f;

    /* renamed from: g, reason: collision with root package name */
    private final ev3<cc3<String>> f2697g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2698h;

    /* renamed from: i, reason: collision with root package name */
    private final lj2<Bundle> f2699i;

    public aa1(nw2 nw2Var, po0 po0Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, ev3<cc3<String>> ev3Var, a3.t1 t1Var, String str2, lj2<Bundle> lj2Var) {
        this.f2691a = nw2Var;
        this.f2692b = po0Var;
        this.f2693c = applicationInfo;
        this.f2694d = str;
        this.f2695e = list;
        this.f2696f = packageInfo;
        this.f2697g = ev3Var;
        this.f2698h = str2;
        this.f2699i = lj2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ vi0 a(cc3 cc3Var) {
        return new vi0((Bundle) cc3Var.get(), this.f2692b, this.f2693c, this.f2694d, this.f2695e, this.f2696f, this.f2697g.a().get(), this.f2698h, null, null);
    }

    public final cc3<Bundle> b() {
        nw2 nw2Var = this.f2691a;
        return wv2.c(this.f2699i.a(new Bundle()), gw2.SIGNALS, nw2Var).a();
    }

    public final cc3<vi0> c() {
        final cc3<Bundle> b7 = b();
        return this.f2691a.a(gw2.REQUEST_PARCEL, b7, this.f2697g.a()).a(new Callable() { // from class: com.google.android.gms.internal.ads.z91
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aa1.this.a(b7);
            }
        }).a();
    }
}
