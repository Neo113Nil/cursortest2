package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class rg3 extends jd3<jk3, gk3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ sg3 f11156b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    rg3(sg3 sg3Var, Class cls) {
        super(cls);
        this.f11156b = sg3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ jk3 a(uo3 uo3Var) {
        return jk3.J(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ gk3 c(jk3 jk3Var) {
        jk3 jk3Var2 = jk3Var;
        fk3 G = gk3.G();
        G.t(0);
        G.s(jk3Var2.K());
        G.r(uo3.J(un3.a(jk3Var2.F())));
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<jk3>> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", sg3.m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", sg3.m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", sg3.m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", sg3.m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", sg3.m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", sg3.m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", sg3.m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", sg3.m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", sg3.m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", sg3.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(jk3 jk3Var) {
        jk3 jk3Var2 = jk3Var;
        if (jk3Var2.F() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        sg3.n(jk3Var2.K());
    }
}
