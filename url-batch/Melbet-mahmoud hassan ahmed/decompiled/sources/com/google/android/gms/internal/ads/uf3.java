package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class uf3 extends ld3<vi3> {
    uf3() {
        super(vi3.class, new sf3(zc3.class));
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, vi3> a() {
        return new tf3(this, yi3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ vi3 b(uo3 uo3Var) {
        return vi3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(vi3 vi3Var) {
        vi3 vi3Var2 = vi3Var;
        wn3.b(vi3Var2.F(), 0);
        if (vi3Var2.J().q() == 64) {
            return;
        }
        int q7 = vi3Var2.J().q();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(q7);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
