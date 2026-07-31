package com.google.android.gms.internal.ads;

import java.util.Set;
import r2.w;

/* loaded from: classes.dex */
public final class fj1 extends lg1<w.a> {

    /* renamed from: g, reason: collision with root package name */
    private boolean f5122g;

    protected fj1(Set<hi1<w.a>> set) {
        super(set);
    }

    public final void a() {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.cj1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((w.a) obj).c();
            }
        });
    }

    public final synchronized void c() {
        if (!this.f5122g) {
            R0(ej1.f4622a);
            this.f5122g = true;
        }
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.dj1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((w.a) obj).d();
            }
        });
    }

    public final synchronized void g() {
        R0(ej1.f4622a);
        this.f5122g = true;
    }

    public final void zza() {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.bj1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((w.a) obj).a();
            }
        });
    }
}
