package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o2 implements uw, View.OnAttachStateChangeListener {
    public static final j2 Companion = new j2();
    public long BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public final g1 OPXfSBeufaJ8;
    public e32 RfyTYNmI9Srp;
    public final BRwzKIf41E4i S9EYkSpbGuxq;
    public final c81 XL4ISE6Oc65B;
    public c81 gPXPFXrUH4XX;
    public final r1 rtx2ld2ELZv4;
    public op0 wdg6QnbFHrFF;
    public final ArrayList dgRBjINgWbAK = new ArrayList();
    public final long x50lh2ztY7Y5 = 100;
    public k2 cpQdD2nAriOS = k2.rtx2ld2ELZv4;
    public boolean r3s1LDPKFs1S = true;
    public final eg QrzZRwfaDlRX = mm2.PxuCJdSBwIXG(1, 6, null);

    public o2(r1 r1Var, g1 g1Var) {
        this.rtx2ld2ELZv4 = r1Var;
        this.OPXfSBeufaJ8 = g1Var;
        new Handler(Looper.getMainLooper());
        c81 c81Var = uq0.PxuCJdSBwIXG;
        c81Var.getClass();
        this.gPXPFXrUH4XX = c81Var;
        this.XL4ISE6Oc65B = new c81();
        this.RfyTYNmI9Srp = new e32(r1Var.getSemanticsOwner().PxuCJdSBwIXG(), c81Var);
        this.S9EYkSpbGuxq = new BRwzKIf41E4i(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(r7.x50lh2ztY7Y5, r0) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(ct ctVar) {
        m2 m2Var;
        int i;
        bg bgVar;
        if (ctVar instanceof m2) {
            m2Var = (m2) ctVar;
            int i2 = m2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = m2Var.x50lh2ztY7Y5;
                i = m2Var.r3s1LDPKFs1S;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    eg egVar = this.QrzZRwfaDlRX;
                    egVar.getClass();
                    bgVar = new bg(egVar);
                } else if (i == 1) {
                    bgVar = m2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return no2.PxuCJdSBwIXG;
                    }
                    bgVar.TSizfFm2Yiuu();
                    if (e9gEMXR7LXtO()) {
                        RAsUl2FVSrh6();
                    }
                    Handler handler = this.rtx2ld2ELZv4.getHandler();
                    if (!this.EcgxDIVH5in8 && handler != null) {
                        this.EcgxDIVH5in8 = true;
                        handler.post(this.S9EYkSpbGuxq);
                    }
                    m2Var.dgRBjINgWbAK = bgVar;
                    m2Var.r3s1LDPKFs1S = 2;
                } else {
                    if (i != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bgVar = m2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                }
                m2Var.dgRBjINgWbAK = bgVar;
                m2Var.r3s1LDPKFs1S = 1;
                obj = bgVar.lS5Rgt96tfkO(m2Var);
            }
        }
        m2Var = new m2(this, ctVar);
        Object obj2 = m2Var.x50lh2ztY7Y5;
        i = m2Var.r3s1LDPKFs1S;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        m2Var.dgRBjINgWbAK = bgVar;
        m2Var.r3s1LDPKFs1S = 1;
        obj2 = bgVar.lS5Rgt96tfkO(m2Var);
    }

    public final void RAsUl2FVSrh6() {
        op0 op0Var = this.wdg6QnbFHrFF;
        if (op0Var == null) {
            return;
        }
        Object obj = op0Var.wdg6QnbFHrFF;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.dgRBjINgWbAK;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ur urVar = (ur) arrayList.get(i);
            int ordinal = urVar.TSizfFm2Yiuu.ordinal();
            if (ordinal == 0) {
                b42 b42Var = urVar.Y1f8riQaR6yg;
                if (b42Var != null) {
                    ViewStructure viewStructure = (ViewStructure) b42Var.OPXfSBeufaJ8;
                    if (Build.VERSION.SDK_INT >= 29) {
                        yr.Y1f8riQaR6yg(s0.e9gEMXR7LXtO(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    u9.gPXPFXrUH4XX();
                    return;
                }
                AutofillId RfyTYNmI9Srp = op0Var.RfyTYNmI9Srp(urVar.PxuCJdSBwIXG);
                if (RfyTYNmI9Srp != null && Build.VERSION.SDK_INT >= 29) {
                    yr.e9gEMXR7LXtO(s0.e9gEMXR7LXtO(obj), RfyTYNmI9Srp);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession e9gEMXR7LXtO = s0.e9gEMXR7LXtO(obj);
            HqMwxkFaipxD RfyTYNmI9Srp2 = ng0.RfyTYNmI9Srp((View) op0Var.OPXfSBeufaJ8);
            Objects.requireNonNull(RfyTYNmI9Srp2);
            yr.RAsUl2FVSrh6(e9gEMXR7LXtO, Nlhe969cAGO8.e9gEMXR7LXtO(RfyTYNmI9Srp2.PxuCJdSBwIXG), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void TSizfFm2Yiuu(tq0 tq0Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        tq0 tq0Var2 = tq0Var;
        int[] iArr3 = tq0Var2.lS5Rgt96tfkO;
        long[] jArr = tq0Var2.PxuCJdSBwIXG;
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
                        e32 e32Var = (e32) this.XL4ISE6Oc65B.lS5Rgt96tfkO(i7);
                        f32 f32Var = (f32) tq0Var2.lS5Rgt96tfkO(i7);
                        d32 d32Var = f32Var != null ? f32Var.PxuCJdSBwIXG : null;
                        if (d32Var == null) {
                            throw o0.a92UlCVFR9N8("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = d32Var.a92UlCVFR9N8;
                        v81 v81Var = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4;
                        if (e32Var == null) {
                            Object[] objArr = v81Var.lS5Rgt96tfkO;
                            long[] jArr2 = v81Var.PxuCJdSBwIXG;
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
                                                k32 k32Var = (k32) objArr[(i10 << 3) + i12];
                                                k32 k32Var2 = h32.aF05bpZJlKEP;
                                                if (cs0.wdg6QnbFHrFF(k32Var, k32Var2)) {
                                                    Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(k32Var2);
                                                    if (RAsUl2FVSrh6 == null) {
                                                        RAsUl2FVSrh6 = null;
                                                    }
                                                    List list = (List) RAsUl2FVSrh6;
                                                    wdg6QnbFHrFF(String.valueOf(list != null ? (v8) zk.FT2GK7JK5Ma2(list) : null), i8);
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
                            Object[] objArr2 = v81Var.lS5Rgt96tfkO;
                            long[] jArr3 = v81Var.PxuCJdSBwIXG;
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
                                                k32 k32Var3 = (k32) objArr2[(i13 << 3) + i15];
                                                k32 k32Var4 = h32.aF05bpZJlKEP;
                                                if (cs0.wdg6QnbFHrFF(k32Var3, k32Var4)) {
                                                    Object RAsUl2FVSrh62 = e32Var.PxuCJdSBwIXG.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var4);
                                                    if (RAsUl2FVSrh62 == null) {
                                                        RAsUl2FVSrh62 = null;
                                                    }
                                                    List list2 = (List) RAsUl2FVSrh62;
                                                    v8 v8Var = list2 != null ? (v8) zk.FT2GK7JK5Ma2(list2) : null;
                                                    Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(k32Var4);
                                                    if (RAsUl2FVSrh63 == null) {
                                                        RAsUl2FVSrh63 = null;
                                                    }
                                                    List list3 = (List) RAsUl2FVSrh63;
                                                    v8 v8Var2 = list3 != null ? (v8) zk.FT2GK7JK5Ma2(list3) : null;
                                                    if (!cs0.wdg6QnbFHrFF(v8Var, v8Var2)) {
                                                        wdg6QnbFHrFF(String.valueOf(v8Var2), i8);
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
                    tq0Var2 = tq0Var;
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
            tq0Var2 = tq0Var;
            iArr3 = iArr;
        }
    }

    public final tq0 Y1f8riQaR6yg() {
        if (this.r3s1LDPKFs1S) {
            this.r3s1LDPKFs1S = false;
            this.gPXPFXrUH4XX = bs0.RfyTYNmI9Srp(this.rtx2ld2ELZv4.getSemanticsOwner(), k1.cpQdD2nAriOS);
            this.BRwzKIf41E4i = System.currentTimeMillis();
        }
        return this.gPXPFXrUH4XX;
    }

    @Override // defpackage.uw
    public final void a92UlCVFR9N8(o01 o01Var) {
        this.wdg6QnbFHrFF = (op0) this.OPXfSBeufaJ8.PxuCJdSBwIXG();
        dgRBjINgWbAK(-1, this.rtx2ld2ELZv4.getSemanticsOwner().PxuCJdSBwIXG());
        RAsUl2FVSrh6();
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dgRBjINgWbAK(int r19, defpackage.d32 r20) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2.dgRBjINgWbAK(int, d32):void");
    }

    public final boolean e9gEMXR7LXtO() {
        xr.Companion.getClass();
        return this.wdg6QnbFHrFF != null;
    }

    @Override // defpackage.uw
    public final void lS5Rgt96tfkO(o01 o01Var) {
        x50lh2ztY7Y5(this.rtx2ld2ELZv4.getSemanticsOwner().PxuCJdSBwIXG());
        RAsUl2FVSrh6();
        this.wdg6QnbFHrFF = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.rtx2ld2ELZv4.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.S9EYkSpbGuxq);
        this.wdg6QnbFHrFF = null;
    }

    public final void r3s1LDPKFs1S() {
        c81 c81Var = this.XL4ISE6Oc65B;
        c81Var.TSizfFm2Yiuu();
        tq0 Y1f8riQaR6yg = Y1f8riQaR6yg();
        int[] iArr = Y1f8riQaR6yg.lS5Rgt96tfkO;
        Object[] objArr = Y1f8riQaR6yg.TSizfFm2Yiuu;
        long[] jArr = Y1f8riQaR6yg.PxuCJdSBwIXG;
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
                            c81Var.rtx2ld2ELZv4(iArr[i4], new e32(((f32) objArr[i4]).PxuCJdSBwIXG, Y1f8riQaR6yg()));
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
        this.RfyTYNmI9Srp = new e32(this.rtx2ld2ELZv4.getSemanticsOwner().PxuCJdSBwIXG(), Y1f8riQaR6yg());
    }

    public final void rtx2ld2ELZv4(d32 d32Var, e32 e32Var) {
        int i = 0;
        n2 n2Var = new n2(i, e32Var, this);
        d32Var.getClass();
        List wdg6QnbFHrFF = d32.wdg6QnbFHrFF(4, d32Var);
        int size = wdg6QnbFHrFF.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = wdg6QnbFHrFF.get(i3);
            if (Y1f8riQaR6yg().PxuCJdSBwIXG(((d32) obj).a92UlCVFR9N8)) {
                n2Var.rtx2ld2ELZv4(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, d32Var);
        int size2 = wdg6QnbFHrFF2.size();
        while (i < size2) {
            d32 d32Var2 = (d32) wdg6QnbFHrFF2.get(i);
            tq0 Y1f8riQaR6yg = Y1f8riQaR6yg();
            int i4 = d32Var2.a92UlCVFR9N8;
            if (Y1f8riQaR6yg.PxuCJdSBwIXG(i4)) {
                c81 c81Var = this.XL4ISE6Oc65B;
                if (c81Var.PxuCJdSBwIXG(i4)) {
                    Object lS5Rgt96tfkO = c81Var.lS5Rgt96tfkO(i4);
                    if (lS5Rgt96tfkO == null) {
                        throw o0.a92UlCVFR9N8("node not present in pruned tree before this change");
                    }
                    rtx2ld2ELZv4(d32Var2, (e32) lS5Rgt96tfkO);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void wdg6QnbFHrFF(String str, int i) {
        op0 op0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (op0Var = this.wdg6QnbFHrFF) != null) {
            AutofillId RfyTYNmI9Srp = op0Var.RfyTYNmI9Srp(i);
            if (RfyTYNmI9Srp == null) {
                throw o0.a92UlCVFR9N8("Invalid content capture ID");
            }
            if (i2 >= 29) {
                yr.a92UlCVFR9N8(s0.e9gEMXR7LXtO(op0Var.wdg6QnbFHrFF), RfyTYNmI9Srp, str);
            }
        }
    }

    public final void x50lh2ztY7Y5(d32 d32Var) {
        if (e9gEMXR7LXtO()) {
            this.dgRBjINgWbAK.add(new ur(d32Var.a92UlCVFR9N8, this.BRwzKIf41E4i, vr.OPXfSBeufaJ8, null));
            List wdg6QnbFHrFF = d32.wdg6QnbFHrFF(4, d32Var);
            int size = wdg6QnbFHrFF.size();
            for (int i = 0; i < size; i++) {
                x50lh2ztY7Y5((d32) wdg6QnbFHrFF.get(i));
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
