package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class re3 extends jd3<ci3, zh3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ se3 f11134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    re3(se3 se3Var, Class cls) {
        super(cls);
        this.f11134b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ ci3 a(uo3 uo3Var) {
        return ci3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ zh3 c(ci3 ci3Var) {
        ci3 ci3Var2 = ci3Var;
        yh3 G = zh3.G();
        G.r(uo3.J(un3.a(ci3Var2.F())));
        G.s(ci3Var2.J());
        G.t(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<ci3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", se3.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", se3.k(16, 16, 3));
        hashMap.put("AES256_EAX", se3.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", se3.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(ci3 ci3Var) {
        ci3 ci3Var2 = ci3Var;
        wn3.a(ci3Var2.F());
        if (ci3Var2.J().F() != 12 && ci3Var2.J().F() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
