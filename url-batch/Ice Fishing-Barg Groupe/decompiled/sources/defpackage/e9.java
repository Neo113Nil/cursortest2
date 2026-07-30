package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements OnBackInvokedCallback {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ e9(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    public final void onBackInvoked() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                ae0 ae0Var = (ae0) obj;
                if (ae0Var != null) {
                    ae0Var.PxuCJdSBwIXG();
                    break;
                }
                break;
            default:
                ((mf1) obj).PxuCJdSBwIXG();
                break;
        }
    }
}
