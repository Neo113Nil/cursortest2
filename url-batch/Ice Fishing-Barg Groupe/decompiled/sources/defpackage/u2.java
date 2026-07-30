package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements le0 {
    public final /* synthetic */ long OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ u2(int i, long j) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = j;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        bi biVar;
        Object uv1Var;
        int i = this.rtx2ld2ELZv4;
        long j = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                eh ehVar = (eh) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (ehVar.rtx2ld2ELZv4.Y1f8riQaR6yg() >> 32)) / 2.0f;
                break;
            case 1:
                sf sfVar = (sf) obj;
                le0 le0Var = sfVar.lS5Rgt96tfkO;
                if (le0Var != null && (biVar = sfVar.PxuCJdSBwIXG) != null) {
                    try {
                        uv1Var = le0Var.OPXfSBeufaJ8(Long.valueOf(j));
                    } catch (Throwable th) {
                        uv1Var = new uv1(th);
                    }
                    biVar.RAsUl2FVSrh6(uv1Var);
                    break;
                }
                break;
            default:
                ((l32) obj).PxuCJdSBwIXG(u22.PxuCJdSBwIXG, new t22(ji0.rtx2ld2ELZv4, this.OPXfSBeufaJ8, s22.OPXfSBeufaJ8, true));
                break;
        }
        return no2Var;
    }
}
