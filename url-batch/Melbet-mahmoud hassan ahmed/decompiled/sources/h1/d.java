package h1;

import android.util.Pair;
import o2.a0;
import o2.m0;
import o2.r;
import r0.n2;
import w0.m;

/* loaded from: classes.dex */
final class d {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16773a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16774b;

        private a(int i7, long j7) {
            this.f16773a = i7;
            this.f16774b = j7;
        }

        public static a a(m mVar, a0 a0Var) {
            mVar.n(a0Var.d(), 0, 8);
            a0Var.O(0);
            return new a(a0Var.m(), a0Var.s());
        }
    }

    public static boolean a(m mVar) {
        a0 a0Var = new a0(8);
        int i7 = a.a(mVar, a0Var).f16773a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        mVar.n(a0Var.d(), 0, 4);
        a0Var.O(0);
        int m7 = a0Var.m();
        if (m7 == 1463899717) {
            return true;
        }
        r.c("WavHeaderReader", "Unsupported form type: " + m7);
        return false;
    }

    public static c b(m mVar) {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a d7 = d(1718449184, mVar, a0Var);
        o2.a.f(d7.f16774b >= 16);
        mVar.n(a0Var.d(), 0, 16);
        a0Var.O(0);
        int u6 = a0Var.u();
        int u7 = a0Var.u();
        int t6 = a0Var.t();
        int t7 = a0Var.t();
        int u8 = a0Var.u();
        int u9 = a0Var.u();
        int i7 = ((int) d7.f16774b) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            mVar.n(bArr2, 0, i7);
            bArr = bArr2;
        } else {
            bArr = m0.f19757f;
        }
        mVar.i((int) (mVar.m() - mVar.p()));
        return new c(u6, u7, t6, t7, u8, u9, bArr);
    }

    public static long c(m mVar) {
        a0 a0Var = new a0(8);
        a a7 = a.a(mVar, a0Var);
        if (a7.f16773a != 1685272116) {
            mVar.h();
            return -1L;
        }
        mVar.o(8);
        a0Var.O(0);
        mVar.n(a0Var.d(), 0, 8);
        long q7 = a0Var.q();
        mVar.i(((int) a7.f16774b) + 8);
        return q7;
    }

    private static a d(int i7, m mVar, a0 a0Var) {
        while (true) {
            a a7 = a.a(mVar, a0Var);
            if (a7.f16773a == i7) {
                return a7;
            }
            r.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a7.f16773a);
            long j7 = a7.f16774b + 8;
            if (j7 > 2147483647L) {
                throw n2.d("Chunk is too large (~2GB+) to skip; id: " + a7.f16773a);
            }
            mVar.i((int) j7);
        }
    }

    public static Pair<Long, Long> e(m mVar) {
        mVar.h();
        a d7 = d(1684108385, mVar, new a0(8));
        mVar.i(8);
        return Pair.create(Long.valueOf(mVar.p()), Long.valueOf(d7.f16774b));
    }
}
