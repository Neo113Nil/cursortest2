package w2;

import E.AbstractC0005f;
import a.AbstractC0124a;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15921a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f15922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15923c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15925e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15926f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f15927g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f15928h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15929i;

    public C1503a(String str, char[] cArr, byte[] bArr, boolean z) {
        str.getClass();
        this.f15921a = str;
        cArr.getClass();
        this.f15922b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int I4 = AbstractC0124a.I(length);
            this.f15924d = I4;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(I4);
            int i4 = 1 << (3 - numberOfTrailingZeros);
            this.f15925e = i4;
            this.f15926f = I4 >> numberOfTrailingZeros;
            this.f15923c = cArr.length - 1;
            this.f15927g = bArr;
            boolean[] zArr = new boolean[i4];
            for (int i5 = 0; i5 < this.f15926f; i5++) {
                int i6 = this.f15924d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[AbstractC0124a.v(i5 * 8, i6)] = true;
            }
            this.f15928h = zArr;
            this.f15929i = z;
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e4);
        }
    }

    public final int a(char c4) {
        if (c4 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c4));
        }
        byte b4 = this.f15927g[c4];
        if (b4 != -1) {
            return b4;
        }
        if (c4 <= ' ' || c4 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c4));
        }
        throw new d("Unrecognized character: " + c4);
    }

    public final C1503a b() {
        if (this.f15929i) {
            return this;
        }
        byte[] bArr = this.f15927g;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        int i4 = 65;
        while (true) {
            if (i4 > 90) {
                return new C1503a(AbstractC0005f.q(new StringBuilder(), this.f15921a, ".ignoreCase()"), this.f15922b, copyOf, true);
            }
            int i5 = i4 | 32;
            byte b4 = bArr[i4];
            byte b5 = bArr[i5];
            if (b4 == -1) {
                copyOf[i4] = b5;
            } else {
                boolean z = b5 == -1;
                char c4 = (char) i4;
                char c5 = (char) i5;
                if (!z) {
                    throw new IllegalStateException(AbstractC0347t0.n("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                }
                copyOf[i5] = b4;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1503a)) {
            return false;
        }
        C1503a c1503a = (C1503a) obj;
        return this.f15929i == c1503a.f15929i && Arrays.equals(this.f15922b, c1503a.f15922b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15922b) + (this.f15929i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f15921a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1503a(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i4 = 0; i4 < cArr.length; i4++) {
            char c4 = cArr[i4];
            if (c4 < 128) {
                if (bArr[c4] == -1) {
                    bArr[c4] = (byte) i4;
                } else {
                    throw new IllegalArgumentException(AbstractC0347t0.n("Duplicate character: %s", Character.valueOf(c4)));
                }
            } else {
                throw new IllegalArgumentException(AbstractC0347t0.n("Non-ASCII character: %s", Character.valueOf(c4)));
            }
        }
    }
}
