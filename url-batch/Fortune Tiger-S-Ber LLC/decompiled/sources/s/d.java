package s;

import android.view.View;
import androidx.emoji2.text.s;
import androidx.fragment.app.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import t.k;
import t.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
    public int a0;

    /* renamed from: b, reason: collision with root package name */
    public t.c f3234b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3235b0;
    public t.c c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3236c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f3238d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f3240e0;
    public View f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3242g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f3243h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f3245i0;

    /* renamed from: j, reason: collision with root package name */
    public String f3246j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3247j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3248k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f3249k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3250l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f3251l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3252m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f3253m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3254n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3255n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3256o;

    /* renamed from: o0, reason: collision with root package name */
    public int f3257o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3258p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f3259p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3260q;

    /* renamed from: r, reason: collision with root package name */
    public int f3261r;

    /* renamed from: s, reason: collision with root package name */
    public int f3262s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3263t;

    /* renamed from: u, reason: collision with root package name */
    public int f3264u;

    /* renamed from: v, reason: collision with root package name */
    public int f3265v;

    /* renamed from: w, reason: collision with root package name */
    public float f3266w;

    /* renamed from: x, reason: collision with root package name */
    public int f3267x;

    /* renamed from: y, reason: collision with root package name */
    public int f3268y;

    /* renamed from: z, reason: collision with root package name */
    public float f3269z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3233a = false;

    /* renamed from: d, reason: collision with root package name */
    public k f3237d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f3239e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3241f = {true, true};
    public boolean g = true;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f3244i = -1;

    public d() {
        new HashMap();
        this.f3248k = false;
        this.f3250l = false;
        this.f3252m = false;
        this.f3254n = false;
        this.f3256o = -1;
        this.f3258p = -1;
        this.f3260q = 0;
        this.f3261r = 0;
        this.f3262s = 0;
        this.f3263t = new int[2];
        this.f3264u = 0;
        this.f3265v = 0;
        this.f3266w = 1.0f;
        this.f3267x = 0;
        this.f3268y = 0;
        this.f3269z = 1.0f;
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
        this.f3259p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.f3238d0 = 0.5f;
        this.f3240e0 = 0.5f;
        this.f3242g0 = 0;
        this.f3243h0 = null;
        this.f3245i0 = 0;
        this.f3247j0 = 0;
        this.f3249k0 = new float[]{-1.0f, -1.0f};
        this.f3251l0 = new d[]{null, null};
        this.f3253m0 = new d[]{null, null};
        this.f3255n0 = -1;
        this.f3257o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i4, int i5, String str, StringBuilder sb) {
        if (i4 == i5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i4);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f4, float f5) {
        if (f4 == f5) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f4);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i4, int i5, int i6, int i7, int i8, float f4, int i9) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i9 == 1) {
            str2 = "FIXED";
        } else if (i9 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i9 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i9 != 4) {
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
        G(i4, 0, "      size", sb);
        G(i5, 0, "      min", sb);
        G(i6, Integer.MAX_VALUE, "      max", sb);
        G(i7, 0, "      matchMin", sb);
        G(i8, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f4, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f3231f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f3231f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.g != 0) {
            sb.append(",");
            sb.append(cVar.g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f3248k) {
            return true;
        }
        return this.I.c && this.K.c;
    }

    public boolean B() {
        if (this.f3250l) {
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
        this.f3235b0 = 0;
        this.f3236c0 = 0;
        this.f3238d0 = 0.5f;
        this.f3240e0 = 0.5f;
        int[] iArr = this.f3259p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.f3242g0 = 0;
        this.f3245i0 = 0;
        this.f3247j0 = 0;
        float[] fArr = this.f3249k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3256o = -1;
        this.f3258p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3261r = 0;
        this.f3262s = 0;
        this.f3266w = 1.0f;
        this.f3269z = 1.0f;
        this.f3265v = Integer.MAX_VALUE;
        this.f3268y = Integer.MAX_VALUE;
        this.f3264u = 0;
        this.f3267x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f3241f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.f3263t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.f3244i = -1;
    }

    public final void D() {
        d dVar = this.T;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).j();
        }
    }

    public final void E() {
        this.f3248k = false;
        this.f3250l = false;
        this.f3252m = false;
        this.f3254n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            cVar.c = false;
            cVar.f3228b = 0;
        }
    }

    public void F(s sVar) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i4) {
        this.a0 = i4;
        this.E = i4 > 0;
    }

    public final void J(int i4, int i5) {
        if (this.f3248k) {
            return;
        }
        this.I.l(i4);
        this.K.l(i5);
        this.Y = i4;
        this.U = i5 - i4;
        this.f3248k = true;
    }

    public final void K(int i4, int i5) {
        if (this.f3250l) {
            return;
        }
        this.J.l(i4);
        this.L.l(i5);
        this.Z = i4;
        this.V = i5 - i4;
        if (this.E) {
            this.M.l(i4 + this.a0);
        }
        this.f3250l = true;
    }

    public final void L(int i4) {
        this.V = i4;
        int i5 = this.f3236c0;
        if (i4 < i5) {
            this.V = i5;
        }
    }

    public final void M(int i4) {
        this.f3259p0[0] = i4;
    }

    public final void N(int i4) {
        this.f3259p0[1] = i4;
    }

    public final void O(int i4) {
        this.U = i4;
        int i5 = this.f3235b0;
        if (i4 < i5) {
            this.U = i5;
        }
    }

    public void P(boolean z3, boolean z4) {
        int i4;
        int i5;
        k kVar = this.f3237d;
        boolean z5 = z3 & kVar.g;
        m mVar = this.f3239e;
        boolean z6 = z4 & mVar.g;
        int i6 = kVar.h.g;
        int i7 = mVar.h.g;
        int i8 = kVar.f3359i.g;
        int i9 = mVar.f3359i.g;
        int i10 = i9 - i7;
        if (i8 - i6 < 0 || i10 < 0 || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i9 = 0;
            i6 = 0;
            i7 = 0;
        }
        int i11 = i8 - i6;
        int i12 = i9 - i7;
        if (z5) {
            this.Y = i6;
        }
        if (z6) {
            this.Z = i7;
        }
        if (this.f3242g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3259p0;
        if (z5) {
            if (iArr[0] == 1 && i11 < (i5 = this.U)) {
                i11 = i5;
            }
            this.U = i11;
            int i13 = this.f3235b0;
            if (i11 < i13) {
                this.U = i13;
            }
        }
        if (z6) {
            if (iArr[1] == 1 && i12 < (i4 = this.V)) {
                i12 = i4;
            }
            this.V = i12;
            int i14 = this.f3236c0;
            if (i12 < i14) {
                this.V = i14;
            }
        }
    }

    public void Q(q.c cVar, boolean z3) {
        int i4;
        int i5;
        m mVar;
        k kVar;
        cVar.getClass();
        int n3 = q.c.n(this.I);
        int n4 = q.c.n(this.J);
        int n5 = q.c.n(this.K);
        int n6 = q.c.n(this.L);
        if (z3 && (kVar = this.f3237d) != null) {
            t.f fVar = kVar.h;
            if (fVar.f3339j) {
                t.f fVar2 = kVar.f3359i;
                if (fVar2.f3339j) {
                    n3 = fVar.g;
                    n5 = fVar2.g;
                }
            }
        }
        if (z3 && (mVar = this.f3239e) != null) {
            t.f fVar3 = mVar.h;
            if (fVar3.f3339j) {
                t.f fVar4 = mVar.f3359i;
                if (fVar4.f3339j) {
                    n4 = fVar3.g;
                    n6 = fVar4.g;
                }
            }
        }
        int i6 = n6 - n4;
        if (n5 - n3 < 0 || i6 < 0 || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE) {
            n3 = 0;
            n4 = 0;
            n5 = 0;
            n6 = 0;
        }
        int i7 = n5 - n3;
        int i8 = n6 - n4;
        this.Y = n3;
        this.Z = n4;
        if (this.f3242g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3259p0;
        int i9 = iArr[0];
        if (i9 == 1 && i7 < (i5 = this.U)) {
            i7 = i5;
        }
        if (iArr[1] == 1 && i8 < (i4 = this.V)) {
            i8 = i4;
        }
        this.U = i7;
        this.V = i8;
        int i10 = this.f3236c0;
        if (i8 < i10) {
            this.V = i10;
        }
        int i11 = this.f3235b0;
        if (i7 < i11) {
            this.U = i11;
        }
        int i12 = this.f3265v;
        if (i12 > 0 && i9 == 3) {
            this.U = Math.min(this.U, i12);
        }
        int i13 = this.f3268y;
        if (i13 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i13);
        }
        int i14 = this.U;
        if (i7 != i14) {
            this.h = i14;
        }
        int i15 = this.V;
        if (i8 != i15) {
            this.f3244i = i15;
        }
    }

    public final void a(e eVar, q.c cVar, HashSet hashSet, int i4, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i4 == 0) {
            HashSet hashSet2 = this.I.f3227a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).f3229d.a(eVar, cVar, hashSet, i4, true);
                }
            }
            HashSet hashSet3 = this.K.f3227a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).f3229d.a(eVar, cVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f3227a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).f3229d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet5 = this.L.f3227a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).f3229d.a(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet6 = this.M.f3227a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).f3229d.a(eVar, cVar, hashSet, i4, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.f3242g0 == r14) goto L374;
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
    /* JADX WARN: Type inference failed for: r58v0, types: [s.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(q.c cVar, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r17;
        int i4;
        boolean z7;
        boolean z8;
        d dVar;
        d dVar2;
        boolean[] zArr;
        c cVar2;
        boolean[] zArr2;
        c cVar3;
        c cVar4;
        boolean z9;
        boolean z10;
        boolean z11;
        int i5;
        int i6;
        int[] iArr;
        float f4;
        c cVar5;
        q.f fVar;
        c cVar6;
        int i7;
        int i8;
        int i9;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        c cVar7;
        boolean z15;
        char c;
        boolean z16;
        int i11;
        int[] iArr2;
        c cVar8;
        q.f fVar2;
        q.f fVar3;
        c cVar9;
        int[] iArr3;
        q.f fVar4;
        boolean z17;
        boolean z18;
        boolean z19;
        q.f fVar5;
        c cVar10;
        q.f fVar6;
        int i12;
        boolean[] zArr3;
        q.f fVar7;
        q.f fVar8;
        q.f fVar9;
        int i13;
        int i14;
        boolean z20;
        int i15;
        q.f fVar10;
        q.f fVar11;
        ?? r27;
        m mVar;
        t.f fVar12;
        d dVar3;
        boolean z21;
        k kVar;
        t.f fVar13;
        int i16;
        int i17;
        boolean x3;
        int i18;
        boolean y3;
        k kVar2;
        m mVar2;
        boolean z22;
        q.c cVar11 = cVar;
        c cVar12 = this.I;
        q.f k4 = cVar11.k(cVar12);
        c cVar13 = this.K;
        q.f k5 = cVar11.k(cVar13);
        c cVar14 = this.J;
        q.f k6 = cVar11.k(cVar14);
        c cVar15 = this.L;
        q.f k7 = cVar11.k(cVar15);
        c cVar16 = this.M;
        q.f k8 = cVar11.k(cVar16);
        d dVar4 = this.T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f3259p0;
            r17 = 0;
            z4 = false;
            r17 = 0;
            z6 = iArr4[0] == 2;
            boolean z23 = iArr4[1] == 2;
            int i19 = this.f3260q;
            if (i19 != 1) {
                if (i19 == 2) {
                    z6 = false;
                }
                z5 = z23;
            } else {
                z5 = false;
            }
            i4 = this.f3242g0;
            boolean[] zArr4 = this.S;
            boolean z24 = z5;
            if (i4 != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z7 = z6;
                int i20 = r17;
                while (true) {
                    if (i20 < size) {
                        int i21 = size;
                        HashSet hashSet = ((c) arrayList.get(i20)).f3227a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i20++;
                        size = i21;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z7 = z6;
            }
            z8 = this.f3248k;
            if (!z8 || this.f3250l) {
                if (z8) {
                    cVar11.d(k4, this.Y);
                    cVar11.d(k5, this.Y + this.U);
                    if (z7 && (dVar2 = this.T) != null) {
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
                if (this.f3250l) {
                    cVar11.d(k6, this.Z);
                    cVar11.d(k7, this.Z + this.V);
                    HashSet hashSet2 = cVar16.f3227a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.d(k8, this.Z + this.a0);
                    }
                    if (z24 && (dVar = this.T) != null) {
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
                if (this.f3248k && this.f3250l) {
                    boolean z25 = r17;
                    this.f3248k = z25;
                    this.f3250l = z25;
                    return;
                }
            }
            zArr = this.f3241f;
            if (z3 || (kVar2 = this.f3237d) == null || (mVar2 = this.f3239e) == null) {
                cVar2 = cVar16;
                zArr2 = zArr;
            } else {
                cVar2 = cVar16;
                t.f fVar14 = kVar2.h;
                zArr2 = zArr;
                if (fVar14.f3339j && kVar2.f3359i.f3339j && mVar2.h.f3339j && mVar2.f3359i.f3339j) {
                    cVar11.d(k4, fVar14.g);
                    cVar11.d(k5, this.f3237d.f3359i.g);
                    cVar11.d(k6, this.f3239e.h.g);
                    cVar11.d(k7, this.f3239e.f3359i.g);
                    cVar11.d(k8, this.f3239e.f3347k.g);
                    if (this.T != null) {
                        if (z7 && zArr2[0] && !x()) {
                            cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                        }
                        if (z24 && zArr2[1] && !y()) {
                            z22 = false;
                            cVar11.f(cVar11.k(this.T.L), k7, 0, 8);
                            this.f3248k = z22;
                            this.f3250l = z22;
                            return;
                        }
                    }
                    z22 = false;
                    this.f3248k = z22;
                    this.f3250l = z22;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    x3 = true;
                    i18 = 1;
                } else {
                    x3 = x();
                    i18 = 1;
                }
                if (w(i18)) {
                    ((e) this.T).R(this, i18);
                    y3 = true;
                } else {
                    y3 = y();
                }
                if (!x3 && z7 && this.f3242g0 != 8 && cVar12.f3231f == null && cVar13.f3231f == null) {
                    cVar3 = cVar12;
                    cVar11.f(cVar11.k(this.T.K), k5, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!y3 && z24 && this.f3242g0 != 8 && cVar14.f3231f == null && cVar15.f3231f == null && cVar2 == null) {
                    cVar11.f(cVar11.k(this.T.L), k7, 0, 1);
                }
                cVar4 = cVar13;
                z9 = z24;
                z11 = y3;
                z10 = x3;
            } else {
                cVar3 = cVar12;
                cVar4 = cVar13;
                z9 = z24;
                z10 = false;
                z11 = false;
            }
            i5 = this.U;
            i6 = this.f3235b0;
            if (i5 >= i6) {
                i6 = i5;
            }
            int i22 = this.V;
            c cVar17 = cVar4;
            int i23 = this.f3236c0;
            int i24 = i22 >= i23 ? i23 : i22;
            iArr = this.f3259p0;
            int i25 = iArr[0];
            boolean z26 = z9;
            boolean z27 = i25 == 3;
            int i26 = iArr[1];
            boolean z28 = i26 == 3;
            int i27 = this.X;
            this.A = i27;
            f4 = this.W;
            this.B = f4;
            int i28 = this.f3261r;
            int i29 = this.f3262s;
            if (f4 <= 0.0f) {
                cVar5 = cVar15;
                if (this.f3242g0 != 8) {
                    int i30 = (i25 == 3 && i28 == 0) ? 3 : i28;
                    if (i26 == 3 && i29 == 0) {
                        fVar = k7;
                        i17 = 3;
                    } else {
                        fVar = k7;
                        i17 = i29;
                    }
                    if (i25 == 3 && i26 == 3 && i30 == 3 && i17 == 3) {
                        if (i27 == -1) {
                            if (z27 && !z28) {
                                this.A = 0;
                            } else if (!z27 && z28) {
                                this.A = 1;
                                if (i27 == -1) {
                                    this.B = 1.0f / f4;
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
                            int i31 = this.f3264u;
                            if (i31 > 0 && this.f3267x == 0) {
                                this.A = 0;
                            } else if (i31 == 0 && this.f3267x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i25 == 3 && i30 == 3) {
                        this.A = 0;
                        i6 = (int) (f4 * i22);
                        if (i26 != 3) {
                            cVar6 = cVar2;
                            i7 = i24;
                            i8 = 4;
                            z12 = false;
                            i9 = i17;
                            int[] iArr5 = this.f3263t;
                            iArr5[0] = i8;
                            iArr5[1] = i9;
                            if (z12) {
                            }
                            z13 = false;
                            if (z12) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z14) {
                            }
                            cVar7 = this.P;
                            z15 = !cVar7.h();
                            c = '\b';
                            z16 = zArr4[0];
                            boolean z29 = zArr4[1];
                            i11 = this.f3256o;
                            iArr2 = this.C;
                            if (i11 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k4;
                            fVar3 = k5;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k8;
                            z17 = z10;
                            z18 = z7;
                            z19 = z26;
                            fVar5 = k6;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i12 = i8;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i13 = 0;
                            i14 = 8;
                            z20 = true;
                            i15 = 1;
                            if (this.f3258p == 2) {
                            }
                            if (i15 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3248k = false;
                            this.f3250l = false;
                        }
                    } else if (i26 == 3 && i17 == 3) {
                        this.A = 1;
                        if (i27 == -1) {
                            this.B = 1.0f / f4;
                        }
                        i7 = (int) (this.B * i5);
                        if (i25 == 3) {
                            i8 = i30;
                            cVar6 = cVar2;
                            z12 = true;
                            i9 = i17;
                            int[] iArr52 = this.f3263t;
                            iArr52[0] = i8;
                            iArr52[1] = i9;
                            if (z12) {
                            }
                            z13 = false;
                            if (z12) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z14) {
                            }
                            cVar7 = this.P;
                            z15 = !cVar7.h();
                            c = '\b';
                            z16 = zArr4[0];
                            boolean z292 = zArr4[1];
                            i11 = this.f3256o;
                            iArr2 = this.C;
                            if (i11 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k4;
                            fVar3 = k5;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k8;
                            z17 = z10;
                            z18 = z7;
                            z19 = z26;
                            fVar5 = k6;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i12 = i8;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i13 = 0;
                            i14 = 8;
                            z20 = true;
                            i15 = 1;
                            if (this.f3258p == 2) {
                            }
                            if (i15 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3248k = false;
                            this.f3250l = false;
                        }
                        i8 = i30;
                        cVar6 = cVar2;
                        i9 = 4;
                        z12 = false;
                        int[] iArr522 = this.f3263t;
                        iArr522[0] = i8;
                        iArr522[1] = i9;
                        if (z12) {
                            i10 = -1;
                        } else {
                            int i32 = this.A;
                            i10 = -1;
                            if (i32 == 0 || i32 == -1) {
                                z13 = true;
                                boolean z30 = !z12 && ((i16 = this.A) == 1 || i16 == i10);
                                z14 = iArr[0] != 2 && (this instanceof e);
                                if (z14) {
                                    i6 = 0;
                                }
                                cVar7 = this.P;
                                z15 = !cVar7.h();
                                c = '\b';
                                z16 = zArr4[0];
                                boolean z2922 = zArr4[1];
                                i11 = this.f3256o;
                                iArr2 = this.C;
                                if (i11 != 2 && !this.f3248k) {
                                    if (z3 && (kVar = this.f3237d) != null) {
                                        fVar13 = kVar.h;
                                        if (fVar13.f3339j || !kVar.f3359i.f3339j) {
                                            c = '\b';
                                        } else if (z3) {
                                            cVar11.d(k4, fVar13.g);
                                            cVar11.d(k5, this.f3237d.f3359i.g);
                                            if (this.T != null && z7 && zArr2[0] && !x()) {
                                                cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                                            }
                                        }
                                    }
                                    d dVar5 = this.T;
                                    q.f k9 = dVar5 == null ? cVar11.k(dVar5.K) : null;
                                    d dVar6 = this.T;
                                    q.f k10 = dVar6 == null ? cVar11.k(dVar6.I) : null;
                                    z18 = z7;
                                    i12 = i8;
                                    z17 = z10;
                                    cVar9 = cVar7;
                                    iArr3 = iArr2;
                                    boolean z31 = z13;
                                    fVar2 = k4;
                                    z19 = z26;
                                    fVar5 = k6;
                                    fVar3 = k5;
                                    cVar10 = cVar5;
                                    fVar6 = fVar;
                                    cVar8 = cVar6;
                                    fVar4 = k8;
                                    zArr3 = zArr2;
                                    cVar11 = cVar;
                                    d(cVar11, true, z18, z19, zArr2[0], k10, k9, iArr[0], z14, this.I, this.K, this.Y, i6, this.f3235b0, iArr2[0], this.f3238d0, z31, iArr[1] == 3, z17, z11, z16, i12, i9, this.f3264u, this.f3265v, this.f3266w, z15);
                                    if (z3 && (mVar = this.f3239e) != null) {
                                        fVar12 = mVar.h;
                                        if (fVar12.f3339j && mVar.f3359i.f3339j) {
                                            int i33 = fVar12.g;
                                            fVar7 = fVar5;
                                            cVar11.d(fVar7, i33);
                                            fVar8 = fVar6;
                                            cVar11.d(fVar8, this.f3239e.f3359i.g);
                                            fVar9 = fVar4;
                                            cVar11.d(fVar9, this.f3239e.f3347k.g);
                                            dVar3 = this.T;
                                            if (dVar3 == null && !z11 && z19) {
                                                z21 = true;
                                                z21 = true;
                                                if (zArr3[1]) {
                                                    i13 = 0;
                                                    i14 = 8;
                                                    cVar11.f(cVar11.k(dVar3.L), fVar8, 0, 8);
                                                } else {
                                                    i13 = 0;
                                                    i14 = 8;
                                                }
                                            } else {
                                                i13 = 0;
                                                i14 = 8;
                                                z21 = true;
                                            }
                                            i15 = i13;
                                            z20 = z21;
                                            if (this.f3258p == 2) {
                                                i15 = i13;
                                            }
                                            if (i15 != 0 || this.f3250l) {
                                                fVar10 = fVar7;
                                                fVar11 = fVar8;
                                            } else {
                                                int i34 = (iArr[z20 ? 1 : 0] == 2 && (this instanceof e)) ? z20 ? 1 : 0 : i13;
                                                int i35 = i34 != 0 ? i13 : i7;
                                                d dVar7 = this.T;
                                                q.f k11 = dVar7 != null ? cVar11.k(dVar7.L) : null;
                                                d dVar8 = this.T;
                                                q.f k12 = dVar8 != null ? cVar11.k(dVar8.J) : null;
                                                int i36 = this.a0;
                                                if (i36 <= 0) {
                                                    r27 = z15;
                                                }
                                                c cVar18 = cVar8;
                                                if (cVar18.f3231f != null) {
                                                    cVar11.e(fVar9, fVar7, i36, i14);
                                                    cVar11.e(fVar9, cVar11.k(cVar18.f3231f), cVar18.e(), i14);
                                                    if (z19) {
                                                        cVar11.f(k11, cVar11.k(cVar10), i13, 5);
                                                    }
                                                    r27 = i13;
                                                } else if (this.f3242g0 == i14) {
                                                    cVar11.e(fVar9, fVar7, cVar18.e(), i14);
                                                    r27 = z15;
                                                } else {
                                                    cVar11.e(fVar9, fVar7, i36, i14);
                                                    r27 = z15;
                                                }
                                                boolean z32 = zArr3[z20 ? 1 : 0];
                                                int i37 = i13;
                                                int i38 = iArr[z20 ? 1 : 0];
                                                int i39 = this.Z;
                                                int i40 = this.f3236c0;
                                                int i41 = iArr3[z20 ? 1 : 0];
                                                float f5 = this.f3240e0;
                                                int i42 = iArr[i37];
                                                boolean z33 = z20 ? 1 : 0;
                                                ?? r18 = z20;
                                                if (i42 != 3) {
                                                    r18 = i37;
                                                }
                                                fVar11 = fVar8;
                                                fVar10 = fVar7;
                                                cVar11 = cVar;
                                                d(cVar11, false, z19, z18, z32, k12, k11, i38, i34, this.J, this.L, i39, i35, i40, i41, f5, z30, r18, z11, z17, z2922, i9, i12, this.f3267x, this.f3268y, this.f3269z, r27);
                                            }
                                            if (z12) {
                                                if (this.A == 1) {
                                                    float f6 = this.B;
                                                    q.b l4 = cVar11.l();
                                                    l4.f3063d.g(fVar11, -1.0f);
                                                    l4.f3063d.g(fVar10, 1.0f);
                                                    l4.f3063d.g(fVar3, f6);
                                                    l4.f3063d.g(fVar2, -f6);
                                                    cVar11.c(l4);
                                                } else {
                                                    float f7 = this.B;
                                                    q.b l5 = cVar11.l();
                                                    l5.f3063d.g(fVar3, -1.0f);
                                                    l5.f3063d.g(fVar2, 1.0f);
                                                    l5.f3063d.g(fVar11, f7);
                                                    l5.f3063d.g(fVar10, -f7);
                                                    cVar11.c(l5);
                                                }
                                            }
                                            if (cVar9.h()) {
                                                c cVar19 = cVar9;
                                                d dVar9 = cVar19.f3231f.f3229d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e4 = cVar19.e();
                                                q.f k13 = cVar11.k(i(2));
                                                q.f k14 = cVar11.k(i(3));
                                                q.f k15 = cVar11.k(i(4));
                                                q.f k16 = cVar11.k(i(5));
                                                q.f k17 = cVar11.k(dVar9.i(2));
                                                q.f k18 = cVar11.k(dVar9.i(3));
                                                q.f k19 = cVar11.k(dVar9.i(4));
                                                q.f k20 = cVar11.k(dVar9.i(5));
                                                q.b l6 = cVar11.l();
                                                double d4 = radians;
                                                double sin = Math.sin(d4);
                                                double d5 = e4;
                                                l6.f3063d.g(k18, 0.5f);
                                                l6.f3063d.g(k20, 0.5f);
                                                l6.f3063d.g(k14, -0.5f);
                                                l6.f3063d.g(k16, -0.5f);
                                                l6.f3062b = -((float) (sin * d5));
                                                cVar11.c(l6);
                                                q.b l7 = cVar11.l();
                                                float cos = (float) (Math.cos(d4) * d5);
                                                l7.f3063d.g(k17, 0.5f);
                                                l7.f3063d.g(k19, 0.5f);
                                                l7.f3063d.g(k13, -0.5f);
                                                l7.f3063d.g(k15, -0.5f);
                                                l7.f3062b = -cos;
                                                cVar11.c(l7);
                                            }
                                            this.f3248k = false;
                                            this.f3250l = false;
                                        }
                                    }
                                    fVar7 = fVar5;
                                    fVar8 = fVar6;
                                    fVar9 = fVar4;
                                    i13 = 0;
                                    i14 = 8;
                                    z20 = true;
                                    i15 = 1;
                                    if (this.f3258p == 2) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    fVar10 = fVar7;
                                    fVar11 = fVar8;
                                    if (z12) {
                                    }
                                    if (cVar9.h()) {
                                    }
                                    this.f3248k = false;
                                    this.f3250l = false;
                                }
                                cVar8 = cVar6;
                                fVar2 = k4;
                                fVar3 = k5;
                                cVar9 = cVar7;
                                iArr3 = iArr2;
                                fVar4 = k8;
                                z17 = z10;
                                z18 = z7;
                                z19 = z26;
                                fVar5 = k6;
                                cVar10 = cVar5;
                                fVar6 = fVar;
                                i12 = i8;
                                zArr3 = zArr2;
                                if (z3) {
                                    fVar12 = mVar.h;
                                    if (fVar12.f3339j) {
                                        int i332 = fVar12.g;
                                        fVar7 = fVar5;
                                        cVar11.d(fVar7, i332);
                                        fVar8 = fVar6;
                                        cVar11.d(fVar8, this.f3239e.f3359i.g);
                                        fVar9 = fVar4;
                                        cVar11.d(fVar9, this.f3239e.f3347k.g);
                                        dVar3 = this.T;
                                        if (dVar3 == null) {
                                        }
                                        i13 = 0;
                                        i14 = 8;
                                        z21 = true;
                                        i15 = i13;
                                        z20 = z21;
                                        if (this.f3258p == 2) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        fVar10 = fVar7;
                                        fVar11 = fVar8;
                                        if (z12) {
                                        }
                                        if (cVar9.h()) {
                                        }
                                        this.f3248k = false;
                                        this.f3250l = false;
                                    }
                                }
                                fVar7 = fVar5;
                                fVar8 = fVar6;
                                fVar9 = fVar4;
                                i13 = 0;
                                i14 = 8;
                                z20 = true;
                                i15 = 1;
                                if (this.f3258p == 2) {
                                }
                                if (i15 != 0) {
                                }
                                fVar10 = fVar7;
                                fVar11 = fVar8;
                                if (z12) {
                                }
                                if (cVar9.h()) {
                                }
                                this.f3248k = false;
                                this.f3250l = false;
                            }
                        }
                        z13 = false;
                        if (z12) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z14) {
                        }
                        cVar7 = this.P;
                        z15 = !cVar7.h();
                        c = '\b';
                        z16 = zArr4[0];
                        boolean z29222 = zArr4[1];
                        i11 = this.f3256o;
                        iArr2 = this.C;
                        if (i11 != 2) {
                            if (z3) {
                                fVar13 = kVar.h;
                                if (fVar13.f3339j) {
                                }
                                c = '\b';
                            }
                            d dVar52 = this.T;
                            if (dVar52 == null) {
                            }
                            d dVar62 = this.T;
                            if (dVar62 == null) {
                            }
                            z18 = z7;
                            i12 = i8;
                            z17 = z10;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            boolean z312 = z13;
                            fVar2 = k4;
                            z19 = z26;
                            fVar5 = k6;
                            fVar3 = k5;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            cVar8 = cVar6;
                            fVar4 = k8;
                            zArr3 = zArr2;
                            cVar11 = cVar;
                            d(cVar11, true, z18, z19, zArr2[0], k10, k9, iArr[0], z14, this.I, this.K, this.Y, i6, this.f3235b0, iArr2[0], this.f3238d0, z312, iArr[1] == 3, z17, z11, z16, i12, i9, this.f3264u, this.f3265v, this.f3266w, z15);
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i13 = 0;
                            i14 = 8;
                            z20 = true;
                            i15 = 1;
                            if (this.f3258p == 2) {
                            }
                            if (i15 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3248k = false;
                            this.f3250l = false;
                        }
                        cVar8 = cVar6;
                        fVar2 = k4;
                        fVar3 = k5;
                        cVar9 = cVar7;
                        iArr3 = iArr2;
                        fVar4 = k8;
                        z17 = z10;
                        z18 = z7;
                        z19 = z26;
                        fVar5 = k6;
                        cVar10 = cVar5;
                        fVar6 = fVar;
                        i12 = i8;
                        zArr3 = zArr2;
                        if (z3) {
                        }
                        fVar7 = fVar5;
                        fVar8 = fVar6;
                        fVar9 = fVar4;
                        i13 = 0;
                        i14 = 8;
                        z20 = true;
                        i15 = 1;
                        if (this.f3258p == 2) {
                        }
                        if (i15 != 0) {
                        }
                        fVar10 = fVar7;
                        fVar11 = fVar8;
                        if (z12) {
                        }
                        if (cVar9.h()) {
                        }
                        this.f3248k = false;
                        this.f3250l = false;
                    }
                    i8 = i30;
                    cVar6 = cVar2;
                    i7 = i24;
                    z12 = true;
                    i9 = i17;
                    int[] iArr5222 = this.f3263t;
                    iArr5222[0] = i8;
                    iArr5222[1] = i9;
                    if (z12) {
                    }
                    z13 = false;
                    if (z12) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z14) {
                    }
                    cVar7 = this.P;
                    z15 = !cVar7.h();
                    c = '\b';
                    z16 = zArr4[0];
                    boolean z292222 = zArr4[1];
                    i11 = this.f3256o;
                    iArr2 = this.C;
                    if (i11 != 2) {
                    }
                    cVar8 = cVar6;
                    fVar2 = k4;
                    fVar3 = k5;
                    cVar9 = cVar7;
                    iArr3 = iArr2;
                    fVar4 = k8;
                    z17 = z10;
                    z18 = z7;
                    z19 = z26;
                    fVar5 = k6;
                    cVar10 = cVar5;
                    fVar6 = fVar;
                    i12 = i8;
                    zArr3 = zArr2;
                    if (z3) {
                    }
                    fVar7 = fVar5;
                    fVar8 = fVar6;
                    fVar9 = fVar4;
                    i13 = 0;
                    i14 = 8;
                    z20 = true;
                    i15 = 1;
                    if (this.f3258p == 2) {
                    }
                    if (i15 != 0) {
                    }
                    fVar10 = fVar7;
                    fVar11 = fVar8;
                    if (z12) {
                    }
                    if (cVar9.h()) {
                    }
                    this.f3248k = false;
                    this.f3250l = false;
                }
            } else {
                cVar5 = cVar15;
            }
            fVar = k7;
            cVar6 = cVar2;
            i7 = i24;
            i8 = i28;
            i9 = i29;
            z12 = false;
            int[] iArr52222 = this.f3263t;
            iArr52222[0] = i8;
            iArr52222[1] = i9;
            if (z12) {
            }
            z13 = false;
            if (z12) {
            }
            if (iArr[0] != 2) {
            }
            if (z14) {
            }
            cVar7 = this.P;
            z15 = !cVar7.h();
            c = '\b';
            z16 = zArr4[0];
            boolean z2922222 = zArr4[1];
            i11 = this.f3256o;
            iArr2 = this.C;
            if (i11 != 2) {
            }
            cVar8 = cVar6;
            fVar2 = k4;
            fVar3 = k5;
            cVar9 = cVar7;
            iArr3 = iArr2;
            fVar4 = k8;
            z17 = z10;
            z18 = z7;
            z19 = z26;
            fVar5 = k6;
            cVar10 = cVar5;
            fVar6 = fVar;
            i12 = i8;
            zArr3 = zArr2;
            if (z3) {
            }
            fVar7 = fVar5;
            fVar8 = fVar6;
            fVar9 = fVar4;
            i13 = 0;
            i14 = 8;
            z20 = true;
            i15 = 1;
            if (this.f3258p == 2) {
            }
            if (i15 != 0) {
            }
            fVar10 = fVar7;
            fVar11 = fVar8;
            if (z12) {
            }
            if (cVar9.h()) {
            }
            this.f3248k = false;
            this.f3250l = false;
        }
        z4 = false;
        z5 = z4 ? 1 : 0;
        z6 = z5;
        r17 = z4;
        i4 = this.f3242g0;
        boolean[] zArr42 = this.S;
        boolean z242 = z5;
        if (i4 != 8) {
        }
        z8 = this.f3248k;
        if (!z8) {
        }
        if (z8) {
        }
        if (this.f3250l) {
        }
        if (this.f3248k) {
            boolean z252 = r17;
            this.f3248k = z252;
            this.f3250l = z252;
            return;
        }
        zArr = this.f3241f;
        if (z3) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i5 = this.U;
        i6 = this.f3235b0;
        if (i5 >= i6) {
        }
        int i222 = this.V;
        c cVar172 = cVar4;
        int i232 = this.f3236c0;
        if (i222 >= i232) {
        }
        iArr = this.f3259p0;
        int i252 = iArr[0];
        boolean z262 = z9;
        if (i252 == 3) {
        }
        int i262 = iArr[1];
        if (i262 == 3) {
        }
        int i272 = this.X;
        this.A = i272;
        f4 = this.W;
        this.B = f4;
        int i282 = this.f3261r;
        int i292 = this.f3262s;
        if (f4 <= 0.0f) {
        }
        fVar = k7;
        cVar6 = cVar2;
        i7 = i24;
        i8 = i282;
        i9 = i292;
        z12 = false;
        int[] iArr522222 = this.f3263t;
        iArr522222[0] = i8;
        iArr522222[1] = i9;
        if (z12) {
        }
        z13 = false;
        if (z12) {
        }
        if (iArr[0] != 2) {
        }
        if (z14) {
        }
        cVar7 = this.P;
        z15 = !cVar7.h();
        c = '\b';
        z16 = zArr42[0];
        boolean z29222222 = zArr42[1];
        i11 = this.f3256o;
        iArr2 = this.C;
        if (i11 != 2) {
        }
        cVar8 = cVar6;
        fVar2 = k4;
        fVar3 = k5;
        cVar9 = cVar7;
        iArr3 = iArr2;
        fVar4 = k8;
        z17 = z10;
        z18 = z7;
        z19 = z262;
        fVar5 = k6;
        cVar10 = cVar5;
        fVar6 = fVar;
        i12 = i8;
        zArr3 = zArr2;
        if (z3) {
        }
        fVar7 = fVar5;
        fVar8 = fVar6;
        fVar9 = fVar4;
        i13 = 0;
        i14 = 8;
        z20 = true;
        i15 = 1;
        if (this.f3258p == 2) {
        }
        if (i15 != 0) {
        }
        fVar10 = fVar7;
        fVar11 = fVar8;
        if (z12) {
        }
        if (cVar9.h()) {
        }
        this.f3248k = false;
        this.f3250l = false;
    }

    public boolean c() {
        return this.f3242g0 != 8;
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
    public final void d(q.c cVar, boolean z3, boolean z4, boolean z5, boolean z6, q.f fVar, q.f fVar2, int i4, boolean z7, c cVar2, c cVar3, int i5, int i6, int i7, int i8, float f4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i9, int i10, int i11, int i12, float f5, boolean z13) {
        boolean z14;
        boolean z15;
        int i13;
        boolean z16;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        q.f k4;
        q.f k5;
        c cVar4;
        q.f fVar3;
        boolean z19;
        int i16;
        q.f fVar4;
        q.f fVar5;
        q.f fVar6;
        q.f fVar7;
        int i17;
        int i18;
        int i19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        d dVar;
        int i20;
        int i21;
        c cVar5;
        boolean z24;
        int i22;
        boolean z25;
        int i23;
        int i24;
        HashSet hashSet;
        boolean z26;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z27;
        boolean z28;
        int i30;
        q.c cVar6 = cVar;
        int i31 = i11;
        int i32 = i12;
        q.f k6 = cVar6.k(cVar2);
        q.f k7 = cVar6.k(cVar3);
        q.f k8 = cVar6.k(cVar2.f3231f);
        q.f k9 = cVar6.k(cVar3.f3231f);
        boolean h = cVar2.h();
        boolean h4 = cVar3.h();
        boolean h5 = this.P.h();
        int i33 = h4 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h5) {
            i33++;
        }
        int i34 = i33;
        int i35 = z8 ? 3 : i9;
        int a4 = q.e.a(i4);
        boolean z29 = (a4 == 0 || a4 == 1 || a4 != 2 || i35 == 4) ? false : true;
        int i36 = this.h;
        if (i36 == -1 || !z3) {
            i36 = i6;
            z14 = z29;
        } else {
            this.h = -1;
            z14 = false;
        }
        int i37 = this.f3244i;
        if (i37 == -1 || z3) {
            z15 = z14;
        } else {
            this.f3244i = -1;
            i36 = i37;
            z15 = false;
        }
        boolean z30 = z15;
        if (this.f3242g0 == 8) {
            z16 = false;
            i13 = 0;
        } else {
            i13 = i36;
            z16 = z30;
        }
        if (z13) {
            if (!h && !h4 && !h5) {
                cVar6.d(k6, i5);
            } else if (h && !h4) {
                z17 = z16;
                i14 = 8;
                cVar6.e(k6, k8, cVar2.e(), 8);
            }
            z17 = z16;
            i14 = 8;
        } else {
            z17 = z16;
            i14 = 8;
        }
        if (z17) {
            if (i34 == 2 || z8 || !(i35 == 1 || i35 == 0)) {
                if (i31 == -2) {
                    i31 = i13;
                }
                if (i32 == -2) {
                    i32 = i13;
                }
                if (i13 > 0 && i35 != 1) {
                    i13 = 0;
                }
                if (i31 > 0) {
                    cVar6.f(k7, k6, i31, 8);
                    i13 = Math.max(i13, i31);
                }
                if (i32 > 0) {
                    if (!z4 || i35 != 1) {
                        cVar6.g(k7, k6, i32, 8);
                    }
                    i13 = Math.min(i13, i32);
                }
                if (i35 == 1) {
                    if (z4) {
                        cVar6.e(k7, k6, i13, 8);
                    } else if (z10) {
                        cVar6.e(k7, k6, i13, 5);
                        cVar6.g(k7, k6, i13, 8);
                    } else {
                        cVar6.e(k7, k6, i13, 5);
                        cVar6.g(k7, k6, i13, 8);
                    }
                } else if (i35 == 2) {
                    int i38 = cVar2.f3230e;
                    if (i38 == 3 || i38 == 5) {
                        k4 = cVar6.k(this.T.i(3));
                        k5 = cVar6.k(this.T.i(5));
                    } else {
                        k4 = cVar6.k(this.T.i(2));
                        k5 = cVar6.k(this.T.i(4));
                    }
                    q.b l4 = cVar6.l();
                    int i39 = i31;
                    l4.f3063d.g(k7, -1.0f);
                    l4.f3063d.g(k6, 1.0f);
                    l4.f3063d.g(k5, f5);
                    l4.f3063d.g(k4, -f5);
                    cVar6.c(l4);
                    if (z4) {
                        z17 = false;
                    }
                    z18 = z6;
                    i15 = i39;
                } else {
                    i15 = i31;
                    z18 = true;
                }
            } else {
                int max = Math.max(i31, i13);
                if (i32 > 0) {
                    max = Math.min(i32, max);
                }
                cVar6.e(k7, k6, max, 8);
                z18 = z6;
                i15 = i31;
                z17 = false;
            }
            if (z13 || z10) {
                boolean z31 = z18;
                if (i34 >= 2 && z4 && z31) {
                    cVar6.f(k6, fVar, 0, 8);
                    c cVar7 = this.M;
                    boolean z32 = z3 || cVar7.f3231f == null;
                    if (!z3 && (cVar4 = cVar7.f3231f) != null) {
                        d dVar2 = cVar4.f3229d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f3259p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z32 = true;
                            }
                        }
                        z32 = false;
                    }
                    if (z32) {
                        cVar6.f(fVar2, k7, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h4 && !h5) {
                cVar5 = cVar3;
                fVar6 = k7;
                z19 = z18;
                fVar3 = k9;
            } else if (!h || h4) {
                if (h || !h4) {
                    fVar3 = k9;
                    if (h && h4) {
                        d dVar3 = cVar2.f3231f.f3229d;
                        d dVar4 = cVar3.f3231f.f3229d;
                        z19 = z18;
                        d dVar5 = this.T;
                        int i40 = 6;
                        if (z17) {
                            if (i35 == 0) {
                                if (i32 != 0 || i15 != 0) {
                                    i28 = 5;
                                    i29 = 5;
                                    z27 = true;
                                    z28 = false;
                                    z21 = true;
                                } else if (k8.f3085k && fVar3.f3085k) {
                                    cVar6.e(k6, k8, cVar2.e(), 8);
                                    cVar6.e(k7, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i28 = 8;
                                    i29 = 8;
                                    z27 = false;
                                    z28 = true;
                                    z21 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i16 = i35;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    z22 = z28;
                                    fVar4 = fVar2;
                                    i18 = i28;
                                    fVar7 = k8;
                                    i17 = 6;
                                    z20 = z27;
                                    i19 = 4;
                                    if (z21 || fVar7 != fVar3 || dVar3 == dVar5) {
                                        z23 = true;
                                    } else {
                                        z21 = false;
                                        z23 = false;
                                    }
                                    if (z20) {
                                        dVar = dVar4;
                                        i20 = i15;
                                        i21 = i16;
                                        cVar5 = cVar3;
                                        z24 = z4;
                                    } else {
                                        if (z17 || z9 || z11 || fVar7 != fVar || fVar3 != fVar4) {
                                            z24 = z4;
                                            z26 = z23;
                                            i25 = i18;
                                        } else {
                                            i17 = 8;
                                            z24 = false;
                                            i25 = 8;
                                            z26 = false;
                                        }
                                        q.f fVar8 = fVar7;
                                        i20 = i15;
                                        i21 = i16;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.b(fVar5, fVar8, cVar2.e(), f4, fVar3, fVar6, cVar3.e(), i17);
                                        fVar7 = fVar8;
                                        i18 = i25;
                                        z23 = z26;
                                    }
                                    if (this.f3242g0 != 8 && ((hashSet = cVar5.f3227a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z21) {
                                        if (z24 && fVar7 != fVar3 && !z17 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i18 = 6;
                                        }
                                        cVar6.f(fVar5, fVar7, cVar2.e(), i18);
                                        cVar6.g(fVar6, fVar3, -cVar5.e(), i18);
                                    }
                                    if (z24 || !z12 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i22 = i19;
                                        z25 = z23;
                                    } else {
                                        i22 = 6;
                                        i18 = 6;
                                        z25 = true;
                                    }
                                    if (z25) {
                                        if (z22 && (!z11 || z5)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i40 = i22;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i40 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i40 = 5;
                                            }
                                            i22 = Math.max(z11 ? 5 : i40, i22);
                                        }
                                        if (z24) {
                                            i22 = Math.min(i18, i22);
                                            if (z8 && !z11 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i24 = 4;
                                                cVar6.e(fVar5, fVar7, cVar2.e(), i24);
                                                cVar6.e(fVar6, fVar3, -cVar5.e(), i24);
                                            }
                                        }
                                        i24 = i22;
                                        cVar6.e(fVar5, fVar7, cVar2.e(), i24);
                                        cVar6.e(fVar6, fVar3, -cVar5.e(), i24);
                                    }
                                    if (z24) {
                                        int e4 = fVar == fVar7 ? cVar2.e() : 0;
                                        if (fVar7 != fVar) {
                                            cVar6.f(fVar5, fVar, e4, 5);
                                        }
                                    }
                                    if (z24 && z17 && i7 == 0 && i20 == 0) {
                                        if (z17 || i21 != 3) {
                                            i23 = 5;
                                            cVar6.f(fVar6, fVar5, 0, 5);
                                        } else {
                                            cVar6.f(fVar6, fVar5, 0, 8);
                                        }
                                    }
                                    i23 = 5;
                                } else {
                                    cVar6 = cVar;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    z22 = z28;
                                    i18 = i28;
                                    fVar7 = k8;
                                    i17 = 6;
                                    z20 = z27;
                                    i19 = i29;
                                    i16 = i35;
                                    fVar4 = fVar2;
                                    if (z21) {
                                    }
                                    z23 = true;
                                    if (z20) {
                                    }
                                    if (this.f3242g0 != 8) {
                                    }
                                    if (z21) {
                                    }
                                    if (z24) {
                                    }
                                    i22 = i19;
                                    z25 = z23;
                                    if (z25) {
                                    }
                                    if (z24) {
                                    }
                                    if (z24) {
                                        if (z17) {
                                        }
                                        i23 = 5;
                                        cVar6.f(fVar6, fVar5, 0, 5);
                                    }
                                    i23 = 5;
                                }
                            } else {
                                if (i35 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        cVar6 = cVar;
                                        i16 = i35;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i17 = 6;
                                        i18 = 5;
                                    } else {
                                        cVar6 = cVar;
                                        i16 = i35;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i17 = 6;
                                        i18 = 5;
                                        i19 = 5;
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        fVar4 = fVar2;
                                        if (z21) {
                                        }
                                        z23 = true;
                                        if (z20) {
                                        }
                                        if (this.f3242g0 != 8) {
                                        }
                                        if (z21) {
                                        }
                                        if (z24) {
                                        }
                                        i22 = i19;
                                        z25 = z23;
                                        if (z25) {
                                        }
                                        if (z24) {
                                        }
                                        if (z24) {
                                        }
                                        i23 = 5;
                                    }
                                } else if (i35 == 1) {
                                    cVar6 = cVar;
                                    i16 = i35;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    fVar7 = k8;
                                    i17 = 6;
                                    i18 = 8;
                                } else if (i35 == 3) {
                                    i16 = i35;
                                    if (this.A != -1) {
                                        if (z8) {
                                            if (i10 == 2 || i10 == 1) {
                                                i26 = 5;
                                                i27 = 4;
                                            } else {
                                                i26 = 8;
                                                i27 = 5;
                                            }
                                            i19 = i27;
                                            fVar5 = k6;
                                            fVar6 = k7;
                                            fVar7 = k8;
                                            i17 = 6;
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
                                            fVar4 = fVar2;
                                        } else if (i32 > 0) {
                                            cVar6 = cVar;
                                            fVar4 = fVar2;
                                            fVar5 = k6;
                                            fVar6 = k7;
                                            fVar7 = k8;
                                            i17 = 6;
                                            i18 = 5;
                                        } else {
                                            if (i32 != 0 || i15 != 0) {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i17 = 6;
                                                i18 = 5;
                                                i19 = 4;
                                            } else if (z11) {
                                                i26 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i17 = 6;
                                                i19 = 4;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                            } else {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i17 = 6;
                                                i18 = 5;
                                                i19 = 8;
                                            }
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
                                            if (z21) {
                                            }
                                            z23 = true;
                                            if (z20) {
                                            }
                                            if (this.f3242g0 != 8) {
                                            }
                                            if (z21) {
                                            }
                                            if (z24) {
                                            }
                                            i22 = i19;
                                            z25 = z23;
                                            if (z25) {
                                            }
                                            if (z24) {
                                            }
                                            if (z24) {
                                            }
                                            i23 = 5;
                                        }
                                        i18 = i26;
                                        cVar6 = cVar;
                                        if (z21) {
                                        }
                                        z23 = true;
                                        if (z20) {
                                        }
                                        if (this.f3242g0 != 8) {
                                        }
                                        if (z21) {
                                        }
                                        if (z24) {
                                        }
                                        i22 = i19;
                                        z25 = z23;
                                        if (z25) {
                                        }
                                        if (z24) {
                                        }
                                        if (z24) {
                                        }
                                        i23 = 5;
                                    } else if (z11) {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i18 = 8;
                                        i17 = z4 ? 5 : 4;
                                    } else {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i18 = 8;
                                        i17 = 8;
                                    }
                                    i19 = 5;
                                    z20 = true;
                                    z21 = true;
                                    z22 = true;
                                    if (z21) {
                                    }
                                    z23 = true;
                                    if (z20) {
                                    }
                                    if (this.f3242g0 != 8) {
                                    }
                                    if (z21) {
                                    }
                                    if (z24) {
                                    }
                                    i22 = i19;
                                    z25 = z23;
                                    if (z25) {
                                    }
                                    if (z24) {
                                    }
                                    if (z24) {
                                    }
                                    i23 = 5;
                                } else {
                                    i16 = i35;
                                    cVar6 = cVar;
                                    fVar4 = fVar2;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    fVar7 = k8;
                                    i17 = 6;
                                    i18 = 5;
                                    i19 = 4;
                                    z20 = false;
                                    z21 = false;
                                }
                                i19 = 4;
                                z20 = true;
                                z21 = true;
                                z22 = false;
                                fVar4 = fVar2;
                                if (z21) {
                                }
                                z23 = true;
                                if (z20) {
                                }
                                if (this.f3242g0 != 8) {
                                }
                                if (z21) {
                                }
                                if (z24) {
                                }
                                i22 = i19;
                                z25 = z23;
                                if (z25) {
                                }
                                if (z24) {
                                }
                                if (z24) {
                                }
                                i23 = 5;
                            }
                            i30 = i23;
                            if (z24 && z19) {
                                int e5 = cVar5.f3231f != null ? cVar5.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar6.f(fVar2, fVar6, e5, i30);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i16 = i35;
                        if (k8.f3085k && fVar3.f3085k) {
                            cVar.b(k6, k8, cVar2.e(), f4, fVar3, k7, cVar3.e(), 8);
                            if (z4 && z19) {
                                int e6 = cVar3.f3231f != null ? cVar3.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar.f(fVar2, k7, e6, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar6 = cVar;
                        fVar4 = fVar2;
                        fVar5 = k6;
                        fVar6 = k7;
                        fVar7 = k8;
                        i17 = 6;
                        i18 = 5;
                        i19 = 4;
                        z20 = true;
                        z21 = true;
                        z22 = false;
                        if (z21) {
                        }
                        z23 = true;
                        if (z20) {
                        }
                        if (this.f3242g0 != 8) {
                        }
                        if (z21) {
                        }
                        if (z24) {
                        }
                        i22 = i19;
                        z25 = z23;
                        if (z25) {
                        }
                        if (z24) {
                        }
                        if (z24) {
                        }
                        i23 = 5;
                        i30 = i23;
                        if (z24) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    fVar3 = k9;
                    cVar6.e(k7, fVar3, -cVar3.e(), 8);
                    if (z4) {
                        cVar6.f(k6, fVar, 0, 5);
                        cVar5 = cVar3;
                        i23 = 5;
                        fVar6 = k7;
                        z19 = z18;
                        z24 = z4;
                        i30 = i23;
                        if (z24) {
                        }
                    }
                }
                cVar5 = cVar3;
                fVar6 = k7;
                z19 = z18;
            } else {
                cVar5 = cVar3;
                fVar6 = k7;
                z19 = z18;
                fVar3 = k9;
                z24 = z4;
                i30 = (z4 && (cVar2.f3231f.f3229d instanceof a)) ? 8 : 5;
                if (z24) {
                }
            }
            i23 = 5;
            z24 = z4;
            i30 = i23;
            if (z24) {
            }
        } else if (z7) {
            cVar6.e(k7, k6, 0, 3);
            if (i7 > 0) {
                cVar6.f(k7, k6, i7, i14);
            }
            if (i8 < Integer.MAX_VALUE) {
                cVar6.g(k7, k6, i8, i14);
            }
        } else {
            cVar6.e(k7, k6, i13, i14);
        }
        z18 = z6;
        i15 = i31;
        if (z13) {
        }
        boolean z312 = z18;
        if (i34 >= 2) {
        }
    }

    public final void e(int i4, d dVar, int i5, int i6) {
        boolean z3;
        if (i4 == 7) {
            if (i5 != 7) {
                if (i5 == 2 || i5 == 4) {
                    e(2, dVar, i5, 0);
                    e(4, dVar, i5, 0);
                    i(7).a(dVar.i(i5), 0);
                    return;
                } else {
                    if (i5 == 3 || i5 == 5) {
                        e(3, dVar, i5, 0);
                        e(5, dVar, i5, 0);
                        i(7).a(dVar.i(i5), 0);
                        return;
                    }
                    return;
                }
            }
            c i7 = i(2);
            c i8 = i(4);
            c i9 = i(3);
            c i10 = i(5);
            boolean z4 = true;
            if ((i7 == null || !i7.h()) && (i8 == null || !i8.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 == null || !i9.h()) && (i10 == null || !i10.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z3) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z4) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i4 == 8 && (i5 == 2 || i5 == 4)) {
            c i11 = i(2);
            c i12 = dVar.i(i5);
            c i13 = i(4);
            i11.a(i12, 0);
            i13.a(i12, 0);
            i(8).a(i12, 0);
            return;
        }
        if (i4 == 9 && (i5 == 3 || i5 == 5)) {
            c i14 = dVar.i(i5);
            i(3).a(i14, 0);
            i(5).a(i14, 0);
            i(9).a(i14, 0);
            return;
        }
        if (i4 == 8 && i5 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i5), 0);
            return;
        }
        if (i4 == 9 && i5 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i5), 0);
            return;
        }
        c i15 = i(i4);
        c i16 = dVar.i(i5);
        if (i15.i(i16)) {
            if (i4 == 6) {
                c i17 = i(3);
                c i18 = i(5);
                if (i17 != null) {
                    i17.j();
                }
                if (i18 != null) {
                    i18.j();
                }
            } else if (i4 == 3 || i4 == 5) {
                c i19 = i(6);
                if (i19 != null) {
                    i19.j();
                }
                c i20 = i(7);
                if (i20.f3231f != i16) {
                    i20.j();
                }
                c f4 = i(i4).f();
                c i21 = i(9);
                if (i21.h()) {
                    f4.j();
                    i21.j();
                }
            } else if (i4 == 2 || i4 == 4) {
                c i22 = i(7);
                if (i22.f3231f != i16) {
                    i22.j();
                }
                c f5 = i(i4).f();
                c i23 = i(8);
                if (i23.h()) {
                    f5.j();
                    i23.j();
                }
            }
            i15.a(i16, i6);
        }
    }

    public final void f(c cVar, c cVar2, int i4) {
        if (cVar.f3229d == this) {
            e(cVar.f3230e, cVar2.f3229d, cVar2.f3230e, i4);
        }
    }

    public final void g(q.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.f3237d == null) {
            k kVar = new k(this);
            kVar.h.f3336e = 4;
            kVar.f3359i.f3336e = 5;
            kVar.f3358f = 0;
            this.f3237d = kVar;
        }
        if (this.f3239e == null) {
            m mVar = new m(this);
            t.f fVar = new t.f(mVar);
            mVar.f3347k = fVar;
            mVar.f3348l = null;
            mVar.h.f3336e = 6;
            mVar.f3359i.f3336e = 7;
            fVar.f3336e = 8;
            mVar.f3358f = 1;
            this.f3239e = mVar;
        }
    }

    public c i(int i4) {
        switch (q.e.a(i4)) {
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
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(w0.i(i4));
        }
    }

    public final int j(int i4) {
        int[] iArr = this.f3259p0;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f3242g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.L).f3231f) != null && cVar2.f3231f == cVar) {
                return cVar2.f3229d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3231f;
        if (cVar4 == null || cVar4.f3231f != cVar3) {
            return null;
        }
        return cVar4.f3229d;
    }

    public final d m(int i4) {
        c cVar;
        c cVar2;
        if (i4 != 0) {
            if (i4 == 1 && (cVar2 = (cVar = this.J).f3231f) != null && cVar2.f3231f == cVar) {
                return cVar2.f3229d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f3231f;
        if (cVar4 == null || cVar4.f3231f != cVar3) {
            return null;
        }
        return cVar4.f3229d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f3246j + ":{\n");
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
        int i4 = this.U;
        int i5 = this.f3235b0;
        int[] iArr = this.C;
        int i6 = iArr[0];
        int i7 = this.f3264u;
        int i8 = this.f3261r;
        float f4 = this.f3266w;
        int[] iArr2 = this.f3259p0;
        int i9 = iArr2[0];
        float[] fArr = this.f3249k0;
        float f5 = fArr[0];
        o(sb, "    width", i4, i5, i6, i7, i8, f4, i9);
        int i10 = this.V;
        int i11 = this.f3236c0;
        int i12 = iArr[1];
        int i13 = this.f3267x;
        int i14 = this.f3262s;
        float f6 = this.f3269z;
        int i15 = iArr2[1];
        float f7 = fArr[1];
        o(sb, "    height", i10, i11, i12, i13, i14, f6, i15);
        float f8 = this.W;
        int i16 = this.X;
        if (f8 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f8);
            sb.append(",");
            sb.append(i16);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f3238d0, 0.5f);
        H(sb, "    verticalBias", this.f3240e0, 0.5f);
        G(this.f3245i0, 0, "    horizontalChainStyle", sb);
        G(this.f3247j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f3242g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f3277x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f3278y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i4) {
        if (i4 == 0) {
            return (this.I.f3231f != null ? 1 : 0) + (this.K.f3231f != null ? 1 : 0) < 2;
        }
        if ((this.J.f3231f != null ? 1 : 0) + (this.L.f3231f != null ? 1 : 0) + (this.M.f3231f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f3243h0 != null) {
            str = "id: " + this.f3243h0 + " ";
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

    public final boolean u(int i4, int i5) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i4 == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f3231f;
            if (cVar6 == null || !cVar6.c || (cVar4 = (cVar3 = this.K).f3231f) == null || !cVar4.c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f3231f.d()) >= i5;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f3231f;
        if (cVar8 == null || !cVar8.c || (cVar2 = (cVar = this.L).f3231f) == null || !cVar2.c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f3231f.d()) >= i5;
    }

    public final void v(int i4, int i5, int i6, int i7, d dVar) {
        i(i4).b(dVar.i(i5), i6, i7, true);
    }

    public final boolean w(int i4) {
        c cVar;
        c cVar2;
        int i5 = i4 * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i5];
        c cVar4 = cVar3.f3231f;
        return (cVar4 == null || cVar4.f3231f == cVar3 || (cVar2 = (cVar = cVarArr[i5 + 1]).f3231f) == null || cVar2.f3231f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f3231f;
        if (cVar2 != null && cVar2.f3231f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3231f;
        return cVar4 != null && cVar4.f3231f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f3231f;
        if (cVar2 != null && cVar2.f3231f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f3231f;
        return cVar4 != null && cVar4.f3231f == cVar3;
    }

    public final boolean z() {
        return this.g && this.f3242g0 != 8;
    }
}
