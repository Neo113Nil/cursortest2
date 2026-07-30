package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i72 {
    public static j72 PxuCJdSBwIXG() {
        return (j72) s72.lS5Rgt96tfkO.QrzZRwfaDlRX();
    }

    public static b91 RAsUl2FVSrh6(r3s1LDPKFs1S r3s1ldpkfs1s, e9gEMXR7LXtO e9gemxr7lxto) {
        b91 aF05bpZJlKEP;
        j72 OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
        b91 b91Var = OPXfSBeufaJ8 instanceof b91 ? (b91) OPXfSBeufaJ8 : null;
        if (b91Var != null && (aF05bpZJlKEP = b91Var.aF05bpZJlKEP(r3s1ldpkfs1s, e9gemxr7lxto)) != null) {
            return aF05bpZJlKEP;
        }
        u9.rtx2ld2ELZv4("Cannot create a mutable snapshot of an read-only snapshot");
        return null;
    }

    public static Object TSizfFm2Yiuu(qy qyVar, ae0 ae0Var) {
        j72 kl2Var;
        j72 j72Var = (j72) s72.lS5Rgt96tfkO.QrzZRwfaDlRX();
        if (j72Var instanceof kl2) {
            kl2 kl2Var2 = (kl2) j72Var;
            if (kl2Var2.EcgxDIVH5in8 == xi0.VhhvGxCb8gfr()) {
                le0 le0Var = kl2Var2.XL4ISE6Oc65B;
                le0 le0Var2 = kl2Var2.RfyTYNmI9Srp;
                try {
                    ((kl2) j72Var).XL4ISE6Oc65B = s72.wdg6QnbFHrFF(qyVar, le0Var, true);
                    ((kl2) j72Var).RfyTYNmI9Srp = le0Var2;
                    return ae0Var.PxuCJdSBwIXG();
                } finally {
                    kl2Var2.XL4ISE6Oc65B = le0Var;
                    kl2Var2.RfyTYNmI9Srp = le0Var2;
                }
            }
        }
        if (j72Var == null || (j72Var instanceof b91)) {
            kl2Var = new kl2(j72Var instanceof b91 ? (b91) j72Var : null, qyVar, null, true, false);
        } else {
            kl2Var = j72Var.S9EYkSpbGuxq(qyVar);
        }
        try {
            j72 wdg6QnbFHrFF = kl2Var.wdg6QnbFHrFF();
            try {
                Object PxuCJdSBwIXG = ae0Var.PxuCJdSBwIXG();
                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                kl2Var.TSizfFm2Yiuu();
                return PxuCJdSBwIXG;
            } catch (Throwable th) {
                j72.BRwzKIf41E4i(wdg6QnbFHrFF);
                throw th;
            }
        } catch (Throwable th2) {
            kl2Var.TSizfFm2Yiuu();
            throw th2;
        }
    }

    public static rf1 Y1f8riQaR6yg(pe0 pe0Var) {
        s72.Y1f8riQaR6yg(s72.PxuCJdSBwIXG);
        synchronized (s72.TSizfFm2Yiuu) {
            s72.rtx2ld2ELZv4 = zk.P6VAkUObIv30(s72.rtx2ld2ELZv4, pe0Var);
        }
        return new rf1(pe0Var);
    }

    public static void a92UlCVFR9N8() {
        boolean z;
        synchronized (s72.TSizfFm2Yiuu) {
            w81 w81Var = s72.wdg6QnbFHrFF.rtx2ld2ELZv4;
            z = false;
            if (w81Var != null) {
                if (w81Var.rtx2ld2ELZv4()) {
                    z = true;
                }
            }
        }
        if (z) {
            s72.Y1f8riQaR6yg(s72.PxuCJdSBwIXG);
        }
    }

    public static void e9gEMXR7LXtO(j72 j72Var, j72 j72Var2, le0 le0Var) {
        if (j72Var != j72Var2) {
            j72Var2.getClass();
            j72.BRwzKIf41E4i(j72Var);
            j72Var2.TSizfFm2Yiuu();
        } else if (j72Var instanceof kl2) {
            ((kl2) j72Var).XL4ISE6Oc65B = le0Var;
        } else if (j72Var instanceof ll2) {
            ((ll2) j72Var).rtx2ld2ELZv4 = le0Var;
        } else {
            u9.BRwzKIf41E4i(j72Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static j72 lS5Rgt96tfkO(j72 j72Var) {
        if (j72Var instanceof kl2) {
            kl2 kl2Var = (kl2) j72Var;
            if (kl2Var.EcgxDIVH5in8 == xi0.VhhvGxCb8gfr()) {
                kl2Var.XL4ISE6Oc65B = null;
                return j72Var;
            }
        }
        if (j72Var instanceof ll2) {
            ll2 ll2Var = (ll2) j72Var;
            if (ll2Var.OPXfSBeufaJ8 == xi0.VhhvGxCb8gfr()) {
                ll2Var.rtx2ld2ELZv4 = null;
                return j72Var;
            }
        }
        j72 a92UlCVFR9N8 = s72.a92UlCVFR9N8(j72Var, null, false);
        a92UlCVFR9N8.wdg6QnbFHrFF();
        return a92UlCVFR9N8;
    }
}
