package X;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.D;
import i.C0661B;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import s0.C1166s;
import v0.AbstractC1240f;
import v0.AbstractC1241g;
import v0.C1238d;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends M2.m implements Function0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4314o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i2, i4, cls, obj, str, str2);
        this.f4314o = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0661B c0661b;
        f fVar;
        C0661B c0661b2;
        Object[] objArr;
        long[] jArr;
        C0661B c0661b3;
        f fVar2;
        C0661B c0661b4;
        Object[] objArr2;
        long[] jArr2;
        I.d dVar;
        I.d dVar2;
        C0661B c0661b5;
        f fVar3;
        C0661B c0661b6;
        C0661B c0661b7;
        int i2;
        I.d dVar3;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        int i4;
        I.d dVar4;
        I.d dVar5;
        Object[] objArr5;
        long[] jArr5;
        int i5;
        ContentCaptureSession a4;
        switch (this.f4314o) {
            case 0:
                f fVar4 = (f) this.f3591e;
                C0661B c0661b8 = fVar4.f4319e;
                Object[] objArr6 = c0661b8.f6885b;
                long[] jArr6 = c0661b8.f6884a;
                int length = jArr6.length - 2;
                char c4 = 7;
                long j4 = -9187201950435737472L;
                C0661B c0661b9 = fVar4.f4317c;
                int i6 = 8;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr6[i7];
                        if ((((~j5) << c4) & j5 & j4) != j4) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j5 & 255) < 128) {
                                    S.n nVar = (S.n) ((n) objArr6[(i7 << 3) + i9]);
                                    S.n nVar2 = nVar.f3978d;
                                    if (nVar2.f3990s) {
                                        I.d dVar6 = null;
                                        while (nVar2 != null) {
                                            if (nVar2 instanceof t) {
                                                c0661b9.a((t) nVar2);
                                            } else if ((nVar2.f3980i & 1024) != 0 && (nVar2 instanceof AbstractC1073n)) {
                                                S.n nVar3 = ((AbstractC1073n) nVar2).f9826u;
                                                objArr5 = objArr6;
                                                int i10 = 0;
                                                while (nVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((nVar3.f3980i & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            nVar2 = nVar3;
                                                        } else {
                                                            if (dVar6 == null) {
                                                                i5 = i10;
                                                                dVar6 = new I.d(new S.n[16]);
                                                            } else {
                                                                i5 = i10;
                                                            }
                                                            if (nVar2 != null) {
                                                                dVar6.b(nVar2);
                                                                nVar2 = null;
                                                            }
                                                            dVar6.b(nVar3);
                                                            i10 = i5;
                                                        }
                                                    }
                                                    nVar3 = nVar3.f3983l;
                                                    jArr6 = jArr7;
                                                }
                                                jArr5 = jArr6;
                                                if (i10 == 1) {
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                }
                                                nVar2 = AbstractC1065f.f(dVar6);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                            }
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            nVar2 = AbstractC1065f.f(dVar6);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                        }
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        S.n nVar4 = nVar.f3978d;
                                        if (!nVar4.f3990s) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        I.d dVar7 = new I.d(new S.n[16]);
                                        S.n nVar5 = nVar4.f3983l;
                                        if (nVar5 == null) {
                                            AbstractC1065f.b(dVar7, nVar4);
                                        } else {
                                            dVar7.b(nVar5);
                                        }
                                        while (dVar7.l()) {
                                            S.n nVar6 = (S.n) dVar7.n(dVar7.f3332i - 1);
                                            if ((nVar6.f3981j & 1024) == 0) {
                                                AbstractC1065f.b(dVar7, nVar6);
                                            } else {
                                                while (true) {
                                                    if (nVar6 == null) {
                                                        break;
                                                    }
                                                    if ((nVar6.f3980i & 1024) != 0) {
                                                        I.d dVar8 = null;
                                                        while (nVar6 != null) {
                                                            if (nVar6 instanceof t) {
                                                                c0661b9.a((t) nVar6);
                                                            } else if ((nVar6.f3980i & 1024) != 0 && (nVar6 instanceof AbstractC1073n)) {
                                                                S.n nVar7 = ((AbstractC1073n) nVar6).f9826u;
                                                                int i11 = 0;
                                                                while (nVar7 != null) {
                                                                    if ((nVar7.f3980i & 1024) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            dVar5 = dVar7;
                                                                            nVar6 = nVar7;
                                                                        } else {
                                                                            if (dVar8 == null) {
                                                                                dVar5 = dVar7;
                                                                                dVar8 = new I.d(new S.n[16]);
                                                                            } else {
                                                                                dVar5 = dVar7;
                                                                            }
                                                                            if (nVar6 != null) {
                                                                                dVar8.b(nVar6);
                                                                                nVar6 = null;
                                                                            }
                                                                            dVar8.b(nVar7);
                                                                        }
                                                                    } else {
                                                                        dVar5 = dVar7;
                                                                    }
                                                                    nVar7 = nVar7.f3983l;
                                                                    dVar7 = dVar5;
                                                                }
                                                                dVar4 = dVar7;
                                                                if (i11 == 1) {
                                                                    dVar7 = dVar4;
                                                                }
                                                                nVar6 = AbstractC1065f.f(dVar8);
                                                                dVar7 = dVar4;
                                                            }
                                                            dVar4 = dVar7;
                                                            nVar6 = AbstractC1065f.f(dVar8);
                                                            dVar7 = dVar4;
                                                        }
                                                    } else {
                                                        nVar6 = nVar6.f3983l;
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
                                j5 >>= i4;
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
                            c4 = 7;
                            i6 = 8;
                            j4 = -9187201950435737472L;
                        }
                    }
                }
                c0661b8.b();
                C0661B c0661b10 = fVar4.f4318d;
                Object[] objArr7 = c0661b10.f6885b;
                long[] jArr8 = c0661b10.f6884a;
                int length2 = jArr8.length - 2;
                C0661B c0661b11 = fVar4.f4320f;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j6 = jArr8[i12];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j6 & 255) < 128) {
                                    c cVar = (c) objArr7[(i12 << 3) + i14];
                                    S.n nVar8 = (S.n) cVar;
                                    objArr2 = objArr7;
                                    S.n nVar9 = nVar8.f3978d;
                                    jArr2 = jArr8;
                                    boolean z4 = nVar9.f3990s;
                                    s sVar = s.f4350i;
                                    if (z4) {
                                        boolean z5 = false;
                                        S.n nVar10 = nVar9;
                                        boolean z6 = true;
                                        t tVar = null;
                                        I.d dVar9 = null;
                                        while (nVar10 != null) {
                                            s sVar2 = sVar;
                                            if (nVar10 instanceof t) {
                                                t tVar2 = (t) nVar10;
                                                if (tVar != null) {
                                                    z5 = true;
                                                }
                                                if (c0661b9.c(tVar2)) {
                                                    c0661b11.a(tVar2);
                                                    z6 = false;
                                                }
                                                c0661b5 = c0661b10;
                                                fVar3 = fVar4;
                                                c0661b6 = c0661b8;
                                                tVar = tVar2;
                                            } else if ((nVar10.f3980i & 1024) == 0 || !(nVar10 instanceof AbstractC1073n)) {
                                                c0661b5 = c0661b10;
                                                fVar3 = fVar4;
                                                c0661b6 = c0661b8;
                                            } else {
                                                S.n nVar11 = ((AbstractC1073n) nVar10).f9826u;
                                                c0661b6 = c0661b8;
                                                int i15 = 0;
                                                while (nVar11 != null) {
                                                    f fVar5 = fVar4;
                                                    if ((nVar11.f3980i & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            c0661b7 = c0661b10;
                                                            nVar10 = nVar11;
                                                        } else {
                                                            if (dVar9 == null) {
                                                                c0661b7 = c0661b10;
                                                                i2 = i15;
                                                                dVar3 = new I.d(new S.n[16]);
                                                            } else {
                                                                c0661b7 = c0661b10;
                                                                i2 = i15;
                                                                dVar3 = dVar9;
                                                            }
                                                            if (nVar10 != null) {
                                                                dVar3.b(nVar10);
                                                                nVar10 = null;
                                                            }
                                                            dVar3.b(nVar11);
                                                            dVar9 = dVar3;
                                                            i15 = i2;
                                                        }
                                                    } else {
                                                        c0661b7 = c0661b10;
                                                    }
                                                    nVar11 = nVar11.f3983l;
                                                    fVar4 = fVar5;
                                                    c0661b10 = c0661b7;
                                                }
                                                c0661b5 = c0661b10;
                                                fVar3 = fVar4;
                                                if (i15 == 1) {
                                                    sVar = sVar2;
                                                    c0661b8 = c0661b6;
                                                    fVar4 = fVar3;
                                                    c0661b10 = c0661b5;
                                                }
                                            }
                                            nVar10 = AbstractC1065f.f(dVar9);
                                            sVar = sVar2;
                                            c0661b8 = c0661b6;
                                            fVar4 = fVar3;
                                            c0661b10 = c0661b5;
                                        }
                                        c0661b3 = c0661b10;
                                        fVar2 = fVar4;
                                        c0661b4 = c0661b8;
                                        s sVar3 = sVar;
                                        S.n nVar12 = nVar8.f3978d;
                                        if (!nVar12.f3990s) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        I.d dVar10 = new I.d(new S.n[16]);
                                        S.n nVar13 = nVar12.f3983l;
                                        if (nVar13 == null) {
                                            AbstractC1065f.b(dVar10, nVar12);
                                        } else {
                                            dVar10.b(nVar13);
                                        }
                                        while (dVar10.l()) {
                                            S.n nVar14 = (S.n) dVar10.n(dVar10.f3332i - 1);
                                            if ((nVar14.f3981j & 1024) == 0) {
                                                AbstractC1065f.b(dVar10, nVar14);
                                            } else {
                                                while (nVar14 != null) {
                                                    if ((nVar14.f3980i & 1024) != 0) {
                                                        I.d dVar11 = null;
                                                        while (nVar14 != null) {
                                                            if (nVar14 instanceof t) {
                                                                t tVar3 = (t) nVar14;
                                                                if (tVar != null) {
                                                                    z5 = true;
                                                                }
                                                                if (c0661b9.c(tVar3)) {
                                                                    c0661b11.a(tVar3);
                                                                    z6 = false;
                                                                }
                                                                tVar = tVar3;
                                                            } else if ((nVar14.f3980i & 1024) != 0 && (nVar14 instanceof AbstractC1073n)) {
                                                                S.n nVar15 = ((AbstractC1073n) nVar14).f9826u;
                                                                int i16 = 0;
                                                                while (nVar15 != null) {
                                                                    if ((nVar15.f3980i & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            dVar2 = dVar10;
                                                                            nVar14 = nVar15;
                                                                        } else {
                                                                            if (dVar11 == null) {
                                                                                dVar2 = dVar10;
                                                                                dVar11 = new I.d(new S.n[16]);
                                                                            } else {
                                                                                dVar2 = dVar10;
                                                                            }
                                                                            if (nVar14 != null) {
                                                                                dVar11.b(nVar14);
                                                                                nVar14 = null;
                                                                            }
                                                                            dVar11.b(nVar15);
                                                                            nVar15 = nVar15.f3983l;
                                                                            dVar10 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar10;
                                                                    }
                                                                    nVar15 = nVar15.f3983l;
                                                                    dVar10 = dVar2;
                                                                }
                                                                dVar = dVar10;
                                                                if (i16 == 1) {
                                                                    dVar10 = dVar;
                                                                }
                                                                nVar14 = AbstractC1065f.f(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            nVar14 = AbstractC1065f.f(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        nVar14 = nVar14.f3983l;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z6) {
                                            cVar.Q(z5 ? d.o(cVar) : tVar != null ? tVar.C0() : sVar3);
                                        }
                                        j6 >>= 8;
                                        i14++;
                                        objArr7 = objArr2;
                                        jArr8 = jArr2;
                                        c0661b8 = c0661b4;
                                        fVar4 = fVar2;
                                        c0661b10 = c0661b3;
                                    } else {
                                        cVar.Q(sVar);
                                        c0661b3 = c0661b10;
                                        fVar2 = fVar4;
                                        c0661b4 = c0661b8;
                                    }
                                } else {
                                    c0661b3 = c0661b10;
                                    fVar2 = fVar4;
                                    c0661b4 = c0661b8;
                                    objArr2 = objArr7;
                                    jArr2 = jArr8;
                                }
                                j6 >>= 8;
                                i14++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                c0661b8 = c0661b4;
                                fVar4 = fVar2;
                                c0661b10 = c0661b3;
                            }
                            c0661b = c0661b10;
                            fVar = fVar4;
                            c0661b2 = c0661b8;
                            objArr = objArr7;
                            jArr = jArr8;
                            if (i13 != 8) {
                            }
                        } else {
                            c0661b = c0661b10;
                            fVar = fVar4;
                            c0661b2 = c0661b8;
                            objArr = objArr7;
                            jArr = jArr8;
                        }
                        if (i12 != length2) {
                            i12++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            c0661b8 = c0661b2;
                            fVar4 = fVar;
                            c0661b10 = c0661b;
                        }
                    }
                } else {
                    c0661b = c0661b10;
                    fVar = fVar4;
                    c0661b2 = c0661b8;
                }
                c0661b.b();
                Object[] objArr8 = c0661b9.f6885b;
                long[] jArr9 = c0661b9.f6884a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j7 = jArr9[i17];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j7 & 255) < 128) {
                                    t tVar4 = (t) objArr8[(i17 << 3) + i19];
                                    if (tVar4.f3990s) {
                                        s C02 = tVar4.C0();
                                        tVar4.F0();
                                        if (C02 != tVar4.C0() || c0661b11.c(tVar4)) {
                                            d.A(tVar4);
                                        }
                                    }
                                }
                                j7 >>= 8;
                            }
                            if (i18 != 8) {
                            }
                        }
                        if (i17 != length3) {
                            i17++;
                        }
                    }
                }
                c0661b9.b();
                c0661b11.b();
                fVar.f4316b.invoke();
                if (!c0661b2.g()) {
                    AbstractC0864b.D("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c0661b.g()) {
                    AbstractC0864b.D("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c0661b9.g()) {
                    return Unit.f7487a;
                }
                AbstractC0864b.D("Unprocessed FocusTarget nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) this.f3591e;
                if (bVar.f5179f.C0() == s.f4350i) {
                    bVar.f5176c.invoke();
                }
                return Unit.f7487a;
            case 2:
                ((D) this.f3591e).e();
                return Unit.f7487a;
            case 3:
                ((D) this.f3591e).e();
                return Unit.f7487a;
            case 4:
                View view = (View) this.f3591e;
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 30) {
                    AbstractC1241g.a(view, 1);
                }
                if (i20 < 29 || (a4 = AbstractC1240f.a(view)) == null) {
                    return null;
                }
                return new C1238d(a4, view);
            case 5:
                C1166s c1166s = (C1166s) this.f3591e;
                if (c1166s.isFocused() || c1166s.hasFocus()) {
                    c1166s.clearFocus();
                }
                return Unit.f7487a;
            default:
                return ((C1166s) this.f3591e).v();
        }
    }
}
