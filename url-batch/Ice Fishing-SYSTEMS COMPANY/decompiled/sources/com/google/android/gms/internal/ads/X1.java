package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class X1 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28584c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28585d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28586e;

    public X1(String str, String str2, String str3, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.f.f7459a);
        this.f28583b = str;
        this.f28584c = str2;
        this.f28585d = str3;
        this.f28586e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X1.class == obj.getClass()) {
            X1 x12 = (X1) obj;
            if (Objects.equals(this.f28583b, x12.f28583b) && Objects.equals(this.f28584c, x12.f28584c) && Objects.equals(this.f28585d, x12.f28585d) && Arrays.equals(this.f28586e, x12.f28586e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28583b;
        return Arrays.hashCode(this.f28586e) + ((this.f28585d.hashCode() + ((this.f28584c.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length();
        String str2 = this.f28583b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.f28584c;
        int a9 = AbstractC5051n.a(length2, 14, str3);
        String str4 = this.f28585d;
        StringBuilder sb = new StringBuilder(str4.length() + a9);
        AbstractC5051n.j(sb, str, ": mimeType=", str2, ", filename=");
        return D.y.o(sb, str3, ", description=", str4);
    }
}
