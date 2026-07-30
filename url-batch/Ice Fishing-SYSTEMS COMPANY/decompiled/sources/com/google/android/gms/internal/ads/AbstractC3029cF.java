package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3029cF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f29657a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f29658b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f29659c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f29660d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f29657a = new C3733pG(C2920aF.class, C2975bF.f29463x);
        f29658b = new C3625nG(a9, C2975bF.f29460u);
        f29659c = new XF(ZE.class, C2975bF.f29461v);
        f29660d = new VF(a9, C2975bF.f29462w);
    }

    public static EI a(LE le) {
        if (LE.f26127y.equals(le)) {
            return EI.TINK;
        }
        if (LE.f26128z.equals(le)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(le.f26130u));
    }

    public static LE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return LE.f26127y;
        }
        if (ordinal == 3) {
            return LE.f26128z;
        }
        int a9 = ei.a();
        throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
    }
}
