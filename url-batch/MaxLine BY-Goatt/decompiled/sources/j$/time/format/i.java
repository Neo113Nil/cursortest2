package j$.time.format;

import java.math.BigInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public class i implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.q a;
    public final int b;
    public final int c;
    public final f0 d;
    public final int e;

    public i(j$.time.temporal.q qVar, int i, int i2, f0 f0Var) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = f0Var;
        this.e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r5 = r12;
        r2 = r20;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int B(v vVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigInteger;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        DateTimeFormatter dateTimeFormatter;
        boolean z5;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter2 = vVar.a;
        dateTimeFormatter2.c.getClass();
        int i4 = this.c;
        f0 f0Var = this.d;
        int i5 = this.b;
        int i6 = 0;
        boolean z6 = true;
        if (charAt == '+') {
            boolean z7 = vVar.c;
            boolean z8 = i5 == i4;
            int ordinal = f0Var.ordinal();
            if (ordinal == 0 ? z7 : !(ordinal == 1 || ordinal == 4 || (!z7 && !z8))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter2.c.getClass();
            if (charAt == '-') {
                boolean z9 = vVar.c;
                boolean z10 = i5 == i4;
                int ordinal2 = f0Var.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 4 && (z9 || z10)) {
                    return ~i;
                }
                i2 = i + 1;
                z2 = false;
                z = true;
            } else {
                if (f0Var == f0.ALWAYS && vVar.c) {
                    return ~i;
                }
                i2 = i;
                z = false;
                z2 = false;
            }
        }
        int i7 = (vVar.c || b(vVar)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!vVar.c && !b(vVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int max = Math.max(i9, 0) + i4;
        while (true) {
            bigInteger = null;
            if (i6 >= 2) {
                z3 = z;
                z4 = z2;
                i3 = i2;
                j = 0;
                break;
            }
            int min = Math.min(i2 + max, length);
            boolean z11 = z6;
            long j2 = 0;
            int i10 = i2;
            while (true) {
                if (i10 >= min) {
                    z3 = z;
                    break;
                }
                int i11 = i10 + 1;
                char charAt2 = charSequence.charAt(i10);
                dateTimeFormatter2.c.getClass();
                int i12 = charAt2 - '0';
                z3 = z;
                if (i12 < 0 || i12 > 9) {
                    i12 = -1;
                }
                if (i12 >= 0) {
                    if (i11 - i2 > 18) {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j2);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        bigInteger = bigInteger.multiply(BigInteger.TEN).add(BigInteger.valueOf(i12));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        j2 = (j2 * 10) + i12;
                    }
                    i10 = i11;
                    z = z3;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z2 = z5;
                } else if (i10 < i8) {
                    return ~i2;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z4 = z2;
            if (i9 <= 0 || i6 != 0) {
                break;
            }
            int max2 = Math.max(i7, (i10 - i2) - i9);
            i6++;
            z6 = z11;
            z = z3;
            dateTimeFormatter2 = dateTimeFormatter3;
            z2 = z4;
            max = max2;
        }
        BigInteger bigInteger2 = bigInteger;
        if (z3) {
            if (bigInteger2 != null) {
                if (bigInteger2.equals(BigInteger.ZERO) && vVar.c) {
                    return ~(i2 - 1);
                }
                bigInteger2 = bigInteger2.negate();
            } else {
                if (j == 0 && vVar.c) {
                    return ~(i2 - 1);
                }
                j = -j;
            }
        } else if (f0Var == f0.EXCEEDS_PAD && vVar.c) {
            int i13 = i3 - i2;
            if (z4) {
                if (i13 <= i5) {
                    return ~(i2 - 1);
                }
            } else if (i13 > i5) {
                return ~i2;
            }
        }
        if (bigInteger2 == null) {
            return c(vVar, j, i2, i3);
        }
        if (bigInteger2.bitLength() > 63) {
            bigInteger2 = bigInteger2.divide(BigInteger.TEN);
            i3--;
        }
        return c(vVar, bigInteger2.longValue(), i2, i3);
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == f0.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.f(this.a, j, i, i2);
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean s(y yVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.a;
        Long a = yVar.a(qVar);
        if (a == null) {
            return false;
        }
        long a2 = a(yVar, a.longValue());
        c0 c0Var = yVar.b.c;
        String l = a2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a2));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i);
        }
        c0Var.getClass();
        int i2 = this.b;
        f0 f0Var = this.d;
        if (a2 >= 0) {
            int i3 = b.a[f0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && a2 >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[f0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + qVar + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.q qVar = this.a;
        f0 f0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && f0Var == f0.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i2 == i && f0Var == f0.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i2 + ")";
        }
        return "Value(" + qVar + "," + i2 + "," + i + "," + f0Var + ")";
    }

    public i(j$.time.temporal.q qVar, int i, int i2, f0 f0Var, int i3) {
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = f0Var;
        this.e = i3;
    }

    public long a(y yVar, long j) {
        return j;
    }
}
