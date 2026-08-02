package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpg {
    public final jpf a;
    public final int[] b;

    public jpg(jpf jpfVar, int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = jpfVar;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    public final int a(int i) {
        return this.b[(r1.length - 1) - i];
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final jpg c(jpg jpgVar) {
        jpf jpfVar = this.a;
        if (!jpfVar.equals(jpgVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return jpgVar;
        }
        if (jpgVar.e()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = jpgVar.b;
        int length = iArr2.length;
        int length2 = iArr.length;
        int[] iArr3 = length2 > length ? iArr : iArr2;
        if (length2 > length) {
            iArr = iArr2;
        }
        int length3 = iArr3.length;
        int length4 = length3 - iArr.length;
        int[] iArr4 = new int[length3];
        System.arraycopy(iArr3, 0, iArr4, 0, length4);
        for (int i = length4; i < iArr3.length; i++) {
            int i2 = iArr[i - length4];
            int i3 = iArr3[i];
            jpf jpfVar2 = jpf.a;
            iArr4[i] = i2 ^ i3;
        }
        return new jpg(jpfVar, iArr4);
    }

    public final jpg d(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.d;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        int i3 = 0;
        while (true) {
            jpf jpfVar = this.a;
            if (i3 >= length) {
                return new jpg(jpfVar, iArr2);
            }
            iArr2[i3] = jpfVar.a(iArr[i3], i2);
            i3++;
        }
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int a = a(b);
            if (a != 0) {
                if (a < 0) {
                    if (b == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    jpf jpfVar = this.a;
                    if (a == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i = jpfVar.c[a];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
