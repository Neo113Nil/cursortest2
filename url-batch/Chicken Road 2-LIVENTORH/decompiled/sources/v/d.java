package v;

import android.view.View;
import androidx.emoji2.text.t;
import androidx.fragment.app.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w.k;
import w.m;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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
    public int f3392a0;

    /* renamed from: b, reason: collision with root package name */
    public w.c f3393b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3394b0;

    /* renamed from: c, reason: collision with root package name */
    public w.c f3395c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3396c0;
    public float d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f3398e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f3400f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3402g0;

    /* renamed from: h0, reason: collision with root package name */
    public String f3404h0;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public String f3405j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3406j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3407k;

    /* renamed from: k0, reason: collision with root package name */
    public final float[] f3408k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3409l;

    /* renamed from: l0, reason: collision with root package name */
    public final d[] f3410l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3411m;

    /* renamed from: m0, reason: collision with root package name */
    public final d[] f3412m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3413n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3414n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3415o;

    /* renamed from: o0, reason: collision with root package name */
    public int f3416o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3417p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f3418p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3419q;

    /* renamed from: r, reason: collision with root package name */
    public int f3420r;

    /* renamed from: s, reason: collision with root package name */
    public int f3421s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3422t;

    /* renamed from: u, reason: collision with root package name */
    public int f3423u;

    /* renamed from: v, reason: collision with root package name */
    public int f3424v;

    /* renamed from: w, reason: collision with root package name */
    public float f3425w;

    /* renamed from: x, reason: collision with root package name */
    public int f3426x;

    /* renamed from: y, reason: collision with root package name */
    public int f3427y;

    /* renamed from: z, reason: collision with root package name */
    public float f3428z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3391a = false;
    public k d = null;

    /* renamed from: e, reason: collision with root package name */
    public m f3397e = null;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f3399f = {true, true};

    /* renamed from: g, reason: collision with root package name */
    public boolean f3401g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f3403h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.f3407k = false;
        this.f3409l = false;
        this.f3411m = false;
        this.f3413n = false;
        this.f3415o = -1;
        this.f3417p = -1;
        this.f3419q = 0;
        this.f3420r = 0;
        this.f3421s = 0;
        this.f3422t = new int[2];
        this.f3423u = 0;
        this.f3424v = 0;
        this.f3425w = 1.0f;
        this.f3426x = 0;
        this.f3427y = 0;
        this.f3428z = 1.0f;
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
        this.f3418p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.f3392a0 = 0;
        this.d0 = 0.5f;
        this.f3398e0 = 0.5f;
        this.f3402g0 = 0;
        this.f3404h0 = null;
        this.i0 = 0;
        this.f3406j0 = 0;
        this.f3408k0 = new float[]{-1.0f, -1.0f};
        this.f3410l0 = new d[]{null, null};
        this.f3412m0 = new d[]{null, null};
        this.f3414n0 = -1;
        this.f3416o0 = -1;
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

    public static void H(StringBuilder sb, String str, float f2, float f4) {
        if (f2 == f4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i4, int i5, int i6, int i7, float f2, int i8) {
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
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f3388f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f3388f);
        sb.append("'");
        if (cVar.f3390h != Integer.MIN_VALUE || cVar.f3389g != 0) {
            sb.append(",");
            sb.append(cVar.f3389g);
            if (cVar.f3390h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f3390h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (this.f3407k) {
            return true;
        }
        return this.I.f3386c && this.K.f3386c;
    }

    public boolean B() {
        if (this.f3409l) {
            return true;
        }
        return this.J.f3386c && this.L.f3386c;
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
        this.f3392a0 = 0;
        this.f3394b0 = 0;
        this.f3396c0 = 0;
        this.d0 = 0.5f;
        this.f3398e0 = 0.5f;
        int[] iArr = this.f3418p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3400f0 = null;
        this.f3402g0 = 0;
        this.i0 = 0;
        this.f3406j0 = 0;
        float[] fArr = this.f3408k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3415o = -1;
        this.f3417p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3420r = 0;
        this.f3421s = 0;
        this.f3425w = 1.0f;
        this.f3428z = 1.0f;
        this.f3424v = Integer.MAX_VALUE;
        this.f3427y = Integer.MAX_VALUE;
        this.f3423u = 0;
        this.f3426x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f3399f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3401g = true;
        int[] iArr3 = this.f3422t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f3403h = -1;
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
        this.f3407k = false;
        this.f3409l = false;
        this.f3411m = false;
        this.f3413n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.f3386c = false;
            cVar.f3385b = 0;
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
        this.f3392a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i4) {
        if (this.f3407k) {
            return;
        }
        this.I.l(i);
        this.K.l(i4);
        this.Y = i;
        this.U = i4 - i;
        this.f3407k = true;
    }

    public final void K(int i, int i4) {
        if (this.f3409l) {
            return;
        }
        this.J.l(i);
        this.L.l(i4);
        this.Z = i;
        this.V = i4 - i;
        if (this.E) {
            this.M.l(i + this.f3392a0);
        }
        this.f3409l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i4 = this.f3396c0;
        if (i < i4) {
            this.V = i4;
        }
    }

    public final void M(int i) {
        this.f3418p0[0] = i;
    }

    public final void N(int i) {
        this.f3418p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i4 = this.f3394b0;
        if (i < i4) {
            this.U = i4;
        }
    }

    public void P(boolean z3, boolean z4) {
        int i;
        int i4;
        k kVar = this.d;
        boolean z5 = z3 & kVar.f3554g;
        m mVar = this.f3397e;
        boolean z6 = z4 & mVar.f3554g;
        int i5 = kVar.f3555h.f3532g;
        int i6 = mVar.f3555h.f3532g;
        int i7 = kVar.i.f3532g;
        int i8 = mVar.i.f3532g;
        int i9 = i8 - i6;
        if (i7 - i5 < 0 || i9 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE) {
            i7 = 0;
            i8 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i10 = i7 - i5;
        int i11 = i8 - i6;
        if (z5) {
            this.Y = i5;
        }
        if (z6) {
            this.Z = i6;
        }
        if (this.f3402g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3418p0;
        if (z5) {
            if (iArr[0] == 1 && i10 < (i4 = this.U)) {
                i10 = i4;
            }
            this.U = i10;
            int i12 = this.f3394b0;
            if (i10 < i12) {
                this.U = i12;
            }
        }
        if (z6) {
            if (iArr[1] == 1 && i11 < (i = this.V)) {
                i11 = i;
            }
            this.V = i11;
            int i13 = this.f3396c0;
            if (i11 < i13) {
                this.V = i13;
            }
        }
    }

    public void Q(t.c cVar, boolean z3) {
        int i;
        int i4;
        m mVar;
        k kVar;
        cVar.getClass();
        int n4 = t.c.n(this.I);
        int n5 = t.c.n(this.J);
        int n6 = t.c.n(this.K);
        int n7 = t.c.n(this.L);
        if (z3 && (kVar = this.d) != null) {
            w.f fVar = kVar.f3555h;
            if (fVar.f3534j) {
                w.f fVar2 = kVar.i;
                if (fVar2.f3534j) {
                    n4 = fVar.f3532g;
                    n6 = fVar2.f3532g;
                }
            }
        }
        if (z3 && (mVar = this.f3397e) != null) {
            w.f fVar3 = mVar.f3555h;
            if (fVar3.f3534j) {
                w.f fVar4 = mVar.i;
                if (fVar4.f3534j) {
                    n5 = fVar3.f3532g;
                    n7 = fVar4.f3532g;
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
        if (this.f3402g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.f3418p0;
        int i8 = iArr[0];
        if (i8 == 1 && i6 < (i4 = this.U)) {
            i6 = i4;
        }
        if (iArr[1] == 1 && i7 < (i = this.V)) {
            i7 = i;
        }
        this.U = i6;
        this.V = i7;
        int i9 = this.f3396c0;
        if (i7 < i9) {
            this.V = i9;
        }
        int i10 = this.f3394b0;
        if (i6 < i10) {
            this.U = i10;
        }
        int i11 = this.f3424v;
        if (i11 > 0 && i8 == 3) {
            this.U = Math.min(this.U, i11);
        }
        int i12 = this.f3427y;
        if (i12 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i12);
        }
        int i13 = this.U;
        if (i6 != i13) {
            this.f3403h = i13;
        }
        int i14 = this.V;
        if (i7 != i14) {
            this.i = i14;
        }
    }

    public final void a(e eVar, t.c cVar, HashSet hashSet, int i, boolean z3) {
        if (z3) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.f3384a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.f3384a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.f3384a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.f3384a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.f3384a;
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
    
        if (r58.f3402g0 == r14) goto L374;
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
    public void b(t.c cVar, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r17;
        int i;
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
        int i4;
        int i5;
        int[] iArr;
        float f2;
        c cVar5;
        t.f fVar;
        c cVar6;
        int i6;
        int i7;
        int i8;
        boolean z12;
        int i9;
        boolean z13;
        boolean z14;
        c cVar7;
        boolean z15;
        char c4;
        boolean z16;
        int i10;
        int[] iArr2;
        c cVar8;
        t.f fVar2;
        t.f fVar3;
        c cVar9;
        int[] iArr3;
        t.f fVar4;
        boolean z17;
        boolean z18;
        boolean z19;
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
        boolean z20;
        int i14;
        t.f fVar10;
        t.f fVar11;
        ?? r27;
        m mVar;
        w.f fVar12;
        d dVar3;
        boolean z21;
        k kVar;
        w.f fVar13;
        int i15;
        int i16;
        boolean x3;
        int i17;
        boolean y3;
        k kVar2;
        m mVar2;
        boolean z22;
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
            int[] iArr4 = dVar4.f3418p0;
            r17 = 0;
            z4 = false;
            r17 = 0;
            z6 = iArr4[0] == 2;
            boolean z23 = iArr4[1] == 2;
            int i18 = this.f3419q;
            if (i18 != 1) {
                if (i18 == 2) {
                    z6 = false;
                }
                z5 = z23;
            } else {
                z5 = false;
            }
            i = this.f3402g0;
            boolean[] zArr4 = this.S;
            boolean z24 = z5;
            if (i != 8) {
                ArrayList arrayList = this.R;
                int size = arrayList.size();
                z7 = z6;
                int i19 = r17;
                while (true) {
                    if (i19 < size) {
                        int i20 = size;
                        HashSet hashSet = ((c) arrayList.get(i19)).f3384a;
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
                z7 = z6;
            }
            z8 = this.f3407k;
            if (!z8 || this.f3409l) {
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
                if (this.f3409l) {
                    cVar11.d(k6, this.Z);
                    cVar11.d(k7, this.Z + this.V);
                    HashSet hashSet2 = cVar16.f3384a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.d(k8, this.Z + this.f3392a0);
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
                if (this.f3407k && this.f3409l) {
                    boolean z25 = r17;
                    this.f3407k = z25;
                    this.f3409l = z25;
                    return;
                }
            }
            zArr = this.f3399f;
            if (z3 || (kVar2 = this.d) == null || (mVar2 = this.f3397e) == null) {
                cVar2 = cVar16;
                zArr2 = zArr;
            } else {
                cVar2 = cVar16;
                w.f fVar14 = kVar2.f3555h;
                zArr2 = zArr;
                if (fVar14.f3534j && kVar2.i.f3534j && mVar2.f3555h.f3534j && mVar2.i.f3534j) {
                    cVar11.d(k4, fVar14.f3532g);
                    cVar11.d(k5, this.d.i.f3532g);
                    cVar11.d(k6, this.f3397e.f3555h.f3532g);
                    cVar11.d(k7, this.f3397e.i.f3532g);
                    cVar11.d(k8, this.f3397e.f3542k.f3532g);
                    if (this.T != null) {
                        if (z7 && zArr2[0] && !x()) {
                            cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                        }
                        if (z24 && zArr2[1] && !y()) {
                            z22 = false;
                            cVar11.f(cVar11.k(this.T.L), k7, 0, 8);
                            this.f3407k = z22;
                            this.f3409l = z22;
                            return;
                        }
                    }
                    z22 = false;
                    this.f3407k = z22;
                    this.f3409l = z22;
                    return;
                }
            }
            if (this.T == null) {
                if (w(0)) {
                    ((e) this.T).R(this, 0);
                    x3 = true;
                    i17 = 1;
                } else {
                    x3 = x();
                    i17 = 1;
                }
                if (w(i17)) {
                    ((e) this.T).R(this, i17);
                    y3 = true;
                } else {
                    y3 = y();
                }
                if (!x3 && z7 && this.f3402g0 != 8 && cVar12.f3388f == null && cVar13.f3388f == null) {
                    cVar3 = cVar12;
                    cVar11.f(cVar11.k(this.T.K), k5, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!y3 && z24 && this.f3402g0 != 8 && cVar14.f3388f == null && cVar15.f3388f == null && cVar2 == null) {
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
            i4 = this.U;
            i5 = this.f3394b0;
            if (i4 >= i5) {
                i5 = i4;
            }
            int i21 = this.V;
            c cVar17 = cVar4;
            int i22 = this.f3396c0;
            int i23 = i21 >= i22 ? i22 : i21;
            iArr = this.f3418p0;
            int i24 = iArr[0];
            boolean z26 = z9;
            boolean z27 = i24 == 3;
            int i25 = iArr[1];
            boolean z28 = i25 == 3;
            int i26 = this.X;
            this.A = i26;
            f2 = this.W;
            this.B = f2;
            int i27 = this.f3420r;
            int i28 = this.f3421s;
            if (f2 <= 0.0f) {
                cVar5 = cVar15;
                if (this.f3402g0 != 8) {
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
                            if (z27 && !z28) {
                                this.A = 0;
                            } else if (!z27 && z28) {
                                this.A = 1;
                                if (i26 == -1) {
                                    this.B = 1.0f / f2;
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
                            int i30 = this.f3423u;
                            if (i30 > 0 && this.f3426x == 0) {
                                this.A = 0;
                            } else if (i30 == 0 && this.f3426x > 0) {
                                this.B = 1.0f / this.B;
                                this.A = 1;
                            }
                        }
                    } else if (i24 == 3 && i29 == 3) {
                        this.A = 0;
                        i5 = (int) (f2 * i21);
                        if (i25 != 3) {
                            cVar6 = cVar2;
                            i6 = i23;
                            i7 = 4;
                            z12 = false;
                            i8 = i16;
                            int[] iArr5 = this.f3422t;
                            iArr5[0] = i7;
                            iArr5[1] = i8;
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
                            c4 = '\b';
                            z16 = zArr4[0];
                            boolean z29 = zArr4[1];
                            i10 = this.f3415o;
                            iArr2 = this.C;
                            if (i10 != 2) {
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
                            i11 = i7;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z20 = true;
                            i14 = 1;
                            if (this.f3417p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3407k = false;
                            this.f3409l = false;
                        }
                    } else if (i25 == 3 && i16 == 3) {
                        this.A = 1;
                        if (i26 == -1) {
                            this.B = 1.0f / f2;
                        }
                        i6 = (int) (this.B * i4);
                        if (i24 == 3) {
                            i7 = i29;
                            cVar6 = cVar2;
                            z12 = true;
                            i8 = i16;
                            int[] iArr52 = this.f3422t;
                            iArr52[0] = i7;
                            iArr52[1] = i8;
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
                            c4 = '\b';
                            z16 = zArr4[0];
                            boolean z292 = zArr4[1];
                            i10 = this.f3415o;
                            iArr2 = this.C;
                            if (i10 != 2) {
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
                            i11 = i7;
                            zArr3 = zArr2;
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z20 = true;
                            i14 = 1;
                            if (this.f3417p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3407k = false;
                            this.f3409l = false;
                        }
                        i7 = i29;
                        cVar6 = cVar2;
                        i8 = 4;
                        z12 = false;
                        int[] iArr522 = this.f3422t;
                        iArr522[0] = i7;
                        iArr522[1] = i8;
                        if (z12) {
                            i9 = -1;
                        } else {
                            int i31 = this.A;
                            i9 = -1;
                            if (i31 == 0 || i31 == -1) {
                                z13 = true;
                                boolean z30 = !z12 && ((i15 = this.A) == 1 || i15 == i9);
                                z14 = iArr[0] != 2 && (this instanceof e);
                                if (z14) {
                                    i5 = 0;
                                }
                                cVar7 = this.P;
                                z15 = !cVar7.h();
                                c4 = '\b';
                                z16 = zArr4[0];
                                boolean z2922 = zArr4[1];
                                i10 = this.f3415o;
                                iArr2 = this.C;
                                if (i10 != 2 && !this.f3407k) {
                                    if (z3 && (kVar = this.d) != null) {
                                        fVar13 = kVar.f3555h;
                                        if (fVar13.f3534j || !kVar.i.f3534j) {
                                            c4 = '\b';
                                        } else if (z3) {
                                            cVar11.d(k4, fVar13.f3532g);
                                            cVar11.d(k5, this.d.i.f3532g);
                                            if (this.T != null && z7 && zArr2[0] && !x()) {
                                                cVar11.f(cVar11.k(this.T.K), k5, 0, 8);
                                            }
                                        }
                                    }
                                    d dVar5 = this.T;
                                    t.f k9 = dVar5 == null ? cVar11.k(dVar5.K) : null;
                                    d dVar6 = this.T;
                                    t.f k10 = dVar6 == null ? cVar11.k(dVar6.I) : null;
                                    z18 = z7;
                                    i11 = i7;
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
                                    d(cVar11, true, z18, z19, zArr2[0], k10, k9, iArr[0], z14, this.I, this.K, this.Y, i5, this.f3394b0, iArr2[0], this.d0, z31, iArr[1] == 3, z17, z11, z16, i11, i8, this.f3423u, this.f3424v, this.f3425w, z15);
                                    if (z3 && (mVar = this.f3397e) != null) {
                                        fVar12 = mVar.f3555h;
                                        if (fVar12.f3534j && mVar.i.f3534j) {
                                            int i32 = fVar12.f3532g;
                                            fVar7 = fVar5;
                                            cVar11.d(fVar7, i32);
                                            fVar8 = fVar6;
                                            cVar11.d(fVar8, this.f3397e.i.f3532g);
                                            fVar9 = fVar4;
                                            cVar11.d(fVar9, this.f3397e.f3542k.f3532g);
                                            dVar3 = this.T;
                                            if (dVar3 == null && !z11 && z19) {
                                                z21 = true;
                                                z21 = true;
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
                                                z21 = true;
                                            }
                                            i14 = i12;
                                            z20 = z21;
                                            if (this.f3417p == 2) {
                                                i14 = i12;
                                            }
                                            if (i14 != 0 || this.f3409l) {
                                                fVar10 = fVar7;
                                                fVar11 = fVar8;
                                            } else {
                                                int i33 = (iArr[z20 ? 1 : 0] == 2 && (this instanceof e)) ? z20 ? 1 : 0 : i12;
                                                int i34 = i33 != 0 ? i12 : i6;
                                                d dVar7 = this.T;
                                                t.f k11 = dVar7 != null ? cVar11.k(dVar7.L) : null;
                                                d dVar8 = this.T;
                                                t.f k12 = dVar8 != null ? cVar11.k(dVar8.J) : null;
                                                int i35 = this.f3392a0;
                                                if (i35 <= 0) {
                                                    r27 = z15;
                                                }
                                                c cVar18 = cVar8;
                                                if (cVar18.f3388f != null) {
                                                    cVar11.e(fVar9, fVar7, i35, i13);
                                                    cVar11.e(fVar9, cVar11.k(cVar18.f3388f), cVar18.e(), i13);
                                                    if (z19) {
                                                        cVar11.f(k11, cVar11.k(cVar10), i12, 5);
                                                    }
                                                    r27 = i12;
                                                } else if (this.f3402g0 == i13) {
                                                    cVar11.e(fVar9, fVar7, cVar18.e(), i13);
                                                    r27 = z15;
                                                } else {
                                                    cVar11.e(fVar9, fVar7, i35, i13);
                                                    r27 = z15;
                                                }
                                                boolean z32 = zArr3[z20 ? 1 : 0];
                                                int i36 = i12;
                                                int i37 = iArr[z20 ? 1 : 0];
                                                int i38 = this.Z;
                                                int i39 = this.f3396c0;
                                                int i40 = iArr3[z20 ? 1 : 0];
                                                float f4 = this.f3398e0;
                                                int i41 = iArr[i36];
                                                boolean z33 = z20 ? 1 : 0;
                                                ?? r18 = z20;
                                                if (i41 != 3) {
                                                    r18 = i36;
                                                }
                                                fVar11 = fVar8;
                                                fVar10 = fVar7;
                                                cVar11 = cVar;
                                                d(cVar11, false, z19, z18, z32, k12, k11, i37, i33, this.J, this.L, i38, i34, i39, i40, f4, z30, r18, z11, z17, z2922, i8, i11, this.f3426x, this.f3427y, this.f3428z, r27);
                                            }
                                            if (z12) {
                                                if (this.A == 1) {
                                                    float f5 = this.B;
                                                    t.b l4 = cVar11.l();
                                                    l4.d.g(fVar11, -1.0f);
                                                    l4.d.g(fVar10, 1.0f);
                                                    l4.d.g(fVar3, f5);
                                                    l4.d.g(fVar2, -f5);
                                                    cVar11.c(l4);
                                                } else {
                                                    float f6 = this.B;
                                                    t.b l5 = cVar11.l();
                                                    l5.d.g(fVar3, -1.0f);
                                                    l5.d.g(fVar2, 1.0f);
                                                    l5.d.g(fVar11, f6);
                                                    l5.d.g(fVar10, -f6);
                                                    cVar11.c(l5);
                                                }
                                            }
                                            if (cVar9.h()) {
                                                c cVar19 = cVar9;
                                                d dVar9 = cVar19.f3388f.d;
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
                                                double d3 = e4;
                                                l6.d.g(k18, 0.5f);
                                                l6.d.g(k20, 0.5f);
                                                l6.d.g(k14, -0.5f);
                                                l6.d.g(k16, -0.5f);
                                                l6.f3241b = -((float) (sin * d3));
                                                cVar11.c(l6);
                                                t.b l7 = cVar11.l();
                                                float cos = (float) (Math.cos(d) * d3);
                                                l7.d.g(k17, 0.5f);
                                                l7.d.g(k19, 0.5f);
                                                l7.d.g(k13, -0.5f);
                                                l7.d.g(k15, -0.5f);
                                                l7.f3241b = -cos;
                                                cVar11.c(l7);
                                            }
                                            this.f3407k = false;
                                            this.f3409l = false;
                                        }
                                    }
                                    fVar7 = fVar5;
                                    fVar8 = fVar6;
                                    fVar9 = fVar4;
                                    i12 = 0;
                                    i13 = 8;
                                    z20 = true;
                                    i14 = 1;
                                    if (this.f3417p == 2) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    fVar10 = fVar7;
                                    fVar11 = fVar8;
                                    if (z12) {
                                    }
                                    if (cVar9.h()) {
                                    }
                                    this.f3407k = false;
                                    this.f3409l = false;
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
                                i11 = i7;
                                zArr3 = zArr2;
                                if (z3) {
                                    fVar12 = mVar.f3555h;
                                    if (fVar12.f3534j) {
                                        int i322 = fVar12.f3532g;
                                        fVar7 = fVar5;
                                        cVar11.d(fVar7, i322);
                                        fVar8 = fVar6;
                                        cVar11.d(fVar8, this.f3397e.i.f3532g);
                                        fVar9 = fVar4;
                                        cVar11.d(fVar9, this.f3397e.f3542k.f3532g);
                                        dVar3 = this.T;
                                        if (dVar3 == null) {
                                        }
                                        i12 = 0;
                                        i13 = 8;
                                        z21 = true;
                                        i14 = i12;
                                        z20 = z21;
                                        if (this.f3417p == 2) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        fVar10 = fVar7;
                                        fVar11 = fVar8;
                                        if (z12) {
                                        }
                                        if (cVar9.h()) {
                                        }
                                        this.f3407k = false;
                                        this.f3409l = false;
                                    }
                                }
                                fVar7 = fVar5;
                                fVar8 = fVar6;
                                fVar9 = fVar4;
                                i12 = 0;
                                i13 = 8;
                                z20 = true;
                                i14 = 1;
                                if (this.f3417p == 2) {
                                }
                                if (i14 != 0) {
                                }
                                fVar10 = fVar7;
                                fVar11 = fVar8;
                                if (z12) {
                                }
                                if (cVar9.h()) {
                                }
                                this.f3407k = false;
                                this.f3409l = false;
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
                        c4 = '\b';
                        z16 = zArr4[0];
                        boolean z29222 = zArr4[1];
                        i10 = this.f3415o;
                        iArr2 = this.C;
                        if (i10 != 2) {
                            if (z3) {
                                fVar13 = kVar.f3555h;
                                if (fVar13.f3534j) {
                                }
                                c4 = '\b';
                            }
                            d dVar52 = this.T;
                            if (dVar52 == null) {
                            }
                            d dVar62 = this.T;
                            if (dVar62 == null) {
                            }
                            z18 = z7;
                            i11 = i7;
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
                            d(cVar11, true, z18, z19, zArr2[0], k10, k9, iArr[0], z14, this.I, this.K, this.Y, i5, this.f3394b0, iArr2[0], this.d0, z312, iArr[1] == 3, z17, z11, z16, i11, i8, this.f3423u, this.f3424v, this.f3425w, z15);
                            if (z3) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i12 = 0;
                            i13 = 8;
                            z20 = true;
                            i14 = 1;
                            if (this.f3417p == 2) {
                            }
                            if (i14 != 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z12) {
                            }
                            if (cVar9.h()) {
                            }
                            this.f3407k = false;
                            this.f3409l = false;
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
                        i11 = i7;
                        zArr3 = zArr2;
                        if (z3) {
                        }
                        fVar7 = fVar5;
                        fVar8 = fVar6;
                        fVar9 = fVar4;
                        i12 = 0;
                        i13 = 8;
                        z20 = true;
                        i14 = 1;
                        if (this.f3417p == 2) {
                        }
                        if (i14 != 0) {
                        }
                        fVar10 = fVar7;
                        fVar11 = fVar8;
                        if (z12) {
                        }
                        if (cVar9.h()) {
                        }
                        this.f3407k = false;
                        this.f3409l = false;
                    }
                    i7 = i29;
                    cVar6 = cVar2;
                    i6 = i23;
                    z12 = true;
                    i8 = i16;
                    int[] iArr5222 = this.f3422t;
                    iArr5222[0] = i7;
                    iArr5222[1] = i8;
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
                    c4 = '\b';
                    z16 = zArr4[0];
                    boolean z292222 = zArr4[1];
                    i10 = this.f3415o;
                    iArr2 = this.C;
                    if (i10 != 2) {
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
                    i11 = i7;
                    zArr3 = zArr2;
                    if (z3) {
                    }
                    fVar7 = fVar5;
                    fVar8 = fVar6;
                    fVar9 = fVar4;
                    i12 = 0;
                    i13 = 8;
                    z20 = true;
                    i14 = 1;
                    if (this.f3417p == 2) {
                    }
                    if (i14 != 0) {
                    }
                    fVar10 = fVar7;
                    fVar11 = fVar8;
                    if (z12) {
                    }
                    if (cVar9.h()) {
                    }
                    this.f3407k = false;
                    this.f3409l = false;
                }
            } else {
                cVar5 = cVar15;
            }
            fVar = k7;
            cVar6 = cVar2;
            i6 = i23;
            i7 = i27;
            i8 = i28;
            z12 = false;
            int[] iArr52222 = this.f3422t;
            iArr52222[0] = i7;
            iArr52222[1] = i8;
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
            c4 = '\b';
            z16 = zArr4[0];
            boolean z2922222 = zArr4[1];
            i10 = this.f3415o;
            iArr2 = this.C;
            if (i10 != 2) {
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
            i11 = i7;
            zArr3 = zArr2;
            if (z3) {
            }
            fVar7 = fVar5;
            fVar8 = fVar6;
            fVar9 = fVar4;
            i12 = 0;
            i13 = 8;
            z20 = true;
            i14 = 1;
            if (this.f3417p == 2) {
            }
            if (i14 != 0) {
            }
            fVar10 = fVar7;
            fVar11 = fVar8;
            if (z12) {
            }
            if (cVar9.h()) {
            }
            this.f3407k = false;
            this.f3409l = false;
        }
        z4 = false;
        z5 = z4 ? 1 : 0;
        z6 = z5;
        r17 = z4;
        i = this.f3402g0;
        boolean[] zArr42 = this.S;
        boolean z242 = z5;
        if (i != 8) {
        }
        z8 = this.f3407k;
        if (!z8) {
        }
        if (z8) {
        }
        if (this.f3409l) {
        }
        if (this.f3407k) {
            boolean z252 = r17;
            this.f3407k = z252;
            this.f3409l = z252;
            return;
        }
        zArr = this.f3399f;
        if (z3) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.T == null) {
        }
        i4 = this.U;
        i5 = this.f3394b0;
        if (i4 >= i5) {
        }
        int i212 = this.V;
        c cVar172 = cVar4;
        int i222 = this.f3396c0;
        if (i212 >= i222) {
        }
        iArr = this.f3418p0;
        int i242 = iArr[0];
        boolean z262 = z9;
        if (i242 == 3) {
        }
        int i252 = iArr[1];
        if (i252 == 3) {
        }
        int i262 = this.X;
        this.A = i262;
        f2 = this.W;
        this.B = f2;
        int i272 = this.f3420r;
        int i282 = this.f3421s;
        if (f2 <= 0.0f) {
        }
        fVar = k7;
        cVar6 = cVar2;
        i6 = i23;
        i7 = i272;
        i8 = i282;
        z12 = false;
        int[] iArr522222 = this.f3422t;
        iArr522222[0] = i7;
        iArr522222[1] = i8;
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
        c4 = '\b';
        z16 = zArr42[0];
        boolean z29222222 = zArr42[1];
        i10 = this.f3415o;
        iArr2 = this.C;
        if (i10 != 2) {
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
        i11 = i7;
        zArr3 = zArr2;
        if (z3) {
        }
        fVar7 = fVar5;
        fVar8 = fVar6;
        fVar9 = fVar4;
        i12 = 0;
        i13 = 8;
        z20 = true;
        i14 = 1;
        if (this.f3417p == 2) {
        }
        if (i14 != 0) {
        }
        fVar10 = fVar7;
        fVar11 = fVar8;
        if (z12) {
        }
        if (cVar9.h()) {
        }
        this.f3407k = false;
        this.f3409l = false;
    }

    public boolean c() {
        return this.f3402g0 != 8;
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
    public final void d(t.c cVar, boolean z3, boolean z4, boolean z5, boolean z6, t.f fVar, t.f fVar2, int i, boolean z7, c cVar2, c cVar3, int i4, int i5, int i6, int i7, float f2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i8, int i9, int i10, int i11, float f4, boolean z13) {
        boolean z14;
        boolean z15;
        int i12;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        boolean z18;
        t.f k4;
        t.f k5;
        c cVar4;
        t.f fVar3;
        boolean z19;
        int i15;
        t.f fVar4;
        t.f fVar5;
        t.f fVar6;
        t.f fVar7;
        int i16;
        int i17;
        int i18;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        d dVar;
        int i19;
        int i20;
        c cVar5;
        boolean z24;
        int i21;
        boolean z25;
        int i22;
        int i23;
        HashSet hashSet;
        boolean z26;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z27;
        boolean z28;
        int i29;
        t.c cVar6 = cVar;
        int i30 = i10;
        int i31 = i11;
        t.f k6 = cVar6.k(cVar2);
        t.f k7 = cVar6.k(cVar3);
        t.f k8 = cVar6.k(cVar2.f3388f);
        t.f k9 = cVar6.k(cVar3.f3388f);
        boolean h4 = cVar2.h();
        boolean h5 = cVar3.h();
        boolean h6 = this.P.h();
        int i32 = h5 ? (h4 ? 1 : 0) + 1 : h4 ? 1 : 0;
        if (h6) {
            i32++;
        }
        int i33 = i32;
        int i34 = z8 ? 3 : i8;
        int a2 = t.e.a(i);
        boolean z29 = (a2 == 0 || a2 == 1 || a2 != 2 || i34 == 4) ? false : true;
        int i35 = this.f3403h;
        if (i35 == -1 || !z3) {
            i35 = i5;
            z14 = z29;
        } else {
            this.f3403h = -1;
            z14 = false;
        }
        int i36 = this.i;
        if (i36 == -1 || z3) {
            z15 = z14;
        } else {
            this.i = -1;
            i35 = i36;
            z15 = false;
        }
        boolean z30 = z15;
        if (this.f3402g0 == 8) {
            z16 = false;
            i12 = 0;
        } else {
            i12 = i35;
            z16 = z30;
        }
        if (z13) {
            if (!h4 && !h5 && !h6) {
                cVar6.d(k6, i4);
            } else if (h4 && !h5) {
                z17 = z16;
                i13 = 8;
                cVar6.e(k6, k8, cVar2.e(), 8);
            }
            z17 = z16;
            i13 = 8;
        } else {
            z17 = z16;
            i13 = 8;
        }
        if (z17) {
            if (i33 == 2 || z8 || !(i34 == 1 || i34 == 0)) {
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
                    if (!z4 || i34 != 1) {
                        cVar6.g(k7, k6, i31, 8);
                    }
                    i12 = Math.min(i12, i31);
                }
                if (i34 == 1) {
                    if (z4) {
                        cVar6.e(k7, k6, i12, 8);
                    } else if (z10) {
                        cVar6.e(k7, k6, i12, 5);
                        cVar6.g(k7, k6, i12, 8);
                    } else {
                        cVar6.e(k7, k6, i12, 5);
                        cVar6.g(k7, k6, i12, 8);
                    }
                } else if (i34 == 2) {
                    int i37 = cVar2.f3387e;
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
                    l4.d.g(k5, f4);
                    l4.d.g(k4, -f4);
                    cVar6.c(l4);
                    if (z4) {
                        z17 = false;
                    }
                    z18 = z6;
                    i14 = i38;
                } else {
                    i14 = i30;
                    z18 = true;
                }
            } else {
                int max = Math.max(i30, i12);
                if (i31 > 0) {
                    max = Math.min(i31, max);
                }
                cVar6.e(k7, k6, max, 8);
                z18 = z6;
                i14 = i30;
                z17 = false;
            }
            if (z13 || z10) {
                boolean z31 = z18;
                if (i33 >= 2 && z4 && z31) {
                    cVar6.f(k6, fVar, 0, 8);
                    c cVar7 = this.M;
                    boolean z32 = z3 || cVar7.f3388f == null;
                    if (!z3 && (cVar4 = cVar7.f3388f) != null) {
                        d dVar2 = cVar4.d;
                        if (dVar2.W != 0.0f) {
                            int[] iArr = dVar2.f3418p0;
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
            if (!h4 && !h5 && !h6) {
                cVar5 = cVar3;
                fVar6 = k7;
                z19 = z18;
                fVar3 = k9;
            } else if (!h4 || h5) {
                if (h4 || !h5) {
                    fVar3 = k9;
                    if (h4 && h5) {
                        d dVar3 = cVar2.f3388f.d;
                        d dVar4 = cVar3.f3388f.d;
                        z19 = z18;
                        d dVar5 = this.T;
                        int i39 = 6;
                        if (z17) {
                            if (i34 == 0) {
                                if (i31 != 0 || i14 != 0) {
                                    i27 = 5;
                                    i28 = 5;
                                    z27 = true;
                                    z28 = false;
                                    z21 = true;
                                } else if (k8.f3266k && fVar3.f3266k) {
                                    cVar6.e(k6, k8, cVar2.e(), 8);
                                    cVar6.e(k7, fVar3, -cVar3.e(), 8);
                                    return;
                                } else {
                                    i27 = 8;
                                    i28 = 8;
                                    z27 = false;
                                    z28 = true;
                                    z21 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i15 = i34;
                                    fVar5 = k6;
                                    fVar6 = k7;
                                    z22 = z28;
                                    fVar4 = fVar2;
                                    i17 = i27;
                                    fVar7 = k8;
                                    i16 = 6;
                                    z20 = z27;
                                    i18 = 4;
                                    if (z21 || fVar7 != fVar3 || dVar3 == dVar5) {
                                        z23 = true;
                                    } else {
                                        z21 = false;
                                        z23 = false;
                                    }
                                    if (z20) {
                                        dVar = dVar4;
                                        i19 = i14;
                                        i20 = i15;
                                        cVar5 = cVar3;
                                        z24 = z4;
                                    } else {
                                        if (z17 || z9 || z11 || fVar7 != fVar || fVar3 != fVar4) {
                                            z24 = z4;
                                            z26 = z23;
                                            i24 = i17;
                                        } else {
                                            i16 = 8;
                                            z24 = false;
                                            i24 = 8;
                                            z26 = false;
                                        }
                                        t.f fVar8 = fVar7;
                                        i19 = i14;
                                        i20 = i15;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.b(fVar5, fVar8, cVar2.e(), f2, fVar3, fVar6, cVar3.e(), i16);
                                        fVar7 = fVar8;
                                        i17 = i24;
                                        z23 = z26;
                                    }
                                    if (this.f3402g0 != 8 && ((hashSet = cVar5.f3384a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z21) {
                                        if (z24 && fVar7 != fVar3 && !z17 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i17 = 6;
                                        }
                                        cVar6.f(fVar5, fVar7, cVar2.e(), i17);
                                        cVar6.g(fVar6, fVar3, -cVar5.e(), i17);
                                    }
                                    if (z24 || !z12 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i21 = i18;
                                        z25 = z23;
                                    } else {
                                        i21 = 6;
                                        i17 = 6;
                                        z25 = true;
                                    }
                                    if (z25) {
                                        if (z22 && (!z11 || z5)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i39 = i21;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i39 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i39 = 5;
                                            }
                                            i21 = Math.max(z11 ? 5 : i39, i21);
                                        }
                                        if (z24) {
                                            i21 = Math.min(i17, i21);
                                            if (z8 && !z11 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i23 = 4;
                                                cVar6.e(fVar5, fVar7, cVar2.e(), i23);
                                                cVar6.e(fVar6, fVar3, -cVar5.e(), i23);
                                            }
                                        }
                                        i23 = i21;
                                        cVar6.e(fVar5, fVar7, cVar2.e(), i23);
                                        cVar6.e(fVar6, fVar3, -cVar5.e(), i23);
                                    }
                                    if (z24) {
                                        int e4 = fVar == fVar7 ? cVar2.e() : 0;
                                        if (fVar7 != fVar) {
                                            cVar6.f(fVar5, fVar, e4, 5);
                                        }
                                    }
                                    if (z24 && z17 && i6 == 0 && i19 == 0) {
                                        if (z17 || i20 != 3) {
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
                                    z22 = z28;
                                    i17 = i27;
                                    fVar7 = k8;
                                    i16 = 6;
                                    z20 = z27;
                                    i18 = i28;
                                    i15 = i34;
                                    fVar4 = fVar2;
                                    if (z21) {
                                    }
                                    z23 = true;
                                    if (z20) {
                                    }
                                    if (this.f3402g0 != 8) {
                                    }
                                    if (z21) {
                                    }
                                    if (z24) {
                                    }
                                    i21 = i18;
                                    z25 = z23;
                                    if (z25) {
                                    }
                                    if (z24) {
                                    }
                                    if (z24) {
                                        if (z17) {
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
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        fVar4 = fVar2;
                                        if (z21) {
                                        }
                                        z23 = true;
                                        if (z20) {
                                        }
                                        if (this.f3402g0 != 8) {
                                        }
                                        if (z21) {
                                        }
                                        if (z24) {
                                        }
                                        i21 = i18;
                                        z25 = z23;
                                        if (z25) {
                                        }
                                        if (z24) {
                                        }
                                        if (z24) {
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
                                        if (z8) {
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
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
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
                                            } else if (z11) {
                                                i25 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                fVar4 = fVar2;
                                                fVar5 = k6;
                                                fVar6 = k7;
                                                fVar7 = k8;
                                                i16 = 6;
                                                i18 = 4;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
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
                                            z20 = true;
                                            z21 = true;
                                            z22 = true;
                                            if (z21) {
                                            }
                                            z23 = true;
                                            if (z20) {
                                            }
                                            if (this.f3402g0 != 8) {
                                            }
                                            if (z21) {
                                            }
                                            if (z24) {
                                            }
                                            i21 = i18;
                                            z25 = z23;
                                            if (z25) {
                                            }
                                            if (z24) {
                                            }
                                            if (z24) {
                                            }
                                            i22 = 5;
                                        }
                                        i17 = i25;
                                        cVar6 = cVar;
                                        if (z21) {
                                        }
                                        z23 = true;
                                        if (z20) {
                                        }
                                        if (this.f3402g0 != 8) {
                                        }
                                        if (z21) {
                                        }
                                        if (z24) {
                                        }
                                        i21 = i18;
                                        z25 = z23;
                                        if (z25) {
                                        }
                                        if (z24) {
                                        }
                                        if (z24) {
                                        }
                                        i22 = 5;
                                    } else if (z11) {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = k6;
                                        fVar6 = k7;
                                        fVar7 = k8;
                                        i17 = 8;
                                        i16 = z4 ? 5 : 4;
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
                                    z20 = true;
                                    z21 = true;
                                    z22 = true;
                                    if (z21) {
                                    }
                                    z23 = true;
                                    if (z20) {
                                    }
                                    if (this.f3402g0 != 8) {
                                    }
                                    if (z21) {
                                    }
                                    if (z24) {
                                    }
                                    i21 = i18;
                                    z25 = z23;
                                    if (z25) {
                                    }
                                    if (z24) {
                                    }
                                    if (z24) {
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
                                    z20 = false;
                                    z21 = false;
                                }
                                i18 = 4;
                                z20 = true;
                                z21 = true;
                                z22 = false;
                                fVar4 = fVar2;
                                if (z21) {
                                }
                                z23 = true;
                                if (z20) {
                                }
                                if (this.f3402g0 != 8) {
                                }
                                if (z21) {
                                }
                                if (z24) {
                                }
                                i21 = i18;
                                z25 = z23;
                                if (z25) {
                                }
                                if (z24) {
                                }
                                if (z24) {
                                }
                                i22 = 5;
                            }
                            i29 = i22;
                            if (z24 && z19) {
                                int e5 = cVar5.f3388f != null ? cVar5.e() : 0;
                                if (fVar3 != fVar2) {
                                    cVar6.f(fVar2, fVar6, e5, i29);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i15 = i34;
                        if (k8.f3266k && fVar3.f3266k) {
                            cVar.b(k6, k8, cVar2.e(), f2, fVar3, k7, cVar3.e(), 8);
                            if (z4 && z19) {
                                int e6 = cVar3.f3388f != null ? cVar3.e() : 0;
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
                        z20 = true;
                        z21 = true;
                        z22 = false;
                        if (z21) {
                        }
                        z23 = true;
                        if (z20) {
                        }
                        if (this.f3402g0 != 8) {
                        }
                        if (z21) {
                        }
                        if (z24) {
                        }
                        i21 = i18;
                        z25 = z23;
                        if (z25) {
                        }
                        if (z24) {
                        }
                        if (z24) {
                        }
                        i22 = 5;
                        i29 = i22;
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
                        i22 = 5;
                        fVar6 = k7;
                        z19 = z18;
                        z24 = z4;
                        i29 = i22;
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
                i29 = (z4 && (cVar2.f3388f.d instanceof a)) ? 8 : 5;
                if (z24) {
                }
            }
            i22 = 5;
            z24 = z4;
            i29 = i22;
            if (z24) {
            }
        } else if (z7) {
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
        z18 = z6;
        i14 = i30;
        if (z13) {
        }
        boolean z312 = z18;
        if (i33 >= 2) {
        }
    }

    public final void e(int i, d dVar, int i4, int i5) {
        boolean z3;
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
            boolean z4 = true;
            if ((i6 == null || !i6.h()) && (i7 == null || !i7.h())) {
                e(2, dVar, 2, 0);
                e(4, dVar, 4, 0);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i8 == null || !i8.h()) && (i9 == null || !i9.h())) {
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
                if (i19.f3388f != i15) {
                    i19.j();
                }
                c f2 = i(i).f();
                c i20 = i(9);
                if (i20.h()) {
                    f2.j();
                    i20.j();
                }
            } else if (i == 2 || i == 4) {
                c i21 = i(7);
                if (i21.f3388f != i15) {
                    i21.j();
                }
                c f4 = i(i).f();
                c i22 = i(8);
                if (i22.h()) {
                    f4.j();
                    i22.j();
                }
            }
            i14.a(i15, i5);
        }
    }

    public final void f(c cVar, c cVar2, int i) {
        if (cVar.d == this) {
            e(cVar.f3387e, cVar2.d, cVar2.f3387e, i);
        }
    }

    public final void g(t.c cVar) {
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        if (this.f3392a0 > 0) {
            cVar.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            k kVar = new k(this);
            kVar.f3555h.f3530e = 4;
            kVar.i.f3530e = 5;
            kVar.f3553f = 0;
            this.d = kVar;
        }
        if (this.f3397e == null) {
            m mVar = new m(this);
            w.f fVar = new w.f(mVar);
            mVar.f3542k = fVar;
            mVar.f3543l = null;
            mVar.f3555h.f3530e = 6;
            mVar.i.f3530e = 7;
            fVar.f3530e = 8;
            mVar.f3553f = 1;
            this.f3397e = mVar;
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
                throw new AssertionError(w0.g(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.f3418p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f3402g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final d l(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.L).f3388f) != null && cVar2.f3388f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3388f;
        if (cVar4 == null || cVar4.f3388f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public final d m(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i == 1 && (cVar2 = (cVar = this.J).f3388f) != null && cVar2.f3388f == cVar) {
                return cVar2.d;
            }
            return null;
        }
        c cVar3 = this.I;
        c cVar4 = cVar3.f3388f;
        if (cVar4 == null || cVar4.f3388f != cVar3) {
            return null;
        }
        return cVar4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f3405j + ":{\n");
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
        int i4 = this.f3394b0;
        int[] iArr = this.C;
        int i5 = iArr[0];
        int i6 = this.f3423u;
        int i7 = this.f3420r;
        float f2 = this.f3425w;
        int[] iArr2 = this.f3418p0;
        int i8 = iArr2[0];
        float[] fArr = this.f3408k0;
        float f4 = fArr[0];
        o(sb, "    width", i, i4, i5, i6, i7, f2, i8);
        int i9 = this.V;
        int i10 = this.f3396c0;
        int i11 = iArr[1];
        int i12 = this.f3426x;
        int i13 = this.f3421s;
        float f5 = this.f3428z;
        int i14 = iArr2[1];
        float f6 = fArr[1];
        o(sb, "    height", i9, i10, i11, i12, i13, f5, i14);
        float f7 = this.W;
        int i15 = this.X;
        if (f7 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f7);
            sb.append(",");
            sb.append(i15);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.f3398e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.f3406j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f3402g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).f3436x0 + this.Y;
    }

    public final int s() {
        d dVar = this.T;
        return (dVar == null || !(dVar instanceof e)) ? this.Z : ((e) dVar).f3437y0 + this.Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f3388f != null ? 1 : 0) + (this.K.f3388f != null ? 1 : 0) < 2;
        }
        if ((this.J.f3388f != null ? 1 : 0) + (this.L.f3388f != null ? 1 : 0) + (this.M.f3388f != null ? 1 : 0) < 2) {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f3404h0 != null) {
            str = "id: " + this.f3404h0 + " ";
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
            c cVar6 = cVar5.f3388f;
            if (cVar6 == null || !cVar6.f3386c || (cVar4 = (cVar3 = this.K).f3388f) == null || !cVar4.f3386c) {
                return false;
            }
            return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f3388f.d()) >= i4;
        }
        c cVar7 = this.J;
        c cVar8 = cVar7.f3388f;
        if (cVar8 == null || !cVar8.f3386c || (cVar2 = (cVar = this.L).f3388f) == null || !cVar2.f3386c) {
            return false;
        }
        return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f3388f.d()) >= i4;
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
        c cVar4 = cVar3.f3388f;
        return (cVar4 == null || cVar4.f3388f == cVar3 || (cVar2 = (cVar = cVarArr[i4 + 1]).f3388f) == null || cVar2.f3388f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.I;
        c cVar2 = cVar.f3388f;
        if (cVar2 != null && cVar2.f3388f == cVar) {
            return true;
        }
        c cVar3 = this.K;
        c cVar4 = cVar3.f3388f;
        return cVar4 != null && cVar4.f3388f == cVar3;
    }

    public final boolean y() {
        c cVar = this.J;
        c cVar2 = cVar.f3388f;
        if (cVar2 != null && cVar2.f3388f == cVar) {
            return true;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f3388f;
        return cVar4 != null && cVar4.f3388f == cVar3;
    }

    public final boolean z() {
        return this.f3401g && this.f3402g0 != 8;
    }
}
