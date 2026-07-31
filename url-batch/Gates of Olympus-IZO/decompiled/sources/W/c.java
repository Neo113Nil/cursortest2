package W;

import E.u;
import L1.z;
import Z.d;
import Z1.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0220e;
import androidx.lifecycle.InterfaceC0236v;
import b0.AbstractC0290w;
import e2.AbstractC0381e;
import j.AbstractC0491i;
import j.C0488f;
import j.C0498p;
import j.C0499q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k2.AbstractC0552y;
import m2.C0628c;
import m2.e;
import m2.l;
import t0.D;
import u0.AbstractC0994r0;
import u0.C0997t;
import u0.C1008y0;
import u0.L;
import w0.AbstractC1021a;
import z0.n;

/* loaded from: classes.dex */
public final class c implements InterfaceC0220e, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final C0997t f3373d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3374e;

    /* renamed from: f, reason: collision with root package name */
    public w0.d f3375f;

    /* renamed from: g, reason: collision with root package name */
    public final C0498p f3376g = new C0498p();

    /* renamed from: h, reason: collision with root package name */
    public final C0499q f3377h = new C0499q();

    /* renamed from: i, reason: collision with root package name */
    public final long f3378i = 100;

    /* renamed from: j, reason: collision with root package name */
    public int f3379j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3380k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0488f f3381l = new C0488f();

    /* renamed from: m, reason: collision with root package name */
    public final e f3382m = l.a(1, 6, null);

    /* renamed from: n, reason: collision with root package name */
    public final Handler f3383n = new Handler(Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public C0498p f3384o;
    public long p;

    /* renamed from: q, reason: collision with root package name */
    public final C0498p f3385q;

    /* renamed from: r, reason: collision with root package name */
    public C1008y0 f3386r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3387s;

    /* renamed from: t, reason: collision with root package name */
    public final u f3388t;

    public c(C0997t c0997t, d dVar) {
        this.f3373d = c0997t;
        this.f3374e = dVar;
        C0498p c0498p = AbstractC0491i.f5166a;
        i.d(c0498p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f3384o = c0498p;
        this.f3385q = new C0498p();
        n a3 = c0997t.getSemanticsOwner().a();
        i.d(c0498p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f3386r = new C1008y0(a3, c0498p);
        this.f3388t = new u(1, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(R1.c cVar) {
        b bVar;
        Object obj;
        Q1.a aVar;
        int i3;
        c cVar2;
        C0628c c0628c;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i4 = bVar.f3372h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.f3372h = i4 - Integer.MIN_VALUE;
                    obj = bVar.f3370f;
                    aVar = Q1.a.f3113d;
                    i3 = bVar.f3372h;
                    if (i3 != 0) {
                        I2.l.Q(obj);
                        try {
                            e eVar = this.f3382m;
                            eVar.getClass();
                            c0628c = new C0628c(eVar);
                            cVar2 = this;
                        } catch (Throwable th) {
                            th = th;
                            cVar2 = this;
                            cVar2.f3381l.clear();
                            throw th;
                        }
                    } else if (i3 == 1) {
                        c0628c = bVar.f3369e;
                        cVar2 = bVar.f3368d;
                        I2.l.Q(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            cVar2.f3381l.clear();
                            return z.f2729a;
                        }
                        c0628c.c();
                        if (cVar2.f()) {
                            cVar2.g();
                        }
                        if (!cVar2.f3387s) {
                            cVar2.f3387s = true;
                            cVar2.f3383n.post(cVar2.f3388t);
                        }
                        cVar2.f3381l.clear();
                        long j3 = cVar2.f3378i;
                        bVar.f3368d = cVar2;
                        bVar.f3369e = c0628c;
                        bVar.f3372h = 2;
                        if (AbstractC0552y.e(j3, bVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0628c = bVar.f3369e;
                        cVar2 = bVar.f3368d;
                        I2.l.Q(obj);
                    }
                    bVar.f3368d = cVar2;
                    bVar.f3369e = c0628c;
                    bVar.f3372h = 1;
                    obj = c0628c.b(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i3 != 0) {
            }
            bVar.f3368d = cVar2;
            bVar.f3369e = c0628c;
            bVar.f3372h = 1;
            obj = c0628c.b(bVar);
            if (obj == aVar) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bVar = new b(this, cVar);
        obj = bVar.f3370f;
        aVar = Q1.a.f3113d;
        i3 = bVar.f3372h;
    }

    public final C0498p d() {
        if (this.f3380k) {
            this.f3380k = false;
            this.f3384o = L.l(this.f3373d.getSemanticsOwner());
            this.p = System.currentTimeMillis();
        }
        return this.f3384o;
    }

    @Override // androidx.lifecycle.InterfaceC0220e
    public final void e(InterfaceC0236v interfaceC0236v) {
        m(this.f3373d.getSemanticsOwner().a());
        g();
        this.f3375f = null;
    }

    public final boolean f() {
        return this.f3375f != null;
    }

    public final void g() {
        String str;
        String str2;
        w0.d dVar = this.f3375f;
        if (dVar != null && Build.VERSION.SDK_INT >= 29) {
            C0498p c0498p = this.f3376g;
            int i3 = c0498p.f5188e;
            Object obj = dVar.f8575a;
            String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
            char c3 = 7;
            long j3 = -9187201950435737472L;
            int i4 = 0;
            View view = dVar.f8576b;
            if (i3 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c0498p.f5186c;
                long[] jArr = c0498p.f5184a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr[i5];
                        str2 = str3;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & 255) < 128) {
                                    arrayList.add((w0.i) objArr[(i5 << 3) + i7]);
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        str3 = str2;
                        j3 = -9187201950435737472L;
                    }
                } else {
                    str2 = "TREAT_AS_VIEW_TREE_APPEARED";
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(((w0.i) arrayList.get(i8)).f8577a);
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    w0.c.a(AbstractC0994r0.c(obj), arrayList2);
                } else if (i9 >= 29) {
                    ViewStructure b2 = w0.b.b(AbstractC0994r0.c(obj), view);
                    AbstractC1021a.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    w0.b.d(AbstractC0994r0.c(obj), b2);
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        w0.b.d(AbstractC0994r0.c(obj), (ViewStructure) arrayList2.get(i10));
                    }
                    ViewStructure b3 = w0.b.b(AbstractC0994r0.c(obj), view);
                    str3 = str2;
                    AbstractC1021a.a(b3).putBoolean(str3, true);
                    w0.b.d(AbstractC0994r0.c(obj), b3);
                    c0498p.a();
                }
                str3 = str2;
                c0498p.a();
            }
            C0499q c0499q = this.f3377h;
            if (c0499q.f5193d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c0499q.f5191b;
                long[] jArr2 = c0499q.f5190a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j5 = jArr2[i11];
                        long[] jArr3 = jArr2;
                        str = str3;
                        if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j5 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i11 << 3) + i13]));
                                }
                                j5 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        }
                        i11++;
                        jArr2 = jArr3;
                        str3 = str;
                        c3 = 7;
                    }
                } else {
                    str = str3;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i14)).intValue()));
                }
                long[] jArr4 = new long[arrayList4.size()];
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    jArr4[i4] = ((Number) it.next()).longValue();
                    i4++;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    ContentCaptureSession c4 = AbstractC0994r0.c(obj);
                    M.e C = AbstractC0381e.C(view);
                    Objects.requireNonNull(C);
                    w0.b.f(c4, AbstractC0290w.f(C.f2736a), jArr4);
                } else if (i15 >= 29) {
                    ViewStructure b4 = w0.b.b(AbstractC0994r0.c(obj), view);
                    AbstractC1021a.a(b4).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    w0.b.d(AbstractC0994r0.c(obj), b4);
                    ContentCaptureSession c5 = AbstractC0994r0.c(obj);
                    M.e C3 = AbstractC0381e.C(view);
                    Objects.requireNonNull(C3);
                    w0.b.f(c5, AbstractC0290w.f(C3.f2736a), jArr4);
                    ViewStructure b5 = w0.b.b(AbstractC0994r0.c(obj), view);
                    AbstractC1021a.a(b5).putBoolean(str, true);
                    w0.b.d(AbstractC0994r0.c(obj), b5);
                }
                c0499q.b();
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0220e
    public final void h(InterfaceC0236v interfaceC0236v) {
        this.f3375f = (w0.d) this.f3374e.b();
        l(this.f3373d.getSemanticsOwner().a());
        g();
    }

    public final void i(n nVar, C1008y0 c1008y0) {
        List h3 = n.h(nVar, true, 4);
        int size = h3.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar2 = (n) h3.get(i3);
            if (d().b(nVar2.f8994g) && !c1008y0.f8502b.c(nVar2.f8994g)) {
                l(nVar2);
            }
        }
        C0498p c0498p = this.f3385q;
        int[] iArr = c0498p.f5185b;
        long[] jArr = c0498p.f5184a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            if (!d().b(i7)) {
                                C0498p c0498p2 = this.f3376g;
                                if (c0498p2.c(i7)) {
                                    c0498p2.h(i7);
                                } else {
                                    this.f3377h.a(i7);
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        List h4 = n.h(nVar, true, 4);
        int size2 = h4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            n nVar3 = (n) h4.get(i8);
            if (d().b(nVar3.f8994g)) {
                int i9 = nVar3.f8994g;
                if (c0498p.b(i9)) {
                    Object f3 = c0498p.f(i9);
                    if (f3 == null) {
                        AbstractC0381e.O("node not present in pruned tree before this change");
                        throw null;
                    }
                    i(nVar3, (C1008y0) f3);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(String str, int i3) {
        w0.d dVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && (dVar = this.f3375f) != null) {
            AutofillId a3 = dVar.a(i3);
            if (a3 == null) {
                AbstractC0381e.O("Invalid content capture ID");
                throw null;
            }
            if (i4 >= 29) {
                w0.b.e(AbstractC0994r0.c(dVar.f8575a), a3, str);
            }
        }
    }

    public final void k(n nVar, C1008y0 c1008y0) {
        C0499q c0499q = new C0499q();
        List h3 = n.h(nVar, true, 4);
        int size = h3.size();
        int i3 = 0;
        while (true) {
            e eVar = this.f3382m;
            z zVar = z.f2729a;
            C0488f c0488f = this.f3381l;
            D d3 = nVar.f8990c;
            if (i3 >= size) {
                C0499q c0499q2 = c1008y0.f8502b;
                int[] iArr = c0499q2.f5191b;
                long[] jArr = c0499q2.f5190a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j3 & 255) < 128) {
                                    if (!c0499q.c(iArr[(i4 << 3) + i7])) {
                                        if (c0488f.add(d3)) {
                                            eVar.g(zVar);
                                            return;
                                        }
                                        return;
                                    }
                                    i5 = 8;
                                }
                                j3 >>= i5;
                            }
                            if (i6 != i5) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                List h4 = n.h(nVar, true, 4);
                int size2 = h4.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    n nVar2 = (n) h4.get(i8);
                    if (d().b(nVar2.f8994g)) {
                        Object f3 = this.f3385q.f(nVar2.f8994g);
                        if (f3 == null) {
                            AbstractC0381e.O("node not present in pruned tree before this change");
                            throw null;
                        }
                        k(nVar2, (C1008y0) f3);
                    }
                }
                return;
            }
            n nVar3 = (n) h3.get(i3);
            if (d().b(nVar3.f8994g)) {
                C0499q c0499q3 = c1008y0.f8502b;
                int i9 = nVar3.f8994g;
                if (!c0499q3.c(i9)) {
                    if (c0488f.add(d3)) {
                        eVar.g(zVar);
                        return;
                    }
                    return;
                }
                c0499q.a(i9);
            }
            i3++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v14 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r10v14 android.view.autofill.AutofillId) from 0x0096: IF  (r10v14 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:86:0x01a2 A[HIDDEN] (LINE:151)
          (r10v14 android.view.autofill.AutofillId) from 0x00a0: PHI (r10v7 android.view.autofill.AutofillId) = (r10v6 android.view.autofill.AutofillId), (r10v14 android.view.autofill.AutofillId) binds: [B:85:0x009a, B:29:0x0096] A[DONT_GENERATE, DONT_INLINE]
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
    public final void l(z0.n r21) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.c.l(z0.n):void");
    }

    public final void m(n nVar) {
        if (f()) {
            int i3 = nVar.f8994g;
            C0498p c0498p = this.f3376g;
            if (c0498p.c(i3)) {
                c0498p.h(i3);
            } else {
                this.f3377h.a(i3);
            }
            List h3 = n.h(nVar, true, 4);
            int size = h3.size();
            for (int i4 = 0; i4 < size; i4++) {
                m((n) h3.get(i4));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3383n.removeCallbacks(this.f3388t);
        this.f3375f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
