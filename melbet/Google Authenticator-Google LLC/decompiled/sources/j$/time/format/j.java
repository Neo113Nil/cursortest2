package j$.time.format;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class j implements g {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.n a;
    public final int b;
    public final int c;
    public final v d;
    public final int e;

    public j(j$.time.temporal.n nVar, int i, int i2, v vVar) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = vVar;
        this.e = 0;
    }

    public j a() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j b(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.g
    public boolean f(q qVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long a = qVar.a(nVar);
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        ((a) qVar.d).getClass();
        int i = t.a;
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i2 = this.c;
        if (length > i2) {
            throw new j$.time.c("Field " + String.valueOf(nVar) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i2);
        }
        int i3 = this.b;
        v vVar = this.d;
        if (longValue >= 0) {
            int i4 = d.a[vVar.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && longValue >= f[i3]) {
                sb.append('+');
            }
        } else {
            int i5 = d.a[vVar.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                sb.append('-');
            } else if (i5 == 4) {
                throw new j$.time.c("Field " + String.valueOf(nVar) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i6 = 0; i6 < i3 - l.length(); i6++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        v vVar = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && vVar == v.NORMAL) {
            return "Value(" + String.valueOf(nVar) + ")";
        }
        if (i2 == i && vVar == v.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + i2 + "," + i + "," + String.valueOf(vVar) + ")";
    }

    public j(j$.time.temporal.n nVar, int i, int i2, v vVar, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = vVar;
        this.e = i3;
    }
}
