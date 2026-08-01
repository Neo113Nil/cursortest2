package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ne0 implements Cloneable {
    public /* synthetic */ boolean f;
    public /* synthetic */ int[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public ne0() {
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
        this.g = new int[i4];
        this.h = new Object[i4];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.i;
        if (i2 != 0 && i <= this.g[i2 - 1]) {
            c(i, colorStateList);
            return;
        }
        if (this.f && i2 >= this.g.length) {
            mv.a(this);
        }
        int i3 = this.i;
        if (i3 >= this.g.length) {
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
            this.g = Arrays.copyOf(this.g, i7);
            this.h = Arrays.copyOf(this.h, i7);
        }
        this.g[i3] = i;
        this.h[i3] = colorStateList;
        this.i = i3 + 1;
    }

    public final Object b(int i) {
        Object obj;
        int c = gk0.c(this.i, i, this.g);
        if (c < 0 || (obj = this.h[c]) == mv.m) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int c = gk0.c(this.i, i, this.g);
        if (c >= 0) {
            this.h[c] = obj;
            return;
        }
        int i2 = ~c;
        int i3 = this.i;
        if (i2 < i3) {
            Object[] objArr = this.h;
            if (objArr[i2] == mv.m) {
                this.g[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f && i3 >= this.g.length) {
            mv.a(this);
            i2 = ~gk0.c(this.i, i, this.g);
        }
        int i4 = this.i;
        if (i4 >= this.g.length) {
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
            this.g = Arrays.copyOf(this.g, i8);
            this.h = Arrays.copyOf(this.h, i8);
        }
        int i9 = this.i;
        if (i9 - i2 != 0) {
            int[] iArr = this.g;
            int i10 = i2 + 1;
            j7.W(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.h;
            j7.Y(objArr2, objArr2, i10, i2, this.i);
        }
        this.g[i2] = i;
        this.h[i2] = obj;
        this.i++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        ne0 ne0Var = (ne0) clone;
        ne0Var.g = (int[]) this.g.clone();
        ne0Var.h = (Object[]) this.h.clone();
        return ne0Var;
    }

    public final int d() {
        if (this.f) {
            mv.a(this);
        }
        return this.i;
    }

    public final Object e(int i) {
        if (this.f) {
            mv.a(this);
        }
        return this.h[i];
    }

    public final String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f) {
                mv.a(this);
            }
            sb.append(this.g[i2]);
            sb.append('=');
            Object e = e(i2);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
