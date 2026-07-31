package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class h12 implements j12 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, yv3<j12>> f5992a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f5993b;

    /* renamed from: c, reason: collision with root package name */
    private final rd1 f5994c;

    public h12(Map<String, yv3<j12>> map, dc3 dc3Var, rd1 rd1Var) {
        this.f5992a = map;
        this.f5993b = dc3Var;
        this.f5994c = rd1Var;
    }

    @Override // com.google.android.gms.internal.ads.j12
    public final cc3<ds2> a(final vi0 vi0Var) {
        this.f5994c.p0(vi0Var);
        cc3<ds2> h7 = rb3.h(new fz1(3));
        for (String str : ((String) sw.c().b(m10.Y5)).split(",")) {
            final yv3<j12> yv3Var = this.f5992a.get(str.trim());
            if (yv3Var != null) {
                h7 = rb3.g(h7, fz1.class, new xa3() { // from class: com.google.android.gms.internal.ads.f12
                    @Override // com.google.android.gms.internal.ads.xa3
                    public final cc3 c(Object obj) {
                        yv3 yv3Var2 = yv3.this;
                        return ((j12) yv3Var2.a()).a(vi0Var);
                    }
                }, this.f5993b);
            }
        }
        rb3.r(h7, new g12(this), wo0.f13899f);
        return h7;
    }
}
