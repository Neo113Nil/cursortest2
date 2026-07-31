package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class tf3 extends jd3<yi3, vi3> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ uf3 f12196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tf3(uf3 uf3Var, Class cls) {
        super(cls);
        this.f12196b = uf3Var;
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* synthetic */ yi3 a(uo3 uo3Var) {
        return yi3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ vi3 c(yi3 yi3Var) {
        ui3 G = vi3.G();
        G.r(uo3.J(un3.a(yi3Var.F())));
        G.s(0);
        return G.o();
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final Map<String, id3<yi3>> d() {
        HashMap hashMap = new HashMap();
        xi3 G = yi3.G();
        G.r(64);
        hashMap.put("AES256_SIV", new id3(G.o(), 1));
        xi3 G2 = yi3.G();
        G2.r(64);
        hashMap.put("AES256_SIV_RAW", new id3(G2.o(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.jd3
    public final /* bridge */ /* synthetic */ void e(yi3 yi3Var) {
        yi3 yi3Var2 = yi3Var;
        if (yi3Var2.F() == 64) {
            return;
        }
        int F = yi3Var2.F();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(F);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
