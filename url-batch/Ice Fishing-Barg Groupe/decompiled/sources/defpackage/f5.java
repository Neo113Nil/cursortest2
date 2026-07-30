package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f5 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ ap1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5(ap1 ap1Var, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = ap1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ap1 ap1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                bw0 dgRBjINgWbAK = ((bw0) obj).dgRBjINgWbAK();
                dgRBjINgWbAK.getClass();
                ap1Var.BRwzKIf41E4i(dgRBjINgWbAK);
                break;
            case 1:
                ap1Var.m3setPopupContentSizefhxjrPA(new ir0(((ir0) obj).PxuCJdSBwIXG));
                ap1Var.XL4ISE6Oc65B();
                break;
            default:
                ae0 ae0Var = (ae0) obj;
                Handler handler = ap1Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = ap1Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a1(3, ae0Var));
                        break;
                    }
                } else {
                    ae0Var.PxuCJdSBwIXG();
                    break;
                }
                break;
        }
        return no2Var;
    }
}
