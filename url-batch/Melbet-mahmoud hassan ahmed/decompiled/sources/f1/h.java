package f1;

import f1.i;
import java.util.Arrays;
import java.util.List;
import m4.q;
import o2.a0;
import r0.s1;
import t0.f0;
import w0.h0;

/* loaded from: classes.dex */
final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f16137o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f16138p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f16139n;

    h() {
    }

    private long n(byte[] bArr) {
        int i7 = bArr[0] & 255;
        int i8 = i7 & 3;
        int i9 = 2;
        if (i8 == 0) {
            i9 = 1;
        } else if (i8 != 1 && i8 != 2) {
            i9 = bArr[1] & 63;
        }
        int i10 = i7 >> 3;
        return i9 * (i10 >= 16 ? 2500 << r1 : i10 >= 12 ? 10000 << (r1 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r1);
    }

    private static boolean o(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int e7 = a0Var.e();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.j(bArr2, 0, bArr.length);
        a0Var.O(e7);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(a0 a0Var) {
        return o(a0Var, f16137o);
    }

    @Override // f1.i
    protected long f(a0 a0Var) {
        return c(n(a0Var.d()));
    }

    @Override // f1.i
    protected boolean h(a0 a0Var, long j7, i.b bVar) {
        s1.b X;
        if (o(a0Var, f16137o)) {
            byte[] copyOf = Arrays.copyOf(a0Var.d(), a0Var.f());
            int c7 = f0.c(copyOf);
            List<byte[]> a7 = f0.a(copyOf);
            if (bVar.f16153a != null) {
                return true;
            }
            X = new s1.b().e0("audio/opus").H(c7).f0(48000).T(a7);
        } else {
            byte[] bArr = f16138p;
            if (!o(a0Var, bArr)) {
                o2.a.h(bVar.f16153a);
                return false;
            }
            o2.a.h(bVar.f16153a);
            if (this.f16139n) {
                return true;
            }
            this.f16139n = true;
            a0Var.P(bArr.length);
            j1.a c8 = h0.c(q.u(h0.j(a0Var, false, false).f22924b));
            if (c8 == null) {
                return true;
            }
            X = bVar.f16153a.b().X(c8.c(bVar.f16153a.f20954o));
        }
        bVar.f16153a = X.E();
        return true;
    }

    @Override // f1.i
    protected void l(boolean z6) {
        super.l(z6);
        if (z6) {
            this.f16139n = false;
        }
    }
}
