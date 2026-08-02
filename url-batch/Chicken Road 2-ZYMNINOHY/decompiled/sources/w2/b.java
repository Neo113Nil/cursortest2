package w2;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: f, reason: collision with root package name */
    public final char[] f15930f;

    public b(C1503a c1503a) {
        super(c1503a, (Character) null);
        this.f15930f = new char[512];
        char[] cArr = c1503a.f15922b;
        AbstractC0124a.h(cArr.length == 16);
        for (int i4 = 0; i4 < 256; i4++) {
            char[] cArr2 = this.f15930f;
            cArr2[i4] = cArr[i4 >>> 4];
            cArr2[i4 | 256] = cArr[i4 & 15];
        }
    }

    @Override // w2.e
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            char charAt = charSequence.charAt(i4);
            C1503a c1503a = this.f15932a;
            bArr[i5] = (byte) ((c1503a.a(charAt) << 4) | c1503a.a(charSequence.charAt(i4 + 1)));
            i4 += 2;
            i5++;
        }
        return i5;
    }

    @Override // w2.e
    public final void c(StringBuilder sb, byte[] bArr, int i4) {
        AbstractC0124a.r(0, i4, bArr.length);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = bArr[i5] & 255;
            char[] cArr = this.f15930f;
            sb.append(cArr[i6]);
            sb.append(cArr[i6 | 256]);
        }
    }
}
