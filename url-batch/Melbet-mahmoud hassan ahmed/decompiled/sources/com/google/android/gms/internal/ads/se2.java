package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class se2 implements ij2<hj2<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f11799a;

    /* renamed from: b, reason: collision with root package name */
    private final tn0 f11800b;

    se2(Executor executor, tn0 tn0Var) {
        this.f11799a = executor;
        this.f11800b = tn0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        return ((Boolean) sw.c().b(m10.T1)).booleanValue() ? rb3.i(null) : rb3.m(this.f11800b.j(), new e43() { // from class: com.google.android.gms.internal.ads.re2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new hj2() { // from class: com.google.android.gms.internal.ads.pe2
                    @Override // com.google.android.gms.internal.ads.hj2
                    public final void c(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f11799a);
    }
}
