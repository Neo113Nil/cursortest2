package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h81 implements u81, Iterable, yb0 {
    public final vn0 d;
    public fk0 e;
    public boolean g;
    public boolean h;

    public h81() {
        long[] jArr = q61.a;
        this.d = new vn0();
    }

    @Override // defpackage.u81
    public final void a(t81 t81Var, Object obj) {
        boolean z = obj instanceof z0;
        vn0 vn0Var = this.d;
        if (z && vn0Var.c(t81Var)) {
            Object g = vn0Var.g(t81Var);
            g.getClass();
            z0 z0Var = (z0) g;
            z0 z0Var2 = (z0) obj;
            String str = z0Var2.a;
            if (str == null) {
                str = z0Var.a;
            }
            z30 z30Var = z0Var2.b;
            if (z30Var == null) {
                z30Var = z0Var.b;
            }
            vn0Var.m(t81Var, new z0(str, z30Var));
        } else {
            vn0Var.m(t81Var, obj);
        }
        t81Var.getClass();
    }

    public final h81 b() {
        h81 h81Var = new h81();
        h81Var.g = this.g;
        h81Var.h = this.h;
        vn0 vn0Var = h81Var.d;
        vn0Var.getClass();
        vn0 vn0Var2 = this.d;
        vn0Var2.getClass();
        Object[] objArr = vn0Var2.b;
        Object[] objArr2 = vn0Var2.c;
        long[] jArr = vn0Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            vn0Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return h81Var;
    }

    public final Object d(t81 t81Var) {
        Object g = this.d.g(t81Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + t81Var + " - consider getOrElse or getOrNull");
    }

    public final void e(h81 h81Var) {
        vn0 vn0Var = h81Var.d;
        Object[] objArr = vn0Var.b;
        Object[] objArr2 = vn0Var.c;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        t81 t81Var = (t81) obj;
                        vn0 vn0Var2 = this.d;
                        Object g = vn0Var2.g(t81Var);
                        t81Var.getClass();
                        Object b = t81Var.b.b(g, obj2);
                        if (b != null) {
                            vn0Var2.m(t81Var, b);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h81)) {
            return false;
        }
        h81 h81Var = (h81) obj;
        return Intrinsics.a(this.d, h81Var.d) && this.g == h81Var.g && this.h == h81Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qy0.d(this.d.hashCode() * 31, 31, this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fk0 fk0Var = this.e;
        if (fk0Var == null) {
            vn0 vn0Var = this.d;
            vn0Var.getClass();
            fk0 fk0Var2 = new fk0(vn0Var);
            this.e = fk0Var2;
            fk0Var = fk0Var2;
        }
        return ((zv) fk0Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        vn0 vn0Var = this.d;
        Object[] objArr = vn0Var.b;
        Object[] objArr2 = vn0Var.c;
        long[] jArr = vn0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((t81) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return t90.D(this) + "{ " + ((Object) sb) + " }";
    }
}
