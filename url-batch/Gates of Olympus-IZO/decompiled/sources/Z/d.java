package Z;

import L1.z;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.F;
import e2.AbstractC0381e;
import h1.C0438i;
import j.C0475A;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import u0.C0997t;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends Z1.g implements Y1.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3416l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f3416l = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y1.a
    public final Object b() {
        C0475A c0475a;
        e eVar;
        C0475A c0475a2;
        Object[] objArr;
        long[] jArr;
        C0475A c0475a3;
        e eVar2;
        C0475A c0475a4;
        Object[] objArr2;
        long[] jArr2;
        K.d dVar;
        K.d dVar2;
        C0475A c0475a5;
        e eVar3;
        C0475A c0475a6;
        C0475A c0475a7;
        int i3;
        K.d dVar3;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        int i4;
        K.d dVar4;
        K.d dVar5;
        Object[] objArr5;
        long[] jArr5;
        int i5;
        ContentCaptureSession a3;
        switch (this.f3416l) {
            case 0:
                e eVar4 = (e) this.f3461e;
                C0475A c0475a8 = eVar4.f3421e;
                Object[] objArr6 = c0475a8.f5130b;
                long[] jArr6 = c0475a8.f5129a;
                int length = jArr6.length - 2;
                char c3 = 7;
                long j3 = -9187201950435737472L;
                C0475A c0475a9 = eVar4.f3419c;
                int i6 = 8;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr6[i7];
                        if ((((~j4) << c3) & j4 & j3) != j3) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j4 & 255) < 128) {
                                    U.k kVar = (U.k) ((l) objArr6[(i7 << 3) + i9]);
                                    U.k kVar2 = kVar.f3303d;
                                    if (kVar2.p) {
                                        K.d dVar6 = null;
                                        while (kVar2 != null) {
                                            if (kVar2 instanceof q) {
                                                c0475a9.a((q) kVar2);
                                            } else if ((kVar2.f3305f & 1024) != 0 && (kVar2 instanceof AbstractC0905m)) {
                                                U.k kVar3 = ((AbstractC0905m) kVar2).f7937r;
                                                objArr5 = objArr6;
                                                int i10 = 0;
                                                while (kVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((kVar3.f3305f & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            kVar2 = kVar3;
                                                        } else {
                                                            if (dVar6 == null) {
                                                                i5 = i10;
                                                                dVar6 = new K.d(new U.k[16]);
                                                            } else {
                                                                i5 = i10;
                                                            }
                                                            if (kVar2 != null) {
                                                                dVar6.b(kVar2);
                                                                kVar2 = null;
                                                            }
                                                            dVar6.b(kVar3);
                                                            i10 = i5;
                                                        }
                                                    }
                                                    kVar3 = kVar3.f3308i;
                                                    jArr6 = jArr7;
                                                }
                                                jArr5 = jArr6;
                                                if (i10 == 1) {
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                }
                                                kVar2 = AbstractC0898f.f(dVar6);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                            }
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            kVar2 = AbstractC0898f.f(dVar6);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                        }
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        U.k kVar4 = kVar.f3303d;
                                        if (!kVar4.p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        K.d dVar7 = new K.d(new U.k[16]);
                                        U.k kVar5 = kVar4.f3308i;
                                        if (kVar5 == null) {
                                            AbstractC0898f.b(dVar7, kVar4);
                                        } else {
                                            dVar7.b(kVar5);
                                        }
                                        while (dVar7.m()) {
                                            U.k kVar6 = (U.k) dVar7.o(dVar7.f2642f - 1);
                                            if ((kVar6.f3306g & 1024) == 0) {
                                                AbstractC0898f.b(dVar7, kVar6);
                                            } else {
                                                while (true) {
                                                    if (kVar6 == null) {
                                                        break;
                                                    }
                                                    if ((kVar6.f3305f & 1024) != 0) {
                                                        K.d dVar8 = null;
                                                        while (kVar6 != null) {
                                                            if (kVar6 instanceof q) {
                                                                c0475a9.a((q) kVar6);
                                                            } else if ((kVar6.f3305f & 1024) != 0 && (kVar6 instanceof AbstractC0905m)) {
                                                                U.k kVar7 = ((AbstractC0905m) kVar6).f7937r;
                                                                int i11 = 0;
                                                                while (kVar7 != null) {
                                                                    if ((kVar7.f3305f & 1024) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            dVar5 = dVar7;
                                                                            kVar6 = kVar7;
                                                                        } else {
                                                                            if (dVar8 == null) {
                                                                                dVar5 = dVar7;
                                                                                dVar8 = new K.d(new U.k[16]);
                                                                            } else {
                                                                                dVar5 = dVar7;
                                                                            }
                                                                            if (kVar6 != null) {
                                                                                dVar8.b(kVar6);
                                                                                kVar6 = null;
                                                                            }
                                                                            dVar8.b(kVar7);
                                                                        }
                                                                    } else {
                                                                        dVar5 = dVar7;
                                                                    }
                                                                    kVar7 = kVar7.f3308i;
                                                                    dVar7 = dVar5;
                                                                }
                                                                dVar4 = dVar7;
                                                                if (i11 == 1) {
                                                                    dVar7 = dVar4;
                                                                }
                                                                kVar6 = AbstractC0898f.f(dVar8);
                                                                dVar7 = dVar4;
                                                            }
                                                            dVar4 = dVar7;
                                                            kVar6 = AbstractC0898f.f(dVar8);
                                                            dVar7 = dVar4;
                                                        }
                                                    } else {
                                                        kVar6 = kVar6.f3308i;
                                                        dVar7 = dVar7;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                    }
                                    i4 = 8;
                                } else {
                                    objArr4 = objArr6;
                                    jArr4 = jArr6;
                                    i4 = i6;
                                }
                                j4 >>= i4;
                                i9++;
                                i6 = i4;
                                objArr6 = objArr4;
                                jArr6 = jArr4;
                            }
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                            if (i8 != i6) {
                            }
                        } else {
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                        }
                        if (i7 != length) {
                            i7++;
                            objArr6 = objArr3;
                            jArr6 = jArr3;
                            c3 = 7;
                            i6 = 8;
                            j3 = -9187201950435737472L;
                        }
                    }
                }
                c0475a8.b();
                C0475A c0475a10 = eVar4.f3420d;
                Object[] objArr7 = c0475a10.f5130b;
                long[] jArr8 = c0475a10.f5129a;
                int length2 = jArr8.length - 2;
                C0475A c0475a11 = eVar4.f3422f;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr8[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    b bVar = (b) objArr7[(i12 << 3) + i14];
                                    U.k kVar8 = (U.k) bVar;
                                    objArr2 = objArr7;
                                    U.k kVar9 = kVar8.f3303d;
                                    jArr2 = jArr8;
                                    boolean z3 = kVar9.p;
                                    p pVar = p.f3448f;
                                    if (z3) {
                                        boolean z4 = false;
                                        U.k kVar10 = kVar9;
                                        boolean z5 = true;
                                        q qVar = null;
                                        K.d dVar9 = null;
                                        while (kVar10 != null) {
                                            p pVar2 = pVar;
                                            if (kVar10 instanceof q) {
                                                q qVar2 = (q) kVar10;
                                                if (qVar != null) {
                                                    z4 = true;
                                                }
                                                if (c0475a9.c(qVar2)) {
                                                    c0475a11.a(qVar2);
                                                    z5 = false;
                                                }
                                                c0475a5 = c0475a10;
                                                eVar3 = eVar4;
                                                c0475a6 = c0475a8;
                                                qVar = qVar2;
                                            } else if ((kVar10.f3305f & 1024) == 0 || !(kVar10 instanceof AbstractC0905m)) {
                                                c0475a5 = c0475a10;
                                                eVar3 = eVar4;
                                                c0475a6 = c0475a8;
                                            } else {
                                                U.k kVar11 = ((AbstractC0905m) kVar10).f7937r;
                                                c0475a6 = c0475a8;
                                                int i15 = 0;
                                                while (kVar11 != null) {
                                                    e eVar5 = eVar4;
                                                    if ((kVar11.f3305f & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            c0475a7 = c0475a10;
                                                            kVar10 = kVar11;
                                                        } else {
                                                            if (dVar9 == null) {
                                                                c0475a7 = c0475a10;
                                                                i3 = i15;
                                                                dVar3 = new K.d(new U.k[16]);
                                                            } else {
                                                                c0475a7 = c0475a10;
                                                                i3 = i15;
                                                                dVar3 = dVar9;
                                                            }
                                                            if (kVar10 != null) {
                                                                dVar3.b(kVar10);
                                                                kVar10 = null;
                                                            }
                                                            dVar3.b(kVar11);
                                                            dVar9 = dVar3;
                                                            i15 = i3;
                                                        }
                                                    } else {
                                                        c0475a7 = c0475a10;
                                                    }
                                                    kVar11 = kVar11.f3308i;
                                                    eVar4 = eVar5;
                                                    c0475a10 = c0475a7;
                                                }
                                                c0475a5 = c0475a10;
                                                eVar3 = eVar4;
                                                if (i15 == 1) {
                                                    pVar = pVar2;
                                                    c0475a8 = c0475a6;
                                                    eVar4 = eVar3;
                                                    c0475a10 = c0475a5;
                                                }
                                            }
                                            kVar10 = AbstractC0898f.f(dVar9);
                                            pVar = pVar2;
                                            c0475a8 = c0475a6;
                                            eVar4 = eVar3;
                                            c0475a10 = c0475a5;
                                        }
                                        c0475a3 = c0475a10;
                                        eVar2 = eVar4;
                                        c0475a4 = c0475a8;
                                        p pVar3 = pVar;
                                        U.k kVar12 = kVar8.f3303d;
                                        if (!kVar12.p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        K.d dVar10 = new K.d(new U.k[16]);
                                        U.k kVar13 = kVar12.f3308i;
                                        if (kVar13 == null) {
                                            AbstractC0898f.b(dVar10, kVar12);
                                        } else {
                                            dVar10.b(kVar13);
                                        }
                                        while (dVar10.m()) {
                                            U.k kVar14 = (U.k) dVar10.o(dVar10.f2642f - 1);
                                            if ((kVar14.f3306g & 1024) == 0) {
                                                AbstractC0898f.b(dVar10, kVar14);
                                            } else {
                                                while (kVar14 != null) {
                                                    if ((kVar14.f3305f & 1024) != 0) {
                                                        K.d dVar11 = null;
                                                        while (kVar14 != null) {
                                                            if (kVar14 instanceof q) {
                                                                q qVar3 = (q) kVar14;
                                                                if (qVar != null) {
                                                                    z4 = true;
                                                                }
                                                                if (c0475a9.c(qVar3)) {
                                                                    c0475a11.a(qVar3);
                                                                    z5 = false;
                                                                }
                                                                qVar = qVar3;
                                                            } else if ((kVar14.f3305f & 1024) != 0 && (kVar14 instanceof AbstractC0905m)) {
                                                                U.k kVar15 = ((AbstractC0905m) kVar14).f7937r;
                                                                int i16 = 0;
                                                                while (kVar15 != null) {
                                                                    if ((kVar15.f3305f & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            dVar2 = dVar10;
                                                                            kVar14 = kVar15;
                                                                        } else {
                                                                            if (dVar11 == null) {
                                                                                dVar2 = dVar10;
                                                                                dVar11 = new K.d(new U.k[16]);
                                                                            } else {
                                                                                dVar2 = dVar10;
                                                                            }
                                                                            if (kVar14 != null) {
                                                                                dVar11.b(kVar14);
                                                                                kVar14 = null;
                                                                            }
                                                                            dVar11.b(kVar15);
                                                                            kVar15 = kVar15.f3308i;
                                                                            dVar10 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar10;
                                                                    }
                                                                    kVar15 = kVar15.f3308i;
                                                                    dVar10 = dVar2;
                                                                }
                                                                dVar = dVar10;
                                                                if (i16 == 1) {
                                                                    dVar10 = dVar;
                                                                }
                                                                kVar14 = AbstractC0898f.f(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            kVar14 = AbstractC0898f.f(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        kVar14 = kVar14.f3308i;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z5) {
                                            bVar.t(z4 ? c.o(bVar) : qVar != null ? qVar.w0() : pVar3);
                                        }
                                        j5 >>= 8;
                                        i14++;
                                        objArr7 = objArr2;
                                        jArr8 = jArr2;
                                        c0475a8 = c0475a4;
                                        eVar4 = eVar2;
                                        c0475a10 = c0475a3;
                                    } else {
                                        bVar.t(pVar);
                                        c0475a3 = c0475a10;
                                        eVar2 = eVar4;
                                        c0475a4 = c0475a8;
                                    }
                                } else {
                                    c0475a3 = c0475a10;
                                    eVar2 = eVar4;
                                    c0475a4 = c0475a8;
                                    objArr2 = objArr7;
                                    jArr2 = jArr8;
                                }
                                j5 >>= 8;
                                i14++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                c0475a8 = c0475a4;
                                eVar4 = eVar2;
                                c0475a10 = c0475a3;
                            }
                            c0475a = c0475a10;
                            eVar = eVar4;
                            c0475a2 = c0475a8;
                            objArr = objArr7;
                            jArr = jArr8;
                            if (i13 != 8) {
                            }
                        } else {
                            c0475a = c0475a10;
                            eVar = eVar4;
                            c0475a2 = c0475a8;
                            objArr = objArr7;
                            jArr = jArr8;
                        }
                        if (i12 != length2) {
                            i12++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            c0475a8 = c0475a2;
                            eVar4 = eVar;
                            c0475a10 = c0475a;
                        }
                    }
                } else {
                    c0475a = c0475a10;
                    eVar = eVar4;
                    c0475a2 = c0475a8;
                }
                c0475a.b();
                Object[] objArr8 = c0475a9.f5130b;
                long[] jArr9 = c0475a9.f5129a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j6 = jArr9[i17];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j6 & 255) < 128) {
                                    q qVar4 = (q) objArr8[(i17 << 3) + i19];
                                    if (qVar4.p) {
                                        p w02 = qVar4.w0();
                                        qVar4.z0();
                                        if (w02 != qVar4.w0() || c0475a11.c(qVar4)) {
                                            c.A(qVar4);
                                        }
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i18 != 8) {
                            }
                        }
                        if (i17 != length3) {
                            i17++;
                        }
                    }
                }
                c0475a9.b();
                c0475a11.b();
                eVar.f3418b.b();
                if (!c0475a2.g()) {
                    AbstractC0381e.N("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c0475a.g()) {
                    AbstractC0381e.N("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c0475a9.g()) {
                    return z.f2729a;
                }
                AbstractC0381e.N("Unprocessed FocusTarget nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) this.f3461e;
                if (aVar.f3708d.w0() == p.f3448f) {
                    aVar.f3706b.b();
                }
                return z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                ((F) this.f3461e).e();
                return z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                ((F) this.f3461e).e();
                return z.f2729a;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                View view = (View) this.f3461e;
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 30) {
                    w0.g.a(view, 1);
                }
                if (i20 < 29 || (a3 = w0.f.a(view)) == null) {
                    return null;
                }
                return new w0.d(a3, view);
            default:
                C0997t c0997t = (C0997t) this.f3461e;
                if (c0997t.isFocused() || c0997t.hasFocus()) {
                    c0997t.clearFocus();
                }
                return z.f2729a;
        }
    }
}
