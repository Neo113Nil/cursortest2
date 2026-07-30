package j$.time.format;

import com.google.firebase.encoders.json.BuildConfig;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class f extends i {
    public final boolean g;

    public f(j$.time.temporal.q qVar, int i, int i2, boolean z) {
        this(qVar, i, i2, z, 0);
        Objects.requireNonNull(qVar, "field");
        j$.time.temporal.u J = qVar.J();
        if (J.a != J.b || J.c != J.d) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", qVar));
        }
        if (i < 0 || i > 9) {
            j$.time.h.h("Minimum width must be from 0 to 9 inclusive but was ", i);
            throw null;
        }
        if (i2 < 1 || i2 > 9) {
            j$.time.h.h("Maximum width must be from 1 to 9 inclusive but was ", i2);
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        int i2 = (z || b(vVar)) ? this.b : 0;
        int i3 = (vVar.c || b(vVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char charAt = charSequence.charAt(i);
                dateTimeFormatter.c.getClass();
                if (charAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int min = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (true) {
                if (i7 >= min) {
                    break;
                }
                int i8 = i7 + 1;
                char charAt2 = charSequence.charAt(i7);
                dateTimeFormatter.c.getClass();
                int i9 = charAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 >= 0) {
                    i6 = (i6 * 10) + i9;
                    i7 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            j$.time.temporal.u J = this.a.J();
            BigDecimal valueOf = BigDecimal.valueOf(J.a);
            return vVar.f(this.a, movePointLeft.multiply(BigDecimal.valueOf(J.d).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean s(y yVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long a = yVar.a(qVar);
        if (a == null) {
            return false;
        }
        c0 c0Var = yVar.b.c;
        long longValue = a.longValue();
        j$.time.temporal.u J = qVar.J();
        J.b(longValue, qVar);
        BigDecimal valueOf = BigDecimal.valueOf(J.a);
        BigDecimal add = BigDecimal.valueOf(J.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            c0Var.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c0Var.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c0Var.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : BuildConfig.FLAVOR) + ")";
    }

    public f(j$.time.temporal.q qVar, int i, int i2, boolean z, int i3) {
        super(qVar, i, i2, f0.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
