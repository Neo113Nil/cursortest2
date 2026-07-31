package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class mh2 implements ij2<nh2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f8566a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8567b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f8568c;

    public mh2(dc3 dc3Var, Context context, Set<String> set) {
        this.f8566a = dc3Var;
        this.f8567b = context;
        this.f8568c = set;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<nh2> a() {
        return this.f8566a.E(new Callable() { // from class: com.google.android.gms.internal.ads.lh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mh2.this.b();
            }
        });
    }

    final /* synthetic */ nh2 b() {
        if (((Boolean) sw.c().b(m10.B3)).booleanValue()) {
            Set<String> set = this.f8568c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new nh2(y2.t.i().a(this.f8567b));
            }
        }
        return new nh2(null);
    }
}
