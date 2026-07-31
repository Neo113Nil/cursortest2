package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class fv1 implements ow2 {

    /* renamed from: f, reason: collision with root package name */
    private final Map<gw2, ev1> f5249f;

    /* renamed from: g, reason: collision with root package name */
    private final ar f5250g;

    fv1(ar arVar, Map<gw2, ev1> map) {
        this.f5249f = map;
        this.f5250g = arVar;
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void a(gw2 gw2Var, String str) {
        if (this.f5249f.containsKey(gw2Var)) {
            this.f5250g.c(this.f5249f.get(gw2Var).f4774b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void b(gw2 gw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void s(gw2 gw2Var, String str) {
        if (this.f5249f.containsKey(gw2Var)) {
            this.f5250g.c(this.f5249f.get(gw2Var).f4773a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void z(gw2 gw2Var, String str, Throwable th) {
        if (this.f5249f.containsKey(gw2Var)) {
            this.f5250g.c(this.f5249f.get(gw2Var).f4775c);
        }
    }
}
