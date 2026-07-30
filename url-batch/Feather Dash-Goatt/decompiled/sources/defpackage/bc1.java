package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bc1 {
    public final Function1 a;
    public Object b;
    public ln0 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final vn0 e = gb0.k();
    public final vn0 f = new vn0();
    public final wn0 g = new wn0();
    public final eo0 h = new eo0(new xr[16]);
    public final gl i = new gl(1, this);
    public final vn0 l = gb0.k();
    public final HashMap m = new HashMap();

    public bc1(Function1 function1) {
        this.a = function1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc1.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, ln0 ln0Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int c = ln0Var.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = ln0Var.c[c];
        }
        ln0Var.b[c] = obj;
        ln0Var.c[c] = i;
        if ((obj instanceof xr) && i2 != i) {
            wr i3 = ((xr) obj).i();
            this.m.put(obj, i3.f);
            ln0 ln0Var2 = i3.e;
            vn0 vn0Var = this.l;
            gb0.J(vn0Var, obj);
            Object[] objArr = ln0Var2.b;
            long[] jArr = ln0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                ge1 ge1Var = (ge1) objArr[(i4 << 3) + i6];
                                if (ge1Var instanceof he1) {
                                    ((he1) ge1Var).g(2);
                                }
                                gb0.f(vn0Var, ge1Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof he1) {
                ((he1) obj).g(2);
            }
            gb0.f(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        vn0 vn0Var = this.e;
        gb0.I(vn0Var, obj2, obj);
        if (!(obj2 instanceof xr) || vn0Var.c(obj2)) {
            return;
        }
        gb0.J(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        vn0 vn0Var = this.f;
        long[] jArr3 = vn0Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = vn0Var.b[i6];
                        j2 = j5;
                        ln0 ln0Var = (ln0) vn0Var.c[i6];
                        obj.getClass();
                        boolean t = ((fu0) obj).t();
                        if (!t) {
                            Object[] objArr = ln0Var.b;
                            int[] iArr = ln0Var.c;
                            long[] jArr4 = ln0Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = t;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    t = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    vn0Var.l(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = t;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
