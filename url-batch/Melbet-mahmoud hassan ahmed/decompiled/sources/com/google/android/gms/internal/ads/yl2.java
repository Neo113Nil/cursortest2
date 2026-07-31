package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yl2 implements ij2<zl2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f14739a;

    public yl2(dc3 dc3Var) {
        this.f14739a = dc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<zl2> a() {
        return this.f14739a.E(new Callable() { // from class: com.google.android.gms.internal.ads.wl2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) sw.c().b(m10.F);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) sw.c().b(m10.G)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, a3.o1.a(str2));
                        }
                    }
                }
                return new zl2(hashMap);
            }
        });
    }
}
