package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l1 extends kv0 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ r1 wdg6QnbFHrFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(r1 r1Var, int i) {
        super(1);
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = r1Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.OPXfSBeufaJ8;
        no2 no2Var = no2.PxuCJdSBwIXG;
        r1 r1Var = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                ((qa0) r1Var.getFocusOwner()).RAsUl2FVSrh6(((ga0) obj).PxuCJdSBwIXG, false);
                return no2Var;
            case 1:
                ae0 ae0Var = (ae0) obj;
                r1Var.getUncaughtExceptionHandler$ui();
                Handler handler = r1Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ae0Var.PxuCJdSBwIXG();
                } else {
                    Handler handler2 = r1Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a1(1, ae0Var));
                    }
                }
                return no2Var;
            default:
                return new a5(r1Var, r1Var.getTextInputService(), (ru) obj);
        }
    }
}
