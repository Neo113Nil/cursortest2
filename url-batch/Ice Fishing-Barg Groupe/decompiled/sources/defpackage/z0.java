package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ r1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ z0(r1 r1Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        r1 r1Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                da daVar = r1Var.gPXPFXrUH4XX;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!daVar.isEmpty()) {
                    try {
                        ((ae0) daVar.removeLast()).PxuCJdSBwIXG();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                r1Var.W7ceZOzvrRuI = false;
                MotionEvent motionEvent = r1Var.OYiFbU3x63rc;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    r1Var.J54yh1s3n4Aq(motionEvent);
                    return;
                } else {
                    u9.rtx2ld2ELZv4("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                r1.QrzZRwfaDlRX(r1Var.getRoot());
                return;
            default:
                r1.QrzZRwfaDlRX(r1Var.getRoot());
                return;
        }
    }
}
