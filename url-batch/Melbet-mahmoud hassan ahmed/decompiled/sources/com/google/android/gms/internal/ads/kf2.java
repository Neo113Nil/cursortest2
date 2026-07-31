package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kf2 implements ij2<hj2<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final ko2 f7509a;

    kf2(ko2 ko2Var) {
        this.f7509a = ko2Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        ko2 ko2Var = this.f7509a;
        hj2 hj2Var = null;
        if (ko2Var != null && ko2Var.a() != null && !this.f7509a.a().isEmpty()) {
            hj2Var = new hj2() { // from class: com.google.android.gms.internal.ads.jf2
                @Override // com.google.android.gms.internal.ads.hj2
                public final void c(Object obj) {
                    kf2.this.b((Bundle) obj);
                }
            };
        }
        return rb3.i(hj2Var);
    }

    final /* synthetic */ void b(Bundle bundle) {
        bundle.putString("key_schema", this.f7509a.a());
    }
}
