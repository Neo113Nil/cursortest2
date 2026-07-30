package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class uk2 implements le0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ uk2(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                hy1 hy1Var = (hy1) obj;
                hy1Var.getClass();
                return Boolean.valueOf(hy1Var.tmVwIGCQF4zR());
            case 1:
                x12 x12Var = (x12) obj;
                long j = x12Var.a92UlCVFR9N8;
                f82 f82Var = x12Var.rtx2ld2ELZv4;
                if (f82Var != null) {
                    f82Var.Y1f8riQaR6yg(x12Var, bs0.pnx5pC0XzaCw, x12Var.RAsUl2FVSrh6);
                }
                long j2 = x12Var.a92UlCVFR9N8;
                if (j != j2) {
                    q12 q12Var = x12Var.QrzZRwfaDlRX;
                    if (q12Var != null) {
                        if (q12Var.PxuCJdSBwIXG > j2) {
                            x12Var.RfyTYNmI9Srp();
                        } else {
                            q12Var.RAsUl2FVSrh6 = j2;
                            if (q12Var.lS5Rgt96tfkO == null) {
                                q12Var.rtx2ld2ELZv4 = b51.JHNfcAUfKc4G((1.0d - q12Var.e9gEMXR7LXtO.PxuCJdSBwIXG(0)) * x12Var.a92UlCVFR9N8);
                            }
                        }
                    } else if (j2 != 0) {
                        x12Var.VhhvGxCb8gfr();
                    }
                }
                return no2.PxuCJdSBwIXG;
            case 2:
                hy1 hy1Var2 = (hy1) obj;
                hy1Var2.getClass();
                n42 n42Var = new n42();
                while (hy1Var2.tmVwIGCQF4zR()) {
                    n42Var.add(Integer.valueOf((int) hy1Var2.getLong(0)));
                }
                return ng0.a92UlCVFR9N8(n42Var);
            case 3:
                return new k8(((Float) obj).floatValue());
            case 4:
                return new k8(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((k8) obj).PxuCJdSBwIXG);
            case 6:
                return new k8(((k10) obj).rtx2ld2ELZv4);
            case 7:
                return new k10(((k8) obj).PxuCJdSBwIXG);
            case 8:
                n10 n10Var = (n10) obj;
                return new l8(Float.intBitsToFloat((int) (n10Var.PxuCJdSBwIXG >> 32)), Float.intBitsToFloat((int) (4294967295L & n10Var.PxuCJdSBwIXG)));
            case 9:
                float f = ((l8) obj).PxuCJdSBwIXG;
                return new n10((Float.floatToRawIntBits(r9.lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 10:
                a62 a62Var = (a62) obj;
                return new l8(Float.intBitsToFloat((int) (a62Var.PxuCJdSBwIXG >> 32)), Float.intBitsToFloat((int) (4294967295L & a62Var.PxuCJdSBwIXG)));
            case 11:
                float f2 = ((l8) obj).PxuCJdSBwIXG;
                return new a62((Float.floatToRawIntBits(r9.lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 12:
                bf1 bf1Var = (bf1) obj;
                return new l8(Float.intBitsToFloat((int) (bf1Var.PxuCJdSBwIXG >> 32)), Float.intBitsToFloat((int) (4294967295L & bf1Var.PxuCJdSBwIXG)));
            case 13:
                float f3 = ((l8) obj).PxuCJdSBwIXG;
                return new bf1((Float.floatToRawIntBits(r9.lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
            case 14:
                long j3 = ((wq0) obj).PxuCJdSBwIXG;
                return new l8((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 15:
                l8 l8Var = (l8) obj;
                return new wq0((Math.round(l8Var.lS5Rgt96tfkO) & 4294967295L) | (Math.round(l8Var.PxuCJdSBwIXG) << 32));
            case 16:
                long j4 = ((ir0) obj).PxuCJdSBwIXG;
                return new l8((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 17:
                l8 l8Var2 = (l8) obj;
                int round = Math.round(l8Var2.PxuCJdSBwIXG);
                if (round < 0) {
                    round = 0;
                }
                return new ir0((round << 32) | ((Math.round(l8Var2.lS5Rgt96tfkO) >= 0 ? r9 : 0) & 4294967295L));
            case 18:
                qt1 qt1Var = (qt1) obj;
                return new n8(qt1Var.PxuCJdSBwIXG, qt1Var.lS5Rgt96tfkO, qt1Var.TSizfFm2Yiuu, qt1Var.Y1f8riQaR6yg);
            case 19:
                n8 n8Var = (n8) obj;
                return new qt1(n8Var.PxuCJdSBwIXG, n8Var.lS5Rgt96tfkO, n8Var.TSizfFm2Yiuu, n8Var.Y1f8riQaR6yg);
            case 20:
                return Float.valueOf(((k8) obj).PxuCJdSBwIXG);
            default:
                eu2 eu2Var = (eu2) obj;
                eu2Var.getClass();
                return eu2Var;
        }
    }
}
