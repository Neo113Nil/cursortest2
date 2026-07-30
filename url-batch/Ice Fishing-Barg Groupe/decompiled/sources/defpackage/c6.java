package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class c6 implements le0 {
    public final /* synthetic */ k6 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ c6(k6 k6Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = k6Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        int i2 = 2;
        no2 no2Var = no2.PxuCJdSBwIXG;
        k6 k6Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                ae0 ae0Var = (ae0) obj;
                View view = k6Var.PxuCJdSBwIXG;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ae0Var.PxuCJdSBwIXG();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new a1(2, ae0Var));
                    }
                }
                return no2Var;
            case 1:
                ActionMode actionMode = k6Var.rtx2ld2ELZv4;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return no2Var;
            case 2:
                ActionMode actionMode2 = k6Var.rtx2ld2ELZv4;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return no2Var;
            default:
                f82 f82Var = k6Var.e9gEMXR7LXtO;
                i72 i72Var = j72.Companion;
                l4 l4Var = f82Var.Y1f8riQaR6yg;
                i72Var.getClass();
                f82Var.rtx2ld2ELZv4 = i72.Y1f8riQaR6yg(l4Var);
                return new x2(i2, k6Var);
        }
    }
}
