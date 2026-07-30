package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class np2 extends pp2 implements Iterable, fu0 {
    public final List BRwzKIf41E4i;
    public final float OPXfSBeufaJ8;
    public final float QrzZRwfaDlRX;
    public final float cpQdD2nAriOS;
    public final float dgRBjINgWbAK;
    public final List gPXPFXrUH4XX;
    public final float r3s1LDPKFs1S;
    public final String rtx2ld2ELZv4;
    public final float wdg6QnbFHrFF;
    public final float x50lh2ztY7Y5;

    public np2(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.rtx2ld2ELZv4 = str;
        this.OPXfSBeufaJ8 = f;
        this.wdg6QnbFHrFF = f2;
        this.dgRBjINgWbAK = f3;
        this.x50lh2ztY7Y5 = f4;
        this.cpQdD2nAriOS = f5;
        this.r3s1LDPKFs1S = f6;
        this.QrzZRwfaDlRX = f7;
        this.gPXPFXrUH4XX = list;
        this.BRwzKIf41E4i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof np2)) {
            np2 np2Var = (np2) obj;
            return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, np2Var.rtx2ld2ELZv4) && this.OPXfSBeufaJ8 == np2Var.OPXfSBeufaJ8 && this.wdg6QnbFHrFF == np2Var.wdg6QnbFHrFF && this.dgRBjINgWbAK == np2Var.dgRBjINgWbAK && this.x50lh2ztY7Y5 == np2Var.x50lh2ztY7Y5 && this.cpQdD2nAriOS == np2Var.cpQdD2nAriOS && this.r3s1LDPKFs1S == np2Var.r3s1LDPKFs1S && this.QrzZRwfaDlRX == np2Var.QrzZRwfaDlRX && cs0.wdg6QnbFHrFF(this.gPXPFXrUH4XX, np2Var.gPXPFXrUH4XX) && cs0.wdg6QnbFHrFF(this.BRwzKIf41E4i, np2Var.BRwzKIf41E4i);
        }
        return false;
    }

    public final int hashCode() {
        return this.BRwzKIf41E4i.hashCode() + ((this.gPXPFXrUH4XX.hashCode() + o0.PxuCJdSBwIXG(this.QrzZRwfaDlRX, o0.PxuCJdSBwIXG(this.r3s1LDPKFs1S, o0.PxuCJdSBwIXG(this.cpQdD2nAriOS, o0.PxuCJdSBwIXG(this.x50lh2ztY7Y5, o0.PxuCJdSBwIXG(this.dgRBjINgWbAK, o0.PxuCJdSBwIXG(this.wdg6QnbFHrFF, o0.PxuCJdSBwIXG(this.OPXfSBeufaJ8, this.rtx2ld2ELZv4.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ol1(this);
    }
}
