package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.fF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3193fF {

    /* renamed from: a, reason: collision with root package name */
    public static final C3733pG f30637a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3625nG f30638b;

    /* renamed from: c, reason: collision with root package name */
    public static final XF f30639c;

    /* renamed from: d, reason: collision with root package name */
    public static final VF f30640d;

    static {
        C3791qK a9 = IG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f30637a = new C3733pG(C3138eF.class, C2975bF.f29438B);
        f30638b = new C3625nG(a9, C2975bF.f29464y);
        f30639c = new XF(C3084dF.class, C2975bF.f29465z);
        f30640d = new VF(a9, C2975bF.f29437A);
    }

    public static EI a(GE ge) {
        if (GE.f25122k.equals(ge)) {
            return EI.TINK;
        }
        if (GE.f25123l.equals(ge)) {
            return EI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ge)));
    }

    public static DI b(C3138eF c3138eF) {
        byte[] b9 = ((CG) C3517lG.f32558b.h(c3138eF.f30339d)).f24159b.b();
        try {
            YK yk = YK.f28820a;
            int i = KK.f25952a;
            C3573mI D8 = C3573mI.D(b9, YK.f28821b);
            CI D9 = DI.D();
            String str = c3138eF.f30337b;
            D9.h();
            ((DI) D9.f30000u).F(str);
            D9.h();
            ((DI) D9.f30000u).G(D8);
            return (DI) D9.j();
        } catch (C3845rL e6) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    public static C3138eF c(DI di, EI ei) {
        C3731pE c3731pE;
        GE ge;
        C3519lI E8 = C3573mI.E();
        E8.m(di.B().A());
        E8.n(di.B().B());
        E8.o(EI.RAW);
        AbstractC4000uE h9 = AbstractC4161xD.h(((C3573mI) E8.j()).b());
        boolean z8 = h9 instanceof QE;
        Object obj = C3731pE.f33359G;
        C3731pE c3731pE2 = C3731pE.f33358F;
        C3731pE c3731pE3 = C3731pE.f33357E;
        C3731pE c3731pE4 = C3731pE.f33355C;
        C3731pE c3731pE5 = C3731pE.f33356D;
        C3731pE c3731pE6 = C3731pE.f33354B;
        if (z8) {
            c3731pE = c3731pE6;
        } else if (h9 instanceof WE) {
            c3731pE = c3731pE5;
        } else if (h9 instanceof C3570mF) {
            c3731pE = c3731pE4;
        } else if (h9 instanceof IE) {
            c3731pE = c3731pE3;
        } else if (h9 instanceof ME) {
            c3731pE = c3731pE2;
        } else {
            if (!(h9 instanceof TE)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(h9.toString()));
            }
            c3731pE = obj;
        }
        int ordinal = ei.ordinal();
        if (ordinal == 1) {
            ge = GE.f25122k;
        } else {
            if (ordinal != 3) {
                int a9 = ei.a();
                throw new GeneralSecurityException(D.y.j(a9, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(a9).length() + 34)));
            }
            ge = GE.f25123l;
        }
        String A8 = di.A();
        AE ae = (AE) h9;
        if (A8 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (ae == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (ae.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((c3731pE.equals(c3731pE6) && (ae instanceof QE)) || ((c3731pE.equals(c3731pE5) && (ae instanceof WE)) || ((c3731pE.equals(c3731pE4) && (ae instanceof C3570mF)) || ((c3731pE.equals(c3731pE3) && (ae instanceof IE)) || ((c3731pE.equals(c3731pE2) && (ae instanceof ME)) || (c3731pE.equals(obj) && (ae instanceof TE))))))) {
            return new C3138eF(ge, A8, c3731pE, ae);
        }
        String valueOf = String.valueOf(ae);
        String str = c3731pE.f33369u;
        StringBuilder sb = new StringBuilder(valueOf.length() + str.length() + 67 + 1);
        AbstractC5051n.j(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", valueOf);
        sb.append(com.anythink.core.common.d.j.f12535z);
        throw new GeneralSecurityException(sb.toString());
    }
}
