package f1;

import a2.b0;
import a2.r;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.d0;
import androidx.lifecycle.u;
import d2.o;
import d2.v;
import d2.v1;
import ie.j;
import j2.m;
import j2.n;
import j2.p;
import j2.q;
import j2.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s.h0;
import s.k;
import s.l;
import s.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements androidx.lifecycle.f, View.OnAttachStateChangeListener {
    public boolean A;
    public final d0 B;

    /* renamed from: d, reason: collision with root package name */
    public final v f4045d;

    /* renamed from: e, reason: collision with root package name */
    public final o f4046e;

    /* renamed from: i, reason: collision with root package name */
    public c6.c f4047i;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4048r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final long f4049s = 100;

    /* renamed from: t, reason: collision with root package name */
    public a f4050t = a.f4037d;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4051u = true;

    /* renamed from: v, reason: collision with root package name */
    public final ie.c f4052v = j.a(1, 6, null);

    /* renamed from: w, reason: collision with root package name */
    public w f4053w;

    /* renamed from: x, reason: collision with root package name */
    public long f4054x;

    /* renamed from: y, reason: collision with root package name */
    public final w f4055y;

    /* renamed from: z, reason: collision with root package name */
    public v1 f4056z;

    public e(v vVar, o oVar) {
        this.f4045d = vVar;
        this.f4046e = oVar;
        new Handler(Looper.getMainLooper());
        w wVar = l.f8343a;
        wVar.getClass();
        this.f4053w = wVar;
        this.f4055y = new w();
        this.f4056z = new v1(vVar.getSemanticsOwner().a(), wVar);
        this.B = new d0(12, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (ge.a0.i(r7.f4049s, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nd.c cVar) {
        c cVar2;
        int i3;
        ie.b bVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f4043r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f4043r = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f4041e;
                md.a aVar = md.a.f6622d;
                i3 = cVar2.f4043r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    ie.c cVar3 = this.f4052v;
                    cVar3.getClass();
                    bVar = new ie.b(cVar3);
                } else if (i3 == 1) {
                    bVar = cVar2.f4040d;
                    cf.c.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.f5554a;
                    }
                    bVar.c();
                    if (g()) {
                        j();
                    }
                    Handler handler = this.f4045d.getHandler();
                    if (!this.A && handler != null) {
                        this.A = true;
                        handler.post(this.B);
                    }
                    cVar2.f4040d = bVar;
                    cVar2.f4043r = 2;
                } else {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = cVar2.f4040d;
                    cf.c.M(obj);
                }
                cVar2.f4040d = bVar;
                cVar2.f4043r = 1;
                obj = bVar.b(cVar2);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f4041e;
        md.a aVar2 = md.a.f6622d;
        i3 = cVar2.f4043r;
        if (i3 != 0) {
        }
        cVar2.f4040d = bVar;
        cVar2.f4043r = 1;
        obj2 = bVar.b(cVar2);
    }

    public final void c(k kVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c10;
        long j3;
        int i3;
        int i10;
        long j10;
        long j11;
        k kVar2 = kVar;
        int[] iArr3 = kVar2.f8337b;
        long[] jArr = kVar2.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j12 = jArr[i11];
            char c11 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j12 & 255) < 128) {
                        int i15 = iArr3[(i11 << 3) + i14];
                        c10 = c11;
                        v1 v1Var = (v1) this.f4055y.b(i15);
                        n nVar = (n) kVar2.b(i15);
                        m mVar = nVar != null ? nVar.f4986a : null;
                        if (mVar == null) {
                            throw v4.a.h("no value for specified key");
                        }
                        j3 = j13;
                        int i16 = mVar.f4985f;
                        h0 h0Var = mVar.f4983d.f4975d;
                        if (v1Var == null) {
                            Object[] objArr = h0Var.f8313b;
                            long[] jArr2 = h0Var.f8312a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i17 = i12;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr2[i18];
                                    j = j12;
                                    if ((((~j14) << c10) & j14 & j3) != j3) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j14 & 255) < 128) {
                                                j11 = j14;
                                                t tVar = (t) objArr[(i18 << 3) + i20];
                                                t tVar2 = q.A;
                                                if (Intrinsics.a(tVar, tVar2)) {
                                                    Object g = h0Var.g(tVar2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    l(i16, String.valueOf(list != null ? (m2.e) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                j11 = j14;
                                            }
                                            j14 = j11 >> i17;
                                        }
                                        if (i19 != i17) {
                                            break;
                                        }
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    j12 = j;
                                    i17 = 8;
                                }
                            } else {
                                j = j12;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j12;
                            Object[] objArr2 = h0Var.f8313b;
                            long[] jArr3 = h0Var.f8312a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i21 = 0;
                                while (true) {
                                    long j15 = jArr4[i21];
                                    long[] jArr5 = jArr4;
                                    i3 = i14;
                                    if ((((~j15) << c10) & j15 & j3) != j3) {
                                        int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j15 & 255) < 128) {
                                                j10 = j15;
                                                t tVar3 = (t) objArr2[(i21 << 3) + i23];
                                                t tVar4 = q.A;
                                                if (Intrinsics.a(tVar3, tVar4)) {
                                                    Object g2 = v1Var.f3586a.f4975d.g(tVar4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    m2.e eVar = list2 != null ? (m2.e) CollectionsKt.firstOrNull(list2) : null;
                                                    Object g10 = h0Var.g(tVar4);
                                                    if (g10 == null) {
                                                        g10 = null;
                                                    }
                                                    List list3 = (List) g10;
                                                    m2.e eVar2 = list3 != null ? (m2.e) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.a(eVar, eVar2)) {
                                                        l(i16, String.valueOf(eVar2));
                                                    }
                                                }
                                            } else {
                                                j10 = j15;
                                            }
                                            i23++;
                                            j15 = j10 >> 8;
                                        }
                                        if (i22 != 8) {
                                            break;
                                        }
                                    }
                                    if (i21 == length3) {
                                        break;
                                    }
                                    i21++;
                                    i14 = i3;
                                    jArr4 = jArr5;
                                }
                                i10 = 8;
                            }
                        }
                        i3 = i14;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j12;
                        c10 = c11;
                        j3 = j13;
                        i3 = i14;
                        i10 = i12;
                    }
                    j12 = j >> i10;
                    i14 = i3 + 1;
                    i12 = i10;
                    c11 = c10;
                    j13 = j3;
                    iArr3 = iArr2;
                    kVar2 = kVar;
                }
                iArr = iArr3;
                if (i13 != i12) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            kVar2 = kVar;
            iArr3 = iArr;
        }
    }

    public final void e(m mVar, Function2 function2) {
        mVar.getClass();
        List j = m.j(4, mVar);
        int size = j.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = j.get(i10);
            if (f().a(((m) obj).f4985f)) {
                function2.invoke(Integer.valueOf(i3), obj);
                i3++;
            }
        }
    }

    public final k f() {
        if (this.f4051u) {
            this.f4051u = false;
            this.f4053w = p.b(this.f4045d.getSemanticsOwner(), d.f4044d);
            this.f4054x = System.currentTimeMillis();
        }
        return this.f4053w;
    }

    public final boolean g() {
        return this.f4047i != null;
    }

    @Override // androidx.lifecycle.f
    public final void h(u uVar) {
        this.f4047i = (c6.c) this.f4046e.invoke();
        m(-1, this.f4045d.getSemanticsOwner().a());
        j();
    }

    @Override // androidx.lifecycle.f
    public final void i(u uVar) {
        n(this.f4045d.getSemanticsOwner().a());
        j();
        this.f4047i = null;
    }

    public final void j() {
        c6.c cVar = this.f4047i;
        if (cVar == null) {
            return;
        }
        Object obj = cVar.f1809e;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f4048r;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = (f) arrayList.get(i3);
            int ordinal = fVar.f4059c.ordinal();
            if (ordinal == 0) {
                d9.c cVar2 = fVar.f4060d;
                if (cVar2 != null) {
                    ViewStructure viewStructure = (ViewStructure) cVar2.f3701e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        e3.l.d(androidx.lifecycle.i0.j(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    r.p();
                    return;
                }
                AutofillId h10 = cVar.h(fVar.f4057a);
                if (h10 != null && Build.VERSION.SDK_INT >= 29) {
                    e3.l.e(androidx.lifecycle.i0.j(obj), h10);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession j = androidx.lifecycle.i0.j(obj);
            f2.a s3 = z4.w.s((View) cVar.f1810i);
            Objects.requireNonNull(s3);
            e3.l.g(j, b.g(s3.f4064d), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void k(m mVar, v1 v1Var) {
        e(mVar, new b0(2, v1Var, this));
        List j = m.j(4, mVar);
        int size = j.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar2 = (m) j.get(i3);
            k f3 = f();
            int i10 = mVar2.f4985f;
            if (f3.a(i10)) {
                w wVar = this.f4055y;
                if (wVar.a(i10)) {
                    Object b10 = wVar.b(i10);
                    if (b10 == null) {
                        throw v4.a.h("node not present in pruned tree before this change");
                    }
                    k(mVar2, (v1) b10);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i3, String str) {
        c6.c cVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && (cVar = this.f4047i) != null) {
            AutofillId h10 = cVar.h(i3);
            if (h10 == null) {
                throw v4.a.h("Invalid content capture ID");
            }
            if (i10 >= 29) {
                e3.l.f(androidx.lifecycle.i0.j(cVar.f1809e), h10, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v13 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r7v13 android.view.autofill.AutofillId) from 0x0096: IF  (r7v13 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0074 A[HIDDEN] (LINE:151)
          (r7v13 android.view.autofill.AutofillId) from 0x009f: PHI (r7v4 android.view.autofill.AutofillId) = (r7v3 android.view.autofill.AutofillId), (r7v13 android.view.autofill.AutofillId) binds: [B:95:0x0099, B:34:0x0096] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int r18, j2.m r19) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.m(int, j2.m):void");
    }

    public final void n(m mVar) {
        if (g()) {
            this.f4048r.add(new f(mVar.f4985f, this.f4054x, g.f4062e, null));
            List j = m.j(4, mVar);
            int size = j.size();
            for (int i3 = 0; i3 < size; i3++) {
                n((m) j.get(i3));
            }
        }
    }

    public final void o() {
        w wVar = this.f4055y;
        wVar.c();
        k f3 = f();
        int[] iArr = f3.f8337b;
        Object[] objArr = f3.f8338c;
        long[] jArr = f3.f8336a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i3 << 3) + i11;
                            wVar.h(iArr[i12], new v1(((n) objArr[i12]).f4986a, f()));
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f4056z = new v1(this.f4045d.getSemanticsOwner().a(), f());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f4045d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.B);
        this.f4047i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
