package a1;

import a0.q;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.u;
import d2.n;
import d2.o;
import d2.s;
import d2.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.j0;
import o.l;
import o.m;
import o.x;
import q3.k;
import t.w0;
import x1.p1;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.f, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final t f201d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.e f202e;

    /* renamed from: f, reason: collision with root package name */
    public k2.c f203f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f204g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final long f205h = 100;
    public b i = b.f189d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f206j = true;

    /* renamed from: k, reason: collision with root package name */
    public final c7.c f207k = c7.j.a(1, null, 6);

    /* renamed from: l, reason: collision with root package name */
    public final Handler f208l = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public x f209m;

    /* renamed from: n, reason: collision with root package name */
    public long f210n;

    /* renamed from: o, reason: collision with root package name */
    public final x f211o;

    /* renamed from: p, reason: collision with root package name */
    public p1 f212p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f213q;

    /* renamed from: r, reason: collision with root package name */
    public final a f214r;

    public h(t tVar, d1.e eVar) {
        this.f201d = tVar;
        this.f202e = eVar;
        x xVar = m.f5510a;
        q6.i.c(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f209m = xVar;
        this.f211o = new x();
        n a8 = tVar.getSemanticsOwner().a();
        q6.i.c(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f212p = new p1(a8, xVar);
        this.f214r = new a(0, this);
    }

    @Override // androidx.lifecycle.f
    public final void c(u uVar) {
        this.f203f = (k2.c) this.f202e.b();
        l(-1, this.f201d.getSemanticsOwner().a());
        i();
    }

    @Override // androidx.lifecycle.f
    public final void d(u uVar) {
        m(this.f201d.getSemanticsOwner().a());
        i();
        this.f203f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (a7.x.c(r7.f205h, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(i6.c cVar) {
        f fVar;
        int i;
        c7.b bVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i8 = fVar.f197j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f197j = i8 - Integer.MIN_VALUE;
                Object obj = fVar.f196h;
                i = fVar.f197j;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    c7.c cVar2 = this.f207k;
                    cVar2.getClass();
                    bVar = new c7.b(cVar2);
                } else if (i == 1) {
                    bVar = fVar.f195g;
                    s6.a.K(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return c6.m.f1757a;
                    }
                    bVar.c();
                    if (h()) {
                        i();
                    }
                    if (!this.f213q) {
                        this.f213q = true;
                        this.f208l.post(this.f214r);
                    }
                    fVar.f195g = bVar;
                    fVar.f197j = 2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = fVar.f195g;
                    s6.a.K(obj);
                }
                fVar.f195g = bVar;
                fVar.f197j = 1;
                obj = bVar.b(fVar);
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f196h;
        i = fVar.f197j;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        fVar.f195g = bVar;
        fVar.f197j = 1;
        obj2 = bVar.b(fVar);
    }

    public final void f(l lVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j7;
        char c8;
        long j8;
        int i;
        long[] jArr3;
        long[] jArr4;
        long j9;
        long j10;
        l lVar2 = lVar;
        int[] iArr3 = lVar2.f5495b;
        long[] jArr5 = lVar2.f5494a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j11 = jArr5[i8];
            char c9 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((j11 & 255) < 128) {
                        int i12 = iArr3[(i8 << 3) + i11];
                        c8 = c9;
                        p1 p1Var = (p1) this.f211o.b(i12);
                        o oVar = (o) lVar2.b(i12);
                        n nVar = oVar != null ? oVar.f2163a : null;
                        if (nVar == null) {
                            throw q.f("no value for specified key");
                        }
                        j8 = j12;
                        int i13 = nVar.f2162g;
                        d2.j jVar = nVar.f2159d;
                        if (p1Var == null) {
                            j0 j0Var = jVar.f2150d;
                            Object[] objArr = j0Var.f5483b;
                            long[] jArr6 = j0Var.f5482a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i14 = i9;
                                int i15 = 0;
                                while (true) {
                                    long j13 = jArr6[i15];
                                    j7 = j11;
                                    if ((((~j13) << c8) & j13 & j8) != j8) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j13 & 255) < 128) {
                                                j10 = j13;
                                                v vVar = (v) objArr[(i15 << 3) + i17];
                                                v vVar2 = s.f2188a;
                                                v vVar3 = s.f2212z;
                                                if (q6.i.a(vVar, vVar3)) {
                                                    List list = (List) d2.q.d(jVar, vVar3);
                                                    k(String.valueOf(list != null ? (g2.e) d6.m.S(list) : null), i13);
                                                }
                                            } else {
                                                j10 = j13;
                                            }
                                            j13 = j10 >> i14;
                                        }
                                        if (i16 != i14) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                    j11 = j7;
                                    i14 = 8;
                                }
                            } else {
                                j7 = j11;
                            }
                        } else {
                            iArr2 = iArr3;
                            j7 = j11;
                            j0 j0Var2 = jVar.f2150d;
                            Object[] objArr2 = j0Var2.f5483b;
                            long[] jArr7 = j0Var2.f5482a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr7[i18];
                                    Object[] objArr4 = objArr3;
                                    i = i11;
                                    if ((((~j14) << c8) & j14 & j8) != j8) {
                                        int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j14 & 255) < 128) {
                                                jArr4 = jArr7;
                                                v vVar4 = (v) objArr4[(i18 << 3) + i20];
                                                v vVar5 = s.f2188a;
                                                j9 = j14;
                                                v vVar6 = s.f2212z;
                                                if (q6.i.a(vVar4, vVar6)) {
                                                    List list2 = (List) d2.q.d(p1Var.f8527a, vVar6);
                                                    g2.e eVar = list2 != null ? (g2.e) d6.m.S(list2) : null;
                                                    List list3 = (List) d2.q.d(jVar, vVar6);
                                                    g2.e eVar2 = list3 != null ? (g2.e) d6.m.S(list3) : null;
                                                    if (!q6.i.a(eVar, eVar2)) {
                                                        k(String.valueOf(eVar2), i13);
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j9 = j14;
                                            }
                                            j14 = j9 >> 8;
                                            i20++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i19 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i18 == length3) {
                                        break;
                                    }
                                    i18++;
                                    i11 = i;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j11 = j7 >> 8;
                                i11 = i + 1;
                                jArr5 = jArr2;
                                c9 = c8;
                                j12 = j8;
                                iArr3 = iArr2;
                                i9 = 8;
                                lVar2 = lVar;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j7 = j11;
                        c8 = c9;
                        j8 = j12;
                    }
                    i = i11;
                    j11 = j7 >> 8;
                    i11 = i + 1;
                    jArr5 = jArr2;
                    c9 = c8;
                    j12 = j8;
                    iArr3 = iArr2;
                    i9 = 8;
                    lVar2 = lVar;
                }
                iArr = iArr3;
                int i21 = i9;
                jArr = jArr5;
                if (i10 != i21) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i8 == length) {
                return;
            }
            i8++;
            lVar2 = lVar;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    public final l g() {
        if (this.f206j) {
            this.f206j = false;
            this.f209m = d2.q.b(this.f201d.getSemanticsOwner());
            this.f210n = System.currentTimeMillis();
        }
        return this.f209m;
    }

    public final boolean h() {
        return this.f203f != null;
    }

    public final void i() {
        k2.c cVar = this.f203f;
        if (cVar == null) {
            return;
        }
        Object obj = cVar.f4174b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f204g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) arrayList.get(i);
            int ordinal = iVar.f217c.ordinal();
            if (ordinal == 0) {
                k kVar = iVar.f218d;
                if (kVar != null) {
                    ViewStructure viewStructure = (ViewStructure) kVar.f6119e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        i3.b.d(w0.c(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    throw new a5.c();
                }
                AutofillId a8 = cVar.a(iVar.f215a);
                if (a8 != null && Build.VERSION.SDK_INT >= 29) {
                    i3.b.e(w0.c(obj), a8);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession c8 = w0.c(obj);
            q0.e A = r2.o.A(cVar.f4173a);
            Objects.requireNonNull(A);
            i3.b.g(c8, z0.f.a(A.f5938a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void j(n nVar, p1 p1Var) {
        g gVar = new g(0, p1Var, this);
        nVar.getClass();
        List j7 = n.j(4, nVar);
        int size = j7.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = j7.get(i8);
            if (g().a(((n) obj).f2162g)) {
                gVar.g(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j8 = n.j(4, nVar);
        int size2 = j8.size();
        for (int i9 = 0; i9 < size2; i9++) {
            n nVar2 = (n) j8.get(i9);
            l g3 = g();
            int i10 = nVar2.f2162g;
            if (g3.a(i10)) {
                x xVar = this.f211o;
                if (xVar.a(i10)) {
                    Object b8 = xVar.b(i10);
                    if (b8 == null) {
                        throw q.f("node not present in pruned tree before this change");
                    }
                    j(nVar2, (p1) b8);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(String str, int i) {
        k2.c cVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29 && (cVar = this.f203f) != null) {
            AutofillId a8 = cVar.a(i);
            if (a8 == null) {
                throw q.f("Invalid content capture ID");
            }
            if (i8 >= 29) {
                i3.b.f(w0.c(cVar.f4174b), a8, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r8v12 android.view.autofill.AutofillId) from 0x0097: IF  (r8v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0075 A[HIDDEN] (LINE:152)
          (r8v12 android.view.autofill.AutofillId) from 0x00a0: PHI (r8v4 android.view.autofill.AutofillId) = (r8v3 android.view.autofill.AutofillId), (r8v12 android.view.autofill.AutofillId) binds: [B:103:0x009a, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int r19, d2.n r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h.l(int, d2.n):void");
    }

    public final void m(n nVar) {
        if (h()) {
            this.f204g.add(new i(nVar.f2162g, this.f210n, j.f220e, null));
            List j7 = n.j(4, nVar);
            int size = j7.size();
            for (int i = 0; i < size; i++) {
                m((n) j7.get(i));
            }
        }
    }

    public final void n() {
        x xVar = this.f211o;
        xVar.c();
        l g3 = g();
        int[] iArr = g3.f5495b;
        Object[] objArr = g3.f5496c;
        long[] jArr = g3.f5494a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            xVar.g(iArr[i10], new p1(((o) objArr[i10]).f2163a, g()));
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
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
        this.f212p = new p1(this.f201d.getSemanticsOwner().a(), g());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f208l.removeCallbacks(this.f214r);
        this.f203f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
