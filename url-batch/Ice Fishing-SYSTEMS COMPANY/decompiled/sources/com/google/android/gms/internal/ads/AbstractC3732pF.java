package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3732pF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f33370a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f33371b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f33372c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f33373d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f33370a = new C3733pG(ME.class, C2975bF.f29447L);
        f33371b = new C3625nG(a9, C2975bF.f29445I);
        f33372c = new XF(JE.class, C2975bF.J);
        f33373d = new VF(a9, C2975bF.f29446K);
    }

    public static EI a(LE le) {
        if (LE.f26124v.equals(le)) {
            return EI.TINK;
        }
        if (LE.f26125w.equals(le)) {
            return EI.CRUNCHY;
        }
        if (LE.f26126x.equals(le)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(le)));
    }

    public static LE b(EI ei) {
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            return LE.f26124v;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return LE.f26126x;
            }
            if (ordinal != 4) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
        }
        return LE.f26125w;
    }
}
