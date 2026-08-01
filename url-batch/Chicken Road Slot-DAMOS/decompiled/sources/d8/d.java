package d8;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final c f3692c;

    /* renamed from: a, reason: collision with root package name */
    public final a f3693a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f3694b;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        f3692c = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new b();
    }

    public d(a aVar, Character ch) {
        boolean z10;
        this.f3693a = aVar;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = aVar.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z10 = false;
                i7.a.u(z10, "Padding character %s was already in alphabet", ch);
                this.f3694b = ch;
            }
        }
        z10 = true;
        i7.a.u(z10, "Padding character %s was already in alphabet", ch);
        this.f3694b = ch;
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        i7.a.D(0, length, bArr.length);
        a aVar = this.f3693a;
        int i3 = aVar.f3689e;
        int i10 = aVar.f3690f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(cf.c.q(length, i10) * i3);
        try {
            c(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i3, int i10) {
        i7.a.D(i3, i3 + i10, bArr.length);
        a aVar = this.f3693a;
        int i11 = aVar.f3690f;
        int i12 = aVar.f3688d;
        int i13 = 0;
        i7.a.t(i10 <= i11);
        long j = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j = (j | (bArr[i3 + i14] & 255)) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.f3686b[((int) (j >>> (i15 - i13))) & aVar.f3687c]);
            i13 += i12;
        }
        Character ch = this.f3694b;
        if (ch != null) {
            while (i13 < aVar.f3690f * 8) {
                sb2.append(ch.charValue());
                i13 += i12;
            }
        }
    }

    public void c(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        i7.a.D(0, i3, bArr.length);
        while (i10 < i3) {
            a aVar = this.f3693a;
            b(sb2, bArr, i10, Math.min(aVar.f3690f, i3 - i10));
            i10 += aVar.f3690f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f3693a.equals(dVar.f3693a) && g8.b.x(this.f3694b, dVar.f3694b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3693a.f3686b) ^ Arrays.hashCode(new Object[]{this.f3694b});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f3693a;
        sb2.append(aVar.f3685a);
        if (8 % aVar.f3688d != 0) {
            Character ch = this.f3694b;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
