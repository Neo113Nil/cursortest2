package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ud2 implements ij2 {

    /* renamed from: a, reason: collision with root package name */
    private final cc3<String> f12752a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12753b;

    public ud2(cc3<String> cc3Var, Executor executor) {
        this.f12752a = cc3Var;
        this.f12753b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3 a() {
        return rb3.n(this.f12752a, new xa3() { // from class: com.google.android.gms.internal.ads.td2
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                final String str = (String) obj;
                return rb3.i(new hj2() { // from class: com.google.android.gms.internal.ads.sd2
                    @Override // com.google.android.gms.internal.ads.hj2
                    public final void c(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f12753b);
    }
}
