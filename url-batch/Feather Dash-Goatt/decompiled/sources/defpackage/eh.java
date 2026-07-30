package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class eh extends zq implements tx0, hc0, j81, kj1, ul, uq0, d80 {
    public static final a60 M = new a60(12);
    public yq A;
    public zy0 B;
    public q60 C;
    public final in0 D;
    public long E;
    public zy0 F;
    public gn0 G;
    public boolean H;
    public yw I;
    public rc1 J;
    public final a60 K;
    public qx0 L;
    public gn0 u;
    public boolean v;
    public boolean w;
    public Function0 x;
    public final s10 y;
    public s70 z;

    public eh(gn0 gn0Var, boolean z, boolean z2, Function0 function0) {
        this.u = gn0Var;
        this.v = z;
        this.w = z2;
        this.x = function0;
        this.y = new s10(gn0Var, new e(1, this, eh.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = yi0.a;
        this.D = new in0(6);
        this.E = 0L;
        gn0 gn0Var2 = this.u;
        this.G = gn0Var2;
        this.H = gn0Var2 == null;
        this.K = M;
    }

    @Override // defpackage.uq0
    public final void B() {
        if (this.v) {
            gb0.G(this, new b(this, 0));
        }
    }

    public final void C0() {
        gn0 gn0Var = this.u;
        in0 in0Var = this.D;
        if (gn0Var != null) {
            zy0 zy0Var = this.B;
            if (zy0Var != null) {
                gn0Var.b(new yy0(zy0Var));
            }
            zy0 zy0Var2 = this.F;
            if (zy0Var2 != null) {
                gn0Var.b(new yy0(zy0Var2));
            }
            q60 q60Var = this.C;
            if (q60Var != null) {
                gn0Var.b(new r60(q60Var));
            }
            Object[] objArr = in0Var.c;
            long[] jArr = in0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                gn0Var.b(new yy0((zy0) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.B = null;
        this.F = null;
        this.C = null;
        in0Var.a();
    }

    public final void D0(boolean z) {
        gn0 gn0Var = this.u;
        if (gn0Var != null) {
            rc1 rc1Var = this.J;
            dn dnVar = null;
            if (rc1Var == null || !rc1Var.b()) {
                zy0 zy0Var = z ? this.F : this.B;
                if (zy0Var != null) {
                    yy0 yy0Var = new yy0(zy0Var);
                    jb0 jb0Var = (jb0) ((cn) n0()).d.d(j41.m);
                    uq1.N(n0(), null, new f(gn0Var, yy0Var, jb0Var != null ? jb0Var.h(new c(gn0Var, 0, yy0Var)) : null, dnVar, 0), 3);
                }
            } else {
                rc1 rc1Var2 = this.J;
                if (rc1Var2 != null) {
                    rc1Var2.a(null);
                }
            }
            if (z) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void E0(long j, boolean z) {
        gn0 gn0Var = this.u;
        if (gn0Var != null) {
            rc1 rc1Var = this.J;
            if (rc1Var == null || !rc1Var.b()) {
                zy0 zy0Var = z ? this.F : this.B;
                if (zy0Var != null) {
                    uq1.N(n0(), null, new h(zy0Var, gn0Var, (dn) null), 3);
                }
            } else {
                rc1Var.a(null);
                uq1.N(n0(), null, new g(rc1Var, j, gn0Var, null, 0), 3);
            }
            if (z) {
                this.F = null;
            } else {
                this.B = null;
            }
        }
    }

    public final void F0(long j, boolean z) {
        gn0 gn0Var = this.u;
        if (gn0Var != null) {
            zy0 zy0Var = new zy0(j);
            v11 v11Var = new v11();
            ka0.H(this, k71.t, new l(2, v11Var));
            if (!v11Var.d) {
                int i = fh.b;
                ViewParent parent = m90.K(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z) {
                    this.F = zy0Var;
                } else {
                    this.B = zy0Var;
                }
                uq1.N(n0(), null, new h(gn0Var, zy0Var, (dn) null), 3);
                return;
            }
            this.J = uq1.N(n0(), null, new i(gn0Var, zy0Var, z, this, null), 3);
        }
    }

    public final void G0() {
        if (this.A != null) {
            return;
        }
        s70 s70Var = this.v ? this.z : null;
        if (s70Var != null) {
            if (this.u == null) {
                this.u = new gn0();
            }
            this.y.E0(this.u);
            gn0 gn0Var = this.u;
            gn0Var.getClass();
            yq a = s70Var.a(gn0Var);
            z0(a);
            this.A = a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(KeyEvent keyEvent) {
        boolean z;
        int i;
        Object obj;
        G0();
        long a = xa0.a(keyEvent.getKeyCode());
        boolean z2 = this.w;
        int i2 = 3;
        in0 in0Var = this.D;
        dn dnVar = null;
        int i3 = 1;
        if (z2) {
            int i4 = 2;
            if (ka0.t(keyEvent) == 2 && p4.K(keyEvent)) {
                if (!in0Var.b(a)) {
                    zy0 zy0Var = new zy0(this.E);
                    in0Var.f(a, zy0Var);
                    if (this.u == null) {
                        return true;
                    }
                    uq1.N(n0(), null, new j(this, zy0Var, dnVar, i4), 3);
                    return true;
                }
                return false;
            }
        }
        if (this.w && ka0.t(keyEvent) == 1 && p4.K(keyEvent)) {
            in0Var.getClass();
            int hashCode = Long.hashCode(a) * (-862048943);
            int i5 = hashCode ^ (hashCode << 16);
            int i6 = i5 & 127;
            int i7 = in0Var.d;
            int i8 = (i5 >>> 7) & i7;
            int i9 = 0;
            loop0: while (true) {
                long[] jArr = in0Var.a;
                int i10 = i8 >> 3;
                int i11 = (i8 & 7) << 3;
                z = i3;
                long j = (((-i11) >> 63) & (jArr[i10 + i3] << (64 - i11))) | (jArr[i10] >>> i11);
                long j2 = (i6 * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    i = (i8 + (Long.numberOfTrailingZeros(j4) >> 3)) & i7;
                    long j5 = j3;
                    if (in0Var.b[i] == a) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i9 += 8;
                i8 = (i8 + i9) & i7;
                i3 = z ? 1 : 0;
            }
            if (i >= 0) {
                in0Var.e--;
                long[] jArr2 = in0Var.a;
                int i12 = in0Var.d;
                int i13 = i >> 3;
                int i14 = (i & 7) << 3;
                long j6 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
                jArr2[i13] = j6;
                jArr2[(((i - 7) & i12) + (i12 & 7)) >> 3] = j6;
                Object[] objArr = in0Var.c;
                obj = objArr[i];
                objArr[i] = null;
            } else {
                obj = null;
            }
            zy0 zy0Var2 = (zy0) obj;
            if (zy0Var2 != null) {
                if (this.u != null) {
                    uq1.N(n0(), null, new j(this, zy0Var2, dnVar, i2), 3);
                }
                this.x.invoke();
            }
            if (zy0Var2 != null) {
                return z;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        b bVar = new b(this, 1);
        dc0[] dc0VarArr = s81.a;
        u81Var.a(g81.b, new z0(null, bVar));
        if (this.w) {
            this.y.W(u81Var);
        } else {
            u81Var.a(p81.i, Unit.a);
        }
    }

    @Override // defpackage.tx0
    public final void X() {
        q60 q60Var;
        gn0 gn0Var = this.u;
        if (gn0Var != null && (q60Var = this.C) != null) {
            gn0Var.b(new r60(q60Var));
        }
        this.C = null;
        if (this.L != null) {
            this.L = null;
            D0(false);
        }
    }

    @Override // defpackage.j81
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.kj1
    public final Object h() {
        return this.K;
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.d80
    public final void r() {
        yw ywVar = this.I;
        if (ywVar != null) {
            ywVar.s();
        }
    }

    @Override // defpackage.zl0
    public final void r0() {
        B();
        if (!this.H) {
            G0();
        }
        if (this.w) {
            z0(this.y);
        }
    }

    @Override // defpackage.zl0
    public final void s0() {
        C0();
        if (this.G == null) {
            this.u = null;
        }
        yq yqVar = this.A;
        if (yqVar != null) {
            A0(yqVar);
        }
        this.A = null;
    }

    @Override // defpackage.d80
    public final void y(u5 u5Var, nx0 nx0Var) {
        ArrayList arrayList = (ArrayList) u5Var.b;
        G0();
        if (this.w) {
            if (this.I == null) {
                this.I = new yw(this);
            }
            yw ywVar = this.I;
            if (ywVar != null) {
                Function0 function0 = this.x;
                eh ehVar = (eh) ywVar.e;
                int i = 0;
                if (nx0Var != nx0.e) {
                    if (nx0Var != nx0.g || ((u70) ywVar.g) == null) {
                        return;
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        u70 u70Var = (u70) arrayList.get(i);
                        if (u70Var.i && u70Var != ((u70) ywVar.g)) {
                            ywVar.s();
                            return;
                        }
                        i++;
                    }
                    return;
                }
                u70 u70Var2 = (u70) ywVar.g;
                if (u70Var2 == null) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        u70 u70Var3 = (u70) arrayList.get(i2);
                        if (!u70Var3.h && u70Var3.d) {
                            u70 u70Var4 = (u70) arrayList.get(0);
                            ywVar.g = u70Var4;
                            ehVar.F0(u70Var4.c, true);
                            u70Var4.i = true;
                            return;
                        }
                    }
                    return;
                }
                long j = u70Var2.c;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    u70 u70Var5 = (u70) arrayList.get(i3);
                    if (u70Var5.h && u70Var5.d) {
                        if (Math.abs(wq0.c(wq0.d(((u70) arrayList.get(0)).c, j))) > ((on1) mo.k(ehVar, yl.s)).b()) {
                            ywVar.s();
                            return;
                        }
                        return;
                    }
                }
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    u70 u70Var6 = (u70) arrayList.get(i4);
                    if (u70Var6.i || !u70Var6.h || u70Var6.d) {
                        int size5 = arrayList.size();
                        while (i < size5) {
                            if (((u70) arrayList.get(i)).i) {
                                ywVar.s();
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                }
                ((u70) arrayList.get(0)).i = true;
                ehVar.E0(j, true);
                function0.invoke();
                ywVar.g = null;
            }
        }
    }

    @Override // defpackage.tx0
    public final void z(mx0 mx0Var, nx0 nx0Var, long j) {
        char c = ' ';
        long j2 = 4294967295L;
        long j3 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.E = (Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L);
        G0();
        dn dnVar = null;
        int i = 1;
        int i2 = 0;
        if (this.w && nx0Var == nx0.e) {
            int i3 = mx0Var.c;
            if (i3 == 4) {
                uq1.N(n0(), null, new k(this, dnVar, i2), 3);
            } else if (i3 == 5) {
                uq1.N(n0(), null, new k(this, dnVar, i), 3);
            }
        }
        if (nx0Var != nx0.e) {
            if (nx0Var != nx0.g || this.L == null) {
                return;
            }
            List list = mx0Var.a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                qx0 qx0Var = (qx0) list.get(i4);
                if (qx0Var.b() && qx0Var != this.L) {
                    this.L = null;
                    D0(false);
                    return;
                }
            }
            return;
        }
        qx0 qx0Var2 = this.L;
        if (qx0Var2 == null) {
            if (kg1.c(mx0Var, true)) {
                qx0 qx0Var3 = (qx0) mx0Var.a.get(0);
                qx0Var3.a();
                this.L = qx0Var3;
                if (this.w) {
                    F0(qx0Var3.c, false);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = mx0Var.a;
        int size2 = list2.size();
        int i5 = 0;
        while (i5 < size2) {
            qx0 qx0Var4 = (qx0) list2.get(i5);
            if (((qx0Var4.b() || !qx0Var4.h || qx0Var4.d) ? 0 : i) == 0) {
                float max = Math.max(0.0f, Float.intBitsToFloat((int) (op.I(this).C.Q(((on1) mo.k(this, yl.s)).c()) >> c)) - ((int) (j >> c))) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (r2 & j2)) - ((int) (j & j2))) / 2.0f) & j2) | (Float.floatToRawIntBits(max) << c);
                int size3 = list2.size();
                int i6 = 0;
                while (i6 < size3) {
                    qx0 qx0Var5 = (qx0) list2.get(i6);
                    if (!qx0Var5.b()) {
                        int i7 = qx0Var5.i == i ? i : i2;
                        long j4 = qx0Var5.c;
                        char c2 = c;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> c2));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & j2));
                        float f = i7;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> c2)) * f;
                        long j5 = j2;
                        float f2 = ((int) (j >> c2)) + intBitsToFloat3;
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & j5)) * f;
                        int i8 = size3;
                        if (!((intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & j5)) + intBitsToFloat4))) {
                            i6++;
                            size3 = i8;
                            j2 = j5;
                            i = 1;
                            c = ' ';
                            i2 = 0;
                        }
                    }
                    this.L = null;
                    D0(false);
                    return;
                }
                return;
            }
            i5++;
            j2 = j2;
            i = 1;
            c = ' ';
        }
        ((qx0) list2.get(0)).a();
        if (this.w) {
            E0(qx0Var2.c, false);
            this.x.invoke();
        }
        this.L = null;
    }
}
