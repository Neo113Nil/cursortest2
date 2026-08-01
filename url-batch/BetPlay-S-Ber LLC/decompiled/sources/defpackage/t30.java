package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class t30 implements Cloneable {
    public /* synthetic */ int[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public t30() {
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
        this.f = new int[i4];
        this.g = new Object[i4];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.h;
        if (i2 != 0 && i <= this.f[i2 - 1]) {
            b(i, colorStateList);
            return;
        }
        if (i2 >= this.f.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f = Arrays.copyOf(this.f, i6);
            this.g = Arrays.copyOf(this.g, i6);
        }
        this.f[i2] = i;
        this.g[i2] = colorStateList;
        this.h = i2 + 1;
    }

    public final void b(int i, Object obj) {
        int e = op.e(this.h, i, this.f);
        if (e >= 0) {
            this.g[e] = obj;
            return;
        }
        int i2 = ~e;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.g;
            if (objArr[i2] == op.m) {
                this.f[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f.length) {
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
            this.f = Arrays.copyOf(this.f, i7);
            this.g = Arrays.copyOf(this.g, i7);
        }
        int i8 = this.h;
        if (i8 - i2 != 0) {
            int[] iArr = this.f;
            int i9 = i2 + 1;
            h7.e0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.g;
            h7.g0(objArr2, objArr2, i9, i2, this.h);
        }
        this.f[i2] = i;
        this.g[i2] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        t30 t30Var = (t30) clone;
        t30Var.f = (int[]) this.f.clone();
        t30Var.g = (Object[]) this.g.clone();
        return t30Var;
    }

    public final String toString() {
        int i = this.h;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f[i3]);
            sb.append('=');
            Object obj = this.g[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
