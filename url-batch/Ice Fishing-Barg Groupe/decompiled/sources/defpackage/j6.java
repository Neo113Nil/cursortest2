package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j6 extends jc2 implements le0 {
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ af2 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(af2 af2Var, Object obj, bt btVar, int i) {
        super(1, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = af2Var;
        this.QrzZRwfaDlRX = obj;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.QrzZRwfaDlRX;
        af2 af2Var = this.r3s1LDPKFs1S;
        bt btVar = (bt) obj;
        switch (i) {
            case 0:
                return new j6((k6) af2Var, (qe2) obj2, btVar, 0).RfyTYNmI9Srp(no2Var);
            default:
                return new j6((ad) af2Var, (zc) obj2, btVar, 1).RfyTYNmI9Srp(no2Var);
        }
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        Handler handler;
        g6 g6Var;
        int i = this.x50lh2ztY7Y5;
        su suVar = su.rtx2ld2ELZv4;
        af2 af2Var = this.r3s1LDPKFs1S;
        Object obj2 = this.QrzZRwfaDlRX;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                k6 k6Var = (k6) af2Var;
                f82 f82Var = k6Var.e9gEMXR7LXtO;
                View view = k6Var.PxuCJdSBwIXG;
                int i2 = this.cpQdD2nAriOS;
                try {
                    if (i2 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        h6 h6Var = new h6();
                        qe2 qe2Var = (qe2) obj2;
                        g6 g6Var2 = new g6(h6Var, new d6(k6Var, qe2Var, 0), new d6(k6Var, qe2Var, 1), view);
                        le0 le0Var = k6Var.lS5Rgt96tfkO;
                        if (le0Var != null && (g6Var = (g6) le0Var.OPXfSBeufaJ8(g6Var2)) != null) {
                            g6Var2 = g6Var;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (myLooper == (handler2 != null ? handler2.getLooper() : null)) {
                            ActionMode startActionMode = view.startActionMode(new u80(g6Var2), 1);
                            if (startActionMode != null) {
                                k6Var.rtx2ld2ELZv4 = startActionMode;
                            }
                            return no2Var;
                        }
                        i6 i6Var = k6Var.OPXfSBeufaJ8;
                        if (i6Var == null) {
                            i6Var = new i6(k6Var, g6Var2, h6Var, 0);
                            k6Var.OPXfSBeufaJ8 = i6Var;
                        }
                        view.post(i6Var);
                        this.cpQdD2nAriOS = 1;
                        eg egVar = h6Var.PxuCJdSBwIXG;
                        egVar.getClass();
                        Object BjEWd04qc7Mw = eg.BjEWd04qc7Mw(egVar, this);
                        if (BjEWd04qc7Mw != suVar) {
                            BjEWd04qc7Mw = no2Var;
                        }
                        if (BjEWd04qc7Mw == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i2 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable = k6Var.wdg6QnbFHrFF;
                        if (runnable == null) {
                            runnable = new BRwzKIf41E4i(3, k6Var);
                            k6Var.wdg6QnbFHrFF = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = k6Var.rtx2ld2ELZv4;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    i6 i6Var2 = k6Var.OPXfSBeufaJ8;
                    if (i6Var2 != null) {
                        view.removeCallbacks(i6Var2);
                    }
                    k6Var.rtx2ld2ELZv4 = null;
                    return no2Var;
                } finally {
                    f82Var.PxuCJdSBwIXG();
                    Looper myLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (myLooper2 != (handler != null ? handler.getLooper() : null)) {
                        Runnable runnable2 = k6Var.wdg6QnbFHrFF;
                        if (runnable2 == null) {
                            runnable2 = new BRwzKIf41E4i(3, k6Var);
                            k6Var.wdg6QnbFHrFF = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = k6Var.rtx2ld2ELZv4;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    i6 i6Var3 = k6Var.OPXfSBeufaJ8;
                    if (i6Var3 != null) {
                        view.removeCallbacks(i6Var3);
                    }
                    k6Var.rtx2ld2ELZv4 = null;
                }
            default:
                zc zcVar = (zc) obj2;
                mj1 mj1Var = ((ad) af2Var).TSizfFm2Yiuu;
                int i3 = this.cpQdD2nAriOS;
                try {
                    if (i3 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        mj1Var.setValue(zcVar);
                        this.cpQdD2nAriOS = 1;
                        eg egVar2 = zcVar.lS5Rgt96tfkO;
                        egVar2.getClass();
                        Object BjEWd04qc7Mw2 = eg.BjEWd04qc7Mw(egVar2, this);
                        if (BjEWd04qc7Mw2 != suVar) {
                            BjEWd04qc7Mw2 = no2Var;
                        }
                        if (BjEWd04qc7Mw2 == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i3 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    return no2Var;
                } finally {
                    mj1Var.setValue(null);
                }
        }
    }
}
