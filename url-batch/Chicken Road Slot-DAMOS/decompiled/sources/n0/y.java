package n0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends b1.g0 implements m2 {

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f6853e;

    /* renamed from: i, reason: collision with root package name */
    public x f6854i = new x(b1.r.j().g());

    public y(Function0 function0) {
        this.f6853e = function0;
    }

    @Override // b1.f0
    public final void b(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6854i = (x) h0Var;
    }

    @Override // b1.f0
    public final b1.h0 c() {
        return this.f6854i;
    }

    @Override // n0.m2
    public final Object getValue() {
        Function1 e2 = b1.r.j().e();
        if (e2 != null) {
            e2.invoke(this);
        }
        b1.i j = b1.r.j();
        return h((x) b1.r.i(this.f6854i, j), j, true, this.f6853e).f6843f;
    }

    public final x h(x xVar, b1.i iVar, boolean z10, Function0 function0) {
        o0.e n10;
        b1.i j;
        b1.h0 m10;
        x xVar2;
        x0.e eVar;
        int i3;
        if (xVar.c(this, iVar)) {
            if (z10) {
                n10 = h.n();
                Object[] objArr = n10.f7317d;
                int i10 = n10.f7319i;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((b1.z) objArr[i11]).b();
                }
                try {
                    s.c0 c0Var = xVar.f6842e;
                    p.e eVar2 = j2.f6727a;
                    x0.e eVar3 = (x0.e) eVar2.get();
                    if (eVar3 == null) {
                        eVar3 = new x0.e();
                        eVar2.j(eVar3);
                    }
                    int i12 = eVar3.f10227a;
                    Object[] objArr2 = c0Var.f8278b;
                    int[] iArr = c0Var.f8279c;
                    long[] jArr = c0Var.f8277a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j3 = jArr[i13];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j3 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        i3 = i14;
                                        b1.f0 f0Var = (b1.f0) objArr2[i17];
                                        eVar3.f10227a = i12 + iArr[i17];
                                        Function1 e2 = iVar.e();
                                        if (e2 != null) {
                                            e2.invoke(f0Var);
                                        }
                                    } else {
                                        i3 = i14;
                                    }
                                    j3 >>= i3;
                                    i16++;
                                    i14 = i3;
                                }
                                if (i15 != i14) {
                                    break;
                                }
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                        }
                    }
                    eVar3.f10227a = i12;
                    Object[] objArr3 = n10.f7317d;
                    int i18 = n10.f7319i;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((b1.z) objArr3[i19]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return xVar;
        }
        s.c0 c0Var2 = new s.c0();
        p.e eVar4 = j2.f6727a;
        x0.e eVar5 = (x0.e) eVar4.get();
        if (eVar5 == null) {
            eVar5 = new x0.e();
            eVar4.j(eVar5);
        }
        int i20 = eVar5.f10227a;
        n10 = h.n();
        Object[] objArr4 = n10.f7317d;
        int i21 = n10.f7319i;
        for (int i22 = 0; i22 < i21; i22++) {
            ((b1.z) objArr4[i22]).b();
        }
        try {
            eVar5.f10227a = i20 + 1;
            Object j10 = b1.x.j(new b0.s0(this, eVar5, c0Var2, i20), function0);
            eVar5.f10227a = i20;
            Object[] objArr5 = n10.f7317d;
            int i23 = n10.f7319i;
            for (int i24 = 0; i24 < i23; i24++) {
                ((b1.z) objArr5[i24]).a();
            }
            Object obj = b1.r.f1030c;
            synchronized (obj) {
                j = b1.r.j();
                x xVar3 = this.f6854i;
                synchronized (obj) {
                    m10 = b1.r.m(xVar3, this);
                    m10.a(xVar3);
                    m10.f981a = j.g();
                }
                eVar = (x0.e) j2.f6727a.get();
                if (eVar != null || eVar.f10227a != 0) {
                    return xVar2;
                }
                b1.r.j().m();
                synchronized (obj) {
                    b1.i j11 = b1.r.j();
                    xVar2.f6840c = j11.g();
                    xVar2.f6841d = j11.h();
                }
                return xVar2;
            }
            xVar2 = (x) m10;
            xVar2.f6842e = c0Var2;
            xVar2.g = xVar2.d(this, j);
            xVar2.f6843f = j10;
            eVar = (x0.e) j2.f6727a.get();
            if (eVar != null) {
            }
            return xVar2;
        } finally {
            Object[] objArr6 = n10.f7317d;
            int i25 = n10.f7319i;
            for (int i26 = 0; i26 < i25; i26++) {
                ((b1.z) objArr6[i26]).a();
            }
        }
    }

    public final x i() {
        b1.i j = b1.r.j();
        return h((x) b1.r.i(this.f6854i, j), j, false, this.f6853e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        x xVar = (x) b1.r.h(this.f6854i);
        sb2.append(xVar.c(this, b1.r.j()) ? String.valueOf(xVar.f6843f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
