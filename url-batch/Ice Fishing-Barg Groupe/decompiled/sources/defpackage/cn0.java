package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cn0 {
    public final ArrayList OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final int RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public boolean dgRBjINgWbAK;
    public final float e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;
    public final boolean rtx2ld2ELZv4;
    public final bn0 wdg6QnbFHrFF;

    public cn0(float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        int i3;
        String str = (i2 & 1) != 0 ? "" : "AutoMirrored.Filled.ArrowBack";
        if ((i2 & 32) != 0) {
            hl.Companion.getClass();
            j2 = hl.RAsUl2FVSrh6;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            sd.Companion.getClass();
            i3 = 5;
        } else {
            i3 = i;
        }
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = f;
        this.TSizfFm2Yiuu = f2;
        this.Y1f8riQaR6yg = f3;
        this.e9gEMXR7LXtO = f4;
        this.a92UlCVFR9N8 = j2;
        this.RAsUl2FVSrh6 = i3;
        this.rtx2ld2ELZv4 = z;
        ArrayList arrayList = new ArrayList();
        this.OPXfSBeufaJ8 = arrayList;
        bn0 bn0Var = new bn0(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.wdg6QnbFHrFF = bn0Var;
        arrayList.add(bn0Var);
    }

    public final en0 PxuCJdSBwIXG() {
        if (this.dgRBjINgWbAK) {
            ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.OPXfSBeufaJ8;
            if (arrayList.size() <= 1) {
                bn0 bn0Var = this.wdg6QnbFHrFF;
                en0 en0Var = new en0(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, new np2(bn0Var.PxuCJdSBwIXG, bn0Var.lS5Rgt96tfkO, bn0Var.TSizfFm2Yiuu, bn0Var.Y1f8riQaR6yg, bn0Var.e9gEMXR7LXtO, bn0Var.a92UlCVFR9N8, bn0Var.RAsUl2FVSrh6, bn0Var.rtx2ld2ELZv4, bn0Var.OPXfSBeufaJ8, bn0Var.wdg6QnbFHrFF), this.a92UlCVFR9N8, this.RAsUl2FVSrh6, this.rtx2ld2ELZv4);
                this.dgRBjINgWbAK = true;
                return en0Var;
            }
            if (this.dgRBjINgWbAK) {
                ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            bn0 bn0Var2 = (bn0) arrayList.remove(arrayList.size() - 1);
            ((bn0) arrayList.get(arrayList.size() - 1)).wdg6QnbFHrFF.add(new np2(bn0Var2.PxuCJdSBwIXG, bn0Var2.lS5Rgt96tfkO, bn0Var2.TSizfFm2Yiuu, bn0Var2.Y1f8riQaR6yg, bn0Var2.e9gEMXR7LXtO, bn0Var2.a92UlCVFR9N8, bn0Var2.RAsUl2FVSrh6, bn0Var2.rtx2ld2ELZv4, bn0Var2.OPXfSBeufaJ8, bn0Var2.wdg6QnbFHrFF));
        }
    }
}
