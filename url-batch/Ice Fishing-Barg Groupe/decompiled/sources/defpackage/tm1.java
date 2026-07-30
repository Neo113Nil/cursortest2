package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tm1 implements rm1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final tm1 lS5Rgt96tfkO = new tm1(0);
    public static final tm1 TSizfFm2Yiuu = new tm1(1);

    public /* synthetic */ tm1(int i) {
        this.PxuCJdSBwIXG = i;
    }

    @Override // defpackage.rm1
    public final boolean PxuCJdSBwIXG() {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.rm1
    public final pm1 lS5Rgt96tfkO(View view, hy hyVar) {
        switch (this.PxuCJdSBwIXG) {
            case 0:
                return new sm1(new Magnifier(view));
            default:
                return new um1(new Magnifier(view));
        }
    }
}
