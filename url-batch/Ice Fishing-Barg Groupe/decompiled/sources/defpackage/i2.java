package defpackage;

import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i2 implements oc, dp1, zv1, rq1 {
    public Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public i2(int i, byte b) {
        this.rtx2ld2ELZv4 = i;
        switch (i) {
            case 8:
                this.OPXfSBeufaJ8 = new n82(zv.rtx2ld2ELZv4);
                break;
            case 17:
                j41 j41Var = new j41();
                this.OPXfSBeufaJ8 = j41Var;
                if (!j41Var.OPXfSBeufaJ8) {
                    if (j41Var.wdg6QnbFHrFF) {
                        hp1.PxuCJdSBwIXG("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j41Var.PxuCJdSBwIXG();
                    j41Var.wdg6QnbFHrFF = true;
                    break;
                }
                break;
            case 22:
                int i2 = 9;
                this.OPXfSBeufaJ8 = Build.VERSION.SDK_INT >= 28 ? new fb0(i2) : new ib0(i2);
                break;
            case 23:
                this.OPXfSBeufaJ8 = new p31();
                break;
            case 27:
                this.OPXfSBeufaJ8 = new LinkedHashSet();
                break;
            case 28:
                this.OPXfSBeufaJ8 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
                break;
            case 29:
                this.OPXfSBeufaJ8 = new Region();
                break;
            default:
                TimeUnit.MINUTES.getClass();
                be2 be2Var = be2.x50lh2ztY7Y5;
                rq.Companion.getClass();
                be2Var.getClass();
                this.OPXfSBeufaJ8 = new os1(be2Var);
                break;
        }
    }

    public static my0 QrzZRwfaDlRX(i2 i2Var, int i) {
        i72 i72Var = j72.Companion;
        jz0 jz0Var = (jz0) i2Var.OPXfSBeufaJ8;
        i72Var.getClass();
        j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
        le0 e9gEMXR7LXtO = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
        j72 lS5Rgt96tfkO = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
        try {
            ez0 ez0Var = (ez0) jz0Var.a92UlCVFR9N8.getValue();
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
            ny0 ny0Var = jz0Var.gPXPFXrUH4XX;
            long j = ez0Var.wdg6QnbFHrFF;
            boolean z = jz0Var.Y1f8riQaR6yg;
            xy0 xy0Var = new xy0(i, ez0Var);
            jv jvVar = ny0Var.TSizfFm2Yiuu;
            if (jvVar == null) {
                return ih0.r3s1LDPKFs1S;
            }
            m9 m9Var = ny0Var.lS5Rgt96tfkO;
            pp1 pp1Var = (pp1) jvVar.Y1f8riQaR6yg;
            boolean z2 = pp1Var instanceof n5;
            op1 op1Var = new op1(jvVar, i, m9Var, xy0Var);
            op1Var.dgRBjINgWbAK = new rr(j);
            if (!z2) {
                pp1Var.PxuCJdSBwIXG(op1Var);
            } else if (z) {
                n5 n5Var = (n5) pp1Var;
                PriorityQueue priorityQueue = n5Var.OPXfSBeufaJ8;
                gq1.Companion.getClass();
                priorityQueue.add(new gq1(1, op1Var));
                if (!n5Var.wdg6QnbFHrFF) {
                    n5Var.wdg6QnbFHrFF = true;
                    n5Var.rtx2ld2ELZv4.post(n5Var);
                }
            } else {
                n5 n5Var2 = (n5) pp1Var;
                PriorityQueue priorityQueue2 = n5Var2.OPXfSBeufaJ8;
                gq1.Companion.getClass();
                priorityQueue2.add(new gq1(0, op1Var));
                if (!n5Var2.wdg6QnbFHrFF) {
                    n5Var2.wdg6QnbFHrFF = true;
                    n5Var2.rtx2ld2ELZv4.post(n5Var2);
                }
            }
            cs0.nLZGh9p8gVSu("compose:lazy:schedule_prefetch:index", i);
            return op1Var;
        } catch (Throwable th) {
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO, e9gEMXR7LXtO);
            throw th;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList dgRBjINgWbAK(defpackage.i2 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2.dgRBjINgWbAK(i2, java.lang.String):java.util.ArrayList");
    }

    public void BRwzKIf41E4i(float f, float f2) {
        ((m9) this.OPXfSBeufaJ8).gPXPFXrUH4XX().Y1f8riQaR6yg(f, f2);
    }

    @Override // defpackage.rq1
    public void OPXfSBeufaJ8() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.dp1
    public long PxuCJdSBwIXG(dr0 dr0Var, long j, cw0 cw0Var, long j2) {
        return (fx1.EcgxDIVH5in8(dr0Var.lS5Rgt96tfkO + ((int) (r0 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (fx1.EcgxDIVH5in8(dr0Var.PxuCJdSBwIXG + ((int) (((wq0) ((ae0) this.OPXfSBeufaJ8).PxuCJdSBwIXG()).PxuCJdSBwIXG >> 32)), (int) (j2 >> 32), (int) (j >> 32), cw0Var == cw0.rtx2ld2ELZv4) << 32);
    }

    public void RAsUl2FVSrh6(float f, float f2, float f3, float f4) {
        m9 m9Var = (m9) this.OPXfSBeufaJ8;
        gi gPXPFXrUH4XX = m9Var.gPXPFXrUH4XX();
        float intBitsToFloat = Float.intBitsToFloat((int) (m9Var.S2OOm9zPNm0h() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m9Var.S2OOm9zPNm0h() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            dp0.PxuCJdSBwIXG("Width and height must be greater than or equal to zero");
        }
        m9Var.ozEBbv0hFTAB(floatToRawIntBits);
        gPXPFXrUH4XX.Y1f8riQaR6yg(f, f2);
    }

    public void TSizfFm2Yiuu(vw0 vw0Var) {
        if (!vw0Var.J54yh1s3n4Aq()) {
            ep0.lS5Rgt96tfkO("DepthSortedSet.add called on an unattached node");
        }
        ((n82) this.OPXfSBeufaJ8).add(vw0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Y1f8riQaR6yg(bj bjVar, ct ctVar) {
        ve1 ve1Var;
        int i;
        if (ctVar instanceof ve1) {
            ve1Var = (ve1) ctVar;
            int i2 = ve1Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ve1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = ve1Var.dgRBjINgWbAK;
                i = ve1Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l92 l92Var = (l92) this.OPXfSBeufaJ8;
                    ve1Var.cpQdD2nAriOS = 1;
                    l92Var.PxuCJdSBwIXG(bjVar, ve1Var);
                    return;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    u9.Y1f8riQaR6yg();
                    return;
                }
            }
        }
        ve1Var = new ve1(this, ctVar);
        Object obj2 = ve1Var.dgRBjINgWbAK;
        i = ve1Var.cpQdD2nAriOS;
        if (i != 0) {
        }
    }

    public i92 a92UlCVFR9N8() {
        x40 PxuCJdSBwIXG = x40.PxuCJdSBwIXG();
        if (PxuCJdSBwIXG.TSizfFm2Yiuu() == 1) {
            return new mn0(true);
        }
        mj1 tmVwIGCQF4zR = sj0.tmVwIGCQF4zR(Boolean.FALSE);
        ow owVar = new ow(tmVwIGCQF4zR, this);
        PxuCJdSBwIXG.PxuCJdSBwIXG.writeLock().lock();
        try {
            if (PxuCJdSBwIXG.TSizfFm2Yiuu != 1 && PxuCJdSBwIXG.TSizfFm2Yiuu != 2) {
                PxuCJdSBwIXG.lS5Rgt96tfkO.add(owVar);
                PxuCJdSBwIXG.PxuCJdSBwIXG.writeLock().unlock();
                return tmVwIGCQF4zR;
            }
            PxuCJdSBwIXG.Y1f8riQaR6yg.post(new th(Arrays.asList(owVar), PxuCJdSBwIXG.TSizfFm2Yiuu, (Throwable) null));
            PxuCJdSBwIXG.PxuCJdSBwIXG.writeLock().unlock();
            return tmVwIGCQF4zR;
        } catch (Throwable th) {
            PxuCJdSBwIXG.PxuCJdSBwIXG.writeLock().unlock();
            throw th;
        }
    }

    public boolean cpQdD2nAriOS(vw0 vw0Var) {
        if (!vw0Var.J54yh1s3n4Aq()) {
            ep0.lS5Rgt96tfkO("DepthSortedSet.remove called on an unattached node");
        }
        return ((n82) this.OPXfSBeufaJ8).remove(vw0Var);
    }

    public void e9gEMXR7LXtO() {
        ((up) this.OPXfSBeufaJ8).getClass();
    }

    public void gPXPFXrUH4XX(dr0 dr0Var) {
        ((Region) this.OPXfSBeufaJ8).set(dr0Var.PxuCJdSBwIXG, dr0Var.lS5Rgt96tfkO, dr0Var.TSizfFm2Yiuu, dr0Var.Y1f8riQaR6yg);
    }

    @Override // defpackage.oc
    public void lS5Rgt96tfkO(xq xqVar) {
        boolean z = xqVar.OPXfSBeufaJ8 == 0;
        PxuCJdSBwIXG pxuCJdSBwIXG = (PxuCJdSBwIXG) this.OPXfSBeufaJ8;
        if (z) {
            pxuCJdSBwIXG.x50lh2ztY7Y5(null, pxuCJdSBwIXG.S2OOm9zPNm0h);
            return;
        }
        b42 b42Var = pxuCJdSBwIXG.QrzZRwfaDlRX;
        if (b42Var != null) {
            ((eh0) b42Var.OPXfSBeufaJ8).lS5Rgt96tfkO(xqVar);
        }
    }

    public void r3s1LDPKFs1S(float f, float f2, long j) {
        gi gPXPFXrUH4XX = ((m9) this.OPXfSBeufaJ8).gPXPFXrUH4XX();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        gPXPFXrUH4XX.Y1f8riQaR6yg(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        gPXPFXrUH4XX.PxuCJdSBwIXG(f, f2);
        gPXPFXrUH4XX.Y1f8riQaR6yg(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void rtx2ld2ELZv4(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.OPXfSBeufaJ8).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 8:
                return ((n82) this.OPXfSBeufaJ8).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.rq1
    public void wdg6QnbFHrFF(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.OPXfSBeufaJ8).setResultCode(i);
    }

    public op0 x50lh2ztY7Y5(op0 op0Var, r1 r1Var) {
        long j;
        boolean z;
        long tmVwIGCQF4zR;
        p31 p31Var = (p31) this.OPXfSBeufaJ8;
        List list = (List) op0Var.OPXfSBeufaJ8;
        p31 p31Var2 = new p31(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            co1 co1Var = (co1) list.get(i);
            long j2 = co1Var.PxuCJdSBwIXG;
            bo1 bo1Var = (bo1) p31Var.lS5Rgt96tfkO(j2);
            if (bo1Var == null) {
                j = co1Var.lS5Rgt96tfkO;
                tmVwIGCQF4zR = co1Var.Y1f8riQaR6yg;
                z = false;
            } else {
                long j3 = bo1Var.PxuCJdSBwIXG;
                j = j3;
                z = bo1Var.TSizfFm2Yiuu;
                tmVwIGCQF4zR = r1Var.tmVwIGCQF4zR(bo1Var.lS5Rgt96tfkO);
            }
            long j4 = co1Var.PxuCJdSBwIXG;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            p31Var2.Y1f8riQaR6yg(j4, new ao1(j4, co1Var.lS5Rgt96tfkO, co1Var.Y1f8riQaR6yg, co1Var.e9gEMXR7LXtO, co1Var.a92UlCVFR9N8, j, tmVwIGCQF4zR, z, co1Var.RAsUl2FVSrh6, co1Var.OPXfSBeufaJ8, co1Var.wdg6QnbFHrFF, co1Var.dgRBjINgWbAK, co1Var.x50lh2ztY7Y5, co1Var.cpQdD2nAriOS));
            boolean z2 = co1Var.e9gEMXR7LXtO;
            if (z2) {
                p31Var.Y1f8riQaR6yg(j2, new bo1(co1Var.lS5Rgt96tfkO, co1Var.TSizfFm2Yiuu, z2));
            } else {
                p31Var.e9gEMXR7LXtO(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new op0(18, p31Var2, op0Var);
    }

    public /* synthetic */ i2(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    public i2(vm vmVar) {
        this.rtx2ld2ELZv4 = 18;
        this.OPXfSBeufaJ8 = new CopyOnWriteArrayList();
        new HashMap();
    }

    public /* synthetic */ i2(int i, char c) {
        this.rtx2ld2ELZv4 = i;
    }

    public i2(rv rvVar, pv pvVar) {
        this.rtx2ld2ELZv4 = 6;
        this.OPXfSBeufaJ8 = rvVar;
    }

    public i2(int i) {
        this.rtx2ld2ELZv4 = 19;
        this.OPXfSBeufaJ8 = hq0.RAsUl2FVSrh6(new int[i]);
    }
}
