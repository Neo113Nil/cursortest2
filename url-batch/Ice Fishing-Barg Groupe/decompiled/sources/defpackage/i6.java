package defpackage;

import android.view.ActionMode;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class i6 implements Runnable {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ i6(Object obj, Object obj2, Object obj3, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
        this.dgRBjINgWbAK = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                k6 k6Var = (k6) this.OPXfSBeufaJ8;
                g6 g6Var = (g6) this.wdg6QnbFHrFF;
                h6 h6Var = (h6) this.dgRBjINgWbAK;
                ActionMode startActionMode = k6Var.PxuCJdSBwIXG.startActionMode(new u80(g6Var), 1);
                cs0.wdg6QnbFHrFF(k6Var.rtx2ld2ELZv4, startActionMode);
                if (startActionMode == null) {
                    h6Var.close();
                    return;
                }
                return;
            default:
                q3 q3Var = (q3) this.OPXfSBeufaJ8;
                bs0 bs0Var = (bs0) this.wdg6QnbFHrFF;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.dgRBjINgWbAK;
                try {
                    dc0 ZbWwgt3aGe7A = ov2.ZbWwgt3aGe7A(q3Var.PxuCJdSBwIXG);
                    if (ZbWwgt3aGe7A == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    cc0 cc0Var = (cc0) ((w40) ZbWwgt3aGe7A.lS5Rgt96tfkO);
                    synchronized (cc0Var.Y1f8riQaR6yg) {
                        cc0Var.a92UlCVFR9N8 = threadPoolExecutor;
                    }
                    ((w40) ZbWwgt3aGe7A.lS5Rgt96tfkO).PxuCJdSBwIXG(new z40(bs0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bs0Var.IAToe7bXGz4N(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
