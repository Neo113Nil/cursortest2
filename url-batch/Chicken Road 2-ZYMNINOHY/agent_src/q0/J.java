package q0;

import T.C0096n;
import T.C0097o;
import a.AbstractC0124a;
import a0.C0144j;
import a0.p0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Zo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class J implements InterfaceC1383z, InterfaceC1382y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1383z[] f14834a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f14835b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f14836c;

    /* renamed from: d, reason: collision with root package name */
    public final C0144j f14837d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14838e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f14839f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1382y f14840g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f14841h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1383z[] f14842i;

    /* renamed from: j, reason: collision with root package name */
    public C1372n f14843j;

    public J(C0144j c0144j, long[] jArr, InterfaceC1383z... interfaceC1383zArr) {
        this.f14837d = c0144j;
        this.f14834a = interfaceC1383zArr;
        c0144j.getClass();
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        this.f14843j = new C1372n(a0Var, a0Var);
        this.f14836c = new IdentityHashMap();
        this.f14842i = new InterfaceC1383z[0];
        this.f14835b = new boolean[interfaceC1383zArr.length];
        for (int i4 = 0; i4 < interfaceC1383zArr.length; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                this.f14835b[i4] = true;
                this.f14834a[i4] = new h0(interfaceC1383zArr[i4], j4);
            }
        }
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        InterfaceC1383z[] interfaceC1383zArr = this.f14842i;
        return (interfaceC1383zArr.length > 0 ? interfaceC1383zArr[0] : this.f14834a[0]).b(j4, p0Var);
    }

    @Override // q0.InterfaceC1383z
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[tVarArr.length];
        int[] iArr3 = new int[tVarArr.length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.f14836c;
            if (i5 >= length) {
                break;
            }
            b0 b0Var = b0VarArr[i5];
            Integer num = b0Var == null ? null : (Integer) identityHashMap.get(b0Var);
            iArr2[i5] = num == null ? -1 : num.intValue();
            t0.t tVar = tVarArr[i5];
            if (tVar != null) {
                String str = tVar.c().f2706b;
                iArr3[i5] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b0[] b0VarArr2 = new b0[length2];
        b0[] b0VarArr3 = new b0[tVarArr.length];
        t0.t[] tVarArr2 = new t0.t[tVarArr.length];
        InterfaceC1383z[] interfaceC1383zArr = this.f14834a;
        ArrayList arrayList = new ArrayList(interfaceC1383zArr.length);
        long j5 = j4;
        int i6 = 0;
        while (i6 < interfaceC1383zArr.length) {
            int i7 = i4;
            while (i7 < tVarArr.length) {
                b0VarArr3[i7] = iArr2[i7] == i6 ? b0VarArr[i7] : null;
                if (iArr3[i7] == i6) {
                    t0.t tVar2 = tVarArr[i7];
                    tVar2.getClass();
                    iArr = iArr2;
                    T.U u4 = (T.U) this.f14839f.get(tVar2.c());
                    u4.getClass();
                    tVarArr2[i7] = new I(tVar2, u4);
                } else {
                    iArr = iArr2;
                    tVarArr2[i7] = null;
                }
                i7++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC1383z[] interfaceC1383zArr2 = interfaceC1383zArr;
            int i8 = i6;
            long d4 = interfaceC1383zArr2[i6].d(tVarArr2, zArr, b0VarArr3, zArr2, j5);
            if (i8 == 0) {
                j5 = d4;
            } else if (d4 != j5) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i9 = 0; i9 < tVarArr.length; i9++) {
                if (iArr3[i9] == i8) {
                    b0 b0Var2 = b0VarArr3[i9];
                    b0Var2.getClass();
                    b0VarArr2[i9] = b0VarArr3[i9];
                    identityHashMap.put(b0Var2, Integer.valueOf(i8));
                    z = true;
                } else if (iArr4[i9] == i8) {
                    AbstractC0124a.t(b0VarArr3[i9] == null);
                }
            }
            if (z) {
                arrayList.add(interfaceC1383zArr2[i8]);
            }
            i6 = i8 + 1;
            interfaceC1383zArr = interfaceC1383zArr2;
            iArr2 = iArr4;
            i4 = 0;
        }
        int i10 = i4;
        System.arraycopy(b0VarArr2, i10, b0VarArr, i10, length2);
        this.f14842i = (InterfaceC1383z[]) arrayList.toArray(new InterfaceC1383z[i10]);
        AbstractList u5 = v2.r.u(arrayList, new Zo(8));
        this.f14837d.getClass();
        this.f14843j = new C1372n(arrayList, u5);
        return j5;
    }

    @Override // q0.d0
    public final long e() {
        return this.f14843j.e();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f14840g = interfaceC1382y;
        ArrayList arrayList = this.f14838e;
        InterfaceC1383z[] interfaceC1383zArr = this.f14834a;
        Collections.addAll(arrayList, interfaceC1383zArr);
        for (InterfaceC1383z interfaceC1383z : interfaceC1383zArr) {
            interfaceC1383z.f(this, j4);
        }
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        for (InterfaceC1383z interfaceC1383z : this.f14834a) {
            interfaceC1383z.h();
        }
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        long i4 = this.f14842i[0].i(j4);
        int i5 = 1;
        while (true) {
            InterfaceC1383z[] interfaceC1383zArr = this.f14842i;
            if (i5 >= interfaceC1383zArr.length) {
                return i4;
            }
            if (interfaceC1383zArr[i5].i(i4) != i4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i5++;
        }
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        for (InterfaceC1383z interfaceC1383z : this.f14842i) {
            interfaceC1383z.j(j4);
        }
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f14843j.l();
    }

    @Override // q0.InterfaceC1382y
    public final void m(InterfaceC1383z interfaceC1383z) {
        ArrayList arrayList = this.f14838e;
        arrayList.remove(interfaceC1383z);
        if (arrayList.isEmpty()) {
            InterfaceC1383z[] interfaceC1383zArr = this.f14834a;
            int i4 = 0;
            for (InterfaceC1383z interfaceC1383z2 : interfaceC1383zArr) {
                i4 += interfaceC1383z2.t().f15034a;
            }
            T.U[] uArr = new T.U[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < interfaceC1383zArr.length; i6++) {
                j0 t4 = interfaceC1383zArr[i6].t();
                int i7 = t4.f15034a;
                int i8 = 0;
                while (i8 < i7) {
                    T.U a3 = t4.a(i8);
                    int i9 = a3.f2705a;
                    C0097o[] c0097oArr = new C0097o[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        C0097o c0097o = a3.f2708d[i10];
                        C0096n a4 = c0097o.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i6);
                        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = c0097o.f2856a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a4.f2819a = sb.toString();
                        c0097oArr[i10] = new C0097o(a4);
                    }
                    T.U u4 = new T.U(i6 + StringUtils.PROCESS_POSTFIX_DELIMITER + a3.f2706b, c0097oArr);
                    this.f14839f.put(u4, a3);
                    uArr[i5] = u4;
                    i8++;
                    i5++;
                }
            }
            this.f14841h = new j0(uArr);
            InterfaceC1382y interfaceC1382y = this.f14840g;
            interfaceC1382y.getClass();
            interfaceC1382y.m(this);
        }
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        long j4 = -9223372036854775807L;
        for (InterfaceC1383z interfaceC1383z : this.f14842i) {
            long q4 = interfaceC1383z.q();
            if (q4 != -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    for (InterfaceC1383z interfaceC1383z2 : this.f14842i) {
                        if (interfaceC1383z2 == interfaceC1383z) {
                            break;
                        }
                        if (interfaceC1383z2.i(q4) != q4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j4 = q4;
                } else if (q4 != j4) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j4 != -9223372036854775807L && interfaceC1383z.i(j4) != j4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j4;
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        InterfaceC1382y interfaceC1382y = this.f14840g;
        interfaceC1382y.getClass();
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        j0 j0Var = this.f14841h;
        j0Var.getClass();
        return j0Var;
    }

    @Override // q0.d0
    public final long u() {
        return this.f14843j.u();
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        ArrayList arrayList = this.f14838e;
        if (arrayList.isEmpty()) {
            return this.f14843j.v(q4);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC1383z) arrayList.get(i4)).v(q4);
        }
        return false;
    }

    @Override // q0.d0
    public final void w(long j4) {
        this.f14843j.w(j4);
    }
}
