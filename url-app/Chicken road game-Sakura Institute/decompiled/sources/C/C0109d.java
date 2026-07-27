package C;

import B1.C0097d;
import D.T;
import D.U;
import Z.C0323u;
import a.AbstractC0345a;
import b0.C0494b;
import b0.C0499g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.C0778d;
import p.C0937m;
import p.InterfaceC0934j;
import r0.AbstractC1065f;
import w2.C1294c;

/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109d extends y {

    /* renamed from: D, reason: collision with root package name */
    public final i.y f1080D;

    public C0109d(InterfaceC0934j interfaceC0934j, boolean z4, float f4, T t4, U u4) {
        super(interfaceC0934j, z4, f4, t4, u4);
        this.f1080D = new i.y();
    }

    @Override // C.y
    public final void B0(C0937m c0937m, long j4, float f4) {
        i.y yVar = this.f1080D;
        Object[] objArr = yVar.f6983b;
        Object[] objArr2 = yVar.f6984c;
        long[] jArr = yVar.f6982a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j5 = jArr[i2];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j5) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            p pVar = (p) objArr2[i6];
                            pVar.f1119k.setValue(Boolean.TRUE);
                            pVar.f1117i.U(Unit.f7487a);
                        }
                        j5 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z4 = this.f1144u;
        p pVar2 = new p(z4 ? new Y.c(c0937m.f8974a) : null, f4, z4);
        yVar.i(c0937m, pVar2);
        W2.B.m(p0(), null, null, new C0108c(pVar2, this, c0937m, null), 3);
        AbstractC1065f.n(this);
    }

    @Override // C.y
    public final void C0(r0.G g4) {
        float f4;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f5;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        C0109d c0109d = this;
        float f6 = ((C0113h) c0109d.f1147x.invoke()).f1092d;
        if (f6 == 0.0f) {
            return;
        }
        i.y yVar = c0109d.f1080D;
        Object[] objArr5 = yVar.f6983b;
        Object[] objArr6 = yVar.f6984c;
        long[] jArr3 = yVar.f6982a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr3[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j4) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr5[i8];
                        p pVar = (p) objArr6[i8];
                        long b4 = C0323u.b(f6, c0109d.f1146w.a());
                        Float f7 = pVar.f1112d;
                        f5 = f6;
                        C0494b c0494b = g4.f9624d;
                        if (f7 == null) {
                            long h4 = c0494b.h();
                            float f8 = q.f1120a;
                            pVar.f1112d = Float.valueOf(Math.max(Y.f.d(h4), Y.f.b(h4)) * 0.3f);
                        }
                        long[] jArr4 = jArr3;
                        if (pVar.f1109a == null) {
                            objArr3 = objArr5;
                            pVar.f1109a = new Y.c(c0494b.w());
                        } else {
                            objArr3 = objArr5;
                        }
                        if (pVar.f1113e == null) {
                            pVar.f1113e = new Y.c(AbstractC0345a.c(Y.f.d(c0494b.h()) / 2.0f, Y.f.b(c0494b.h()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) pVar.f1119k.getValue()).booleanValue() || ((Boolean) pVar.f1118j.getValue()).booleanValue()) ? ((Number) pVar.f1114f.d()).floatValue() : 1.0f;
                        Float f9 = pVar.f1112d;
                        Intrinsics.c(f9);
                        objArr4 = objArr6;
                        float N3 = u3.d.N(f9.floatValue(), pVar.f1110b, ((Number) pVar.f1115g.d()).floatValue());
                        Y.c cVar = pVar.f1109a;
                        Intrinsics.c(cVar);
                        float d4 = Y.c.d(cVar.f4372a);
                        Y.c cVar2 = pVar.f1113e;
                        Intrinsics.c(cVar2);
                        float d5 = Y.c.d(cVar2.f4372a);
                        C0778d c0778d = pVar.f1116h;
                        jArr2 = jArr4;
                        float N4 = u3.d.N(d4, d5, ((Number) c0778d.d()).floatValue());
                        Y.c cVar3 = pVar.f1109a;
                        Intrinsics.c(cVar3);
                        i2 = length;
                        float e4 = Y.c.e(cVar3.f4372a);
                        Y.c cVar4 = pVar.f1113e;
                        Intrinsics.c(cVar4);
                        long c4 = AbstractC0345a.c(N4, u3.d.N(e4, Y.c.e(cVar4.f4372a), ((Number) c0778d.d()).floatValue()));
                        long b5 = C0323u.b(C0323u.d(b4) * floatValue, b4);
                        if (pVar.f1111c) {
                            float d6 = Y.f.d(c0494b.h());
                            float b6 = Y.f.b(c0494b.h());
                            C0097d c0097d = c0494b.f5603e;
                            long s4 = c0097d.s();
                            c0097d.k().g();
                            try {
                                ((C0097d) ((C1294c) c0097d.f987e).f11388d).k().p(0.0f, 0.0f, d6, b6, 1);
                                g4.V(b5, N3, (r18 & 4) != 0 ? g4.w() : c4, 1.0f, C0499g.f5607a, null, 3);
                            } finally {
                                c0097d.k().b();
                                c0097d.G(s4);
                            }
                        } else {
                            g4.V(b5, N3, (r18 & 4) != 0 ? g4.w() : c4, 1.0f, C0499g.f5607a, null, 3);
                        }
                    } else {
                        f5 = f6;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i2 = length;
                    }
                    j4 >>= 8;
                    i7++;
                    c0109d = this;
                    i5 = 8;
                    f6 = f5;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    jArr3 = jArr2;
                    length = i2;
                }
                f4 = f6;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
                int i9 = length;
                if (i6 != i5) {
                    return;
                } else {
                    length = i9;
                }
            } else {
                f4 = f6;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            c0109d = this;
            f6 = f4;
            objArr5 = objArr;
            objArr6 = objArr2;
            jArr3 = jArr;
        }
    }

    @Override // C.y
    public final void E0(C0937m c0937m) {
        p pVar = (p) this.f1080D.e(c0937m);
        if (pVar != null) {
            pVar.f1119k.setValue(Boolean.TRUE);
            pVar.f1117i.U(Unit.f7487a);
        }
    }

    @Override // S.n
    public final void u0() {
        this.f1080D.a();
    }
}
