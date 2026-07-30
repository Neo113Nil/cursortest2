package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HC {

    /* renamed from: d, reason: collision with root package name */
    public static final FC f25320d = new FC("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* renamed from: e, reason: collision with root package name */
    public static final FC f25321e = new FC("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* renamed from: f, reason: collision with root package name */
    public static final EC f25322f;

    /* renamed from: a, reason: collision with root package name */
    public final DC f25323a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f25324b;

    /* renamed from: c, reason: collision with root package name */
    public volatile HC f25325c;

    static {
        new HC("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new HC("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f25322f = new EC(new DC("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public HC(DC dc, Character ch) {
        this.f25323a = dc;
        boolean z8 = true;
        if (ch != null) {
            byte[] bArr = dc.f24363g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z8 = false;
            }
        }
        PA.M(z8, "Padding character %s was already in alphabet", ch);
        this.f25324b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i4 = 0;
        PA.c0(0, i, bArr.length);
        while (i4 < i) {
            int i9 = this.f25323a.f24362f;
            d(sb, bArr, i4, Math.min(i9, i - i4));
            i4 += i9;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        int i;
        CharSequence e6 = e(charSequence);
        int length = e6.length();
        DC dc = this.f25323a;
        boolean[] zArr = dc.f24364h;
        int i4 = dc.f24361e;
        if (!zArr[length % i4]) {
            int length2 = e6.length();
            throw new GC(D.y.j(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < e6.length(); i10 += i4) {
            long j9 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i = dc.f24360d;
                if (i11 >= i4) {
                    break;
                }
                j9 <<= i;
                if (i10 + i11 < e6.length()) {
                    j9 |= dc.a(e6.charAt(i12 + i10));
                    i12++;
                }
                i11++;
            }
            int i13 = i12 * i;
            int i14 = dc.f24362f;
            int i15 = (i14 - 1) * 8;
            while (i15 >= (i14 * 8) - i13) {
                bArr[i9] = (byte) ((j9 >>> i15) & 255);
                i15 -= 8;
                i9++;
            }
        }
        return i9;
    }

    public HC c(DC dc, Character ch) {
        return new HC(dc, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i4) {
        int i9;
        PA.c0(i, i + i4, bArr.length);
        DC dc = this.f25323a;
        int i10 = dc.f24362f;
        int i11 = 0;
        PA.n(i4 <= i10);
        long j9 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            j9 = (j9 | (bArr[i + i12] & 255)) << 8;
        }
        int i13 = (i4 + 1) * 8;
        while (true) {
            int i14 = i4 * 8;
            i9 = dc.f24360d;
            if (i11 >= i14) {
                break;
            }
            sb.append(dc.f24358b[dc.f24359c & ((int) (j9 >>> ((i13 - i9) - i11)))]);
            i11 += i9;
        }
        if (this.f25324b != null) {
            while (i11 < i10 * 8) {
                sb.append('=');
                i11 += i9;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f25324b == null) {
            return charSequence;
        }
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
        if (obj instanceof HC) {
            HC hc = (HC) obj;
            if (this.f25323a.equals(hc.f25323a) && Objects.equals(this.f25324b, hc.f25324b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    public final HC f() {
        DC dc;
        boolean z8;
        HC hc = this.f25325c;
        if (hc == null) {
            DC dc2 = this.f25323a;
            int i = 0;
            while (true) {
                char[] cArr = dc2.f24358b;
                int length = cArr.length;
                if (i >= length) {
                    dc = dc2;
                    break;
                }
                if (AbstractC3035cL.C(cArr[i])) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z8 = false;
                            break;
                        }
                        char c4 = cArr[i4];
                        if (c4 >= 'a' && c4 <= 'z') {
                            z8 = true;
                            break;
                        }
                        i4++;
                    }
                    PA.U("Cannot call lowerCase() on a mixed-case alphabet", !z8);
                    char[] cArr2 = new char[cArr.length];
                    for (int i9 = 0; i9 < cArr.length; i9++) {
                        char c9 = cArr[i9];
                        if (AbstractC3035cL.C(c9)) {
                            c9 ^= 32;
                        }
                        cArr2[i9] = (char) c9;
                    }
                    dc = new DC(dc2.f24357a.concat(".lowerCase()"), cArr2);
                    if (dc2.i && !dc.i) {
                        byte[] bArr = dc.f24363g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i10 = 65; i10 <= 90; i10++) {
                            int i11 = i10 | 32;
                            byte b9 = bArr[i10];
                            byte b10 = bArr[i11];
                            if (b9 == -1) {
                                copyOf[i10] = b10;
                            } else {
                                char c10 = (char) i10;
                                char c11 = (char) i11;
                                if (b10 != -1) {
                                    throw new IllegalStateException(AbstractC3194fG.u("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                                }
                                copyOf[i11] = b9;
                            }
                        }
                        dc = new DC(dc.f24357a.concat(".ignoreCase()"), dc.f24358b, copyOf, true);
                    }
                } else {
                    i++;
                }
            }
            hc = dc == dc2 ? this : c(dc, this.f25324b);
            this.f25325c = hc;
        }
        return hc;
    }

    public final String g(int i, byte[] bArr) {
        PA.c0(0, i, bArr.length);
        DC dc = this.f25323a;
        int i4 = dc.f24362f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(dc.f24361e * AbstractC2655Lg.n(i, i4));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final byte[] h(String str) {
        try {
            int length = (int) (((this.f25323a.f24360d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b9 = b(bArr, e(str));
            if (b9 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b9];
            System.arraycopy(bArr, 0, bArr2, 0, b9);
            return bArr2;
        } catch (GC e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public final int hashCode() {
        return this.f25323a.hashCode() ^ Objects.hashCode(this.f25324b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        DC dc = this.f25323a;
        sb.append(dc);
        if (8 % dc.f24360d != 0) {
            Character ch = this.f25324b;
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

    public HC(String str, String str2) {
        this(new DC(str, str2.toCharArray()), (Character) '=');
    }
}
