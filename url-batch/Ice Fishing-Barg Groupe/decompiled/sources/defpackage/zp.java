package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zp implements tp {
    public final v81 BRwzKIf41E4i;
    public final v81 EcgxDIVH5in8;
    public int IAToe7bXGz4N;
    public final m9 OPXfSBeufaJ8;
    public final w81 QrzZRwfaDlRX;
    public final si RfyTYNmI9Srp;
    public q52 S2OOm9zPNm0h;
    public v81 S9EYkSpbGuxq;
    public boolean VhhvGxCb8gfr;
    public final si XL4ISE6Oc65B;
    public bl1 ZbWwgt3aGe7A;
    public final tf0 aF05bpZJlKEP;
    public final a72 cpQdD2nAriOS;
    public final i2 e6tOsSdd2EFb;
    public final w81 gPXPFXrUH4XX;
    public final ju1 jyegZNwi31qc;
    public int kpCQ9veP6n3I;
    public zp pnx5pC0XzaCw;
    public final v81 r3s1LDPKFs1S;
    public final up rtx2ld2ELZv4;
    public final y81 x50lh2ztY7Y5;
    public final AtomicReference wdg6QnbFHrFF = new AtomicReference(null);
    public final Object dgRBjINgWbAK = new Object();

    public zp(up upVar, m9 m9Var) {
        this.rtx2ld2ELZv4 = upVar;
        this.OPXfSBeufaJ8 = m9Var;
        y81 y81Var = new y81(new w81());
        this.x50lh2ztY7Y5 = y81Var;
        a72 a72Var = new a72();
        if (upVar.Y1f8riQaR6yg()) {
            a72Var.XL4ISE6Oc65B = new c81();
        }
        if (upVar.a92UlCVFR9N8()) {
            a72Var.lS5Rgt96tfkO();
        }
        this.cpQdD2nAriOS = a72Var;
        this.r3s1LDPKFs1S = th0.cpQdD2nAriOS();
        this.QrzZRwfaDlRX = new w81();
        this.gPXPFXrUH4XX = new w81();
        this.BRwzKIf41E4i = th0.cpQdD2nAriOS();
        si siVar = new si();
        this.XL4ISE6Oc65B = siVar;
        si siVar2 = new si();
        this.RfyTYNmI9Srp = siVar2;
        this.EcgxDIVH5in8 = th0.cpQdD2nAriOS();
        this.S9EYkSpbGuxq = th0.cpQdD2nAriOS();
        i2 i2Var = new i2(3, upVar);
        this.e6tOsSdd2EFb = i2Var;
        this.jyegZNwi31qc = new ju1();
        tf0 tf0Var = new tf0(m9Var, upVar, c72.Y1f8riQaR6yg(a72Var), y81Var, siVar, siVar2, i2Var, this);
        upVar.gPXPFXrUH4XX(tf0Var);
        this.aF05bpZJlKEP = tf0Var;
    }

    public final void BRwzKIf41E4i() {
        int i = this.kpCQ9veP6n3I;
        if (i != 0) {
            gp1.lS5Rgt96tfkO(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.ZbWwgt3aGe7A == null) {
            return;
        }
        gp1.lS5Rgt96tfkO("A pausable composition is in progress");
    }

    public final ls0 EcgxDIVH5in8(zs1 zs1Var, nf0 nf0Var, Object obj) {
        zp zpVar;
        synchronized (this.dgRBjINgWbAK) {
            try {
                zp zpVar2 = this.pnx5pC0XzaCw;
                if (zpVar2 != null) {
                    a72 a72Var = this.cpQdD2nAriOS;
                    int i = this.IAToe7bXGz4N;
                    if (a72Var.r3s1LDPKFs1S) {
                        mp.PxuCJdSBwIXG("Writer is active");
                    }
                    if (i < 0 || i >= a72Var.OPXfSBeufaJ8) {
                        mp.PxuCJdSBwIXG("Invalid group index");
                    }
                    nf0 gPXPFXrUH4XX = ov2.gPXPFXrUH4XX(nf0Var);
                    if (a72Var.e9gEMXR7LXtO(gPXPFXrUH4XX)) {
                        int i2 = a72Var.rtx2ld2ELZv4[(i * 5) + 3] + i;
                        int i3 = gPXPFXrUH4XX.PxuCJdSBwIXG;
                        zpVar = (i <= i3 && i3 < i2) ? zpVar2 : null;
                    }
                    zpVar2 = null;
                }
                if (zpVar == null) {
                    tf0 tf0Var = this.aF05bpZJlKEP;
                    if (tf0Var.BjEWd04qc7Mw && tf0Var.KUoIVIumpKat(zs1Var, obj)) {
                        return ls0.dgRBjINgWbAK;
                    }
                    if (obj == null) {
                        this.S9EYkSpbGuxq.cpQdD2nAriOS(zs1Var, ih0.VhhvGxCb8gfr);
                    } else {
                        boolean z = obj instanceof ty;
                        v81 v81Var = this.S9EYkSpbGuxq;
                        if (z) {
                            Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(zs1Var);
                            if (RAsUl2FVSrh6 != null) {
                                if (RAsUl2FVSrh6 instanceof w81) {
                                    w81 w81Var = (w81) RAsUl2FVSrh6;
                                    Object[] objArr = w81Var.lS5Rgt96tfkO;
                                    long[] jArr = w81Var.PxuCJdSBwIXG;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == ih0.VhhvGxCb8gfr) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (RAsUl2FVSrh6 == ih0.VhhvGxCb8gfr) {
                                }
                            }
                            th0.rtx2ld2ELZv4(this.S9EYkSpbGuxq, zs1Var, obj);
                        } else {
                            v81Var.cpQdD2nAriOS(zs1Var, ih0.VhhvGxCb8gfr);
                        }
                    }
                }
                if (zpVar != null) {
                    return zpVar.EcgxDIVH5in8(zs1Var, nf0Var, obj);
                }
                this.rtx2ld2ELZv4.x50lh2ztY7Y5(this);
                return this.aF05bpZJlKEP.BjEWd04qc7Mw ? ls0.wdg6QnbFHrFF : ls0.OPXfSBeufaJ8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void IAToe7bXGz4N(Object obj) {
        synchronized (this.dgRBjINgWbAK) {
            try {
                S9EYkSpbGuxq(obj);
                Object RAsUl2FVSrh6 = this.BRwzKIf41E4i.RAsUl2FVSrh6(obj);
                if (RAsUl2FVSrh6 != null) {
                    if (RAsUl2FVSrh6 instanceof w81) {
                        w81 w81Var = (w81) RAsUl2FVSrh6;
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
                                            S9EYkSpbGuxq((ty) objArr[(i << 3) + i3]);
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
                    } else {
                        S9EYkSpbGuxq((ty) RAsUl2FVSrh6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OPXfSBeufaJ8() {
        boolean z;
        synchronized (this.dgRBjINgWbAK) {
            z = true;
            if (this.kpCQ9veP6n3I != 1) {
                z = false;
            }
            if (z) {
                this.kpCQ9veP6n3I = 0;
            }
        }
        return z;
    }

    public final void PxuCJdSBwIXG() {
        this.wdg6QnbFHrFF.set(null);
        this.XL4ISE6Oc65B.POWyO8hTM6YC.Pf0ThKz3j5YS();
        this.RfyTYNmI9Srp.POWyO8hTM6YC.Pf0ThKz3j5YS();
        y81 y81Var = this.x50lh2ztY7Y5;
        if (y81Var.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
            return;
        }
        ju1 ju1Var = this.jyegZNwi31qc;
        try {
            ju1Var.RAsUl2FVSrh6(y81Var, this.aF05bpZJlKEP.IAToe7bXGz4N());
            ju1Var.lS5Rgt96tfkO();
        } finally {
            ju1Var.PxuCJdSBwIXG();
        }
    }

    public final void QrzZRwfaDlRX() {
        AtomicReference atomicReference = this.wdg6QnbFHrFF;
        Object andSet = atomicReference.getAndSet(null);
        if (cs0.wdg6QnbFHrFF(andSet, b51.lS5Rgt96tfkO)) {
            return;
        }
        if (andSet instanceof Set) {
            TSizfFm2Yiuu((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                TSizfFm2Yiuu(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.ZbWwgt3aGe7A == null) {
                mp.PxuCJdSBwIXG("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            mp.lS5Rgt96tfkO("corrupt pendingModifications drain: " + atomicReference);
            u9.Y1f8riQaR6yg();
        }
    }

    public final void RAsUl2FVSrh6() {
        ju1 ju1Var;
        synchronized (this.dgRBjINgWbAK) {
            try {
                this.aF05bpZJlKEP.VhhvGxCb8gfr = null;
                if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                    ju1Var = this.jyegZNwi31qc;
                    try {
                        ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                        ju1Var.lS5Rgt96tfkO();
                        ju1Var.PxuCJdSBwIXG();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                        ju1Var = this.jyegZNwi31qc;
                        try {
                            ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                            ju1Var.lS5Rgt96tfkO();
                            ju1Var.PxuCJdSBwIXG();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    PxuCJdSBwIXG();
                    throw th2;
                }
            }
        }
    }

    public final ls0 RfyTYNmI9Srp(zs1 zs1Var, Object obj) {
        zp zpVar;
        int i = zs1Var.lS5Rgt96tfkO;
        if ((i & 2) != 0) {
            zs1Var.lS5Rgt96tfkO = i | 4;
        }
        nf0 nf0Var = zs1Var.TSizfFm2Yiuu;
        if (nf0Var == null || !nf0Var.PxuCJdSBwIXG()) {
            return ls0.rtx2ld2ELZv4;
        }
        a72 a72Var = this.cpQdD2nAriOS;
        a72Var.getClass();
        nf0 nf0Var2 = zs1Var.TSizfFm2Yiuu;
        if (nf0Var2 != null && a72Var.e9gEMXR7LXtO(ov2.gPXPFXrUH4XX(nf0Var2))) {
            if (zs1Var.Y1f8riQaR6yg == null) {
                return ls0.rtx2ld2ELZv4;
            }
            ls0 EcgxDIVH5in8 = EcgxDIVH5in8(zs1Var, nf0Var, obj);
            if (EcgxDIVH5in8 != ls0.rtx2ld2ELZv4) {
                this.e6tOsSdd2EFb.e9gEMXR7LXtO();
            }
            return EcgxDIVH5in8;
        }
        synchronized (this.dgRBjINgWbAK) {
            zpVar = this.pnx5pC0XzaCw;
        }
        if (zpVar != null) {
            tf0 tf0Var = zpVar.aF05bpZJlKEP;
            if (tf0Var.BjEWd04qc7Mw && tf0Var.KUoIVIumpKat(zs1Var, obj)) {
                return ls0.dgRBjINgWbAK;
            }
        }
        return ls0.rtx2ld2ELZv4;
    }

    public final boolean S2OOm9zPNm0h() {
        synchronized (this.dgRBjINgWbAK) {
            bl1 bl1Var = this.ZbWwgt3aGe7A;
            boolean z = false;
            if (bl1Var != null && (bl1Var.rtx2ld2ELZv4.get() != dl1.x50lh2ztY7Y5 || bl1Var.OPXfSBeufaJ8 != xi0.VhhvGxCb8gfr())) {
                AtomicReference atomicReference = bl1Var.rtx2ld2ELZv4;
                dl1 dl1Var = dl1.cpQdD2nAriOS;
                dl1 dl1Var2 = dl1.dgRBjINgWbAK;
                while (!atomicReference.compareAndSet(dl1Var, dl1Var2) && atomicReference.get() == dl1Var) {
                }
                bl1Var.x50lh2ztY7Y5.rtx2ld2ELZv4.PxuCJdSBwIXG(9);
                return false;
            }
            r3s1LDPKFs1S();
            try {
                v81 v81Var = this.S9EYkSpbGuxq;
                this.S9EYkSpbGuxq = th0.cpQdD2nAriOS();
                try {
                    tf0 tf0Var = this.aF05bpZJlKEP;
                    q52 q52Var = this.S2OOm9zPNm0h;
                    ph1 ph1Var = tf0Var.e9gEMXR7LXtO.POWyO8hTM6YC;
                    if (!ph1Var.POWyO8hTM6YC()) {
                        mp.PxuCJdSBwIXG("Expected applyChanges() to have been called");
                    }
                    if (v81Var.e9gEMXR7LXtO > 0 || !tf0Var.RfyTYNmI9Srp.isEmpty()) {
                        tf0Var.gGoUzNp9JO5I = q52Var;
                        try {
                            tf0Var.r3s1LDPKFs1S(v81Var, null);
                            tf0Var.gGoUzNp9JO5I = null;
                            z = !ph1Var.POWyO8hTM6YC();
                        } catch (Throwable th) {
                            tf0Var.gGoUzNp9JO5I = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        QrzZRwfaDlRX();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.S9EYkSpbGuxq = v81Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                        ju1 ju1Var = this.jyegZNwi31qc;
                        try {
                            ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                            ju1Var.lS5Rgt96tfkO();
                            ju1Var.PxuCJdSBwIXG();
                        } catch (Throwable th4) {
                            ju1Var.PxuCJdSBwIXG();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    PxuCJdSBwIXG();
                    throw th5;
                }
            }
        }
    }

    public final void S9EYkSpbGuxq(Object obj) {
        Object RAsUl2FVSrh6 = this.r3s1LDPKFs1S.RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 == null) {
            return;
        }
        boolean z = RAsUl2FVSrh6 instanceof w81;
        ls0 ls0Var = ls0.dgRBjINgWbAK;
        v81 v81Var = this.EcgxDIVH5in8;
        if (!z) {
            zs1 zs1Var = (zs1) RAsUl2FVSrh6;
            if (zs1Var.lS5Rgt96tfkO(obj) == ls0Var) {
                th0.rtx2ld2ELZv4(v81Var, obj, zs1Var);
                return;
            }
            return;
        }
        w81 w81Var = (w81) RAsUl2FVSrh6;
        Object[] objArr = w81Var.lS5Rgt96tfkO;
        long[] jArr = w81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zs1 zs1Var2 = (zs1) objArr[(i << 3) + i3];
                        if (zs1Var2.lS5Rgt96tfkO(obj) == ls0Var) {
                            th0.rtx2ld2ELZv4(v81Var, obj, zs1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void TSizfFm2Yiuu(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean TSizfFm2Yiuu;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof e02;
        v81 v81Var = this.BRwzKIf41E4i;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            w81 w81Var = ((e02) set).rtx2ld2ELZv4;
            Object[] objArr = w81Var.lS5Rgt96tfkO;
            long[] jArr10 = w81Var.PxuCJdSBwIXG;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof zs1) {
                                    ((zs1) obj2).lS5Rgt96tfkO(obj);
                                } else {
                                    lS5Rgt96tfkO(obj2, z);
                                    Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(obj2);
                                    if (RAsUl2FVSrh6 != null) {
                                        if (RAsUl2FVSrh6 instanceof w81) {
                                            w81 w81Var2 = (w81) RAsUl2FVSrh6;
                                            Object[] objArr2 = w81Var2.lS5Rgt96tfkO;
                                            long[] jArr11 = w81Var2.PxuCJdSBwIXG;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                lS5Rgt96tfkO((ty) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            lS5Rgt96tfkO((ty) RAsUl2FVSrh6, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof zs1) {
                    ((zs1) obj3).lS5Rgt96tfkO(null);
                } else {
                    lS5Rgt96tfkO(obj3, z);
                    Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(obj3);
                    if (RAsUl2FVSrh62 != null) {
                        if (RAsUl2FVSrh62 instanceof w81) {
                            w81 w81Var3 = (w81) RAsUl2FVSrh62;
                            Object[] objArr3 = w81Var3.lS5Rgt96tfkO;
                            long[] jArr13 = w81Var3.PxuCJdSBwIXG;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                lS5Rgt96tfkO((ty) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            lS5Rgt96tfkO((ty) RAsUl2FVSrh62, z);
                        }
                    }
                }
            }
        }
        v81 v81Var2 = this.r3s1LDPKFs1S;
        w81 w81Var4 = this.QrzZRwfaDlRX;
        if (z) {
            w81 w81Var5 = this.gPXPFXrUH4XX;
            if (w81Var5.rtx2ld2ELZv4()) {
                long[] jArr14 = v81Var2.PxuCJdSBwIXG;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = v81Var2.lS5Rgt96tfkO[i18];
                                    Object obj5 = v81Var2.TSizfFm2Yiuu[i18];
                                    if (obj5 instanceof w81) {
                                        w81 w81Var6 = (w81) obj5;
                                        Object[] objArr4 = w81Var6.lS5Rgt96tfkO;
                                        long[] jArr15 = w81Var6.PxuCJdSBwIXG;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            zs1 zs1Var = (zs1) objArr5[i22];
                                                            if (w81Var5.TSizfFm2Yiuu(zs1Var) || w81Var4.TSizfFm2Yiuu(zs1Var)) {
                                                                w81Var6.cpQdD2nAriOS(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = w81Var6.RAsUl2FVSrh6();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        zs1 zs1Var2 = (zs1) obj5;
                                        z2 = w81Var5.TSizfFm2Yiuu(zs1Var2) || w81Var4.TSizfFm2Yiuu(zs1Var2);
                                    }
                                    if (z2) {
                                        v81Var2.x50lh2ztY7Y5(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                w81Var5.lS5Rgt96tfkO();
                rtx2ld2ELZv4();
                return;
            }
        }
        if (w81Var4.rtx2ld2ELZv4()) {
            long[] jArr17 = v81Var2.PxuCJdSBwIXG;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = v81Var2.lS5Rgt96tfkO[i26];
                                Object obj7 = v81Var2.TSizfFm2Yiuu[i26];
                                if (obj7 instanceof w81) {
                                    w81 w81Var7 = (w81) obj7;
                                    Object[] objArr6 = w81Var7.lS5Rgt96tfkO;
                                    long[] jArr18 = w81Var7.PxuCJdSBwIXG;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (w81Var4.TSizfFm2Yiuu((zs1) objArr7[i30])) {
                                                            w81Var7.cpQdD2nAriOS(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    TSizfFm2Yiuu = w81Var7.RAsUl2FVSrh6();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    TSizfFm2Yiuu = w81Var4.TSizfFm2Yiuu((zs1) obj7);
                                }
                                if (TSizfFm2Yiuu) {
                                    v81Var2.x50lh2ztY7Y5(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            rtx2ld2ELZv4();
            w81Var4.lS5Rgt96tfkO();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean VhhvGxCb8gfr(Set set) {
        boolean z = set instanceof e02;
        v81 v81Var = this.BRwzKIf41E4i;
        v81 v81Var2 = this.r3s1LDPKFs1S;
        if (z) {
            w81 w81Var = ((e02) set).rtx2ld2ELZv4;
            Object[] objArr = w81Var.lS5Rgt96tfkO;
            long[] jArr = w81Var.PxuCJdSBwIXG;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (v81Var2.TSizfFm2Yiuu(obj) || v81Var.TSizfFm2Yiuu(obj)) {
                                    break loop0;
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
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (v81Var2.TSizfFm2Yiuu(obj2) || v81Var.TSizfFm2Yiuu(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void XL4ISE6Oc65B(ArrayList arrayList) {
        y81 y81Var = this.x50lh2ztY7Y5;
        tf0 tf0Var = this.aF05bpZJlKEP;
        if (arrayList.size() > 0) {
            ((n71) ((vi1) arrayList.get(0)).rtx2ld2ELZv4).getClass();
            mp.PxuCJdSBwIXG("Check failed");
        }
        try {
            tf0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    tf0Var.jyegZNwi31qc(arrayList);
                    tf0Var.OPXfSBeufaJ8();
                } catch (Throwable th) {
                    tf0Var.PxuCJdSBwIXG();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!y81Var.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                    ju1 ju1Var = this.jyegZNwi31qc;
                    try {
                        ju1Var.RAsUl2FVSrh6(y81Var, tf0Var.IAToe7bXGz4N());
                        ju1Var.lS5Rgt96tfkO();
                        ju1Var.PxuCJdSBwIXG();
                    } catch (Throwable th3) {
                        ju1Var.PxuCJdSBwIXG();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                PxuCJdSBwIXG();
                throw th4;
            }
        }
    }

    public final void Y1f8riQaR6yg() {
        synchronized (this.dgRBjINgWbAK) {
            try {
                e9gEMXR7LXtO(this.XL4ISE6Oc65B);
                QrzZRwfaDlRX();
            } catch (Throwable th) {
                try {
                    if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                        ju1 ju1Var = this.jyegZNwi31qc;
                        try {
                            ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                            ju1Var.lS5Rgt96tfkO();
                            ju1Var.PxuCJdSBwIXG();
                        } catch (Throwable th2) {
                            ju1Var.PxuCJdSBwIXG();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    PxuCJdSBwIXG();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void ZbWwgt3aGe7A(e02 e02Var) {
        e02 e02Var2;
        while (true) {
            Object obj = this.wdg6QnbFHrFF.get();
            if (obj == null || obj.equals(b51.lS5Rgt96tfkO)) {
                e02Var2 = e02Var;
            } else if (obj instanceof Set) {
                e02Var2 = new Set[]{obj, e02Var};
            } else {
                if (!(obj instanceof Object[])) {
                    u9.RAsUl2FVSrh6(this.wdg6QnbFHrFF, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = e02Var;
                e02Var2 = copyOf;
            }
            AtomicReference atomicReference = this.wdg6QnbFHrFF;
            while (!atomicReference.compareAndSet(obj, e02Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.dgRBjINgWbAK) {
                    QrzZRwfaDlRX();
                }
                return;
            }
            return;
        }
    }

    public final void a92UlCVFR9N8() {
        synchronized (this.dgRBjINgWbAK) {
            try {
                si siVar = this.RfyTYNmI9Srp;
                siVar.getClass();
                if (!siVar.POWyO8hTM6YC.POWyO8hTM6YC()) {
                    e9gEMXR7LXtO(this.RfyTYNmI9Srp);
                }
            } catch (Throwable th) {
                try {
                    if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                        ju1 ju1Var = this.jyegZNwi31qc;
                        try {
                            ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                            ju1Var.lS5Rgt96tfkO();
                            ju1Var.PxuCJdSBwIXG();
                        } catch (Throwable th2) {
                            ju1Var.PxuCJdSBwIXG();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void cpQdD2nAriOS() {
        synchronized (this.dgRBjINgWbAK) {
            try {
                if (this.aF05bpZJlKEP.BjEWd04qc7Mw) {
                    gp1.lS5Rgt96tfkO("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.kpCQ9veP6n3I != 3) {
                    this.kpCQ9veP6n3I = 3;
                    si siVar = this.aF05bpZJlKEP.nLZGh9p8gVSu;
                    if (siVar != null) {
                        e9gEMXR7LXtO(siVar);
                    }
                    boolean z = this.cpQdD2nAriOS.OPXfSBeufaJ8 == 0;
                    if (!z || !this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                        ju1 ju1Var = this.jyegZNwi31qc;
                        try {
                            ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                            if (!z) {
                                a72 a72Var = this.cpQdD2nAriOS;
                                ju1 ju1Var2 = this.jyegZNwi31qc;
                                e72 Y1f8riQaR6yg = a72Var.Y1f8riQaR6yg();
                                try {
                                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                                    Y1f8riQaR6yg.r3s1LDPKFs1S(Y1f8riQaR6yg.EcgxDIVH5in8, new l4(2, ju1Var2));
                                    Y1f8riQaR6yg.tmVwIGCQF4zR();
                                    Y1f8riQaR6yg.e9gEMXR7LXtO(true);
                                    this.OPXfSBeufaJ8.lS5Rgt96tfkO();
                                    this.OPXfSBeufaJ8.RAsUl2FVSrh6();
                                    ju1Var.TSizfFm2Yiuu();
                                } catch (Throwable th) {
                                    Y1f8riQaR6yg.e9gEMXR7LXtO(false);
                                    throw th;
                                }
                            }
                            ju1Var.lS5Rgt96tfkO();
                            ju1Var.PxuCJdSBwIXG();
                        } catch (Throwable th2) {
                            ju1Var.PxuCJdSBwIXG();
                            throw th2;
                        }
                    }
                    tf0 tf0Var = this.aF05bpZJlKEP;
                    tf0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        tf0Var.lS5Rgt96tfkO.S9EYkSpbGuxq(tf0Var);
                        tf0Var.rZjpSjn4zoMv.clear();
                        tf0Var.RfyTYNmI9Srp.clear();
                        tf0Var.e9gEMXR7LXtO.POWyO8hTM6YC.Pf0ThKz3j5YS();
                        tf0Var.VhhvGxCb8gfr = null;
                        tf0Var.PxuCJdSBwIXG.lS5Rgt96tfkO();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.rtx2ld2ELZv4.VhhvGxCb8gfr(this);
    }

    public final bl1 dgRBjINgWbAK(boolean z, pe0 pe0Var) {
        if (this.ZbWwgt3aGe7A != null) {
            gp1.lS5Rgt96tfkO("A pausable composition is in progress");
        }
        bl1 bl1Var = new bl1(this, this.rtx2ld2ELZv4, this.aF05bpZJlKEP, this.x50lh2ztY7Y5, pe0Var, z, this.OPXfSBeufaJ8, this.dgRBjINgWbAK);
        this.ZbWwgt3aGe7A = bl1Var;
        return bl1Var;
    }

    public final void e6tOsSdd2EFb(pe0 pe0Var) {
        boolean OPXfSBeufaJ8 = OPXfSBeufaJ8();
        BRwzKIf41E4i();
        up upVar = this.rtx2ld2ELZv4;
        if (!OPXfSBeufaJ8) {
            upVar.PxuCJdSBwIXG(this, pe0Var);
            return;
        }
        tf0 tf0Var = this.aF05bpZJlKEP;
        tf0Var.IAToe7bXGz4N = 0;
        tf0Var.pnx5pC0XzaCw = true;
        upVar.PxuCJdSBwIXG(this, pe0Var);
        tf0Var.RfyTYNmI9Srp();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #7 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x0081, B:31:0x008e, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e9gEMXR7LXtO(si siVar) {
        r9 r9Var;
        ju1 ju1Var;
        e72 Y1f8riQaR6yg;
        ju1 ju1Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        ju1 ju1Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        si siVar2 = this.RfyTYNmI9Srp;
        tf0 tf0Var = this.aF05bpZJlKEP;
        xp IAToe7bXGz4N = tf0Var.IAToe7bXGz4N();
        ju1 ju1Var4 = this.jyegZNwi31qc;
        ju1Var4.RAsUl2FVSrh6(this.x50lh2ztY7Y5, IAToe7bXGz4N);
        try {
            if (siVar.POWyO8hTM6YC.POWyO8hTM6YC()) {
                try {
                    if (siVar2.POWyO8hTM6YC.POWyO8hTM6YC() && this.ZbWwgt3aGe7A == null) {
                        ju1Var4.lS5Rgt96tfkO();
                    }
                    return;
                } finally {
                }
            }
            bl1 bl1Var = this.ZbWwgt3aGe7A;
            if (bl1Var == null || (r9Var = bl1Var.x50lh2ztY7Y5) == null) {
                r9Var = this.OPXfSBeufaJ8;
            }
            try {
                Trace.beginSection(r9Var.equals(bl1Var != null ? bl1Var.x50lh2ztY7Y5 : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    bl1 bl1Var2 = this.ZbWwgt3aGe7A;
                    try {
                        try {
                            if (bl1Var2 != null) {
                                ju1Var = bl1Var2.dgRBjINgWbAK;
                                if (ju1Var == null) {
                                }
                                a72 a72Var = this.cpQdD2nAriOS;
                                xp IAToe7bXGz4N2 = tf0Var.IAToe7bXGz4N();
                                Y1f8riQaR6yg = c72.Y1f8riQaR6yg(a72Var).Y1f8riQaR6yg();
                                int i3 = 0;
                                siVar.PsecLrZVVK61(r9Var, Y1f8riQaR6yg, ju1Var, IAToe7bXGz4N2);
                                Y1f8riQaR6yg.e9gEMXR7LXtO(true);
                                r9Var.RAsUl2FVSrh6();
                                Trace.endSection();
                                ju1Var4.TSizfFm2Yiuu();
                                ju1Var4.Y1f8riQaR6yg();
                                if (this.VhhvGxCb8gfr) {
                                    ju1Var2 = ju1Var4;
                                } else {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.VhhvGxCb8gfr = false;
                                        v81 v81Var = this.r3s1LDPKFs1S;
                                        long[] jArr3 = v81Var.PxuCJdSBwIXG;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = v81Var.lS5Rgt96tfkO[i8];
                                                            Object obj2 = v81Var.TSizfFm2Yiuu[i8];
                                                            if (obj2 instanceof w81) {
                                                                w81 w81Var = (w81) obj2;
                                                                Object[] objArr = w81Var.lS5Rgt96tfkO;
                                                                long[] jArr4 = w81Var.PxuCJdSBwIXG;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                ju1Var3 = ju1Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((zs1) objArr[i13]).PxuCJdSBwIXG()) {
                                                                                            w81Var.cpQdD2nAriOS(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = w81Var.RAsUl2FVSrh6();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                ju1Var3 = ju1Var4;
                                                                j = j4;
                                                                obj2.getClass();
                                                                z = !((zs1) obj2).PxuCJdSBwIXG();
                                                            }
                                                            if (z) {
                                                                v81Var.x50lh2ztY7Y5(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            ju1Var3 = ju1Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        ju1Var4 = ju1Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    ju1Var2 = ju1Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    ju1Var2 = ju1Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                ju1Var4 = ju1Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            ju1Var2 = ju1Var4;
                                        }
                                        rtx2ld2ELZv4();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (siVar2.POWyO8hTM6YC.POWyO8hTM6YC() && this.ZbWwgt3aGe7A == null) {
                                    ju1Var2.lS5Rgt96tfkO();
                                }
                                return;
                            }
                            if (siVar2.POWyO8hTM6YC.POWyO8hTM6YC()) {
                                ju1Var2.lS5Rgt96tfkO();
                            }
                            return;
                        } finally {
                            ju1Var2.PxuCJdSBwIXG();
                        }
                        siVar.PsecLrZVVK61(r9Var, Y1f8riQaR6yg, ju1Var, IAToe7bXGz4N2);
                        Y1f8riQaR6yg.e9gEMXR7LXtO(true);
                        r9Var.RAsUl2FVSrh6();
                        Trace.endSection();
                        ju1Var4.TSizfFm2Yiuu();
                        ju1Var4.Y1f8riQaR6yg();
                        if (this.VhhvGxCb8gfr) {
                        }
                    } catch (Throwable th3) {
                        try {
                            Y1f8riQaR6yg.e9gEMXR7LXtO(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    ju1Var = ju1Var4;
                    a72 a72Var2 = this.cpQdD2nAriOS;
                    xp IAToe7bXGz4N22 = tf0Var.IAToe7bXGz4N();
                    Y1f8riQaR6yg = c72.Y1f8riQaR6yg(a72Var2).Y1f8riQaR6yg();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (siVar2.POWyO8hTM6YC.POWyO8hTM6YC() && this.ZbWwgt3aGe7A == null) {
                        ju1Var4.lS5Rgt96tfkO();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void gPXPFXrUH4XX() {
        t50 t50Var = t50.rtx2ld2ELZv4;
        AtomicReference atomicReference = this.wdg6QnbFHrFF;
        Object andSet = atomicReference.getAndSet(t50Var);
        if (cs0.wdg6QnbFHrFF(andSet, b51.lS5Rgt96tfkO) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            TSizfFm2Yiuu((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            mp.lS5Rgt96tfkO("corrupt pendingModifications drain: " + atomicReference);
            u9.Y1f8riQaR6yg();
            return;
        }
        for (Set set : (Set[]) andSet) {
            TSizfFm2Yiuu(set, false);
        }
    }

    public final void lS5Rgt96tfkO(Object obj, boolean z) {
        Object RAsUl2FVSrh6 = this.r3s1LDPKFs1S.RAsUl2FVSrh6(obj);
        if (RAsUl2FVSrh6 == null) {
            return;
        }
        boolean z2 = RAsUl2FVSrh6 instanceof w81;
        ls0 ls0Var = ls0.rtx2ld2ELZv4;
        w81 w81Var = this.QrzZRwfaDlRX;
        w81 w81Var2 = this.gPXPFXrUH4XX;
        v81 v81Var = this.EcgxDIVH5in8;
        if (!z2) {
            zs1 zs1Var = (zs1) RAsUl2FVSrh6;
            if (th0.rZjpSjn4zoMv(v81Var, obj, zs1Var) || zs1Var.lS5Rgt96tfkO(obj) == ls0Var) {
                return;
            }
            if (zs1Var.RAsUl2FVSrh6 == null || z) {
                w81Var.PxuCJdSBwIXG(zs1Var);
                return;
            } else {
                w81Var2.PxuCJdSBwIXG(zs1Var);
                return;
            }
        }
        w81 w81Var3 = (w81) RAsUl2FVSrh6;
        Object[] objArr = w81Var3.lS5Rgt96tfkO;
        long[] jArr = w81Var3.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zs1 zs1Var2 = (zs1) objArr[(i << 3) + i3];
                        if (!th0.rZjpSjn4zoMv(v81Var, obj, zs1Var2) && zs1Var2.lS5Rgt96tfkO(obj) != ls0Var) {
                            if (zs1Var2.RAsUl2FVSrh6 == null || z) {
                                w81Var.PxuCJdSBwIXG(zs1Var2);
                            } else {
                                w81Var2.PxuCJdSBwIXG(zs1Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void pnx5pC0XzaCw(Object obj) {
        zs1 ZbWwgt3aGe7A;
        int i;
        boolean z;
        int i2;
        tf0 tf0Var = this.aF05bpZJlKEP;
        if (tf0Var.e6tOsSdd2EFb > 0 || (ZbWwgt3aGe7A = tf0Var.ZbWwgt3aGe7A()) == null) {
            return;
        }
        int i3 = ZbWwgt3aGe7A.lS5Rgt96tfkO | 1;
        ZbWwgt3aGe7A.lS5Rgt96tfkO = i3;
        if ((i3 & 32) == 0) {
            l81 l81Var = ZbWwgt3aGe7A.a92UlCVFR9N8;
            if (l81Var == null) {
                l81Var = new l81();
                ZbWwgt3aGe7A.a92UlCVFR9N8 = l81Var;
            }
            int i4 = ZbWwgt3aGe7A.e9gEMXR7LXtO;
            int TSizfFm2Yiuu = l81Var.TSizfFm2Yiuu(obj);
            if (TSizfFm2Yiuu < 0) {
                TSizfFm2Yiuu = ~TSizfFm2Yiuu;
                i = -1;
            } else {
                i = l81Var.TSizfFm2Yiuu[TSizfFm2Yiuu];
            }
            l81Var.lS5Rgt96tfkO[TSizfFm2Yiuu] = obj;
            l81Var.TSizfFm2Yiuu[TSizfFm2Yiuu] = i4;
            if (i == ZbWwgt3aGe7A.e9gEMXR7LXtO) {
                z = true;
                this.e6tOsSdd2EFb.e9gEMXR7LXtO();
                if (z) {
                    if (obj instanceof q92) {
                        ((q92) obj).RAsUl2FVSrh6(1);
                    }
                    th0.rtx2ld2ELZv4(this.r3s1LDPKFs1S, obj, ZbWwgt3aGe7A);
                    if (obj instanceof ty) {
                        ty tyVar = (ty) obj;
                        sy OPXfSBeufaJ8 = tyVar.OPXfSBeufaJ8();
                        v81 v81Var = this.BRwzKIf41E4i;
                        th0.BjEWd04qc7Mw(v81Var, obj);
                        l81 l81Var2 = OPXfSBeufaJ8.e9gEMXR7LXtO;
                        Object[] objArr = l81Var2.lS5Rgt96tfkO;
                        long[] jArr = l81Var2.PxuCJdSBwIXG;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            p92 p92Var = (p92) objArr[(i5 << 3) + i8];
                                            i2 = i6;
                                            if (p92Var instanceof q92) {
                                                ((q92) p92Var).RAsUl2FVSrh6(1);
                                            }
                                            th0.rtx2ld2ELZv4(v81Var, p92Var, obj);
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i6 = i2;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Object obj2 = OPXfSBeufaJ8.a92UlCVFR9N8;
                        v81 v81Var2 = ZbWwgt3aGe7A.RAsUl2FVSrh6;
                        if (v81Var2 == null) {
                            v81Var2 = new v81();
                            ZbWwgt3aGe7A.RAsUl2FVSrh6 = v81Var2;
                        }
                        v81Var2.cpQdD2nAriOS(tyVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.e6tOsSdd2EFb.e9gEMXR7LXtO();
        if (z) {
        }
    }

    public final void r3s1LDPKFs1S() {
        Object obj = b51.lS5Rgt96tfkO;
        AtomicReference atomicReference = this.wdg6QnbFHrFF;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                mp.lS5Rgt96tfkO("pending composition has not been applied");
                u9.Y1f8riQaR6yg();
                return;
            }
            if (andSet instanceof Set) {
                TSizfFm2Yiuu((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                mp.lS5Rgt96tfkO("corrupt pendingModifications drain: " + atomicReference);
                u9.Y1f8riQaR6yg();
                return;
            }
            for (Set set : (Set[]) andSet) {
                TSizfFm2Yiuu(set, true);
            }
        }
    }

    public final void rtx2ld2ELZv4() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        v81 v81Var = this.BRwzKIf41E4i;
        long[] jArr3 = v81Var.PxuCJdSBwIXG;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = v81Var.lS5Rgt96tfkO[i10];
                            Object obj2 = v81Var.TSizfFm2Yiuu[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof w81;
                            j5 = j8;
                            v81 v81Var2 = this.r3s1LDPKFs1S;
                            if (z2) {
                                w81 w81Var = (w81) obj2;
                                Object[] objArr = w81Var.lS5Rgt96tfkO;
                                long[] jArr4 = w81Var.PxuCJdSBwIXG;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!v81Var2.TSizfFm2Yiuu((ty) objArr[i15])) {
                                                        w81Var.cpQdD2nAriOS(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = w81Var.RAsUl2FVSrh6();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !v81Var2.TSizfFm2Yiuu((ty) obj2);
                            }
                            if (z) {
                                v81Var.x50lh2ztY7Y5(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        w81 w81Var2 = this.gPXPFXrUH4XX;
        if (!w81Var2.rtx2ld2ELZv4()) {
            return;
        }
        Object[] objArr2 = w81Var2.lS5Rgt96tfkO;
        long[] jArr5 = w81Var2.PxuCJdSBwIXG;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((zs1) objArr2[i20]).RAsUl2FVSrh6 == null) {
                            w81Var2.cpQdD2nAriOS(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void wdg6QnbFHrFF(pe0 pe0Var) {
        try {
            synchronized (this.dgRBjINgWbAK) {
                r3s1LDPKFs1S();
                v81 v81Var = this.S9EYkSpbGuxq;
                this.S9EYkSpbGuxq = th0.cpQdD2nAriOS();
                try {
                    tf0 tf0Var = this.aF05bpZJlKEP;
                    q52 q52Var = this.S2OOm9zPNm0h;
                    if (!tf0Var.e9gEMXR7LXtO.POWyO8hTM6YC.POWyO8hTM6YC()) {
                        mp.PxuCJdSBwIXG("Expected applyChanges() to have been called");
                    }
                    tf0Var.gGoUzNp9JO5I = q52Var;
                    try {
                        tf0Var.r3s1LDPKFs1S(v81Var, pe0Var);
                    } finally {
                        tf0Var.gGoUzNp9JO5I = null;
                    }
                } catch (Throwable th) {
                    this.S9EYkSpbGuxq = v81Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                    ju1 ju1Var = this.jyegZNwi31qc;
                    try {
                        ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                        ju1Var.lS5Rgt96tfkO();
                        ju1Var.PxuCJdSBwIXG();
                    } catch (Throwable th3) {
                        ju1Var.PxuCJdSBwIXG();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                PxuCJdSBwIXG();
                throw th4;
            }
        }
    }

    public final void x50lh2ztY7Y5() {
        ju1 ju1Var;
        synchronized (this.dgRBjINgWbAK) {
            try {
                if (this.ZbWwgt3aGe7A != null) {
                    gp1.lS5Rgt96tfkO("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.cpQdD2nAriOS.OPXfSBeufaJ8 == 0;
                try {
                    try {
                        if (z) {
                            if (!this.x50lh2ztY7Y5.rtx2ld2ELZv4.RAsUl2FVSrh6()) {
                            }
                            this.r3s1LDPKFs1S.PxuCJdSBwIXG();
                            this.BRwzKIf41E4i.PxuCJdSBwIXG();
                            this.S9EYkSpbGuxq.PxuCJdSBwIXG();
                            this.XL4ISE6Oc65B.POWyO8hTM6YC.Pf0ThKz3j5YS();
                            this.RfyTYNmI9Srp.POWyO8hTM6YC.Pf0ThKz3j5YS();
                            tf0 tf0Var = this.aF05bpZJlKEP;
                            tf0Var.rZjpSjn4zoMv.clear();
                            tf0Var.RfyTYNmI9Srp.clear();
                            tf0Var.e9gEMXR7LXtO.POWyO8hTM6YC.Pf0ThKz3j5YS();
                            tf0Var.VhhvGxCb8gfr = null;
                            this.kpCQ9veP6n3I = 1;
                        }
                        ju1Var.RAsUl2FVSrh6(this.x50lh2ztY7Y5, this.aF05bpZJlKEP.IAToe7bXGz4N());
                        if (!z) {
                            a72 a72Var = this.cpQdD2nAriOS;
                            ju1 ju1Var2 = this.jyegZNwi31qc;
                            e72 Y1f8riQaR6yg = a72Var.Y1f8riQaR6yg();
                            try {
                                Y1f8riQaR6yg.r3s1LDPKFs1S(Y1f8riQaR6yg.EcgxDIVH5in8, new bf(8, ju1Var2, Y1f8riQaR6yg));
                                Y1f8riQaR6yg.e9gEMXR7LXtO(true);
                                this.OPXfSBeufaJ8.RAsUl2FVSrh6();
                                ju1Var.TSizfFm2Yiuu();
                            } catch (Throwable th) {
                                Y1f8riQaR6yg.e9gEMXR7LXtO(false);
                                throw th;
                            }
                        }
                        ju1Var.lS5Rgt96tfkO();
                        ju1Var.PxuCJdSBwIXG();
                        this.r3s1LDPKFs1S.PxuCJdSBwIXG();
                        this.BRwzKIf41E4i.PxuCJdSBwIXG();
                        this.S9EYkSpbGuxq.PxuCJdSBwIXG();
                        this.XL4ISE6Oc65B.POWyO8hTM6YC.Pf0ThKz3j5YS();
                        this.RfyTYNmI9Srp.POWyO8hTM6YC.Pf0ThKz3j5YS();
                        tf0 tf0Var2 = this.aF05bpZJlKEP;
                        tf0Var2.rZjpSjn4zoMv.clear();
                        tf0Var2.RfyTYNmI9Srp.clear();
                        tf0Var2.e9gEMXR7LXtO.POWyO8hTM6YC.Pf0ThKz3j5YS();
                        tf0Var2.VhhvGxCb8gfr = null;
                        this.kpCQ9veP6n3I = 1;
                    } catch (Throwable th2) {
                        ju1Var.PxuCJdSBwIXG();
                        throw th2;
                    }
                    ju1Var = this.jyegZNwi31qc;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
