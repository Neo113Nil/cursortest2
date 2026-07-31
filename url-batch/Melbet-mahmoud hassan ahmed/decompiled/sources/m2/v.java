package m2;

import android.util.Pair;
import java.util.Arrays;
import o2.m0;
import r0.f3;
import r0.g3;
import r0.h3;
import r0.r3;
import t1.x;
import t1.x0;
import t1.z0;

/* loaded from: classes.dex */
public abstract class v extends c0 {

    /* renamed from: c, reason: collision with root package name */
    private a f19080c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f19081a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f19082b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f19083c;

        /* renamed from: d, reason: collision with root package name */
        private final z0[] f19084d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f19085e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f19086f;

        /* renamed from: g, reason: collision with root package name */
        private final z0 f19087g;

        a(String[] strArr, int[] iArr, z0[] z0VarArr, int[] iArr2, int[][][] iArr3, z0 z0Var) {
            this.f19082b = strArr;
            this.f19083c = iArr;
            this.f19084d = z0VarArr;
            this.f19086f = iArr3;
            this.f19085e = iArr2;
            this.f19087g = z0Var;
            this.f19081a = iArr.length;
        }

        public int a(int i7, int i8, boolean z6) {
            int i9 = this.f19084d[i7].b(i8).f22259f;
            int[] iArr = new int[i9];
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                int g7 = g(i7, i8, i11);
                if (g7 == 4 || (z6 && g7 == 3)) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            return b(i7, i8, Arrays.copyOf(iArr, i10));
        }

        public int b(int i7, int i8, int[] iArr) {
            int i9 = 0;
            String str = null;
            boolean z6 = false;
            int i10 = 0;
            int i11 = 16;
            while (i9 < iArr.length) {
                String str2 = this.f19084d[i7].b(i8).b(iArr[i9]).f20956q;
                int i12 = i10 + 1;
                if (i10 == 0) {
                    str = str2;
                } else {
                    z6 |= !m0.c(str, str2);
                }
                i11 = Math.min(i11, f3.d(this.f19086f[i7][i8][i9]));
                i9++;
                i10 = i12;
            }
            return z6 ? Math.min(i11, this.f19085e[i7]) : i11;
        }

        public int c(int i7, int i8, int i9) {
            return this.f19086f[i7][i8][i9];
        }

        public int d() {
            return this.f19081a;
        }

        public int e(int i7) {
            return this.f19083c[i7];
        }

        public z0 f(int i7) {
            return this.f19084d[i7];
        }

        public int g(int i7, int i8, int i9) {
            return f3.f(c(i7, i8, i9));
        }

        public z0 h() {
            return this.f19087g;
        }
    }

    private static int i(g3[] g3VarArr, x0 x0Var, int[] iArr, boolean z6) {
        int length = g3VarArr.length;
        int i7 = 0;
        boolean z7 = true;
        for (int i8 = 0; i8 < g3VarArr.length; i8++) {
            g3 g3Var = g3VarArr[i8];
            int i9 = 0;
            for (int i10 = 0; i10 < x0Var.f22259f; i10++) {
                i9 = Math.max(i9, f3.f(g3Var.b(x0Var.b(i10))));
            }
            boolean z8 = iArr[i8] == 0;
            if (i9 > i7 || (i9 == i7 && z6 && !z7 && z8)) {
                length = i8;
                z7 = z8;
                i7 = i9;
            }
        }
        return length;
    }

    private static int[] j(g3 g3Var, x0 x0Var) {
        int[] iArr = new int[x0Var.f22259f];
        for (int i7 = 0; i7 < x0Var.f22259f; i7++) {
            iArr[i7] = g3Var.b(x0Var.b(i7));
        }
        return iArr;
    }

    private static int[] k(g3[] g3VarArr) {
        int length = g3VarArr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = g3VarArr[i7].n();
        }
        return iArr;
    }

    @Override // m2.c0
    public final void e(Object obj) {
        this.f19080c = (a) obj;
    }

    @Override // m2.c0
    public final d0 g(g3[] g3VarArr, z0 z0Var, x.b bVar, r3 r3Var) {
        int[] iArr = new int[g3VarArr.length + 1];
        int length = g3VarArr.length + 1;
        x0[][] x0VarArr = new x0[length][];
        int[][][] iArr2 = new int[g3VarArr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = z0Var.f22275f;
            x0VarArr[i7] = new x0[i8];
            iArr2[i7] = new int[i8][];
        }
        int[] k7 = k(g3VarArr);
        for (int i9 = 0; i9 < z0Var.f22275f; i9++) {
            x0 b7 = z0Var.b(i9);
            int i10 = i(g3VarArr, b7, iArr, b7.f22261h == 5);
            int[] j7 = i10 == g3VarArr.length ? new int[b7.f22259f] : j(g3VarArr[i10], b7);
            int i11 = iArr[i10];
            x0VarArr[i10][i11] = b7;
            iArr2[i10][i11] = j7;
            iArr[i10] = iArr[i10] + 1;
        }
        z0[] z0VarArr = new z0[g3VarArr.length];
        String[] strArr = new String[g3VarArr.length];
        int[] iArr3 = new int[g3VarArr.length];
        for (int i12 = 0; i12 < g3VarArr.length; i12++) {
            int i13 = iArr[i12];
            z0VarArr[i12] = new z0((x0[]) m0.G0(x0VarArr[i12], i13));
            iArr2[i12] = (int[][]) m0.G0(iArr2[i12], i13);
            strArr[i12] = g3VarArr[i12].h();
            iArr3[i12] = g3VarArr[i12].j();
        }
        a aVar = new a(strArr, iArr3, z0VarArr, k7, iArr2, new z0((x0[]) m0.G0(x0VarArr[g3VarArr.length], iArr[g3VarArr.length])));
        Pair<h3[], t[]> l7 = l(aVar, iArr2, k7, bVar, r3Var);
        return new d0((h3[]) l7.first, (t[]) l7.second, b0.b(aVar, (w[]) l7.second), aVar);
    }

    protected abstract Pair<h3[], t[]> l(a aVar, int[][][] iArr, int[] iArr2, x.b bVar, r3 r3Var);
}
