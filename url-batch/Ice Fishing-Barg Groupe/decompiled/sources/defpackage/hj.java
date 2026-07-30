package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hj extends a22 {
    public final eg RAsUl2FVSrh6;
    public final /* synthetic */ AtomicReferenceArray rtx2ld2ELZv4;

    public hj(long j, hj hjVar, eg egVar, int i) {
        super(j, hjVar, i);
        this.RAsUl2FVSrh6 = egVar;
        this.rtx2ld2ELZv4 = new AtomicReferenceArray(gg.lS5Rgt96tfkO * 2);
    }

    public final Object BRwzKIf41E4i(int i) {
        return this.rtx2ld2ELZv4.get((i * 2) + 1);
    }

    public final void EcgxDIVH5in8(int i, Object obj) {
        this.rtx2ld2ELZv4.set((i * 2) + 1, obj);
    }

    public final void RfyTYNmI9Srp(int i, Object obj) {
        this.rtx2ld2ELZv4.set(i * 2, obj);
    }

    public final void XL4ISE6Oc65B(int i, boolean z) {
        if (z) {
            eg egVar = this.RAsUl2FVSrh6;
            egVar.getClass();
            egVar.gGoUzNp9JO5I((this.e9gEMXR7LXtO * gg.lS5Rgt96tfkO) + i);
        }
        r3s1LDPKFs1S();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        RfyTYNmI9Srp(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void cpQdD2nAriOS(int i, hu huVar) {
        int i2 = gg.lS5Rgt96tfkO;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.rtx2ld2ELZv4.get(i * 2);
        while (true) {
            Object BRwzKIf41E4i = BRwzKIf41E4i(i);
            boolean z2 = BRwzKIf41E4i instanceof xr2;
            eg egVar = this.RAsUl2FVSrh6;
            if (z2 || (BRwzKIf41E4i instanceof yr2)) {
                if (gPXPFXrUH4XX(i, BRwzKIf41E4i, z ? gg.wdg6QnbFHrFF : gg.dgRBjINgWbAK)) {
                    RfyTYNmI9Srp(i, null);
                    XL4ISE6Oc65B(i, !z);
                    if (z) {
                        egVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (BRwzKIf41E4i == gg.wdg6QnbFHrFF || BRwzKIf41E4i == gg.dgRBjINgWbAK) {
                    break;
                }
                if (BRwzKIf41E4i != gg.RAsUl2FVSrh6 && BRwzKIf41E4i != gg.a92UlCVFR9N8) {
                    if (BRwzKIf41E4i == gg.OPXfSBeufaJ8 || BRwzKIf41E4i == gg.Y1f8riQaR6yg || BRwzKIf41E4i == gg.x50lh2ztY7Y5) {
                        return;
                    }
                    u9.BRwzKIf41E4i(BRwzKIf41E4i, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean gPXPFXrUH4XX(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.rtx2ld2ELZv4;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // defpackage.a22
    public final int x50lh2ztY7Y5() {
        return gg.lS5Rgt96tfkO;
    }
}
