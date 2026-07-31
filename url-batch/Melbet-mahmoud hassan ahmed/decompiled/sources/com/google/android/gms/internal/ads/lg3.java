package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class lg3 implements um3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7968a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7969b;

    /* renamed from: c, reason: collision with root package name */
    private ji3 f7970c;

    /* renamed from: d, reason: collision with root package name */
    private kh3 f7971d;

    /* renamed from: e, reason: collision with root package name */
    private int f7972e;

    /* renamed from: f, reason: collision with root package name */
    private vi3 f7973f;

    lg3(tk3 tk3Var) {
        String J = tk3Var.J();
        this.f7968a = J;
        if (J.equals(ge3.f5588b)) {
            try {
                mi3 I = mi3.I(tk3Var.I(), mp3.a());
                this.f7970c = (ji3) ee3.d(tk3Var);
                this.f7969b = I.F();
                return;
            } catch (mq3 e7) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e7);
            }
        }
        if (J.equals(ge3.f5587a)) {
            try {
                nh3 H = nh3.H(tk3Var.I(), mp3.a());
                this.f7971d = (kh3) ee3.d(tk3Var);
                this.f7972e = H.I().F();
                this.f7969b = this.f7972e + H.J().F();
                return;
            } catch (mq3 e8) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e8);
            }
        }
        if (!J.equals(vf3.f13335a)) {
            String valueOf = String.valueOf(J);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            yi3 I2 = yi3.I(tk3Var.I(), mp3.a());
            this.f7973f = (vi3) ee3.d(tk3Var);
            this.f7969b = I2.F();
        } catch (mq3 e9) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.um3
    public final mg3 a(byte[] bArr) {
        if (bArr.length != this.f7969b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f7968a.equals(ge3.f5588b)) {
            hi3 G = ji3.G();
            G.m(this.f7970c);
            G.r(uo3.K(bArr, 0, this.f7969b));
            return new mg3((wc3) ee3.g(this.f7968a, G.o(), wc3.class));
        }
        if (!this.f7968a.equals(ge3.f5587a)) {
            if (!this.f7968a.equals(vf3.f13335a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            ui3 G2 = vi3.G();
            G2.m(this.f7973f);
            G2.r(uo3.K(bArr, 0, this.f7969b));
            return new mg3((zc3) ee3.g(this.f7968a, G2.o(), zc3.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f7972e);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f7972e, this.f7969b);
        ph3 G3 = qh3.G();
        G3.m(this.f7971d.J());
        G3.r(uo3.J(copyOfRange));
        qh3 o7 = G3.o();
        fk3 G4 = gk3.G();
        G4.m(this.f7971d.K());
        G4.r(uo3.J(copyOfRange2));
        gk3 o8 = G4.o();
        jh3 G5 = kh3.G();
        G5.t(this.f7971d.F());
        G5.r(o7);
        G5.s(o8);
        return new mg3((wc3) ee3.g(this.f7968a, G5.o(), wc3.class));
    }

    @Override // com.google.android.gms.internal.ads.um3
    public final int zza() {
        return this.f7969b;
    }
}
