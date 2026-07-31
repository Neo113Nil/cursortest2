package E2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class K implements Q {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f525a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f526b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f527c;

    /* renamed from: d, reason: collision with root package name */
    private int f528d;

    public K(OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f525a = stream;
        this.f526b = C0376g.f603c.d();
        this.f527c = C0378i.f606c.d();
    }

    private final void e(int i4, String str) {
        int i5;
        int length = str.length();
        for (int i6 = i4 - 1; i6 < length; i6++) {
            int f4 = f(i4, 2);
            char charAt = str.charAt(i6);
            if (charAt < a0.a().length) {
                byte b4 = a0.a()[charAt];
                if (b4 == 0) {
                    i5 = f4 + 1;
                    this.f527c[f4] = charAt;
                } else {
                    if (b4 == 1) {
                        String str2 = a0.b()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int f5 = f(f4, str2.length());
                        str2.getChars(0, str2.length(), this.f527c, f5);
                        i4 = f5 + str2.length();
                    } else {
                        char[] cArr = this.f527c;
                        cArr[f4] = '\\';
                        cArr[f4 + 1] = (char) b4;
                        i4 = f4 + 2;
                    }
                }
            } else {
                i5 = f4 + 1;
                this.f527c[f4] = charAt;
            }
            i4 = i5;
        }
        f(i4, 1);
        char[] cArr2 = this.f527c;
        cArr2[i4] = '\"';
        i(cArr2, i4 + 1);
        g();
    }

    private final int f(int i4, int i5) {
        int i6 = i5 + i4;
        char[] cArr = this.f527c;
        if (cArr.length <= i6) {
            char[] copyOf = Arrays.copyOf(cArr, kotlin.ranges.g.d(i6, i4 * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f527c = copyOf;
        }
        return i4;
    }

    private final void g() {
        this.f525a.write(this.f526b, 0, this.f528d);
        this.f528d = 0;
    }

    private final void i(char[] cArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i4 > cArr.length) {
            throw new IllegalArgumentException(("count > string.length: " + i4 + " > " + cArr.length).toString());
        }
        int i5 = 0;
        while (i5 < i4) {
            char c4 = cArr[i5];
            if (c4 < 128) {
                if (this.f526b.length - this.f528d < 1) {
                    g();
                }
                byte[] bArr = this.f526b;
                int i6 = this.f528d;
                int i7 = i6 + 1;
                this.f528d = i7;
                bArr[i6] = (byte) c4;
                i5++;
                int min = Math.min(i4, (bArr.length - i7) + i5);
                while (i5 < min) {
                    char c5 = cArr[i5];
                    if (c5 < 128) {
                        byte[] bArr2 = this.f526b;
                        int i8 = this.f528d;
                        this.f528d = i8 + 1;
                        bArr2[i8] = (byte) c5;
                        i5++;
                    }
                }
            } else {
                if (c4 < 2048) {
                    if (this.f526b.length - this.f528d < 2) {
                        g();
                    }
                    byte[] bArr3 = this.f526b;
                    int i9 = this.f528d;
                    int i10 = i9 + 1;
                    this.f528d = i10;
                    bArr3[i9] = (byte) ((c4 >> 6) | 192);
                    int i11 = (c4 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN;
                    this.f528d = i9 + 2;
                    bArr3[i10] = (byte) i11;
                } else if (c4 < 55296 || c4 > 57343) {
                    if (this.f526b.length - this.f528d < 3) {
                        g();
                    }
                    byte[] bArr4 = this.f526b;
                    int i12 = this.f528d;
                    int i13 = i12 + 1;
                    this.f528d = i13;
                    bArr4[i12] = (byte) ((c4 >> '\f') | 224);
                    int i14 = ((c4 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i15 = i12 + 2;
                    this.f528d = i15;
                    bArr4[i13] = (byte) i14;
                    int i16 = (c4 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN;
                    this.f528d = i12 + 3;
                    bArr4[i15] = (byte) i16;
                } else {
                    int i17 = i5 + 1;
                    char c6 = i17 < i4 ? cArr[i17] : (char) 0;
                    if (c4 > 56319 || 56320 > c6 || c6 >= 57344) {
                        if (this.f526b.length - this.f528d < 1) {
                            g();
                        }
                        byte[] bArr5 = this.f526b;
                        int i18 = this.f528d;
                        this.f528d = i18 + 1;
                        bArr5[i18] = (byte) 63;
                        i5 = i17;
                    } else {
                        int i19 = (((c4 & 1023) << 10) | (c6 & 1023)) + 65536;
                        if (this.f526b.length - this.f528d < 4) {
                            g();
                        }
                        byte[] bArr6 = this.f526b;
                        int i20 = this.f528d;
                        int i21 = i20 + 1;
                        this.f528d = i21;
                        bArr6[i20] = (byte) ((i19 >> 18) | 240);
                        int i22 = ((i19 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
                        int i23 = i20 + 2;
                        this.f528d = i23;
                        bArr6[i21] = (byte) i22;
                        int i24 = ((i19 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
                        int i25 = i20 + 3;
                        this.f528d = i25;
                        bArr6[i23] = (byte) i24;
                        int i26 = (i19 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
                        this.f528d = i20 + 4;
                        bArr6[i25] = (byte) i26;
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
    }

    private final void j(int i4) {
        if (i4 < 128) {
            if (this.f526b.length - this.f528d < 1) {
                g();
            }
            byte[] bArr = this.f526b;
            int i5 = this.f528d;
            this.f528d = i5 + 1;
            bArr[i5] = (byte) i4;
            return;
        }
        if (i4 < 2048) {
            if (this.f526b.length - this.f528d < 2) {
                g();
            }
            byte[] bArr2 = this.f526b;
            int i6 = this.f528d;
            int i7 = i6 + 1;
            this.f528d = i7;
            bArr2[i6] = (byte) ((i4 >> 6) | 192);
            int i8 = (i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
            this.f528d = i6 + 2;
            bArr2[i7] = (byte) i8;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            if (this.f526b.length - this.f528d < 1) {
                g();
            }
            byte[] bArr3 = this.f526b;
            int i9 = this.f528d;
            this.f528d = i9 + 1;
            bArr3[i9] = (byte) 63;
            return;
        }
        if (i4 < 65536) {
            if (this.f526b.length - this.f528d < 3) {
                g();
            }
            byte[] bArr4 = this.f526b;
            int i10 = this.f528d;
            int i11 = i10 + 1;
            this.f528d = i11;
            bArr4[i10] = (byte) ((i4 >> 12) | 224);
            int i12 = ((i4 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
            int i13 = i10 + 2;
            this.f528d = i13;
            bArr4[i11] = (byte) i12;
            int i14 = (i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
            this.f528d = i10 + 3;
            bArr4[i13] = (byte) i14;
            return;
        }
        if (i4 > 1114111) {
            throw new D("Unexpected code point: " + i4);
        }
        if (this.f526b.length - this.f528d < 4) {
            g();
        }
        byte[] bArr5 = this.f526b;
        int i15 = this.f528d;
        int i16 = i15 + 1;
        this.f528d = i16;
        bArr5[i15] = (byte) ((i4 >> 18) | 240);
        int i17 = ((i4 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
        int i18 = i15 + 2;
        this.f528d = i18;
        bArr5[i16] = (byte) i17;
        int i19 = ((i4 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
        int i20 = i15 + 3;
        this.f528d = i20;
        bArr5[i18] = (byte) i19;
        int i21 = (i4 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f528d = i15 + 4;
        bArr5[i20] = (byte) i21;
    }

    @Override // E2.Q
    public void a(char c4) {
        j(c4);
    }

    @Override // E2.Q
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        f(0, text.length() + 2);
        char[] cArr = this.f527c;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i4 = length + 1;
        for (int i5 = 1; i5 < i4; i5++) {
            char c4 = cArr[i5];
            if (c4 < a0.a().length && a0.a()[c4] != 0) {
                e(i5, text);
                return;
            }
        }
        cArr[i4] = '\"';
        i(cArr, length + 2);
        g();
    }

    @Override // E2.Q
    public void c(long j4) {
        d(String.valueOf(j4));
    }

    @Override // E2.Q
    public void d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        f(0, length);
        text.getChars(0, length, this.f527c, 0);
        i(this.f527c, length);
    }

    public void h() {
        g();
        C0378i.f606c.c(this.f527c);
        C0376g.f603c.c(this.f526b);
    }
}
