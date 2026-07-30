package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rf0 extends up {
    public final long PxuCJdSBwIXG;
    public final /* synthetic */ tf0 RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public HashSet Y1f8riQaR6yg;
    public final mj1 a92UlCVFR9N8;
    public final w81 e9gEMXR7LXtO;
    public final boolean lS5Rgt96tfkO;

    public rf0(tf0 tf0Var, long j, boolean z, boolean z2, i2 i2Var) {
        this.RAsUl2FVSrh6 = tf0Var;
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = z2;
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.e9gEMXR7LXtO = new w81();
        kj0.tmVwIGCQF4zR();
        this.a92UlCVFR9N8 = new mj1(il1.dgRBjINgWbAK, jx1.S9EYkSpbGuxq);
    }

    @Override // defpackage.up
    public final void BRwzKIf41E4i(zs1 zs1Var) {
        this.RAsUl2FVSrh6.lS5Rgt96tfkO.BRwzKIf41E4i(zs1Var);
    }

    @Override // defpackage.up
    public final void EcgxDIVH5in8() {
        this.RAsUl2FVSrh6.e6tOsSdd2EFb++;
    }

    @Override // defpackage.up
    public final il1 OPXfSBeufaJ8() {
        return (il1) this.a92UlCVFR9N8.getValue();
    }

    @Override // defpackage.up
    public final void PxuCJdSBwIXG(zp zpVar, pe0 pe0Var) {
        this.RAsUl2FVSrh6.lS5Rgt96tfkO.PxuCJdSBwIXG(zpVar, pe0Var);
    }

    @Override // defpackage.up
    public final void QrzZRwfaDlRX(Set set) {
        HashSet hashSet = this.Y1f8riQaR6yg;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.Y1f8riQaR6yg = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.up
    public final long RAsUl2FVSrh6() {
        return this.PxuCJdSBwIXG;
    }

    @Override // defpackage.up
    public final di RfyTYNmI9Srp(y4 y4Var) {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.RfyTYNmI9Srp(y4Var);
    }

    public final void S2OOm9zPNm0h() {
        w81 w81Var = this.e9gEMXR7LXtO;
        if (w81Var.rtx2ld2ELZv4()) {
            HashSet hashSet = this.Y1f8riQaR6yg;
            if (hashSet != null) {
                Object[] objArr = w81Var.lS5Rgt96tfkO;
                long[] jArr = w81Var.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    tf0 tf0Var = (tf0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(tf0Var.S2OOm9zPNm0h());
                                    }
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
            }
            w81Var.lS5Rgt96tfkO();
        }
    }

    @Override // defpackage.up
    public final void S9EYkSpbGuxq(tf0 tf0Var) {
        HashSet hashSet = this.Y1f8riQaR6yg;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                tf0Var.getClass();
                set.remove(tf0Var.S2OOm9zPNm0h());
            }
        }
        if (tf0Var != null) {
            this.e9gEMXR7LXtO.x50lh2ztY7Y5(tf0Var);
        }
    }

    @Override // defpackage.up
    public final void TSizfFm2Yiuu() {
        tf0 tf0Var = this.RAsUl2FVSrh6;
        tf0Var.e6tOsSdd2EFb--;
    }

    @Override // defpackage.up
    public final void VhhvGxCb8gfr(zp zpVar) {
        this.RAsUl2FVSrh6.lS5Rgt96tfkO.VhhvGxCb8gfr(zpVar);
    }

    @Override // defpackage.up
    public final void XL4ISE6Oc65B(zp zpVar) {
        this.RAsUl2FVSrh6.lS5Rgt96tfkO.XL4ISE6Oc65B(zpVar);
    }

    @Override // defpackage.up
    public final boolean Y1f8riQaR6yg() {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.Y1f8riQaR6yg();
    }

    @Override // defpackage.up
    public final boolean a92UlCVFR9N8() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.up
    public final m71 cpQdD2nAriOS(n71 n71Var) {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.cpQdD2nAriOS(n71Var);
    }

    @Override // defpackage.up
    public final boolean dgRBjINgWbAK() {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.dgRBjINgWbAK();
    }

    @Override // defpackage.up
    public final boolean e9gEMXR7LXtO() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.up
    public final void gPXPFXrUH4XX(tf0 tf0Var) {
        this.e9gEMXR7LXtO.PxuCJdSBwIXG(tf0Var);
    }

    @Override // defpackage.up
    public final w81 lS5Rgt96tfkO(zp zpVar, q52 q52Var, pe0 pe0Var) {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.lS5Rgt96tfkO(zpVar, q52Var, pe0Var);
    }

    @Override // defpackage.up
    public final w81 r3s1LDPKFs1S(zp zpVar, q52 q52Var, w81 w81Var) {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.r3s1LDPKFs1S(zpVar, q52Var, w81Var);
    }

    @Override // defpackage.up
    public final tp rtx2ld2ELZv4() {
        return this.RAsUl2FVSrh6.rtx2ld2ELZv4;
    }

    @Override // defpackage.up
    public final hu wdg6QnbFHrFF() {
        return this.RAsUl2FVSrh6.lS5Rgt96tfkO.wdg6QnbFHrFF();
    }

    @Override // defpackage.up
    public final void x50lh2ztY7Y5(zp zpVar) {
        tf0 tf0Var = this.RAsUl2FVSrh6;
        tf0Var.lS5Rgt96tfkO.x50lh2ztY7Y5(tf0Var.rtx2ld2ELZv4);
        tf0Var.lS5Rgt96tfkO.x50lh2ztY7Y5(zpVar);
    }
}
