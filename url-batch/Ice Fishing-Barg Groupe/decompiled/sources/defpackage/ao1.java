package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ao1 {
    public ao1 BRwzKIf41E4i;
    public final int OPXfSBeufaJ8;
    public final long PxuCJdSBwIXG;
    public boolean QrzZRwfaDlRX;
    public final long RAsUl2FVSrh6;
    public final long TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public final ArrayList cpQdD2nAriOS;
    public final float dgRBjINgWbAK;
    public final float e9gEMXR7LXtO;
    public boolean gPXPFXrUH4XX;
    public final long lS5Rgt96tfkO;
    public final long r3s1LDPKFs1S;
    public final boolean rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;
    public final long x50lh2ztY7Y5;

    public ao1(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = j3;
        this.Y1f8riQaR6yg = z;
        this.e9gEMXR7LXtO = f;
        this.a92UlCVFR9N8 = j4;
        this.RAsUl2FVSrh6 = j5;
        this.rtx2ld2ELZv4 = z2;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = j6;
        this.dgRBjINgWbAK = f2;
        this.x50lh2ztY7Y5 = j7;
        bf1.Companion.getClass();
        this.r3s1LDPKFs1S = 0L;
        this.QrzZRwfaDlRX = z3;
        this.gPXPFXrUH4XX = z3;
    }

    public final void PxuCJdSBwIXG() {
        ao1 ao1Var = this.BRwzKIf41E4i;
        if (ao1Var == null) {
            this.QrzZRwfaDlRX = true;
            this.gPXPFXrUH4XX = true;
        } else if (ao1Var != null) {
            ao1Var.PxuCJdSBwIXG();
        }
    }

    public final boolean lS5Rgt96tfkO() {
        ao1 ao1Var = this.BRwzKIf41E4i;
        return ao1Var != null ? ao1Var.lS5Rgt96tfkO() : this.QrzZRwfaDlRX || this.gPXPFXrUH4XX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) vi0.ngxnMNrpiKat(this.PxuCJdSBwIXG));
        sb.append(", uptimeMillis=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", position=");
        sb.append((Object) bf1.RAsUl2FVSrh6(this.TSizfFm2Yiuu));
        sb.append(", pressed=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", pressure=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", previousUptimeMillis=");
        sb.append(this.a92UlCVFR9N8);
        sb.append(", previousPosition=");
        sb.append((Object) bf1.RAsUl2FVSrh6(this.RAsUl2FVSrh6));
        sb.append(", previousPressed=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", isConsumed=");
        sb.append(lS5Rgt96tfkO());
        sb.append(", type=");
        sb.append((Object) ho1.PxuCJdSBwIXG(this.OPXfSBeufaJ8));
        sb.append(", historical=");
        Object obj = this.cpQdD2nAriOS;
        if (obj == null) {
            obj = p50.rtx2ld2ELZv4;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) bf1.RAsUl2FVSrh6(this.wdg6QnbFHrFF));
        sb.append(", scaleFactor=");
        sb.append(this.dgRBjINgWbAK);
        sb.append(", panOffset=");
        sb.append((Object) bf1.RAsUl2FVSrh6(this.x50lh2ztY7Y5));
        sb.append(')');
        return sb.toString();
    }

    public ao1(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.cpQdD2nAriOS = arrayList;
        this.r3s1LDPKFs1S = j8;
    }
}
