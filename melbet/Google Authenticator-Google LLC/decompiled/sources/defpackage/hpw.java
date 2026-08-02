package defpackage;

import j$.util.Objects;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hpw extends hpx {
    public final hps b;
    public final Character c;

    public hpw(hps hpsVar, Character ch) {
        this.b = hpsVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (hpsVar.f[61] != -1) {
                z = false;
            }
        }
        hoq.C(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.hpx
    public int a(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e = e(charSequence);
        int length = e.length();
        hps hpsVar = this.b;
        if (!hpsVar.c(length)) {
            throw new hpv("Invalid input length " + e.length());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < e.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = hpsVar.d;
                if (i4 >= i) {
                    break;
                }
                j <<= hpsVar.c;
                if (i2 + i4 < e.length()) {
                    j |= hpsVar.b(e.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = hpsVar.e;
            int i7 = i5 * hpsVar.c;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((j >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // defpackage.hpx
    public void b(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        hoq.G(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.b.e;
            f(appendable, bArr, i2, Math.min(i3, i - i2));
            i2 += i3;
        }
    }

    @Override // defpackage.hpx
    public final int c(int i) {
        return (int) (((this.b.c * i) + 7) / 8);
    }

    @Override // defpackage.hpx
    public final int d(int i) {
        hps hpsVar = this.b;
        return hpsVar.d * hoq.l(i, hpsVar.e, RoundingMode.CEILING);
    }

    @Override // defpackage.hpx
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hpw) {
            hpw hpwVar = (hpw) obj;
            if (this.b.equals(hpwVar.b) && Objects.equals(this.c, hpwVar.c)) {
                return true;
            }
        }
        return false;
    }

    final void f(Appendable appendable, byte[] bArr, int i, int i2) {
        hoq.G(i, i + i2, bArr.length);
        hps hpsVar = this.b;
        int i3 = hpsVar.e;
        int i4 = 0;
        hoq.x(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        while (i4 < i2 * 8) {
            int i7 = hpsVar.c;
            appendable.append(hpsVar.a(hpsVar.b & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.c;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append('=');
                i4 += hpsVar.c;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        hps hpsVar = this.b;
        sb.append(hpsVar);
        if (8 % hpsVar.c != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public hpw(String str, String str2, Character ch) {
        this(new hps(str, str2.toCharArray()), ch);
    }
}
