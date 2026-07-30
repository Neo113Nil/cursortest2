package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ko2 extends f02 {
    public final ThreadLocal r3s1LDPKFs1S;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ko2(bt btVar, hu huVar) {
        super(btVar, huVar.S2OOm9zPNm0h(r0) == null ? huVar.RfyTYNmI9Srp(r0) : huVar);
        fi fiVar = fi.dgRBjINgWbAK;
        this.r3s1LDPKFs1S = new ThreadLocal();
        if (btVar.e9gEMXR7LXtO().S2OOm9zPNm0h(ih0.x50lh2ztY7Y5) instanceof ju) {
            return;
        }
        Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(huVar, null);
        hq0.Pf0ThKz3j5YS(huVar, JHNfcAUfKc4G);
        uy1Qfkdvj4xZ(huVar, JHNfcAUfKc4G);
    }

    @Override // defpackage.f02, defpackage.et0
    public final void EcgxDIVH5in8(Object obj) {
        if (this.threadLocalIsSet) {
            vi1 vi1Var = (vi1) this.r3s1LDPKFs1S.get();
            if (vi1Var != null) {
                hq0.Pf0ThKz3j5YS((hu) vi1Var.rtx2ld2ELZv4, vi1Var.OPXfSBeufaJ8);
            }
            this.r3s1LDPKFs1S.remove();
        }
        Object ryVscX7ZL4Ux = hq0.ryVscX7ZL4Ux(obj);
        bt btVar = this.cpQdD2nAriOS;
        hu e9gEMXR7LXtO = btVar.e9gEMXR7LXtO();
        Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(e9gEMXR7LXtO, null);
        ko2 JHNfcAUfKc4G2 = JHNfcAUfKc4G != hq0.XL4ISE6Oc65B ? zv.JHNfcAUfKc4G(btVar, e9gEMXR7LXtO, JHNfcAUfKc4G) : null;
        try {
            this.cpQdD2nAriOS.RAsUl2FVSrh6(ryVscX7ZL4Ux);
            if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO, JHNfcAUfKc4G);
            }
        } catch (Throwable th) {
            if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO, JHNfcAUfKc4G);
            }
            throw th;
        }
    }

    public final boolean iSxsmagYqzHM() {
        boolean z = this.threadLocalIsSet && this.r3s1LDPKFs1S.get() == null;
        this.r3s1LDPKFs1S.remove();
        return !z;
    }

    public final void uy1Qfkdvj4xZ(hu huVar, Object obj) {
        this.threadLocalIsSet = true;
        this.r3s1LDPKFs1S.set(new vi1(huVar, obj));
    }
}
