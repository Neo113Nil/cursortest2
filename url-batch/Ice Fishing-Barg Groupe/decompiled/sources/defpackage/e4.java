package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import com.ice.fishing.grenza.data.db.AppDatabase_Impl;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e4 extends jc2 implements pe0 {
    public final /* synthetic */ Object BRwzKIf41E4i;
    public Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public Object gPXPFXrUH4XX;
    public Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(eo1 eo1Var, qe0 qe0Var, le0 le0Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 12;
        this.gPXPFXrUH4XX = eo1Var;
        this.BRwzKIf41E4i = qe0Var;
        this.QrzZRwfaDlRX = le0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ab, code lost:
    
        if (r3 == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0299, code lost:
    
        if (r2 == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04b1, code lost:
    
        if (r0 == r15) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04ea, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04e7, code lost:
    
        if (defpackage.ki0.cpQdD2nAriOS(r1, 0.0f, r2, r6, r26, 4) == r15) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0556, code lost:
    
        if (defpackage.ki0.BjEWd04qc7Mw(e9gEMXR7LXtO()).PxuCJdSBwIXG(r26, r8) == r0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0580, code lost:
    
        if (defpackage.hq0.S2OOm9zPNm0h(r1, r2, r26) == r0) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05ea, code lost:
    
        if (r10.PxuCJdSBwIXG(r11, r26) == r15) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x05c8, code lost:
    
        if (r10.PxuCJdSBwIXG(r11, r26) == r15) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x05e0, code lost:
    
        if (defpackage.hq0.S2OOm9zPNm0h(r2, r5, r26) == r15) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0653, code lost:
    
        if (r1 == r15) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0116, code lost:
    
        if (r10 == r0) goto L65;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:43:0x0157, B:45:0x015b, B:47:0x0169, B:49:0x016f, B:53:0x0174, B:55:0x0178), top: B:42:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Type inference failed for: r2v102, types: [o01] */
    /* JADX WARN: Type inference failed for: r2v103, types: [o01] */
    /* JADX WARN: Type inference failed for: r2v105, types: [s01] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x01f4 -> B:101:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x055e -> B:272:0x0528). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x0580 -> B:272:0x0528). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        Object PxuCJdSBwIXG;
        ru ruVar;
        wt1 wt1Var;
        cn1 cn1Var;
        p91 p91Var;
        Object nxJAScVArhE9;
        boolean isDestroyed;
        p91 p91Var2;
        Throwable th;
        p91 p91Var3;
        rtx2ld2ELZv4 rtx2ld2elzv4;
        p91 p91Var4;
        Object OYiFbU3x63rc;
        bt btVar;
        l42 l42Var;
        Object rtx2ld2ELZv4;
        ru ruVar2;
        nk2 nk2Var;
        Object obj2;
        ru ruVar3;
        l12 l12Var;
        w80 w80Var;
        long j;
        boolean z;
        Object wLFCmsViZrNT;
        w80 w80Var2;
        ue1 ue1Var;
        ReentrantLock reentrantLock;
        int length;
        boolean z2;
        int i = 3;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        bt btVar2 = null;
        switch (this.x50lh2ztY7Y5) {
            case 0:
                su suVar = su.rtx2ld2ELZv4;
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    d4 d4Var = new d4((a5) this.r3s1LDPKFs1S, (le0) this.QrzZRwfaDlRX, (f4) this.gPXPFXrUH4XX, (tz0) this.BRwzKIf41E4i, null, 0);
                    this.cpQdD2nAriOS = 1;
                    if (cs0.XL4ISE6Oc65B(d4Var, this) == suVar) {
                        return suVar;
                    }
                } else {
                    if (i5 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                u9.Y1f8riQaR6yg();
                return null;
            case 1:
                g7 g7Var = (g7) this.QrzZRwfaDlRX;
                su suVar2 = su.rtx2ld2ELZv4;
                int i6 = this.cpQdD2nAriOS;
                if (i6 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (!cs0.wdg6QnbFHrFF(this.r3s1LDPKFs1S, g7Var.e9gEMXR7LXtO.getValue())) {
                        g7 g7Var2 = (g7) this.QrzZRwfaDlRX;
                        Object obj3 = this.r3s1LDPKFs1S;
                        d91 d91Var = (d91) this.gPXPFXrUH4XX;
                        int i7 = i7.PxuCJdSBwIXG;
                        i8 i8Var = (i8) d91Var.getValue();
                        this.cpQdD2nAriOS = 1;
                        if (g7.TSizfFm2Yiuu(g7Var2, obj3, i8Var, null, this, 12) == suVar2) {
                            return suVar2;
                        }
                    }
                    return no2.PxuCJdSBwIXG;
                }
                if (i6 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                d91 d91Var2 = (d91) this.BRwzKIf41E4i;
                int i8 = i7.PxuCJdSBwIXG;
                le0 le0Var = (le0) d91Var2.getValue();
                if (le0Var != null) {
                    le0Var.OPXfSBeufaJ8(g7Var.Y1f8riQaR6yg());
                }
                return no2.PxuCJdSBwIXG;
            case 2:
                su suVar3 = su.rtx2ld2ELZv4;
                int i9 = this.cpQdD2nAriOS;
                if (i9 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    qo qoVar = (qo) this.r3s1LDPKFs1S;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.QrzZRwfaDlRX;
                    Rect rect = (Rect) this.gPXPFXrUH4XX;
                    dr0 dr0Var = new dr0(rect.left, rect.top, rect.right, rect.bottom);
                    this.cpQdD2nAriOS = 1;
                    PxuCJdSBwIXG = qo.PxuCJdSBwIXG(qoVar, scrollCaptureSession, dr0Var, this);
                    if (PxuCJdSBwIXG == suVar3) {
                        return suVar3;
                    }
                } else {
                    if (i9 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                    PxuCJdSBwIXG = obj;
                }
                ((Consumer) this.BRwzKIf41E4i).accept(vi0.IXK6ba3ucyzm((dr0) PxuCJdSBwIXG));
                return no2.PxuCJdSBwIXG;
            case 3:
                l92 l92Var = (l92) this.gPXPFXrUH4XX;
                su suVar4 = su.rtx2ld2ELZv4;
                int i10 = this.cpQdD2nAriOS;
                if (i10 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    int ordinal = ((j52) this.r3s1LDPKFs1S).ordinal();
                    if (ordinal == 0) {
                        v80 v80Var = (v80) this.QrzZRwfaDlRX;
                        this.cpQdD2nAriOS = 1;
                        if (v80Var.PxuCJdSBwIXG(l92Var, this) == suVar4) {
                            return suVar4;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            u9.gPXPFXrUH4XX();
                            return null;
                        }
                        Float f = (Float) this.BRwzKIf41E4i;
                        if (f == b51.cpQdD2nAriOS) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        l92Var.OPXfSBeufaJ8(null, f);
                    }
                } else {
                    if (i10 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2.PxuCJdSBwIXG;
            case 4:
                no2 no2Var = no2.PxuCJdSBwIXG;
                v80 v80Var2 = (v80) this.QrzZRwfaDlRX;
                h92 h92Var = (h92) this.r3s1LDPKFs1S;
                l92 l92Var2 = (l92) this.gPXPFXrUH4XX;
                su suVar5 = su.rtx2ld2ELZv4;
                int i11 = this.cpQdD2nAriOS;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            ng0.tmVwIGCQF4zR(obj);
                            this.cpQdD2nAriOS = 3;
                            break;
                        } else if (i11 != 3 && i11 != 4) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ng0.tmVwIGCQF4zR(obj);
                    return no2Var;
                }
                ng0.tmVwIGCQF4zR(obj);
                l52.Companion.getClass();
                if (h92Var == k52.lS5Rgt96tfkO) {
                    this.cpQdD2nAriOS = 1;
                    break;
                } else {
                    bt btVar3 = null;
                    if (h92Var == k52.TSizfFm2Yiuu) {
                        kb2 RAsUl2FVSrh6 = l92Var2.RAsUl2FVSrh6();
                        m90 m90Var = new m90(2, null);
                        this.cpQdD2nAriOS = 2;
                        break;
                    } else {
                        kb2 RAsUl2FVSrh62 = l92Var2.RAsUl2FVSrh6();
                        g92 g92Var = new g92(h92Var, null);
                        int i12 = i90.PxuCJdSBwIXG;
                        n50 n50Var = n50.rtx2ld2ELZv4;
                        ag agVar = ag.rtx2ld2ELZv4;
                        v80 VhhvGxCb8gfr = hq0.VhhvGxCb8gfr(hq0.VhhvGxCb8gfr(new f90(new cj(g92Var, RAsUl2FVSrh62, n50Var, -2, agVar), new et1(i3, btVar3, i4))));
                        e4 e4Var = new e4(v80Var2, l92Var2, (Float) this.BRwzKIf41E4i, btVar3, 3);
                        this.cpQdD2nAriOS = 4;
                        Object PxuCJdSBwIXG2 = hq0.QrzZRwfaDlRX(new cj(new h90(e4Var, btVar3, i2), VhhvGxCb8gfr, n50Var, -2, agVar), 0).PxuCJdSBwIXG(ae1.rtx2ld2ELZv4, this);
                        if (PxuCJdSBwIXG2 != suVar5) {
                            PxuCJdSBwIXG2 = no2Var;
                        }
                        if (PxuCJdSBwIXG2 != suVar5) {
                            PxuCJdSBwIXG2 = no2Var;
                            break;
                        }
                    }
                }
                return suVar5;
            case 5:
                su suVar6 = su.rtx2ld2ELZv4;
                int i13 = this.cpQdD2nAriOS;
                if (i13 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    ru ruVar4 = (ru) this.r3s1LDPKFs1S;
                    wt1 wt1Var2 = new wt1();
                    wt1Var2.rtx2ld2ELZv4 = 1.0f;
                    ruVar = ruVar4;
                    wt1Var = wt1Var2;
                } else if (i13 == 1) {
                    wt1 wt1Var3 = (wt1) this.QrzZRwfaDlRX;
                    ru ruVar5 = (ru) this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    wt1Var = wt1Var3;
                    ruVar = ruVar5;
                    if (wt1Var.rtx2ld2ELZv4 == 0.0f) {
                        ny1 ny1Var = new ny1(new d4(new o5(14, ruVar), null));
                        uo0 uo0Var = new uo0(2, null);
                        this.r3s1LDPKFs1S = ruVar;
                        this.QrzZRwfaDlRX = wt1Var;
                        this.cpQdD2nAriOS = 2;
                        break;
                    }
                } else {
                    if (i13 != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wt1 wt1Var4 = (wt1) this.QrzZRwfaDlRX;
                    ru ruVar6 = (ru) this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    wt1Var = wt1Var4;
                    ruVar = ruVar6;
                }
                d7 d7Var = new d7((d91) this.gPXPFXrUH4XX, (vo0) this.BRwzKIf41E4i, wt1Var, ruVar, 3);
                this.r3s1LDPKFs1S = ruVar;
                this.QrzZRwfaDlRX = wt1Var;
                this.cpQdD2nAriOS = 1;
                if (e9gEMXR7LXtO().S2OOm9zPNm0h(jx1.gPXPFXrUH4XX) != null) {
                    u9.VhhvGxCb8gfr();
                    return null;
                }
                break;
            case 6:
                no2 no2Var2 = no2.PxuCJdSBwIXG;
                x91 x91Var = (x91) this.gPXPFXrUH4XX;
                x12 x12Var = (x12) this.QrzZRwfaDlRX;
                su suVar7 = su.rtx2ld2ELZv4;
                int i14 = this.cpQdD2nAriOS;
                if (i14 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    ru ruVar7 = (ru) this.r3s1LDPKFs1S;
                    mj1 mj1Var = x12Var.TSizfFm2Yiuu;
                    fj1 fj1Var = x12Var.OPXfSBeufaJ8;
                    bt btVar4 = null;
                    if (cs0.wdg6QnbFHrFF(mj1Var.getValue(), x91Var)) {
                        long longValue = ((Number) ((gl2) this.BRwzKIf41E4i).x50lh2ztY7Y5.getValue()).longValue() / 1000000;
                        float rtx2ld2ELZv42 = fj1Var.rtx2ld2ELZv4();
                        km2 qudtW7lwm99e = b51.qudtW7lwm99e((int) (fj1Var.rtx2ld2ELZv4() * longValue), 6, null);
                        n6 n6Var = new n6(ruVar7, x12Var, x91Var, 6);
                        this.cpQdD2nAriOS = 2;
                        break;
                    } else {
                        this.cpQdD2nAriOS = 1;
                        gl2 gl2Var = x12Var.e9gEMXR7LXtO;
                        if (gl2Var == null || (r0 = o91.PxuCJdSBwIXG(x12Var.x50lh2ztY7Y5, new r12(gl2Var, x12Var, x91Var, btVar4, 0), this)) != suVar7) {
                            Object obj4 = no2Var2;
                            break;
                        }
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2Var2;
            case 7:
                su suVar8 = su.rtx2ld2ELZv4;
                int i15 = this.cpQdD2nAriOS;
                try {
                    if (i15 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        cn1Var = (cn1) this.gPXPFXrUH4XX;
                        p91Var = cn1Var.e9gEMXR7LXtO;
                        this.r3s1LDPKFs1S = p91Var;
                        this.QrzZRwfaDlRX = cn1Var;
                        this.cpQdD2nAriOS = 1;
                        if (p91Var.a92UlCVFR9N8(this) == suVar8) {
                            return suVar8;
                        }
                    } else {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 == 3) {
                                    ng0.tmVwIGCQF4zR(obj);
                                    return obj;
                                }
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p91Var2 = (p91) this.r3s1LDPKFs1S;
                            try {
                                ng0.tmVwIGCQF4zR(obj);
                                p91Var = p91Var2;
                                nxJAScVArhE9 = obj;
                                r6 = hi.dgRBjINgWbAK(nxJAScVArhE9);
                                p91Var.lS5Rgt96tfkO(null);
                                a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(r6, (pe0) this.BRwzKIf41E4i, btVar2, 24);
                                this.r3s1LDPKFs1S = null;
                                this.QrzZRwfaDlRX = null;
                                this.cpQdD2nAriOS = 3;
                                Object nxJAScVArhE92 = kj0.nxJAScVArhE9(200L, a92ulcvfr9n8, this);
                                return nxJAScVArhE92 == suVar8 ? suVar8 : nxJAScVArhE92;
                            } catch (Throwable th2) {
                                th = th2;
                                p91Var2.lS5Rgt96tfkO(null);
                                throw th;
                            }
                        }
                        cn1Var = (cn1) this.QrzZRwfaDlRX;
                        p91Var = (p91) this.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    TextClassifier textClassifier = cn1Var.a92UlCVFR9N8;
                    if (textClassifier != null) {
                        isDestroyed = textClassifier.isDestroyed();
                        if (isDestroyed) {
                        }
                        p91Var.lS5Rgt96tfkO(null);
                        a92UlCVFR9N8 a92ulcvfr9n82 = new a92UlCVFR9N8(textClassifier, (pe0) this.BRwzKIf41E4i, btVar2, 24);
                        this.r3s1LDPKFs1S = null;
                        this.QrzZRwfaDlRX = null;
                        this.cpQdD2nAriOS = 3;
                        Object nxJAScVArhE922 = kj0.nxJAScVArhE9(200L, a92ulcvfr9n82, this);
                        if (nxJAScVArhE922 == suVar8) {
                        }
                    }
                    km0 km0Var = new km0(cn1Var, btVar2, i);
                    this.r3s1LDPKFs1S = p91Var;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = 2;
                    nxJAScVArhE9 = kj0.nxJAScVArhE9(300L, km0Var, this);
                    if (nxJAScVArhE9 == suVar8) {
                        return suVar8;
                    }
                    textClassifier = hi.dgRBjINgWbAK(nxJAScVArhE9);
                    p91Var.lS5Rgt96tfkO(null);
                    a92UlCVFR9N8 a92ulcvfr9n822 = new a92UlCVFR9N8(textClassifier, (pe0) this.BRwzKIf41E4i, btVar2, 24);
                    this.r3s1LDPKFs1S = null;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = 3;
                    Object nxJAScVArhE9222 = kj0.nxJAScVArhE9(200L, a92ulcvfr9n822, this);
                    if (nxJAScVArhE9222 == suVar8) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    p91Var2 = p91Var;
                    p91Var2.lS5Rgt96tfkO(null);
                    throw th;
                }
            case 8:
                su suVar9 = su.rtx2ld2ELZv4;
                int i16 = this.cpQdD2nAriOS;
                try {
                    if (i16 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        r91 r91Var = (r91) this.gPXPFXrUH4XX;
                        rtx2ld2ELZv4 rtx2ld2elzv42 = (rtx2ld2ELZv4) this.BRwzKIf41E4i;
                        this.r3s1LDPKFs1S = r91Var;
                        this.QrzZRwfaDlRX = rtx2ld2elzv42;
                        this.cpQdD2nAriOS = 1;
                        if (r91Var.a92UlCVFR9N8(this) != suVar9) {
                            p91Var3 = r91Var;
                            rtx2ld2elzv4 = rtx2ld2elzv42;
                        }
                        return suVar9;
                    }
                    if (i16 != 1) {
                        if (i16 != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p91Var4 = (p91) this.r3s1LDPKFs1S;
                        try {
                            ng0.tmVwIGCQF4zR(obj);
                            p91Var4.lS5Rgt96tfkO(null);
                            return no2.PxuCJdSBwIXG;
                        } catch (Throwable th4) {
                            th = th4;
                            p91Var4.lS5Rgt96tfkO(null);
                            throw th;
                        }
                    }
                    rtx2ld2elzv4 = (rtx2ld2ELZv4) this.QrzZRwfaDlRX;
                    p91Var3 = (p91) this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    a92UlCVFR9N8 a92ulcvfr9n83 = new a92UlCVFR9N8(rtx2ld2elzv4, btVar2, 25);
                    this.r3s1LDPKFs1S = p91Var3;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = 2;
                    if (cs0.XL4ISE6Oc65B(a92ulcvfr9n83, this) != suVar9) {
                        p91Var4 = p91Var3;
                        p91Var4.lS5Rgt96tfkO(null);
                        return no2.PxuCJdSBwIXG;
                    }
                    return suVar9;
                } catch (Throwable th5) {
                    th = th5;
                    p91Var4 = p91Var3;
                    p91Var4.lS5Rgt96tfkO(null);
                    throw th;
                }
            case 9:
                su suVar10 = su.rtx2ld2ELZv4;
                int i17 = this.cpQdD2nAriOS;
                if (i17 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    ru ruVar8 = (ru) this.r3s1LDPKFs1S;
                    yw ywVar = j00.PxuCJdSBwIXG;
                    pi0 pi0Var = h41.PxuCJdSBwIXG.cpQdD2nAriOS;
                    h7 h7Var = new h7((s01) this.QrzZRwfaDlRX, (f01) this.gPXPFXrUH4XX, ruVar8, (rtx2ld2ELZv4) this.BRwzKIf41E4i, null, 3);
                    this.cpQdD2nAriOS = 1;
                    if (fx1.OYiFbU3x63rc(pi0Var, h7Var, this) == suVar10) {
                        return suVar10;
                    }
                } else {
                    if (i17 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2.PxuCJdSBwIXG;
            case 10:
                su suVar11 = su.rtx2ld2ELZv4;
                int i18 = this.cpQdD2nAriOS;
                if (i18 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    fu S2OOm9zPNm0h = ((ru) this.r3s1LDPKFs1S).cpQdD2nAriOS().S2OOm9zPNm0h(ih0.x50lh2ztY7Y5);
                    S2OOm9zPNm0h.getClass();
                    ju juVar = (ju) S2OOm9zPNm0h;
                    ex1 ex1Var = (ex1) this.QrzZRwfaDlRX;
                    hu xfACYKDMU6Dj = f2.xfACYKDMU6Dj(juVar, new qk2(juVar));
                    hu RfyTYNmI9Srp = xfACYKDMU6Dj.RfyTYNmI9Srp(new mj2(xfACYKDMU6Dj, ex1Var.rtx2ld2ELZv4));
                    bi biVar = (bi) this.gPXPFXrUH4XX;
                    a92UlCVFR9N8 a92ulcvfr9n84 = (a92UlCVFR9N8) this.BRwzKIf41E4i;
                    this.r3s1LDPKFs1S = biVar;
                    this.cpQdD2nAriOS = 1;
                    OYiFbU3x63rc = fx1.OYiFbU3x63rc(RfyTYNmI9Srp, a92ulcvfr9n84, this);
                    if (OYiFbU3x63rc == suVar11) {
                        return suVar11;
                    }
                    btVar = biVar;
                } else {
                    if (i18 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    btVar = (bt) this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    OYiFbU3x63rc = obj;
                }
                btVar.RAsUl2FVSrh6(OYiFbU3x63rc);
                return no2.PxuCJdSBwIXG;
            case 11:
                AtomicReference atomicReference = (AtomicReference) this.gPXPFXrUH4XX;
                su suVar12 = su.rtx2ld2ELZv4;
                ?? r2 = this.cpQdD2nAriOS;
                try {
                    if (r2 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        ru ruVar9 = (ru) this.r3s1LDPKFs1S;
                        l42 l42Var2 = new l42(ki0.rZjpSjn4zoMv(ruVar9.cpQdD2nAriOS()), ((le0) this.QrzZRwfaDlRX).OPXfSBeufaJ8(ruVar9));
                        l42 l42Var3 = (l42) atomicReference.getAndSet(l42Var2);
                        if (l42Var3 != null) {
                            xs0 xs0Var = l42Var3.PxuCJdSBwIXG;
                            this.r3s1LDPKFs1S = l42Var2;
                            this.cpQdD2nAriOS = 1;
                            xs0Var.a92UlCVFR9N8(null);
                            Object nLZGh9p8gVSu = xs0Var.nLZGh9p8gVSu(this);
                            if (nLZGh9p8gVSu != suVar12) {
                                nLZGh9p8gVSu = no2.PxuCJdSBwIXG;
                                break;
                            }
                        }
                        l42Var = l42Var2;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l42 l42Var4 = (l42) this.r3s1LDPKFs1S;
                            ng0.tmVwIGCQF4zR(obj);
                            rtx2ld2ELZv4 = obj;
                            r2 = l42Var4;
                            Object obj5 = r2;
                            while (!atomicReference.compareAndSet(obj5, null) && atomicReference.get() == obj5) {
                            }
                            return rtx2ld2ELZv4;
                        }
                        l42 l42Var5 = (l42) this.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                        l42Var = l42Var5;
                    }
                    pe0 pe0Var = (pe0) this.BRwzKIf41E4i;
                    Object obj6 = l42Var.lS5Rgt96tfkO;
                    this.r3s1LDPKFs1S = l42Var;
                    this.cpQdD2nAriOS = 2;
                    rtx2ld2ELZv4 = pe0Var.rtx2ld2ELZv4(obj6, this);
                    r2 = l42Var;
                    break;
                } catch (Throwable th6) {
                    while (!atomicReference.compareAndSet(r2, null) && atomicReference.get() == r2) {
                    }
                    throw th6;
                }
                break;
            case 12:
                eo1 eo1Var = (eo1) this.gPXPFXrUH4XX;
                su suVar13 = su.rtx2ld2ELZv4;
                int i19 = this.cpQdD2nAriOS;
                if (i19 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    md2 md2Var = new md2((ru) this.r3s1LDPKFs1S, new up1(eo1Var), (qe0) this.BRwzKIf41E4i, (le0) this.QrzZRwfaDlRX, null);
                    this.cpQdD2nAriOS = 1;
                    if (b51.ryVscX7ZL4Ux(eo1Var, md2Var, this) == suVar13) {
                        return suVar13;
                    }
                } else {
                    if (i19 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                return no2.PxuCJdSBwIXG;
            case 13:
                nk2 nk2Var2 = (nk2) this.BRwzKIf41E4i;
                su suVar14 = su.rtx2ld2ELZv4;
                int i20 = this.cpQdD2nAriOS;
                try {
                    if (i20 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        ruVar2 = (ru) this.r3s1LDPKFs1S;
                    } else {
                        if (i20 == 1) {
                            l12Var = (l12) this.gPXPFXrUH4XX;
                            nk2 nk2Var3 = (nk2) this.QrzZRwfaDlRX;
                            ru ruVar10 = (ru) this.r3s1LDPKFs1S;
                            ng0.tmVwIGCQF4zR(obj);
                            nk2Var = nk2Var3;
                            ruVar3 = ruVar10;
                            obj2 = obj;
                            this.r3s1LDPKFs1S = ruVar3;
                            this.QrzZRwfaDlRX = null;
                            this.gPXPFXrUH4XX = null;
                            this.cpQdD2nAriOS = 2;
                            if (nk2.TSizfFm2Yiuu(nk2Var, l12Var, (lk2) obj2, this) != suVar14) {
                                ruVar2 = ruVar3;
                            }
                            return suVar14;
                        }
                        if (i20 != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ruVar2 = (ru) this.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (!ki0.Pf0ThKz3j5YS(ruVar2.cpQdD2nAriOS())) {
                        nk2Var2.RAsUl2FVSrh6 = null;
                        return no2.PxuCJdSBwIXG;
                    }
                    l12 l12Var2 = nk2Var2.PxuCJdSBwIXG;
                    eg egVar = nk2Var2.a92UlCVFR9N8;
                    this.r3s1LDPKFs1S = ruVar2;
                    this.QrzZRwfaDlRX = nk2Var2;
                    this.gPXPFXrUH4XX = l12Var2;
                    this.cpQdD2nAriOS = 1;
                    egVar.getClass();
                    obj2 = eg.BjEWd04qc7Mw(egVar, this);
                    if (obj2 == suVar14) {
                        return suVar14;
                    }
                    ruVar3 = ruVar2;
                    l12Var = l12Var2;
                    nk2Var = nk2Var2;
                    this.r3s1LDPKFs1S = ruVar3;
                    this.QrzZRwfaDlRX = null;
                    this.gPXPFXrUH4XX = null;
                    this.cpQdD2nAriOS = 2;
                    if (nk2.TSizfFm2Yiuu(nk2Var, l12Var, (lk2) obj2, this) != suVar14) {
                    }
                    return suVar14;
                } catch (Throwable th7) {
                    nk2Var2.RAsUl2FVSrh6 = null;
                    throw th7;
                }
            case 14:
                int[] iArr = (int[]) this.gPXPFXrUH4XX;
                gm2 gm2Var = (gm2) this.QrzZRwfaDlRX;
                su suVar15 = su.rtx2ld2ELZv4;
                int i21 = this.cpQdD2nAriOS;
                if (i21 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    w80Var = (w80) this.r3s1LDPKFs1S;
                    ue1 ue1Var2 = gm2Var.rtx2ld2ELZv4;
                    ue1Var2.getClass();
                    iArr.getClass();
                    ReentrantLock reentrantLock2 = ue1Var2.PxuCJdSBwIXG;
                    reentrantLock2.lock();
                    try {
                        boolean z3 = false;
                        for (int i22 : iArr) {
                            long[] jArr = ue1Var2.lS5Rgt96tfkO;
                            long j2 = jArr[i22];
                            jArr[i22] = j2 + 1;
                            if (j2 == 0) {
                                ue1Var2.Y1f8riQaR6yg = true;
                                z3 = true;
                            }
                        }
                        j = 1;
                        if (!z3 && !ue1Var2.Y1f8riQaR6yg) {
                            if (!ue1Var2.a92UlCVFR9N8) {
                                z = false;
                                reentrantLock2.unlock();
                                if (z) {
                                    AppDatabase_Impl appDatabase_Impl = gm2Var.PxuCJdSBwIXG;
                                    this.r3s1LDPKFs1S = w80Var;
                                    this.cpQdD2nAriOS = 1;
                                    wLFCmsViZrNT = fx1.wLFCmsViZrNT(appDatabase_Impl, false, this);
                                    break;
                                }
                                zt1 zt1Var = new zt1();
                                i2 i2Var = gm2Var.OPXfSBeufaJ8;
                                bj bjVar = new bj(zt1Var, w80Var, (String[]) this.BRwzKIf41E4i, iArr);
                                this.r3s1LDPKFs1S = null;
                                this.cpQdD2nAriOS = 3;
                                i2Var.Y1f8riQaR6yg(bjVar, this);
                                return suVar15;
                            }
                        }
                        z = true;
                        reentrantLock2.unlock();
                        if (z) {
                        }
                        zt1 zt1Var2 = new zt1();
                        i2 i2Var2 = gm2Var.OPXfSBeufaJ8;
                        bj bjVar2 = new bj(zt1Var2, w80Var, (String[]) this.BRwzKIf41E4i, iArr);
                        this.r3s1LDPKFs1S = null;
                        this.cpQdD2nAriOS = 3;
                        i2Var2.Y1f8riQaR6yg(bjVar2, this);
                        return suVar15;
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        w80Var2 = (w80) this.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                        j = 1;
                        w80Var = w80Var2;
                        try {
                            zt1 zt1Var22 = new zt1();
                            i2 i2Var22 = gm2Var.OPXfSBeufaJ8;
                            bj bjVar22 = new bj(zt1Var22, w80Var, (String[]) this.BRwzKIf41E4i, iArr);
                            this.r3s1LDPKFs1S = null;
                            this.cpQdD2nAriOS = 3;
                            i2Var22.Y1f8riQaR6yg(bjVar22, this);
                            return suVar15;
                        } catch (Throwable th9) {
                            th = th9;
                            ue1Var = gm2Var.rtx2ld2ELZv4;
                            ue1Var.getClass();
                            iArr.getClass();
                            reentrantLock = ue1Var.PxuCJdSBwIXG;
                            reentrantLock.lock();
                            length = iArr.length;
                            z2 = false;
                            while (i2 < length) {
                            }
                            if (!z2) {
                                boolean z4 = ue1Var.a92UlCVFR9N8;
                            }
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (i21 != 3) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                        throw new tm();
                    } catch (Throwable th10) {
                        th = th10;
                        j = 1;
                        ue1Var = gm2Var.rtx2ld2ELZv4;
                        ue1Var.getClass();
                        iArr.getClass();
                        reentrantLock = ue1Var.PxuCJdSBwIXG;
                        reentrantLock.lock();
                        try {
                            length = iArr.length;
                            z2 = false;
                            while (i2 < length) {
                                int i23 = iArr[i2];
                                long[] jArr2 = ue1Var.lS5Rgt96tfkO;
                                long j3 = jArr2[i23];
                                jArr2[i23] = j3 - j;
                                if (j3 == j) {
                                    ue1Var.Y1f8riQaR6yg = true;
                                    z2 = true;
                                }
                                i2++;
                            }
                            if (!z2 && !ue1Var.Y1f8riQaR6yg) {
                                boolean z42 = ue1Var.a92UlCVFR9N8;
                            }
                            reentrantLock.unlock();
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
                w80Var = (w80) this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                wLFCmsViZrNT = obj;
                j = 1;
                ew ewVar = new ew(gm2Var, btVar2, 15);
                this.r3s1LDPKFs1S = w80Var;
                this.cpQdD2nAriOS = 2;
                if (fx1.OYiFbU3x63rc((hu) wLFCmsViZrNT, ewVar, this) != suVar15) {
                    w80Var2 = w80Var;
                    w80Var = w80Var2;
                    zt1 zt1Var222 = new zt1();
                    i2 i2Var222 = gm2Var.OPXfSBeufaJ8;
                    bj bjVar222 = new bj(zt1Var222, w80Var, (String[]) this.BRwzKIf41E4i, iArr);
                    this.r3s1LDPKFs1S = null;
                    this.cpQdD2nAriOS = 3;
                    i2Var222.Y1f8riQaR6yg(bjVar222, this);
                }
                return suVar15;
            default:
                nu2 nu2Var = (nu2) this.BRwzKIf41E4i;
                ?? r22 = (o01) this.gPXPFXrUH4XX;
                no2 no2Var3 = no2.PxuCJdSBwIXG;
                ht1 ht1Var = (ht1) this.QrzZRwfaDlRX;
                su suVar16 = su.rtx2ld2ELZv4;
                int i24 = this.cpQdD2nAriOS;
                try {
                    if (i24 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        v61 v61Var = (v61) ((zt1) this.r3s1LDPKFs1S).rtx2ld2ELZv4;
                        if (v61Var != null) {
                            v61Var.OPXfSBeufaJ8 = cs0.Y1f8riQaR6yg(ht1Var.ZbWwgt3aGe7A);
                        }
                        this.cpQdD2nAriOS = 1;
                        gt1 gt1Var = new gt1(ht1Var, null);
                        hu huVar = this.OPXfSBeufaJ8;
                        huVar.getClass();
                        Object OYiFbU3x63rc2 = fx1.OYiFbU3x63rc(ht1Var.PxuCJdSBwIXG, new d4(ht1Var, gt1Var, ki0.BjEWd04qc7Mw(huVar), null, 5), this);
                        if (OYiFbU3x63rc2 != suVar16) {
                            OYiFbU3x63rc2 = no2Var3;
                        }
                        if (OYiFbU3x63rc2 != suVar16) {
                            OYiFbU3x63rc2 = no2Var3;
                        }
                        if (OYiFbU3x63rc2 == suVar16) {
                            return suVar16;
                        }
                    } else {
                        if (i24 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    return no2Var3;
                } finally {
                    r22.rtx2ld2ELZv4().a92UlCVFR9N8(nu2Var);
                }
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.BRwzKIf41E4i;
        switch (i) {
            case 0:
                e4 e4Var = new e4((le0) this.QrzZRwfaDlRX, (f4) this.gPXPFXrUH4XX, (tz0) obj2, btVar, 0);
                e4Var.r3s1LDPKFs1S = obj;
                return e4Var;
            case 1:
                return new e4(this.r3s1LDPKFs1S, (g7) this.QrzZRwfaDlRX, (d91) this.gPXPFXrUH4XX, (d91) obj2, btVar, 1);
            case 2:
                return new e4((qo) this.r3s1LDPKFs1S, (ScrollCaptureSession) this.QrzZRwfaDlRX, (Rect) this.gPXPFXrUH4XX, (Consumer) obj2, btVar, 2);
            case 3:
                e4 e4Var2 = new e4((v80) this.QrzZRwfaDlRX, (l92) this.gPXPFXrUH4XX, (Float) obj2, btVar, 3);
                e4Var2.r3s1LDPKFs1S = obj;
                return e4Var2;
            case 4:
                return new e4((h92) this.r3s1LDPKFs1S, (v80) this.QrzZRwfaDlRX, (l92) this.gPXPFXrUH4XX, (Float) obj2, btVar, 4);
            case 5:
                e4 e4Var3 = new e4((d91) this.gPXPFXrUH4XX, (vo0) obj2, btVar, 5);
                e4Var3.r3s1LDPKFs1S = obj;
                return e4Var3;
            case 6:
                e4 e4Var4 = new e4((x12) this.QrzZRwfaDlRX, (x91) this.gPXPFXrUH4XX, (gl2) obj2, btVar, 6);
                e4Var4.r3s1LDPKFs1S = obj;
                return e4Var4;
            case 7:
                return new e4((cn1) this.gPXPFXrUH4XX, (pe0) obj2, btVar, 7);
            case 8:
                return new e4((r91) this.gPXPFXrUH4XX, (rtx2ld2ELZv4) obj2, btVar, 8);
            case 9:
                e4 e4Var5 = new e4((s01) this.QrzZRwfaDlRX, (f01) this.gPXPFXrUH4XX, (rtx2ld2ELZv4) obj2, btVar, 9);
                e4Var5.r3s1LDPKFs1S = obj;
                return e4Var5;
            case 10:
                e4 e4Var6 = new e4((ex1) this.QrzZRwfaDlRX, (bi) this.gPXPFXrUH4XX, (a92UlCVFR9N8) obj2, btVar, 10);
                e4Var6.r3s1LDPKFs1S = obj;
                return e4Var6;
            case 11:
                e4 e4Var7 = new e4((le0) this.QrzZRwfaDlRX, (AtomicReference) this.gPXPFXrUH4XX, (pe0) obj2, btVar, 11);
                e4Var7.r3s1LDPKFs1S = obj;
                return e4Var7;
            case 12:
                e4 e4Var8 = new e4((eo1) this.gPXPFXrUH4XX, (qe0) obj2, (le0) this.QrzZRwfaDlRX, btVar);
                e4Var8.r3s1LDPKFs1S = obj;
                return e4Var8;
            case 13:
                e4 e4Var9 = new e4((nk2) obj2, btVar);
                e4Var9.r3s1LDPKFs1S = obj;
                return e4Var9;
            case 14:
                e4 e4Var10 = new e4((gm2) this.QrzZRwfaDlRX, (int[]) this.gPXPFXrUH4XX, (String[]) obj2, btVar, 14);
                e4Var10.r3s1LDPKFs1S = obj;
                return e4Var10;
            default:
                return new e4((zt1) this.r3s1LDPKFs1S, (ht1) this.QrzZRwfaDlRX, (o01) this.gPXPFXrUH4XX, (nu2) obj2, btVar, 15);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        su suVar = su.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                ((e4) gPXPFXrUH4XX((bt) obj2, (a5) obj)).RfyTYNmI9Srp(no2Var);
                return suVar;
            case 1:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 2:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 3:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (j52) obj)).RfyTYNmI9Srp(no2Var);
            case 4:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 5:
                ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
                return suVar;
            case 6:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 7:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 8:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 9:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 10:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 11:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 12:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 13:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 14:
                ((e4) gPXPFXrUH4XX((bt) obj2, (w80) obj)).RfyTYNmI9Srp(no2Var);
                return suVar;
            default:
                return ((e4) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(nk2 nk2Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 13;
        this.BRwzKIf41E4i = nk2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Object obj, Object obj2, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.gPXPFXrUH4XX = obj;
        this.BRwzKIf41E4i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Object obj, Object obj2, Object obj3, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.QrzZRwfaDlRX = obj;
        this.gPXPFXrUH4XX = obj2;
        this.BRwzKIf41E4i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Object obj, Object obj2, Object obj3, Object obj4, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = obj;
        this.QrzZRwfaDlRX = obj2;
        this.gPXPFXrUH4XX = obj3;
        this.BRwzKIf41E4i = obj4;
    }
}
