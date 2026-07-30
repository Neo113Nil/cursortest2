package u0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.c0;
import androidx.lifecycle.e;
import androidx.lifecycle.v;
import b.h0;
import c3.h;
import d6.z;
import i.f;
import i.i;
import i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import r1.d0;
import r6.k;
import s1.f2;
import s1.j0;
import s1.r;
import t0.d;
import v1.g;
import y.p;
import y1.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements e, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final r f8946f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f8947g;

    /* renamed from: h, reason: collision with root package name */
    public p f8948h;

    /* renamed from: i, reason: collision with root package name */
    public final i.p f8949i = new i.p();

    /* renamed from: j, reason: collision with root package name */
    public final q f8950j = new q();

    /* renamed from: k, reason: collision with root package name */
    public final long f8951k = 100;

    /* renamed from: l, reason: collision with root package name */
    public int f8952l = 1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8953m = true;

    /* renamed from: n, reason: collision with root package name */
    public final f f8954n = new f(0);

    /* renamed from: o, reason: collision with root package name */
    public final e7.e f8955o = j1.c.C(1, 6, null);

    /* renamed from: p, reason: collision with root package name */
    public final Handler f8956p = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public i.p f8957q;

    /* renamed from: r, reason: collision with root package name */
    public long f8958r;

    /* renamed from: s, reason: collision with root package name */
    public final i.p f8959s;

    /* renamed from: t, reason: collision with root package name */
    public f2 f8960t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8961u;

    /* renamed from: v, reason: collision with root package name */
    public final c0 f8962v;

    public c(r rVar, h0 h0Var) {
        this.f8946f = rVar;
        this.f8947g = h0Var;
        i.p pVar = i.f4750a;
        k.d(pVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f8957q = pVar;
        this.f8959s = new i.p();
        m a3 = rVar.getSemanticsOwner().a();
        k.d(pVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f8960t = new f2(a3, pVar);
        this.f8962v = new c0(12, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (c7.a0.e(r6, r0) == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004f, B:18:0x005c, B:20:0x0064, B:22:0x006d, B:23:0x0070, B:25:0x0074, B:26:0x007d, B:34:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j6.c cVar) {
        b bVar;
        Object obj;
        int i7;
        i6.a aVar;
        c cVar2;
        e7.b bVar2;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i8 = bVar.f8945j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.f8945j = i8 - Integer.MIN_VALUE;
                    obj = bVar.f8943h;
                    i7 = bVar.f8945j;
                    aVar = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        try {
                            e7.e eVar = this.f8955o;
                            eVar.getClass();
                            bVar2 = new e7.b(eVar);
                            cVar2 = this;
                        } catch (Throwable th) {
                            th = th;
                            cVar2 = this;
                            cVar2.f8954n.clear();
                            throw th;
                        }
                    } else if (i7 == 1) {
                        bVar2 = bVar.f8942g;
                        cVar2 = bVar.f8941f;
                        d6.a.e(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            cVar2.f8954n.clear();
                            return z.f2639a;
                        }
                        bVar2.c();
                        if (cVar2.e()) {
                            cVar2.f();
                        }
                        if (!cVar2.f8961u) {
                            cVar2.f8961u = true;
                            cVar2.f8956p.post(cVar2.f8962v);
                        }
                        cVar2.f8954n.clear();
                        long j8 = cVar2.f8951k;
                        bVar.f8941f = cVar2;
                        bVar.f8942g = bVar2;
                        bVar.f8945j = 2;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = bVar.f8942g;
                        cVar2 = bVar.f8941f;
                        d6.a.e(obj);
                    }
                    bVar.f8941f = cVar2;
                    bVar.f8942g = bVar2;
                    bVar.f8945j = 1;
                    obj = bVar2.b(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i7 != 0) {
            }
            bVar.f8941f = cVar2;
            bVar.f8942g = bVar2;
            bVar.f8945j = 1;
            obj = bVar2.b(bVar);
            if (obj == aVar) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bVar = new b(this, cVar);
        obj = bVar.f8943h;
        i7 = bVar.f8945j;
        aVar = i6.a.f4956f;
    }

    public final i.p d() {
        if (this.f8953m) {
            this.f8953m = false;
            this.f8957q = j0.p(this.f8946f.getSemanticsOwner());
            this.f8958r = System.currentTimeMillis();
        }
        return this.f8957q;
    }

    public final boolean e() {
        return this.f8948h != null;
    }

    public final void f() {
        long j8;
        char c4;
        long j9;
        ArrayList arrayList;
        ArrayList arrayList2;
        p pVar = this.f8948h;
        if (pVar == null) {
            return;
        }
        Object obj = pVar.f9722a;
        View view = pVar.f9723b;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        i.p pVar2 = this.f8949i;
        if (pVar2.f4774e != 0) {
            ArrayList arrayList3 = new ArrayList();
            j8 = 255;
            Object[] objArr = pVar2.f4772c;
            long[] jArr = pVar2.f4770a;
            c4 = 7;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j9 = -9187201950435737472L;
                while (true) {
                    long j10 = jArr[i7];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j10 & 255) < 128) {
                                arrayList3.add((v1.i) objArr[(i7 << 3) + i9]);
                            }
                            j10 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                j9 = -9187201950435737472L;
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList4.add(((v1.i) arrayList3.get(i10)).f9100a);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                v1.c.a(l1.f.g(obj), arrayList4);
            } else if (i11 >= 29) {
                ViewStructure b9 = v1.b.b(l1.f.g(obj), view);
                v1.a.a(b9).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                v1.b.d(l1.f.g(obj), b9);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    v1.b.d(l1.f.g(obj), (ViewStructure) arrayList4.get(i12));
                }
                ViewStructure b10 = v1.b.b(l1.f.g(obj), view);
                v1.a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                v1.b.d(l1.f.g(obj), b10);
            }
            pVar2.a();
        } else {
            j8 = 255;
            c4 = 7;
            j9 = -9187201950435737472L;
        }
        q qVar = this.f8950j;
        if (qVar.f4779d != 0) {
            ArrayList arrayList5 = new ArrayList();
            int[] iArr = qVar.f4777b;
            long[] jArr2 = qVar.f4776a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 0;
                while (true) {
                    long j11 = jArr2[i13];
                    ArrayList arrayList6 = arrayList5;
                    if ((((~j11) << c4) & j11 & j9) != j9) {
                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j11 & j8) < 128) {
                                arrayList2 = arrayList6;
                                arrayList2.add(Integer.valueOf(iArr[(i13 << 3) + i15]));
                            } else {
                                arrayList2 = arrayList6;
                            }
                            j11 >>= 8;
                            i15++;
                            arrayList6 = arrayList2;
                        }
                        arrayList = arrayList6;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        arrayList = arrayList6;
                    }
                    if (i13 == length2) {
                        break;
                    }
                    i13++;
                    arrayList5 = arrayList;
                }
            } else {
                arrayList = arrayList5;
            }
            ArrayList arrayList7 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList7.add(Long.valueOf(((Number) arrayList.get(i16)).intValue()));
            }
            long[] jArr3 = new long[arrayList7.size()];
            int size3 = arrayList7.size();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size3) {
                Object obj2 = arrayList7.get(i17);
                i17++;
                jArr3[i18] = ((Number) obj2).longValue();
                i18++;
            }
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 34) {
                ContentCaptureSession g9 = l1.f.g(obj);
                h j12 = g.j(view);
                Objects.requireNonNull(j12);
                v1.b.f(g9, d.i(j12.f1653a), jArr3);
            } else if (i19 >= 29) {
                ViewStructure b11 = v1.b.b(l1.f.g(obj), view);
                v1.a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                v1.b.d(l1.f.g(obj), b11);
                ContentCaptureSession g10 = l1.f.g(obj);
                h j13 = g.j(view);
                Objects.requireNonNull(j13);
                v1.b.f(g10, d.i(j13.f1653a), jArr3);
                ViewStructure b12 = v1.b.b(l1.f.g(obj), view);
                v1.a.a(b12).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
                v1.b.d(l1.f.g(obj), b12);
            }
            qVar.b();
        }
    }

    public final void g(m mVar, f2 f2Var) {
        List h3 = m.h(mVar, 4);
        int size = h3.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar2 = (m) h3.get(i7);
            if (d().b(mVar2.f9843g) && !f2Var.f8233b.c(mVar2.f9843g)) {
                j(mVar2);
            }
        }
        i.p pVar = this.f8959s;
        int[] iArr = pVar.f4771b;
        long[] jArr = pVar.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = iArr[(i8 << 3) + i10];
                            if (!d().b(i11)) {
                                i.p pVar2 = this.f8949i;
                                if (pVar2.c(i11)) {
                                    pVar2.h(i11);
                                } else {
                                    this.f8950j.a(i11);
                                }
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        List h8 = m.h(mVar, 4);
        int size2 = h8.size();
        for (int i12 = 0; i12 < size2; i12++) {
            m mVar3 = (m) h8.get(i12);
            i.p d8 = d();
            int i13 = mVar3.f9843g;
            if (d8.b(i13) && pVar.b(i13)) {
                Object f9 = pVar.f(i13);
                if (f9 == null) {
                    a.a.N("node not present in pruned tree before this change");
                    throw null;
                }
                g(mVar3, (f2) f9);
            }
        }
    }

    public final void h(String str, int i7) {
        p pVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29 && (pVar = this.f8948h) != null) {
            AutofillId b9 = pVar.b(i7);
            if (b9 == null) {
                a.a.N("Invalid content capture ID");
                throw null;
            }
            if (i8 >= 29) {
                v1.b.e(l1.f.g(pVar.f9722a), b9, str);
            }
        }
    }

    public final void i(m mVar, f2 f2Var) {
        q qVar = new q();
        List h3 = m.h(mVar, 4);
        d0 d0Var = mVar.f9839c;
        int size = h3.size();
        int i7 = 0;
        while (true) {
            z zVar = z.f2639a;
            e7.e eVar = this.f8955o;
            f fVar = this.f8954n;
            if (i7 >= size) {
                q qVar2 = f2Var.f8233b;
                int[] iArr = qVar2.f4777b;
                long[] jArr = qVar2.f4776a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        int[] iArr2 = iArr;
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j8 & 255) < 128 && !qVar.c(iArr2[(i8 << 3) + i10])) {
                                    if (fVar.add(d0Var)) {
                                        eVar.e(zVar);
                                        return;
                                    }
                                    return;
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        iArr = iArr2;
                    }
                }
                List h8 = m.h(mVar, 4);
                int size2 = h8.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    m mVar2 = (m) h8.get(i11);
                    if (d().b(mVar2.f9843g)) {
                        Object f9 = this.f8959s.f(mVar2.f9843g);
                        if (f9 == null) {
                            a.a.N("node not present in pruned tree before this change");
                            throw null;
                        }
                        i(mVar2, (f2) f9);
                    }
                }
                return;
            }
            m mVar3 = (m) h3.get(i7);
            i.p d8 = d();
            int i12 = mVar3.f9843g;
            if (d8.b(i12)) {
                if (!f2Var.f8233b.c(i12)) {
                    if (fVar.add(d0Var)) {
                        eVar.e(zVar);
                        return;
                    }
                    return;
                }
                qVar.a(i12);
            }
            i7++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v19 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r10v19 android.view.autofill.AutofillId) from 0x0097: IF  (r10v19 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:84:0x01a0 A[HIDDEN] (LINE:152)
          (r10v19 android.view.autofill.AutofillId) from 0x00a1: PHI (r10v7 android.view.autofill.AutofillId) = (r10v6 android.view.autofill.AutofillId), (r10v19 android.view.autofill.AutofillId) binds: [B:83:0x009b, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(y1.m r21) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.c.j(y1.m):void");
    }

    public final void k(m mVar) {
        if (e()) {
            int i7 = mVar.f9843g;
            i.p pVar = this.f8949i;
            if (pVar.c(i7)) {
                pVar.h(i7);
            } else {
                this.f8950j.a(i7);
            }
            List h3 = m.h(mVar, 4);
            int size = h3.size();
            for (int i8 = 0; i8 < size; i8++) {
                k((m) h3.get(i8));
            }
        }
    }

    @Override // androidx.lifecycle.e
    public final void n(v vVar) {
        this.f8948h = (p) this.f8947g.a();
        j(this.f8946f.getSemanticsOwner().a());
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8956p.removeCallbacks(this.f8962v);
        this.f8948h = null;
    }

    @Override // androidx.lifecycle.e
    public final void t(v vVar) {
        k(this.f8946f.getSemanticsOwner().a());
        f();
        this.f8948h = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
