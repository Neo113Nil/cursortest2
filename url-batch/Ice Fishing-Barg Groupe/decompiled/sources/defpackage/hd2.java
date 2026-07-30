package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hd2 implements x32 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final le0 TSizfFm2Yiuu;
    public final x32 lS5Rgt96tfkO;

    public /* synthetic */ hd2(x32 x32Var, le0 le0Var, int i) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = x32Var;
        this.TSizfFm2Yiuu = le0Var;
    }

    @Override // defpackage.x32
    public final Iterator iterator() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return new c80(this);
            default:
                return new zk2(this);
        }
    }
}
