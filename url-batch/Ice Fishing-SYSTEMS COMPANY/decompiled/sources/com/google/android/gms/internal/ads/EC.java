package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class EC extends HC {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f24672g;

    public EC(DC dc) {
        super(dc, (Character) null);
        this.f24672g = new char[512];
        PA.n(dc.f24358b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f24672g;
            char[] cArr2 = dc.f24358b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        PA.c0(0, i, bArr.length);
        for (int i4 = 0; i4 < i; i4++) {
            int i9 = bArr[i4] & 255;
            char[] cArr = this.f24672g;
            sb.append(cArr[i9]);
            sb.append(cArr[i9 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new GC(D.y.j(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i4 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            DC dc = this.f25323a;
            bArr[i4] = (byte) ((dc.a(charAt) << 4) | dc.a(charSequence.charAt(i + 1)));
            i += 2;
            i4++;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final HC c(DC dc, Character ch) {
        return new EC(dc);
    }
}
