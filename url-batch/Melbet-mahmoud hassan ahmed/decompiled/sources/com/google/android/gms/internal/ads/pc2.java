package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pc2 implements jd1 {

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<wy> f10174f = new AtomicReference<>();

    public final void a(wy wyVar) {
        this.f10174f.set(wyVar);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void s(final rv rvVar) {
        ro2.a(this.f10174f, new qo2() { // from class: com.google.android.gms.internal.ads.nc2
            @Override // com.google.android.gms.internal.ads.qo2
            public final void c(Object obj) {
                ((wy) obj).s5(rv.this);
            }
        });
    }
}
