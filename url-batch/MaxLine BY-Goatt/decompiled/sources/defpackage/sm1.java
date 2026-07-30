package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sm1 {
    public final fy a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public sm1(fy fyVar, long j, int i, boolean z) {
        int i2;
        int g;
        boolean z2 = true;
        int i3 = z ? 2 : 1;
        this.a = fyVar;
        this.b = i;
        if (u10.j(j) != 0 || u10.i(j) != 0) {
            i21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) fyVar.n;
        int size = arrayList2.size();
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            bz1 bz1Var = (bz1) arrayList2.get(i4);
            na naVar = bz1Var.a;
            int h = u10.h(j);
            if (u10.c(j)) {
                g = u10.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                g = u10.g(j);
            }
            ja jaVar = new ja(naVar, this.b - i5, i3, v10.b(h, g, 5));
            float b = jaVar.b() + f;
            zv2 zv2Var = jaVar.d;
            int i6 = i5 + zv2Var.g;
            int i7 = bz1Var.b;
            int i8 = bz1Var.c;
            int i9 = i4;
            az1 az1Var = new az1(jaVar, i7, i8, i5, i6, f, b);
            i2 = i6;
            arrayList.add(az1Var);
            if (zv2Var.d || (i2 == this.b && i9 != qv.f((ArrayList) this.a.n))) {
                f = b;
                break;
            } else {
                i4 = i9 + 1;
                i5 = i2;
                f = b;
            }
        }
        z2 = false;
        i2 = i5;
        this.e = f;
        this.f = i2;
        this.c = z2;
        this.h = arrayList;
        this.d = u10.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            az1 az1Var2 = (az1) arrayList.get(i10);
            List list = az1Var2.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = 0; i11 < size3; i11++) {
                w72 w72Var = (w72) list.get(i11);
                arrayList4.add(w72Var != null ? az1Var2.a(w72Var) : null);
            }
            vv.o(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.p).size()) {
            int size4 = ((List) this.a.p).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = 0; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = zv.E(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void g(sm1 sm1Var, ls lsVar, cq cqVar, float f, dk2 dk2Var, xt2 xt2Var, ae0 ae0Var) {
        lsVar.m();
        ArrayList arrayList = sm1Var.h;
        if (arrayList.size() <= 1) {
            z71.o(sm1Var, lsVar, cqVar, f, dk2Var, xt2Var, ae0Var);
        } else if (cqVar instanceof nn2) {
            z71.o(sm1Var, lsVar, cqVar, f, dk2Var, xt2Var, ae0Var);
        } else {
            if (!(cqVar instanceof bk2)) {
                a.b();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                az1 az1Var = (az1) arrayList.get(i);
                f3 += az1Var.a.b();
                f2 = Math.max(f2, az1Var.a.d());
            }
            Shader b = ((bk2) cqVar).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ja jaVar = ((az1) arrayList.get(i2)).a;
                jaVar.g(lsVar, new dq(b), f, dk2Var, xt2Var, ae0Var);
                lsVar.h(0.0f, jaVar.b());
                matrix.setTranslate(0.0f, -jaVar.b());
                b.setLocalMatrix(matrix);
            }
        }
        lsVar.j();
    }

    public final void a(final long j, final float[] fArr) {
        h(jw2.e(j));
        i(jw2.d(j));
        final a82 a82Var = new a82();
        a82Var.m = 0;
        final z72 z72Var = new z72();
        s03.p(this.h, j, new Function1() { // from class: qm1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j2;
                ja jaVar;
                boolean z;
                float a;
                float a2;
                az1 az1Var = (az1) obj;
                int i = az1Var.b;
                ja jaVar2 = az1Var.a;
                int i2 = az1Var.c;
                long j3 = j;
                int e = i > jw2.e(j3) ? az1Var.b : jw2.e(j3);
                if (i2 >= jw2.d(j3)) {
                    i2 = jw2.d(j3);
                }
                long a3 = th2.a(az1Var.d(e), az1Var.d(i2));
                a82 a82Var2 = a82Var;
                int i3 = a82Var2.m;
                zv2 zv2Var = jaVar2.d;
                int e2 = jw2.e(a3);
                int d = jw2.d(a3);
                Layout layout = zv2Var.f;
                int length = layout.getText().length();
                if (e2 < 0) {
                    i21.a("startOffset must be > 0");
                }
                if (e2 >= length) {
                    i21.a("startOffset must be less than text length");
                }
                if (d <= e2) {
                    i21.a("endOffset must be greater than startOffset");
                }
                if (d > length) {
                    i21.a("endOffset must be smaller or equal to text length");
                }
                int i4 = (d - e2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i3 < i4) {
                    i21.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(e2);
                int lineForOffset2 = layout.getLineForOffset(d - 1);
                yx0 yx0Var = new yx0(zv2Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f = zv2Var.f(lineForOffset);
                        int max = Math.max(e2, lineStart);
                        int min = Math.min(d, f);
                        float g = zv2Var.g(lineForOffset);
                        float e3 = zv2Var.e(lineForOffset);
                        j2 = a3;
                        jaVar = jaVar2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z3 || isRtlCharAt) {
                                if (z3 && isRtlCharAt) {
                                    z2 = false;
                                    float a4 = yx0Var.a(max, false, false, false);
                                    z = z3;
                                    a = yx0Var.a(max + 1, true, true, false);
                                    a2 = a4;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !isRtlCharAt) {
                                        a = yx0Var.a(max, false, false, false);
                                        a2 = yx0Var.a(max + 1, true, true, false);
                                    } else {
                                        a2 = yx0Var.a(max, false, false, true);
                                        a = yx0Var.a(max + 1, true, true, true);
                                    }
                                }
                                fArr2[i3] = a;
                                fArr2[i3 + 1] = g;
                                fArr2[i3 + 2] = a2;
                                fArr2[i3 + 3] = e3;
                                i3 += 4;
                                max++;
                                z3 = z;
                            } else {
                                a = yx0Var.a(max, z2, z2, true);
                                z = z3;
                                a2 = yx0Var.a(max + 1, true, true, true);
                            }
                            z2 = false;
                            fArr2[i3] = a;
                            fArr2[i3 + 1] = g;
                            fArr2[i3 + 2] = a2;
                            fArr2[i3 + 3] = e3;
                            i3 += 4;
                            max++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        jaVar2 = jaVar;
                        a3 = j2;
                    }
                } else {
                    j2 = a3;
                    jaVar = jaVar2;
                }
                int c = (jw2.c(j2) * 4) + a82Var2.m;
                int i5 = a82Var2.m;
                while (true) {
                    z72 z72Var2 = z72Var;
                    if (i5 >= c) {
                        a82Var2.m = c;
                        z72Var2.m = jaVar.b() + z72Var2.m;
                        return Unit.a;
                    }
                    int i6 = i5 + 1;
                    float f2 = fArr2[i6];
                    float f3 = z72Var2.m;
                    fArr2[i6] = f2 + f3;
                    int i7 = i5 + 3;
                    fArr2[i7] = fArr2[i7] + f3;
                    i5 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        j(i);
        ArrayList arrayList = this.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        return jaVar.d.e(i - az1Var.d) + az1Var.f;
    }

    public final int c(float f) {
        ArrayList arrayList = this.h;
        az1 az1Var = (az1) arrayList.get(s03.o(arrayList, f));
        int i = az1Var.c - az1Var.b;
        int i2 = az1Var.d;
        if (i == 0) {
            return i2;
        }
        ja jaVar = az1Var.a;
        float f2 = f - az1Var.f;
        zv2 zv2Var = jaVar.d;
        return zv2Var.f.getLineForVertical(((int) f2) - zv2Var.h) + i2;
    }

    public final float d(int i) {
        j(i);
        ArrayList arrayList = this.h;
        az1 az1Var = (az1) arrayList.get(s03.n(i, arrayList));
        ja jaVar = az1Var.a;
        return jaVar.d.g(i - az1Var.d) + az1Var.f;
    }

    public final int e(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        az1 az1Var = (az1) arrayList.get(s03.o(arrayList, intBitsToFloat));
        int i2 = az1Var.c;
        int i3 = az1Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        ja jaVar = az1Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - az1Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        zv2 zv2Var = jaVar.d;
        int lineForVertical = zv2Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - zv2Var.h);
        return zv2Var.f.getOffsetForHorizontal(lineForVertical, (zv2Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long f(w72 w72Var, int i, ch2 ch2Var) {
        long j;
        long j2;
        float f = w72Var.b;
        ArrayList arrayList = this.h;
        int o = s03.o(arrayList, f);
        float f2 = ((az1) arrayList.get(o)).g;
        float f3 = w72Var.d;
        if (f2 >= f3 || o == qv.f(arrayList)) {
            az1 az1Var = (az1) arrayList.get(o);
            return az1Var.b(true, az1Var.a.c(az1Var.c(w72Var), i, ch2Var));
        }
        int o2 = s03.o(arrayList, f3);
        long j3 = jw2.b;
        while (true) {
            j = jw2.b;
            if (!jw2.a(j3, j) || o > o2) {
                break;
            }
            az1 az1Var2 = (az1) arrayList.get(o);
            j3 = az1Var2.b(true, az1Var2.a.c(az1Var2.c(w72Var), i, ch2Var));
            o++;
        }
        if (jw2.a(j3, j)) {
            return j;
        }
        while (true) {
            j2 = jw2.b;
            if (!jw2.a(j, j2) || o > o2) {
                break;
            }
            az1 az1Var3 = (az1) arrayList.get(o2);
            j = az1Var3.b(true, az1Var3.a.c(az1Var3.c(w72Var), i, ch2Var));
            o2--;
        }
        return jw2.a(j, j2) ? j3 : th2.a((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void h(int i) {
        yd ydVar = (yd) this.a.o;
        if (i < 0 || i >= ydVar.n.length()) {
            StringBuilder n = in1.n(i, "offset(", ") is out of bounds [0, ");
            n.append(ydVar.n.length());
            n.append(')');
            i21.a(n.toString());
        }
    }

    public final void i(int i) {
        yd ydVar = (yd) this.a.o;
        if (i < 0 || i > ydVar.n.length()) {
            StringBuilder n = in1.n(i, "offset(", ") is out of bounds [0, ");
            n.append(ydVar.n.length());
            n.append(']');
            i21.a(n.toString());
        }
    }

    public final void j(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        i21.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
