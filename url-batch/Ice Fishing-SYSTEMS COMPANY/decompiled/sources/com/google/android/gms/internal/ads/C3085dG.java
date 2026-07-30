package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.dG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3085dG extends XC {

    /* renamed from: b, reason: collision with root package name */
    public final BG f29994b;

    public C3085dG(BG bg) {
        int i = AbstractC2976bG.f29468b[AbstractC5088e.d(bg.f24015d)];
        this.f29994b = bg;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final AbstractC4000uE b() {
        BG bg = this.f29994b;
        return new C3030cG(bg.f24012a, bg.f24016e);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f29994b.f24017f;
    }

    public final C3791qK j() {
        BG bg = this.f29994b;
        if (bg.f24016e.equals(EI.RAW)) {
            return C3791qK.a(new byte[0]);
        }
        EI ei = EI.TINK;
        EI ei2 = bg.f24016e;
        boolean equals = ei2.equals(ei);
        Integer num = bg.f24017f;
        if (equals) {
            return AbstractC3571mG.b(num.intValue());
        }
        if (ei2.equals(EI.LEGACY) || ei2.equals(EI.CRUNCHY)) {
            return AbstractC3571mG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
