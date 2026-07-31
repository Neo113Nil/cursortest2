package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class ye3 extends ld3<pi3> {
    ye3() {
        super(pi3.class, new we3(wc3.class));
    }

    public static void k(boolean z6) {
        if (m()) {
            ee3.m(new ye3(), true);
        }
    }

    static /* bridge */ /* synthetic */ id3 l(int i7, int i8) {
        ri3 G = si3.G();
        G.r(i7);
        return new id3(G.o(), i8);
    }

    private static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final jd3<?, pi3> a() {
        return new xe3(this, si3.class);
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* synthetic */ pi3 b(uo3 uo3Var) {
        return pi3.I(uo3Var, mp3.a());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final /* bridge */ /* synthetic */ void h(pi3 pi3Var) {
        pi3 pi3Var2 = pi3Var;
        wn3.b(pi3Var2.F(), 0);
        wn3.a(pi3Var2.J().q());
    }

    @Override // com.google.android.gms.internal.ads.ld3
    public final int j() {
        return 3;
    }
}
