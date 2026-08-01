package d8;

import java.math.RoundingMode;
import java.util.Arrays;
import k7.e;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3685a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f3686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3688d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3689e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3690f;
    public final byte[] g;

    public a(String str, char[] cArr) {
        this.f3685a = str;
        cArr.getClass();
        this.f3686b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int A = cf.c.A(length);
            this.f3688d = A;
            int min = Math.min(8, Integer.lowestOneBit(A));
            try {
                this.f3689e = 8 / min;
                this.f3690f = A / min;
                this.f3687c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i3 = 0; i3 < cArr.length; i3++) {
                    char c10 = cArr[i3];
                    if (!(c10 < 128)) {
                        a1.e(e.y("Non-ASCII character: %s", Character.valueOf(c10)));
                        throw null;
                    }
                    if (!(bArr[c10] == -1)) {
                        a1.e(e.y("Duplicate character: %s", Character.valueOf(c10)));
                        throw null;
                    }
                    bArr[c10] = (byte) i3;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.f3689e];
                for (int i10 = 0; i10 < this.f3690f; i10++) {
                    int i11 = this.f3688d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[cf.c.q(i10 * 8, i11)] = true;
                }
            } catch (ArithmeticException e2) {
                String str2 = new String(cArr);
                throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e2);
            }
        } catch (ArithmeticException e9) {
            int length2 = cArr.length;
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Illegal alphabet length ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString(), e9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(this.f3686b, ((a) obj).f3686b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3686b);
    }

    public final String toString() {
        return this.f3685a;
    }
}
