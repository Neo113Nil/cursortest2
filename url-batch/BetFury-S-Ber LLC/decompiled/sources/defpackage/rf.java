package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class rf {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final xe I;
    public final xe J;
    public final xe K;
    public final xe L;
    public final xe M;
    public final xe N;
    public final xe O;
    public final xe P;
    public final xe[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public final qf[] T;
    public rf U;
    public int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int a0;
    public za b;
    public int b0;
    public za c;
    public int c0;
    public int d0;
    public float e0;
    public float f0;
    public View g0;
    public int h0;
    public String i0;
    public String j;
    public int j0;
    public boolean k;
    public int k0;
    public boolean l;
    public final float[] l0;
    public boolean m;
    public final rf[] m0;
    public boolean n;
    public final rf[] n0;
    public int o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public jt d = null;
    public rl0 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public rf() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        xe xeVar = new xe(this, we.LEFT);
        this.I = xeVar;
        xe xeVar2 = new xe(this, we.TOP);
        this.J = xeVar2;
        xe xeVar3 = new xe(this, we.RIGHT);
        this.K = xeVar3;
        xe xeVar4 = new xe(this, we.BOTTOM);
        this.L = xeVar4;
        xe xeVar5 = new xe(this, we.BASELINE);
        this.M = xeVar5;
        xe xeVar6 = new xe(this, we.CENTER_X);
        this.N = xeVar6;
        xe xeVar7 = new xe(this, we.CENTER_Y);
        this.O = xeVar7;
        xe xeVar8 = new xe(this, we.CENTER);
        this.P = xeVar8;
        this.Q = new xe[]{xeVar, xeVar3, xeVar2, xeVar4, xeVar5, xeVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        qf qfVar = qf.FIXED;
        this.T = new qf[]{qfVar, qfVar};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        this.h0 = 0;
        this.i0 = null;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = new float[]{-1.0f, -1.0f};
        this.m0 = new rf[]{null, null};
        this.n0 = new rf[]{null, null};
        this.o0 = -1;
        this.p0 = -1;
        arrayList.add(xeVar);
        arrayList.add(xeVar2);
        arrayList.add(xeVar3);
        arrayList.add(xeVar4);
        arrayList.add(xeVar6);
        arrayList.add(xeVar7);
        arrayList.add(xeVar8);
        arrayList.add(xeVar5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, qf qfVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = qfVar.toString();
        if (!qf.FIXED.toString().equals(obj)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(obj);
            sb.append(",\n");
        }
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, xe xeVar) {
        if (xeVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(xeVar.f);
        sb.append("'");
        if (xeVar.h != Integer.MIN_VALUE || xeVar.g != 0) {
            sb.append(",");
            sb.append(xeVar.g);
            if (xeVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(xeVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.l) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.U = null;
        this.D = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.5f;
        this.f0 = 0.5f;
        qf qfVar = qf.FIXED;
        qf[] qfVarArr = this.T;
        qfVarArr[0] = qfVar;
        qfVarArr[1] = qfVar;
        this.g0 = null;
        this.h0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        float[] fArr = this.l0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        rf rfVar = this.U;
        if (rfVar != null && (rfVar instanceof sf)) {
            ((sf) rfVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xe) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xe xeVar = (xe) arrayList.get(i);
            xeVar.c = false;
            xeVar.b = 0;
        }
    }

    public void F(s6 s6Var) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.b0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Z = i;
        this.V = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.a0 = i;
        this.W = i2 - i;
        if (this.E) {
            this.M.l(i + this.b0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public final void M(qf qfVar) {
        this.T[0] = qfVar;
    }

    public final void N(qf qfVar) {
        this.T[1] = qfVar;
    }

    public final void O(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        jt jtVar = this.d;
        boolean z3 = z & jtVar.g;
        rl0 rl0Var = this.e;
        boolean z4 = z2 & rl0Var.g;
        int i3 = jtVar.h.g;
        int i4 = rl0Var.h.g;
        int i5 = jtVar.i.g;
        int i6 = rl0Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.a0 = i4;
        }
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        qf[] qfVarArr = this.T;
        if (z3) {
            if (qfVarArr[0] == qf.FIXED && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i10 = this.c0;
            if (i8 < i10) {
                this.V = i10;
            }
        }
        if (z4) {
            if (qfVarArr[1] == qf.FIXED && i9 < (i = this.W)) {
                i9 = i;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
    }

    public void Q(xx xxVar, boolean z) {
        int i;
        int i2;
        rl0 rl0Var;
        jt jtVar;
        xxVar.getClass();
        int n = xx.n(this.I);
        int n2 = xx.n(this.J);
        int n3 = xx.n(this.K);
        int n4 = xx.n(this.L);
        if (z && (jtVar = this.d) != null) {
            mj mjVar = jtVar.h;
            if (mjVar.j) {
                mj mjVar2 = jtVar.i;
                if (mjVar2.j) {
                    n = mjVar.g;
                    n3 = mjVar2.g;
                }
            }
        }
        if (z && (rl0Var = this.e) != null) {
            mj mjVar3 = rl0Var.h;
            if (mjVar3.j) {
                mj mjVar4 = rl0Var.i;
                if (mjVar4.j) {
                    n2 = mjVar3.g;
                    n4 = mjVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.Z = n;
        this.a0 = n2;
        if (this.h0 == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        qf[] qfVarArr = this.T;
        qf qfVar = qfVarArr[0];
        qf qfVar2 = qf.FIXED;
        if (qfVar == qfVar2 && i4 < (i2 = this.V)) {
            i4 = i2;
        }
        if (qfVarArr[1] == qfVar2 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i4;
        this.W = i5;
        int i6 = this.d0;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.c0;
        if (i4 < i7) {
            this.V = i7;
        }
        int i8 = this.v;
        if (i8 > 0 && qfVar == qf.MATCH_CONSTRAINT) {
            this.V = Math.min(this.V, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && qfVarArr[1] == qf.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(sf sfVar, xx xxVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            bi.p(sfVar, xxVar, this);
            hashSet.remove(this);
            b(xxVar, sfVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((xe) it.next()).d.a(sfVar, xxVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((xe) it2.next()).d.a(sfVar, xxVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((xe) it3.next()).d.a(sfVar, xxVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((xe) it4.next()).d.a(sfVar, xxVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((xe) it5.next()).d.a(sfVar, xxVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05f9, code lost:
    
        if (r60.h0 == r9) goto L381;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b9  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v45, types: [sf] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r60v0, types: [rf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(xx xxVar, boolean z) {
        boolean z2;
        boolean z3;
        ?? r19;
        ?? r17;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        rf rfVar;
        rf rfVar2;
        boolean[] zArr;
        xe xeVar;
        boolean[] zArr2;
        xe xeVar2;
        xe xeVar3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        int i3;
        float f;
        je0 je0Var;
        je0 je0Var2;
        xe xeVar4;
        int i4;
        int i5;
        int i6;
        boolean z11;
        int i7;
        boolean z12;
        qf qfVar;
        qf qfVar2;
        qf qfVar3;
        boolean z13;
        xe xeVar5;
        int i8;
        int[] iArr;
        xe xeVar6;
        je0 je0Var3;
        qf qfVar4;
        je0 je0Var4;
        qf qfVar5;
        xe xeVar7;
        boolean z14;
        int[] iArr2;
        boolean z15;
        xe xeVar8;
        je0 je0Var5;
        je0 je0Var6;
        je0 je0Var7;
        boolean[] zArr3;
        int i9;
        boolean z16;
        je0 je0Var8;
        je0 je0Var9;
        je0 je0Var10;
        int i10;
        int i11;
        int i12;
        int i13;
        je0 je0Var11;
        je0 je0Var12;
        ?? r27;
        rl0 rl0Var;
        mj mjVar;
        rf rfVar3;
        xe xeVar9;
        jt jtVar;
        int i14;
        boolean x;
        ?? r12;
        boolean y;
        jt jtVar2;
        rl0 rl0Var2;
        boolean z17;
        xx xxVar2 = xxVar;
        xe xeVar10 = this.I;
        je0 k = xxVar2.k(xeVar10);
        xe xeVar11 = this.K;
        je0 k2 = xxVar2.k(xeVar11);
        xe xeVar12 = this.J;
        je0 k3 = xxVar2.k(xeVar12);
        xe xeVar13 = this.L;
        je0 k4 = xxVar2.k(xeVar13);
        xe xeVar14 = this.M;
        je0 k5 = xxVar2.k(xeVar14);
        rf rfVar4 = this.U;
        if (rfVar4 != null) {
            qf[] qfVarArr = rfVar4.T;
            r17 = 0;
            r17 = 0;
            z3 = false;
            r17 = 0;
            qf qfVar6 = qfVarArr[0];
            qf qfVar7 = qf.WRAP_CONTENT;
            z4 = qfVar6 == qfVar7;
            z5 = qfVarArr[1] == qfVar7;
            int i15 = this.q;
            if (i15 != 1) {
                boolean z18 = true;
                if (i15 != 2) {
                    z2 = z18;
                    r19 = z18;
                } else {
                    z4 = false;
                    r19 = z18;
                }
            } else {
                r19 = 1;
                z5 = false;
            }
            i = this.h0;
            boolean[] zArr4 = this.S;
            boolean z19 = z5;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z6 = z4;
                int i16 = r17;
                while (true) {
                    if (i16 < size) {
                        int i17 = size;
                        HashSet hashSet = ((xe) arrayList.get(i16)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i16++;
                        size = i17;
                    } else if (!zArr4[r17] && !zArr4[r19]) {
                        return;
                    }
                }
            } else {
                z6 = z4;
            }
            z7 = this.k;
            if (!z7 || this.l) {
                if (z7) {
                    xxVar2.d(k, this.Z);
                    xxVar2.d(k2, this.Z + this.V);
                    if (z6 && (rfVar2 = this.U) != null) {
                        sf sfVar = (sf) rfVar2;
                        WeakReference weakReference = sfVar.H0;
                        if (weakReference == null || weakReference.get() == null || xeVar10.d() > ((xe) sfVar.H0.get()).d()) {
                            sfVar.H0 = new WeakReference(xeVar10);
                        }
                        WeakReference weakReference2 = sfVar.J0;
                        if (weakReference2 == null || weakReference2.get() == null || xeVar11.d() > ((xe) sfVar.J0.get()).d()) {
                            sfVar.J0 = new WeakReference(xeVar11);
                        }
                    }
                }
                if (this.l) {
                    xxVar2.d(k3, this.a0);
                    xxVar2.d(k4, this.a0 + this.W);
                    HashSet hashSet2 = xeVar14.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        xxVar2.d(k5, this.a0 + this.b0);
                    }
                    if (z19 && (rfVar = this.U) != null) {
                        sf sfVar2 = (sf) rfVar;
                        WeakReference weakReference3 = sfVar2.G0;
                        if (weakReference3 == null || weakReference3.get() == null || xeVar12.d() > ((xe) sfVar2.G0.get()).d()) {
                            sfVar2.G0 = new WeakReference(xeVar12);
                        }
                        WeakReference weakReference4 = sfVar2.I0;
                        if (weakReference4 == null || weakReference4.get() == null || xeVar13.d() > ((xe) sfVar2.I0.get()).d()) {
                            sfVar2.I0 = new WeakReference(xeVar13);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z20 = r17;
                    this.k = z20;
                    this.l = z20;
                    return;
                }
            }
            zArr = this.f;
            if (z || (jtVar2 = this.d) == null || (rl0Var2 = this.e) == null) {
                xeVar = xeVar14;
                zArr2 = zArr;
            } else {
                xeVar = xeVar14;
                mj mjVar2 = jtVar2.h;
                zArr2 = zArr;
                if (mjVar2.j && jtVar2.i.j && rl0Var2.h.j && rl0Var2.i.j) {
                    xxVar2.d(k, mjVar2.g);
                    xxVar2.d(k2, this.d.i.g);
                    xxVar2.d(k3, this.e.h.g);
                    xxVar2.d(k4, this.e.i.g);
                    xxVar2.d(k5, this.e.k.g);
                    if (this.U != null) {
                        if (z6 && zArr2[0] && !x()) {
                            xxVar2.f(xxVar2.k(this.U.K), k2, 0, 8);
                        }
                        if (z19 && zArr2[r19] && !y()) {
                            z17 = false;
                            xxVar2.f(xxVar2.k(this.U.L), k4, 0, 8);
                            this.k = z17;
                            this.l = z17;
                            return;
                        }
                    }
                    z17 = false;
                    this.k = z17;
                    this.l = z17;
                    return;
                }
            }
            if (this.U == null) {
                if (w(0)) {
                    ((sf) this.U).R(this, 0);
                    x = r19;
                    r12 = x;
                } else {
                    x = x();
                    r12 = r19;
                }
                if (w(r12)) {
                    ((sf) this.U).R(this, r12);
                    y = true;
                } else {
                    y = y();
                }
                if (!x && z6 && this.h0 != 8 && xeVar10.f == null && xeVar11.f == null) {
                    xeVar2 = xeVar10;
                    xxVar2.f(xxVar2.k(this.U.K), k2, 0, 1);
                } else {
                    xeVar2 = xeVar10;
                }
                if (!y && z19 && this.h0 != 8 && xeVar12.f == null && xeVar13.f == null && xeVar == null) {
                    xxVar2.f(xxVar2.k(this.U.L), k4, 0, 1);
                }
                xeVar3 = xeVar11;
                z8 = z19;
                z10 = y;
                z9 = x;
            } else {
                xeVar2 = xeVar10;
                xeVar3 = xeVar11;
                z8 = z19;
                z9 = false;
                z10 = false;
            }
            i2 = this.V;
            i3 = this.c0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i18 = this.W;
            xe xeVar15 = xeVar3;
            int i19 = this.d0;
            int i20 = i18 >= i19 ? i19 : i18;
            qf[] qfVarArr2 = this.T;
            qf qfVar8 = qfVarArr2[0];
            boolean z21 = z8;
            qf qfVar9 = qf.MATCH_CONSTRAINT;
            boolean z22 = qfVar8 == qfVar9;
            qf qfVar10 = qfVarArr2[1];
            boolean z23 = qfVar10 == qfVar9;
            int i21 = this.Y;
            this.A = i21;
            f = this.X;
            this.B = f;
            int i22 = this.r;
            int i23 = this.s;
            if (f <= 0.0f) {
                je0Var = k4;
                if (this.h0 != 8) {
                    i5 = (qfVar8 == qfVar9 && i22 == 0) ? 3 : i22;
                    int i24 = (qfVar10 == qfVar9 && i23 == 0) ? 3 : i23;
                    if (qfVar8 == qfVar9 && qfVar10 == qfVar9) {
                        je0Var2 = k5;
                        if (i5 == 3 && i24 == 3) {
                            if (i21 == -1) {
                                if (z22 && !z23) {
                                    this.A = 0;
                                } else if (!z22 && z23) {
                                    this.A = 1;
                                    if (i21 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!xeVar12.h() || !xeVar13.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!xeVar2.h() || !xeVar15.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!xeVar12.h() || !xeVar13.h() || !xeVar2.h() || !xeVar15.h())) {
                                if (xeVar12.h() && xeVar13.h()) {
                                    this.A = 0;
                                } else if (xeVar2.h() && xeVar15.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i25 = this.u;
                                if (i25 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i25 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            xeVar4 = xeVar;
                            i4 = i20;
                            z11 = true;
                            i6 = i24;
                            int[] iArr3 = this.t;
                            iArr3[0] = i5;
                            iArr3[1] = i6;
                            if (z11) {
                                i7 = -1;
                            } else {
                                int i26 = this.A;
                                i7 = -1;
                                if (i26 == 0 || i26 == -1) {
                                    z12 = true;
                                    boolean z24 = !z11 && ((i14 = this.A) == 1 || i14 == i7);
                                    qfVar = qfVarArr2[0];
                                    qfVar2 = qf.WRAP_CONTENT;
                                    if (qfVar == qfVar2 || !(this instanceof sf)) {
                                        qfVar3 = qfVar2;
                                        z13 = false;
                                    } else {
                                        qfVar3 = qfVar2;
                                        z13 = true;
                                    }
                                    if (z13) {
                                        i3 = 0;
                                    }
                                    xeVar5 = this.P;
                                    boolean z25 = !xeVar5.h();
                                    boolean z26 = zArr4[0];
                                    boolean z27 = zArr4[1];
                                    i8 = this.o;
                                    iArr = this.C;
                                    if (i8 == 2 && !this.k) {
                                        if (!z || (jtVar = this.d) == null) {
                                            xeVar9 = xeVar4;
                                        } else {
                                            mj mjVar3 = jtVar.h;
                                            xeVar9 = xeVar4;
                                            if (mjVar3.j && jtVar.i.j) {
                                                if (z) {
                                                    xxVar2.d(k, mjVar3.g);
                                                    xxVar2.d(k2, this.d.i.g);
                                                    if (this.U != null && z6 && zArr2[0] && !x()) {
                                                        xxVar2.f(xxVar2.k(this.U.K), k2, 0, 8);
                                                    }
                                                }
                                                je0Var3 = k;
                                                qfVar4 = qfVar9;
                                                je0Var4 = k2;
                                                qfVar5 = qfVar3;
                                                xeVar7 = xeVar5;
                                                z14 = z9;
                                                iArr2 = iArr;
                                                z15 = z6;
                                                xeVar6 = xeVar9;
                                            }
                                        }
                                        rf rfVar5 = this.U;
                                        je0 k6 = rfVar5 != null ? xxVar2.k(rfVar5.K) : null;
                                        rf rfVar6 = this.U;
                                        je0 k7 = rfVar6 != null ? xxVar2.k(rfVar6.I) : null;
                                        boolean z28 = zArr2[0];
                                        z15 = z6;
                                        i9 = i5;
                                        qf qfVar11 = qfVarArr2[0];
                                        z14 = z9;
                                        int i27 = this.Z;
                                        int i28 = this.c0;
                                        iArr2 = iArr;
                                        int i29 = iArr2[0];
                                        float f2 = this.e0;
                                        boolean z29 = qfVarArr2[1] == qfVar9;
                                        xeVar7 = xeVar5;
                                        qfVar4 = qfVar9;
                                        je0Var4 = k2;
                                        xeVar6 = xeVar9;
                                        je0Var3 = k;
                                        z16 = z21;
                                        je0Var7 = k3;
                                        xeVar8 = xeVar13;
                                        je0Var6 = je0Var;
                                        je0Var5 = je0Var2;
                                        qfVar5 = qfVar3;
                                        zArr3 = zArr2;
                                        xxVar2 = xxVar;
                                        d(xxVar2, true, z15, z16, z28, k7, k6, qfVar11, z13, this.I, this.K, i27, i3, i28, i29, f2, z12, z29, z14, z10, z26, i9, i6, this.u, this.v, this.w, z25);
                                        if (z && (rl0Var = this.e) != null) {
                                            mjVar = rl0Var.h;
                                            if (mjVar.j && rl0Var.i.j) {
                                                int i30 = mjVar.g;
                                                je0Var8 = je0Var7;
                                                xxVar2.d(je0Var8, i30);
                                                je0Var9 = je0Var6;
                                                xxVar2.d(je0Var9, this.e.i.g);
                                                je0Var10 = je0Var5;
                                                xxVar2.d(je0Var10, this.e.k.g);
                                                rfVar3 = this.U;
                                                if (rfVar3 == null && !z10 && z16) {
                                                    i12 = 1;
                                                    if (zArr3[1]) {
                                                        i10 = 0;
                                                        i11 = 8;
                                                        xxVar2.f(xxVar2.k(rfVar3.L), je0Var9, 0, 8);
                                                    } else {
                                                        i10 = 0;
                                                        i11 = 8;
                                                    }
                                                } else {
                                                    i10 = 0;
                                                    i11 = 8;
                                                    i12 = 1;
                                                }
                                                i13 = i10;
                                                if (this.p == 2) {
                                                    i13 = i10;
                                                }
                                                if (i13 != 0 || this.l) {
                                                    je0Var11 = je0Var8;
                                                    je0Var12 = je0Var9;
                                                } else {
                                                    int i31 = (qfVarArr2[i12] == qfVar5 && (this instanceof sf)) ? i12 : i10;
                                                    int i32 = i31 != 0 ? i10 : i4;
                                                    rf rfVar7 = this.U;
                                                    je0 k8 = rfVar7 != null ? xxVar2.k(rfVar7.L) : null;
                                                    rf rfVar8 = this.U;
                                                    je0 k9 = rfVar8 != null ? xxVar2.k(rfVar8.J) : null;
                                                    int i33 = this.b0;
                                                    if (i33 <= 0) {
                                                        r27 = z25;
                                                    }
                                                    xe xeVar16 = xeVar6;
                                                    if (xeVar16.f != null) {
                                                        xxVar2.e(je0Var10, je0Var8, i33, i11);
                                                        xxVar2.e(je0Var10, xxVar2.k(xeVar16.f), xeVar16.e(), i11);
                                                        if (z16) {
                                                            xxVar2.f(k8, xxVar2.k(xeVar8), i10, 5);
                                                        }
                                                        r27 = i10;
                                                    } else if (this.h0 == i11) {
                                                        xxVar2.e(je0Var10, je0Var8, xeVar16.e(), i11);
                                                        r27 = z25;
                                                    } else {
                                                        xxVar2.e(je0Var10, je0Var8, i33, i11);
                                                        r27 = z25;
                                                    }
                                                    int i34 = i10;
                                                    int i35 = i12;
                                                    je0Var12 = je0Var9;
                                                    je0Var11 = je0Var8;
                                                    xxVar2 = xxVar;
                                                    d(xxVar2, false, z16, z15, zArr3[i12], k9, k8, qfVarArr2[i12], i31, this.J, this.L, this.a0, i32, this.d0, iArr2[i35], this.f0, z24, qfVarArr2[i34] == qfVar4 ? i35 : i34, z10, z14, z27, i6, i9, this.x, this.y, this.z, r27);
                                                }
                                                if (z11) {
                                                    int i36 = this.A;
                                                    float f3 = this.B;
                                                    if (i36 == 1) {
                                                        h7 l = xxVar2.l();
                                                        l.d.g(je0Var12, -1.0f);
                                                        l.d.g(je0Var11, 1.0f);
                                                        l.d.g(je0Var4, f3);
                                                        l.d.g(je0Var3, -f3);
                                                        xxVar2.c(l);
                                                    } else {
                                                        h7 l2 = xxVar2.l();
                                                        l2.d.g(je0Var4, -1.0f);
                                                        l2.d.g(je0Var3, 1.0f);
                                                        l2.d.g(je0Var12, f3);
                                                        l2.d.g(je0Var11, -f3);
                                                        xxVar2.c(l2);
                                                    }
                                                }
                                                if (xeVar7.h()) {
                                                    xe xeVar17 = xeVar7;
                                                    rf rfVar9 = xeVar17.f.d;
                                                    float radians = (float) Math.toRadians(this.D + 90.0f);
                                                    int e = xeVar17.e();
                                                    we weVar = we.LEFT;
                                                    je0 k10 = xxVar2.k(i(weVar));
                                                    we weVar2 = we.TOP;
                                                    je0 k11 = xxVar2.k(i(weVar2));
                                                    we weVar3 = we.RIGHT;
                                                    je0 k12 = xxVar2.k(i(weVar3));
                                                    we weVar4 = we.BOTTOM;
                                                    je0 k13 = xxVar2.k(i(weVar4));
                                                    je0 k14 = xxVar2.k(rfVar9.i(weVar));
                                                    je0 k15 = xxVar2.k(rfVar9.i(weVar2));
                                                    je0 k16 = xxVar2.k(rfVar9.i(weVar3));
                                                    je0 k17 = xxVar2.k(rfVar9.i(weVar4));
                                                    h7 l3 = xxVar2.l();
                                                    double d = radians;
                                                    double sin = Math.sin(d);
                                                    double d2 = e;
                                                    l3.d.g(k15, 0.5f);
                                                    l3.d.g(k17, 0.5f);
                                                    l3.d.g(k11, -0.5f);
                                                    l3.d.g(k13, -0.5f);
                                                    l3.b = -((float) (sin * d2));
                                                    xxVar2.c(l3);
                                                    h7 l4 = xxVar2.l();
                                                    float cos = (float) (Math.cos(d) * d2);
                                                    l4.d.g(k14, 0.5f);
                                                    l4.d.g(k16, 0.5f);
                                                    l4.d.g(k10, -0.5f);
                                                    l4.d.g(k12, -0.5f);
                                                    l4.b = -cos;
                                                    xxVar2.c(l4);
                                                }
                                                this.k = false;
                                                this.l = false;
                                            }
                                        }
                                        je0Var8 = je0Var7;
                                        je0Var9 = je0Var6;
                                        je0Var10 = je0Var5;
                                        i10 = 0;
                                        i11 = 8;
                                        i12 = 1;
                                        i13 = 1;
                                        if (this.p == 2) {
                                        }
                                        if (i13 != 0) {
                                        }
                                        je0Var11 = je0Var8;
                                        je0Var12 = je0Var9;
                                        if (z11) {
                                        }
                                        if (xeVar7.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                    xeVar6 = xeVar4;
                                    je0Var3 = k;
                                    qfVar4 = qfVar9;
                                    je0Var4 = k2;
                                    qfVar5 = qfVar3;
                                    xeVar7 = xeVar5;
                                    z14 = z9;
                                    iArr2 = iArr;
                                    z15 = z6;
                                    z16 = z21;
                                    je0Var7 = k3;
                                    xeVar8 = xeVar13;
                                    je0Var6 = je0Var;
                                    je0Var5 = je0Var2;
                                    i9 = i5;
                                    zArr3 = zArr2;
                                    if (z) {
                                        mjVar = rl0Var.h;
                                        if (mjVar.j) {
                                            int i302 = mjVar.g;
                                            je0Var8 = je0Var7;
                                            xxVar2.d(je0Var8, i302);
                                            je0Var9 = je0Var6;
                                            xxVar2.d(je0Var9, this.e.i.g);
                                            je0Var10 = je0Var5;
                                            xxVar2.d(je0Var10, this.e.k.g);
                                            rfVar3 = this.U;
                                            if (rfVar3 == null) {
                                            }
                                            i10 = 0;
                                            i11 = 8;
                                            i12 = 1;
                                            i13 = i10;
                                            if (this.p == 2) {
                                            }
                                            if (i13 != 0) {
                                            }
                                            je0Var11 = je0Var8;
                                            je0Var12 = je0Var9;
                                            if (z11) {
                                            }
                                            if (xeVar7.h()) {
                                            }
                                            this.k = false;
                                            this.l = false;
                                        }
                                    }
                                    je0Var8 = je0Var7;
                                    je0Var9 = je0Var6;
                                    je0Var10 = je0Var5;
                                    i10 = 0;
                                    i11 = 8;
                                    i12 = 1;
                                    i13 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    je0Var11 = je0Var8;
                                    je0Var12 = je0Var9;
                                    if (z11) {
                                    }
                                    if (xeVar7.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                            }
                            z12 = false;
                            if (z11) {
                            }
                            qfVar = qfVarArr2[0];
                            qfVar2 = qf.WRAP_CONTENT;
                            if (qfVar == qfVar2) {
                            }
                            qfVar3 = qfVar2;
                            z13 = false;
                            if (z13) {
                            }
                            xeVar5 = this.P;
                            boolean z252 = !xeVar5.h();
                            boolean z262 = zArr4[0];
                            boolean z272 = zArr4[1];
                            i8 = this.o;
                            iArr = this.C;
                            if (i8 == 2) {
                            }
                            xeVar6 = xeVar4;
                            je0Var3 = k;
                            qfVar4 = qfVar9;
                            je0Var4 = k2;
                            qfVar5 = qfVar3;
                            xeVar7 = xeVar5;
                            z14 = z9;
                            iArr2 = iArr;
                            z15 = z6;
                            z16 = z21;
                            je0Var7 = k3;
                            xeVar8 = xeVar13;
                            je0Var6 = je0Var;
                            je0Var5 = je0Var2;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            je0Var8 = je0Var7;
                            je0Var9 = je0Var6;
                            je0Var10 = je0Var5;
                            i10 = 0;
                            i11 = 8;
                            i12 = 1;
                            i13 = 1;
                            if (this.p == 2) {
                            }
                            if (i13 != 0) {
                            }
                            je0Var11 = je0Var8;
                            je0Var12 = je0Var9;
                            if (z11) {
                            }
                            if (xeVar7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        je0Var2 = k5;
                    }
                    if (qfVar8 == qfVar9 && i5 == 3) {
                        this.A = 0;
                        i3 = (int) (i18 * f);
                        xeVar4 = xeVar;
                        i4 = i20;
                        if (qfVar10 != qfVar9) {
                            i5 = 4;
                            z11 = false;
                            i6 = i24;
                            int[] iArr32 = this.t;
                            iArr32[0] = i5;
                            iArr32[1] = i6;
                            if (z11) {
                            }
                            z12 = false;
                            if (z11) {
                            }
                            qfVar = qfVarArr2[0];
                            qfVar2 = qf.WRAP_CONTENT;
                            if (qfVar == qfVar2) {
                            }
                            qfVar3 = qfVar2;
                            z13 = false;
                            if (z13) {
                            }
                            xeVar5 = this.P;
                            boolean z2522 = !xeVar5.h();
                            boolean z2622 = zArr4[0];
                            boolean z2722 = zArr4[1];
                            i8 = this.o;
                            iArr = this.C;
                            if (i8 == 2) {
                            }
                            xeVar6 = xeVar4;
                            je0Var3 = k;
                            qfVar4 = qfVar9;
                            je0Var4 = k2;
                            qfVar5 = qfVar3;
                            xeVar7 = xeVar5;
                            z14 = z9;
                            iArr2 = iArr;
                            z15 = z6;
                            z16 = z21;
                            je0Var7 = k3;
                            xeVar8 = xeVar13;
                            je0Var6 = je0Var;
                            je0Var5 = je0Var2;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            je0Var8 = je0Var7;
                            je0Var9 = je0Var6;
                            je0Var10 = je0Var5;
                            i10 = 0;
                            i11 = 8;
                            i12 = 1;
                            i13 = 1;
                            if (this.p == 2) {
                            }
                            if (i13 != 0) {
                            }
                            je0Var11 = je0Var8;
                            je0Var12 = je0Var9;
                            if (z11) {
                            }
                            if (xeVar7.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else {
                        if (qfVar10 == qfVar9 && i24 == 3) {
                            this.A = 1;
                            if (i21 == -1) {
                                this.B = 1.0f / f;
                            }
                            i4 = (int) (this.B * i2);
                            if (qfVar8 != qfVar9) {
                                xeVar4 = xeVar;
                                i6 = 4;
                                z11 = false;
                                int[] iArr322 = this.t;
                                iArr322[0] = i5;
                                iArr322[1] = i6;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                qfVar = qfVarArr2[0];
                                qfVar2 = qf.WRAP_CONTENT;
                                if (qfVar == qfVar2) {
                                }
                                qfVar3 = qfVar2;
                                z13 = false;
                                if (z13) {
                                }
                                xeVar5 = this.P;
                                boolean z25222 = !xeVar5.h();
                                boolean z26222 = zArr4[0];
                                boolean z27222 = zArr4[1];
                                i8 = this.o;
                                iArr = this.C;
                                if (i8 == 2) {
                                }
                                xeVar6 = xeVar4;
                                je0Var3 = k;
                                qfVar4 = qfVar9;
                                je0Var4 = k2;
                                qfVar5 = qfVar3;
                                xeVar7 = xeVar5;
                                z14 = z9;
                                iArr2 = iArr;
                                z15 = z6;
                                z16 = z21;
                                je0Var7 = k3;
                                xeVar8 = xeVar13;
                                je0Var6 = je0Var;
                                je0Var5 = je0Var2;
                                i9 = i5;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                je0Var8 = je0Var7;
                                je0Var9 = je0Var6;
                                je0Var10 = je0Var5;
                                i10 = 0;
                                i11 = 8;
                                i12 = 1;
                                i13 = 1;
                                if (this.p == 2) {
                                }
                                if (i13 != 0) {
                                }
                                je0Var11 = je0Var8;
                                je0Var12 = je0Var9;
                                if (z11) {
                                }
                                if (xeVar7.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                            xeVar4 = xeVar;
                        }
                        xeVar4 = xeVar;
                        i4 = i20;
                    }
                    z11 = true;
                    i6 = i24;
                    int[] iArr3222 = this.t;
                    iArr3222[0] = i5;
                    iArr3222[1] = i6;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    qfVar = qfVarArr2[0];
                    qfVar2 = qf.WRAP_CONTENT;
                    if (qfVar == qfVar2) {
                    }
                    qfVar3 = qfVar2;
                    z13 = false;
                    if (z13) {
                    }
                    xeVar5 = this.P;
                    boolean z252222 = !xeVar5.h();
                    boolean z262222 = zArr4[0];
                    boolean z272222 = zArr4[1];
                    i8 = this.o;
                    iArr = this.C;
                    if (i8 == 2) {
                    }
                    xeVar6 = xeVar4;
                    je0Var3 = k;
                    qfVar4 = qfVar9;
                    je0Var4 = k2;
                    qfVar5 = qfVar3;
                    xeVar7 = xeVar5;
                    z14 = z9;
                    iArr2 = iArr;
                    z15 = z6;
                    z16 = z21;
                    je0Var7 = k3;
                    xeVar8 = xeVar13;
                    je0Var6 = je0Var;
                    je0Var5 = je0Var2;
                    i9 = i5;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    je0Var8 = je0Var7;
                    je0Var9 = je0Var6;
                    je0Var10 = je0Var5;
                    i10 = 0;
                    i11 = 8;
                    i12 = 1;
                    i13 = 1;
                    if (this.p == 2) {
                    }
                    if (i13 != 0) {
                    }
                    je0Var11 = je0Var8;
                    je0Var12 = je0Var9;
                    if (z11) {
                    }
                    if (xeVar7.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                je0Var = k4;
            }
            je0Var2 = k5;
            xeVar4 = xeVar;
            i4 = i20;
            i5 = i22;
            i6 = i23;
            z11 = false;
            int[] iArr32222 = this.t;
            iArr32222[0] = i5;
            iArr32222[1] = i6;
            if (z11) {
            }
            z12 = false;
            if (z11) {
            }
            qfVar = qfVarArr2[0];
            qfVar2 = qf.WRAP_CONTENT;
            if (qfVar == qfVar2) {
            }
            qfVar3 = qfVar2;
            z13 = false;
            if (z13) {
            }
            xeVar5 = this.P;
            boolean z2522222 = !xeVar5.h();
            boolean z2622222 = zArr4[0];
            boolean z2722222 = zArr4[1];
            i8 = this.o;
            iArr = this.C;
            if (i8 == 2) {
            }
            xeVar6 = xeVar4;
            je0Var3 = k;
            qfVar4 = qfVar9;
            je0Var4 = k2;
            qfVar5 = qfVar3;
            xeVar7 = xeVar5;
            z14 = z9;
            iArr2 = iArr;
            z15 = z6;
            z16 = z21;
            je0Var7 = k3;
            xeVar8 = xeVar13;
            je0Var6 = je0Var;
            je0Var5 = je0Var2;
            i9 = i5;
            zArr3 = zArr2;
            if (z) {
            }
            je0Var8 = je0Var7;
            je0Var9 = je0Var6;
            je0Var10 = je0Var5;
            i10 = 0;
            i11 = 8;
            i12 = 1;
            i13 = 1;
            if (this.p == 2) {
            }
            if (i13 != 0) {
            }
            je0Var11 = je0Var8;
            je0Var12 = je0Var9;
            if (z11) {
            }
            if (xeVar7.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = true;
        z3 = false;
        z5 = z3 ? 1 : 0;
        z4 = z5;
        r17 = z3;
        r19 = z2;
        i = this.h0;
        boolean[] zArr42 = this.S;
        boolean z192 = z5;
        if (i != 8) {
        }
        z7 = this.k;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z202 = r17;
            this.k = z202;
            this.l = z202;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        xeVar = xeVar14;
        zArr2 = zArr;
        if (this.U == null) {
        }
        i2 = this.V;
        i3 = this.c0;
        if (i2 >= i3) {
        }
        int i182 = this.W;
        xe xeVar152 = xeVar3;
        int i192 = this.d0;
        if (i182 >= i192) {
        }
        qf[] qfVarArr22 = this.T;
        qf qfVar82 = qfVarArr22[0];
        boolean z212 = z8;
        qf qfVar92 = qf.MATCH_CONSTRAINT;
        if (qfVar82 == qfVar92) {
        }
        qf qfVar102 = qfVarArr22[1];
        if (qfVar102 == qfVar92) {
        }
        int i212 = this.Y;
        this.A = i212;
        f = this.X;
        this.B = f;
        int i222 = this.r;
        int i232 = this.s;
        if (f <= 0.0f) {
        }
        je0Var2 = k5;
        xeVar4 = xeVar;
        i4 = i20;
        i5 = i222;
        i6 = i232;
        z11 = false;
        int[] iArr322222 = this.t;
        iArr322222[0] = i5;
        iArr322222[1] = i6;
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        qfVar = qfVarArr22[0];
        qfVar2 = qf.WRAP_CONTENT;
        if (qfVar == qfVar2) {
        }
        qfVar3 = qfVar2;
        z13 = false;
        if (z13) {
        }
        xeVar5 = this.P;
        boolean z25222222 = !xeVar5.h();
        boolean z26222222 = zArr42[0];
        boolean z27222222 = zArr42[1];
        i8 = this.o;
        iArr = this.C;
        if (i8 == 2) {
        }
        xeVar6 = xeVar4;
        je0Var3 = k;
        qfVar4 = qfVar92;
        je0Var4 = k2;
        qfVar5 = qfVar3;
        xeVar7 = xeVar5;
        z14 = z9;
        iArr2 = iArr;
        z15 = z6;
        z16 = z212;
        je0Var7 = k3;
        xeVar8 = xeVar13;
        je0Var6 = je0Var;
        je0Var5 = je0Var2;
        i9 = i5;
        zArr3 = zArr2;
        if (z) {
        }
        je0Var8 = je0Var7;
        je0Var9 = je0Var6;
        je0Var10 = je0Var5;
        i10 = 0;
        i11 = 8;
        i12 = 1;
        i13 = 1;
        if (this.p == 2) {
        }
        if (i13 != 0) {
        }
        je0Var11 = je0Var8;
        je0Var12 = je0Var9;
        if (z11) {
        }
        if (xeVar7.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.h0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(xx xxVar, boolean z, boolean z2, boolean z3, boolean z4, je0 je0Var, je0 je0Var2, qf qfVar, boolean z5, xe xeVar, xe xeVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        je0 k;
        je0 k2;
        xe xeVar3;
        je0 je0Var3;
        boolean z14;
        int i12;
        je0 je0Var4;
        je0 je0Var5;
        je0 je0Var6;
        je0 je0Var7;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        rf rfVar;
        int i16;
        int i17;
        xe xeVar4;
        boolean z19;
        int i18;
        boolean z20;
        int i19;
        int i20;
        HashSet hashSet;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        xx xxVar2 = xxVar;
        int i28 = i7;
        int i29 = i8;
        je0 k3 = xxVar2.k(xeVar);
        je0 k4 = xxVar2.k(xeVar2);
        je0 k5 = xxVar2.k(xeVar.f);
        je0 k6 = xxVar2.k(xeVar2.f);
        boolean h = xeVar.h();
        boolean h2 = xeVar2.h();
        boolean h3 = this.P.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i5;
        int ordinal = qfVar.ordinal();
        boolean z24 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 != -1 && z) {
            this.h = -1;
            i2 = i33;
            z24 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            i34 = i2;
        } else {
            this.i = -1;
            z24 = false;
        }
        int i35 = i34;
        if (this.h0 == 8) {
            z24 = false;
            i9 = 0;
        } else {
            i9 = i35;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                xxVar2.d(k3, i);
            } else if (h && !h2) {
                z12 = z24;
                i10 = 8;
                xxVar2.e(k3, k5, xeVar.e(), 8);
            }
            z12 = z24;
            i10 = 8;
        } else {
            z12 = z24;
            i10 = 8;
        }
        if (z12) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i29 == -2) {
                    i29 = i9;
                }
                if (i9 > 0 && i32 != 1) {
                    i9 = 0;
                }
                if (i28 > 0) {
                    xxVar2.f(k4, k3, i28, 8);
                    i9 = Math.max(i9, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        xxVar2.g(k4, k3, i29, 8);
                    }
                    i9 = Math.min(i9, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        xxVar2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        xxVar2.e(k4, k3, i9, 5);
                        xxVar2.g(k4, k3, i9, 8);
                    } else {
                        xxVar2.e(k4, k3, i9, 5);
                        xxVar2.g(k4, k3, i9, 8);
                    }
                } else if (i32 == 2) {
                    we weVar = xeVar.e;
                    we weVar2 = we.TOP;
                    if (weVar == weVar2 || weVar == we.BOTTOM) {
                        k = xxVar2.k(this.U.i(weVar2));
                        k2 = xxVar2.k(this.U.i(we.BOTTOM));
                    } else {
                        k = xxVar2.k(this.U.i(we.LEFT));
                        k2 = xxVar2.k(this.U.i(we.RIGHT));
                    }
                    h7 l = xxVar2.l();
                    int i36 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    xxVar2.c(l);
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                    i11 = i36;
                } else {
                    i11 = i28;
                    z13 = true;
                }
            } else {
                int max = Math.max(i28, i9);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                xxVar2.e(k4, k3, max, 8);
                z13 = z4;
                i11 = i28;
                z12 = false;
            }
            if (z11 || z8) {
                boolean z25 = z13;
                if (i31 >= 2 && z2 && z25) {
                    xxVar2.f(k3, je0Var, 0, 8);
                    xe xeVar5 = this.M;
                    boolean z26 = z || xeVar5.f == null;
                    if (!z && (xeVar3 = xeVar5.f) != null) {
                        rf rfVar2 = xeVar3.d;
                        if (rfVar2.X != 0.0f) {
                            qf[] qfVarArr = rfVar2.T;
                            qf qfVar2 = qfVarArr[0];
                            qf qfVar3 = qf.MATCH_CONSTRAINT;
                            if (qfVar2 == qfVar3 && qfVarArr[1] == qfVar3) {
                                z26 = true;
                            }
                        }
                        z26 = false;
                    }
                    if (z26) {
                        xxVar2.f(je0Var2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                xeVar4 = xeVar2;
                je0Var6 = k4;
                z14 = z13;
                je0Var3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    je0Var3 = k6;
                    if (h && h2) {
                        rf rfVar3 = xeVar.f.d;
                        rf rfVar4 = xeVar2.f.d;
                        z14 = z13;
                        rf rfVar5 = this.U;
                        int i37 = 6;
                        if (z12) {
                            if (i32 == 0) {
                                if (i29 != 0 || i11 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z22 = true;
                                    z23 = false;
                                    z16 = true;
                                } else if (k5.k && je0Var3.k) {
                                    xxVar2.e(k3, k5, xeVar.e(), 8);
                                    xxVar2.e(k4, je0Var3, -xeVar2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z22 = false;
                                    z23 = true;
                                    z16 = false;
                                }
                                if ((rfVar3 instanceof e8) || (rfVar4 instanceof e8)) {
                                    i14 = i25;
                                    je0Var7 = k5;
                                    xxVar2 = xxVar;
                                    i12 = i32;
                                    je0Var5 = k3;
                                    je0Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    je0Var4 = je0Var2;
                                    z15 = z22;
                                    i15 = 4;
                                    if (z16 || je0Var7 != je0Var3 || rfVar3 == rfVar5) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        rfVar = rfVar4;
                                        i16 = i11;
                                        i17 = i12;
                                        xeVar4 = xeVar2;
                                        z19 = z2;
                                    } else {
                                        if (z12 || z7 || z9 || je0Var7 != je0Var || je0Var3 != je0Var4) {
                                            z19 = z2;
                                            z21 = z18;
                                            i21 = i14;
                                            i22 = i13;
                                        } else {
                                            i22 = 8;
                                            z19 = false;
                                            i21 = 8;
                                            z21 = false;
                                        }
                                        je0 je0Var8 = je0Var7;
                                        i16 = i11;
                                        i17 = i12;
                                        rfVar = rfVar4;
                                        xeVar4 = xeVar2;
                                        xxVar2.b(je0Var5, je0Var8, xeVar.e(), f, je0Var3, je0Var6, xeVar2.e(), i22);
                                        je0Var7 = je0Var8;
                                        i14 = i21;
                                        z18 = z21;
                                    }
                                    if (this.h0 != 8 && ((hashSet = xeVar4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z16) {
                                        if (z19 && je0Var7 != je0Var3 && !z12 && ((rfVar3 instanceof e8) || (rfVar instanceof e8))) {
                                            i14 = 6;
                                        }
                                        xxVar2.f(je0Var5, je0Var7, xeVar.e(), i14);
                                        xxVar2.g(je0Var6, je0Var3, -xeVar4.e(), i14);
                                    }
                                    if (z19 || !z10 || (rfVar3 instanceof e8) || (rfVar instanceof e8) || rfVar == rfVar5) {
                                        i18 = i15;
                                        z20 = z18;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z17 && (!z9 || z3)) {
                                            if (rfVar3 != rfVar5 && rfVar != rfVar5) {
                                                i37 = i18;
                                            }
                                            if ((rfVar3 instanceof os) || (rfVar instanceof os)) {
                                                i37 = 5;
                                            }
                                            if ((rfVar3 instanceof e8) || (rfVar instanceof e8)) {
                                                i37 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i37, i18);
                                        }
                                        if (z19) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (rfVar3 == rfVar5 || rfVar == rfVar5)) {
                                                i20 = 4;
                                                xxVar2.e(je0Var5, je0Var7, xeVar.e(), i20);
                                                xxVar2.e(je0Var6, je0Var3, -xeVar4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        xxVar2.e(je0Var5, je0Var7, xeVar.e(), i20);
                                        xxVar2.e(je0Var6, je0Var3, -xeVar4.e(), i20);
                                    }
                                    if (z19) {
                                        int e = je0Var == je0Var7 ? xeVar.e() : 0;
                                        if (je0Var7 != je0Var) {
                                            xxVar2.f(je0Var5, je0Var, e, 5);
                                        }
                                    }
                                    if (z19 && z12 && i3 == 0 && i16 == 0) {
                                        if (z12 || i17 != 3) {
                                            i19 = 5;
                                            xxVar2.f(je0Var6, je0Var5, 0, 5);
                                        } else {
                                            xxVar2.f(je0Var6, je0Var5, 0, 8);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    i14 = i25;
                                    je0Var7 = k5;
                                    xxVar2 = xxVar;
                                    je0Var5 = k3;
                                    je0Var6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z15 = z22;
                                    i15 = i26;
                                    i12 = i32;
                                    je0Var4 = je0Var2;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                        if (z12) {
                                        }
                                        i19 = 5;
                                        xxVar2.f(je0Var6, je0Var5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((rfVar3 instanceof e8) || (rfVar4 instanceof e8)) {
                                        xxVar2 = xxVar;
                                        i12 = i32;
                                        je0Var5 = k3;
                                        je0Var6 = k4;
                                        je0Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        xxVar2 = xxVar;
                                        i12 = i32;
                                        je0Var5 = k3;
                                        je0Var6 = k4;
                                        je0Var7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z15 = true;
                                        z16 = true;
                                        z17 = false;
                                        je0Var4 = je0Var2;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i32 == 1) {
                                    xxVar2 = xxVar;
                                    i12 = i32;
                                    je0Var5 = k3;
                                    je0Var6 = k4;
                                    je0Var7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i32 == 3) {
                                    i12 = i32;
                                    if (this.A == -1) {
                                        if (z9) {
                                            xxVar2 = xxVar;
                                            je0Var4 = je0Var2;
                                            je0Var5 = k3;
                                            je0Var6 = k4;
                                            je0Var7 = k5;
                                            i13 = z2 ? 5 : 4;
                                        } else {
                                            xxVar2 = xxVar;
                                            je0Var4 = je0Var2;
                                            je0Var5 = k3;
                                            je0Var6 = k4;
                                            je0Var7 = k5;
                                            i13 = 8;
                                        }
                                        i14 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i15 = i24;
                                            je0Var5 = k3;
                                            je0Var6 = k4;
                                            je0Var7 = k5;
                                            i13 = 6;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            je0Var4 = je0Var2;
                                        } else if (i29 > 0) {
                                            xxVar2 = xxVar;
                                            je0Var4 = je0Var2;
                                            je0Var5 = k3;
                                            je0Var6 = k4;
                                            je0Var7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i29 != 0 || i11 != 0) {
                                                xxVar2 = xxVar;
                                                je0Var4 = je0Var2;
                                                je0Var5 = k3;
                                                je0Var6 = k4;
                                                je0Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i23 = (rfVar3 == rfVar5 || rfVar4 == rfVar5) ? 5 : 4;
                                                je0Var4 = je0Var2;
                                                je0Var5 = k3;
                                                je0Var6 = k4;
                                                je0Var7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else {
                                                xxVar2 = xxVar;
                                                je0Var4 = je0Var2;
                                                je0Var5 = k3;
                                                je0Var6 = k4;
                                                je0Var7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            if (z16) {
                                            }
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.h0 != 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z19) {
                                            }
                                            i18 = i15;
                                            z20 = z18;
                                            if (z20) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i23;
                                        xxVar2 = xxVar;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.h0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                    i15 = 5;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.h0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i32;
                                    xxVar2 = xxVar;
                                    je0Var4 = je0Var2;
                                    je0Var5 = k3;
                                    je0Var6 = k4;
                                    je0Var7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z15 = false;
                                    z16 = false;
                                }
                                i15 = 4;
                                z15 = true;
                                z16 = true;
                                z17 = false;
                                je0Var4 = je0Var2;
                                if (z16) {
                                }
                                z18 = true;
                                if (z15) {
                                }
                                if (this.h0 != 8) {
                                }
                                if (z16) {
                                }
                                if (z19) {
                                }
                                i18 = i15;
                                z20 = z18;
                                if (z20) {
                                }
                                if (z19) {
                                }
                                if (z19) {
                                }
                                i19 = 5;
                            }
                            i27 = i19;
                            if (z19 && z14) {
                                int e2 = xeVar4.f != null ? xeVar4.e() : 0;
                                if (je0Var3 != je0Var2) {
                                    xxVar2.f(je0Var2, je0Var6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i32;
                        if (k5.k && je0Var3.k) {
                            xxVar.b(k3, k5, xeVar.e(), f, je0Var3, k4, xeVar2.e(), 8);
                            if (z2 && z14) {
                                int e3 = xeVar2.f != null ? xeVar2.e() : 0;
                                if (je0Var3 != je0Var2) {
                                    xxVar.f(je0Var2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        xxVar2 = xxVar;
                        je0Var4 = je0Var2;
                        je0Var5 = k3;
                        je0Var6 = k4;
                        je0Var7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z15 = true;
                        z16 = true;
                        z17 = false;
                        if (z16) {
                        }
                        z18 = true;
                        if (z15) {
                        }
                        if (this.h0 != 8) {
                        }
                        if (z16) {
                        }
                        if (z19) {
                        }
                        i18 = i15;
                        z20 = z18;
                        if (z20) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                        i19 = 5;
                        i27 = i19;
                        if (z19) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    je0Var3 = k6;
                    xxVar2.e(k4, je0Var3, -xeVar2.e(), 8);
                    if (z2) {
                        xxVar2.f(k3, je0Var, 0, 5);
                        xeVar4 = xeVar2;
                        i19 = 5;
                        je0Var6 = k4;
                        z14 = z13;
                        z19 = z2;
                        i27 = i19;
                        if (z19) {
                        }
                    }
                }
                xeVar4 = xeVar2;
                je0Var6 = k4;
                z14 = z13;
            } else {
                xeVar4 = xeVar2;
                je0Var6 = k4;
                z14 = z13;
                je0Var3 = k6;
                z19 = z2;
                i27 = (z2 && (xeVar.f.d instanceof e8)) ? 8 : 5;
                if (z19) {
                }
            }
            i19 = 5;
            z19 = z2;
            i27 = i19;
            if (z19) {
            }
        } else if (z5) {
            xxVar2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                xxVar2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                xxVar2.g(k4, k3, i4, i10);
            }
        } else {
            xxVar2.e(k4, k3, i9, i10);
        }
        z13 = z4;
        i11 = i28;
        if (z11) {
        }
        boolean z252 = z13;
        if (i31 >= 2) {
        }
    }

    public final void e(we weVar, rf rfVar, we weVar2, int i) {
        we weVar3;
        we weVar4;
        boolean z;
        we weVar5 = we.CENTER;
        if (weVar == weVar5) {
            if (weVar2 != weVar5) {
                we weVar6 = we.LEFT;
                if (weVar2 == weVar6 || weVar2 == we.RIGHT) {
                    e(weVar6, rfVar, weVar2, 0);
                    e(we.RIGHT, rfVar, weVar2, 0);
                    i(weVar5).a(rfVar.i(weVar2), 0);
                    return;
                }
                we weVar7 = we.TOP;
                if (weVar2 == weVar7 || weVar2 == we.BOTTOM) {
                    e(weVar7, rfVar, weVar2, 0);
                    e(we.BOTTOM, rfVar, weVar2, 0);
                    i(weVar5).a(rfVar.i(weVar2), 0);
                    return;
                }
                return;
            }
            we weVar8 = we.LEFT;
            xe i2 = i(weVar8);
            we weVar9 = we.RIGHT;
            xe i3 = i(weVar9);
            we weVar10 = we.TOP;
            xe i4 = i(weVar10);
            we weVar11 = we.BOTTOM;
            xe i5 = i(weVar11);
            boolean z2 = true;
            if ((i2 == null || !i2.h()) && (i3 == null || !i3.h())) {
                e(weVar8, rfVar, weVar8, 0);
                e(weVar9, rfVar, weVar9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(weVar10, rfVar, weVar10, 0);
                e(weVar11, rfVar, weVar11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(weVar5).a(rfVar.i(weVar5), 0);
                return;
            }
            if (z) {
                we weVar12 = we.CENTER_X;
                i(weVar12).a(rfVar.i(weVar12), 0);
                return;
            } else {
                if (z2) {
                    we weVar13 = we.CENTER_Y;
                    i(weVar13).a(rfVar.i(weVar13), 0);
                    return;
                }
                return;
            }
        }
        we weVar14 = we.CENTER_X;
        if (weVar == weVar14 && (weVar2 == (weVar4 = we.LEFT) || weVar2 == we.RIGHT)) {
            xe i6 = i(weVar4);
            xe i7 = rfVar.i(weVar2);
            xe i8 = i(we.RIGHT);
            i6.a(i7, 0);
            i8.a(i7, 0);
            i(weVar14).a(i7, 0);
            return;
        }
        we weVar15 = we.CENTER_Y;
        if (weVar == weVar15 && (weVar2 == (weVar3 = we.TOP) || weVar2 == we.BOTTOM)) {
            xe i9 = rfVar.i(weVar2);
            i(weVar3).a(i9, 0);
            i(we.BOTTOM).a(i9, 0);
            i(weVar15).a(i9, 0);
            return;
        }
        if (weVar == weVar14 && weVar2 == weVar14) {
            we weVar16 = we.LEFT;
            i(weVar16).a(rfVar.i(weVar16), 0);
            we weVar17 = we.RIGHT;
            i(weVar17).a(rfVar.i(weVar17), 0);
            i(weVar14).a(rfVar.i(weVar2), 0);
            return;
        }
        if (weVar == weVar15 && weVar2 == weVar15) {
            we weVar18 = we.TOP;
            i(weVar18).a(rfVar.i(weVar18), 0);
            we weVar19 = we.BOTTOM;
            i(weVar19).a(rfVar.i(weVar19), 0);
            i(weVar15).a(rfVar.i(weVar2), 0);
            return;
        }
        xe i10 = i(weVar);
        xe i11 = rfVar.i(weVar2);
        if (i10.i(i11)) {
            we weVar20 = we.BASELINE;
            if (weVar == weVar20) {
                xe i12 = i(we.TOP);
                xe i13 = i(we.BOTTOM);
                if (i12 != null) {
                    i12.j();
                }
                if (i13 != null) {
                    i13.j();
                }
            } else if (weVar == we.TOP || weVar == we.BOTTOM) {
                xe i14 = i(weVar20);
                if (i14 != null) {
                    i14.j();
                }
                xe i15 = i(weVar5);
                if (i15.f != i11) {
                    i15.j();
                }
                xe f = i(weVar).f();
                xe i16 = i(weVar15);
                if (i16.h()) {
                    f.j();
                    i16.j();
                }
            } else if (weVar == we.LEFT || weVar == we.RIGHT) {
                xe i17 = i(weVar5);
                if (i17.f != i11) {
                    i17.j();
                }
                xe f2 = i(weVar).f();
                xe i18 = i(weVar14);
                if (i18.h()) {
                    f2.j();
                    i18.j();
                }
            }
            i10.a(i11, i);
        }
    }

    public final void f(xe xeVar, xe xeVar2, int i) {
        if (xeVar.d == this) {
            e(xeVar.e, xeVar2.d, xeVar2.e, i);
        }
    }

    public final void g(xx xxVar) {
        xxVar.k(this.I);
        xxVar.k(this.J);
        xxVar.k(this.K);
        xxVar.k(this.L);
        if (this.b0 > 0) {
            xxVar.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            jt jtVar = new jt(this);
            jtVar.h.e = lj.LEFT;
            jtVar.i.e = lj.RIGHT;
            jtVar.f = 0;
            this.d = jtVar;
        }
        if (this.e == null) {
            rl0 rl0Var = new rl0(this);
            mj mjVar = new mj(rl0Var);
            rl0Var.k = mjVar;
            rl0Var.l = null;
            rl0Var.h.e = lj.TOP;
            rl0Var.i.e = lj.BOTTOM;
            mjVar.e = lj.BASELINE;
            rl0Var.f = 1;
            this.e = rl0Var;
        }
    }

    public xe i(we weVar) {
        switch (pf.a[weVar.ordinal()]) {
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            case 9:
                return null;
            default:
                throw new AssertionError(weVar.name());
        }
    }

    public final qf j(int i) {
        qf[] qfVarArr = this.T;
        if (i == 0) {
            return qfVarArr[0];
        }
        if (i == 1) {
            return qfVarArr[1];
        }
        return null;
    }

    public final int k() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final rf l(int i) {
        xe xeVar;
        xe xeVar2;
        if (i != 0) {
            if (i == 1 && (xeVar2 = (xeVar = this.L).f) != null && xeVar2.f == xeVar) {
                return xeVar2.d;
            }
            return null;
        }
        xe xeVar3 = this.K;
        xe xeVar4 = xeVar3.f;
        if (xeVar4 == null || xeVar4.f != xeVar3) {
            return null;
        }
        return xeVar4.d;
    }

    public final rf m(int i) {
        xe xeVar;
        xe xeVar2;
        if (i != 0) {
            if (i == 1 && (xeVar2 = (xeVar = this.J).f) != null && xeVar2.f == xeVar) {
                return xeVar2.d;
            }
            return null;
        }
        xe xeVar3 = this.I;
        xe xeVar4 = xeVar3.f;
        if (xeVar4 == null || xeVar4.f != xeVar3) {
            return null;
        }
        return xeVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.V);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.W);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Z);
        sb.append("\n");
        sb.append("    actualTop:" + this.a0);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.V;
        int i2 = this.c0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        qf[] qfVarArr = this.T;
        qf qfVar = qfVarArr[0];
        float[] fArr = this.l0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, qfVar);
        int i6 = this.W;
        int i7 = this.d0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        qf qfVar2 = qfVarArr[1];
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3, qfVar2);
        float f5 = this.X;
        int i11 = this.Y;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.e0, 0.5f);
        H(sb, "    verticalBias", this.f0, 0.5f);
        G(this.j0, 0, "    horizontalChainStyle", sb);
        G(this.k0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.h0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final int r() {
        rf rfVar = this.U;
        return (rfVar == null || !(rfVar instanceof sf)) ? this.Z : ((sf) rfVar).x0 + this.Z;
    }

    public final int s() {
        rf rfVar = this.U;
        return (rfVar == null || !(rfVar instanceof sf)) ? this.a0 : ((sf) rfVar).y0 + this.a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.i0 != null ? r7.d(new StringBuilder("id: "), this.i0, " ") : "");
        sb.append("(");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(this.a0);
        sb.append(") - (");
        sb.append(this.V);
        sb.append(" x ");
        sb.append(this.W);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        xe xeVar;
        xe xeVar2;
        xe xeVar3;
        xe xeVar4;
        if (i == 0) {
            xe xeVar5 = this.I;
            xe xeVar6 = xeVar5.f;
            if (xeVar6 == null || !xeVar6.c || (xeVar4 = (xeVar3 = this.K).f) == null || !xeVar4.c) {
                return false;
            }
            return (xeVar4.d() - xeVar3.e()) - (xeVar5.e() + xeVar5.f.d()) >= i2;
        }
        xe xeVar7 = this.J;
        xe xeVar8 = xeVar7.f;
        if (xeVar8 == null || !xeVar8.c || (xeVar2 = (xeVar = this.L).f) == null || !xeVar2.c) {
            return false;
        }
        return (xeVar2.d() - xeVar.e()) - (xeVar7.e() + xeVar7.f.d()) >= i2;
    }

    public final void v(we weVar, rf rfVar, we weVar2, int i, int i2) {
        i(weVar).b(rfVar.i(weVar2), i, i2, true);
    }

    public final boolean w(int i) {
        xe xeVar;
        xe xeVar2;
        int i2 = i * 2;
        xe[] xeVarArr = this.Q;
        xe xeVar3 = xeVarArr[i2];
        xe xeVar4 = xeVar3.f;
        return (xeVar4 == null || xeVar4.f == xeVar3 || (xeVar2 = (xeVar = xeVarArr[i2 + 1]).f) == null || xeVar2.f != xeVar) ? false : true;
    }

    public final boolean x() {
        xe xeVar = this.I;
        xe xeVar2 = xeVar.f;
        if (xeVar2 != null && xeVar2.f == xeVar) {
            return true;
        }
        xe xeVar3 = this.K;
        xe xeVar4 = xeVar3.f;
        return xeVar4 != null && xeVar4.f == xeVar3;
    }

    public final boolean y() {
        xe xeVar = this.J;
        xe xeVar2 = xeVar.f;
        if (xeVar2 != null && xeVar2.f == xeVar) {
            return true;
        }
        xe xeVar3 = this.L;
        xe xeVar4 = xeVar3.f;
        return xeVar4 != null && xeVar4.f == xeVar3;
    }

    public final boolean z() {
        return this.g && this.h0 != 8;
    }
}
