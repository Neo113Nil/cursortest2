package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yn2 implements Cloneable {
    public /* synthetic */ boolean m;
    public /* synthetic */ int[] n;
    public /* synthetic */ Object[] o;
    public /* synthetic */ int p;

    public yn2(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.n = new int[i5];
        this.o = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.p;
        if (i2 != 0 && i <= this.n[i2 - 1]) {
            e(i, colorStateList);
            return;
        }
        if (this.m && i2 >= this.n.length) {
            ll3.g(this);
        }
        int i3 = this.p;
        if (i3 >= this.n.length) {
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
            this.n = Arrays.copyOf(this.n, i7);
            this.o = Arrays.copyOf(this.o, i7);
        }
        this.n[i3] = i;
        this.o[i3] = colorStateList;
        this.p = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yn2 clone() {
        Object clone = super.clone();
        clone.getClass();
        yn2 yn2Var = (yn2) clone;
        yn2Var.n = (int[]) this.n.clone();
        yn2Var.o = (Object[]) this.o.clone();
        return yn2Var;
    }

    public final Object c(int i) {
        Object obj;
        int o = yk3.o(this.p, i, this.n);
        if (o < 0 || (obj = this.o[o]) == ll3.g) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.m) {
            ll3.g(this);
        }
        return this.n[i];
    }

    public final void e(int i, Object obj) {
        int o = yk3.o(this.p, i, this.n);
        if (o >= 0) {
            this.o[o] = obj;
            return;
        }
        int i2 = ~o;
        int i3 = this.p;
        if (i2 < i3) {
            Object[] objArr = this.o;
            if (objArr[i2] == ll3.g) {
                this.n[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.m && i3 >= this.n.length) {
            ll3.g(this);
            i2 = ~yk3.o(this.p, i, this.n);
        }
        int i4 = this.p;
        if (i4 >= this.n.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.n = Arrays.copyOf(this.n, i8);
            this.o = Arrays.copyOf(this.o, i8);
        }
        int i9 = this.p;
        if (i9 - i2 != 0) {
            int[] iArr = this.n;
            int i10 = i2 + 1;
            ni.d(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.o;
            ni.e(i10, i2, this.p, objArr2, objArr2);
        }
        this.n[i2] = i;
        this.o[i2] = obj;
        this.p++;
    }

    public final int f() {
        if (this.m) {
            ll3.g(this);
        }
        return this.p;
    }

    public final Object g(int i) {
        if (this.m) {
            ll3.g(this);
        }
        Object[] objArr = this.o;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object g = g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
