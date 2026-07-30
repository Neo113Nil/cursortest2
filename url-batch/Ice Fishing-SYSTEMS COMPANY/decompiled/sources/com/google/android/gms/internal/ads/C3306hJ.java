package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.hJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3306hJ extends UG {

    /* renamed from: a, reason: collision with root package name */
    public final HE f31222a;

    /* renamed from: b, reason: collision with root package name */
    public final C3252gJ f31223b;

    /* renamed from: c, reason: collision with root package name */
    public final GE f31224c;

    /* renamed from: d, reason: collision with root package name */
    public final LE f31225d;

    public C3306hJ(HE he, C3252gJ c3252gJ, GE ge, LE le) {
        this.f31222a = he;
        this.f31223b = c3252gJ;
        this.f31224c = ge;
        this.f31225d = le;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f31225d != LE.f26123G;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3306hJ)) {
            return false;
        }
        C3306hJ c3306hJ = (C3306hJ) obj;
        return c3306hJ.f31222a == this.f31222a && c3306hJ.f31223b == this.f31223b && c3306hJ.f31224c == this.f31224c && c3306hJ.f31225d == this.f31225d;
    }

    public final int hashCode() {
        return Objects.hash(C3306hJ.class, this.f31222a, this.f31223b, this.f31224c, this.f31225d);
    }

    public final String toString() {
        String str = this.f31225d.f26130u;
        int length = str.length();
        String str2 = this.f31224c.f25128b;
        int length2 = str2.length();
        String str3 = this.f31222a.f25338b;
        int length3 = str3.length();
        String str4 = this.f31223b.f30979a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        AbstractC5051n.j(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        AbstractC5051n.j(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
