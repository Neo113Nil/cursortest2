package W;

import A0.p;
import E.t;
import R1.y;
import Z.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0276e;
import androidx.lifecycle.InterfaceC0292v;
import f2.j;
import j.AbstractC0535i;
import j.C0532f;
import j.C0542p;
import j.C0543q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n.T;
import n.r;
import n.z0;
import q2.AbstractC0837y;
import s2.C0969c;
import s2.g;
import t0.E;
import u0.B0;
import u0.C1123s;
import u0.I0;
import u0.L;
import x0.AbstractC1213a;
import x0.AbstractC1214b;
import x0.AbstractC1215c;
import x0.C1216d;
import x0.C1221i;

/* loaded from: classes.dex */
public final class c implements InterfaceC0276e, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final C1123s f4567d;

    /* renamed from: e, reason: collision with root package name */
    public final e f4568e;

    /* renamed from: f, reason: collision with root package name */
    public C1216d f4569f;

    /* renamed from: g, reason: collision with root package name */
    public final C0542p f4570g = new C0542p();

    /* renamed from: h, reason: collision with root package name */
    public final C0543q f4571h = new C0543q();

    /* renamed from: i, reason: collision with root package name */
    public final long f4572i = 100;

    /* renamed from: j, reason: collision with root package name */
    public int f4573j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4574k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0532f f4575l = new C0532f();

    /* renamed from: m, reason: collision with root package name */
    public final g f4576m = r.a(1, 6, null);

    /* renamed from: n, reason: collision with root package name */
    public final Handler f4577n = new Handler(Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public C0542p f4578o;

    /* renamed from: p, reason: collision with root package name */
    public long f4579p;

    /* renamed from: q, reason: collision with root package name */
    public final C0542p f4580q;

    /* renamed from: r, reason: collision with root package name */
    public I0 f4581r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4582s;

    /* renamed from: t, reason: collision with root package name */
    public final t f4583t;

    public c(C1123s c1123s, e eVar) {
        this.f4567d = c1123s;
        this.f4568e = eVar;
        C0542p c0542p = AbstractC0535i.f6284a;
        j.d(c0542p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4578o = c0542p;
        this.f4580q = new C0542p();
        p a3 = c1123s.getSemanticsOwner().a();
        j.d(c0542p, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f4581r = new I0(a3, c0542p);
        this.f4583t = new t(2, this);
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
    public final Object c(X1.c cVar) {
        b bVar;
        Object obj;
        W1.a aVar;
        int i3;
        c cVar2;
        C0969c c0969c;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i4 = bVar.f4566k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar.f4566k = i4 - Integer.MIN_VALUE;
                    obj = bVar.f4564i;
                    aVar = W1.a.f4608d;
                    i3 = bVar.f4566k;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        try {
                            g gVar = this.f4576m;
                            gVar.getClass();
                            c0969c = new C0969c(gVar);
                            cVar2 = this;
                        } catch (Throwable th) {
                            th = th;
                            cVar2 = this;
                            cVar2.f4575l.clear();
                            throw th;
                        }
                    } else if (i3 == 1) {
                        c0969c = bVar.f4563h;
                        cVar2 = bVar.f4562g;
                        R1.a.e(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            cVar2.f4575l.clear();
                            return y.f4171a;
                        }
                        c0969c.c();
                        if (cVar2.g()) {
                            cVar2.h();
                        }
                        if (!cVar2.f4582s) {
                            cVar2.f4582s = true;
                            cVar2.f4577n.post(cVar2.f4583t);
                        }
                        cVar2.f4575l.clear();
                        long j3 = cVar2.f4572i;
                        bVar.f4562g = cVar2;
                        bVar.f4563h = c0969c;
                        bVar.f4566k = 2;
                        if (AbstractC0837y.f(j3, bVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0969c = bVar.f4563h;
                        cVar2 = bVar.f4562g;
                        R1.a.e(obj);
                    }
                    bVar.f4562g = cVar2;
                    bVar.f4563h = c0969c;
                    bVar.f4566k = 1;
                    obj = c0969c.b(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i3 != 0) {
            }
            bVar.f4562g = cVar2;
            bVar.f4563h = c0969c;
            bVar.f4566k = 1;
            obj = c0969c.b(bVar);
            if (obj == aVar) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bVar = new b(this, cVar);
        obj = bVar.f4564i;
        aVar = W1.a.f4608d;
        i3 = bVar.f4566k;
    }

    @Override // androidx.lifecycle.InterfaceC0276e
    public final void d(InterfaceC0292v interfaceC0292v) {
        m(this.f4567d.getSemanticsOwner().a());
        h();
        this.f4569f = null;
    }

    @Override // androidx.lifecycle.InterfaceC0276e
    public final void e(InterfaceC0292v interfaceC0292v) {
        this.f4569f = (C1216d) this.f4568e.b();
        l(this.f4567d.getSemanticsOwner().a());
        h();
    }

    public final C0542p f() {
        if (this.f4574k) {
            this.f4574k = false;
            this.f4578o = L.p(this.f4567d.getSemanticsOwner());
            this.f4579p = System.currentTimeMillis();
        }
        return this.f4578o;
    }

    public final boolean g() {
        return this.f4569f != null;
    }

    public final void h() {
        String str;
        String str2;
        C1216d c1216d = this.f4569f;
        if (c1216d != null && Build.VERSION.SDK_INT >= 29) {
            C0542p c0542p = this.f4570g;
            int i3 = c0542p.f6306e;
            Object obj = c1216d.f10293a;
            String str3 = "TREAT_AS_VIEW_TREE_APPEARED";
            char c2 = 7;
            long j3 = -9187201950435737472L;
            int i4 = 0;
            View view = c1216d.f10294b;
            if (i3 != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = c0542p.f6304c;
                long[] jArr = c0542p.f6302a;
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
                                    arrayList.add((C1221i) objArr[(i5 << 3) + i7]);
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
                    arrayList2.add(((C1221i) arrayList.get(i8)).f10295a);
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 34) {
                    AbstractC1215c.a(B0.c(obj), arrayList2);
                } else if (i9 >= 29) {
                    ViewStructure b3 = AbstractC1214b.b(B0.c(obj), view);
                    AbstractC1213a.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1214b.d(B0.c(obj), b3);
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        AbstractC1214b.d(B0.c(obj), (ViewStructure) arrayList2.get(i10));
                    }
                    ViewStructure b4 = AbstractC1214b.b(B0.c(obj), view);
                    str3 = str2;
                    AbstractC1213a.a(b4).putBoolean(str3, true);
                    AbstractC1214b.d(B0.c(obj), b4);
                    c0542p.a();
                }
                str3 = str2;
                c0542p.a();
            }
            C0543q c0543q = this.f4571h;
            if (c0543q.f6311d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = c0543q.f6309b;
                long[] jArr2 = c0543q.f6308a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j5 = jArr2[i11];
                        long[] jArr3 = jArr2;
                        str = str3;
                        if ((((~j5) << c2) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
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
                        c2 = 7;
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
                    ContentCaptureSession c3 = B0.c(obj);
                    M.e m3 = T.m(view);
                    Objects.requireNonNull(m3);
                    AbstractC1214b.f(c3, b0.y.f(m3.f3427a), jArr4);
                } else if (i15 >= 29) {
                    ViewStructure b5 = AbstractC1214b.b(B0.c(obj), view);
                    AbstractC1213a.a(b5).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
                    AbstractC1214b.d(B0.c(obj), b5);
                    ContentCaptureSession c4 = B0.c(obj);
                    M.e m4 = T.m(view);
                    Objects.requireNonNull(m4);
                    AbstractC1214b.f(c4, b0.y.f(m4.f3427a), jArr4);
                    ViewStructure b6 = AbstractC1214b.b(B0.c(obj), view);
                    AbstractC1213a.a(b6).putBoolean(str, true);
                    AbstractC1214b.d(B0.c(obj), b6);
                }
                c0543q.b();
            }
        }
    }

    public final void i(p pVar, I0 i02) {
        List h3 = p.h(pVar, true, 4);
        int size = h3.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar2 = (p) h3.get(i3);
            if (f().b(pVar2.f145g) && !i02.f9200b.c(pVar2.f145g)) {
                l(pVar2);
            }
        }
        C0542p c0542p = this.f4580q;
        int[] iArr = c0542p.f6303b;
        long[] jArr = c0542p.f6302a;
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
                            if (!f().b(i7)) {
                                C0542p c0542p2 = this.f4570g;
                                if (c0542p2.c(i7)) {
                                    c0542p2.h(i7);
                                } else {
                                    this.f4571h.a(i7);
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
        List h4 = p.h(pVar, true, 4);
        int size2 = h4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p pVar3 = (p) h4.get(i8);
            if (f().b(pVar3.f145g)) {
                int i9 = pVar3.f145g;
                if (c0542p.b(i9)) {
                    Object f3 = c0542p.f(i9);
                    if (f3 == null) {
                        z0.p("node not present in pruned tree before this change");
                        throw null;
                    }
                    i(pVar3, (I0) f3);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(String str, int i3) {
        C1216d c1216d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && (c1216d = this.f4569f) != null) {
            AutofillId a3 = c1216d.a(i3);
            if (a3 == null) {
                z0.p("Invalid content capture ID");
                throw null;
            }
            if (i4 >= 29) {
                AbstractC1214b.e(B0.c(c1216d.f10293a), a3, str);
            }
        }
    }

    public final void k(p pVar, I0 i02) {
        C0543q c0543q = new C0543q();
        List h3 = p.h(pVar, true, 4);
        int size = h3.size();
        int i3 = 0;
        while (true) {
            g gVar = this.f4576m;
            y yVar = y.f4171a;
            C0532f c0532f = this.f4575l;
            E e3 = pVar.f141c;
            if (i3 >= size) {
                C0543q c0543q2 = i02.f9200b;
                int[] iArr = c0543q2.f6309b;
                long[] jArr = c0543q2.f6308a;
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
                                    if (!c0543q.c(iArr[(i4 << 3) + i7])) {
                                        if (c0532f.add(e3)) {
                                            gVar.p(yVar);
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
                List h4 = p.h(pVar, true, 4);
                int size2 = h4.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    p pVar2 = (p) h4.get(i8);
                    if (f().b(pVar2.f145g)) {
                        Object f3 = this.f4580q.f(pVar2.f145g);
                        if (f3 == null) {
                            z0.p("node not present in pruned tree before this change");
                            throw null;
                        }
                        k(pVar2, (I0) f3);
                    }
                }
                return;
            }
            p pVar3 = (p) h3.get(i3);
            if (f().b(pVar3.f145g)) {
                C0543q c0543q3 = i02.f9200b;
                int i9 = pVar3.f145g;
                if (!c0543q3.c(i9)) {
                    if (c0532f.add(e3)) {
                        gVar.p(yVar);
                        return;
                    }
                    return;
                }
                c0543q.a(i9);
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
    public final void l(A0.p r21) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.c.l(A0.p):void");
    }

    public final void m(p pVar) {
        if (g()) {
            int i3 = pVar.f145g;
            C0542p c0542p = this.f4570g;
            if (c0542p.c(i3)) {
                c0542p.h(i3);
            } else {
                this.f4571h.a(i3);
            }
            List h3 = p.h(pVar, true, 4);
            int size = h3.size();
            for (int i4 = 0; i4 < size; i4++) {
                m((p) h3.get(i4));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4577n.removeCallbacks(this.f4583t);
        this.f4569f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
