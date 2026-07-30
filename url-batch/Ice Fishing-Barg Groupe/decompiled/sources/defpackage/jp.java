package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jp {
    public static final ip Companion = new ip();
    public final tf0 PxuCJdSBwIXG;
    public int RAsUl2FVSrh6;
    public boolean TSizfFm2Yiuu;
    public int a92UlCVFR9N8;
    public si lS5Rgt96tfkO;
    public int x50lh2ztY7Y5;
    public final jr0 Y1f8riQaR6yg = new jr0();
    public boolean e9gEMXR7LXtO = true;
    public final ArrayList rtx2ld2ELZv4 = new ArrayList();
    public int OPXfSBeufaJ8 = -1;
    public int wdg6QnbFHrFF = -1;
    public int dgRBjINgWbAK = -1;

    public jp(tf0 tf0Var, si siVar) {
        this.PxuCJdSBwIXG = tf0Var;
        this.lS5Rgt96tfkO = siVar;
    }

    public final void PxuCJdSBwIXG() {
        TSizfFm2Yiuu();
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (arrayList.isEmpty()) {
            this.RAsUl2FVSrh6++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void TSizfFm2Yiuu() {
        int i = this.x50lh2ztY7Y5;
        if (i > 0) {
            int i2 = this.OPXfSBeufaJ8;
            if (i2 >= 0) {
                lS5Rgt96tfkO();
                ph1 ph1Var = this.lS5Rgt96tfkO.POWyO8hTM6YC;
                ph1Var.i68hK7ahKtgp(dh1.TSizfFm2Yiuu);
                int i3 = ph1Var.a92UlCVFR9N8 - ph1Var.TSizfFm2Yiuu[ph1Var.Y1f8riQaR6yg - 1].PxuCJdSBwIXG;
                int[] iArr = ph1Var.e9gEMXR7LXtO;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.OPXfSBeufaJ8 = -1;
            } else {
                int i4 = this.dgRBjINgWbAK;
                int i5 = this.wdg6QnbFHrFF;
                lS5Rgt96tfkO();
                ph1 ph1Var2 = this.lS5Rgt96tfkO.POWyO8hTM6YC;
                ph1Var2.i68hK7ahKtgp(zg1.TSizfFm2Yiuu);
                int i6 = ph1Var2.a92UlCVFR9N8 - ph1Var2.TSizfFm2Yiuu[ph1Var2.Y1f8riQaR6yg - 1].PxuCJdSBwIXG;
                int[] iArr2 = ph1Var2.e9gEMXR7LXtO;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.wdg6QnbFHrFF = -1;
                this.dgRBjINgWbAK = -1;
            }
            this.x50lh2ztY7Y5 = 0;
        }
    }

    public final void Y1f8riQaR6yg(boolean z) {
        z62 z62Var = this.PxuCJdSBwIXG.ozEBbv0hFTAB;
        int i = z ? z62Var.OPXfSBeufaJ8 : z62Var.RAsUl2FVSrh6;
        int i2 = i - this.a92UlCVFR9N8;
        if (i2 < 0) {
            mp.PxuCJdSBwIXG("Tried to seek backward");
        }
        if (i2 > 0) {
            ph1 ph1Var = this.lS5Rgt96tfkO.POWyO8hTM6YC;
            ph1Var.i68hK7ahKtgp(hg1.TSizfFm2Yiuu);
            ph1Var.e9gEMXR7LXtO[ph1Var.a92UlCVFR9N8 - ph1Var.TSizfFm2Yiuu[ph1Var.Y1f8riQaR6yg - 1].PxuCJdSBwIXG] = i2;
            this.a92UlCVFR9N8 = i;
        }
    }

    public final void e9gEMXR7LXtO(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                mp.PxuCJdSBwIXG("Invalid remove index " + i);
            }
            if (this.OPXfSBeufaJ8 == i) {
                this.x50lh2ztY7Y5 += i2;
                return;
            }
            TSizfFm2Yiuu();
            this.OPXfSBeufaJ8 = i;
            this.x50lh2ztY7Y5 = i2;
        }
    }

    public final void lS5Rgt96tfkO() {
        int i = this.RAsUl2FVSrh6;
        if (i > 0) {
            ph1 ph1Var = this.lS5Rgt96tfkO.POWyO8hTM6YC;
            ph1Var.i68hK7ahKtgp(lh1.TSizfFm2Yiuu);
            ph1Var.e9gEMXR7LXtO[ph1Var.a92UlCVFR9N8 - ph1Var.TSizfFm2Yiuu[ph1Var.Y1f8riQaR6yg - 1].PxuCJdSBwIXG] = i;
            this.RAsUl2FVSrh6 = 0;
        }
        ArrayList arrayList = this.rtx2ld2ELZv4;
        if (arrayList.isEmpty()) {
            return;
        }
        si siVar = this.lS5Rgt96tfkO;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        siVar.getClass();
        if (size != 0) {
            ph1 ph1Var2 = siVar.POWyO8hTM6YC;
            ph1Var2.i68hK7ahKtgp(og1.TSizfFm2Yiuu);
            sj0.gGoUzNp9JO5I(ph1Var2, 0, objArr);
        }
        arrayList.clear();
    }
}
