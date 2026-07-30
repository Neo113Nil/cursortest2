package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cc {
    public final hc1 PxuCJdSBwIXG;
    public final uf1 lS5Rgt96tfkO;

    /* JADX WARN: Multi-variable type inference failed */
    public cc(hc1 hc1Var, uf1 uf1Var) {
        this.PxuCJdSBwIXG = hc1Var;
        this.lS5Rgt96tfkO = uf1Var;
        if ((hc1Var == null ? uf1Var : hc1Var) != null) {
            return;
        }
        u9.XL4ISE6Oc65B("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void PxuCJdSBwIXG(yQRudnv4La6p yqrudnv4la6p) {
        hc1 hc1Var = this.PxuCJdSBwIXG;
        if (hc1Var != null) {
            hc1.PxuCJdSBwIXG(hc1Var, (ac) yqrudnv4la6p.lS5Rgt96tfkO);
            return;
        }
        uf1 uf1Var = this.lS5Rgt96tfkO;
        if (uf1Var == null) {
            u9.rtx2ld2ELZv4("Unreachable");
            return;
        }
        bc bcVar = (bc) yqrudnv4la6p.PxuCJdSBwIXG;
        bcVar.getClass();
        of1 of1Var = new of1(bcVar, new pf1(bcVar, null));
        bcVar.PxuCJdSBwIXG.add(of1Var);
        hc1.PxuCJdSBwIXG(uf1Var.PxuCJdSBwIXG().TSizfFm2Yiuu, of1Var);
    }

    public final void lS5Rgt96tfkO(yQRudnv4La6p yqrudnv4la6p) {
        boolean isTerminated;
        if (this.PxuCJdSBwIXG != null) {
            ((ac) yqrudnv4la6p.lS5Rgt96tfkO).e9gEMXR7LXtO();
            return;
        }
        if (this.lS5Rgt96tfkO == null) {
            u9.rtx2ld2ELZv4("Unreachable");
            return;
        }
        bc bcVar = (bc) yqrudnv4la6p.PxuCJdSBwIXG;
        ArrayList arrayList = bcVar.PxuCJdSBwIXG;
        CopyOnWriteArrayList copyOnWriteArrayList = bcVar.TSizfFm2Yiuu;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((of1) obj).e9gEMXR7LXtO();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}
