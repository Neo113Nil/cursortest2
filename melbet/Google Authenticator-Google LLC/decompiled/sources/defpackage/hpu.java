package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpu extends hpw {
    public hpu(hps hpsVar, Character ch) {
        super(hpsVar, ch);
        hoq.x(hpsVar.a.length == 64);
    }

    @Override // defpackage.hpw, defpackage.hpx
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence e = e(charSequence);
        int length = e.length();
        hps hpsVar = this.b;
        if (!hpsVar.c(length)) {
            throw new hpv("Invalid input length " + e.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < e.length()) {
            int i3 = i2 + 1;
            int b = (hpsVar.b(e.charAt(i + 1)) << 12) | (hpsVar.b(e.charAt(i)) << 18);
            bArr[i2] = (byte) (b >>> 16);
            int i4 = i + 2;
            if (i4 < e.length()) {
                int i5 = i + 3;
                int b2 = b | (hpsVar.b(e.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((b2 >>> 8) & 255);
                if (i5 < e.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((b2 | hpsVar.b(e.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.hpw, defpackage.hpx
    public final void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        hoq.G(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = bArr[i2 + 1] & 255;
            int i6 = bArr[i2 + 2] & 255;
            hps hpsVar = this.b;
            int i7 = (i5 << 8) | (i4 << 16) | i6;
            appendable.append(hpsVar.a(i7 >>> 18));
            appendable.append(hpsVar.a((i7 >>> 12) & 63));
            appendable.append(hpsVar.a((i7 >>> 6) & 63));
            appendable.append(hpsVar.a(i7 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            f(appendable, bArr, i2, i - i2);
        }
    }

    public hpu(String str, String str2, Character ch) {
        this(new hps(str, str2.toCharArray()), ch);
    }
}
