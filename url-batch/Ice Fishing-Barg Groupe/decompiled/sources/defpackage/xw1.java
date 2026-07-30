package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class xw1 implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ xw1(xw1 xw1Var, RAsUl2FVSrh6 rAsUl2FVSrh6) {
        this.rtx2ld2ELZv4 = 12;
        this.OPXfSBeufaJ8 = xw1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        yz0 yz0Var;
        int i = this.rtx2ld2ELZv4;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                pd0 pd0Var = (pd0) obj;
                pd0Var.getClass();
                ((bx1) obj2).rtx2ld2ELZv4 = pd0Var;
                return no2.PxuCJdSBwIXG;
            case 1:
                zy1 zy1Var = ((yy1) obj2).wdg6QnbFHrFF;
                return Boolean.valueOf(zy1Var != null ? zy1Var.Y1f8riQaR6yg(obj) : true);
            case 2:
                q02 q02Var = (q02) obj2;
                float floatValue = ((Float) obj).floatValue();
                hj1 hj1Var = q02Var.PxuCJdSBwIXG;
                float rtx2ld2ELZv4 = hj1Var.rtx2ld2ELZv4() + floatValue + q02Var.a92UlCVFR9N8;
                float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(rtx2ld2ELZv4, 0.0f, q02Var.e9gEMXR7LXtO.rtx2ld2ELZv4());
                r3 = rtx2ld2ELZv4 == OPXfSBeufaJ8;
                float rtx2ld2ELZv42 = OPXfSBeufaJ8 - hj1Var.rtx2ld2ELZv4();
                int round = Math.round(rtx2ld2ELZv42);
                hj1Var.OPXfSBeufaJ8(hj1Var.rtx2ld2ELZv4() + round);
                q02Var.a92UlCVFR9N8 = rtx2ld2ELZv42 - round;
                if (!r3) {
                    floatValue = rtx2ld2ELZv42;
                }
                return Float.valueOf(floatValue);
            case 3:
                l12 l12Var = (l12) obj2;
                return new bf1(l12Var.TSizfFm2Yiuu(l12Var.dgRBjINgWbAK, ((bf1) obj).PxuCJdSBwIXG, l12Var.wdg6QnbFHrFF));
            case 4:
                bh2 bh2Var = (bh2) obj2;
                ao1 ao1Var = (ao1) obj;
                long j = ao1Var.TSizfFm2Yiuu;
                eh2 eh2Var = (eh2) bh2Var.TSizfFm2Yiuu;
                if (!eh2Var.dgRBjINgWbAK() || eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8.length() == 0 || (yz0Var = eh2Var.Y1f8riQaR6yg) == null || yz0Var.Y1f8riQaR6yg() == null) {
                    r3 = false;
                } else {
                    oh2 r3s1LDPKFs1S = eh2Var.r3s1LDPKFs1S();
                    j22.Companion.getClass();
                    bh2Var.TSizfFm2Yiuu(r3s1LDPKFs1S, j, false, i22.lS5Rgt96tfkO);
                }
                if (r3) {
                    ao1Var.PxuCJdSBwIXG();
                }
                return no2.PxuCJdSBwIXG;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                dm1 dm1Var = (dm1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dm1.RAsUl2FVSrh6(dm1Var, (em1) arrayList.get(i2), 0, 0);
                }
                return no2.PxuCJdSBwIXG;
            case 6:
                x52 x52Var = (x52) obj2;
                v32 v32Var = x52Var.a92UlCVFR9N8;
                v32Var.getClass();
                if (!cs0.wdg6QnbFHrFF(x52Var.a92UlCVFR9N8, v32Var)) {
                    gp1.lS5Rgt96tfkO("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                w81 w81Var = x52Var.e9gEMXR7LXtO;
                Object obj3 = x52Var.TSizfFm2Yiuu;
                if (w81Var != null) {
                    if (obj3 != null) {
                        gp1.lS5Rgt96tfkO("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    w81Var.PxuCJdSBwIXG(obj);
                } else if (obj3 == null) {
                    x52Var.TSizfFm2Yiuu = obj;
                } else {
                    w81 w81Var2 = d02.PxuCJdSBwIXG;
                    w81 w81Var3 = new w81();
                    w81Var3.PxuCJdSBwIXG(obj3);
                    w81Var3.PxuCJdSBwIXG(obj);
                    x52Var.e9gEMXR7LXtO = w81Var3;
                    x52Var.TSizfFm2Yiuu = null;
                }
                return no2.PxuCJdSBwIXG;
            case 7:
                f82 f82Var = (f82) obj2;
                synchronized (f82Var.RAsUl2FVSrh6) {
                    e82 e82Var = f82Var.OPXfSBeufaJ8;
                    e82Var.getClass();
                    Object obj4 = e82Var.lS5Rgt96tfkO;
                    obj4.getClass();
                    int i3 = e82Var.Y1f8riQaR6yg;
                    l81 l81Var = e82Var.TSizfFm2Yiuu;
                    if (l81Var == null) {
                        l81Var = new l81();
                        e82Var.TSizfFm2Yiuu = l81Var;
                        e82Var.a92UlCVFR9N8.cpQdD2nAriOS(obj4, l81Var);
                    }
                    e82Var.lS5Rgt96tfkO(obj, i3, obj4, l81Var);
                }
                return no2.PxuCJdSBwIXG;
            case 8:
                String str = (String) obj2;
                String str2 = (String) obj;
                str2.getClass();
                return ia2.fRTaYY6FBZcX(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            case 9:
                h8 h8Var = (h8) obj;
                ((pe0) obj2).rtx2ld2ELZv4(h8Var.e9gEMXR7LXtO.getValue(), b51.QrzZRwfaDlRX.lS5Rgt96tfkO.OPXfSBeufaJ8(h8Var.a92UlCVFR9N8));
                return no2.PxuCJdSBwIXG;
            case 10:
                Drawable drawable = (Drawable) obj2;
                k30 k30Var = (k30) obj;
                gi gPXPFXrUH4XX = k30Var.rZjpSjn4zoMv().gPXPFXrUH4XX();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() >> 32)), (int) Float.intBitsToFloat((int) (k30Var.Y1f8riQaR6yg() & 4294967295L)));
                drawable.draw(u0.PxuCJdSBwIXG(gPXPFXrUH4XX));
                return no2.PxuCJdSBwIXG;
            case 11:
                ((le0) obj).OPXfSBeufaJ8((me2) obj2);
                return no2.PxuCJdSBwIXG;
            case 12:
                xw1 xw1Var = (xw1) obj2;
                ol2 ol2Var = (ol2) obj;
                if (ol2Var instanceof l) {
                    xw1Var.OPXfSBeufaJ8(((l) ol2Var).VhhvGxCb8gfr);
                    return Boolean.TRUE;
                }
                u9.rtx2ld2ELZv4("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 13:
                ((dw1) obj).TSizfFm2Yiuu(((Number) ((i92) obj2).getValue()).floatValue());
                return no2.PxuCJdSBwIXG;
            case 14:
                ug2 ug2Var = (ug2) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                fj1 fj1Var = ug2Var.PxuCJdSBwIXG;
                float rtx2ld2ELZv43 = fj1Var.rtx2ld2ELZv4() + floatValue2;
                fj1 fj1Var2 = ug2Var.lS5Rgt96tfkO;
                if (rtx2ld2ELZv43 > fj1Var2.rtx2ld2ELZv4()) {
                    floatValue2 = fj1Var2.rtx2ld2ELZv4() - fj1Var.rtx2ld2ELZv4();
                } else if (rtx2ld2ELZv43 < 0.0f) {
                    floatValue2 = -fj1Var.rtx2ld2ELZv4();
                }
                fj1Var.OPXfSBeufaJ8(fj1Var.rtx2ld2ELZv4() + floatValue2);
                return Float.valueOf(floatValue2);
            case 15:
                return (bf1) ((ae0) obj2).PxuCJdSBwIXG();
            default:
                im2 im2Var = (im2) obj2;
                dk dkVar = (dk) obj;
                dkVar.getClass();
                dk.PxuCJdSBwIXG(dkVar, "first", im2Var.PxuCJdSBwIXG.getDescriptor());
                dk.PxuCJdSBwIXG(dkVar, "second", im2Var.lS5Rgt96tfkO.getDescriptor());
                dk.PxuCJdSBwIXG(dkVar, "third", im2Var.TSizfFm2Yiuu.getDescriptor());
                return no2.PxuCJdSBwIXG;
        }
    }

    public /* synthetic */ xw1(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }
}
