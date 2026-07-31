package y2;

import a0.g1;
import a0.q;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import z2.k;
import z2.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f8748a0;

    /* renamed from: b, reason: collision with root package name */
    public z2.c f8749b;

    /* renamed from: b0, reason: collision with root package name */
    public int f8750b0;

    /* renamed from: c, reason: collision with root package name */
    public z2.c f8751c;

    /* renamed from: c0, reason: collision with root package name */
    public int f8752c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f8754d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f8756e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f8758f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f8760g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f8762h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f8763i0;

    /* renamed from: j, reason: collision with root package name */
    public String f8764j;

    /* renamed from: j0, reason: collision with root package name */
    public int f8765j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8766k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f8767k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8768l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f8769l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8770m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f8771m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8772n;

    /* renamed from: n0, reason: collision with root package name */
    public int f8773n0;

    /* renamed from: o, reason: collision with root package name */
    public int f8774o;

    /* renamed from: o0, reason: collision with root package name */
    public int f8775o0;

    /* renamed from: p, reason: collision with root package name */
    public int f8776p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f8777p0;

    /* renamed from: q, reason: collision with root package name */
    public int f8778q;

    /* renamed from: r, reason: collision with root package name */
    public int f8779r;

    /* renamed from: s, reason: collision with root package name */
    public int f8780s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f8781t;

    /* renamed from: u, reason: collision with root package name */
    public int f8782u;

    /* renamed from: v, reason: collision with root package name */
    public int f8783v;

    /* renamed from: w, reason: collision with root package name */
    public float f8784w;

    /* renamed from: x, reason: collision with root package name */
    public int f8785x;

    /* renamed from: y, reason: collision with root package name */
    public int f8786y;

    /* renamed from: z, reason: collision with root package name */
    public float f8787z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8747a = false;

    /* renamed from: d, reason: collision with root package name */
    public k f8753d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f8755e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f8757f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f8759g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f8761h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f8766k = false;
        this.f8768l = false;
        this.f8770m = false;
        this.f8772n = false;
        this.f8774o = -1;
        this.f8776p = -1;
        this.f8778q = 0;
        this.f8779r = 0;
        this.f8780s = 0;
        this.f8781t = new int[2];
        this.f8782u = 0;
        this.f8783v = 0;
        this.f8784w = 1.0f;
        this.f8785x = 0;
        this.f8786y = 0;
        this.f8787z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        c cVar = new c(this, 2);
        this.I = cVar;
        c cVar2 = new c(this, 3);
        this.J = cVar2;
        c cVar3 = new c(this, 4);
        this.K = cVar3;
        c cVar4 = new c(this, 5);
        this.L = cVar4;
        c cVar5 = new c(this, 6);
        this.M = cVar5;
        c cVar6 = new c(this, 8);
        this.N = cVar6;
        c cVar7 = new c(this, 9);
        this.O = cVar7;
        c cVar8 = new c(this, 7);
        this.P = cVar8;
        this.Q = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.f8777p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f8748a0 = 0;
        this.f8754d0 = 0.5f;
        this.f8756e0 = 0.5f;
        this.f8760g0 = 0;
        this.f8762h0 = null;
        this.f8763i0 = 0;
        this.f8765j0 = 0;
        this.f8767k0 = new float[]{-1.0f, -1.0f};
        this.f8769l0 = new d[]{null, null};
        this.f8771m0 = new d[]{null, null};
        this.f8773n0 = -1;
        this.f8775o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i, int i8, String str, StringBuilder sb) {
        if (i == i8) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f6, float f8) {
        if (f6 == f8) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f6);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i8, int i9, int i10, int i11, float f6, int i12) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i12 == 1) {
            str2 = "FIXED";
        } else if (i12 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i12 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i12 != 4) {
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
        G(i8, 0, "      min", sb);
        G(i9, Integer.MAX_VALUE, "      max", sb);
        G(i10, 0, "      matchMin", sb);
        G(i11, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f6, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f8744f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f8744f);
        sb.append("'");
        if (cVar.f8746h != Integer.MIN_VALUE || cVar.f8745g != 0) {
            sb.append(",");
            sb.append(cVar.f8745g);
            if (cVar.f8746h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f8746h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f8766k) {
            return true;
        }
        return this.I.f8741c && this.K.f8741c;
    }

    public boolean B() {
        if (this.f8768l) {
            return true;
        }
        return this.J.f8741c && this.L.f8741c;
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
        this.f8748a0 = 0;
        this.f8750b0 = 0;
        this.f8752c0 = 0;
        this.f8754d0 = 0.5f;
        this.f8756e0 = 0.5f;
        int[] iArr = this.f8777p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f8758f0 = null;
        this.f8760g0 = 0;
        this.f8763i0 = 0;
        this.f8765j0 = 0;
        float[] fArr = this.f8767k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8774o = -1;
        this.f8776p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f8779r = 0;
        this.f8780s = 0;
        this.f8784w = 1.0f;
        this.f8787z = 1.0f;
        this.f8783v = Integer.MAX_VALUE;
        this.f8786y = Integer.MAX_VALUE;
        this.f8782u = 0;
        this.f8785x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f8757f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f8759g = true;
        int[] iArr3 = this.f8781t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f8761h = -1;
        this.i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.f8766k = false;
        this.f8768l = false;
        this.f8770m = false;
        this.f8772n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f8741c = false;
            cVar.f8740b = 0;
        }
    }

    public void F(g1 g1Var) {
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
        this.f8748a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i8) {
        if (this.f8766k) {
            return;
        }
        this.I.l(i);
        this.K.l(i8);
        this.Y = i;
        this.U = i8 - i;
        this.f8766k = true;
    }

    public final void K(int i, int i8) {
        if (this.f8768l) {
            return;
        }
        this.J.l(i);
        this.L.l(i8);
        this.Z = i;
        this.V = i8 - i;
        if (this.E) {
            this.M.l(i + this.f8748a0);
        }
        this.f8768l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i8 = this.f8752c0;
        if (i < i8) {
            this.V = i8;
        }
    }

    public final void M(int i) {
        this.f8777p0[0] = i;
    }

    public final void N(int i) {
        this.f8777p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i8 = this.f8750b0;
        if (i < i8) {
            this.U = i8;
        }
    }

    public void P(boolean z3, boolean z7) {
        int i;
        int i8;
        k kVar = this.f8753d;
        boolean z8 = z3 & kVar.f9167g;
        m mVar = this.f8755e;
        boolean z9 = z7 & mVar.f9167g;
        int i9 = kVar.f9168h.f9143g;
        int i10 = mVar.f9168h.f9143g;
        int i11 = kVar.i.f9143g;
        int i12 = mVar.i.f9143g;
        int i13 = i12 - i10;
        if (i11 - i9 < 0 || i13 < 0 || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            i11 = 0;
            i12 = 0;
            i9 = 0;
            i10 = 0;
        }
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        if (z8) {
            this.Y = i9;
        }
        if (z9) {
            this.Z = i10;
        }
        if (this.f8760g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f8777p0;
        if (z8) {
            if (iArr[0] == 1 && i14 < (i8 = this.U)) {
                i14 = i8;
            }
            this.U = i14;
            int i16 = this.f8750b0;
            if (i14 < i16) {
                this.U = i16;
            }
        }
        if (z9) {
            if (iArr[1] == 1 && i15 < (i = this.V)) {
                i15 = i;
            }
            this.V = i15;
            int i17 = this.f8752c0;
            if (i15 < i17) {
                this.V = i17;
            }
        }
    }

    public void Q(w2.c cVar, boolean z3) {
        int i;
        int i8;
        m mVar;
        k kVar;
        cVar.getClass();
        int n6 = w2.c.n(this.I);
        int n7 = w2.c.n(this.J);
        int n8 = w2.c.n(this.K);
        int n9 = w2.c.n(this.L);
        if (z3 && (kVar = this.f8753d) != null) {
            z2.f fVar = kVar.f9168h;
            if (fVar.f9145j) {
                z2.f fVar2 = kVar.i;
                if (fVar2.f9145j) {
                    n6 = fVar.f9143g;
                    n8 = fVar2.f9143g;
                }
            }
        }
        if (z3 && (mVar = this.f8755e) != null) {
            z2.f fVar3 = mVar.f9168h;
            if (fVar3.f9145j) {
                z2.f fVar4 = mVar.i;
                if (fVar4.f9145j) {
                    n7 = fVar3.f9143g;
                    n9 = fVar4.f9143g;
                }
            }
        }
        int i9 = n9 - n7;
        if (n8 - n6 < 0 || i9 < 0 || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n7 == Integer.MIN_VALUE || n7 == Integer.MAX_VALUE || n8 == Integer.MIN_VALUE || n8 == Integer.MAX_VALUE || n9 == Integer.MIN_VALUE || n9 == Integer.MAX_VALUE) {
            n6 = 0;
            n7 = 0;
            n8 = 0;
            n9 = 0;
        }
        int i10 = n8 - n6;
        int i11 = n9 - n7;
        this.Y = n6;
        this.Z = n7;
        if (this.f8760g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f8777p0;
        int i12 = iArr[0];
        if (i12 == 1 && i10 < (i8 = this.U)) {
            i10 = i8;
        }
        if (iArr[1] == 1 && i11 < (i = this.V)) {
            i11 = i;
        }
        this.U = i10;
        this.V = i11;
        int i13 = this.f8752c0;
        if (i11 < i13) {
            this.V = i13;
        }
        int i14 = this.f8750b0;
        if (i10 < i14) {
            this.U = i14;
        }
        int i15 = this.f8783v;
        if (i15 > 0 && i12 == 3) {
            this.U = Math.min(this.U, i15);
        }
        int i16 = this.f8786y;
        if (i16 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i16);
        }
        int i17 = this.U;
        if (i10 != i17) {
            this.f8761h = i17;
        }
        int i18 = this.V;
        if (i11 != i18) {
            this.i = i18;
        }
    }

    public final void a(e eVar, w2.c cVar, HashSet hashSet, int i, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f8739a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f8742d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f8739a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f8742d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f8739a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f8742d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f8739a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f8742d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f8739a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f8742d.a(eVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.f8760g0 == r14) goto L374;
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
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c5  */
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
    /* JADX WARN: Type inference failed for: r58v0, types: [y2.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(w2.c cVar, boolean z3) {
        boolean z7;
        boolean z8;
        boolean z9;
        ?? r17;
        int i;
        boolean z10;
        boolean z11;
        d dVar;
        d dVar2;
        boolean[] zArr;
        c cVar2;
        boolean[] zArr2;
        c cVar3;
        c cVar4;
        boolean z12;
        boolean z13;
        boolean z14;
        int i8;
        int i9;
        int[] iArr;
        float f6;
        c cVar5;
        w2.f fVar;
        c cVar6;
        int i10;
        int i11;
        int i12;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        c cVar7;
        boolean z18;
        char c8;
        boolean z19;
        int i14;
        int[] iArr2;
        c cVar8;
        w2.f fVar2;
        w2.f fVar3;
        c cVar9;
        int[] iArr3;
        w2.f fVar4;
        boolean z20;
        boolean z21;
        boolean z22;
        w2.f fVar5;
        c cVar10;
        w2.f fVar6;
        int i15;
        boolean[] zArr3;
        w2.f fVar7;
        w2.f fVar8;
        w2.f fVar9;
        int i16;
        int i17;
        boolean z23;
        int i18;
        w2.f fVar10;
        w2.f fVar11;
        ?? r27;
        m mVar;
        z2.f fVar12;
        d dVar3;
        boolean z24;
        k kVar;
        z2.f fVar13;
        int i19;
        int i20;
        boolean x7;
        int i21;
        boolean y7;
        k kVar2;
        m mVar2;
        boolean z25;
        w2.c cVar11 = cVar;
        c cVar12 = this.I;
        w2.f k3 = cVar11.k(cVar12);
        c cVar13 = this.K;
        w2.f k7 = cVar11.k(cVar13);
        c cVar14 = this.J;
        w2.f k8 = cVar11.k(cVar14);
        c cVar15 = this.L;
        w2.f k9 = cVar11.k(cVar15);
        c cVar16 = this.M;
        w2.f k10 = cVar11.k(cVar16);
        d dVar4 = this.T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f8777p0;
            r17 = 0;
            z7 = false;
            r17 = 0;
            z9 = iArr4[0] == 2;
            boolean z26 = iArr4[1] == 2;
            int i22 = this.f8778q;
            if (i22 != 1) {
                if (i22 == 2) {
                    z9 = false;
                }
                z8 = z26;
            } else {
                z8 = false;
            }
            i = this.f8760g0;
            boolean[] zArr4 = this.S;
            boolean z27 = z8;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z10 = z9;
                int i23 = r17;
                while (true) {
                    if (i23 < size) {
                        int i24 = size;
                        HashSet hashSet = ((c) arrayList.get(i23)).f8739a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i23++;
                        size = i24;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z10 = z9;
            }
            z11 = this.f8766k;
            if (!z11 || this.f8768l) {
                if (z11) {
                    cVar11.d(k3, this.Y);
                    cVar11.d(k7, this.Y + this.U);
                    if (z10 && (dVar2 = this.T) != null) {
                        e eVar = (e) dVar2;
                        WeakReference weakReference = eVar.H0;
                        if (weakReference == null || weakReference.get() == null || cVar12.d() > ((c) eVar.H0.get()).d()) {
                            eVar.H0 = new WeakReference(cVar12);
                        }
                        WeakReference weakReference2 = eVar.J0;
                        if (weakReference2 == null || weakReference2.get() == null || cVar13.d() > ((c) eVar.J0.get()).d()) {
                            eVar.J0 = new WeakReference(cVar13);
                        }
                    }
                }
                if (this.f8768l) {
                    cVar11.d(k8, this.Z);
                    cVar11.d(k9, this.Z + this.V);
                    HashSet hashSet2 = cVar16.f8739a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.d(k10, this.Z + this.f8748a0);
                    }
                    if (z27 && (dVar = this.T) != null) {
                        e eVar2 = (e) dVar;
                        WeakReference weakReference3 = eVar2.G0;
                        if (weakReference3 == null || weakReference3.get() == null || cVar14.d() > ((c) eVar2.G0.get()).d()) {
                            eVar2.G0 = new WeakReference(cVar14);
                        }
                        WeakReference weakReference4 = eVar2.I0;
                        if (weakReference4 == null || weakReference4.get() == null || cVar15.d() > ((c) eVar2.I0.get()).d()) {
                            eVar2.I0 = new WeakReference(cVar15);
                        }
                    }
                }
                if (this.f8766k && this.f8768l) {
                    boolean z28 = r17;
                    this.f8766k = z28;
                    this.f8768l = z28;
                    return;
                }
            }
            zArr = this.f8757f;
            if (z3 || (kVar2 = this.f8753d) == null || (mVar2 = this.f8755e) == null) {
                cVar2 = cVar16;
                zArr2 = zArr;
            } else {
                cVar2 = cVar16;
                z2.f fVar14 = kVar2.f9168h;
                zArr2 = zArr;
                if (fVar14.f9145j && kVar2.i.f9145j && mVar2.f9168h.f9145j && mVar2.i.f9145j) {
                    cVar11.d(k3, fVar14.f9143g);
                    cVar11.d(k7, this.f8753d.i.f9143g);
                    cVar11.d(k8, this.f8755e.f9168h.f9143g);
                    cVar11.d(k9, this.f8755e.i.f9143g);
                    cVar11.d(k10, this.f8755e.f9153k.f9143g);
                    if (this.T != null) {
                        if (z10 && zArr2[0] && !x()) {
                            cVar11.f(cVar11.k(this.T.K), k7, 0, 8);
                        }
                        if (z27 && zArr2[1] && !y()) {
                            z25 = false;
                            cVar11.f(cVar11.k(this.T.L), k9, 0, 8);
                            this.f8766k = z25;
                            this.f8768l = z25;
                            return;
                        }
                    }
                    z25 = false;
                    this.f8766k = z25;
                    this.f8768l = z25;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    x7 = true;
                    i21 = 1;
                } else {
                    x7 = x();
                    i21 = 1;
                }
                if (w(i21)) {
                    ((e) this.T).R(this, i21);
                    y7 = true;
                } else {
                    y7 = y();
                }
                if (!x7 && z10 && this.f8760g0 != 8 && cVar12.f8744f == null && cVar13.f8744f == null) {
                    cVar3 = cVar12;
                    cVar11.f(cVar11.k(this.T.K), k7, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!y7 && z27 && this.f8760g0 != 8 && cVar14.f8744f == null && cVar15.f8744f == null && cVar2 == null) {
                    cVar11.f(cVar11.k(this.T.L), k9, 0, 1);
                }
                cVar4 = cVar13;
                z12 = z27;
                z14 = y7;
                z13 = x7;
            } else {
                cVar3 = cVar12;
                cVar4 = cVar13;
                z12 = z27;
                z13 = false;
                z14 = false;
            }
            i8 = this.U;
            i9 = this.f8750b0;
            if (i8 >= i9) {
                i9 = i8;
            }
            int i25 = this.V;
            c cVar17 = cVar4;
            int i26 = this.f8752c0;
            int i27 = i25 >= i26 ? i26 : i25;
            iArr = this.f8777p0;
            int i28 = iArr[0];
            boolean z29 = z12;
            boolean z30 = i28 == 3;
            int i29 = iArr[1];
            boolean z31 = i29 == 3;
            int i30 = this.X;
            this.A = i30;
            f6 = this.W;
            this.B = f6;
            int i31 = this.f8779r;
            int i32 = this.f8780s;
            if (f6 <= 0.0f) {
                cVar5 = cVar15;
                if (this.f8760g0 != 8) {
                    int i33 = (i28 == 3 && i31 == 0) ? 3 : i31;
                    if (i29 == 3 && i32 == 0) {
                        fVar = k9;
                        i20 = 3;
                    } else {
                        fVar = k9;
                        i20 = i32;
                    }
                    if (i28 == 3 && i29 == 3 && i33 == 3 && i20 == 3) {
                        if (i30 == -1) {
                            if (z30 && !z31) {
                                this.A = 0;
                            } else if (!z30 && z31) {
                                this.A = 1;
                                if (i30 == -1) {
                                    this.B = 1.0f / f6;
                                }
                            }
                        }
                        if (this.A == 0 && (!cVar14.h() || !cVar5.h())) {
                            this.A = 1;
                        } else if (this.A == 1 && (!cVar3.h() || !cVar17.h())) {
                            this.A = 0;
                        }
                        if (this.A == -1 && (!cVar14.h() || !cVar5.h() || !cVar3.h() || !cVar17.h())) {
                            if (cVar14.h() && cVar5.h()) {
                                this.A = 0;
                            } else if (cVar3.h() && cVar17.h()) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                        if (this.A == -1) {
                            int i34 = this.f8782u;
                            if (i34 > 0 && this.f8785x == 0) {
                                this.A = 0;
                            } else if (i34 == 0 && this.f8785x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i28 == 3 && i33 == 3) {
                        this.A = 0;
                        i9 = (int) (f6 * i25);
                        if (i29 != 3) {
                            cVar6 = cVar2;
                            i10 = i27;
                            i11 = 4;
                            z15 = false;
                            i12 = i20;
                            int[] iArr5 = this.f8781t;
                            iArr5[0] = i11;
                            iArr5[1] = i12;
                            if (z15) {
                            }
                            z16 = false;
                            if (z15) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z17) {
                            }
                            cVar7 = this.P;
                            z18 = !cVar7.h();
                            c8 = '\b';
                            z19 = zArr4[0];
                            boolean z32 = zArr4[1];
                            i14 = this.f8774o;
                            iArr2 = this.C;
                            if (i14 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k3;
                            fVar3 = k7;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k10;
                            z20 = z13;
                            z21 = z10;
                            z22 = z29;
                            fVar5 = k8;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i15 = i11;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i16 = 0;
                            i17 = 8;
                            z23 = true;
                            i18 = 1;
                            if (this.f8776p == 2) {
                            }
                            if (i18 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z15) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f8766k = false;
                            this.f8768l = false;
                        }
                    } else if (i29 == 3 && i20 == 3) {
                        this.A = 1;
                        if (i30 == -1) {
                            this.B = 1.0f / f6;
                        }
                        i10 = (int) (this.B * i8);
                        if (i28 == 3) {
                            i11 = i33;
                            cVar6 = cVar2;
                            z15 = true;
                            i12 = i20;
                            int[] iArr52 = this.f8781t;
                            iArr52[0] = i11;
                            iArr52[1] = i12;
                            if (z15) {
                            }
                            z16 = false;
                            if (z15) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z17) {
                            }
                            cVar7 = this.P;
                            z18 = !cVar7.h();
                            c8 = '\b';
                            z19 = zArr4[0];
                            boolean z322 = zArr4[1];
                            i14 = this.f8774o;
                            iArr2 = this.C;
                            if (i14 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k3;
                            fVar3 = k7;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k10;
                            z20 = z13;
                            z21 = z10;
                            z22 = z29;
                            fVar5 = k8;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i15 = i11;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i16 = 0;
                            i17 = 8;
                            z23 = true;
                            i18 = 1;
                            if (this.f8776p == 2) {
                            }
                            if (i18 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z15) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f8766k = false;
                            this.f8768l = false;
                        }
                        i11 = i33;
                        cVar6 = cVar2;
                        i12 = 4;
                        z15 = false;
                        int[] iArr522 = this.f8781t;
                        iArr522[0] = i11;
                        iArr522[1] = i12;
                        if (z15) {
                            i13 = -1;
                        } else {
                            int i35 = this.A;
                            i13 = -1;
                            if (i35 == 0 || i35 == -1) {
                                z16 = true;
                                boolean z33 = !z15 && ((i19 = this.A) == 1 || i19 == i13);
                                z17 = iArr[0] != 2 && (this instanceof e);
                                if (z17) {
                                    i9 = 0;
                                }
                                cVar7 = this.P;
                                z18 = !cVar7.h();
                                c8 = '\b';
                                z19 = zArr4[0];
                                boolean z3222 = zArr4[1];
                                i14 = this.f8774o;
                                iArr2 = this.C;
                                if (i14 != 2 && !this.f8766k) {
                                    if (z3 && (kVar = this.f8753d) != null) {
                                        fVar13 = kVar.f9168h;
                                        if (fVar13.f9145j || !kVar.i.f9145j) {
                                            c8 = '\b';
                                        } else if (z3) {
                                            cVar11.d(k3, fVar13.f9143g);
                                            cVar11.d(k7, this.f8753d.i.f9143g);
                                            if (this.T != null && z10 && zArr2[0] && !x()) {
                                                cVar11.f(cVar11.k(this.T.K), k7, 0, 8);
                                            }
                                        }
                                    }
                                    d dVar5 = this.T;
                                    w2.f k11 = dVar5 == null ? cVar11.k(dVar5.K) : null;
                                    d dVar6 = this.T;
                                    w2.f k12 = dVar6 == null ? cVar11.k(dVar6.I) : null;
                                    z21 = z10;
                                    i15 = i11;
                                    z20 = z13;
                                    cVar9 = cVar7;
                                    iArr3 = iArr2;
                                    boolean z34 = z16;
                                    fVar2 = k3;
                                    z22 = z29;
                                    fVar5 = k8;
                                    fVar3 = k7;
                                    cVar10 = cVar5;
                                    fVar6 = fVar;
                                    cVar8 = cVar6;
                                    fVar4 = k10;
                                    zArr3 = zArr2;
                                    cVar11 = cVar;
                                    d(cVar11, true, z21, z22, zArr2[0], k12, k11, iArr[0], z17, this.I, this.K, this.Y, i9, this.f8750b0, iArr2[0], this.f8754d0, z34, iArr[1] == 3, z20, z14, z19, i15, i12, this.f8782u, this.f8783v, this.f8784w, z18);
                                    if (z3 && (mVar = this.f8755e) != null) {
                                        fVar12 = mVar.f9168h;
                                        if (fVar12.f9145j && mVar.i.f9145j) {
                                            int i36 = fVar12.f9143g;
                                            fVar7 = fVar5;
                                            cVar11.d(fVar7, i36);
                                            fVar8 = fVar6;
                                            cVar11.d(fVar8, this.f8755e.i.f9143g);
                                            fVar9 = fVar4;
                                            cVar11.d(fVar9, this.f8755e.f9153k.f9143g);
                                            dVar3 = this.T;
                                            if (dVar3 == null && !z14 && z22) {
                                                z24 = true;
                                                z24 = true;
                                                if (zArr3[1]) {
                                                    i16 = 0;
                                                    i17 = 8;
                                                    cVar11.f(cVar11.k(dVar3.L), fVar8, 0, 8);
                                                } else {
                                                    i16 = 0;
                                                    i17 = 8;
                                                }
                                            } else {
                                                i16 = 0;
                                                i17 = 8;
                                                z24 = true;
                                            }
                                            i18 = i16;
                                            z23 = z24;
                                            if (this.f8776p == 2) {
                                                i18 = i16;
                                            }
                                            if (i18 != 0 || this.f8768l) {
                                                fVar10 = fVar7;
                                                fVar11 = fVar8;
                                            } else {
                                                int i37 = (iArr[z23 ? 1 : 0] == 2 && (this instanceof e)) ? z23 ? 1 : 0 : i16;
                                                int i38 = i37 != 0 ? i16 : i10;
                                                d dVar7 = this.T;
                                                w2.f k13 = dVar7 != null ? cVar11.k(dVar7.L) : null;
                                                d dVar8 = this.T;
                                                w2.f k14 = dVar8 != null ? cVar11.k(dVar8.J) : null;
                                                int i39 = this.f8748a0;
                                                if (i39 <= 0) {
                                                    r27 = z18;
                                                }
                                                c cVar18 = cVar8;
                                                if (cVar18.f8744f != null) {
                                                    cVar11.e(fVar9, fVar7, i39, i17);
                                                    cVar11.e(fVar9, cVar11.k(cVar18.f8744f), cVar18.e(), i17);
                                                    if (z22) {
                                                        cVar11.f(k13, cVar11.k(cVar10), i16, 5);
                                                    }
                                                    r27 = i16;
                                                } else if (this.f8760g0 == i17) {
                                                    cVar11.e(fVar9, fVar7, cVar18.e(), i17);
                                                    r27 = z18;
                                                } else {
                                                    cVar11.e(fVar9, fVar7, i39, i17);
                                                    r27 = z18;
                                                }
                                                boolean z35 = zArr3[z23 ? 1 : 0];
                                                int i40 = i16;
                                                int i41 = iArr[z23 ? 1 : 0];
                                                int i42 = this.Z;
                                                int i43 = this.f8752c0;
                                                int i44 = iArr3[z23 ? 1 : 0];
                                                float f8 = this.f8756e0;
                                                int i45 = iArr[i40];
                                                boolean z36 = z23 ? 1 : 0;
                                                ?? r18 = z23;
                                                if (i45 != 3) {
                                                    r18 = i40;
                                                }
                                                fVar11 = fVar8;
                                                fVar10 = fVar7;
                                                cVar11 = cVar;
                                                d(cVar11, false, z22, z21, z35, k14, k13, i41, i37, this.J, this.L, i42, i38, i43, i44, f8, z33, r18, z14, z20, z3222, i12, i15, this.f8785x, this.f8786y, this.f8787z, r27);
                                            }
                                            if (z15) {
                                                if (this.A == 1) {
                                                    float f9 = this.B;
                                                    w2.b l3 = cVar11.l();
                                                    l3.f7843d.g(fVar11, -1.0f);
                                                    l3.f7843d.g(fVar10, 1.0f);
                                                    l3.f7843d.g(fVar3, f9);
                                                    l3.f7843d.g(fVar2, -f9);
                                                    cVar11.c(l3);
                                                } else {
                                                    float f10 = this.B;
                                                    w2.b l7 = cVar11.l();
                                                    l7.f7843d.g(fVar3, -1.0f);
                                                    l7.f7843d.g(fVar2, 1.0f);
                                                    l7.f7843d.g(fVar11, f10);
                                                    l7.f7843d.g(fVar10, -f10);
                                                    cVar11.c(l7);
                                                }
                                            }
                                            if (cVar9.h()) {
                                                c cVar19 = cVar9;
                                                d dVar9 = cVar19.f8744f.f8742d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e8 = cVar19.e();
                                                w2.f k15 = cVar11.k(i(2));
                                                w2.f k16 = cVar11.k(i(3));
                                                w2.f k17 = cVar11.k(i(4));
                                                w2.f k18 = cVar11.k(i(5));
                                                w2.f k19 = cVar11.k(dVar9.i(2));
                                                w2.f k20 = cVar11.k(dVar9.i(3));
                                                w2.f k21 = cVar11.k(dVar9.i(4));
                                                w2.f k22 = cVar11.k(dVar9.i(5));
                                                w2.b l8 = cVar11.l();
                                                double d8 = radians;
                                                double sin = Math.sin(d8);
                                                double d9 = e8;
                                                l8.f7843d.g(k20, 0.5f);
                                                l8.f7843d.g(k22, 0.5f);
                                                l8.f7843d.g(k16, -0.5f);
                                                l8.f7843d.g(k18, -0.5f);
                                                l8.f7841b = -((float) (sin * d9));
                                                cVar11.c(l8);
                                                w2.b l9 = cVar11.l();
                                                float cos = (float) (Math.cos(d8) * d9);
                                                l9.f7843d.g(k19, 0.5f);
                                                l9.f7843d.g(k21, 0.5f);
                                                l9.f7843d.g(k15, -0.5f);
                                                l9.f7843d.g(k17, -0.5f);
                                                l9.f7841b = -cos;
                                                cVar11.c(l9);
                                            }
                                            this.f8766k = false;
                                            this.f8768l = false;
                                        }
                                    }
                                    fVar7 = fVar5;
                                    fVar8 = fVar6;
                                    fVar9 = fVar4;
                                    i16 = 0;
                                    i17 = 8;
                                    z23 = true;
                                    i18 = 1;
                                    if (this.f8776p == 2) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    fVar10 = fVar7;
                                    fVar11 = fVar8;
                                    if (z15) {
                                    }
                                    if (cVar9.h()) {
                                    }
                                    this.f8766k = false;
                                    this.f8768l = false;
                                }
                                cVar8 = cVar6;
                                fVar2 = k3;
                                fVar3 = k7;
                                cVar9 = cVar7;
                                iArr3 = iArr2;
                                fVar4 = k10;
                                z20 = z13;
                                z21 = z10;
                                z22 = z29;
                                fVar5 = k8;
                                cVar10 = cVar5;
                                fVar6 = fVar;
                                i15 = i11;
                                zArr3 = zArr2;
                                if (z3) {
                                    fVar12 = mVar.f9168h;
                                    if (fVar12.f9145j) {
                                        int i362 = fVar12.f9143g;
                                        fVar7 = fVar5;
                                        cVar11.d(fVar7, i362);
                                        fVar8 = fVar6;
                                        cVar11.d(fVar8, this.f8755e.i.f9143g);
                                        fVar9 = fVar4;
                                        cVar11.d(fVar9, this.f8755e.f9153k.f9143g);
                                        dVar3 = this.T;
                                        if (dVar3 == null) {
                                        }
                                        i16 = 0;
                                        i17 = 8;
                                        z24 = true;
                                        i18 = i16;
                                        z23 = z24;
                                        if (this.f8776p == 2) {
                                        }
                                        if (i18 != 0) {
                                        }
                                        fVar10 = fVar7;
                                        fVar11 = fVar8;
                                        if (z15) {
                                        }
                                        if (cVar9.h()) {
                                        }
                                        this.f8766k = false;
                                        this.f8768l = false;
                                    }
                                }
                                fVar7 = fVar5;
                                fVar8 = fVar6;
                                fVar9 = fVar4;
                                i16 = 0;
                                i17 = 8;
                                z23 = true;
                                i18 = 1;
                                if (this.f8776p == 2) {
                                }
                                if (i18 != 0) {
                                }
                                fVar10 = fVar7;
                                fVar11 = fVar8;
                                if (z15) {
                                }
                                if (cVar9.h()) {
                                }
                                this.f8766k = false;
                                this.f8768l = false;
                            }
                        }
                        z16 = false;
                        if (z15) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z17) {
                        }
                        cVar7 = this.P;
                        z18 = !cVar7.h();
                        c8 = '\b';
                        z19 = zArr4[0];
                        boolean z32222 = zArr4[1];
                        i14 = this.f8774o;
                        iArr2 = this.C;
                        if (i14 != 2) {
                            if (z3) {
                                fVar13 = kVar.f9168h;
                                if (fVar13.f9145j) {
                                }
                                c8 = '\b';
                            }
                            d dVar52 = this.T;
                            if (dVar52 == null) {
                            }
                            d dVar62 = this.T;
                            if (dVar62 == null) {
                            }
                            z21 = z10;
                            i15 = i11;
                            z20 = z13;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            boolean z342 = z16;
                            fVar2 = k3;
                            z22 = z29;
                            fVar5 = k8;
                            fVar3 = k7;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            cVar8 = cVar6;
                            fVar4 = k10;
                            zArr3 = zArr2;
                            cVar11 = cVar;
                            d(cVar11, true, z21, z22, zArr2[0], k12, k11, iArr[0], z17, this.I, this.K, this.Y, i9, this.f8750b0, iArr2[0], this.f8754d0, z342, iArr[1] == 3, z20, z14, z19, i15, i12, this.f8782u, this.f8783v, this.f8784w, z18);
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i16 = 0;
                            i17 = 8;
                            z23 = true;
                            i18 = 1;
                            if (this.f8776p == 2) {
                            }
                            if (i18 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z15) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f8766k = false;
                            this.f8768l = false;
                        }
                        cVar8 = cVar6;
                        fVar2 = k3;
                        fVar3 = k7;
                        cVar9 = cVar7;
                        iArr3 = iArr2;
                        fVar4 = k10;
                        z20 = z13;
                        z21 = z10;
                        z22 = z29;
                        fVar5 = k8;
                        cVar10 = cVar5;
                        fVar6 = fVar;
                        i15 = i11;
                        zArr3 = zArr2;
                        if (z3) {
                        }
                        fVar7 = fVar5;
                        fVar8 = fVar6;
                        fVar9 = fVar4;
                        i16 = 0;
                        i17 = 8;
                        z23 = true;
                        i18 = 1;
                        if (this.f8776p == 2) {
                        }
                        if (i18 != 0) {
                        }
                        fVar10 = fVar7;
                        fVar11 = fVar8;
                        if (z15) {
                        }
                        if (cVar9.h()) {
                        }
                        this.f8766k = false;
                        this.f8768l = false;
                    }
                    i11 = i33;
                    cVar6 = cVar2;
                    i10 = i27;
                    z15 = true;
                    i12 = i20;
                    int[] iArr5222 = this.f8781t;
                    iArr5222[0] = i11;
                    iArr5222[1] = i12;
                    if (z15) {
                    }
                    z16 = false;
                    if (z15) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z17) {
                    }
                    cVar7 = this.P;
                    z18 = !cVar7.h();
                    c8 = '\b';
                    z19 = zArr4[0];
                    boolean z322222 = zArr4[1];
                    i14 = this.f8774o;
                    iArr2 = this.C;
                    if (i14 != 2) {
                    }
                    cVar8 = cVar6;
                    fVar2 = k3;
                    fVar3 = k7;
                    cVar9 = cVar7;
                    iArr3 = iArr2;
                    fVar4 = k10;
                    z20 = z13;
                    z21 = z10;
                    z22 = z29;
                    fVar5 = k8;
                    cVar10 = cVar5;
                    fVar6 = fVar;
                    i15 = i11;
                    zArr3 = zArr2;
                    if (z3) {
                    }
                    fVar7 = fVar5;
                    fVar8 = fVar6;
                    fVar9 = fVar4;
                    i16 = 0;
                    i17 = 8;
                    z23 = true;
                    i18 = 1;
                    if (this.f8776p == 2) {
                    }
                    if (i18 != 0) {
                    }
                    fVar10 = fVar7;
                    fVar11 = fVar8;
                    if (z15) {
                    }
                    if (cVar9.h()) {
                    }
                    this.f8766k = false;
                    this.f8768l = false;
                }
            } else {
                cVar5 = cVar15;
            }
            fVar = k9;
            cVar6 = cVar2;
            i10 = i27;
            i11 = i31;
            i12 = i32;
            z15 = false;
            int[] iArr52222 = this.f8781t;
            iArr52222[0] = i11;
            iArr52222[1] = i12;
            if (z15) {
            }
            z16 = false;
            if (z15) {
            }
            if (iArr[0] != 2) {
            }
            if (z17) {
            }
            cVar7 = this.P;
            z18 = !cVar7.h();
            c8 = '\b';
            z19 = zArr4[0];
            boolean z3222222 = zArr4[1];
            i14 = this.f8774o;
            iArr2 = this.C;
            if (i14 != 2) {
            }
            cVar8 = cVar6;
            fVar2 = k3;
            fVar3 = k7;
            cVar9 = cVar7;
            iArr3 = iArr2;
            fVar4 = k10;
            z20 = z13;
            z21 = z10;
            z22 = z29;
            fVar5 = k8;
            cVar10 = cVar5;
            fVar6 = fVar;
            i15 = i11;
            zArr3 = zArr2;
            if (z3) {
            }
            fVar7 = fVar5;
            fVar8 = fVar6;
            fVar9 = fVar4;
            i16 = 0;
            i17 = 8;
            z23 = true;
            i18 = 1;
            if (this.f8776p == 2) {
            }
            if (i18 != 0) {
            }
            fVar10 = fVar7;
            fVar11 = fVar8;
            if (z15) {
            }
            if (cVar9.h()) {
            }
            this.f8766k = false;
            this.f8768l = false;
        }
        z7 = false;
        z8 = z7 ? 1 : 0;
        z9 = z8;
        r17 = z7;
        i = this.f8760g0;
        boolean[] zArr42 = this.S;
        boolean z272 = z8;
        if (i != 8) {
        }
        z11 = this.f8766k;
        if (!z11) {
        }
        if (z11) {
        }
        if (this.f8768l) {
        }
        if (this.f8766k) {
            boolean z282 = r17;
            this.f8766k = z282;
            this.f8768l = z282;
            return;
        }
        zArr = this.f8757f;
        if (z3) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i8 = this.U;
        i9 = this.f8750b0;
        if (i8 >= i9) {
        }
        int i252 = this.V;
        c cVar172 = cVar4;
        int i262 = this.f8752c0;
        if (i252 >= i262) {
        }
        iArr = this.f8777p0;
        int i282 = iArr[0];
        boolean z292 = z12;
        if (i282 == 3) {
        }
        int i292 = iArr[1];
        if (i292 == 3) {
        }
        int i302 = this.X;
        this.A = i302;
        f6 = this.W;
        this.B = f6;
        int i312 = this.f8779r;
        int i322 = this.f8780s;
        if (f6 <= 0.0f) {
        }
        fVar = k9;
        cVar6 = cVar2;
        i10 = i27;
        i11 = i312;
        i12 = i322;
        z15 = false;
        int[] iArr522222 = this.f8781t;
        iArr522222[0] = i11;
        iArr522222[1] = i12;
        if (z15) {
        }
        z16 = false;
        if (z15) {
        }
        if (iArr[0] != 2) {
        }
        if (z17) {
        }
        cVar7 = this.P;
        z18 = !cVar7.h();
        c8 = '\b';
        z19 = zArr42[0];
        boolean z32222222 = zArr42[1];
        i14 = this.f8774o;
        iArr2 = this.C;
        if (i14 != 2) {
        }
        cVar8 = cVar6;
        fVar2 = k3;
        fVar3 = k7;
        cVar9 = cVar7;
        iArr3 = iArr2;
        fVar4 = k10;
        z20 = z13;
        z21 = z10;
        z22 = z292;
        fVar5 = k8;
        cVar10 = cVar5;
        fVar6 = fVar;
        i15 = i11;
        zArr3 = zArr2;
        if (z3) {
        }
        fVar7 = fVar5;
        fVar8 = fVar6;
        fVar9 = fVar4;
        i16 = 0;
        i17 = 8;
        z23 = true;
        i18 = 1;
        if (this.f8776p == 2) {
        }
        if (i18 != 0) {
        }
        fVar10 = fVar7;
        fVar11 = fVar8;
        if (z15) {
        }
        if (cVar9.h()) {
        }
        this.f8766k = false;
        this.f8768l = false;
    }

    public boolean c() {
        return this.f8760g0 != 8;
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
    public final void d(w2.c cVar, boolean z3, boolean z7, boolean z8, boolean z9, w2.f fVar, w2.f fVar2, int i, boolean z10, c cVar2, c cVar3, int i8, int i9, int i10, int i11, float f6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i12, int i13, int i14, int i15, float f8, boolean z16) {
        boolean z17;
        boolean z18;
        int i16;
        boolean z19;
        boolean z20;
        int i17;
        int i18;
        boolean z21;
        w2.f k3;
        w2.f k7;
        c cVar4;
        w2.f fVar3;
        boolean z22;
        int i19;
        w2.f fVar4;
        w2.f fVar5;
        w2.f fVar6;
        w2.f fVar7;
        int i20;
        int i21;
        int i22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        d dVar;
        int i23;
        int i24;
        c cVar5;
        boolean z27;
        int i25;
        boolean z28;
        int i26;
        int i27;
        HashSet hashSet;
        boolean z29;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z30;
        boolean z31;
        int i33;
        w2.c cVar6 = cVar;
        int i34 = i14;
        int i35 = i15;
        w2.f k8 = cVar6.k(cVar2);
        w2.f k9 = cVar6.k(cVar3);
        w2.f k10 = cVar6.k(cVar2.f8744f);
        w2.f k11 = cVar6.k(cVar3.f8744f);
        boolean h8 = cVar2.h();
        boolean h9 = cVar3.h();
        boolean h10 = this.P.h();
        int i36 = h9 ? (h8 ? 1 : 0) + 1 : h8 ? 1 : 0;
        if (h10) {
            i36++;
        }
        int i37 = i36;
        int i38 = z11 ? 3 : i12;
        int a8 = w2.e.a(i);
        boolean z32 = (a8 == 0 || a8 == 1 || a8 != 2 || i38 == 4) ? false : true;
        int i39 = this.f8761h;
        if (i39 == -1 || !z3) {
            i39 = i9;
            z17 = z32;
        } else {
            this.f8761h = -1;
            z17 = false;
        }
        int i40 = this.i;
        if (i40 == -1 || z3) {
            z18 = z17;
        } else {
            this.i = -1;
            i39 = i40;
            z18 = false;
        }
        boolean z33 = z18;
        if (this.f8760g0 == 8) {
            z19 = false;
            i16 = 0;
        } else {
            i16 = i39;
            z19 = z33;
        }
        if (z16) {
            if (!h8 && !h9 && !h10) {
                cVar6.d(k8, i8);
            } else if (h8 && !h9) {
                z20 = z19;
                i17 = 8;
                cVar6.e(k8, k10, cVar2.e(), 8);
            }
            z20 = z19;
            i17 = 8;
        } else {
            z20 = z19;
            i17 = 8;
        }
        if (z20) {
            if (i37 == 2 || z11 || !(i38 == 1 || i38 == 0)) {
                if (i34 == -2) {
                    i34 = i16;
                }
                if (i35 == -2) {
                    i35 = i16;
                }
                if (i16 > 0 && i38 != 1) {
                    i16 = 0;
                }
                if (i34 > 0) {
                    cVar6.f(k9, k8, i34, 8);
                    i16 = Math.max(i16, i34);
                }
                if (i35 > 0) {
                    if (!z7 || i38 != 1) {
                        cVar6.g(k9, k8, i35, 8);
                    }
                    i16 = Math.min(i16, i35);
                }
                if (i38 == 1) {
                    if (z7) {
                        cVar6.e(k9, k8, i16, 8);
                    } else if (z13) {
                        cVar6.e(k9, k8, i16, 5);
                        cVar6.g(k9, k8, i16, 8);
                    } else {
                        cVar6.e(k9, k8, i16, 5);
                        cVar6.g(k9, k8, i16, 8);
                    }
                } else if (i38 == 2) {
                    int i41 = cVar2.f8743e;
                    if (i41 == 3 || i41 == 5) {
                        k3 = cVar6.k(this.T.i(3));
                        k7 = cVar6.k(this.T.i(5));
                    } else {
                        k3 = cVar6.k(this.T.i(2));
                        k7 = cVar6.k(this.T.i(4));
                    }
                    w2.b l3 = cVar6.l();
                    int i42 = i34;
                    l3.f7843d.g(k9, -1.0f);
                    l3.f7843d.g(k8, 1.0f);
                    l3.f7843d.g(k7, f8);
                    l3.f7843d.g(k3, -f8);
                    cVar6.c(l3);
                    if (z7) {
                        z20 = false;
                    }
                    z21 = z9;
                    i18 = i42;
                } else {
                    i18 = i34;
                    z21 = true;
                }
            } else {
                int max = Math.max(i34, i16);
                if (i35 > 0) {
                    max = Math.min(i35, max);
                }
                cVar6.e(k9, k8, max, 8);
                z21 = z9;
                i18 = i34;
                z20 = false;
            }
            if (z16 || z13) {
                boolean z34 = z21;
                if (i37 >= 2 && z7 && z34) {
                    cVar6.f(k8, fVar, 0, 8);
                    c cVar7 = this.M;
                    boolean z35 = z3 || cVar7.f8744f == null;
                    if (!z3 && (cVar4 = cVar7.f8744f) != null) {
                        d dVar2 = cVar4.f8742d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f8777p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z35 = true;
                            }
                        }
                        z35 = false;
                    }
                    if (z35) {
                        cVar6.f(fVar2, k9, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h8 && !h9 && !h10) {
                cVar5 = cVar3;
                fVar6 = k9;
                z22 = z21;
                fVar3 = k11;
            } else if (!h8 || h9) {
                if (h8 || !h9) {
                    fVar3 = k11;
                    if (h8 && h9) {
                        d dVar3 = cVar2.f8744f.f8742d;
                        d dVar4 = cVar3.f8744f.f8742d;
                        z22 = z21;
                        d dVar5 = this.T;
                        int i43 = 6;
                        if (z20) {
                            if (i38 == 0) {
                                if (i35 != 0 || i18 != 0) {
                                    i31 = 5;
                                    i32 = 5;
                                    z30 = true;
                                    z31 = false;
                                    z24 = true;
                                } else if (k10.i && fVar3.i) {
                                    cVar6.e(k8, k10, cVar2.e(), 8);
                                    cVar6.e(k9, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i31 = 8;
                                    i32 = 8;
                                    z30 = false;
                                    z31 = true;
                                    z24 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i19 = i38;
                                    fVar5 = k8;
                                    fVar6 = k9;
                                    z25 = z31;
                                    fVar4 = fVar2;
                                    i21 = i31;
                                    fVar7 = k10;
                                    i20 = 6;
                                    z23 = z30;
                                    i22 = 4;
                                    if (z24 || fVar7 != fVar3 || dVar3 == dVar5) {
                                        z26 = true;
                                    } else {
                                        z24 = false;
                                        z26 = false;
                                    }
                                    if (z23) {
                                        dVar = dVar4;
                                        i23 = i18;
                                        i24 = i19;
                                        cVar5 = cVar3;
                                        z27 = z7;
                                    } else {
                                        if (z20 || z12 || z14 || fVar7 != fVar || fVar3 != fVar4) {
                                            z27 = z7;
                                            z29 = z26;
                                            i28 = i21;
                                        } else {
                                            i20 = 8;
                                            z27 = false;
                                            i28 = 8;
                                            z29 = false;
                                        }
                                        w2.f fVar8 = fVar7;
                                        i23 = i18;
                                        i24 = i19;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.b(fVar5, fVar8, cVar2.e(), f6, fVar3, fVar6, cVar3.e(), i20);
                                        fVar7 = fVar8;
                                        i21 = i28;
                                        z26 = z29;
                                    }
                                    if (this.f8760g0 != 8 && ((hashSet = cVar5.f8739a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z24) {
                                        if (z27 && fVar7 != fVar3 && !z20 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i21 = 6;
                                        }
                                        cVar6.f(fVar5, fVar7, cVar2.e(), i21);
                                        cVar6.g(fVar6, fVar3, -cVar5.e(), i21);
                                    }
                                    if (z27 || !z15 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i25 = i22;
                                        z28 = z26;
                                    } else {
                                        i25 = 6;
                                        i21 = 6;
                                        z28 = true;
                                    }
                                    if (z28) {
                                        if (z25 && (!z14 || z8)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i43 = i25;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i43 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i43 = 5;
                                            }
                                            i25 = Math.max(z14 ? 5 : i43, i25);
                                        }
                                        if (z27) {
                                            i25 = Math.min(i21, i25);
                                            if (z11 && !z14 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i27 = 4;
                                                cVar6.e(fVar5, fVar7, cVar2.e(), i27);
                                                cVar6.e(fVar6, fVar3, -cVar5.e(), i27);
                                            }
                                        }
                                        i27 = i25;
                                        cVar6.e(fVar5, fVar7, cVar2.e(), i27);
                                        cVar6.e(fVar6, fVar3, -cVar5.e(), i27);
                                    }
                                    if (z27) {
                                        int e8 = fVar == fVar7 ? cVar2.e() : 0;
                                        if (fVar7 != fVar) {
                                            cVar6.f(fVar5, fVar, e8, 5);
                                        }
                                    }
                                    if (z27 && z20 && i10 == 0 && i23 == 0) {
                                        if (z20 || i24 != 3) {
                                            i26 = 5;
                                            cVar6.f(fVar6, fVar5, 0, 5);
                                        } else {
                                            cVar6.f(fVar6, fVar5, 0, 8);
                                        }
                                    }
                                    i26 = 5;
                                } else {
                                    cVar6 = cVar;
                                    fVar5 = k8;
                                    fVar6 = k9;
                                    z25 = z31;
                                    i21 = i31;
                                    fVar7 = k10;
                                    i20 = 6;
                                    z23 = z30;
                                    i22 = i32;
                                    i19 = i38;
                                    fVar4 = fVar2;
                                    if (z24) {
                                    }
                                    z26 = true;
                                    if (z23) {
                                    }
                                    if (this.f8760g0 != 8) {
                                    }
                                    if (z24) {
                                    }
                                    if (z27) {
                                    }
                                    i25 = i22;
                                    z28 = z26;
                                    if (z28) {
                                    }
                                    if (z27) {
                                    }
                                    if (z27) {
                                        if (z20) {
                                        }
                                        i26 = 5;
                                        cVar6.f(fVar6, fVar5, 0, 5);
                                    }
                                    i26 = 5;
                                }
                            } else {
                                if (i38 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        cVar6 = cVar;
                                        i19 = i38;
                                        fVar5 = k8;
                                        fVar6 = k9;
                                        fVar7 = k10;
                                        i20 = 6;
                                        i21 = 5;
                                    } else {
                                        cVar6 = cVar;
                                        i19 = i38;
                                        fVar5 = k8;
                                        fVar6 = k9;
                                        fVar7 = k10;
                                        i20 = 6;
                                        i21 = 5;
                                        i22 = 5;
                                        z23 = true;
                                        z24 = true;
                                        z25 = false;
                                        fVar4 = fVar2;
                                        if (z24) {
                                        }
                                        z26 = true;
                                        if (z23) {
                                        }
                                        if (this.f8760g0 != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z27) {
                                        }
                                        i25 = i22;
                                        z28 = z26;
                                        if (z28) {
                                        }
                                        if (z27) {
                                        }
                                        if (z27) {
                                        }
                                        i26 = 5;
                                    }
                                } else if (i38 == 1) {
                                    cVar6 = cVar;
                                    i19 = i38;
                                    fVar5 = k8;
                                    fVar6 = k9;
                                    fVar7 = k10;
                                    i20 = 6;
                                    i21 = 8;
                                } else if (i38 == 3) {
                                    i19 = i38;
                                    if (this.A != -1) {
                                        if (z11) {
                                            if (i13 == 2 || i13 == 1) {
                                                i29 = 5;
                                                i30 = 4;
                                            } else {
                                                i29 = 8;
                                                i30 = 5;
                                            }
                                            i22 = i30;
                                            fVar5 = k8;
                                            fVar6 = k9;
                                            fVar7 = k10;
                                            i20 = 6;
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                            fVar4 = fVar2;
                                        } else if (i35 > 0) {
                                            cVar6 = cVar;
                                            fVar4 = fVar2;
                                            fVar5 = k8;
                                            fVar6 = k9;
                                            fVar7 = k10;
                                            i20 = 6;
                                            i21 = 5;
                                        } else {
                                            if (i35 != 0 || i18 != 0) {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k8;
                                                fVar6 = k9;
                                                fVar7 = k10;
                                                i20 = 6;
                                                i21 = 5;
                                                i22 = 4;
                                            } else if (z14) {
                                                i29 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                fVar4 = fVar2;
                                                fVar5 = k8;
                                                fVar6 = k9;
                                                fVar7 = k10;
                                                i20 = 6;
                                                i22 = 4;
                                                z23 = true;
                                                z24 = true;
                                                z25 = true;
                                            } else {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k8;
                                                fVar6 = k9;
                                                fVar7 = k10;
                                                i20 = 6;
                                                i21 = 5;
                                                i22 = 8;
                                            }
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                            if (z24) {
                                            }
                                            z26 = true;
                                            if (z23) {
                                            }
                                            if (this.f8760g0 != 8) {
                                            }
                                            if (z24) {
                                            }
                                            if (z27) {
                                            }
                                            i25 = i22;
                                            z28 = z26;
                                            if (z28) {
                                            }
                                            if (z27) {
                                            }
                                            if (z27) {
                                            }
                                            i26 = 5;
                                        }
                                        i21 = i29;
                                        cVar6 = cVar;
                                        if (z24) {
                                        }
                                        z26 = true;
                                        if (z23) {
                                        }
                                        if (this.f8760g0 != 8) {
                                        }
                                        if (z24) {
                                        }
                                        if (z27) {
                                        }
                                        i25 = i22;
                                        z28 = z26;
                                        if (z28) {
                                        }
                                        if (z27) {
                                        }
                                        if (z27) {
                                        }
                                        i26 = 5;
                                    } else if (z14) {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k8;
                                        fVar6 = k9;
                                        fVar7 = k10;
                                        i21 = 8;
                                        i20 = z7 ? 5 : 4;
                                    } else {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k8;
                                        fVar6 = k9;
                                        fVar7 = k10;
                                        i21 = 8;
                                        i20 = 8;
                                    }
                                    i22 = 5;
                                    z23 = true;
                                    z24 = true;
                                    z25 = true;
                                    if (z24) {
                                    }
                                    z26 = true;
                                    if (z23) {
                                    }
                                    if (this.f8760g0 != 8) {
                                    }
                                    if (z24) {
                                    }
                                    if (z27) {
                                    }
                                    i25 = i22;
                                    z28 = z26;
                                    if (z28) {
                                    }
                                    if (z27) {
                                    }
                                    if (z27) {
                                    }
                                    i26 = 5;
                                } else {
                                    i19 = i38;
                                    cVar6 = cVar;
                                    fVar4 = fVar2;
                                    fVar5 = k8;
                                    fVar6 = k9;
                                    fVar7 = k10;
                                    i20 = 6;
                                    i21 = 5;
                                    i22 = 4;
                                    z23 = false;
                                    z24 = false;
                                }
                                i22 = 4;
                                z23 = true;
                                z24 = true;
                                z25 = false;
                                fVar4 = fVar2;
                                if (z24) {
                                }
                                z26 = true;
                                if (z23) {
                                }
                                if (this.f8760g0 != 8) {
                                }
                                if (z24) {
                                }
                                if (z27) {
                                }
                                i25 = i22;
                                z28 = z26;
                                if (z28) {
                                }
                                if (z27) {
                                }
                                if (z27) {
                                }
                                i26 = 5;
                            }
                            i33 = i26;
                            if (z27 && z22) {
                                int e9 = cVar5.f8744f != null ? cVar5.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar6.f(fVar2, fVar6, e9, i33);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i19 = i38;
                        if (k10.i && fVar3.i) {
                            cVar.b(k8, k10, cVar2.e(), f6, fVar3, k9, cVar3.e(), 8);
                            if (z7 && z22) {
                                int e10 = cVar3.f8744f != null ? cVar3.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar.f(fVar2, k9, e10, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar6 = cVar;
                        fVar4 = fVar2;
                        fVar5 = k8;
                        fVar6 = k9;
                        fVar7 = k10;
                        i20 = 6;
                        i21 = 5;
                        i22 = 4;
                        z23 = true;
                        z24 = true;
                        z25 = false;
                        if (z24) {
                        }
                        z26 = true;
                        if (z23) {
                        }
                        if (this.f8760g0 != 8) {
                        }
                        if (z24) {
                        }
                        if (z27) {
                        }
                        i25 = i22;
                        z28 = z26;
                        if (z28) {
                        }
                        if (z27) {
                        }
                        if (z27) {
                        }
                        i26 = 5;
                        i33 = i26;
                        if (z27) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    fVar3 = k11;
                    cVar6.e(k9, fVar3, -cVar3.e(), 8);
                    if (z7) {
                        cVar6.f(k8, fVar, 0, 5);
                        cVar5 = cVar3;
                        i26 = 5;
                        fVar6 = k9;
                        z22 = z21;
                        z27 = z7;
                        i33 = i26;
                        if (z27) {
                        }
                    }
                }
                cVar5 = cVar3;
                fVar6 = k9;
                z22 = z21;
            } else {
                cVar5 = cVar3;
                fVar6 = k9;
                z22 = z21;
                fVar3 = k11;
                z27 = z7;
                i33 = (z7 && (cVar2.f8744f.f8742d instanceof a)) ? 8 : 5;
                if (z27) {
                }
            }
            i26 = 5;
            z27 = z7;
            i33 = i26;
            if (z27) {
            }
        } else if (z10) {
            cVar6.e(k9, k8, 0, 3);
            if (i10 > 0) {
                cVar6.f(k9, k8, i10, i17);
            }
            if (i11 < Integer.MAX_VALUE) {
                cVar6.g(k9, k8, i11, i17);
            }
        } else {
            cVar6.e(k9, k8, i16, i17);
        }
        z21 = z9;
        i18 = i34;
        if (z16) {
        }
        boolean z342 = z21;
        if (i37 >= 2) {
        }
    }

    public final void e(int i, d dVar, int i8, int i9) {
        boolean z3;
        if (i == 7) {
            if (i8 != 7) {
                if (i8 == 2 || i8 == 4) {
                    e(2, dVar, i8, 0);
                    e(4, dVar, i8, 0);
                    i(7).a(dVar.i(i8), 0);
                    return;
                } else {
                    if (i8 == 3 || i8 == 5) {
                        e(3, dVar, i8, 0);
                        e(5, dVar, i8, 0);
                        i(7).a(dVar.i(i8), 0);
                        return;
                    }
                    return;
                }
            }
            c i10 = i(2);
            c i11 = i(4);
            c i12 = i(3);
            c i13 = i(5);
            boolean z7 = true;
            if ((i10 == null || !i10.h()) && (i11 == null || !i11.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i12 == null || !i12.h()) && (i13 == null || !i13.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z7 = false;
            }
            if (z3 && z7) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z3) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z7) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i8 == 2 || i8 == 4)) {
            c i14 = i(2);
            c i15 = dVar.i(i8);
            c i16 = i(4);
            i14.a(i15, 0);
            i16.a(i15, 0);
            i(8).a(i15, 0);
            return;
        }
        if (i == 9 && (i8 == 3 || i8 == 5)) {
            c i17 = dVar.i(i8);
            i(3).a(i17, 0);
            i(5).a(i17, 0);
            i(9).a(i17, 0);
            return;
        }
        if (i == 8 && i8 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i8), 0);
            return;
        }
        if (i == 9 && i8 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i8), 0);
            return;
        }
        c i18 = i(i);
        c i19 = dVar.i(i8);
        if (i18.i(i19)) {
            if (i == 6) {
                c i20 = i(3);
                c i21 = i(5);
                if (i20 != null) {
                    i20.j();
                }
                if (i21 != null) {
                    i21.j();
                }
            } else if (i == 3 || i == 5) {
                c i22 = i(6);
                if (i22 != null) {
                    i22.j();
                }
                c i23 = i(7);
                if (i23.f8744f != i19) {
                    i23.j();
                }
                c f6 = i(i).f();
                c i24 = i(9);
                if (i24.h()) {
                    f6.j();
                    i24.j();
                }
            } else if (i == 2 || i == 4) {
                c i25 = i(7);
                if (i25.f8744f != i19) {
                    i25.j();
                }
                c f8 = i(i).f();
                c i26 = i(8);
                if (i26.h()) {
                    f8.j();
                    i26.j();
                }
            }
            i18.a(i19, i9);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.f8742d == this) {
            e(cVar.f8743e, cVar2.f8742d, cVar2.f8743e, i);
        }
    }

    public final void g(w2.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f8748a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f8753d == null) {
            k kVar = new k(this);
            kVar.f9168h.f9141e = 4;
            kVar.i.f9141e = 5;
            kVar.f9166f = 0;
            this.f8753d = kVar;
        }
        if (this.f8755e == null) {
            m mVar = new m(this);
            z2.f fVar = new z2.f(mVar);
            mVar.f9153k = fVar;
            mVar.f9154l = null;
            mVar.f9168h.f9141e = 6;
            mVar.i.f9141e = 7;
            fVar.f9141e = 8;
            mVar.f9166f = 1;
            this.f8755e = mVar;
        }
    }

    public c i(int i) {
        switch (w2.e.a(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.J;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return this.K;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.N;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                return this.O;
            default:
                throw new AssertionError(q.r(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f8777p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f8760g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.L).f8744f) != null && cVar2.f8744f == cVar) {
                return cVar2.f8742d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f8744f;
        if (cVar4 == null || cVar4.f8744f != cVar3) {
            return null;
        }
        return cVar4.f8742d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.J).f8744f) != null && cVar2.f8744f == cVar) {
                return cVar2.f8742d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f8744f;
        if (cVar4 == null || cVar4.f8744f != cVar3) {
            return null;
        }
        return cVar4.f8742d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f8764j + ":{\n");
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
        int i8 = this.f8750b0;
        int[] iArr = this.C;
        int i9 = iArr[0];
        int i10 = this.f8782u;
        int i11 = this.f8779r;
        float f6 = this.f8784w;
        int[] iArr2 = this.f8777p0;
        int i12 = iArr2[0];
        float[] fArr = this.f8767k0;
        float f8 = fArr[0];
        o(sb, "    width", i, i8, i9, i10, i11, f6, i12);
        int i13 = this.V;
        int i14 = this.f8752c0;
        int i15 = iArr[1];
        int i16 = this.f8785x;
        int i17 = this.f8780s;
        float f9 = this.f8787z;
        int i18 = iArr2[1];
        float f10 = fArr[1];
        o(sb, "    height", i13, i14, i15, i16, i17, f9, i18);
        float f11 = this.W;
        int i19 = this.X;
        if (f11 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f11);
            sb.append(",");
            sb.append(i19);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f8754d0, 0.5f);
        H(sb, "    verticalBias", this.f8756e0, 0.5f);
        G(this.f8763i0, 0, "    horizontalChainStyle", sb);
        G(this.f8765j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f8760g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f8795x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f8796y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f8744f != null ? 1 : 0) + (this.K.f8744f != null ? 1 : 0) < 2;
        }
        if ((this.J.f8744f != null ? 1 : 0) + (this.L.f8744f != null ? 1 : 0) + (this.M.f8744f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f8762h0 != null) {
            str = "id: " + this.f8762h0 + " ";
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

    public final boolean u(int i, int i8) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f8744f;
            if (cVar6 == null || !cVar6.f8741c || (cVar4 = (cVar3 = this.K).f8744f) == null || !cVar4.f8741c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f8744f.d()) >= i8;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f8744f;
        if (cVar8 == null || !cVar8.f8741c || (cVar2 = (cVar = this.L).f8744f) == null || !cVar2.f8741c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f8744f.d()) >= i8;
    }

    public final void v(int i, int i8, int i9, int i10, d dVar) {
        i(i).b(dVar.i(i8), i9, i10, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i8 = i * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i8];
        c cVar4 = cVar3.f8744f;
        return (cVar4 == null || cVar4.f8744f == cVar3 || (cVar2 = (cVar = cVarArr[i8 + 1]).f8744f) == null || cVar2.f8744f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f8744f;
        if (cVar2 != null && cVar2.f8744f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f8744f;
        return cVar4 != null && cVar4.f8744f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f8744f;
        if (cVar2 != null && cVar2.f8744f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f8744f;
        return cVar4 != null && cVar4.f8744f == cVar3;
    }

    public final boolean z() {
        return this.f8759g && this.f8760g0 != 8;
    }
}
