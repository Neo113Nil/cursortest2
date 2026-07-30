package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.rF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3839rF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f34001a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f34002b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f34003c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f34004d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f34001a = new C3733pG(QE.class, C2975bF.f29451P);
        f34002b = new C3625nG(a9, C2975bF.f29448M);
        f34003c = new XF(NE.class, C2975bF.f29449N);
        f34004d = new VF(a9, C2975bF.f29450O);
    }

    public static EI a(C3731pE c3731pE) {
        if (C3731pE.f33366y.equals(c3731pE)) {
            return EI.TINK;
        }
        if (C3731pE.f33367z.equals(c3731pE)) {
            return EI.CRUNCHY;
        }
        if (C3731pE.f33353A.equals(c3731pE)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3731pE)));
    }

    public static C3731pE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return C3731pE.f33366y;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C3731pE.f33353A;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return C3731pE.f33367z;
    }
}
