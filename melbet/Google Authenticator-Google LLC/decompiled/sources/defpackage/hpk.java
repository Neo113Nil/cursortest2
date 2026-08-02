package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpk extends how {
    private long b;
    private int c;
    private int a = 0;
    private int d = 0;
    private boolean e = false;

    @Override // defpackage.how, defpackage.hpc
    public final void b(byte[] bArr, int i) {
        int i2 = 0;
        hoq.G(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            f(4, hpl.e(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            f(1, bArr[i2] & 255);
            i2++;
        }
    }

    @Override // defpackage.how, defpackage.hpc
    public final void c(int i) {
        f(4, i);
    }

    @Override // defpackage.how, defpackage.hpc
    public final void e(CharSequence charSequence, Charset charset) {
        if (!charset.equals(StandardCharsets.UTF_8)) {
            d(charSequence.toString().getBytes(charset));
            return;
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            char charAt3 = charSequence.charAt(i + 2);
            char charAt4 = charSequence.charAt(i + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            f(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
            i = i2;
        }
        while (i < length) {
            char charAt5 = charSequence.charAt(i);
            if (charAt5 < 128) {
                f(1, charAt5);
            } else if (charAt5 < 2048) {
                f(2, hpl.g(charAt5));
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                f(3, hpl.f(charAt5));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (codePointAt == charAt5) {
                    d(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return;
                } else {
                    f(4, hpl.h(codePointAt));
                    i++;
                }
            }
            i++;
        }
    }

    public final void f(int i, long j) {
        long j2 = this.b;
        int i2 = this.c;
        this.b = ((j & 4294967295L) << i2) | j2;
        int i3 = i2 + (i * 8);
        this.c = i3;
        this.d += i;
        if (i3 >= 32) {
            int i4 = this.a;
            hpb hpbVar = hpl.a;
            this.a = (Integer.rotateLeft((Integer.rotateLeft(((int) r6) * (-862048943), 15) * 461845907) ^ i4, 13) * 5) - 430675100;
            this.b >>>= 32;
            this.c -= 32;
        }
    }

    @Override // defpackage.hpc
    public final hpa k() {
        hoq.H(!this.e);
        this.e = true;
        int i = this.a;
        int i2 = (int) this.b;
        hpb hpbVar = hpl.a;
        int rotateLeft = i ^ (Integer.rotateLeft(i2 * (-862048943), 15) * 461845907);
        this.a = rotateLeft;
        return hpl.i(rotateLeft, this.d);
    }
}
