package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ht1 extends up {
    public static final bt1 Companion = new bt1();
    public static final l92 IAToe7bXGz4N;
    public static final AtomicReference e6tOsSdd2EFb;
    public w81 BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public final f91 OPXfSBeufaJ8;
    public final x6 PxuCJdSBwIXG;
    public final v81 QrzZRwfaDlRX;
    public List RAsUl2FVSrh6;
    public final l92 RfyTYNmI9Srp;
    public final zs0 S2OOm9zPNm0h;
    public final l92 S9EYkSpbGuxq;
    public final Object TSizfFm2Yiuu;
    public final m9 VhhvGxCb8gfr;
    public bi XL4ISE6Oc65B;
    public xs0 Y1f8riQaR6yg;
    public final hu ZbWwgt3aGe7A;
    public final ArrayList a92UlCVFR9N8;
    public final op0 cpQdD2nAriOS;
    public final ArrayList dgRBjINgWbAK;
    public Throwable e9gEMXR7LXtO;
    public ArrayList gPXPFXrUH4XX;
    public final m9 lS5Rgt96tfkO;
    public final fb0 pnx5pC0XzaCw;
    public final v81 r3s1LDPKFs1S;
    public w81 rtx2ld2ELZv4;
    public final ArrayList wdg6QnbFHrFF;
    public final v81 x50lh2ztY7Y5;

    static {
        tl1.Companion.getClass();
        IAToe7bXGz4N = hq0.RAsUl2FVSrh6(tl1.dgRBjINgWbAK);
        e6tOsSdd2EFb = new AtomicReference(Boolean.FALSE);
    }

    public ht1(hu huVar) {
        x6 x6Var = new x6(new at1(this, 0));
        this.PxuCJdSBwIXG = x6Var;
        this.lS5Rgt96tfkO = new m9(new at1(this, 1));
        this.TSizfFm2Yiuu = new Object();
        this.a92UlCVFR9N8 = new ArrayList();
        this.rtx2ld2ELZv4 = new w81();
        this.OPXfSBeufaJ8 = new f91(new zp[16]);
        this.wdg6QnbFHrFF = new ArrayList();
        this.dgRBjINgWbAK = new ArrayList();
        this.x50lh2ztY7Y5 = new v81();
        this.cpQdD2nAriOS = new op0(24);
        this.r3s1LDPKFs1S = new v81();
        this.QrzZRwfaDlRX = new v81();
        this.RfyTYNmI9Srp = hq0.RAsUl2FVSrh6(null);
        this.S9EYkSpbGuxq = hq0.RAsUl2FVSrh6(dt1.wdg6QnbFHrFF);
        this.VhhvGxCb8gfr = new m9(18);
        zs0 zs0Var = new zs0((xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i));
        zs0Var.aF05bpZJlKEP(new r3s1LDPKFs1S(28, this));
        this.S2OOm9zPNm0h = zs0Var;
        this.ZbWwgt3aGe7A = huVar.RfyTYNmI9Srp(x6Var).RfyTYNmI9Srp(zs0Var);
        this.pnx5pC0XzaCw = new fb0(13);
    }

    public static void S2OOm9zPNm0h(b91 b91Var) {
        try {
            if (b91Var.S2OOm9zPNm0h() instanceof l72) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            b91Var.TSizfFm2Yiuu();
        }
    }

    public static final void ozEBbv0hFTAB(ArrayList arrayList, ht1 ht1Var, zp zpVar) {
        arrayList.clear();
        synchronized (ht1Var.TSizfFm2Yiuu) {
            Iterator it = ht1Var.dgRBjINgWbAK.iterator();
            if (it.hasNext()) {
                ((n71) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.up
    public final void BRwzKIf41E4i(zs1 zs1Var) {
        m9 m9Var = this.VhhvGxCb8gfr;
        w81 w81Var = (w81) m9Var.QrzZRwfaDlRX();
        if (w81Var == null) {
            w81 w81Var2 = d02.PxuCJdSBwIXG;
            w81Var = new w81();
            m9Var.aF05bpZJlKEP(w81Var);
        }
        w81Var.PxuCJdSBwIXG(zs1Var);
    }

    public final void BjEWd04qc7Mw(zp zpVar) {
        synchronized (this.TSizfFm2Yiuu) {
            ArrayList arrayList = this.dgRBjINgWbAK;
            if (arrayList.size() > 0) {
                ((n71) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final void EpkonXwzFgDB(Throwable th, zp zpVar) {
        if (!((Boolean) e6tOsSdd2EFb.get()).booleanValue() || (th instanceof no)) {
            synchronized (this.TSizfFm2Yiuu) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                ct1 ct1Var = (ct1) this.RfyTYNmI9Srp.getValue();
                if (ct1Var != null) {
                    throw ct1Var.PxuCJdSBwIXG;
                }
                l92 l92Var = this.RfyTYNmI9Srp;
                ct1 ct1Var2 = new ct1(th);
                l92Var.getClass();
                l92Var.OPXfSBeufaJ8(null, ct1Var2);
            }
            throw th;
        }
        synchronized (this.TSizfFm2Yiuu) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.wdg6QnbFHrFF.clear();
                this.OPXfSBeufaJ8.RAsUl2FVSrh6();
                this.rtx2ld2ELZv4 = new w81();
                this.dgRBjINgWbAK.clear();
                this.x50lh2ztY7Y5.PxuCJdSBwIXG();
                this.r3s1LDPKFs1S.PxuCJdSBwIXG();
                l92 l92Var2 = this.RfyTYNmI9Srp;
                ct1 ct1Var3 = new ct1(th);
                l92Var2.getClass();
                l92Var2.OPXfSBeufaJ8(null, ct1Var3);
                if (zpVar != null) {
                    nLZGh9p8gVSu(zpVar);
                }
                if (pnx5pC0XzaCw() != null) {
                    mp.PxuCJdSBwIXG("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean IAToe7bXGz4N() {
        return !this.EcgxDIVH5in8 && (((bb) ((xb) this.PxuCJdSBwIXG.wdg6QnbFHrFF).Y1f8riQaR6yg).get() & 134217727) > 0;
    }

    public final zp J54yh1s3n4Aq(zp zpVar, w81 w81Var) {
        if (zpVar.aF05bpZJlKEP.BjEWd04qc7Mw || zpVar.kpCQ9veP6n3I == 3) {
            return null;
        }
        w81 w81Var2 = this.BRwzKIf41E4i;
        if (w81Var2 == null || !w81Var2.TSizfFm2Yiuu(zpVar)) {
            i72 i72Var = j72.Companion;
            r3s1LDPKFs1S r3s1ldpkfs1s = new r3s1LDPKFs1S(27, zpVar);
            e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(26, zpVar, w81Var);
            i72Var.getClass();
            b91 RAsUl2FVSrh6 = i72.RAsUl2FVSrh6(r3s1ldpkfs1s, e9gemxr7lxto);
            try {
                j72 wdg6QnbFHrFF = RAsUl2FVSrh6.wdg6QnbFHrFF();
                if (w81Var != null) {
                    try {
                        if (w81Var.rtx2ld2ELZv4()) {
                            e6 e6Var = new e6(22, w81Var, zpVar);
                            tf0 tf0Var = zpVar.aF05bpZJlKEP;
                            if (tf0Var.BjEWd04qc7Mw) {
                                mp.PxuCJdSBwIXG("Preparing a composition while composing is not supported");
                            }
                            tf0Var.BjEWd04qc7Mw = true;
                            try {
                                e6Var.PxuCJdSBwIXG();
                                tf0Var.BjEWd04qc7Mw = false;
                            } catch (Throwable th) {
                                tf0Var.BjEWd04qc7Mw = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                        throw th2;
                    }
                }
                boolean S2OOm9zPNm0h = zpVar.S2OOm9zPNm0h();
                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                if (S2OOm9zPNm0h) {
                    return zpVar;
                }
            } finally {
                S2OOm9zPNm0h(RAsUl2FVSrh6);
            }
        }
        return null;
    }

    @Override // defpackage.up
    public final void PxuCJdSBwIXG(zp zpVar, pe0 pe0Var) {
        dt1 dt1Var;
        boolean contains;
        boolean z = zpVar.aF05bpZJlKEP.BjEWd04qc7Mw;
        synchronized (this.TSizfFm2Yiuu) {
            dt1 dt1Var2 = (dt1) this.S9EYkSpbGuxq.getValue();
            dt1Var = dt1.OPXfSBeufaJ8;
            contains = dt1Var2.compareTo(dt1Var) > 0 ? true ^ kpCQ9veP6n3I().contains(zpVar) : true;
        }
        try {
            i72 i72Var = j72.Companion;
            r3s1LDPKFs1S r3s1ldpkfs1s = new r3s1LDPKFs1S(27, zpVar);
            e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(26, zpVar, null);
            i72Var.getClass();
            b91 RAsUl2FVSrh6 = i72.RAsUl2FVSrh6(r3s1ldpkfs1s, e9gemxr7lxto);
            try {
                j72 wdg6QnbFHrFF = RAsUl2FVSrh6.wdg6QnbFHrFF();
                try {
                    zpVar.wdg6QnbFHrFF(pe0Var);
                    synchronized (this.TSizfFm2Yiuu) {
                        if (((dt1) this.S9EYkSpbGuxq.getValue()).compareTo(dt1Var) > 0 && !kpCQ9veP6n3I().contains(zpVar)) {
                            this.a92UlCVFR9N8.add(zpVar);
                            this.RAsUl2FVSrh6 = null;
                        }
                    }
                    if (!z) {
                        s72.OPXfSBeufaJ8().cpQdD2nAriOS();
                    }
                    try {
                        BjEWd04qc7Mw(zpVar);
                        try {
                            zpVar.Y1f8riQaR6yg();
                            zpVar.a92UlCVFR9N8();
                            if (z) {
                                return;
                            }
                            s72.OPXfSBeufaJ8().cpQdD2nAriOS();
                        } catch (Throwable th) {
                            EpkonXwzFgDB(th, null);
                        }
                    } catch (Throwable th2) {
                        EpkonXwzFgDB(th2, zpVar);
                    }
                } finally {
                    j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                }
            } finally {
                S2OOm9zPNm0h(RAsUl2FVSrh6);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.TSizfFm2Yiuu) {
                }
            }
            EpkonXwzFgDB(th3, zpVar);
        }
    }

    @Override // defpackage.up
    public final long RAsUl2FVSrh6() {
        return 1000L;
    }

    @Override // defpackage.up
    public final di RfyTYNmI9Srp(y4 y4Var) {
        m9 m9Var = this.lS5Rgt96tfkO;
        xb xbVar = (xb) m9Var.wdg6QnbFHrFF;
        gd1 gd1Var = new gd1();
        gd1Var.PxuCJdSBwIXG = y4Var;
        return xbVar.Y1f8riQaR6yg(gd1Var, (e6) m9Var.dgRBjINgWbAK);
    }

    @Override // defpackage.up
    public final void VhhvGxCb8gfr(zp zpVar) {
        synchronized (this.TSizfFm2Yiuu) {
            if (this.a92UlCVFR9N8.remove(zpVar)) {
                this.RAsUl2FVSrh6 = null;
            }
            this.OPXfSBeufaJ8.wdg6QnbFHrFF(zpVar);
            this.wdg6QnbFHrFF.remove(zpVar);
        }
    }

    @Override // defpackage.up
    public final void XL4ISE6Oc65B(zp zpVar) {
        synchronized (this.TSizfFm2Yiuu) {
            try {
                w81 w81Var = this.BRwzKIf41E4i;
                if (w81Var == null) {
                    w81 w81Var2 = d02.PxuCJdSBwIXG;
                    w81Var = new w81();
                    this.BRwzKIf41E4i = w81Var;
                }
                w81Var.PxuCJdSBwIXG(zpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.up
    public final boolean Y1f8riQaR6yg() {
        return ((Boolean) e6tOsSdd2EFb.get()).booleanValue();
    }

    public final void ZbWwgt3aGe7A() {
        synchronized (this.TSizfFm2Yiuu) {
            if (((dt1) this.S9EYkSpbGuxq.getValue()).compareTo(dt1.x50lh2ztY7Y5) >= 0) {
                l92 l92Var = this.S9EYkSpbGuxq;
                dt1 dt1Var = dt1.OPXfSBeufaJ8;
                l92Var.getClass();
                l92Var.OPXfSBeufaJ8(null, dt1Var);
            }
        }
        this.S2OOm9zPNm0h.a92UlCVFR9N8(null);
    }

    @Override // defpackage.up
    public final boolean a92UlCVFR9N8() {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        wo.Companion.getClass();
        return false;
    }

    public final boolean aF05bpZJlKEP() {
        boolean z;
        synchronized (this.TSizfFm2Yiuu) {
            if (!this.rtx2ld2ELZv4.rtx2ld2ELZv4() && this.OPXfSBeufaJ8.wdg6QnbFHrFF == 0 && !IAToe7bXGz4N()) {
                z = jyegZNwi31qc();
            }
        }
        return z;
    }

    @Override // defpackage.up
    public final m71 cpQdD2nAriOS(n71 n71Var) {
        m71 m71Var;
        synchronized (this.TSizfFm2Yiuu) {
            m71Var = (m71) this.r3s1LDPKFs1S.dgRBjINgWbAK(n71Var);
        }
        return m71Var;
    }

    @Override // defpackage.up
    public final boolean dgRBjINgWbAK() {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        wo.Companion.getClass();
        return false;
    }

    public final boolean e6tOsSdd2EFb() {
        return this.OPXfSBeufaJ8.wdg6QnbFHrFF != 0 || IAToe7bXGz4N() || jyegZNwi31qc() || this.x50lh2ztY7Y5.wdg6QnbFHrFF();
    }

    @Override // defpackage.up
    public final boolean e9gEMXR7LXtO() {
        return false;
    }

    public final boolean jyegZNwi31qc() {
        return !this.EcgxDIVH5in8 && (((bb) ((xb) this.lS5Rgt96tfkO.wdg6QnbFHrFF).Y1f8riQaR6yg).get() & 134217727) > 0;
    }

    public final List kpCQ9veP6n3I() {
        List list = this.RAsUl2FVSrh6;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.a92UlCVFR9N8;
        List arrayList2 = arrayList.isEmpty() ? p50.rtx2ld2ELZv4 : new ArrayList(arrayList);
        this.RAsUl2FVSrh6 = arrayList2;
        return arrayList2;
    }

    @Override // defpackage.up
    public final w81 lS5Rgt96tfkO(zp zpVar, q52 q52Var, pe0 pe0Var) {
        m9 m9Var = this.VhhvGxCb8gfr;
        try {
            q52 q52Var2 = zpVar.S2OOm9zPNm0h;
            zpVar.S2OOm9zPNm0h = q52Var;
            try {
                PxuCJdSBwIXG(zpVar, pe0Var);
                w81 w81Var = (w81) m9Var.QrzZRwfaDlRX();
                if (w81Var == null) {
                    w81Var = d02.PxuCJdSBwIXG;
                    w81Var.getClass();
                }
                return w81Var;
            } finally {
                zpVar.S2OOm9zPNm0h = q52Var2;
            }
        } finally {
            m9Var.aF05bpZJlKEP(null);
        }
    }

    public final void nLZGh9p8gVSu(zp zpVar) {
        ArrayList arrayList = this.gPXPFXrUH4XX;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.gPXPFXrUH4XX = arrayList;
        }
        if (!arrayList.contains(zpVar)) {
            arrayList.add(zpVar);
        }
        if (this.a92UlCVFR9N8.remove(zpVar)) {
            this.RAsUl2FVSrh6 = null;
        }
    }

    public final zh pnx5pC0XzaCw() {
        l92 l92Var = this.S9EYkSpbGuxq;
        int compareTo = ((dt1) l92Var.getValue()).compareTo(dt1.OPXfSBeufaJ8);
        l92 l92Var2 = this.RfyTYNmI9Srp;
        ArrayList arrayList = this.dgRBjINgWbAK;
        ArrayList arrayList2 = this.wdg6QnbFHrFF;
        f91 f91Var = this.OPXfSBeufaJ8;
        if (compareTo > 0) {
            Object value = l92Var2.getValue();
            dt1 dt1Var = dt1.cpQdD2nAriOS;
            dt1 dt1Var2 = dt1.wdg6QnbFHrFF;
            if (value == null) {
                if (this.Y1f8riQaR6yg == null) {
                    this.rtx2ld2ELZv4 = new w81();
                    f91Var.RAsUl2FVSrh6();
                    if (IAToe7bXGz4N() || jyegZNwi31qc()) {
                        dt1Var2 = dt1.dgRBjINgWbAK;
                    }
                } else {
                    dt1Var2 = (f91Var.wdg6QnbFHrFF != 0 || this.rtx2ld2ELZv4.rtx2ld2ELZv4() || !arrayList2.isEmpty() || !arrayList.isEmpty() || IAToe7bXGz4N() || jyegZNwi31qc() || this.x50lh2ztY7Y5.wdg6QnbFHrFF()) ? dt1Var : dt1.x50lh2ztY7Y5;
                }
            }
            l92Var.OPXfSBeufaJ8(null, dt1Var2);
            if (dt1Var2 != dt1Var) {
                return null;
            }
            bi biVar = this.XL4ISE6Oc65B;
            this.XL4ISE6Oc65B = null;
            return biVar;
        }
        List kpCQ9veP6n3I = kpCQ9veP6n3I();
        int size = kpCQ9veP6n3I.size();
        for (int i = 0; i < size; i++) {
        }
        this.a92UlCVFR9N8.clear();
        this.RAsUl2FVSrh6 = p50.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = new w81();
        f91Var.RAsUl2FVSrh6();
        arrayList2.clear();
        arrayList.clear();
        this.gPXPFXrUH4XX = null;
        bi biVar2 = this.XL4ISE6Oc65B;
        if (biVar2 != null) {
            biVar2.QrzZRwfaDlRX(null);
        }
        this.XL4ISE6Oc65B = null;
        l92Var2.rtx2ld2ELZv4(null);
        return null;
    }

    @Override // defpackage.up
    public final w81 r3s1LDPKFs1S(zp zpVar, q52 q52Var, w81 w81Var) {
        m9 m9Var = this.VhhvGxCb8gfr;
        try {
            xfACYKDMU6Dj();
            zpVar.ZbWwgt3aGe7A(new e02(w81Var));
            q52 q52Var2 = zpVar.S2OOm9zPNm0h;
            zpVar.S2OOm9zPNm0h = q52Var;
            try {
                zp J54yh1s3n4Aq = J54yh1s3n4Aq(zpVar, null);
                if (J54yh1s3n4Aq != null) {
                    BjEWd04qc7Mw(zpVar);
                    J54yh1s3n4Aq.Y1f8riQaR6yg();
                    J54yh1s3n4Aq.a92UlCVFR9N8();
                }
                w81 w81Var2 = (w81) m9Var.QrzZRwfaDlRX();
                if (w81Var2 == null) {
                    w81Var2 = d02.PxuCJdSBwIXG;
                    w81Var2.getClass();
                }
                return w81Var2;
            } finally {
                zpVar.S2OOm9zPNm0h = q52Var2;
            }
        } finally {
            m9Var.aF05bpZJlKEP(null);
        }
    }

    public final void rZjpSjn4zoMv() {
        zh pnx5pC0XzaCw;
        synchronized (this.TSizfFm2Yiuu) {
            pnx5pC0XzaCw = pnx5pC0XzaCw();
            if (((dt1) this.S9EYkSpbGuxq.getValue()).compareTo(dt1.OPXfSBeufaJ8) <= 0) {
                Throwable th = this.e9gEMXR7LXtO;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (pnx5pC0XzaCw != null) {
            ((bi) pnx5pC0XzaCw).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
        }
    }

    @Override // defpackage.up
    public final tp rtx2ld2ELZv4() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0134, code lost:
    
        if (r4 >= r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (((defpackage.vi1) r10.get(r4)).OPXfSBeufaJ8 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        if (r9 >= r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        r12 = (defpackage.vi1) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r12.OPXfSBeufaJ8 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        r12 = (defpackage.n71) r12.rtx2ld2ELZv4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        r4 = r18.TSizfFm2Yiuu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016a, code lost:
    
        defpackage.el.MBpAROcyNHKN(r3, r18.dgRBjINgWbAK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0170, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017e, code lost:
    
        if (r9 >= r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0180, code lost:
    
        r12 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0189, code lost:
    
        if (((defpackage.vi1) r12).OPXfSBeufaJ8 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018b, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018e, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List tmVwIGCQF4zR(List list, w81 w81Var) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((n71) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            zp zpVar = (zp) entry.getKey();
            List list2 = (List) entry.getValue();
            if (zpVar.aF05bpZJlKEP.BjEWd04qc7Mw) {
                mp.PxuCJdSBwIXG("Check failed");
            }
            i72 i72Var = j72.Companion;
            r3s1LDPKFs1S r3s1ldpkfs1s = new r3s1LDPKFs1S(27, zpVar);
            e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(26, zpVar, w81Var);
            i72Var.getClass();
            b91 RAsUl2FVSrh6 = i72.RAsUl2FVSrh6(r3s1ldpkfs1s, e9gemxr7lxto);
            try {
                j72 wdg6QnbFHrFF = RAsUl2FVSrh6.wdg6QnbFHrFF();
                try {
                    synchronized (this.TSizfFm2Yiuu) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                n71 n71Var = (n71) list2.get(i2);
                                v81 v81Var = this.x50lh2ztY7Y5;
                                n71Var.getClass();
                                Object PxuCJdSBwIXG = x71.PxuCJdSBwIXG(v81Var);
                                arrayList.add(new vi1(n71Var, PxuCJdSBwIXG));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                vi1 vi1Var = (vi1) arrayList.get(i3);
                                if (vi1Var.OPXfSBeufaJ8 == null) {
                                    op0 op0Var = this.cpQdD2nAriOS;
                                    ((n71) vi1Var.rtx2ld2ELZv4).getClass();
                                    if (((v81) op0Var.OPXfSBeufaJ8).lS5Rgt96tfkO(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            vi1 vi1Var2 = (vi1) arrayList.get(i4);
                                            if (vi1Var2.OPXfSBeufaJ8 == null) {
                                                op0 op0Var2 = this.cpQdD2nAriOS;
                                                ((n71) vi1Var2.rtx2ld2ELZv4).getClass();
                                                v81 v81Var2 = (v81) op0Var2.OPXfSBeufaJ8;
                                                if (v81Var2.OPXfSBeufaJ8()) {
                                                    ((v81) op0Var2.wdg6QnbFHrFF).PxuCJdSBwIXG();
                                                }
                                            }
                                            arrayList2.add(vi1Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((vi1) arrayList.get(i5)).OPXfSBeufaJ8 != null) {
                            break;
                        }
                        i5++;
                    }
                    zpVar.XL4ISE6Oc65B(arrayList);
                    j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                } catch (Throwable th) {
                    j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                    throw th;
                }
            } finally {
                S2OOm9zPNm0h(RAsUl2FVSrh6);
            }
        }
        return zk.i(hashMap.keySet());
    }

    @Override // defpackage.up
    public final hu wdg6QnbFHrFF() {
        return this.ZbWwgt3aGe7A;
    }

    @Override // defpackage.up
    public final void x50lh2ztY7Y5(zp zpVar) {
        zh zhVar;
        synchronized (this.TSizfFm2Yiuu) {
            if (this.OPXfSBeufaJ8.rtx2ld2ELZv4(zpVar)) {
                zhVar = null;
            } else {
                this.OPXfSBeufaJ8.lS5Rgt96tfkO(zpVar);
                zhVar = pnx5pC0XzaCw();
            }
        }
        if (zhVar != null) {
            ((bi) zhVar).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
        }
    }

    public final boolean xfACYKDMU6Dj() {
        boolean e6tOsSdd2EFb2;
        synchronized (this.TSizfFm2Yiuu) {
            if (this.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                return e6tOsSdd2EFb();
            }
            List kpCQ9veP6n3I = kpCQ9veP6n3I();
            e02 e02Var = new e02(this.rtx2ld2ELZv4);
            this.rtx2ld2ELZv4 = new w81();
            try {
                int size = kpCQ9veP6n3I.size();
                for (int i = 0; i < size; i++) {
                    ((zp) kpCQ9veP6n3I.get(i)).ZbWwgt3aGe7A(e02Var);
                    if (((dt1) this.S9EYkSpbGuxq.getValue()).compareTo(dt1.OPXfSBeufaJ8) <= 0) {
                        break;
                    }
                }
                synchronized (this.TSizfFm2Yiuu) {
                    if (pnx5pC0XzaCw() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    e6tOsSdd2EFb2 = e6tOsSdd2EFb();
                }
                return e6tOsSdd2EFb2;
            } catch (Throwable th) {
                synchronized (this.TSizfFm2Yiuu) {
                    w81 w81Var = this.rtx2ld2ELZv4;
                    w81Var.getClass();
                    Iterator<E> it = e02Var.iterator();
                    while (it.hasNext()) {
                        w81Var.dgRBjINgWbAK(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.up
    public final void QrzZRwfaDlRX(Set set) {
    }
}
