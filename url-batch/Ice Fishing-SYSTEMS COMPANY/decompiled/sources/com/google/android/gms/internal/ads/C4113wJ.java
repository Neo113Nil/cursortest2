package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.wJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4113wJ extends UG {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f34969e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f34970a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f34971b;

    /* renamed from: c, reason: collision with root package name */
    public final C4059vJ f34972c;

    /* renamed from: d, reason: collision with root package name */
    public final C4005uJ f34973d;

    public C4113wJ(int i, BigInteger bigInteger, C4059vJ c4059vJ, C4005uJ c4005uJ) {
        this.f34970a = i;
        this.f34971b = bigInteger;
        this.f34972c = c4059vJ;
        this.f34973d = c4005uJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f34972c != C4059vJ.f34751e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4113wJ)) {
            return false;
        }
        C4113wJ c4113wJ = (C4113wJ) obj;
        return c4113wJ.f34970a == this.f34970a && Objects.equals(c4113wJ.f34971b, this.f34971b) && c4113wJ.f34972c == this.f34972c && c4113wJ.f34973d == this.f34973d;
    }

    public final int hashCode() {
        return Objects.hash(C4113wJ.class, Integer.valueOf(this.f34970a), this.f34971b, this.f34972c, this.f34973d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34972c);
        String valueOf2 = String.valueOf(this.f34973d);
        String valueOf3 = String.valueOf(this.f34971b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f34970a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        AbstractC5051n.j(sb, "RSA SSA PKCS1 Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        sb.append(", publicExponent: ");
        sb.append(valueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
