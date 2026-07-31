package Z;

import R1.y;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.C0301E;
import e2.InterfaceC0422a;
import j.C0519A;
import n.z0;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import u0.C1123s;
import x0.AbstractC1218f;
import x0.AbstractC1219g;
import x0.C1216d;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends f2.h implements InterfaceC0422a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4668l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, i4, cls, obj, str, str2);
        this.f4668l = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e2.InterfaceC0422a
    public final Object b() {
        C0519A c0519a;
        f fVar;
        C0519A c0519a2;
        Object[] objArr;
        long[] jArr;
        C0519A c0519a3;
        f fVar2;
        C0519A c0519a4;
        Object[] objArr2;
        long[] jArr2;
        K.d dVar;
        K.d dVar2;
        C0519A c0519a5;
        f fVar3;
        C0519A c0519a6;
        C0519A c0519a7;
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
        switch (this.f4668l) {
            case 0:
                f fVar4 = (f) this.f5813e;
                C0519A c0519a8 = fVar4.f4673e;
                Object[] objArr6 = c0519a8.f6248b;
                long[] jArr6 = c0519a8.f6247a;
                int length = jArr6.length - 2;
                char c2 = 7;
                long j3 = -9187201950435737472L;
                C0519A c0519a9 = fVar4.f4671c;
                int i6 = 8;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr6[i7];
                        if ((((~j4) << c2) & j4 & j3) != j3) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j4 & 255) < 128) {
                                    U.p pVar = (U.p) ((n) objArr6[(i7 << 3) + i9]);
                                    U.p pVar2 = pVar.f4489d;
                                    if (pVar2.f4501p) {
                                        K.d dVar6 = null;
                                        while (pVar2 != null) {
                                            if (pVar2 instanceof t) {
                                                c0519a9.a((t) pVar2);
                                            } else if ((pVar2.f4491f & 1024) != 0 && (pVar2 instanceof AbstractC1000m)) {
                                                U.p pVar3 = ((AbstractC1000m) pVar2).f8771r;
                                                objArr5 = objArr6;
                                                int i10 = 0;
                                                while (pVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((pVar3.f4491f & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            pVar2 = pVar3;
                                                        } else {
                                                            if (dVar6 == null) {
                                                                i5 = i10;
                                                                dVar6 = new K.d(new U.p[16]);
                                                            } else {
                                                                i5 = i10;
                                                            }
                                                            if (pVar2 != null) {
                                                                dVar6.b(pVar2);
                                                                pVar2 = null;
                                                            }
                                                            dVar6.b(pVar3);
                                                            i10 = i5;
                                                        }
                                                    }
                                                    pVar3 = pVar3.f4494i;
                                                    jArr6 = jArr7;
                                                }
                                                jArr5 = jArr6;
                                                if (i10 == 1) {
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                }
                                                pVar2 = AbstractC0993f.f(dVar6);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                            }
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            pVar2 = AbstractC0993f.f(dVar6);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                        }
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        U.p pVar4 = pVar.f4489d;
                                        if (!pVar4.f4501p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        K.d dVar7 = new K.d(new U.p[16]);
                                        U.p pVar5 = pVar4.f4494i;
                                        if (pVar5 == null) {
                                            AbstractC0993f.b(dVar7, pVar4);
                                        } else {
                                            dVar7.b(pVar5);
                                        }
                                        while (dVar7.m()) {
                                            U.p pVar6 = (U.p) dVar7.o(dVar7.f3216f - 1);
                                            if ((pVar6.f4492g & 1024) == 0) {
                                                AbstractC0993f.b(dVar7, pVar6);
                                            } else {
                                                while (true) {
                                                    if (pVar6 == null) {
                                                        break;
                                                    }
                                                    if ((pVar6.f4491f & 1024) != 0) {
                                                        K.d dVar8 = null;
                                                        while (pVar6 != null) {
                                                            if (pVar6 instanceof t) {
                                                                c0519a9.a((t) pVar6);
                                                            } else if ((pVar6.f4491f & 1024) != 0 && (pVar6 instanceof AbstractC1000m)) {
                                                                U.p pVar7 = ((AbstractC1000m) pVar6).f8771r;
                                                                int i11 = 0;
                                                                while (pVar7 != null) {
                                                                    if ((pVar7.f4491f & 1024) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            dVar5 = dVar7;
                                                                            pVar6 = pVar7;
                                                                        } else {
                                                                            if (dVar8 == null) {
                                                                                dVar5 = dVar7;
                                                                                dVar8 = new K.d(new U.p[16]);
                                                                            } else {
                                                                                dVar5 = dVar7;
                                                                            }
                                                                            if (pVar6 != null) {
                                                                                dVar8.b(pVar6);
                                                                                pVar6 = null;
                                                                            }
                                                                            dVar8.b(pVar7);
                                                                        }
                                                                    } else {
                                                                        dVar5 = dVar7;
                                                                    }
                                                                    pVar7 = pVar7.f4494i;
                                                                    dVar7 = dVar5;
                                                                }
                                                                dVar4 = dVar7;
                                                                if (i11 == 1) {
                                                                    dVar7 = dVar4;
                                                                }
                                                                pVar6 = AbstractC0993f.f(dVar8);
                                                                dVar7 = dVar4;
                                                            }
                                                            dVar4 = dVar7;
                                                            pVar6 = AbstractC0993f.f(dVar8);
                                                            dVar7 = dVar4;
                                                        }
                                                    } else {
                                                        pVar6 = pVar6.f4494i;
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
                            c2 = 7;
                            i6 = 8;
                            j3 = -9187201950435737472L;
                        }
                    }
                }
                c0519a8.b();
                C0519A c0519a10 = fVar4.f4672d;
                Object[] objArr7 = c0519a10.f6248b;
                long[] jArr8 = c0519a10.f6247a;
                int length2 = jArr8.length - 2;
                C0519A c0519a11 = fVar4.f4674f;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr8[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    c cVar = (c) objArr7[(i12 << 3) + i14];
                                    U.p pVar8 = (U.p) cVar;
                                    objArr2 = objArr7;
                                    U.p pVar9 = pVar8.f4489d;
                                    jArr2 = jArr8;
                                    boolean z3 = pVar9.f4501p;
                                    s sVar = s.f4704f;
                                    if (z3) {
                                        boolean z4 = false;
                                        U.p pVar10 = pVar9;
                                        boolean z5 = true;
                                        t tVar = null;
                                        K.d dVar9 = null;
                                        while (pVar10 != null) {
                                            s sVar2 = sVar;
                                            if (pVar10 instanceof t) {
                                                t tVar2 = (t) pVar10;
                                                if (tVar != null) {
                                                    z4 = true;
                                                }
                                                if (c0519a9.c(tVar2)) {
                                                    c0519a11.a(tVar2);
                                                    z5 = false;
                                                }
                                                c0519a5 = c0519a10;
                                                fVar3 = fVar4;
                                                c0519a6 = c0519a8;
                                                tVar = tVar2;
                                            } else if ((pVar10.f4491f & 1024) == 0 || !(pVar10 instanceof AbstractC1000m)) {
                                                c0519a5 = c0519a10;
                                                fVar3 = fVar4;
                                                c0519a6 = c0519a8;
                                            } else {
                                                U.p pVar11 = ((AbstractC1000m) pVar10).f8771r;
                                                c0519a6 = c0519a8;
                                                int i15 = 0;
                                                while (pVar11 != null) {
                                                    f fVar5 = fVar4;
                                                    if ((pVar11.f4491f & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            c0519a7 = c0519a10;
                                                            pVar10 = pVar11;
                                                        } else {
                                                            if (dVar9 == null) {
                                                                c0519a7 = c0519a10;
                                                                i3 = i15;
                                                                dVar3 = new K.d(new U.p[16]);
                                                            } else {
                                                                c0519a7 = c0519a10;
                                                                i3 = i15;
                                                                dVar3 = dVar9;
                                                            }
                                                            if (pVar10 != null) {
                                                                dVar3.b(pVar10);
                                                                pVar10 = null;
                                                            }
                                                            dVar3.b(pVar11);
                                                            dVar9 = dVar3;
                                                            i15 = i3;
                                                        }
                                                    } else {
                                                        c0519a7 = c0519a10;
                                                    }
                                                    pVar11 = pVar11.f4494i;
                                                    fVar4 = fVar5;
                                                    c0519a10 = c0519a7;
                                                }
                                                c0519a5 = c0519a10;
                                                fVar3 = fVar4;
                                                if (i15 == 1) {
                                                    sVar = sVar2;
                                                    c0519a8 = c0519a6;
                                                    fVar4 = fVar3;
                                                    c0519a10 = c0519a5;
                                                }
                                            }
                                            pVar10 = AbstractC0993f.f(dVar9);
                                            sVar = sVar2;
                                            c0519a8 = c0519a6;
                                            fVar4 = fVar3;
                                            c0519a10 = c0519a5;
                                        }
                                        c0519a3 = c0519a10;
                                        fVar2 = fVar4;
                                        c0519a4 = c0519a8;
                                        s sVar3 = sVar;
                                        U.p pVar12 = pVar8.f4489d;
                                        if (!pVar12.f4501p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        K.d dVar10 = new K.d(new U.p[16]);
                                        U.p pVar13 = pVar12.f4494i;
                                        if (pVar13 == null) {
                                            AbstractC0993f.b(dVar10, pVar12);
                                        } else {
                                            dVar10.b(pVar13);
                                        }
                                        while (dVar10.m()) {
                                            U.p pVar14 = (U.p) dVar10.o(dVar10.f3216f - 1);
                                            if ((pVar14.f4492g & 1024) == 0) {
                                                AbstractC0993f.b(dVar10, pVar14);
                                            } else {
                                                while (pVar14 != null) {
                                                    if ((pVar14.f4491f & 1024) != 0) {
                                                        K.d dVar11 = null;
                                                        while (pVar14 != null) {
                                                            if (pVar14 instanceof t) {
                                                                t tVar3 = (t) pVar14;
                                                                if (tVar != null) {
                                                                    z4 = true;
                                                                }
                                                                if (c0519a9.c(tVar3)) {
                                                                    c0519a11.a(tVar3);
                                                                    z5 = false;
                                                                }
                                                                tVar = tVar3;
                                                            } else if ((pVar14.f4491f & 1024) != 0 && (pVar14 instanceof AbstractC1000m)) {
                                                                U.p pVar15 = ((AbstractC1000m) pVar14).f8771r;
                                                                int i16 = 0;
                                                                while (pVar15 != null) {
                                                                    if ((pVar15.f4491f & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            dVar2 = dVar10;
                                                                            pVar14 = pVar15;
                                                                        } else {
                                                                            if (dVar11 == null) {
                                                                                dVar2 = dVar10;
                                                                                dVar11 = new K.d(new U.p[16]);
                                                                            } else {
                                                                                dVar2 = dVar10;
                                                                            }
                                                                            if (pVar14 != null) {
                                                                                dVar11.b(pVar14);
                                                                                pVar14 = null;
                                                                            }
                                                                            dVar11.b(pVar15);
                                                                            pVar15 = pVar15.f4494i;
                                                                            dVar10 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar10;
                                                                    }
                                                                    pVar15 = pVar15.f4494i;
                                                                    dVar10 = dVar2;
                                                                }
                                                                dVar = dVar10;
                                                                if (i16 == 1) {
                                                                    dVar10 = dVar;
                                                                }
                                                                pVar14 = AbstractC0993f.f(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            pVar14 = AbstractC0993f.f(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        pVar14 = pVar14.f4494i;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z5) {
                                            cVar.u(z4 ? d.o(cVar) : tVar != null ? tVar.z0() : sVar3);
                                        }
                                        j5 >>= 8;
                                        i14++;
                                        objArr7 = objArr2;
                                        jArr8 = jArr2;
                                        c0519a8 = c0519a4;
                                        fVar4 = fVar2;
                                        c0519a10 = c0519a3;
                                    } else {
                                        cVar.u(sVar);
                                        c0519a3 = c0519a10;
                                        fVar2 = fVar4;
                                        c0519a4 = c0519a8;
                                    }
                                } else {
                                    c0519a3 = c0519a10;
                                    fVar2 = fVar4;
                                    c0519a4 = c0519a8;
                                    objArr2 = objArr7;
                                    jArr2 = jArr8;
                                }
                                j5 >>= 8;
                                i14++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                c0519a8 = c0519a4;
                                fVar4 = fVar2;
                                c0519a10 = c0519a3;
                            }
                            c0519a = c0519a10;
                            fVar = fVar4;
                            c0519a2 = c0519a8;
                            objArr = objArr7;
                            jArr = jArr8;
                            if (i13 != 8) {
                            }
                        } else {
                            c0519a = c0519a10;
                            fVar = fVar4;
                            c0519a2 = c0519a8;
                            objArr = objArr7;
                            jArr = jArr8;
                        }
                        if (i12 != length2) {
                            i12++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            c0519a8 = c0519a2;
                            fVar4 = fVar;
                            c0519a10 = c0519a;
                        }
                    }
                } else {
                    c0519a = c0519a10;
                    fVar = fVar4;
                    c0519a2 = c0519a8;
                }
                c0519a.b();
                Object[] objArr8 = c0519a9.f6248b;
                long[] jArr9 = c0519a9.f6247a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j6 = jArr9[i17];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j6 & 255) < 128) {
                                    t tVar4 = (t) objArr8[(i17 << 3) + i19];
                                    if (tVar4.f4501p) {
                                        s z02 = tVar4.z0();
                                        tVar4.C0();
                                        if (z02 != tVar4.z0() || c0519a11.c(tVar4)) {
                                            d.A(tVar4);
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
                c0519a9.b();
                c0519a11.b();
                fVar.f4670b.b();
                if (!c0519a2.g()) {
                    z0.o("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c0519a.g()) {
                    z0.o("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c0519a9.g()) {
                    return y.f4171a;
                }
                z0.o("Unprocessed FocusTarget nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) this.f5813e;
                if (bVar.f4904f.z0() == s.f4704f) {
                    bVar.f4901c.b();
                }
                return y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0301E) this.f5813e).e();
                return y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0301E) this.f5813e).e();
                return y.f4171a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                View view = (View) this.f5813e;
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 30) {
                    AbstractC1219g.a(view, 1);
                }
                if (i20 < 29 || (a3 = AbstractC1218f.a(view)) == null) {
                    return null;
                }
                return new C1216d(a3, view);
            case 5:
                C1123s c1123s = (C1123s) this.f5813e;
                if (c1123s.isFocused() || c1123s.hasFocus()) {
                    c1123s.clearFocus();
                }
                return y.f4171a;
            default:
                return ((C1123s) this.f5813e).w();
        }
    }
}
