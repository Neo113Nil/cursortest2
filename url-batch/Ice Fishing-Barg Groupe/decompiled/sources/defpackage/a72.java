package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a72 implements wp, Iterable, fu0 {
    public HashMap BRwzKIf41E4i;
    public int OPXfSBeufaJ8;
    public int QrzZRwfaDlRX;
    public c81 XL4ISE6Oc65B;
    public int dgRBjINgWbAK;
    public boolean r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;
    public int[] rtx2ld2ELZv4 = new int[0];
    public Object[] wdg6QnbFHrFF = new Object[0];
    public final Object cpQdD2nAriOS = new Object();
    public ArrayList gPXPFXrUH4XX = new ArrayList();

    public final int PxuCJdSBwIXG(nf0 nf0Var) {
        if (this.r3s1LDPKFs1S) {
            mp.PxuCJdSBwIXG("Use active SlotWriter to determine anchor location instead");
        }
        if (!nf0Var.PxuCJdSBwIXG()) {
            gp1.PxuCJdSBwIXG("Anchor refers to a group that was removed");
        }
        return nf0Var.PxuCJdSBwIXG;
    }

    public final z62 TSizfFm2Yiuu() {
        if (this.r3s1LDPKFs1S) {
            u9.rtx2ld2ELZv4("Cannot read while a writer is pending");
            return null;
        }
        this.x50lh2ztY7Y5++;
        return new z62(this);
    }

    public final e72 Y1f8riQaR6yg() {
        if (this.r3s1LDPKFs1S) {
            mp.PxuCJdSBwIXG("Cannot start a writer when another writer is pending");
        }
        if (this.x50lh2ztY7Y5 > 0) {
            mp.PxuCJdSBwIXG("Cannot start a writer when a reader is pending");
        }
        this.r3s1LDPKFs1S = true;
        this.QrzZRwfaDlRX++;
        return new e72(this);
    }

    public final vf0 a92UlCVFR9N8(int i) {
        int i2;
        ArrayList arrayList;
        int e9gEMXR7LXtO;
        HashMap hashMap = this.BRwzKIf41E4i;
        if (hashMap != null) {
            if (this.r3s1LDPKFs1S) {
                mp.PxuCJdSBwIXG("use active SlotWriter to crate an anchor for location instead");
            }
            nf0 nf0Var = (i < 0 || i >= (i2 = this.OPXfSBeufaJ8) || (e9gEMXR7LXtO = c72.e9gEMXR7LXtO((arrayList = this.gPXPFXrUH4XX), i, i2)) < 0) ? null : (nf0) arrayList.get(e9gEMXR7LXtO);
            if (nf0Var != null) {
                return (vf0) hashMap.get(nf0Var);
            }
        }
        return null;
    }

    public final boolean e9gEMXR7LXtO(nf0 nf0Var) {
        int e9gEMXR7LXtO;
        return nf0Var.PxuCJdSBwIXG() && (e9gEMXR7LXtO = c72.e9gEMXR7LXtO(this.gPXPFXrUH4XX, nf0Var.PxuCJdSBwIXG, this.OPXfSBeufaJ8)) >= 0 && cs0.wdg6QnbFHrFF(this.gPXPFXrUH4XX.get(e9gEMXR7LXtO), nf0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fi0(this, 0, this.OPXfSBeufaJ8);
    }

    public final void lS5Rgt96tfkO() {
        this.BRwzKIf41E4i = new HashMap();
    }
}
