package f;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import c6.i;
import d.c0;
import d.d0;
import d.x;
import d.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f3997a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f3998b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(i iVar, c0 c0Var) {
        this.f3997a = iVar;
        this.f3998b = c0Var;
        if ((iVar == null ? c0Var : iVar) != null) {
            return;
        }
        a1.e("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(d2.b bVar) {
        i iVar = this.f3997a;
        if (iVar != null) {
            i.a(iVar, (a) bVar.f3337b);
            return;
        }
        c0 c0Var = this.f3998b;
        if (c0Var == null) {
            i0.l("Unreachable");
            return;
        }
        d0 d0Var = (d0) bVar.f3336a;
        d0Var.getClass();
        x xVar = new x(d0Var, new y(d0Var, null));
        d0Var.f3219a.add(xVar);
        i.a(c0Var.a().f3209c, xVar);
    }

    public final void b(d2.b bVar) {
        boolean isTerminated;
        if (this.f3997a != null) {
            ((a) bVar.f3337b).e();
            return;
        }
        if (this.f3998b == null) {
            i0.l("Unreachable");
            return;
        }
        d0 d0Var = (d0) bVar.f3336a;
        ArrayList arrayList = d0Var.f3219a;
        CopyOnWriteArrayList copyOnWriteArrayList = d0Var.f3221c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((x) obj).e();
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
                            if (i3 == 0) {
                                executorService.shutdownNow();
                                i3 = 1;
                            }
                        }
                    }
                    if (i3 != 0) {
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
