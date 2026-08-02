package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hpt extends hpw {
    final char[] a;

    public hpt(hps hpsVar) {
        super(hpsVar, null);
        this.a = new char[512];
        hoq.x(hpsVar.a.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = hpsVar.a(i >>> 4);
            this.a[i | 256] = hpsVar.a(i & 15);
        }
    }

    @Override // defpackage.hpw, defpackage.hpx
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new hpv("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            hps hpsVar = this.b;
            bArr[i2] = (byte) (hpsVar.b(charSequence.charAt(i + 1)) | (hpsVar.b(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.hpw, defpackage.hpx
    public final void b(Appendable appendable, byte[] bArr, int i) {
        hoq.G(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.a;
            appendable.append(cArr[i3]);
            appendable.append(cArr[i3 | 256]);
        }
    }
}
