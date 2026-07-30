package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v8 implements l80, View.OnAttachStateChangeListener {
    public final k3 A;
    public final t7 m;
    public final j7 n;
    public d20 o;
    public final ArrayList p = new ArrayList();
    public final long q = 100;
    public s8 r = s8.m;
    public boolean s = true;
    public final lq t = s93.g(1, 6, null);
    public final Handler u = new Handler(Looper.getMainLooper());
    public zm1 v;
    public long w;
    public final zm1 x;
    public bi2 y;
    public boolean z;

    public v8(t7 t7Var, j7 j7Var) {
        this.m = t7Var;
        this.n = j7Var;
        zm1 zm1Var = r31.a;
        zm1Var.getClass();
        this.v = zm1Var;
        this.x = new zm1();
        this.y = new bi2(t7Var.getSemanticsOwner().a(), zm1Var);
        this.A = new k3(4, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (defpackage.n90.a(r7.q, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        u8 u8Var;
        int i;
        iq iqVar;
        if (r30Var instanceof u8) {
            u8Var = (u8) r30Var;
            int i2 = u8Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u8Var.p = i2 - Integer.MIN_VALUE;
                Object obj = u8Var.n;
                b50 b50Var = b50.m;
                i = u8Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    lq lqVar = this.t;
                    lqVar.getClass();
                    iqVar = new iq(lqVar);
                } else if (i == 1) {
                    iqVar = u8Var.m;
                    ca2.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.a;
                    }
                    iqVar.c();
                    if (g()) {
                        h();
                    }
                    if (!this.z) {
                        this.z = true;
                        this.u.post(this.A);
                    }
                    u8Var.m = iqVar;
                    u8Var.p = 2;
                } else {
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iqVar = u8Var.m;
                    ca2.b(obj);
                }
                u8Var.m = iqVar;
                u8Var.p = 1;
                obj = iqVar.b(u8Var);
            }
        }
        u8Var = new u8(this, r30Var);
        Object obj2 = u8Var.n;
        b50 b50Var2 = b50.m;
        i = u8Var.p;
        if (i != 0) {
        }
        u8Var.m = iqVar;
        u8Var.p = 1;
        obj2 = iqVar.b(u8Var);
    }

    @Override // defpackage.l80
    public final void b(id1 id1Var) {
        l(this.m.getSemanticsOwner().a());
        h();
        this.o = null;
    }

    public final void c(q31 q31Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        q31 q31Var2 = q31Var;
        int[] iArr3 = q31Var2.b;
        long[] jArr = q31Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        bi2 bi2Var = (bi2) this.x.b(i7);
                        di2 di2Var = (di2) q31Var2.b(i7);
                        ai2 ai2Var = di2Var != null ? di2Var.a : null;
                        if (ai2Var == null) {
                            throw q40.f("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = ai2Var.g;
                        tn1 tn1Var = ai2Var.d.m;
                        if (bi2Var == null) {
                            Object[] objArr = tn1Var.b;
                            long[] jArr2 = tn1Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                ji2 ji2Var = (ji2) objArr[(i10 << 3) + i12];
                                                ji2 ji2Var2 = gi2.A;
                                                if (Intrinsics.b(ji2Var, ji2Var2)) {
                                                    Object g = tn1Var.g(ji2Var2);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                    List list = (List) g;
                                                    j(i8, String.valueOf(list != null ? (yd) zv.v(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = tn1Var.b;
                            long[] jArr3 = tn1Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                ji2 ji2Var3 = (ji2) objArr2[(i13 << 3) + i15];
                                                ji2 ji2Var4 = gi2.A;
                                                if (Intrinsics.b(ji2Var3, ji2Var4)) {
                                                    Object g2 = bi2Var.a.m.g(ji2Var4);
                                                    if (g2 == null) {
                                                        g2 = null;
                                                    }
                                                    List list2 = (List) g2;
                                                    yd ydVar = list2 != null ? (yd) zv.v(list2) : null;
                                                    Object g3 = tn1Var.g(ji2Var4);
                                                    if (g3 == null) {
                                                        g3 = null;
                                                    }
                                                    List list3 = (List) g3;
                                                    yd ydVar2 = list3 != null ? (yd) zv.v(list3) : null;
                                                    if (!Intrinsics.b(ydVar, ydVar2)) {
                                                        j(i8, String.valueOf(ydVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    q31Var2 = q31Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            q31Var2 = q31Var;
            iArr3 = iArr;
        }
    }

    public final void d(ai2 ai2Var, Function2 function2) {
        ai2Var.getClass();
        List j = ai2.j(4, ai2Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (e().a(((ai2) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final q31 e() {
        if (this.s) {
            this.s = false;
            this.v = s03.r(this.m.getSemanticsOwner());
            this.w = System.currentTimeMillis();
        }
        return this.v;
    }

    @Override // defpackage.l80
    public final void f(id1 id1Var) {
        this.o = (d20) this.n.invoke();
        k(-1, this.m.getSemanticsOwner().a());
        h();
    }

    public final boolean g() {
        return this.o != null;
    }

    public final void h() {
        d20 d20Var = this.o;
        if (d20Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.p;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b20 b20Var = (b20) arrayList.get(i);
                int ordinal = b20Var.c.ordinal();
                if (ordinal == 0) {
                    ot2 ot2Var = b20Var.d;
                    if (ot2Var != null) {
                        d20Var.d((ViewStructure) ot2Var.n);
                    }
                } else if (ordinal != 1) {
                    a.b();
                    return;
                } else {
                    AutofillId b = d20Var.b(b20Var.a);
                    if (b != null) {
                        d20Var.e(b);
                    }
                }
            }
            d20Var.a();
            arrayList.clear();
        }
    }

    public final void i(ai2 ai2Var, bi2 bi2Var) {
        d(ai2Var, new n8(1, bi2Var, this));
        List j = ai2.j(4, ai2Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ai2 ai2Var2 = (ai2) j.get(i);
            q31 e = e();
            int i2 = ai2Var2.g;
            if (e.a(i2)) {
                zm1 zm1Var = this.x;
                if (zm1Var.a(i2)) {
                    Object b = zm1Var.b(i2);
                    if (b == null) {
                        throw q40.f("node not present in pruned tree before this change");
                    }
                    i(ai2Var2, (bi2) b);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i, String str) {
        d20 d20Var;
        if (Build.VERSION.SDK_INT >= 29 && (d20Var = this.o) != null) {
            AutofillId b = d20Var.b(i);
            if (b == null) {
                throw q40.f("Invalid content capture ID");
            }
            d20Var.f(b, str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v22 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r1v22 android.view.autofill.AutofillId) from 0x0092: IF  (r1v22 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0070 A[HIDDEN] (LINE:147)
          (r1v22 android.view.autofill.AutofillId) from 0x0099: PHI (r1v11 android.view.autofill.AutofillId) = (r1v10 android.view.autofill.AutofillId), (r1v22 android.view.autofill.AutofillId) binds: [B:92:0x0095, B:34:0x0092] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int r14, defpackage.ai2 r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8.k(int, ai2):void");
    }

    public final void l(ai2 ai2Var) {
        if (g()) {
            this.p.add(new b20(ai2Var.g, this.w, c20.n, null));
            List j = ai2.j(4, ai2Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                l((ai2) j.get(i));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.u.removeCallbacks(this.A);
        this.o = null;
    }

    public final void p() {
        zm1 zm1Var = this.x;
        zm1Var.c();
        q31 e = e();
        int[] iArr = e.b;
        Object[] objArr = e.c;
        long[] jArr = e.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            zm1Var.h(iArr[i4], new bi2(((di2) objArr[i4]).a, e()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
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
        this.y = new bi2(this.m.getSemanticsOwner().a(), e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
