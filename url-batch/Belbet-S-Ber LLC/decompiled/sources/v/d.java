package v;

import android.view.View;
import androidx.emoji2.text.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w.k;
import w.m;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
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
    public int f3612a0;

    /* renamed from: b, reason: collision with root package name */
    public w.c f3613b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3614b0;

    /* renamed from: c, reason: collision with root package name */
    public w.c f3615c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3616c0;
    public float d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f3618e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f3620f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3622g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f3623h0;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public String f3624j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3625j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3626k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f3627k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3628l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f3629l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3630m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f3631m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3632n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3633n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3634o;

    /* renamed from: o0, reason: collision with root package name */
    public int f3635o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3636p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f3637p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3638q;

    /* renamed from: r, reason: collision with root package name */
    public int f3639r;

    /* renamed from: s, reason: collision with root package name */
    public int f3640s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3641t;

    /* renamed from: u, reason: collision with root package name */
    public int f3642u;

    /* renamed from: v, reason: collision with root package name */
    public int f3643v;

    /* renamed from: w, reason: collision with root package name */
    public float f3644w;

    /* renamed from: x, reason: collision with root package name */
    public int f3645x;

    /* renamed from: y, reason: collision with root package name */
    public int f3646y;

    /* renamed from: z, reason: collision with root package name */
    public float f3647z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3611a = false;
    public k d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f3617e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3619f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f3621g = true;
    public int h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f3626k = false;
        this.f3628l = false;
        this.f3630m = false;
        this.f3632n = false;
        this.f3634o = -1;
        this.f3636p = -1;
        this.f3638q = 0;
        this.f3639r = 0;
        this.f3640s = 0;
        this.f3641t = new int[2];
        this.f3642u = 0;
        this.f3643v = 0;
        this.f3644w = 1.0f;
        this.f3645x = 0;
        this.f3646y = 0;
        this.f3647z = 1.0f;
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
        this.f3637p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3612a0 = 0;
        this.d0 = 0.5f;
        this.f3618e0 = 0.5f;
        this.f3622g0 = 0;
        this.f3623h0 = null;
        this.i0 = 0;
        this.f3625j0 = 0;
        this.f3627k0 = new float[]{-1.0f, -1.0f};
        this.f3629l0 = new d[]{null, null};
        this.f3631m0 = new d[]{null, null};
        this.f3633n0 = -1;
        this.f3635o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i, int i4, String str, StringBuilder sb) {
        if (i == i4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f5, float f6) {
        if (f5 == f6) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f5);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i4, int i5, int i6, int i7, float f5, int i8) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i8 == 1) {
            str2 = "FIXED";
        } else if (i8 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i8 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else {
            if (i8 != 4) {
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
        G(i4, 0, "      min", sb);
        G(i5, Integer.MAX_VALUE, "      max", sb);
        G(i6, 0, "      matchMin", sb);
        G(i7, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f5, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f3609f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f3609f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.f3610g != 0) {
            sb.append(",");
            sb.append(cVar.f3610g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f3626k) {
            return true;
        }
        return this.I.f3607c && this.K.f3607c;
    }

    public boolean B() {
        if (this.f3628l) {
            return true;
        }
        return this.J.f3607c && this.L.f3607c;
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
        this.f3612a0 = 0;
        this.f3614b0 = 0;
        this.f3616c0 = 0;
        this.d0 = 0.5f;
        this.f3618e0 = 0.5f;
        int[] iArr = this.f3637p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3620f0 = null;
        this.f3622g0 = 0;
        this.i0 = 0;
        this.f3625j0 = 0;
        float[] fArr = this.f3627k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3634o = -1;
        this.f3636p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3639r = 0;
        this.f3640s = 0;
        this.f3644w = 1.0f;
        this.f3647z = 1.0f;
        this.f3643v = Integer.MAX_VALUE;
        this.f3646y = Integer.MAX_VALUE;
        this.f3642u = 0;
        this.f3645x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f3619f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3621g = true;
        int[] iArr3 = this.f3641t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
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
        this.f3626k = false;
        this.f3628l = false;
        this.f3630m = false;
        this.f3632n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f3607c = false;
            cVar.f3606b = 0;
        }
    }

    public void F(t tVar) {
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
        this.f3612a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i4) {
        if (this.f3626k) {
            return;
        }
        this.I.l(i);
        this.K.l(i4);
        this.Y = i;
        this.U = i4 - i;
        this.f3626k = true;
    }

    public final void K(int i, int i4) {
        if (this.f3628l) {
            return;
        }
        this.J.l(i);
        this.L.l(i4);
        this.Z = i;
        this.V = i4 - i;
        if (this.E) {
            this.M.l(i + this.f3612a0);
        }
        this.f3628l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i4 = this.f3616c0;
        if (i < i4) {
            this.V = i4;
        }
    }

    public final void M(int i) {
        this.f3637p0[0] = i;
    }

    public final void N(int i) {
        this.f3637p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i4 = this.f3614b0;
        if (i < i4) {
            this.U = i4;
        }
    }

    public void P(boolean z4, boolean z5) {
        int i;
        int i4;
        k kVar = this.d;
        boolean z6 = z4 & kVar.f3776g;
        m mVar = this.f3617e;
        boolean z7 = z5 & mVar.f3776g;
        int i5 = kVar.h.f3755g;
        int i6 = mVar.h.f3755g;
        int i7 = kVar.i.f3755g;
        int i8 = mVar.i.f3755g;
        int i9 = i8 - i6;
        if (i7 - i5 < 0 || i9 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
            i7 = 0;
            i8 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i10 = i7 - i5;
        int i11 = i8 - i6;
        if (z6) {
            this.Y = i5;
        }
        if (z7) {
            this.Z = i6;
        }
        if (this.f3622g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3637p0;
        if (z6) {
            if (iArr[0] == 1 && i10 < (i4 = this.U)) {
                i10 = i4;
            }
            this.U = i10;
            int i12 = this.f3614b0;
            if (i10 < i12) {
                this.U = i12;
            }
        }
        if (z7) {
            if (iArr[1] == 1 && i11 < (i = this.V)) {
                i11 = i;
            }
            this.V = i11;
            int i13 = this.f3616c0;
            if (i11 < i13) {
                this.V = i13;
            }
        }
    }

    public void Q(t.c cVar, boolean z4) {
        int i;
        int i4;
        m mVar;
        k kVar;
        cVar.getClass();
        int n4 = t.c.n(this.I);
        int n5 = t.c.n(this.J);
        int n6 = t.c.n(this.K);
        int n7 = t.c.n(this.L);
        if (z4 && (kVar = this.d) != null) {
            w.f fVar = kVar.h;
            if (fVar.f3756j) {
                w.f fVar2 = kVar.i;
                if (fVar2.f3756j) {
                    n4 = fVar.f3755g;
                    n6 = fVar2.f3755g;
                }
            }
        }
        if (z4 && (mVar = this.f3617e) != null) {
            w.f fVar3 = mVar.h;
            if (fVar3.f3756j) {
                w.f fVar4 = mVar.i;
                if (fVar4.f3756j) {
                    n5 = fVar3.f3755g;
                    n7 = fVar4.f3755g;
                }
            }
        }
        int i5 = n7 - n5;
        if (n6 - n4 < 0 || i5 < 0 || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE || n6 == Integer.MIN_VALUE || n6 == Integer.MAX_VALUE || n7 == Integer.MIN_VALUE || n7 == Integer.MAX_VALUE) {
            n4 = 0;
            n5 = 0;
            n6 = 0;
            n7 = 0;
        }
        int i6 = n6 - n4;
        int i7 = n7 - n5;
        this.Y = n4;
        this.Z = n5;
        if (this.f3622g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3637p0;
        int i8 = iArr[0];
        if (i8 == 1 && i6 < (i4 = this.U)) {
            i6 = i4;
        }
        if (iArr[1] == 1 && i7 < (i = this.V)) {
            i7 = i;
        }
        this.U = i6;
        this.V = i7;
        int i9 = this.f3616c0;
        if (i7 < i9) {
            this.V = i9;
        }
        int i10 = this.f3614b0;
        if (i6 < i10) {
            this.U = i10;
        }
        int i11 = this.f3643v;
        if (i11 > 0 && i8 == 3) {
            this.U = Math.min(this.U, i11);
        }
        int i12 = this.f3646y;
        if (i12 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i12);
        }
        int i13 = this.U;
        if (i6 != i13) {
            this.h = i13;
        }
        int i14 = this.V;
        if (i7 != i14) {
            this.i = i14;
        }
    }

    public final void a(e eVar, t.c cVar, HashSet hashSet, int i, boolean z4) {
        if (z4) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f3605a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f3605a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f3605a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f3605a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f3605a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r12 != 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05d3, code lost:
    
        if (r58.f3622g0 == r14) goto L374;
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
    /* JADX WARN: Type inference failed for: r58v0, types: [v.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(t.c cVar, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        ?? r17;
        int i;
        boolean z8;
        boolean z9;
        d dVar;
        d dVar2;
        boolean[] zArr;
        c cVar2;
        boolean[] zArr2;
        c cVar3;
        c cVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        int i5;
        int[] iArr;
        float f5;
        c cVar5;
        t.f fVar;
        c cVar6;
        int i6;
        int i7;
        int i8;
        boolean z13;
        int i9;
        boolean z14;
        boolean z15;
        c cVar7;
        boolean z16;
        char c5;
        boolean z17;
        int i10;
        int[] iArr2;
        c cVar8;
        t.f fVar2;
        t.f fVar3;
        c cVar9;
        int[] iArr3;
        t.f fVar4;
        boolean z18;
        boolean z19;
        boolean z20;
        t.f fVar5;
        c cVar10;
        t.f fVar6;
        int i11;
        boolean[] zArr3;
        t.f fVar7;
        t.f fVar8;
        t.f fVar9;
        int i12;
        int i13;
        boolean z21;
        int i14;
        t.f fVar10;
        t.f fVar11;
        ?? r27;
        m mVar;
        w.f fVar12;
        d dVar3;
        boolean z22;
        k kVar;
        w.f fVar13;
        int i15;
        int i16;
        boolean x4;
        int i17;
        boolean y4;
        k kVar2;
        m mVar2;
        boolean z23;
        t.c cVar11 = cVar;
        c cVar12 = this.I;
        t.f k4 = cVar11.k(cVar12);
        c cVar13 = this.K;
        t.f k5 = cVar11.k(cVar13);
        c cVar14 = this.J;
        t.f k6 = cVar11.k(cVar14);
        c cVar15 = this.L;
        t.f k7 = cVar11.k(cVar15);
        c cVar16 = this.M;
        t.f k8 = cVar11.k(cVar16);
        d dVar4 = this.T;
        if (dVar4 != null) {
            int[] iArr4 = dVar4.f3637p0;
            r17 = 0;
            z5 = false;
            r17 = 0;
            z7 = iArr4[0] == 2;
            boolean z24 = iArr4[1] == 2;
            int i18 = this.f3638q;
            if (i18 != 1) {
                if (i18 == 2) {
                    z7 = false;
                }
                z6 = z24;
            } else {
                z6 = false;
            }
            i = this.f3622g0;
            boolean[] zArr4 = this.S;
            boolean z25 = z6;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z8 = z7;
                int i19 = r17;
                while (true) {
                    if (i19 < size) {
                        int i20 = size;
                        HashSet hashSet = ((c) arrayList.get(i19)).f3605a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i19++;
                        size = i20;
                    } else if (!zArr4[r17] && !zArr4[1]) {
                        return;
                    }
                }
            } else {
                z8 = z7;
            }
            z9 = this.f3626k;
            if (!z9 || this.f3628l) {
                if (z9) {
                    cVar11.d(k4, this.Y);
                    cVar11.d(k5, this.Y + this.U);
                    if (z8 && (dVar2 = this.T) != null) {
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
                if (this.f3628l) {
                    cVar11.d(k6, this.Z);
                    cVar11.d(k7, this.Z + this.V);
                    HashSet hashSet2 = cVar16.f3605a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.d(k8, this.Z + this.f3612a0);
                    }
                    if (z25 && (dVar = this.T) != null) {
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
                if (this.f3626k && this.f3628l) {
                    boolean z26 = r17;
                    this.f3626k = z26;
                    this.f3628l = z26;
                    return;
                }
            }
            zArr = this.f3619f;
            if (z4 || (kVar2 = this.d) == null || (mVar2 = this.f3617e) == null) {
                cVar2 = cVar16;
                zArr2 = zArr;
            } else {
                cVar2 = cVar16;
                w.f fVar14 = kVar2.h;
                zArr2 = zArr;
                if (fVar14.f3756j && kVar2.i.f3756j && mVar2.h.f3756j && mVar2.i.f3756j) {
                    cVar11.d(k4, fVar14.f3755g);
                    cVar11.d(k5, this.d.i.f3755g);
                    cVar11.d(k6, this.f3617e.h.f3755g);
                    cVar11.d(k7, this.f3617e.i.f3755g);
                    cVar11.d(k8, this.f3617e.f3764k.f3755g);
                    if (this.T != null) {
                        if (z8 && zArr2[0] && !x()) {
                            cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                        }
                        if (z25 && zArr2[1] && !y()) {
                            z23 = false;
                            cVar11.f(cVar11.k(this.T.L), k7, 0, 8);
                            this.f3626k = z23;
                            this.f3628l = z23;
                            return;
                        }
                    }
                    z23 = false;
                    this.f3626k = z23;
                    this.f3628l = z23;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    x4 = true;
                    i17 = 1;
                } else {
                    x4 = x();
                    i17 = 1;
                }
                if (w(i17)) {
                    ((e) this.T).R(this, i17);
                    y4 = true;
                } else {
                    y4 = y();
                }
                if (!x4 && z8 && this.f3622g0 != 8 && cVar12.f3609f == null && cVar13.f3609f == null) {
                    cVar3 = cVar12;
                    cVar11.f(cVar11.k(this.T.K), k5, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!y4 && z25 && this.f3622g0 != 8 && cVar14.f3609f == null && cVar15.f3609f == null && cVar2 == null) {
                    cVar11.f(cVar11.k(this.T.L), k7, 0, 1);
                }
                cVar4 = cVar13;
                z10 = z25;
                z12 = y4;
                z11 = x4;
            } else {
                cVar3 = cVar12;
                cVar4 = cVar13;
                z10 = z25;
                z11 = false;
                z12 = false;
            }
            i4 = this.U;
            i5 = this.f3614b0;
            if (i4 >= i5) {
                i5 = i4;
            }
            int i21 = this.V;
            c cVar17 = cVar4;
            int i22 = this.f3616c0;
            int i23 = i21 >= i22 ? i22 : i21;
            iArr = this.f3637p0;
            int i24 = iArr[0];
            boolean z27 = z10;
            boolean z28 = i24 == 3;
            int i25 = iArr[1];
            boolean z29 = i25 == 3;
            int i26 = this.X;
            this.A = i26;
            f5 = this.W;
            this.B = f5;
            int i27 = this.f3639r;
            int i28 = this.f3640s;
            if (f5 <= 0.0f) {
                cVar5 = cVar15;
                if (this.f3622g0 != 8) {
                    int i29 = (i24 == 3 && i27 == 0) ? 3 : i27;
                    if (i25 == 3 && i28 == 0) {
                        fVar = k7;
                        i16 = 3;
                    } else {
                        fVar = k7;
                        i16 = i28;
                    }
                    if (i24 == 3 && i25 == 3 && i29 == 3 && i16 == 3) {
                        if (i26 == -1) {
                            if (z28 && !z29) {
                                this.A = 0;
                            } else if (!z28 && z29) {
                                this.A = 1;
                                if (i26 == -1) {
                                    this.B = 1.0f / f5;
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
                            int i30 = this.f3642u;
                            if (i30 > 0 && this.f3645x == 0) {
                                this.A = 0;
                            } else if (i30 == 0 && this.f3645x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i24 == 3 && i29 == 3) {
                        this.A = 0;
                        i5 = (int) (f5 * i21);
                        if (i25 != 3) {
                            cVar6 = cVar2;
                            i6 = i23;
                            i7 = 4;
                            z13 = false;
                            i8 = i16;
                            int[] iArr5 = this.f3641t;
                            iArr5[0] = i7;
                            iArr5[1] = i8;
                            if (z13) {
                            }
                            z14 = false;
                            if (z13) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z15) {
                            }
                            cVar7 = this.P;
                            z16 = !cVar7.h();
                            c5 = '\b';
                            z17 = zArr4[0];
                            boolean z30 = zArr4[1];
                            i10 = this.f3634o;
                            iArr2 = this.C;
                            if (i10 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k4;
                            fVar3 = k5;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k8;
                            z18 = z11;
                            z19 = z8;
                            z20 = z27;
                            fVar5 = k6;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i11 = i7;
                            zArr3 = zArr2;
                            if (z4) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z21 = true;
                            i14 = 1;
                            if (this.f3636p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z13) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3626k = false;
                            this.f3628l = false;
                        }
                    } else if (i25 == 3 && i16 == 3) {
                        this.A = 1;
                        if (i26 == -1) {
                            this.B = 1.0f / f5;
                        }
                        i6 = (int) (this.B * i4);
                        if (i24 == 3) {
                            i7 = i29;
                            cVar6 = cVar2;
                            z13 = true;
                            i8 = i16;
                            int[] iArr52 = this.f3641t;
                            iArr52[0] = i7;
                            iArr52[1] = i8;
                            if (z13) {
                            }
                            z14 = false;
                            if (z13) {
                            }
                            if (iArr[0] != 2) {
                            }
                            if (z15) {
                            }
                            cVar7 = this.P;
                            z16 = !cVar7.h();
                            c5 = '\b';
                            z17 = zArr4[0];
                            boolean z302 = zArr4[1];
                            i10 = this.f3634o;
                            iArr2 = this.C;
                            if (i10 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = k4;
                            fVar3 = k5;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = k8;
                            z18 = z11;
                            z19 = z8;
                            z20 = z27;
                            fVar5 = k6;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i11 = i7;
                            zArr3 = zArr2;
                            if (z4) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z21 = true;
                            i14 = 1;
                            if (this.f3636p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z13) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3626k = false;
                            this.f3628l = false;
                        }
                        i7 = i29;
                        cVar6 = cVar2;
                        i8 = 4;
                        z13 = false;
                        int[] iArr522 = this.f3641t;
                        iArr522[0] = i7;
                        iArr522[1] = i8;
                        if (z13) {
                            i9 = -1;
                        } else {
                            int i31 = this.A;
                            i9 = -1;
                            if (i31 == 0 || i31 == -1) {
                                z14 = true;
                                boolean z31 = !z13 && ((i15 = this.A) == 1 || i15 == i9);
                                z15 = iArr[0] != 2 && (this instanceof e);
                                if (z15) {
                                    i5 = 0;
                                }
                                cVar7 = this.P;
                                z16 = !cVar7.h();
                                c5 = '\b';
                                z17 = zArr4[0];
                                boolean z3022 = zArr4[1];
                                i10 = this.f3634o;
                                iArr2 = this.C;
                                if (i10 != 2 && !this.f3626k) {
                                    if (z4 && (kVar = this.d) != null) {
                                        fVar13 = kVar.h;
                                        if (fVar13.f3756j || !kVar.i.f3756j) {
                                            c5 = '\b';
                                        } else if (z4) {
                                            cVar11.d(k4, fVar13.f3755g);
                                            cVar11.d(k5, this.d.i.f3755g);
                                            if (this.T != null && z8 && zArr2[0] && !x()) {
                                                cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                                            }
                                        }
                                    }
                                    d dVar5 = this.T;
                                    t.f k9 = dVar5 == null ? cVar11.k(dVar5.K) : null;
                                    d dVar6 = this.T;
                                    t.f k10 = dVar6 == null ? cVar11.k(dVar6.I) : null;
                                    z19 = z8;
                                    i11 = i7;
                                    z18 = z11;
                                    cVar9 = cVar7;
                                    iArr3 = iArr2;
                                    boolean z32 = z14;
                                    fVar2 = k4;
                                    z20 = z27;
                                    fVar5 = k6;
                                    fVar3 = k5;
                                    cVar10 = cVar5;
                                    fVar6 = fVar;
                                    cVar8 = cVar6;
                                    fVar4 = k8;
                                    zArr3 = zArr2;
                                    cVar11 = cVar;
                                    d(cVar11, true, z19, z20, zArr2[0], k10, k9, iArr[0], z15, this.I, this.K, this.Y, i5, this.f3614b0, iArr2[0], this.d0, z32, iArr[1] == 3, z18, z12, z17, i11, i8, this.f3642u, this.f3643v, this.f3644w, z16);
                                    if (z4 && (mVar = this.f3617e) != null) {
                                        fVar12 = mVar.h;
                                        if (fVar12.f3756j && mVar.i.f3756j) {
                                            int i32 = fVar12.f3755g;
                                            fVar7 = fVar5;
                                            cVar11.d(fVar7, i32);
                                            fVar8 = fVar6;
                                            cVar11.d(fVar8, this.f3617e.i.f3755g);
                                            fVar9 = fVar4;
                                            cVar11.d(fVar9, this.f3617e.f3764k.f3755g);
                                            dVar3 = this.T;
                                            if (dVar3 == null && !z12 && z20) {
                                                z22 = true;
                                                z22 = true;
                                                if (zArr3[1]) {
                                                    i12 = 0;
                                                    i13 = 8;
                                                    cVar11.f(cVar11.k(dVar3.L), fVar8, 0, 8);
                                                } else {
                                                    i12 = 0;
                                                    i13 = 8;
                                                }
                                            } else {
                                                i12 = 0;
                                                i13 = 8;
                                                z22 = true;
                                            }
                                            i14 = i12;
                                            z21 = z22;
                                            if (this.f3636p == 2) {
                                                i14 = i12;
                                            }
                                            if (i14 != 0 || this.f3628l) {
                                                fVar10 = fVar7;
                                                fVar11 = fVar8;
                                            } else {
                                                int i33 = (iArr[z21 ? 1 : 0] == 2 && (this instanceof e)) ? z21 ? 1 : 0 : i12;
                                                int i34 = i33 != 0 ? i12 : i6;
                                                d dVar7 = this.T;
                                                t.f k11 = dVar7 != null ? cVar11.k(dVar7.L) : null;
                                                d dVar8 = this.T;
                                                t.f k12 = dVar8 != null ? cVar11.k(dVar8.J) : null;
                                                int i35 = this.f3612a0;
                                                if (i35 <= 0) {
                                                    r27 = z16;
                                                }
                                                c cVar18 = cVar8;
                                                if (cVar18.f3609f != null) {
                                                    cVar11.e(fVar9, fVar7, i35, i13);
                                                    cVar11.e(fVar9, cVar11.k(cVar18.f3609f), cVar18.e(), i13);
                                                    if (z20) {
                                                        cVar11.f(k11, cVar11.k(cVar10), i12, 5);
                                                    }
                                                    r27 = i12;
                                                } else if (this.f3622g0 == i13) {
                                                    cVar11.e(fVar9, fVar7, cVar18.e(), i13);
                                                    r27 = z16;
                                                } else {
                                                    cVar11.e(fVar9, fVar7, i35, i13);
                                                    r27 = z16;
                                                }
                                                boolean z33 = zArr3[z21 ? 1 : 0];
                                                int i36 = i12;
                                                int i37 = iArr[z21 ? 1 : 0];
                                                int i38 = this.Z;
                                                int i39 = this.f3616c0;
                                                int i40 = iArr3[z21 ? 1 : 0];
                                                float f6 = this.f3618e0;
                                                int i41 = iArr[i36];
                                                boolean z34 = z21 ? 1 : 0;
                                                ?? r18 = z21;
                                                if (i41 != 3) {
                                                    r18 = i36;
                                                }
                                                fVar11 = fVar8;
                                                fVar10 = fVar7;
                                                cVar11 = cVar;
                                                d(cVar11, false, z20, z19, z33, k12, k11, i37, i33, this.J, this.L, i38, i34, i39, i40, f6, z31, r18, z12, z18, z3022, i8, i11, this.f3645x, this.f3646y, this.f3647z, r27);
                                            }
                                            if (z13) {
                                                if (this.A == 1) {
                                                    float f7 = this.B;
                                                    t.b l4 = cVar11.l();
                                                    l4.d.g(fVar11, -1.0f);
                                                    l4.d.g(fVar10, 1.0f);
                                                    l4.d.g(fVar3, f7);
                                                    l4.d.g(fVar2, -f7);
                                                    cVar11.c(l4);
                                                } else {
                                                    float f8 = this.B;
                                                    t.b l5 = cVar11.l();
                                                    l5.d.g(fVar3, -1.0f);
                                                    l5.d.g(fVar2, 1.0f);
                                                    l5.d.g(fVar11, f8);
                                                    l5.d.g(fVar10, -f8);
                                                    cVar11.c(l5);
                                                }
                                            }
                                            if (cVar9.h()) {
                                                c cVar19 = cVar9;
                                                d dVar9 = cVar19.f3609f.d;
                                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                                int e4 = cVar19.e();
                                                t.f k13 = cVar11.k(i(2));
                                                t.f k14 = cVar11.k(i(3));
                                                t.f k15 = cVar11.k(i(4));
                                                t.f k16 = cVar11.k(i(5));
                                                t.f k17 = cVar11.k(dVar9.i(2));
                                                t.f k18 = cVar11.k(dVar9.i(3));
                                                t.f k19 = cVar11.k(dVar9.i(4));
                                                t.f k20 = cVar11.k(dVar9.i(5));
                                                t.b l6 = cVar11.l();
                                                double d = radians;
                                                double sin = Math.sin(d);
                                                double d5 = e4;
                                                l6.d.g(k18, 0.5f);
                                                l6.d.g(k20, 0.5f);
                                                l6.d.g(k14, -0.5f);
                                                l6.d.g(k16, -0.5f);
                                                l6.f3355b = -((float) (sin * d5));
                                                cVar11.c(l6);
                                                t.b l7 = cVar11.l();
                                                float cos = (float) (Math.cos(d) * d5);
                                                l7.d.g(k17, 0.5f);
                                                l7.d.g(k19, 0.5f);
                                                l7.d.g(k13, -0.5f);
                                                l7.d.g(k15, -0.5f);
                                                l7.f3355b = -cos;
                                                cVar11.c(l7);
                                            }
                                            this.f3626k = false;
                                            this.f3628l = false;
                                        }
                                    }
                                    fVar7 = fVar5;
                                    fVar8 = fVar6;
                                    fVar9 = fVar4;
                                    i12 = 0;
                                    i13 = 8;
                                    z21 = true;
                                    i14 = 1;
                                    if (this.f3636p == 2) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    fVar10 = fVar7;
                                    fVar11 = fVar8;
                                    if (z13) {
                                    }
                                    if (cVar9.h()) {
                                    }
                                    this.f3626k = false;
                                    this.f3628l = false;
                                }
                                cVar8 = cVar6;
                                fVar2 = k4;
                                fVar3 = k5;
                                cVar9 = cVar7;
                                iArr3 = iArr2;
                                fVar4 = k8;
                                z18 = z11;
                                z19 = z8;
                                z20 = z27;
                                fVar5 = k6;
                                cVar10 = cVar5;
                                fVar6 = fVar;
                                i11 = i7;
                                zArr3 = zArr2;
                                if (z4) {
                                    fVar12 = mVar.h;
                                    if (fVar12.f3756j) {
                                        int i322 = fVar12.f3755g;
                                        fVar7 = fVar5;
                                        cVar11.d(fVar7, i322);
                                        fVar8 = fVar6;
                                        cVar11.d(fVar8, this.f3617e.i.f3755g);
                                        fVar9 = fVar4;
                                        cVar11.d(fVar9, this.f3617e.f3764k.f3755g);
                                        dVar3 = this.T;
                                        if (dVar3 == null) {
                                        }
                                        i12 = 0;
                                        i13 = 8;
                                        z22 = true;
                                        i14 = i12;
                                        z21 = z22;
                                        if (this.f3636p == 2) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        fVar10 = fVar7;
                                        fVar11 = fVar8;
                                        if (z13) {
                                        }
                                        if (cVar9.h()) {
                                        }
                                        this.f3626k = false;
                                        this.f3628l = false;
                                    }
                                }
                                fVar7 = fVar5;
                                fVar8 = fVar6;
                                fVar9 = fVar4;
                                i12 = 0;
                                i13 = 8;
                                z21 = true;
                                i14 = 1;
                                if (this.f3636p == 2) {
                                }
                                if (i14 != 0) {
                                }
                                fVar10 = fVar7;
                                fVar11 = fVar8;
                                if (z13) {
                                }
                                if (cVar9.h()) {
                                }
                                this.f3626k = false;
                                this.f3628l = false;
                            }
                        }
                        z14 = false;
                        if (z13) {
                        }
                        if (iArr[0] != 2) {
                        }
                        if (z15) {
                        }
                        cVar7 = this.P;
                        z16 = !cVar7.h();
                        c5 = '\b';
                        z17 = zArr4[0];
                        boolean z30222 = zArr4[1];
                        i10 = this.f3634o;
                        iArr2 = this.C;
                        if (i10 != 2) {
                            if (z4) {
                                fVar13 = kVar.h;
                                if (fVar13.f3756j) {
                                }
                                c5 = '\b';
                            }
                            d dVar52 = this.T;
                            if (dVar52 == null) {
                            }
                            d dVar62 = this.T;
                            if (dVar62 == null) {
                            }
                            z19 = z8;
                            i11 = i7;
                            z18 = z11;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            boolean z322 = z14;
                            fVar2 = k4;
                            z20 = z27;
                            fVar5 = k6;
                            fVar3 = k5;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            cVar8 = cVar6;
                            fVar4 = k8;
                            zArr3 = zArr2;
                            cVar11 = cVar;
                            d(cVar11, true, z19, z20, zArr2[0], k10, k9, iArr[0], z15, this.I, this.K, this.Y, i5, this.f3614b0, iArr2[0], this.d0, z322, iArr[1] == 3, z18, z12, z17, i11, i8, this.f3642u, this.f3643v, this.f3644w, z16);
                            if (z4) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z21 = true;
                            i14 = 1;
                            if (this.f3636p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z13) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3626k = false;
                            this.f3628l = false;
                        }
                        cVar8 = cVar6;
                        fVar2 = k4;
                        fVar3 = k5;
                        cVar9 = cVar7;
                        iArr3 = iArr2;
                        fVar4 = k8;
                        z18 = z11;
                        z19 = z8;
                        z20 = z27;
                        fVar5 = k6;
                        cVar10 = cVar5;
                        fVar6 = fVar;
                        i11 = i7;
                        zArr3 = zArr2;
                        if (z4) {
                        }
                        fVar7 = fVar5;
                        fVar8 = fVar6;
                        fVar9 = fVar4;
                        i12 = 0;
                        i13 = 8;
                        z21 = true;
                        i14 = 1;
                        if (this.f3636p == 2) {
                        }
                        if (i14 != 0) {
                        }
                        fVar10 = fVar7;
                        fVar11 = fVar8;
                        if (z13) {
                        }
                        if (cVar9.h()) {
                        }
                        this.f3626k = false;
                        this.f3628l = false;
                    }
                    i7 = i29;
                    cVar6 = cVar2;
                    i6 = i23;
                    z13 = true;
                    i8 = i16;
                    int[] iArr5222 = this.f3641t;
                    iArr5222[0] = i7;
                    iArr5222[1] = i8;
                    if (z13) {
                    }
                    z14 = false;
                    if (z13) {
                    }
                    if (iArr[0] != 2) {
                    }
                    if (z15) {
                    }
                    cVar7 = this.P;
                    z16 = !cVar7.h();
                    c5 = '\b';
                    z17 = zArr4[0];
                    boolean z302222 = zArr4[1];
                    i10 = this.f3634o;
                    iArr2 = this.C;
                    if (i10 != 2) {
                    }
                    cVar8 = cVar6;
                    fVar2 = k4;
                    fVar3 = k5;
                    cVar9 = cVar7;
                    iArr3 = iArr2;
                    fVar4 = k8;
                    z18 = z11;
                    z19 = z8;
                    z20 = z27;
                    fVar5 = k6;
                    cVar10 = cVar5;
                    fVar6 = fVar;
                    i11 = i7;
                    zArr3 = zArr2;
                    if (z4) {
                    }
                    fVar7 = fVar5;
                    fVar8 = fVar6;
                    fVar9 = fVar4;
                    i12 = 0;
                    i13 = 8;
                    z21 = true;
                    i14 = 1;
                    if (this.f3636p == 2) {
                    }
                    if (i14 != 0) {
                    }
                    fVar10 = fVar7;
                    fVar11 = fVar8;
                    if (z13) {
                    }
                    if (cVar9.h()) {
                    }
                    this.f3626k = false;
                    this.f3628l = false;
                }
            } else {
                cVar5 = cVar15;
            }
            fVar = k7;
            cVar6 = cVar2;
            i6 = i23;
            i7 = i27;
            i8 = i28;
            z13 = false;
            int[] iArr52222 = this.f3641t;
            iArr52222[0] = i7;
            iArr52222[1] = i8;
            if (z13) {
            }
            z14 = false;
            if (z13) {
            }
            if (iArr[0] != 2) {
            }
            if (z15) {
            }
            cVar7 = this.P;
            z16 = !cVar7.h();
            c5 = '\b';
            z17 = zArr4[0];
            boolean z3022222 = zArr4[1];
            i10 = this.f3634o;
            iArr2 = this.C;
            if (i10 != 2) {
            }
            cVar8 = cVar6;
            fVar2 = k4;
            fVar3 = k5;
            cVar9 = cVar7;
            iArr3 = iArr2;
            fVar4 = k8;
            z18 = z11;
            z19 = z8;
            z20 = z27;
            fVar5 = k6;
            cVar10 = cVar5;
            fVar6 = fVar;
            i11 = i7;
            zArr3 = zArr2;
            if (z4) {
            }
            fVar7 = fVar5;
            fVar8 = fVar6;
            fVar9 = fVar4;
            i12 = 0;
            i13 = 8;
            z21 = true;
            i14 = 1;
            if (this.f3636p == 2) {
            }
            if (i14 != 0) {
            }
            fVar10 = fVar7;
            fVar11 = fVar8;
            if (z13) {
            }
            if (cVar9.h()) {
            }
            this.f3626k = false;
            this.f3628l = false;
        }
        z5 = false;
        z6 = z5 ? 1 : 0;
        z7 = z6;
        r17 = z5;
        i = this.f3622g0;
        boolean[] zArr42 = this.S;
        boolean z252 = z6;
        if (i != 8) {
        }
        z9 = this.f3626k;
        if (!z9) {
        }
        if (z9) {
        }
        if (this.f3628l) {
        }
        if (this.f3626k) {
            boolean z262 = r17;
            this.f3626k = z262;
            this.f3628l = z262;
            return;
        }
        zArr = this.f3619f;
        if (z4) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i4 = this.U;
        i5 = this.f3614b0;
        if (i4 >= i5) {
        }
        int i212 = this.V;
        c cVar172 = cVar4;
        int i222 = this.f3616c0;
        if (i212 >= i222) {
        }
        iArr = this.f3637p0;
        int i242 = iArr[0];
        boolean z272 = z10;
        if (i242 == 3) {
        }
        int i252 = iArr[1];
        if (i252 == 3) {
        }
        int i262 = this.X;
        this.A = i262;
        f5 = this.W;
        this.B = f5;
        int i272 = this.f3639r;
        int i282 = this.f3640s;
        if (f5 <= 0.0f) {
        }
        fVar = k7;
        cVar6 = cVar2;
        i6 = i23;
        i7 = i272;
        i8 = i282;
        z13 = false;
        int[] iArr522222 = this.f3641t;
        iArr522222[0] = i7;
        iArr522222[1] = i8;
        if (z13) {
        }
        z14 = false;
        if (z13) {
        }
        if (iArr[0] != 2) {
        }
        if (z15) {
        }
        cVar7 = this.P;
        z16 = !cVar7.h();
        c5 = '\b';
        z17 = zArr42[0];
        boolean z30222222 = zArr42[1];
        i10 = this.f3634o;
        iArr2 = this.C;
        if (i10 != 2) {
        }
        cVar8 = cVar6;
        fVar2 = k4;
        fVar3 = k5;
        cVar9 = cVar7;
        iArr3 = iArr2;
        fVar4 = k8;
        z18 = z11;
        z19 = z8;
        z20 = z272;
        fVar5 = k6;
        cVar10 = cVar5;
        fVar6 = fVar;
        i11 = i7;
        zArr3 = zArr2;
        if (z4) {
        }
        fVar7 = fVar5;
        fVar8 = fVar6;
        fVar9 = fVar4;
        i12 = 0;
        i13 = 8;
        z21 = true;
        i14 = 1;
        if (this.f3636p == 2) {
        }
        if (i14 != 0) {
        }
        fVar10 = fVar7;
        fVar11 = fVar8;
        if (z13) {
        }
        if (cVar9.h()) {
        }
        this.f3626k = false;
        this.f3628l = false;
    }

    public boolean c() {
        return this.f3622g0 != 8;
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
    public final void d(t.c cVar, boolean z4, boolean z5, boolean z6, boolean z7, t.f fVar, t.f fVar2, int i, boolean z8, c cVar2, c cVar3, int i4, int i5, int i6, int i7, float f5, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i8, int i9, int i10, int i11, float f6, boolean z14) {
        boolean z15;
        boolean z16;
        int i12;
        boolean z17;
        boolean z18;
        int i13;
        int i14;
        boolean z19;
        t.f k4;
        t.f k5;
        c cVar4;
        t.f fVar3;
        boolean z20;
        int i15;
        t.f fVar4;
        t.f fVar5;
        t.f fVar6;
        t.f fVar7;
        int i16;
        int i17;
        int i18;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        d dVar;
        int i19;
        int i20;
        c cVar5;
        boolean z25;
        int i21;
        boolean z26;
        int i22;
        int i23;
        HashSet hashSet;
        boolean z27;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z28;
        boolean z29;
        int i29;
        t.c cVar6 = cVar;
        int i30 = i10;
        int i31 = i11;
        t.f k6 = cVar6.k(cVar2);
        t.f k7 = cVar6.k(cVar3);
        t.f k8 = cVar6.k(cVar2.f3609f);
        t.f k9 = cVar6.k(cVar3.f3609f);
        boolean h = cVar2.h();
        boolean h5 = cVar3.h();
        boolean h6 = this.P.h();
        int i32 = h5 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h6) {
            i32++;
        }
        int i33 = i32;
        int i34 = z9 ? 3 : i8;
        int a5 = t.e.a(i);
        boolean z30 = (a5 == 0 || a5 == 1 || a5 != 2 || i34 == 4) ? false : true;
        int i35 = this.h;
        if (i35 == -1 || !z4) {
            i35 = i5;
            z15 = z30;
        } else {
            this.h = -1;
            z15 = false;
        }
        int i36 = this.i;
        if (i36 == -1 || z4) {
            z16 = z15;
        } else {
            this.i = -1;
            i35 = i36;
            z16 = false;
        }
        boolean z31 = z16;
        if (this.f3622g0 == 8) {
            z17 = false;
            i12 = 0;
        } else {
            i12 = i35;
            z17 = z31;
        }
        if (z14) {
            if (!h && !h5 && !h6) {
                cVar6.d(k6, i4);
            } else if (h && !h5) {
                z18 = z17;
                i13 = 8;
                cVar6.e(k6, k8, cVar2.e(), 8);
            }
            z18 = z17;
            i13 = 8;
        } else {
            z18 = z17;
            i13 = 8;
        }
        if (z18) {
            if (i33 == 2 || z9 || !(i34 == 1 || i34 == 0)) {
                if (i30 == -2) {
                    i30 = i12;
                }
                if (i31 == -2) {
                    i31 = i12;
                }
                if (i12 > 0 && i34 != 1) {
                    i12 = 0;
                }
                if (i30 > 0) {
                    cVar6.f(k7, k6, i30, 8);
                    i12 = Math.max(i12, i30);
                }
                if (i31 > 0) {
                    if (!z5 || i34 != 1) {
                        cVar6.g(k7, k6, i31, 8);
                    }
                    i12 = Math.min(i12, i31);
                }
                if (i34 == 1) {
                    if (z5) {
                        cVar6.e(k7, k6, i12, 8);
                    } else if (z11) {
                        cVar6.e(k7, k6, i12, 5);
                        cVar6.g(k7, k6, i12, 8);
                    } else {
                        cVar6.e(k7, k6, i12, 5);
                        cVar6.g(k7, k6, i12, 8);
                    }
                } else if (i34 == 2) {
                    int i37 = cVar2.f3608e;
                    if (i37 == 3 || i37 == 5) {
                        k4 = cVar6.k(this.T.i(3));
                        k5 = cVar6.k(this.T.i(5));
                    } else {
                        k4 = cVar6.k(this.T.i(2));
                        k5 = cVar6.k(this.T.i(4));
                    }
                    t.b l4 = cVar6.l();
                    int i38 = i30;
                    l4.d.g(k7, -1.0f);
                    l4.d.g(k6, 1.0f);
                    l4.d.g(k5, f6);
                    l4.d.g(k4, -f6);
                    cVar6.c(l4);
                    if (z5) {
                        z18 = false;
                    }
                    z19 = z7;
                    i14 = i38;
                } else {
                    i14 = i30;
                    z19 = true;
                }
            } else {
                int max = Math.max(i30, i12);
                if (i31 > 0) {
                    max = Math.min(i31, max);
                }
                cVar6.e(k7, k6, max, 8);
                z19 = z7;
                i14 = i30;
                z18 = false;
            }
            if (z14 || z11) {
                boolean z32 = z19;
                if (i33 >= 2 && z5 && z32) {
                    cVar6.f(k6, fVar, 0, 8);
                    c cVar7 = this.M;
                    boolean z33 = z4 || cVar7.f3609f == null;
                    if (!z4 && (cVar4 = cVar7.f3609f) != null) {
                        d dVar2 = cVar4.d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f3637p0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z33 = true;
                            }
                        }
                        z33 = false;
                    }
                    if (z33) {
                        cVar6.f(fVar2, k7, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h5 && !h6) {
                cVar5 = cVar3;
                fVar6 = k7;
                z20 = z19;
                fVar3 = k9;
            } else if (!h || h5) {
                if (h || !h5) {
                    fVar3 = k9;
                    if (h && h5) {
                        d dVar3 = cVar2.f3609f.d;
                        d dVar4 = cVar3.f3609f.d;
                        z20 = z19;
                        d dVar5 = this.T;
                        int i39 = 6;
                        if (z18) {
                            if (i34 == 0) {
                                if (i31 != 0 || i14 != 0) {
                                    i27 = 5;
                                    i28 = 5;
                                    z28 = true;
                                    z29 = false;
                                    z22 = true;
                                } else if (k8.f3378k && fVar3.f3378k) {
                                    cVar6.e(k6, k8, cVar2.e(), 8);
                                    cVar6.e(k7, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i27 = 8;
                                    i28 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z22 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i15 = i34;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    z23 = z29;
                                    fVar4 = fVar2;
                                    i17 = i27;
                                    fVar7 = k8;
                                    i16 = 6;
                                    z21 = z28;
                                    i18 = 4;
                                    if (z22 || fVar7 != fVar3 || dVar3 == dVar5) {
                                        z24 = true;
                                    } else {
                                        z22 = false;
                                        z24 = false;
                                    }
                                    if (z21) {
                                        dVar = dVar4;
                                        i19 = i14;
                                        i20 = i15;
                                        cVar5 = cVar3;
                                        z25 = z5;
                                    } else {
                                        if (z18 || z10 || z12 || fVar7 != fVar || fVar3 != fVar4) {
                                            z25 = z5;
                                            z27 = z24;
                                            i24 = i17;
                                        } else {
                                            i16 = 8;
                                            z25 = false;
                                            i24 = 8;
                                            z27 = false;
                                        }
                                        t.f fVar8 = fVar7;
                                        i19 = i14;
                                        i20 = i15;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.b(fVar5, fVar8, cVar2.e(), f5, fVar3, fVar6, cVar3.e(), i16);
                                        fVar7 = fVar8;
                                        i17 = i24;
                                        z24 = z27;
                                    }
                                    if (this.f3622g0 != 8 && ((hashSet = cVar5.f3605a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z22) {
                                        if (z25 && fVar7 != fVar3 && !z18 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i17 = 6;
                                        }
                                        cVar6.f(fVar5, fVar7, cVar2.e(), i17);
                                        cVar6.g(fVar6, fVar3, -cVar5.e(), i17);
                                    }
                                    if (z25 || !z13 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i21 = i18;
                                        z26 = z24;
                                    } else {
                                        i21 = 6;
                                        i17 = 6;
                                        z26 = true;
                                    }
                                    if (z26) {
                                        if (z23 && (!z12 || z6)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i39 = i21;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i39 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i39 = 5;
                                            }
                                            i21 = Math.max(z12 ? 5 : i39, i21);
                                        }
                                        if (z25) {
                                            i21 = Math.min(i17, i21);
                                            if (z9 && !z12 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i23 = 4;
                                                cVar6.e(fVar5, fVar7, cVar2.e(), i23);
                                                cVar6.e(fVar6, fVar3, -cVar5.e(), i23);
                                            }
                                        }
                                        i23 = i21;
                                        cVar6.e(fVar5, fVar7, cVar2.e(), i23);
                                        cVar6.e(fVar6, fVar3, -cVar5.e(), i23);
                                    }
                                    if (z25) {
                                        int e4 = fVar == fVar7 ? cVar2.e() : 0;
                                        if (fVar7 != fVar) {
                                            cVar6.f(fVar5, fVar, e4, 5);
                                        }
                                    }
                                    if (z25 && z18 && i6 == 0 && i19 == 0) {
                                        if (z18 || i20 != 3) {
                                            i22 = 5;
                                            cVar6.f(fVar6, fVar5, 0, 5);
                                        } else {
                                            cVar6.f(fVar6, fVar5, 0, 8);
                                        }
                                    }
                                    i22 = 5;
                                } else {
                                    cVar6 = cVar;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    z23 = z29;
                                    i17 = i27;
                                    fVar7 = k8;
                                    i16 = 6;
                                    z21 = z28;
                                    i18 = i28;
                                    i15 = i34;
                                    fVar4 = fVar2;
                                    if (z22) {
                                    }
                                    z24 = true;
                                    if (z21) {
                                    }
                                    if (this.f3622g0 != 8) {
                                    }
                                    if (z22) {
                                    }
                                    if (z25) {
                                    }
                                    i21 = i18;
                                    z26 = z24;
                                    if (z26) {
                                    }
                                    if (z25) {
                                    }
                                    if (z25) {
                                        if (z18) {
                                        }
                                        i22 = 5;
                                        cVar6.f(fVar6, fVar5, 0, 5);
                                    }
                                    i22 = 5;
                                }
                            } else {
                                if (i34 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        cVar6 = cVar;
                                        i15 = i34;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i16 = 6;
                                        i17 = 5;
                                    } else {
                                        cVar6 = cVar;
                                        i15 = i34;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i16 = 6;
                                        i17 = 5;
                                        i18 = 5;
                                        z21 = true;
                                        z22 = true;
                                        z23 = false;
                                        fVar4 = fVar2;
                                        if (z22) {
                                        }
                                        z24 = true;
                                        if (z21) {
                                        }
                                        if (this.f3622g0 != 8) {
                                        }
                                        if (z22) {
                                        }
                                        if (z25) {
                                        }
                                        i21 = i18;
                                        z26 = z24;
                                        if (z26) {
                                        }
                                        if (z25) {
                                        }
                                        if (z25) {
                                        }
                                        i22 = 5;
                                    }
                                } else if (i34 == 1) {
                                    cVar6 = cVar;
                                    i15 = i34;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    fVar7 = k8;
                                    i16 = 6;
                                    i17 = 8;
                                } else if (i34 == 3) {
                                    i15 = i34;
                                    if (this.A != -1) {
                                        if (z9) {
                                            if (i9 == 2 || i9 == 1) {
                                                i25 = 5;
                                                i26 = 4;
                                            } else {
                                                i25 = 8;
                                                i26 = 5;
                                            }
                                            i18 = i26;
                                            fVar5 = k6;
                                            fVar6 = k7;
                                            fVar7 = k8;
                                            i16 = 6;
                                            z21 = true;
                                            z22 = true;
                                            z23 = true;
                                            fVar4 = fVar2;
                                        } else if (i31 > 0) {
                                            cVar6 = cVar;
                                            fVar4 = fVar2;
                                            fVar5 = k6;
                                            fVar6 = k7;
                                            fVar7 = k8;
                                            i16 = 6;
                                            i17 = 5;
                                        } else {
                                            if (i31 != 0 || i14 != 0) {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i16 = 6;
                                                i17 = 5;
                                                i18 = 4;
                                            } else if (z12) {
                                                i25 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i16 = 6;
                                                i18 = 4;
                                                z21 = true;
                                                z22 = true;
                                                z23 = true;
                                            } else {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i16 = 6;
                                                i17 = 5;
                                                i18 = 8;
                                            }
                                            z21 = true;
                                            z22 = true;
                                            z23 = true;
                                            if (z22) {
                                            }
                                            z24 = true;
                                            if (z21) {
                                            }
                                            if (this.f3622g0 != 8) {
                                            }
                                            if (z22) {
                                            }
                                            if (z25) {
                                            }
                                            i21 = i18;
                                            z26 = z24;
                                            if (z26) {
                                            }
                                            if (z25) {
                                            }
                                            if (z25) {
                                            }
                                            i22 = 5;
                                        }
                                        i17 = i25;
                                        cVar6 = cVar;
                                        if (z22) {
                                        }
                                        z24 = true;
                                        if (z21) {
                                        }
                                        if (this.f3622g0 != 8) {
                                        }
                                        if (z22) {
                                        }
                                        if (z25) {
                                        }
                                        i21 = i18;
                                        z26 = z24;
                                        if (z26) {
                                        }
                                        if (z25) {
                                        }
                                        if (z25) {
                                        }
                                        i22 = 5;
                                    } else if (z12) {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i17 = 8;
                                        i16 = z5 ? 5 : 4;
                                    } else {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i17 = 8;
                                        i16 = 8;
                                    }
                                    i18 = 5;
                                    z21 = true;
                                    z22 = true;
                                    z23 = true;
                                    if (z22) {
                                    }
                                    z24 = true;
                                    if (z21) {
                                    }
                                    if (this.f3622g0 != 8) {
                                    }
                                    if (z22) {
                                    }
                                    if (z25) {
                                    }
                                    i21 = i18;
                                    z26 = z24;
                                    if (z26) {
                                    }
                                    if (z25) {
                                    }
                                    if (z25) {
                                    }
                                    i22 = 5;
                                } else {
                                    i15 = i34;
                                    cVar6 = cVar;
                                    fVar4 = fVar2;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    fVar7 = k8;
                                    i16 = 6;
                                    i17 = 5;
                                    i18 = 4;
                                    z21 = false;
                                    z22 = false;
                                }
                                i18 = 4;
                                z21 = true;
                                z22 = true;
                                z23 = false;
                                fVar4 = fVar2;
                                if (z22) {
                                }
                                z24 = true;
                                if (z21) {
                                }
                                if (this.f3622g0 != 8) {
                                }
                                if (z22) {
                                }
                                if (z25) {
                                }
                                i21 = i18;
                                z26 = z24;
                                if (z26) {
                                }
                                if (z25) {
                                }
                                if (z25) {
                                }
                                i22 = 5;
                            }
                            i29 = i22;
                            if (z25 && z20) {
                                int e5 = cVar5.f3609f != null ? cVar5.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar6.f(fVar2, fVar6, e5, i29);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i15 = i34;
                        if (k8.f3378k && fVar3.f3378k) {
                            cVar.b(k6, k8, cVar2.e(), f5, fVar3, k7, cVar3.e(), 8);
                            if (z5 && z20) {
                                int e6 = cVar3.f3609f != null ? cVar3.e() : 0;
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
                        i16 = 6;
                        i17 = 5;
                        i18 = 4;
                        z21 = true;
                        z22 = true;
                        z23 = false;
                        if (z22) {
                        }
                        z24 = true;
                        if (z21) {
                        }
                        if (this.f3622g0 != 8) {
                        }
                        if (z22) {
                        }
                        if (z25) {
                        }
                        i21 = i18;
                        z26 = z24;
                        if (z26) {
                        }
                        if (z25) {
                        }
                        if (z25) {
                        }
                        i22 = 5;
                        i29 = i22;
                        if (z25) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    fVar3 = k9;
                    cVar6.e(k7, fVar3, -cVar3.e(), 8);
                    if (z5) {
                        cVar6.f(k6, fVar, 0, 5);
                        cVar5 = cVar3;
                        i22 = 5;
                        fVar6 = k7;
                        z20 = z19;
                        z25 = z5;
                        i29 = i22;
                        if (z25) {
                        }
                    }
                }
                cVar5 = cVar3;
                fVar6 = k7;
                z20 = z19;
            } else {
                cVar5 = cVar3;
                fVar6 = k7;
                z20 = z19;
                fVar3 = k9;
                z25 = z5;
                i29 = (z5 && (cVar2.f3609f.d instanceof a)) ? 8 : 5;
                if (z25) {
                }
            }
            i22 = 5;
            z25 = z5;
            i29 = i22;
            if (z25) {
            }
        } else if (z8) {
            cVar6.e(k7, k6, 0, 3);
            if (i6 > 0) {
                cVar6.f(k7, k6, i6, i13);
            }
            if (i7 < Integer.MAX_VALUE) {
                cVar6.g(k7, k6, i7, i13);
            }
        } else {
            cVar6.e(k7, k6, i12, i13);
        }
        z19 = z7;
        i14 = i30;
        if (z14) {
        }
        boolean z322 = z19;
        if (i33 >= 2) {
        }
    }

    public final void e(int i, d dVar, int i4, int i5) {
        boolean z4;
        if (i == 7) {
            if (i4 != 7) {
                if (i4 == 2 || i4 == 4) {
                    e(2, dVar, i4, 0);
                    e(4, dVar, i4, 0);
                    i(7).a(dVar.i(i4), 0);
                    return;
                } else {
                    if (i4 == 3 || i4 == 5) {
                        e(3, dVar, i4, 0);
                        e(5, dVar, i4, 0);
                        i(7).a(dVar.i(i4), 0);
                        return;
                    }
                    return;
                }
            }
            c i6 = i(2);
            c i7 = i(4);
            c i8 = i(3);
            c i9 = i(5);
            boolean z5 = true;
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i8 == null || !i8.h()) && (i9 == null || !i9.h())) {
                e(3, dVar, 3, 0);
                e(5, dVar, 5, 0);
            } else {
                z5 = false;
            }
            if (z4 && z5) {
                i(7).a(dVar.i(7), 0);
                return;
            } else if (z4) {
                i(8).a(dVar.i(8), 0);
                return;
            } else {
                if (z5) {
                    i(9).a(dVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i4 == 2 || i4 == 4)) {
            c i10 = i(2);
            c i11 = dVar.i(i4);
            c i12 = i(4);
            i10.a(i11, 0);
            i12.a(i11, 0);
            i(8).a(i11, 0);
            return;
        }
        if (i == 9 && (i4 == 3 || i4 == 5)) {
            c i13 = dVar.i(i4);
            i(3).a(i13, 0);
            i(5).a(i13, 0);
            i(9).a(i13, 0);
            return;
        }
        if (i == 8 && i4 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i4), 0);
            return;
        }
        if (i == 9 && i4 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i4), 0);
            return;
        }
        c i14 = i(i);
        c i15 = dVar.i(i4);
        if (i14.i(i15)) {
            if (i == 6) {
                c i16 = i(3);
                c i17 = i(5);
                if (i16 != null) {
                    i16.j();
                }
                if (i17 != null) {
                    i17.j();
                }
            } else if (i == 3 || i == 5) {
                c i18 = i(6);
                if (i18 != null) {
                    i18.j();
                }
                c i19 = i(7);
                if (i19.f3609f != i15) {
                    i19.j();
                }
                c f5 = i(i).f();
                c i20 = i(9);
                if (i20.h()) {
                    f5.j();
                    i20.j();
                }
            } else if (i == 2 || i == 4) {
                c i21 = i(7);
                if (i21.f3609f != i15) {
                    i21.j();
                }
                c f6 = i(i).f();
                c i22 = i(8);
                if (i22.h()) {
                    f6.j();
                    i22.j();
                }
            }
            i14.a(i15, i5);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.d == this) {
            e(cVar.f3608e, cVar2.d, cVar2.f3608e, i);
        }
    }

    public final void g(t.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f3612a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            k kVar = new k(this);
            kVar.h.f3753e = 4;
            kVar.i.f3753e = 5;
            kVar.f3775f = 0;
            this.d = kVar;
        }
        if (this.f3617e == null) {
            m mVar = new m(this);
            w.f fVar = new w.f(mVar);
            mVar.f3764k = fVar;
            mVar.f3765l = null;
            mVar.h.f3753e = 6;
            mVar.i.f3753e = 7;
            fVar.f3753e = 8;
            mVar.f3775f = 1;
            this.f3617e = mVar;
        }
    }

    public c i(int i) {
        switch (t.e.a(i)) {
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
                throw new AssertionError(a4.b.j(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f3637p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f3622g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.L).f3609f) != null && cVar2.f3609f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3609f;
        if (cVar4 == null || cVar4.f3609f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.J).f3609f) != null && cVar2.f3609f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f3609f;
        if (cVar4 == null || cVar4.f3609f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f3624j + ":{\n");
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
        int i4 = this.f3614b0;
        int[] iArr = this.C;
        int i5 = iArr[0];
        int i6 = this.f3642u;
        int i7 = this.f3639r;
        float f5 = this.f3644w;
        int[] iArr2 = this.f3637p0;
        int i8 = iArr2[0];
        float[] fArr = this.f3627k0;
        float f6 = fArr[0];
        o(sb, "    width", i, i4, i5, i6, i7, f5, i8);
        int i9 = this.V;
        int i10 = this.f3616c0;
        int i11 = iArr[1];
        int i12 = this.f3645x;
        int i13 = this.f3640s;
        float f7 = this.f3647z;
        int i14 = iArr2[1];
        float f8 = fArr[1];
        o(sb, "    height", i9, i10, i11, i12, i13, f7, i14);
        float f9 = this.W;
        int i15 = this.X;
        if (f9 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f9);
            sb.append(",");
            sb.append(i15);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.f3618e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.f3625j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f3622g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f3655x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f3656y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f3609f != null ? 1 : 0) + (this.K.f3609f != null ? 1 : 0) < 2;
        }
        if ((this.J.f3609f != null ? 1 : 0) + (this.L.f3609f != null ? 1 : 0) + (this.M.f3609f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f3623h0 != null) {
            str = "id: " + this.f3623h0 + " ";
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

    public final boolean u(int i, int i4) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i == 0) {
            c cVar5 = this.I;
            c cVar6 = cVar5.f3609f;
            if (cVar6 == null || !cVar6.f3607c || (cVar4 = (cVar3 = this.K).f3609f) == null || !cVar4.f3607c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f3609f.d()) >= i4;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f3609f;
        if (cVar8 == null || !cVar8.f3607c || (cVar2 = (cVar = this.L).f3609f) == null || !cVar2.f3607c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f3609f.d()) >= i4;
    }

    public final void v(int i, int i4, int i5, int i6, d dVar) {
        i(i).b(dVar.i(i4), i5, i6, true);
    }

    public final boolean w(int i) {
        c cVar;
        c cVar2;
        int i4 = i * 2;
        c[] cVarArr = this.Q;
        c cVar3 = cVarArr[i4];
        c cVar4 = cVar3.f3609f;
        return (cVar4 == null || cVar4.f3609f == cVar3 || (cVar2 = (cVar = cVarArr[i4 + 1]).f3609f) == null || cVar2.f3609f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f3609f;
        if (cVar2 != null && cVar2.f3609f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3609f;
        return cVar4 != null && cVar4.f3609f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f3609f;
        if (cVar2 != null && cVar2.f3609f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f3609f;
        return cVar4 != null && cVar4.f3609f == cVar3;
    }

    public final boolean z() {
        return this.f3621g && this.f3622g0 != 8;
    }
}
