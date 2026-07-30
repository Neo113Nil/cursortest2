package b;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 extends r6.h implements q6.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1160n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i7, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i7, obj, cls, str, str2, i8, i9);
        this.f1160n = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q6.a
    public final Object a() {
        ContentCaptureSession a3;
        i.b0 b0Var;
        long j8;
        char c4;
        i.b0 b0Var2;
        Object[] objArr;
        long[] jArr;
        i.b0 b0Var3;
        Object[] objArr2;
        long j9;
        long[] jArr2;
        i0.d dVar;
        i0.d dVar2;
        long[] jArr3;
        long j10;
        int i7;
        i0.d dVar3;
        Object[] objArr3;
        long[] jArr4;
        i.b0 b0Var4;
        Object[] objArr4;
        long[] jArr5;
        int i8;
        char c6;
        long j11;
        long[] jArr6;
        int i9;
        long j12;
        long j13;
        int i10;
        i0.d dVar4;
        switch (this.f1160n) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((i0) this.f7949g).e();
                return d6.z.f2639a;
            case 1:
                ((i0) this.f7949g).e();
                return d6.z.f2639a;
            case 2:
                View view = (View) this.f7949g;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    v1.f.a(view, 1);
                }
                if (i11 < 29 || (a3 = v1.e.a(view)) == null) {
                    return null;
                }
                return new y.p(a3, view);
            case 3:
                s1.r rVar = (s1.r) this.f7949g;
                if (rVar.isFocused() || rVar.hasFocus()) {
                    rVar.clearFocus();
                }
                return d6.z.f2639a;
            case 4:
                return ((s1.r) this.f7949g).v();
            case 5:
                x0.e eVar = (x0.e) this.f7949g;
                i.b0 b0Var5 = eVar.f9600d;
                i.b0 b0Var6 = eVar.f9602f;
                i.b0 b0Var7 = eVar.f9599c;
                i.b0 b0Var8 = eVar.f9601e;
                Object[] objArr5 = b0Var8.f4722b;
                long[] jArr7 = b0Var8.f4721a;
                int length = jArr7.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    char c9 = 7;
                    j8 = 255;
                    while (true) {
                        long j14 = jArr7[i12];
                        if ((((~j14) << c9) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j14 & 255) < 128) {
                                    c6 = c9;
                                    s0.n nVar = (s0.n) ((x0.l) objArr5[(i12 << 3) + i14]);
                                    b0Var4 = b0Var8;
                                    s0.n nVar2 = nVar.f8104f;
                                    objArr4 = objArr5;
                                    if (nVar2.f8116r) {
                                        i0.d dVar5 = null;
                                        while (nVar2 != null) {
                                            i0.d dVar6 = dVar5;
                                            if (nVar2 instanceof x0.r) {
                                                b0Var7.a((x0.r) nVar2);
                                            } else if ((nVar2.f8106h & 1024) != 0 && (nVar2 instanceof r1.m)) {
                                                s0.n nVar3 = ((r1.m) nVar2).f7853t;
                                                jArr6 = jArr7;
                                                int i15 = 0;
                                                while (nVar3 != null) {
                                                    int i16 = i14;
                                                    if ((nVar3.f8106h & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            nVar2 = nVar3;
                                                        } else {
                                                            if (dVar6 == null) {
                                                                i10 = i15;
                                                                j13 = j14;
                                                                dVar4 = new i0.d(new s0.n[16]);
                                                            } else {
                                                                i10 = i15;
                                                                j13 = j14;
                                                                dVar4 = dVar6;
                                                            }
                                                            if (nVar2 != null) {
                                                                dVar4.b(nVar2);
                                                                nVar2 = null;
                                                            }
                                                            dVar4.b(nVar3);
                                                            dVar6 = dVar4;
                                                            i15 = i10;
                                                            nVar3 = nVar3.f8109k;
                                                            i14 = i16;
                                                            j14 = j13;
                                                        }
                                                    }
                                                    j13 = j14;
                                                    nVar3 = nVar3.f8109k;
                                                    i14 = i16;
                                                    j14 = j13;
                                                }
                                                i9 = i14;
                                                j12 = j14;
                                                if (i15 == 1) {
                                                    dVar5 = dVar6;
                                                    jArr7 = jArr6;
                                                    i14 = i9;
                                                    j14 = j12;
                                                }
                                                dVar5 = dVar6;
                                                nVar2 = r1.f.f(dVar5);
                                                jArr7 = jArr6;
                                                i14 = i9;
                                                j14 = j12;
                                            }
                                            jArr6 = jArr7;
                                            i9 = i14;
                                            j12 = j14;
                                            dVar5 = dVar6;
                                            nVar2 = r1.f.f(dVar5);
                                            jArr7 = jArr6;
                                            i14 = i9;
                                            j14 = j12;
                                        }
                                        jArr5 = jArr7;
                                        i8 = i14;
                                        j11 = j14;
                                        s0.n nVar4 = nVar.f8104f;
                                        if (!nVar4.f8116r) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        i0.d dVar7 = new i0.d(new s0.n[16]);
                                        s0.n nVar5 = nVar4.f8109k;
                                        if (nVar5 == null) {
                                            r1.f.b(dVar7, nVar4);
                                        } else {
                                            dVar7.b(nVar5);
                                        }
                                        while (dVar7.m()) {
                                            s0.n nVar6 = (s0.n) dVar7.o(dVar7.f4842h - 1);
                                            if ((nVar6.f8107i & 1024) == 0) {
                                                r1.f.b(dVar7, nVar6);
                                            } else {
                                                while (true) {
                                                    if (nVar6 == null) {
                                                        break;
                                                    }
                                                    if ((nVar6.f8106h & 1024) != 0) {
                                                        i0.d dVar8 = null;
                                                        while (nVar6 != null) {
                                                            if (nVar6 instanceof x0.r) {
                                                                b0Var7.a((x0.r) nVar6);
                                                            } else if ((nVar6.f8106h & 1024) != 0 && (nVar6 instanceof r1.m)) {
                                                                int i17 = 0;
                                                                for (s0.n nVar7 = ((r1.m) nVar6).f7853t; nVar7 != null; nVar7 = nVar7.f8109k) {
                                                                    if ((nVar7.f8106h & 1024) != 0) {
                                                                        i17++;
                                                                        if (i17 == 1) {
                                                                            nVar6 = nVar7;
                                                                        } else {
                                                                            if (dVar8 == null) {
                                                                                dVar8 = new i0.d(new s0.n[16]);
                                                                            }
                                                                            if (nVar6 != null) {
                                                                                dVar8.b(nVar6);
                                                                                nVar6 = null;
                                                                            }
                                                                            dVar8.b(nVar7);
                                                                        }
                                                                    }
                                                                }
                                                                if (i17 == 1) {
                                                                }
                                                            }
                                                            nVar6 = r1.f.f(dVar8);
                                                        }
                                                    } else {
                                                        nVar6 = nVar6.f8109k;
                                                    }
                                                }
                                            }
                                        }
                                        j14 = j11 >> 8;
                                        i14 = i8 + 1;
                                        b0Var8 = b0Var4;
                                        c9 = c6;
                                        objArr5 = objArr4;
                                        jArr7 = jArr5;
                                    } else {
                                        jArr5 = jArr7;
                                        i8 = i14;
                                    }
                                } else {
                                    b0Var4 = b0Var8;
                                    objArr4 = objArr5;
                                    jArr5 = jArr7;
                                    i8 = i14;
                                    c6 = c9;
                                }
                                j11 = j14;
                                j14 = j11 >> 8;
                                i14 = i8 + 1;
                                b0Var8 = b0Var4;
                                c9 = c6;
                                objArr5 = objArr4;
                                jArr7 = jArr5;
                            }
                            b0Var = b0Var8;
                            objArr3 = objArr5;
                            jArr4 = jArr7;
                            c4 = c9;
                            if (i13 != 8) {
                            }
                        } else {
                            b0Var = b0Var8;
                            objArr3 = objArr5;
                            jArr4 = jArr7;
                            c4 = c9;
                        }
                        if (i12 != length) {
                            i12++;
                            b0Var8 = b0Var;
                            c9 = c4;
                            objArr5 = objArr3;
                            jArr7 = jArr4;
                        }
                    }
                } else {
                    b0Var = b0Var8;
                    j8 = 255;
                    c4 = 7;
                }
                b0Var.b();
                Object[] objArr6 = b0Var5.f4722b;
                long[] jArr8 = b0Var5.f4721a;
                int length2 = jArr8.length - 2;
                if (length2 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j15 = jArr8[i18];
                        if ((((~j15) << c4) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j15 & j8) < 128) {
                                    x0.c cVar = (x0.c) objArr6[(i18 << 3) + i20];
                                    s0.n nVar8 = (s0.n) cVar;
                                    b0Var3 = b0Var5;
                                    s0.n nVar9 = nVar8.f8104f;
                                    objArr2 = objArr6;
                                    boolean z8 = nVar9.f8116r;
                                    x0.q qVar = x0.q.f9630h;
                                    if (z8) {
                                        x0.r rVar2 = null;
                                        i0.d dVar9 = null;
                                        boolean z9 = false;
                                        s0.n nVar10 = nVar9;
                                        boolean z10 = true;
                                        while (nVar10 != null) {
                                            x0.q qVar2 = qVar;
                                            if (nVar10 instanceof x0.r) {
                                                x0.r rVar3 = (x0.r) nVar10;
                                                if (rVar2 != null) {
                                                    z9 = true;
                                                }
                                                if (b0Var7.c(rVar3)) {
                                                    b0Var6.a(rVar3);
                                                    z10 = false;
                                                }
                                                rVar2 = rVar3;
                                            } else if ((nVar10.f8106h & 1024) != 0 && (nVar10 instanceof r1.m)) {
                                                s0.n nVar11 = ((r1.m) nVar10).f7853t;
                                                jArr3 = jArr8;
                                                int i21 = 0;
                                                while (nVar11 != null) {
                                                    long j16 = j15;
                                                    if ((nVar11.f8106h & 1024) != 0) {
                                                        i21++;
                                                        if (i21 == 1) {
                                                            nVar10 = nVar11;
                                                        } else {
                                                            if (dVar9 == null) {
                                                                i7 = i21;
                                                                dVar3 = new i0.d(new s0.n[16]);
                                                            } else {
                                                                i7 = i21;
                                                                dVar3 = dVar9;
                                                            }
                                                            if (nVar10 != null) {
                                                                dVar3.b(nVar10);
                                                                nVar10 = null;
                                                            }
                                                            dVar3.b(nVar11);
                                                            dVar9 = dVar3;
                                                            i21 = i7;
                                                        }
                                                    }
                                                    nVar11 = nVar11.f8109k;
                                                    j15 = j16;
                                                }
                                                j10 = j15;
                                                if (i21 == 1) {
                                                    qVar = qVar2;
                                                    jArr8 = jArr3;
                                                    j15 = j10;
                                                }
                                                nVar10 = r1.f.f(dVar9);
                                                qVar = qVar2;
                                                jArr8 = jArr3;
                                                j15 = j10;
                                            }
                                            jArr3 = jArr8;
                                            j10 = j15;
                                            nVar10 = r1.f.f(dVar9);
                                            qVar = qVar2;
                                            jArr8 = jArr3;
                                            j15 = j10;
                                        }
                                        x0.q qVar3 = qVar;
                                        jArr2 = jArr8;
                                        j9 = j15;
                                        s0.n nVar12 = nVar8.f8104f;
                                        if (!nVar12.f8116r) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        i0.d dVar10 = new i0.d(new s0.n[16]);
                                        s0.n nVar13 = nVar12.f8109k;
                                        if (nVar13 == null) {
                                            r1.f.b(dVar10, nVar12);
                                        } else {
                                            dVar10.b(nVar13);
                                        }
                                        while (dVar10.m()) {
                                            s0.n nVar14 = (s0.n) dVar10.o(dVar10.f4842h - 1);
                                            if ((nVar14.f8107i & 1024) == 0) {
                                                r1.f.b(dVar10, nVar14);
                                            } else {
                                                while (nVar14 != null) {
                                                    if ((nVar14.f8106h & 1024) != 0) {
                                                        i0.d dVar11 = null;
                                                        while (nVar14 != null) {
                                                            if (nVar14 instanceof x0.r) {
                                                                x0.r rVar4 = (x0.r) nVar14;
                                                                if (rVar2 != null) {
                                                                    z9 = true;
                                                                }
                                                                if (b0Var7.c(rVar4)) {
                                                                    b0Var6.a(rVar4);
                                                                    z10 = false;
                                                                }
                                                                rVar2 = rVar4;
                                                            } else if ((nVar14.f8106h & 1024) != 0 && (nVar14 instanceof r1.m)) {
                                                                s0.n nVar15 = ((r1.m) nVar14).f7853t;
                                                                int i22 = 0;
                                                                while (nVar15 != null) {
                                                                    if ((nVar15.f8106h & 1024) != 0) {
                                                                        i22++;
                                                                        if (i22 == 1) {
                                                                            dVar2 = dVar10;
                                                                            nVar14 = nVar15;
                                                                        } else {
                                                                            if (dVar11 == null) {
                                                                                dVar2 = dVar10;
                                                                                dVar11 = new i0.d(new s0.n[16]);
                                                                            } else {
                                                                                dVar2 = dVar10;
                                                                            }
                                                                            if (nVar14 != null) {
                                                                                dVar11.b(nVar14);
                                                                                nVar14 = null;
                                                                            }
                                                                            dVar11.b(nVar15);
                                                                            nVar15 = nVar15.f8109k;
                                                                            dVar10 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar10;
                                                                    }
                                                                    nVar15 = nVar15.f8109k;
                                                                    dVar10 = dVar2;
                                                                }
                                                                dVar = dVar10;
                                                                if (i22 == 1) {
                                                                    dVar10 = dVar;
                                                                }
                                                                nVar14 = r1.f.f(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            nVar14 = r1.f.f(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        nVar14 = nVar14.f8109k;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z10) {
                                            cVar.m0(z9 ? x0.d.o(cVar) : rVar2 != null ? rVar2.B0() : qVar3);
                                        }
                                        j15 = j9 >> 8;
                                        i20++;
                                        b0Var5 = b0Var3;
                                        objArr6 = objArr2;
                                        jArr8 = jArr2;
                                    } else {
                                        cVar.m0(qVar);
                                    }
                                } else {
                                    b0Var3 = b0Var5;
                                    objArr2 = objArr6;
                                }
                                jArr2 = jArr8;
                                j9 = j15;
                                j15 = j9 >> 8;
                                i20++;
                                b0Var5 = b0Var3;
                                objArr6 = objArr2;
                                jArr8 = jArr2;
                            }
                            b0Var2 = b0Var5;
                            objArr = objArr6;
                            jArr = jArr8;
                            if (i19 != 8) {
                            }
                        } else {
                            b0Var2 = b0Var5;
                            objArr = objArr6;
                            jArr = jArr8;
                        }
                        if (i18 != length2) {
                            i18++;
                            b0Var5 = b0Var2;
                            objArr6 = objArr;
                            jArr8 = jArr;
                        }
                    }
                } else {
                    b0Var2 = b0Var5;
                }
                b0Var2.b();
                Object[] objArr7 = b0Var7.f4722b;
                long[] jArr9 = b0Var7.f4721a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j17 = jArr9[i23];
                        if ((((~j17) << c4) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i24 = 8 - ((~(i23 - length3)) >>> 31);
                            for (int i25 = 0; i25 < i24; i25++) {
                                if ((j17 & j8) < 128) {
                                    x0.r rVar5 = (x0.r) objArr7[(i23 << 3) + i25];
                                    if (rVar5.f8116r) {
                                        x0.q B0 = rVar5.B0();
                                        rVar5.E0();
                                        if (B0 != rVar5.B0() || b0Var6.c(rVar5)) {
                                            x0.d.A(rVar5);
                                        }
                                    }
                                }
                                j17 >>= 8;
                            }
                            if (i24 != 8) {
                            }
                        }
                        if (i23 != length3) {
                            i23++;
                        }
                    }
                }
                b0Var7.b();
                b0Var6.b();
                eVar.f9598b.a();
                if (!b0Var.g()) {
                    a.a.M("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!b0Var2.g()) {
                    a.a.M("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (b0Var7.g()) {
                    return d6.z.f2639a;
                }
                a.a.M("Unprocessed FocusTarget nodes");
                throw null;
            default:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) this.f7949g;
                if (bVar.f716f.B0() == x0.q.f9630h) {
                    bVar.f713c.a();
                }
                return d6.z.f2639a;
        }
    }
}
