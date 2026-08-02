package w2;

import a.AbstractC0124a;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static final b f15931e;

    /* renamed from: a, reason: collision with root package name */
    public final C1503a f15932a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f15933b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e f15934c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f15935d;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f15931e = new b(new C1503a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public e(C1503a c1503a, Character ch) {
        boolean z;
        this.f15932a = c1503a;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = c1503a.f15927g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                AbstractC0124a.k(z, "Padding character %s was already in alphabet", ch);
                this.f15933b = ch;
            }
        }
        z = true;
        AbstractC0124a.k(z, "Padding character %s was already in alphabet", ch);
        this.f15933b = ch;
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        CharSequence d4 = d(charSequence);
        int length = d4.length();
        C1503a c1503a = this.f15932a;
        boolean[] zArr = c1503a.f15928h;
        int i4 = c1503a.f15924d;
        int i5 = c1503a.f15925e;
        if (!zArr[length % i5]) {
            throw new d("Invalid input length " + d4.length());
        }
        int i6 = 0;
        for (int i7 = 0; i7 < d4.length(); i7 += i5) {
            long j4 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                j4 <<= i4;
                if (i7 + i9 < d4.length()) {
                    j4 |= c1503a.a(d4.charAt(i8 + i7));
                    i8++;
                }
            }
            int i10 = c1503a.f15926f;
            int i11 = (i10 * 8) - (i8 * i4);
            int i12 = (i10 - 1) * 8;
            while (i12 >= i11) {
                bArr[i6] = (byte) ((j4 >>> i12) & 255);
                i12 -= 8;
                i6++;
            }
        }
        return i6;
    }

    public final void b(StringBuilder sb, byte[] bArr, int i4, int i5) {
        AbstractC0124a.r(i4, i4 + i5, bArr.length);
        C1503a c1503a = this.f15932a;
        int i6 = c1503a.f15926f;
        int i7 = c1503a.f15924d;
        int i8 = 0;
        AbstractC0124a.h(i5 <= i6);
        long j4 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            j4 = (j4 | (bArr[i4 + i9] & 255)) << 8;
        }
        int i10 = ((i5 + 1) * 8) - i7;
        while (i8 < i5 * 8) {
            sb.append(c1503a.f15922b[((int) (j4 >>> (i10 - i8))) & c1503a.f15923c]);
            i8 += i7;
        }
        Character ch = this.f15933b;
        if (ch != null) {
            while (i8 < c1503a.f15926f * 8) {
                sb.append(ch.charValue());
                i8 += i7;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i4) {
        int i5 = 0;
        AbstractC0124a.r(0, i4, bArr.length);
        while (i5 < i4) {
            C1503a c1503a = this.f15932a;
            b(sb, bArr, i5, Math.min(c1503a.f15926f, i4 - i5));
            i5 += c1503a.f15926f;
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f15933b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f15932a.equals(eVar.f15932a) && Objects.equals(this.f15933b, eVar.f15933b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15932a.hashCode() ^ Objects.hashCode(this.f15933b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C1503a c1503a = this.f15932a;
        sb.append(c1503a);
        if (8 % c1503a.f15924d != 0) {
            Character ch = this.f15933b;
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

    public e(String str, String str2) {
        this(new C1503a(str, str2.toCharArray()), (Character) '=');
    }
}
