package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class kr {
    public static final ir Companion = new ir();
    public final tl PxuCJdSBwIXG;
    public final tl TSizfFm2Yiuu;
    public final float[] Y1f8riQaR6yg;
    public final tl lS5Rgt96tfkO;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kr(tl tlVar, tl tlVar2, int i) {
        this(tlVar2, r0, r1, r4);
        float[] fArr;
        long j = tlVar.lS5Rgt96tfkO;
        ml.Companion.getClass();
        tl QrzZRwfaDlRX = ml.PxuCJdSBwIXG(j, 12884901888L) ? ov2.QrzZRwfaDlRX(tlVar) : tlVar;
        tl QrzZRwfaDlRX2 = ml.PxuCJdSBwIXG(tlVar2.lS5Rgt96tfkO, 12884901888L) ? ov2.QrzZRwfaDlRX(tlVar2) : tlVar2;
        Companion.getClass();
        float[] fArr2 = b51.rtx2ld2ELZv4;
        ru1.Companion.getClass();
        if (i == 3) {
            boolean PxuCJdSBwIXG = ml.PxuCJdSBwIXG(tlVar.lS5Rgt96tfkO, 12884901888L);
            boolean PxuCJdSBwIXG2 = ml.PxuCJdSBwIXG(tlVar2.lS5Rgt96tfkO, 12884901888L);
            if ((!PxuCJdSBwIXG || !PxuCJdSBwIXG2) && (PxuCJdSBwIXG || PxuCJdSBwIXG2)) {
                gs2 gs2Var = ((lw1) (PxuCJdSBwIXG ? tlVar : tlVar2)).Y1f8riQaR6yg;
                float[] PxuCJdSBwIXG3 = PxuCJdSBwIXG ? gs2Var.PxuCJdSBwIXG() : fArr2;
                fArr2 = PxuCJdSBwIXG2 ? gs2Var.PxuCJdSBwIXG() : fArr2;
                fArr = new float[]{PxuCJdSBwIXG3[0] / fArr2[0], PxuCJdSBwIXG3[1] / fArr2[1], PxuCJdSBwIXG3[2] / fArr2[2]};
            }
        }
        fArr = null;
    }

    public long PxuCJdSBwIXG(long j) {
        float rtx2ld2ELZv4 = hl.rtx2ld2ELZv4(j);
        float RAsUl2FVSrh6 = hl.RAsUl2FVSrh6(j);
        float e9gEMXR7LXtO = hl.e9gEMXR7LXtO(j);
        float Y1f8riQaR6yg = hl.Y1f8riQaR6yg(j);
        tl tlVar = this.lS5Rgt96tfkO;
        long Y1f8riQaR6yg2 = tlVar.Y1f8riQaR6yg(rtx2ld2ELZv4, RAsUl2FVSrh6, e9gEMXR7LXtO);
        float intBitsToFloat = Float.intBitsToFloat((int) (Y1f8riQaR6yg2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Y1f8riQaR6yg2 & 4294967295L));
        float e9gEMXR7LXtO2 = tlVar.e9gEMXR7LXtO(rtx2ld2ELZv4, RAsUl2FVSrh6, e9gEMXR7LXtO);
        float[] fArr = this.Y1f8riQaR6yg;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e9gEMXR7LXtO2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.TSizfFm2Yiuu.a92UlCVFR9N8(f, f2, e9gEMXR7LXtO2, Y1f8riQaR6yg, this.PxuCJdSBwIXG);
    }

    public kr(tl tlVar, tl tlVar2, tl tlVar3, float[] fArr) {
        this.PxuCJdSBwIXG = tlVar;
        this.lS5Rgt96tfkO = tlVar2;
        this.TSizfFm2Yiuu = tlVar3;
        this.Y1f8riQaR6yg = fArr;
    }
}
