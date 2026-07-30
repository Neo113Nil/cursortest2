package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vg0 implements le0 {
    public final /* synthetic */ le0 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ vg0(le0 le0Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = le0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        long j;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                q72 q72Var = (q72) obj;
                synchronized (s72.TSizfFm2Yiuu) {
                    j = s72.e9gEMXR7LXtO;
                    s72.e9gEMXR7LXtO = 1 + j;
                }
                return new bs1(j, q72Var, this.OPXfSBeufaJ8);
            default:
                return this.OPXfSBeufaJ8.OPXfSBeufaJ8(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
