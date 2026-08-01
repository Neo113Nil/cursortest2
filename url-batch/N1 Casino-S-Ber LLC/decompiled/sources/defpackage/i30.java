package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i30 implements Cloneable {
    public /* synthetic */ int[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public i30() {
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
        int i2 = jw.i(this.h, i, this.f);
        if (i2 >= 0) {
            this.g[i2] = obj;
            return;
        }
        int i3 = ~i2;
        int i4 = this.h;
        if (i3 < i4) {
            Object[] objArr = this.g;
            if (objArr[i3] == e70.h) {
                this.f[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f.length) {
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
            this.f = Arrays.copyOf(this.f, i8);
            this.g = Arrays.copyOf(this.g, i8);
        }
        int i9 = this.h;
        if (i9 - i3 != 0) {
            int[] iArr = this.f;
            int i10 = i3 + 1;
            q6.b0(i10, i3, i9, iArr, iArr);
            Object[] objArr2 = this.g;
            q6.d0(objArr2, objArr2, i10, i3, this.h);
        }
        this.f[i3] = i;
        this.g[i3] = obj;
        this.h++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        i30 i30Var = (i30) clone;
        i30Var.f = (int[]) this.f.clone();
        i30Var.g = (Object[]) this.g.clone();
        return i30Var;
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
