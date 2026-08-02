package w2;

import a.AbstractC0124a;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class c extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, String str2) {
        super(new C1503a(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        AbstractC0124a.h(charArray.length == 64);
    }

    @Override // w2.e
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence d4 = d(charSequence);
        int length = d4.length();
        C1503a c1503a = this.f15932a;
        if (!c1503a.f15928h[length % c1503a.f15925e]) {
            throw new d("Invalid input length " + d4.length());
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < d4.length()) {
            int i6 = i4 + 2;
            int a3 = (c1503a.a(d4.charAt(i4 + 1)) << 12) | (c1503a.a(d4.charAt(i4)) << 18);
            int i7 = i5 + 1;
            bArr[i5] = (byte) (a3 >>> 16);
            if (i6 < d4.length()) {
                int i8 = i4 + 3;
                int a4 = a3 | (c1503a.a(d4.charAt(i6)) << 6);
                int i9 = i5 + 2;
                bArr[i7] = (byte) ((a4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i8 < d4.length()) {
                    i4 += 4;
                    i5 += 3;
                    bArr[i9] = (byte) ((a4 | c1503a.a(d4.charAt(i8))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i5 = i9;
                    i4 = i8;
                }
            } else {
                i5 = i7;
                i4 = i6;
            }
        }
        return i5;
    }

    @Override // w2.e
    public final void c(StringBuilder sb, byte[] bArr, int i4) {
        int i5 = 0;
        AbstractC0124a.r(0, i4, bArr.length);
        for (int i6 = i4; i6 >= 3; i6 -= 3) {
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
            i5 += 3;
            int i9 = i8 | (bArr[i7] & 255);
            C1503a c1503a = this.f15932a;
            char[] cArr = c1503a.f15922b;
            char[] cArr2 = c1503a.f15922b;
            sb.append(cArr[i9 >>> 18]);
            sb.append(cArr2[(i9 >>> 12) & 63]);
            sb.append(cArr2[(i9 >>> 6) & 63]);
            sb.append(cArr2[i9 & 63]);
        }
        if (i5 < i4) {
            b(sb, bArr, i5, i4 - i5);
        }
    }
}
