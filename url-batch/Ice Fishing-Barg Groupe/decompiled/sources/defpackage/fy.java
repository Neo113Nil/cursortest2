package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fy implements x32 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final xe0 TSizfFm2Yiuu;
    public final Object lS5Rgt96tfkO;

    public fy(CharSequence charSequence, pe0 pe0Var) {
        this.PxuCJdSBwIXG = 0;
        charSequence.getClass();
        this.lS5Rgt96tfkO = charSequence;
        this.TSizfFm2Yiuu = pe0Var;
    }

    @Override // defpackage.x32
    public final Iterator iterator() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return new ey(this);
            case 1:
                return new c80(this);
            default:
                return new lg0(this);
        }
    }

    public /* synthetic */ fy(Object obj, le0 le0Var, int i) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
        this.TSizfFm2Yiuu = le0Var;
    }
}
