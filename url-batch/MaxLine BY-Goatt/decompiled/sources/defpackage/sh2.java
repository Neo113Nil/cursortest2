package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sh2 implements Iterable, k71 {
    public final tn1 m;
    public gi1 n;
    public boolean o;
    public boolean p;

    public sh2() {
        long[] jArr = oe2.a;
        this.m = new tn1();
    }

    public final sh2 a() {
        sh2 sh2Var = new sh2();
        sh2Var.o = this.o;
        sh2Var.p = this.p;
        tn1 tn1Var = sh2Var.m;
        tn1Var.getClass();
        tn1 tn1Var2 = this.m;
        tn1Var2.getClass();
        Object[] objArr = tn1Var2.b;
        Object[] objArr2 = tn1Var2.c;
        long[] jArr = tn1Var2.a;
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
                            tn1Var.m(objArr[i4], objArr2[i4]);
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
        return sh2Var;
    }

    public final Object b(ji2 ji2Var) {
        Object g = this.m.g(ji2Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + ji2Var + " - consider getOrElse or getOrNull");
    }

    public final void c(sh2 sh2Var) {
        tn1 tn1Var = sh2Var.m;
        Object[] objArr = tn1Var.b;
        Object[] objArr2 = tn1Var.c;
        long[] jArr = tn1Var.a;
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
                        ji2 ji2Var = (ji2) obj;
                        tn1 tn1Var2 = this.m;
                        Object g = tn1Var2.g(ji2Var);
                        ji2Var.getClass();
                        Object invoke = ji2Var.b.invoke(g, obj2);
                        if (invoke != null) {
                            tn1Var2.m(ji2Var, invoke);
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

    public final void d(ji2 ji2Var, Object obj) {
        boolean z = obj instanceof r1;
        tn1 tn1Var = this.m;
        if (z && tn1Var.c(ji2Var)) {
            Object g = tn1Var.g(ji2Var);
            g.getClass();
            r1 r1Var = (r1) g;
            r1 r1Var2 = (r1) obj;
            String str = r1Var2.a;
            if (str == null) {
                str = r1Var.a;
            }
            tt0 tt0Var = r1Var2.b;
            if (tt0Var == null) {
                tt0Var = r1Var.b;
            }
            tn1Var.m(ji2Var, new r1(str, tt0Var));
        } else {
            tn1Var.m(ji2Var, obj);
        }
        ji2Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2Var = (sh2) obj;
        return Intrinsics.b(this.m, sh2Var.m) && this.o == sh2Var.o && this.p == sh2Var.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + in1.i(this.m.hashCode() * 31, 31, this.o);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gi1 gi1Var = this.n;
        if (gi1Var == null) {
            tn1 tn1Var = this.m;
            tn1Var.getClass();
            gi1 gi1Var2 = new gi1(tn1Var);
            this.n = gi1Var2;
            gi1Var = gi1Var2;
        }
        return ((ci0) gi1Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.o) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (this.p) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        tn1 tn1Var = this.m;
        Object[] objArr = tn1Var.b;
        Object[] objArr2 = tn1Var.c;
        long[] jArr = tn1Var.a;
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
                            sb.append(((ji2) obj).a);
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
        return z71.Q(this) + "{ " + ((Object) sb) + " }";
    }
}
