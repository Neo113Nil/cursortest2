package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lc1 implements Cloneable {
    public /* synthetic */ int[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int g;

    public lc1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.d = new int[i4];
        this.e = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lc1 clone() {
        Object clone = super.clone();
        clone.getClass();
        lc1 lc1Var = (lc1) clone;
        lc1Var.d = (int[]) this.d.clone();
        lc1Var.e = (Object[]) this.e.clone();
        return lc1Var;
    }

    public final Object b(int i) {
        Object obj;
        int o = p4.o(this.d, this.g, i);
        if (o < 0 || (obj = this.e[o]) == mo.p) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int o = p4.o(this.d, this.g, i);
        if (o >= 0) {
            this.e[o] = obj;
            return;
        }
        int i2 = ~o;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == mo.p) {
                this.d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.d = Arrays.copyOf(this.d, i7);
            this.e = Arrays.copyOf(this.e, i7);
        }
        int i8 = this.g;
        if (i8 - i2 != 0) {
            int[] iArr = this.d;
            int i9 = i2 + 1;
            w9.a(iArr, iArr, i9, i2, i8);
            Object[] objArr2 = this.e;
            w9.c(objArr2, objArr2, i9, i2, this.g);
        }
        this.d[i2] = i;
        this.e[i2] = obj;
        this.g++;
    }

    public final Object d(int i) {
        Object[] objArr = this.e;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.g;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.d[i3]);
            sb.append('=');
            Object d = d(i3);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
