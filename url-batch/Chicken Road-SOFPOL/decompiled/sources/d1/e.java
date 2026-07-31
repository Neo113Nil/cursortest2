package d1;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import o.k0;
import t.c0;
import w1.b1;
import w1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class e extends q6.g implements p6.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i, obj, cls, str, str2, i8, i9);
        this.f2059l = i10;
    }

    @Override // p6.a
    public final Object b() {
        b1 b1Var;
        ContentCaptureSession a8;
        switch (this.f2059l) {
            case 0:
                f fVar = (f) this.f6189e;
                k0 k0Var = fVar.f2062c;
                k0 k0Var2 = fVar.f2063d;
                i iVar = fVar.f2060a;
                n nVar = iVar.f2073h;
                if (nVar == null) {
                    Object[] objArr = k0Var2.f5490b;
                    long[] jArr = k0Var2.f5489a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j7 = jArr[i];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i - length)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j7 & 255) < 128) {
                                        ((w1.c) objArr[(i << 3) + i9]).s0();
                                        throw null;
                                    }
                                    j7 >>= 8;
                                }
                                if (i8 != 8) {
                                }
                            }
                            if (i != length) {
                                i++;
                            }
                        }
                    }
                } else {
                    char c8 = 7;
                    if (nVar.f8718q) {
                        if (k0Var.c(nVar)) {
                            nVar.u0();
                        }
                        nVar.t0();
                        if (!nVar.f8706d.f8718q) {
                            t1.a.b("visitAncestors called on an unattached node");
                        }
                        y0.l lVar = nVar.f8706d;
                        f0 u7 = w1.f.u(nVar);
                        int i10 = 0;
                        while (u7 != null) {
                            if ((u7.F.f7600f.f8709g & 5120) != 0) {
                                while (lVar != null) {
                                    int i11 = lVar.f8708f;
                                    if ((i11 & 5120) != 0) {
                                        if ((i11 & 1024) != 0) {
                                            i10++;
                                        }
                                        if ((lVar instanceof w1.c) && k0Var2.c(lVar)) {
                                            if (i10 <= 1) {
                                                ((w1.c) lVar).s0();
                                                throw null;
                                            }
                                            ((w1.c) lVar).s0();
                                            throw null;
                                        }
                                    }
                                    lVar = lVar.f8710h;
                                }
                            }
                            u7 = u7.s();
                            lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
                        }
                        Object[] objArr2 = k0Var2.f5490b;
                        long[] jArr2 = k0Var2.f5489a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j8 = jArr2[i12];
                                if ((((~j8) << c8) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j8 & 255) < 128) {
                                            ((w1.c) objArr2[(i12 << 3) + i14]).s0();
                                            throw null;
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i13 != 8) {
                                    }
                                }
                                if (i12 != length2) {
                                    i12++;
                                    c8 = 7;
                                }
                            }
                        }
                    }
                }
                if (iVar.f2073h == null || iVar.f2068c.t0() == m.f2094g) {
                    iVar.c();
                }
                k0Var.b();
                k0Var2.b();
                fVar.f2064e = false;
                return c6.m.f1757a;
            case 1:
                return Boolean.valueOf(((c0) this.f6189e).f6756y.v0(7));
            default:
                View view = (View) this.f6189e;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 30) {
                    q3.i.e(view);
                }
                if (i15 < 29 || (a8 = i3.b.a(view)) == null) {
                    return null;
                }
                return new k2.c(a8, view);
        }
    }
}
