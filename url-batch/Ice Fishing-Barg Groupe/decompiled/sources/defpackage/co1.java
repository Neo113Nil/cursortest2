package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class co1 {
    public final ArrayList OPXfSBeufaJ8;
    public final long PxuCJdSBwIXG;
    public final int RAsUl2FVSrh6;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final long cpQdD2nAriOS;
    public final float dgRBjINgWbAK;
    public final boolean e9gEMXR7LXtO;
    public final long lS5Rgt96tfkO;
    public final boolean rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;
    public final long x50lh2ztY7Y5;

    public co1(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = j3;
        this.Y1f8riQaR6yg = j4;
        this.e9gEMXR7LXtO = z;
        this.a92UlCVFR9N8 = f;
        this.RAsUl2FVSrh6 = i;
        this.rtx2ld2ELZv4 = z2;
        this.OPXfSBeufaJ8 = arrayList;
        this.wdg6QnbFHrFF = j5;
        this.dgRBjINgWbAK = f2;
        this.x50lh2ztY7Y5 = j6;
        this.cpQdD2nAriOS = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1)) {
            return false;
        }
        co1 co1Var = (co1) obj;
        return vi0.gPXPFXrUH4XX(this.PxuCJdSBwIXG, co1Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == co1Var.lS5Rgt96tfkO && bf1.lS5Rgt96tfkO(this.TSizfFm2Yiuu, co1Var.TSizfFm2Yiuu) && bf1.lS5Rgt96tfkO(this.Y1f8riQaR6yg, co1Var.Y1f8riQaR6yg) && this.e9gEMXR7LXtO == co1Var.e9gEMXR7LXtO && Float.compare(this.a92UlCVFR9N8, co1Var.a92UlCVFR9N8) == 0 && this.RAsUl2FVSrh6 == co1Var.RAsUl2FVSrh6 && this.rtx2ld2ELZv4 == co1Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8.equals(co1Var.OPXfSBeufaJ8) && bf1.lS5Rgt96tfkO(this.wdg6QnbFHrFF, co1Var.wdg6QnbFHrFF) && Float.compare(this.dgRBjINgWbAK, co1Var.dgRBjINgWbAK) == 0 && bf1.lS5Rgt96tfkO(this.x50lh2ztY7Y5, co1Var.x50lh2ztY7Y5) && bf1.lS5Rgt96tfkO(this.cpQdD2nAriOS, co1Var.cpQdD2nAriOS);
    }

    public final int hashCode() {
        return Long.hashCode(this.cpQdD2nAriOS) + o0.TSizfFm2Yiuu(o0.PxuCJdSBwIXG(this.dgRBjINgWbAK, o0.TSizfFm2Yiuu((this.OPXfSBeufaJ8.hashCode() + o0.Y1f8riQaR6yg(o0.lS5Rgt96tfkO(this.RAsUl2FVSrh6, o0.PxuCJdSBwIXG(this.a92UlCVFR9N8, o0.Y1f8riQaR6yg(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO), 31, this.TSizfFm2Yiuu), 31, this.Y1f8riQaR6yg), 31, this.e9gEMXR7LXtO), 31), 31), 31, this.rtx2ld2ELZv4)) * 31, 31, this.wdg6QnbFHrFF), 31), 31, this.x50lh2ztY7Y5);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) vi0.ngxnMNrpiKat(this.PxuCJdSBwIXG)) + ", uptime=" + this.lS5Rgt96tfkO + ", positionOnScreen=" + ((Object) bf1.RAsUl2FVSrh6(this.TSizfFm2Yiuu)) + ", position=" + ((Object) bf1.RAsUl2FVSrh6(this.Y1f8riQaR6yg)) + ", down=" + this.e9gEMXR7LXtO + ", pressure=" + this.a92UlCVFR9N8 + ", type=" + ((Object) ho1.PxuCJdSBwIXG(this.RAsUl2FVSrh6)) + ", activeHover=" + this.rtx2ld2ELZv4 + ", historical=" + this.OPXfSBeufaJ8 + ", scrollDelta=" + ((Object) bf1.RAsUl2FVSrh6(this.wdg6QnbFHrFF)) + ", scaleGestureFactor=" + this.dgRBjINgWbAK + ", panGestureOffset=" + ((Object) bf1.RAsUl2FVSrh6(this.x50lh2ztY7Y5)) + ", originalEventPosition=" + ((Object) bf1.RAsUl2FVSrh6(this.cpQdD2nAriOS)) + ')';
    }
}
