package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class h extends j {
    public final boolean g;

    public h(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, v.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.j
    public final j a() {
        if (this.e == -1) {
            return this;
        }
        return new h(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j b(int i) {
        return new h(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.g
    public final boolean f(q qVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long a = qVar.a(nVar);
        if (a == null) {
            return false;
        }
        ((a) qVar.d).getClass();
        int i = t.a;
        long longValue = a.longValue();
        j$.time.temporal.q range = nVar.range();
        range.b(longValue, nVar);
        BigDecimal valueOf = BigDecimal.valueOf(range.a);
        BigDecimal add = BigDecimal.valueOf(range.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i2 = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.c), roundingMode).toPlainString().substring(2);
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i2 > 0) {
            if (z) {
                sb.append('.');
            }
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }
}
