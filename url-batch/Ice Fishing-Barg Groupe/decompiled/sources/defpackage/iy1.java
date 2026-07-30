package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iy1 extends ct implements w80 {
    public bt QrzZRwfaDlRX;
    public final int cpQdD2nAriOS;
    public final w80 dgRBjINgWbAK;
    public hu r3s1LDPKFs1S;
    public final hu x50lh2ztY7Y5;

    public iy1(w80 w80Var, hu huVar) {
        super(rm.wdg6QnbFHrFF, n50.rtx2ld2ELZv4);
        this.dgRBjINgWbAK = w80Var;
        this.x50lh2ztY7Y5 = huVar;
        this.cpQdD2nAriOS = ((Number) huVar.IAToe7bXGz4N(new jm(11, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(obj);
        if (PxuCJdSBwIXG != null) {
            this.r3s1LDPKFs1S = new i10(e9gEMXR7LXtO(), PxuCJdSBwIXG);
        }
        bt btVar = this.QrzZRwfaDlRX;
        if (btVar != null) {
            btVar.RAsUl2FVSrh6(obj);
        }
        return su.rtx2ld2ELZv4;
    }

    public final Object S9EYkSpbGuxq(bt btVar, Object obj) {
        hu e9gEMXR7LXtO = btVar.e9gEMXR7LXtO();
        ki0.ZbWwgt3aGe7A(e9gEMXR7LXtO);
        hu huVar = this.r3s1LDPKFs1S;
        if (huVar != e9gEMXR7LXtO) {
            if (huVar instanceof i10) {
                throw new IllegalStateException(ja2.i68hK7ahKtgp("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i10) huVar).OPXfSBeufaJ8 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) e9gEMXR7LXtO.IAToe7bXGz4N(new l4(13, this), 0)).intValue() != this.cpQdD2nAriOS) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.x50lh2ztY7Y5 + ",\n\t\tbut emission happened in " + e9gEMXR7LXtO + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.r3s1LDPKFs1S = e9gEMXR7LXtO;
        }
        this.QrzZRwfaDlRX = btVar;
        qe0 qe0Var = ky1.PxuCJdSBwIXG;
        w80 w80Var = this.dgRBjINgWbAK;
        w80Var.getClass();
        Object a92UlCVFR9N8 = qe0Var.a92UlCVFR9N8(w80Var, obj, this);
        if (!cs0.wdg6QnbFHrFF(a92UlCVFR9N8, su.rtx2ld2ELZv4)) {
            this.QrzZRwfaDlRX = null;
        }
        return a92UlCVFR9N8;
    }

    @Override // defpackage.nc, defpackage.tu
    public final tu TSizfFm2Yiuu() {
        bt btVar = this.QrzZRwfaDlRX;
        if (btVar instanceof tu) {
            return (tu) btVar;
        }
        return null;
    }

    @Override // defpackage.nc
    public final StackTraceElement XL4ISE6Oc65B() {
        return null;
    }

    @Override // defpackage.w80
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        try {
            Object S9EYkSpbGuxq = S9EYkSpbGuxq(btVar, obj);
            return S9EYkSpbGuxq == su.rtx2ld2ELZv4 ? S9EYkSpbGuxq : no2.PxuCJdSBwIXG;
        } catch (Throwable th) {
            this.r3s1LDPKFs1S = new i10(btVar.e9gEMXR7LXtO(), th);
            throw th;
        }
    }

    @Override // defpackage.ct, defpackage.bt
    public final hu e9gEMXR7LXtO() {
        hu huVar = this.r3s1LDPKFs1S;
        return huVar == null ? n50.rtx2ld2ELZv4 : huVar;
    }
}
