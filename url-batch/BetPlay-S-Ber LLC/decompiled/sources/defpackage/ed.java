package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ed {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final pc I;
    public final pc J;
    public final pc K;
    public final pc L;
    public final pc M;
    public final pc N;
    public final pc O;
    public final pc P;
    public final pc[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public ed T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public p9 b;
    public int b0;
    public p9 c;
    public int c0;
    public float d0;
    public float e0;
    public View f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final ed[] l0;
    public boolean m;
    public final ed[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
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
    public tn d = null;
    public p80 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public ed() {
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
        pc pcVar = new pc(this, 2);
        this.I = pcVar;
        pc pcVar2 = new pc(this, 3);
        this.J = pcVar2;
        pc pcVar3 = new pc(this, 4);
        this.K = pcVar3;
        pc pcVar4 = new pc(this, 5);
        this.L = pcVar4;
        pc pcVar5 = new pc(this, 6);
        this.M = pcVar5;
        pc pcVar6 = new pc(this, 8);
        this.N = pcVar6;
        pc pcVar7 = new pc(this, 9);
        this.O = pcVar7;
        pc pcVar8 = new pc(this, 7);
        this.P = pcVar8;
        this.Q = new pc[]{pcVar, pcVar3, pcVar2, pcVar4, pcVar5, pcVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new ed[]{null, null};
        this.m0 = new ed[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(pcVar);
        arrayList.add(pcVar2);
        arrayList.add(pcVar3);
        arrayList.add(pcVar4);
        arrayList.add(pcVar6);
        arrayList.add(pcVar7);
        arrayList.add(pcVar8);
        arrayList.add(pcVar5);
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

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, int i6) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i6 == 1) {
            str2 = "FIXED";
        } else if (i6 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i6 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i6 != 4) {
                throw null;
            }
            str2 = "MATCH_PARENT";
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
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

    public static void p(StringBuilder sb, String str, pc pcVar) {
        if (pcVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(pcVar.f);
        sb.append("'");
        if (pcVar.h != Integer.MIN_VALUE || pcVar.g != 0) {
            sb.append(",");
            sb.append(pcVar.g);
            if (pcVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(pcVar.h);
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
        this.T = null;
        this.D = Float.NaN;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
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
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        ed edVar = this.T;
        if (edVar != null && (edVar instanceof fd)) {
            ((fd) edVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pc) arrayList.get(i)).j();
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
            pc pcVar = (pc) arrayList.get(i);
            pcVar.c = false;
            pcVar.b = 0;
        }
    }

    public void F(r6 r6Var) {
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
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        tn tnVar = this.d;
        boolean z3 = z & tnVar.g;
        p80 p80Var = this.e;
        boolean z4 = z2 & p80Var.g;
        int i3 = tnVar.h.g;
        int i4 = p80Var.h.g;
        int i5 = tnVar.i.g;
        int i6 = p80Var.i.g;
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
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(xq xqVar, boolean z) {
        int i;
        int i2;
        p80 p80Var;
        tn tnVar;
        xqVar.getClass();
        int n = xq.n(this.I);
        int n2 = xq.n(this.J);
        int n3 = xq.n(this.K);
        int n4 = xq.n(this.L);
        if (z && (tnVar = this.d) != null) {
            gf gfVar = tnVar.h;
            if (gfVar.j) {
                gf gfVar2 = tnVar.i;
                if (gfVar2.j) {
                    n = gfVar.g;
                    n3 = gfVar2.g;
                }
            }
        }
        if (z && (p80Var = this.e) != null) {
            gf gfVar3 = p80Var.h;
            if (gfVar3.j) {
                gf gfVar4 = p80Var.i;
                if (gfVar4.j) {
                    n2 = gfVar3.g;
                    n4 = gfVar4.g;
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
        this.Y = n;
        this.Z = n2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(fd fdVar, xq xqVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            l70.f(fdVar, xqVar, this);
            hashSet.remove(this);
            b(xqVar, fdVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((pc) it.next()).d.a(fdVar, xqVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((pc) it2.next()).d.a(fdVar, xqVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((pc) it3.next()).d.a(fdVar, xqVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((pc) it4.next()).d.a(fdVar, xqVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((pc) it5.next()).d.a(fdVar, xqVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.g0 == r14) goto L374;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [ed] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(xq xqVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r17;
        int i;
        boolean z5;
        boolean z6;
        ed edVar;
        ed edVar2;
        boolean[] zArr;
        pc pcVar;
        boolean[] zArr2;
        pc pcVar2;
        pc pcVar3;
        boolean z7;
        boolean z8;
        boolean z9;
        int i2;
        int i3;
        int[] iArr;
        float f;
        pc pcVar4;
        p30 p30Var;
        pc pcVar5;
        int i4;
        int i5;
        int i6;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        pc pcVar6;
        boolean z13;
        char c;
        boolean z14;
        int i8;
        int[] iArr2;
        pc pcVar7;
        p30 p30Var2;
        p30 p30Var3;
        pc pcVar8;
        int[] iArr3;
        p30 p30Var4;
        boolean z15;
        boolean z16;
        boolean z17;
        p30 p30Var5;
        pc pcVar9;
        p30 p30Var6;
        int i9;
        boolean[] zArr3;
        p30 p30Var7;
        p30 p30Var8;
        p30 p30Var9;
        int i10;
        int i11;
        boolean z18;
        int i12;
        p30 p30Var10;
        p30 p30Var11;
        ?? r27;
        p80 p80Var;
        gf gfVar;
        ed edVar3;
        boolean z19;
        tn tnVar;
        gf gfVar2;
        int i13;
        int i14;
        boolean x;
        int i15;
        boolean y;
        tn tnVar2;
        p80 p80Var2;
        boolean z20;
        xq xqVar2 = xqVar;
        pc pcVar10 = this.I;
        p30 k = xqVar2.k(pcVar10);
        pc pcVar11 = this.K;
        p30 k2 = xqVar2.k(pcVar11);
        pc pcVar12 = this.J;
        p30 k3 = xqVar2.k(pcVar12);
        pc pcVar13 = this.L;
        p30 k4 = xqVar2.k(pcVar13);
        pc pcVar14 = this.M;
        p30 k5 = xqVar2.k(pcVar14);
        ed edVar4 = this.T;
        if (edVar4 != null) {
            int[] iArr4 = edVar4.p0;
            r17 = 0;
            z2 = false;
            r17 = 0;
            z4 = iArr4[0] == 2;
            boolean z21 = iArr4[1] == 2;
            int i16 = this.q;
            if (i16 != 1) {
                if (i16 == 2) {
                    z4 = false;
                }
                z3 = z21;
            } else {
                z3 = false;
            }
            i = this.g0;
            boolean[] zArr4 = this.S;
            boolean z22 = z3;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z5 = z4;
                int i17 = r17;
                while (true) {
                    if (i17 < size) {
                        int i18 = size;
                        HashSet hashSet = ((pc) arrayList.get(i17)).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i17++;
                        size = i18;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z5 = z4;
            }
            z6 = this.k;
            if (!z6 || this.l) {
                if (z6) {
                    xqVar2.d(k, this.Y);
                    xqVar2.d(k2, this.Y + this.U);
                    if (z5 && (edVar2 = this.T) != null) {
                        fd fdVar = (fd) edVar2;
                        WeakReference weakReference = fdVar.H0;
                        if (weakReference == null || weakReference.get() == null || pcVar10.d() > ((pc) fdVar.H0.get()).d()) {
                            fdVar.H0 = new WeakReference(pcVar10);
                        }
                        WeakReference weakReference2 = fdVar.J0;
                        if (weakReference2 == null || weakReference2.get() == null || pcVar11.d() > ((pc) fdVar.J0.get()).d()) {
                            fdVar.J0 = new WeakReference(pcVar11);
                        }
                    }
                }
                if (this.l) {
                    xqVar2.d(k3, this.Z);
                    xqVar2.d(k4, this.Z + this.V);
                    HashSet hashSet2 = pcVar14.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        xqVar2.d(k5, this.Z + this.a0);
                    }
                    if (z22 && (edVar = this.T) != null) {
                        fd fdVar2 = (fd) edVar;
                        WeakReference weakReference3 = fdVar2.G0;
                        if (weakReference3 == null || weakReference3.get() == null || pcVar12.d() > ((pc) fdVar2.G0.get()).d()) {
                            fdVar2.G0 = new WeakReference(pcVar12);
                        }
                        WeakReference weakReference4 = fdVar2.I0;
                        if (weakReference4 == null || weakReference4.get() == null || pcVar13.d() > ((pc) fdVar2.I0.get()).d()) {
                            fdVar2.I0 = new WeakReference(pcVar13);
                        }
                    }
                }
                if (this.k && this.l) {
                    boolean z23 = r17;
                    this.k = z23;
                    this.l = z23;
                    return;
                }
            }
            zArr = this.f;
            if (z || (tnVar2 = this.d) == null || (p80Var2 = this.e) == null) {
                pcVar = pcVar14;
                zArr2 = zArr;
            } else {
                pcVar = pcVar14;
                gf gfVar3 = tnVar2.h;
                zArr2 = zArr;
                if (gfVar3.j && tnVar2.i.j && p80Var2.h.j && p80Var2.i.j) {
                    xqVar2.d(k, gfVar3.g);
                    xqVar2.d(k2, this.d.i.g);
                    xqVar2.d(k3, this.e.h.g);
                    xqVar2.d(k4, this.e.i.g);
                    xqVar2.d(k5, this.e.k.g);
                    if (this.T != null) {
                        if (z5 && zArr2[0] && !x()) {
                            xqVar2.f(xqVar2.k(this.T.K), k2, 0, 8);
                        }
                        if (z22 && zArr2[1] && !y()) {
                            z20 = false;
                            xqVar2.f(xqVar2.k(this.T.L), k4, 0, 8);
                            this.k = z20;
                            this.l = z20;
                            return;
                        }
                    }
                    z20 = false;
                    this.k = z20;
                    this.l = z20;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((fd) this.T).R(this, 0);
                    x = true;
                    i15 = 1;
                } else {
                    x = x();
                    i15 = 1;
                }
                if (w(i15)) {
                    ((fd) this.T).R(this, i15);
                    y = true;
                } else {
                    y = y();
                }
                if (!x && z5 && this.g0 != 8 && pcVar10.f == null && pcVar11.f == null) {
                    pcVar2 = pcVar10;
                    xqVar2.f(xqVar2.k(this.T.K), k2, 0, 1);
                } else {
                    pcVar2 = pcVar10;
                }
                if (!y && z22 && this.g0 != 8 && pcVar12.f == null && pcVar13.f == null && pcVar == null) {
                    xqVar2.f(xqVar2.k(this.T.L), k4, 0, 1);
                }
                pcVar3 = pcVar11;
                z7 = z22;
                z9 = y;
                z8 = x;
            } else {
                pcVar2 = pcVar10;
                pcVar3 = pcVar11;
                z7 = z22;
                z8 = false;
                z9 = false;
            }
            i2 = this.U;
            i3 = this.b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i19 = this.V;
            pc pcVar15 = pcVar3;
            int i20 = this.c0;
            int i21 = i19 >= i20 ? i20 : i19;
            iArr = this.p0;
            int i22 = iArr[0];
            boolean z24 = z7;
            boolean z25 = i22 == 3;
            int i23 = iArr[1];
            boolean z26 = i23 == 3;
            int i24 = this.X;
            this.A = i24;
            f = this.W;
            this.B = f;
            int i25 = this.r;
            int i26 = this.s;
            if (f <= 0.0f) {
                pcVar4 = pcVar13;
                if (this.g0 != 8) {
                    int i27 = (i22 == 3 && i25 == 0) ? 3 : i25;
                    if (i23 == 3 && i26 == 0) {
                        p30Var = k4;
                        i14 = 3;
                    } else {
                        p30Var = k4;
                        i14 = i26;
                    }
                    if (i22 == 3 && i23 == 3 && i27 == 3 && i14 == 3) {
                        if (i24 == -1) {
                            if (z25 && !z26) {
                                this.A = 0;
                            } else if (!z25 && z26) {
                                this.A = 1;
                                if (i24 == -1) {
                                    this.B = 1.0f / f;
                                }
                            }
                        }
                        if (this.A == 0 && (!pcVar12.h() || !pcVar4.h())) {
                            this.A = 1;
                        } else if (this.A == 1 && (!pcVar2.h() || !pcVar15.h())) {
                            this.A = 0;
                        }
                        if (this.A == -1 && (!pcVar12.h() || !pcVar4.h() || !pcVar2.h() || !pcVar15.h())) {
                            if (pcVar12.h() && pcVar4.h()) {
                                this.A = 0;
                            } else if (pcVar2.h() && pcVar15.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        if (this.A == -1) {
                            int i28 = this.u;
                            if (i28 > 0 && this.x == 0) {
                                this.A = 0;
                            } else if (i28 == 0 && this.x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i22 == 3 && i27 == 3) {
                        this.A = 0;
                        i3 = (int) (f * i19);
                        if (i23 != 3) {
                            pcVar5 = pcVar;
                            i4 = i21;
                            i5 = 4;
                            z10 = false;
                            i6 = i14;
                            int[] iArr5 = this.t;
                            iArr5[0] = i5;
                            iArr5[1] = i6;
                            if (z10) {
                            }
                            z11 = false;
                            if (z10) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z12) {
                            }
                            pcVar6 = this.P;
                            z13 = !pcVar6.h();
                            c = '\b';
                            z14 = zArr4[0];
                            boolean z27 = zArr4[1];
                            i8 = this.o;
                            iArr2 = this.C;
                            if (i8 != 2) {
                            }
                            pcVar7 = pcVar5;
                            p30Var2 = k;
                            p30Var3 = k2;
                            pcVar8 = pcVar6;
                            iArr3 = iArr2;
                            p30Var4 = k5;
                            z15 = z8;
                            z16 = z5;
                            z17 = z24;
                            p30Var5 = k3;
                            pcVar9 = pcVar4;
                            p30Var6 = p30Var;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            p30Var7 = p30Var5;
                            p30Var8 = p30Var6;
                            p30Var9 = p30Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            p30Var10 = p30Var7;
                            p30Var11 = p30Var8;
                            if (z10) {
                            }
                            if (pcVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                    } else if (i23 == 3 && i14 == 3) {
                        this.A = 1;
                        if (i24 == -1) {
                            this.B = 1.0f / f;
                        }
                        i4 = (int) (this.B * i2);
                        if (i22 == 3) {
                            i5 = i27;
                            pcVar5 = pcVar;
                            z10 = true;
                            i6 = i14;
                            int[] iArr52 = this.t;
                            iArr52[0] = i5;
                            iArr52[1] = i6;
                            if (z10) {
                            }
                            z11 = false;
                            if (z10) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z12) {
                            }
                            pcVar6 = this.P;
                            z13 = !pcVar6.h();
                            c = '\b';
                            z14 = zArr4[0];
                            boolean z272 = zArr4[1];
                            i8 = this.o;
                            iArr2 = this.C;
                            if (i8 != 2) {
                            }
                            pcVar7 = pcVar5;
                            p30Var2 = k;
                            p30Var3 = k2;
                            pcVar8 = pcVar6;
                            iArr3 = iArr2;
                            p30Var4 = k5;
                            z15 = z8;
                            z16 = z5;
                            z17 = z24;
                            p30Var5 = k3;
                            pcVar9 = pcVar4;
                            p30Var6 = p30Var;
                            i9 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            p30Var7 = p30Var5;
                            p30Var8 = p30Var6;
                            p30Var9 = p30Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            p30Var10 = p30Var7;
                            p30Var11 = p30Var8;
                            if (z10) {
                            }
                            if (pcVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i5 = i27;
                        pcVar5 = pcVar;
                        i6 = 4;
                        z10 = false;
                        int[] iArr522 = this.t;
                        iArr522[0] = i5;
                        iArr522[1] = i6;
                        if (z10) {
                            i7 = -1;
                        } else {
                            int i29 = this.A;
                            i7 = -1;
                            if (i29 == 0 || i29 == -1) {
                                z11 = true;
                                boolean z28 = !z10 && ((i13 = this.A) == 1 || i13 == i7);
                                z12 = iArr[0] != 2 && (this instanceof fd);
                                if (z12) {
                                    i3 = 0;
                                }
                                pcVar6 = this.P;
                                z13 = !pcVar6.h();
                                c = '\b';
                                z14 = zArr4[0];
                                boolean z2722 = zArr4[1];
                                i8 = this.o;
                                iArr2 = this.C;
                                if (i8 != 2 && !this.k) {
                                    if (z && (tnVar = this.d) != null) {
                                        gfVar2 = tnVar.h;
                                        if (gfVar2.j || !tnVar.i.j) {
                                            c = '\b';
                                        } else if (z) {
                                            xqVar2.d(k, gfVar2.g);
                                            xqVar2.d(k2, this.d.i.g);
                                            if (this.T != null && z5 && zArr2[0] && !x()) {
                                                xqVar2.f(xqVar2.k(this.T.K), k2, 0, 8);
                                            }
                                        }
                                    }
                                    ed edVar5 = this.T;
                                    p30 k6 = edVar5 == null ? xqVar2.k(edVar5.K) : null;
                                    ed edVar6 = this.T;
                                    p30 k7 = edVar6 == null ? xqVar2.k(edVar6.I) : null;
                                    z16 = z5;
                                    i9 = i5;
                                    z15 = z8;
                                    pcVar8 = pcVar6;
                                    iArr3 = iArr2;
                                    boolean z29 = z11;
                                    p30Var2 = k;
                                    z17 = z24;
                                    p30Var5 = k3;
                                    p30Var3 = k2;
                                    pcVar9 = pcVar4;
                                    p30Var6 = p30Var;
                                    pcVar7 = pcVar5;
                                    p30Var4 = k5;
                                    zArr3 = zArr2;
                                    xqVar2 = xqVar;
                                    d(xqVar2, true, z16, z17, zArr2[0], k7, k6, iArr[0], z12, this.I, this.K, this.Y, i3, this.b0, iArr2[0], this.d0, z29, iArr[1] == 3, z15, z9, z14, i9, i6, this.u, this.v, this.w, z13);
                                    if (z && (p80Var = this.e) != null) {
                                        gfVar = p80Var.h;
                                        if (gfVar.j && p80Var.i.j) {
                                            int i30 = gfVar.g;
                                            p30Var7 = p30Var5;
                                            xqVar2.d(p30Var7, i30);
                                            p30Var8 = p30Var6;
                                            xqVar2.d(p30Var8, this.e.i.g);
                                            p30Var9 = p30Var4;
                                            xqVar2.d(p30Var9, this.e.k.g);
                                            edVar3 = this.T;
                                            if (edVar3 == null && !z9 && z17) {
                                                z19 = true;
                                                z19 = true;
                                                if (zArr3[1]) {
                                                    i10 = 0;
                                                    i11 = 8;
                                                    xqVar2.f(xqVar2.k(edVar3.L), p30Var8, 0, 8);
                                                } else {
                                                    i10 = 0;
                                                    i11 = 8;
                                                }
                                            } else {
                                                i10 = 0;
                                                i11 = 8;
                                                z19 = true;
                                            }
                                            i12 = i10;
                                            z18 = z19;
                                            if (this.p == 2) {
                                                i12 = i10;
                                            }
                                            if (i12 != 0 || this.l) {
                                                p30Var10 = p30Var7;
                                                p30Var11 = p30Var8;
                                            } else {
                                                int i31 = (iArr[z18 ? 1 : 0] == 2 && (this instanceof fd)) ? z18 ? 1 : 0 : i10;
                                                int i32 = i31 != 0 ? i10 : i4;
                                                ed edVar7 = this.T;
                                                p30 k8 = edVar7 != null ? xqVar2.k(edVar7.L) : null;
                                                ed edVar8 = this.T;
                                                p30 k9 = edVar8 != null ? xqVar2.k(edVar8.J) : null;
                                                int i33 = this.a0;
                                                if (i33 <= 0) {
                                                    r27 = z13;
                                                }
                                                pc pcVar16 = pcVar7;
                                                if (pcVar16.f != null) {
                                                    xqVar2.e(p30Var9, p30Var7, i33, i11);
                                                    xqVar2.e(p30Var9, xqVar2.k(pcVar16.f), pcVar16.e(), i11);
                                                    if (z17) {
                                                        xqVar2.f(k8, xqVar2.k(pcVar9), i10, 5);
                                                    }
                                                    r27 = i10;
                                                } else if (this.g0 == i11) {
                                                    xqVar2.e(p30Var9, p30Var7, pcVar16.e(), i11);
                                                    r27 = z13;
                                                } else {
                                                    xqVar2.e(p30Var9, p30Var7, i33, i11);
                                                    r27 = z13;
                                                }
                                                boolean z30 = zArr3[z18 ? 1 : 0];
                                                int i34 = i10;
                                                int i35 = iArr[z18 ? 1 : 0];
                                                int i36 = this.Z;
                                                int i37 = this.c0;
                                                int i38 = iArr3[z18 ? 1 : 0];
                                                float f2 = this.e0;
                                                int i39 = iArr[i34];
                                                boolean z31 = z18 ? 1 : 0;
                                                ?? r18 = z18;
                                                if (i39 != 3) {
                                                    r18 = i34;
                                                }
                                                p30Var11 = p30Var8;
                                                p30Var10 = p30Var7;
                                                xqVar2 = xqVar;
                                                d(xqVar2, false, z17, z16, z30, k9, k8, i35, i31, this.J, this.L, i36, i32, i37, i38, f2, z28, r18, z9, z15, z2722, i6, i9, this.x, this.y, this.z, r27);
                                            }
                                            if (z10) {
                                                int i40 = this.A;
                                                float f3 = this.B;
                                                if (i40 == 1) {
                                                    f7 l = xqVar2.l();
                                                    l.d.g(p30Var11, -1.0f);
                                                    l.d.g(p30Var10, 1.0f);
                                                    l.d.g(p30Var3, f3);
                                                    l.d.g(p30Var2, -f3);
                                                    xqVar2.c(l);
                                                } else {
                                                    f7 l2 = xqVar2.l();
                                                    l2.d.g(p30Var3, -1.0f);
                                                    l2.d.g(p30Var2, 1.0f);
                                                    l2.d.g(p30Var11, f3);
                                                    l2.d.g(p30Var10, -f3);
                                                    xqVar2.c(l2);
                                                }
                                            }
                                            if (pcVar8.h()) {
                                                pc pcVar17 = pcVar8;
                                                ed edVar9 = pcVar17.f.d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e = pcVar17.e();
                                                p30 k10 = xqVar2.k(i(2));
                                                p30 k11 = xqVar2.k(i(3));
                                                p30 k12 = xqVar2.k(i(4));
                                                p30 k13 = xqVar2.k(i(5));
                                                p30 k14 = xqVar2.k(edVar9.i(2));
                                                p30 k15 = xqVar2.k(edVar9.i(3));
                                                p30 k16 = xqVar2.k(edVar9.i(4));
                                                p30 k17 = xqVar2.k(edVar9.i(5));
                                                f7 l3 = xqVar2.l();
                                                double d = radians;
                                                double sin = Math.sin(d);
                                                double d2 = e;
                                                l3.d.g(k15, 0.5f);
                                                l3.d.g(k17, 0.5f);
                                                l3.d.g(k11, -0.5f);
                                                l3.d.g(k13, -0.5f);
                                                l3.b = -((float) (sin * d2));
                                                xqVar2.c(l3);
                                                f7 l4 = xqVar2.l();
                                                float cos = (float) (Math.cos(d) * d2);
                                                l4.d.g(k14, 0.5f);
                                                l4.d.g(k16, 0.5f);
                                                l4.d.g(k10, -0.5f);
                                                l4.d.g(k12, -0.5f);
                                                l4.b = -cos;
                                                xqVar2.c(l4);
                                            }
                                            this.k = false;
                                            this.l = false;
                                        }
                                    }
                                    p30Var7 = p30Var5;
                                    p30Var8 = p30Var6;
                                    p30Var9 = p30Var4;
                                    i10 = 0;
                                    i11 = 8;
                                    z18 = true;
                                    i12 = 1;
                                    if (this.p == 2) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    p30Var10 = p30Var7;
                                    p30Var11 = p30Var8;
                                    if (z10) {
                                    }
                                    if (pcVar8.h()) {
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                                pcVar7 = pcVar5;
                                p30Var2 = k;
                                p30Var3 = k2;
                                pcVar8 = pcVar6;
                                iArr3 = iArr2;
                                p30Var4 = k5;
                                z15 = z8;
                                z16 = z5;
                                z17 = z24;
                                p30Var5 = k3;
                                pcVar9 = pcVar4;
                                p30Var6 = p30Var;
                                i9 = i5;
                                zArr3 = zArr2;
                                if (z) {
                                    gfVar = p80Var.h;
                                    if (gfVar.j) {
                                        int i302 = gfVar.g;
                                        p30Var7 = p30Var5;
                                        xqVar2.d(p30Var7, i302);
                                        p30Var8 = p30Var6;
                                        xqVar2.d(p30Var8, this.e.i.g);
                                        p30Var9 = p30Var4;
                                        xqVar2.d(p30Var9, this.e.k.g);
                                        edVar3 = this.T;
                                        if (edVar3 == null) {
                                        }
                                        i10 = 0;
                                        i11 = 8;
                                        z19 = true;
                                        i12 = i10;
                                        z18 = z19;
                                        if (this.p == 2) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        p30Var10 = p30Var7;
                                        p30Var11 = p30Var8;
                                        if (z10) {
                                        }
                                        if (pcVar8.h()) {
                                        }
                                        this.k = false;
                                        this.l = false;
                                    }
                                }
                                p30Var7 = p30Var5;
                                p30Var8 = p30Var6;
                                p30Var9 = p30Var4;
                                i10 = 0;
                                i11 = 8;
                                z18 = true;
                                i12 = 1;
                                if (this.p == 2) {
                                }
                                if (i12 != 0) {
                                }
                                p30Var10 = p30Var7;
                                p30Var11 = p30Var8;
                                if (z10) {
                                }
                                if (pcVar8.h()) {
                                }
                                this.k = false;
                                this.l = false;
                            }
                        }
                        z11 = false;
                        if (z10) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z12) {
                        }
                        pcVar6 = this.P;
                        z13 = !pcVar6.h();
                        c = '\b';
                        z14 = zArr4[0];
                        boolean z27222 = zArr4[1];
                        i8 = this.o;
                        iArr2 = this.C;
                        if (i8 != 2) {
                            if (z) {
                                gfVar2 = tnVar.h;
                                if (gfVar2.j) {
                                }
                                c = '\b';
                            }
                            ed edVar52 = this.T;
                            if (edVar52 == null) {
                            }
                            ed edVar62 = this.T;
                            if (edVar62 == null) {
                            }
                            z16 = z5;
                            i9 = i5;
                            z15 = z8;
                            pcVar8 = pcVar6;
                            iArr3 = iArr2;
                            boolean z292 = z11;
                            p30Var2 = k;
                            z17 = z24;
                            p30Var5 = k3;
                            p30Var3 = k2;
                            pcVar9 = pcVar4;
                            p30Var6 = p30Var;
                            pcVar7 = pcVar5;
                            p30Var4 = k5;
                            zArr3 = zArr2;
                            xqVar2 = xqVar;
                            d(xqVar2, true, z16, z17, zArr2[0], k7, k6, iArr[0], z12, this.I, this.K, this.Y, i3, this.b0, iArr2[0], this.d0, z292, iArr[1] == 3, z15, z9, z14, i9, i6, this.u, this.v, this.w, z13);
                            if (z) {
                            }
                            p30Var7 = p30Var5;
                            p30Var8 = p30Var6;
                            p30Var9 = p30Var4;
                            i10 = 0;
                            i11 = 8;
                            z18 = true;
                            i12 = 1;
                            if (this.p == 2) {
                            }
                            if (i12 != 0) {
                            }
                            p30Var10 = p30Var7;
                            p30Var11 = p30Var8;
                            if (z10) {
                            }
                            if (pcVar8.h()) {
                            }
                            this.k = false;
                            this.l = false;
                        }
                        pcVar7 = pcVar5;
                        p30Var2 = k;
                        p30Var3 = k2;
                        pcVar8 = pcVar6;
                        iArr3 = iArr2;
                        p30Var4 = k5;
                        z15 = z8;
                        z16 = z5;
                        z17 = z24;
                        p30Var5 = k3;
                        pcVar9 = pcVar4;
                        p30Var6 = p30Var;
                        i9 = i5;
                        zArr3 = zArr2;
                        if (z) {
                        }
                        p30Var7 = p30Var5;
                        p30Var8 = p30Var6;
                        p30Var9 = p30Var4;
                        i10 = 0;
                        i11 = 8;
                        z18 = true;
                        i12 = 1;
                        if (this.p == 2) {
                        }
                        if (i12 != 0) {
                        }
                        p30Var10 = p30Var7;
                        p30Var11 = p30Var8;
                        if (z10) {
                        }
                        if (pcVar8.h()) {
                        }
                        this.k = false;
                        this.l = false;
                    }
                    i5 = i27;
                    pcVar5 = pcVar;
                    i4 = i21;
                    z10 = true;
                    i6 = i14;
                    int[] iArr5222 = this.t;
                    iArr5222[0] = i5;
                    iArr5222[1] = i6;
                    if (z10) {
                    }
                    z11 = false;
                    if (z10) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z12) {
                    }
                    pcVar6 = this.P;
                    z13 = !pcVar6.h();
                    c = '\b';
                    z14 = zArr4[0];
                    boolean z272222 = zArr4[1];
                    i8 = this.o;
                    iArr2 = this.C;
                    if (i8 != 2) {
                    }
                    pcVar7 = pcVar5;
                    p30Var2 = k;
                    p30Var3 = k2;
                    pcVar8 = pcVar6;
                    iArr3 = iArr2;
                    p30Var4 = k5;
                    z15 = z8;
                    z16 = z5;
                    z17 = z24;
                    p30Var5 = k3;
                    pcVar9 = pcVar4;
                    p30Var6 = p30Var;
                    i9 = i5;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    p30Var7 = p30Var5;
                    p30Var8 = p30Var6;
                    p30Var9 = p30Var4;
                    i10 = 0;
                    i11 = 8;
                    z18 = true;
                    i12 = 1;
                    if (this.p == 2) {
                    }
                    if (i12 != 0) {
                    }
                    p30Var10 = p30Var7;
                    p30Var11 = p30Var8;
                    if (z10) {
                    }
                    if (pcVar8.h()) {
                    }
                    this.k = false;
                    this.l = false;
                }
            } else {
                pcVar4 = pcVar13;
            }
            p30Var = k4;
            pcVar5 = pcVar;
            i4 = i21;
            i5 = i25;
            i6 = i26;
            z10 = false;
            int[] iArr52222 = this.t;
            iArr52222[0] = i5;
            iArr52222[1] = i6;
            if (z10) {
            }
            z11 = false;
            if (z10) {
            }
            if (iArr[0] != 2) {
            }
            if (z12) {
            }
            pcVar6 = this.P;
            z13 = !pcVar6.h();
            c = '\b';
            z14 = zArr4[0];
            boolean z2722222 = zArr4[1];
            i8 = this.o;
            iArr2 = this.C;
            if (i8 != 2) {
            }
            pcVar7 = pcVar5;
            p30Var2 = k;
            p30Var3 = k2;
            pcVar8 = pcVar6;
            iArr3 = iArr2;
            p30Var4 = k5;
            z15 = z8;
            z16 = z5;
            z17 = z24;
            p30Var5 = k3;
            pcVar9 = pcVar4;
            p30Var6 = p30Var;
            i9 = i5;
            zArr3 = zArr2;
            if (z) {
            }
            p30Var7 = p30Var5;
            p30Var8 = p30Var6;
            p30Var9 = p30Var4;
            i10 = 0;
            i11 = 8;
            z18 = true;
            i12 = 1;
            if (this.p == 2) {
            }
            if (i12 != 0) {
            }
            p30Var10 = p30Var7;
            p30Var11 = p30Var8;
            if (z10) {
            }
            if (pcVar8.h()) {
            }
            this.k = false;
            this.l = false;
        }
        z2 = false;
        z3 = z2 ? 1 : 0;
        z4 = z3;
        r17 = z2;
        i = this.g0;
        boolean[] zArr42 = this.S;
        boolean z222 = z3;
        if (i != 8) {
        }
        z6 = this.k;
        if (!z6) {
        }
        if (z6) {
        }
        if (this.l) {
        }
        if (this.k) {
            boolean z232 = r17;
            this.k = z232;
            this.l = z232;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        pcVar = pcVar14;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i2 = this.U;
        i3 = this.b0;
        if (i2 >= i3) {
        }
        int i192 = this.V;
        pc pcVar152 = pcVar3;
        int i202 = this.c0;
        if (i192 >= i202) {
        }
        iArr = this.p0;
        int i222 = iArr[0];
        boolean z242 = z7;
        if (i222 == 3) {
        }
        int i232 = iArr[1];
        if (i232 == 3) {
        }
        int i242 = this.X;
        this.A = i242;
        f = this.W;
        this.B = f;
        int i252 = this.r;
        int i262 = this.s;
        if (f <= 0.0f) {
        }
        p30Var = k4;
        pcVar5 = pcVar;
        i4 = i21;
        i5 = i252;
        i6 = i262;
        z10 = false;
        int[] iArr522222 = this.t;
        iArr522222[0] = i5;
        iArr522222[1] = i6;
        if (z10) {
        }
        z11 = false;
        if (z10) {
        }
        if (iArr[0] != 2) {
        }
        if (z12) {
        }
        pcVar6 = this.P;
        z13 = !pcVar6.h();
        c = '\b';
        z14 = zArr42[0];
        boolean z27222222 = zArr42[1];
        i8 = this.o;
        iArr2 = this.C;
        if (i8 != 2) {
        }
        pcVar7 = pcVar5;
        p30Var2 = k;
        p30Var3 = k2;
        pcVar8 = pcVar6;
        iArr3 = iArr2;
        p30Var4 = k5;
        z15 = z8;
        z16 = z5;
        z17 = z242;
        p30Var5 = k3;
        pcVar9 = pcVar4;
        p30Var6 = p30Var;
        i9 = i5;
        zArr3 = zArr2;
        if (z) {
        }
        p30Var7 = p30Var5;
        p30Var8 = p30Var6;
        p30Var9 = p30Var4;
        i10 = 0;
        i11 = 8;
        z18 = true;
        i12 = 1;
        if (this.p == 2) {
        }
        if (i12 != 0) {
        }
        p30Var10 = p30Var7;
        p30Var11 = p30Var8;
        if (z10) {
        }
        if (pcVar8.h()) {
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0440 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(xq xqVar, boolean z, boolean z2, boolean z3, boolean z4, p30 p30Var, p30 p30Var2, int i, boolean z5, pc pcVar, pc pcVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        int i11;
        int i12;
        boolean z16;
        p30 k;
        p30 k2;
        pc pcVar3;
        p30 p30Var3;
        boolean z17;
        int i13;
        p30 p30Var4;
        p30 p30Var5;
        p30 p30Var6;
        p30 p30Var7;
        int i14;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        ed edVar;
        int i17;
        int i18;
        pc pcVar4;
        boolean z22;
        int i19;
        boolean z23;
        int i20;
        int i21;
        HashSet hashSet;
        boolean z24;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z25;
        boolean z26;
        int i27;
        xq xqVar2 = xqVar;
        int i28 = i8;
        int i29 = i9;
        p30 k3 = xqVar2.k(pcVar);
        p30 k4 = xqVar2.k(pcVar2);
        p30 k5 = xqVar2.k(pcVar.f);
        p30 k6 = xqVar2.k(pcVar2.f);
        boolean h = pcVar.h();
        boolean h2 = pcVar2.h();
        boolean h3 = this.P.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i6;
        int i33 = o30.i(i);
        boolean z27 = (i33 == 0 || i33 == 1 || i33 != 2 || i32 == 4) ? false : true;
        int i34 = this.h;
        if (i34 == -1 || !z) {
            i34 = i3;
            z12 = z27;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i35 = this.i;
        if (i35 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i34 = i35;
            z13 = false;
        }
        boolean z28 = z13;
        if (this.g0 == 8) {
            z14 = false;
            i10 = 0;
        } else {
            i10 = i34;
            z14 = z28;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                xqVar2.d(k3, i2);
            } else if (h && !h2) {
                z15 = z14;
                i11 = 8;
                xqVar2.e(k3, k5, pcVar.e(), 8);
            }
            z15 = z14;
            i11 = 8;
        } else {
            z15 = z14;
            i11 = 8;
        }
        if (z15) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i10;
                }
                if (i29 == -2) {
                    i29 = i10;
                }
                if (i10 > 0 && i32 != 1) {
                    i10 = 0;
                }
                if (i28 > 0) {
                    xqVar2.f(k4, k3, i28, 8);
                    i10 = Math.max(i10, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        xqVar2.g(k4, k3, i29, 8);
                    }
                    i10 = Math.min(i10, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        xqVar2.e(k4, k3, i10, 8);
                    } else if (z8) {
                        xqVar2.e(k4, k3, i10, 5);
                        xqVar2.g(k4, k3, i10, 8);
                    } else {
                        xqVar2.e(k4, k3, i10, 5);
                        xqVar2.g(k4, k3, i10, 8);
                    }
                } else if (i32 == 2) {
                    int i36 = pcVar.e;
                    if (i36 == 3 || i36 == 5) {
                        k = xqVar2.k(this.T.i(3));
                        k2 = xqVar2.k(this.T.i(5));
                    } else {
                        k = xqVar2.k(this.T.i(2));
                        k2 = xqVar2.k(this.T.i(4));
                    }
                    f7 l = xqVar2.l();
                    int i37 = i28;
                    l.d.g(k4, -1.0f);
                    l.d.g(k3, 1.0f);
                    l.d.g(k2, f2);
                    l.d.g(k, -f2);
                    xqVar2.c(l);
                    if (z2) {
                        z15 = false;
                    }
                    z16 = z4;
                    i12 = i37;
                } else {
                    i12 = i28;
                    z16 = true;
                }
            } else {
                int max = Math.max(i28, i10);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                xqVar2.e(k4, k3, max, 8);
                z16 = z4;
                i12 = i28;
                z15 = false;
            }
            if (z11 || z8) {
                boolean z29 = z16;
                if (i31 >= 2 && z2 && z29) {
                    xqVar2.f(k3, p30Var, 0, 8);
                    pc pcVar5 = this.M;
                    boolean z30 = z || pcVar5.f == null;
                    if (!z && (pcVar3 = pcVar5.f) != null) {
                        ed edVar2 = pcVar3.d;
                        if (edVar2.W != 0.0f) {
                            int[] iArr = edVar2.p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z30 = true;
                            }
                        }
                        z30 = false;
                    }
                    if (z30) {
                        xqVar2.f(p30Var2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                pcVar4 = pcVar2;
                p30Var6 = k4;
                z17 = z16;
                p30Var3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    p30Var3 = k6;
                    if (h && h2) {
                        ed edVar3 = pcVar.f.d;
                        ed edVar4 = pcVar2.f.d;
                        z17 = z16;
                        ed edVar5 = this.T;
                        int i38 = 6;
                        if (z15) {
                            if (i32 == 0) {
                                if (i29 != 0 || i12 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z19 = true;
                                } else if (k5.k && p30Var3.k) {
                                    xqVar2.e(k3, k5, pcVar.e(), 8);
                                    xqVar2.e(k4, p30Var3, -pcVar2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z19 = false;
                                }
                                if ((edVar3 instanceof u7) || (edVar4 instanceof u7)) {
                                    xqVar2 = xqVar;
                                    i13 = i32;
                                    p30Var5 = k3;
                                    p30Var6 = k4;
                                    z20 = z26;
                                    p30Var4 = p30Var2;
                                    i15 = i25;
                                    p30Var7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = 4;
                                    if (z19 || p30Var7 != p30Var3 || edVar3 == edVar5) {
                                        z21 = true;
                                    } else {
                                        z19 = false;
                                        z21 = false;
                                    }
                                    if (z18) {
                                        edVar = edVar4;
                                        i17 = i12;
                                        i18 = i13;
                                        pcVar4 = pcVar2;
                                        z22 = z2;
                                    } else {
                                        if (z15 || z7 || z9 || p30Var7 != p30Var || p30Var3 != p30Var4) {
                                            z22 = z2;
                                            z24 = z21;
                                            i22 = i15;
                                        } else {
                                            i14 = 8;
                                            z22 = false;
                                            i22 = 8;
                                            z24 = false;
                                        }
                                        p30 p30Var8 = p30Var7;
                                        i17 = i12;
                                        i18 = i13;
                                        edVar = edVar4;
                                        pcVar4 = pcVar2;
                                        xqVar2.b(p30Var5, p30Var8, pcVar.e(), f, p30Var3, p30Var6, pcVar2.e(), i14);
                                        p30Var7 = p30Var8;
                                        i15 = i22;
                                        z21 = z24;
                                    }
                                    if (this.g0 != 8 && ((hashSet = pcVar4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z19) {
                                        if (z22 && p30Var7 != p30Var3 && !z15 && ((edVar3 instanceof u7) || (edVar instanceof u7))) {
                                            i15 = 6;
                                        }
                                        xqVar2.f(p30Var5, p30Var7, pcVar.e(), i15);
                                        xqVar2.g(p30Var6, p30Var3, -pcVar4.e(), i15);
                                    }
                                    if (z22 || !z10 || (edVar3 instanceof u7) || (edVar instanceof u7) || edVar == edVar5) {
                                        i19 = i16;
                                        z23 = z21;
                                    } else {
                                        i19 = 6;
                                        i15 = 6;
                                        z23 = true;
                                    }
                                    if (z23) {
                                        if (z20 && (!z9 || z3)) {
                                            if (edVar3 != edVar5 && edVar != edVar5) {
                                                i38 = i19;
                                            }
                                            if ((edVar3 instanceof bn) || (edVar instanceof bn)) {
                                                i38 = 5;
                                            }
                                            if ((edVar3 instanceof u7) || (edVar instanceof u7)) {
                                                i38 = 5;
                                            }
                                            i19 = Math.max(z9 ? 5 : i38, i19);
                                        }
                                        if (z22) {
                                            i19 = Math.min(i15, i19);
                                            if (z6 && !z9 && (edVar3 == edVar5 || edVar == edVar5)) {
                                                i21 = 4;
                                                xqVar2.e(p30Var5, p30Var7, pcVar.e(), i21);
                                                xqVar2.e(p30Var6, p30Var3, -pcVar4.e(), i21);
                                            }
                                        }
                                        i21 = i19;
                                        xqVar2.e(p30Var5, p30Var7, pcVar.e(), i21);
                                        xqVar2.e(p30Var6, p30Var3, -pcVar4.e(), i21);
                                    }
                                    if (z22) {
                                        int e = p30Var == p30Var7 ? pcVar.e() : 0;
                                        if (p30Var7 != p30Var) {
                                            xqVar2.f(p30Var5, p30Var, e, 5);
                                        }
                                    }
                                    if (z22 && z15 && i4 == 0 && i17 == 0) {
                                        if (z15 || i18 != 3) {
                                            i20 = 5;
                                            xqVar2.f(p30Var6, p30Var5, 0, 5);
                                        } else {
                                            xqVar2.f(p30Var6, p30Var5, 0, 8);
                                        }
                                    }
                                    i20 = 5;
                                } else {
                                    xqVar2 = xqVar;
                                    p30Var5 = k3;
                                    p30Var6 = k4;
                                    z20 = z26;
                                    i15 = i25;
                                    p30Var7 = k5;
                                    i14 = 6;
                                    z18 = z25;
                                    i16 = i26;
                                    i13 = i32;
                                    p30Var4 = p30Var2;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.g0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                        if (z15) {
                                        }
                                        i20 = 5;
                                        xqVar2.f(p30Var6, p30Var5, 0, 5);
                                    }
                                    i20 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((edVar3 instanceof u7) || (edVar4 instanceof u7)) {
                                        xqVar2 = xqVar;
                                        i13 = i32;
                                        p30Var5 = k3;
                                        p30Var6 = k4;
                                        p30Var7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                    } else {
                                        xqVar2 = xqVar;
                                        i13 = i32;
                                        p30Var5 = k3;
                                        p30Var6 = k4;
                                        p30Var7 = k5;
                                        i14 = 6;
                                        i15 = 5;
                                        i16 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = false;
                                        p30Var4 = p30Var2;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.g0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    }
                                } else if (i32 == 1) {
                                    xqVar2 = xqVar;
                                    i13 = i32;
                                    p30Var5 = k3;
                                    p30Var6 = k4;
                                    p30Var7 = k5;
                                    i14 = 6;
                                    i15 = 8;
                                } else if (i32 == 3) {
                                    i13 = i32;
                                    if (this.A != -1) {
                                        if (z6) {
                                            if (i7 == 2 || i7 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i16 = i24;
                                            p30Var5 = k3;
                                            p30Var6 = k4;
                                            p30Var7 = k5;
                                            i14 = 6;
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            p30Var4 = p30Var2;
                                        } else if (i29 > 0) {
                                            xqVar2 = xqVar;
                                            p30Var4 = p30Var2;
                                            p30Var5 = k3;
                                            p30Var6 = k4;
                                            p30Var7 = k5;
                                            i14 = 6;
                                            i15 = 5;
                                        } else {
                                            if (i29 != 0 || i12 != 0) {
                                                xqVar2 = xqVar;
                                                p30Var4 = p30Var2;
                                                p30Var5 = k3;
                                                p30Var6 = k4;
                                                p30Var7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 4;
                                            } else if (z9) {
                                                i23 = (edVar3 == edVar5 || edVar4 == edVar5) ? 5 : 4;
                                                p30Var4 = p30Var2;
                                                p30Var5 = k3;
                                                p30Var6 = k4;
                                                p30Var7 = k5;
                                                i14 = 6;
                                                i16 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else {
                                                xqVar2 = xqVar;
                                                p30Var4 = p30Var2;
                                                p30Var5 = k3;
                                                p30Var6 = k4;
                                                p30Var7 = k5;
                                                i14 = 6;
                                                i15 = 5;
                                                i16 = 8;
                                            }
                                            z18 = true;
                                            z19 = true;
                                            z20 = true;
                                            if (z19) {
                                            }
                                            z21 = true;
                                            if (z18) {
                                            }
                                            if (this.g0 != 8) {
                                            }
                                            if (z19) {
                                            }
                                            if (z22) {
                                            }
                                            i19 = i16;
                                            z23 = z21;
                                            if (z23) {
                                            }
                                            if (z22) {
                                            }
                                            if (z22) {
                                            }
                                            i20 = 5;
                                        }
                                        i15 = i23;
                                        xqVar2 = xqVar;
                                        if (z19) {
                                        }
                                        z21 = true;
                                        if (z18) {
                                        }
                                        if (this.g0 != 8) {
                                        }
                                        if (z19) {
                                        }
                                        if (z22) {
                                        }
                                        i19 = i16;
                                        z23 = z21;
                                        if (z23) {
                                        }
                                        if (z22) {
                                        }
                                        if (z22) {
                                        }
                                        i20 = 5;
                                    } else if (z9) {
                                        xqVar2 = xqVar;
                                        p30Var4 = p30Var2;
                                        p30Var5 = k3;
                                        p30Var6 = k4;
                                        p30Var7 = k5;
                                        i15 = 8;
                                        i14 = z2 ? 5 : 4;
                                    } else {
                                        xqVar2 = xqVar;
                                        p30Var4 = p30Var2;
                                        p30Var5 = k3;
                                        p30Var6 = k4;
                                        p30Var7 = k5;
                                        i15 = 8;
                                        i14 = 8;
                                    }
                                    i16 = 5;
                                    z18 = true;
                                    z19 = true;
                                    z20 = true;
                                    if (z19) {
                                    }
                                    z21 = true;
                                    if (z18) {
                                    }
                                    if (this.g0 != 8) {
                                    }
                                    if (z19) {
                                    }
                                    if (z22) {
                                    }
                                    i19 = i16;
                                    z23 = z21;
                                    if (z23) {
                                    }
                                    if (z22) {
                                    }
                                    if (z22) {
                                    }
                                    i20 = 5;
                                } else {
                                    i13 = i32;
                                    xqVar2 = xqVar;
                                    p30Var4 = p30Var2;
                                    p30Var5 = k3;
                                    p30Var6 = k4;
                                    p30Var7 = k5;
                                    i14 = 6;
                                    i15 = 5;
                                    i16 = 4;
                                    z18 = false;
                                    z19 = false;
                                }
                                i16 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                p30Var4 = p30Var2;
                                if (z19) {
                                }
                                z21 = true;
                                if (z18) {
                                }
                                if (this.g0 != 8) {
                                }
                                if (z19) {
                                }
                                if (z22) {
                                }
                                i19 = i16;
                                z23 = z21;
                                if (z23) {
                                }
                                if (z22) {
                                }
                                if (z22) {
                                }
                                i20 = 5;
                            }
                            i27 = i20;
                            if (z22 && z17) {
                                int e2 = pcVar4.f != null ? pcVar4.e() : 0;
                                if (p30Var3 != p30Var2) {
                                    xqVar2.f(p30Var2, p30Var6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i13 = i32;
                        if (k5.k && p30Var3.k) {
                            xqVar.b(k3, k5, pcVar.e(), f, p30Var3, k4, pcVar2.e(), 8);
                            if (z2 && z17) {
                                int e3 = pcVar2.f != null ? pcVar2.e() : 0;
                                if (p30Var3 != p30Var2) {
                                    xqVar.f(p30Var2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        xqVar2 = xqVar;
                        p30Var4 = p30Var2;
                        p30Var5 = k3;
                        p30Var6 = k4;
                        p30Var7 = k5;
                        i14 = 6;
                        i15 = 5;
                        i16 = 4;
                        z18 = true;
                        z19 = true;
                        z20 = false;
                        if (z19) {
                        }
                        z21 = true;
                        if (z18) {
                        }
                        if (this.g0 != 8) {
                        }
                        if (z19) {
                        }
                        if (z22) {
                        }
                        i19 = i16;
                        z23 = z21;
                        if (z23) {
                        }
                        if (z22) {
                        }
                        if (z22) {
                        }
                        i20 = 5;
                        i27 = i20;
                        if (z22) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    p30Var3 = k6;
                    xqVar2.e(k4, p30Var3, -pcVar2.e(), 8);
                    if (z2) {
                        xqVar2.f(k3, p30Var, 0, 5);
                        pcVar4 = pcVar2;
                        i20 = 5;
                        p30Var6 = k4;
                        z17 = z16;
                        z22 = z2;
                        i27 = i20;
                        if (z22) {
                        }
                    }
                }
                pcVar4 = pcVar2;
                p30Var6 = k4;
                z17 = z16;
            } else {
                pcVar4 = pcVar2;
                p30Var6 = k4;
                z17 = z16;
                p30Var3 = k6;
                z22 = z2;
                i27 = (z2 && (pcVar.f.d instanceof u7)) ? 8 : 5;
                if (z22) {
                }
            }
            i20 = 5;
            z22 = z2;
            i27 = i20;
            if (z22) {
            }
        } else if (z5) {
            xqVar2.e(k4, k3, 0, 3);
            if (i4 > 0) {
                xqVar2.f(k4, k3, i4, i11);
            }
            if (i5 < Integer.MAX_VALUE) {
                xqVar2.g(k4, k3, i5, i11);
            }
        } else {
            xqVar2.e(k4, k3, i10, i11);
        }
        z16 = z4;
        i12 = i28;
        if (z11) {
        }
        boolean z292 = z16;
        if (i31 >= 2) {
        }
    }

    public final void e(int i, ed edVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, edVar, i2, 0);
                    e(4, edVar, i2, 0);
                    i(7).a(edVar.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, edVar, i2, 0);
                        e(5, edVar, i2, 0);
                        i(7).a(edVar.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            pc i4 = i(2);
            pc i5 = i(4);
            pc i6 = i(3);
            pc i7 = i(5);
            boolean z2 = true;
            if ((i4 == null || !i4.h()) && (i5 == null || !i5.h())) {
                e(2, edVar, 2, 0);
                e(4, edVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(3, edVar, 3, 0);
                e(5, edVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(edVar.i(7), 0);
                return;
            } else if (z) {
                i(8).a(edVar.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(edVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            pc i8 = i(2);
            pc i9 = edVar.i(i2);
            pc i10 = i(4);
            i8.a(i9, 0);
            i10.a(i9, 0);
            i(8).a(i9, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            pc i11 = edVar.i(i2);
            i(3).a(i11, 0);
            i(5).a(i11, 0);
            i(9).a(i11, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(edVar.i(2), 0);
            i(4).a(edVar.i(4), 0);
            i(8).a(edVar.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(edVar.i(3), 0);
            i(5).a(edVar.i(5), 0);
            i(9).a(edVar.i(i2), 0);
            return;
        }
        pc i12 = i(i);
        pc i13 = edVar.i(i2);
        if (i12.i(i13)) {
            if (i == 6) {
                pc i14 = i(3);
                pc i15 = i(5);
                if (i14 != null) {
                    i14.j();
                }
                if (i15 != null) {
                    i15.j();
                }
            } else if (i == 3 || i == 5) {
                pc i16 = i(6);
                if (i16 != null) {
                    i16.j();
                }
                pc i17 = i(7);
                if (i17.f != i13) {
                    i17.j();
                }
                pc f = i(i).f();
                pc i18 = i(9);
                if (i18.h()) {
                    f.j();
                    i18.j();
                }
            } else if (i == 2 || i == 4) {
                pc i19 = i(7);
                if (i19.f != i13) {
                    i19.j();
                }
                pc f2 = i(i).f();
                pc i20 = i(8);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            }
            i12.a(i13, i3);
        }
    }

    public final void f(pc pcVar, pc pcVar2, int i) {
        if (pcVar.d == this) {
            e(pcVar.e, pcVar2.d, pcVar2.e, i);
        }
    }

    public final void g(xq xqVar) {
        xqVar.k(this.I);
        xqVar.k(this.J);
        xqVar.k(this.K);
        xqVar.k(this.L);
        if (this.a0 > 0) {
            xqVar.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            tn tnVar = new tn(this);
            tnVar.h.e = 4;
            tnVar.i.e = 5;
            tnVar.f = 0;
            this.d = tnVar;
        }
        if (this.e == null) {
            p80 p80Var = new p80(this);
            gf gfVar = new gf(p80Var);
            p80Var.k = gfVar;
            p80Var.l = null;
            p80Var.h.e = 6;
            p80Var.i.e = 7;
            gfVar.e = 8;
            p80Var.f = 1;
            this.e = p80Var;
        }
    }

    public pc i(int i) {
        switch (o30.i(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return this.M;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return this.P;
            case 7:
                return this.N;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                return this.O;
            default:
                throw new AssertionError(o30.h(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final ed l(int i) {
        pc pcVar;
        pc pcVar2;
        if (i != 0) {
            if (i == 1 && (pcVar2 = (pcVar = this.L).f) != null && pcVar2.f == pcVar) {
                return pcVar2.d;
            }
            return null;
        }
        pc pcVar3 = this.K;
        pc pcVar4 = pcVar3.f;
        if (pcVar4 == null || pcVar4.f != pcVar3) {
            return null;
        }
        return pcVar4.d;
    }

    public final ed m(int i) {
        pc pcVar;
        pc pcVar2;
        if (i != 0) {
            if (i == 1 && (pcVar2 = (pcVar = this.J).f) != null && pcVar2.f == pcVar) {
                return pcVar2.d;
            }
            return null;
        }
        pc pcVar3 = this.I;
        pc pcVar4 = pcVar3.f;
        if (pcVar4 == null || pcVar4.f != pcVar3) {
            return null;
        }
        return pcVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        int[] iArr2 = this.p0;
        int i6 = iArr2[0];
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f, i6);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f3 = this.z;
        int i12 = iArr2[1];
        float f4 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f3, i12);
        float f5 = this.W;
        int i13 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i13);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        ed edVar = this.T;
        return (edVar == null || !(edVar instanceof fd)) ? this.Y : ((fd) edVar).x0 + this.Y;
    }

    public final int s() {
        ed edVar = this.T;
        return (edVar == null || !(edVar instanceof fd)) ? this.Z : ((fd) edVar).y0 + this.Z;
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
        String str = "";
        sb.append("");
        if (this.h0 != null) {
            str = "id: " + this.h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        pc pcVar;
        pc pcVar2;
        pc pcVar3;
        pc pcVar4;
        if (i == 0) {
            pc pcVar5 = this.I;
            pc pcVar6 = pcVar5.f;
            if (pcVar6 == null || !pcVar6.c || (pcVar4 = (pcVar3 = this.K).f) == null || !pcVar4.c) {
                return false;
            }
            return (pcVar4.d() - pcVar3.e()) - (pcVar5.e() + pcVar5.f.d()) >= i2;
        }
        pc pcVar7 = this.J;
        pc pcVar8 = pcVar7.f;
        if (pcVar8 == null || !pcVar8.c || (pcVar2 = (pcVar = this.L).f) == null || !pcVar2.c) {
            return false;
        }
        return (pcVar2.d() - pcVar.e()) - (pcVar7.e() + pcVar7.f.d()) >= i2;
    }

    public final void v(int i, int i2, int i3, int i4, ed edVar) {
        i(i).b(edVar.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        pc pcVar;
        pc pcVar2;
        int i2 = i * 2;
        pc[] pcVarArr = this.Q;
        pc pcVar3 = pcVarArr[i2];
        pc pcVar4 = pcVar3.f;
        return (pcVar4 == null || pcVar4.f == pcVar3 || (pcVar2 = (pcVar = pcVarArr[i2 + 1]).f) == null || pcVar2.f != pcVar) ? false : true;
    }

    public final boolean x() {
        pc pcVar = this.I;
        pc pcVar2 = pcVar.f;
        if (pcVar2 != null && pcVar2.f == pcVar) {
            return true;
        }
        pc pcVar3 = this.K;
        pc pcVar4 = pcVar3.f;
        return pcVar4 != null && pcVar4.f == pcVar3;
    }

    public final boolean y() {
        pc pcVar = this.J;
        pc pcVar2 = pcVar.f;
        if (pcVar2 != null && pcVar2.f == pcVar) {
            return true;
        }
        pc pcVar3 = this.L;
        pc pcVar4 = pcVar3.f;
        return pcVar4 != null && pcVar4.f == pcVar3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
