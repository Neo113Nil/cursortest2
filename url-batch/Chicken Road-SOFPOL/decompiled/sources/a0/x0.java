package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x0 implements m0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f172c;

    public /* synthetic */ x0(int i, Object obj, Object obj2) {
        this.f170a = i;
        this.f171b = obj;
        this.f172c = obj2;
    }

    @Override // m0.g0
    public final void a() {
        boolean isTerminated;
        int i = this.f170a;
        Object obj = this.f172c;
        Object obj2 = this.f171b;
        switch (i) {
            case 0:
                ((y0) obj2).f180f.j(obj);
                return;
            case 1:
                d.a aVar = (d.a) obj2;
                c.d dVar = (c.d) obj;
                if (aVar.f2044a != null) {
                    dVar.f1541b.b();
                    return;
                }
                if (aVar.f2045b == null) {
                    throw new IllegalStateException("Unreachable");
                }
                b.u uVar = dVar.f1540a;
                ArrayList arrayList = uVar.f1021a;
                CopyOnWriteArrayList copyOnWriteArrayList = uVar.f1023c;
                Iterator it = copyOnWriteArrayList.iterator();
                q6.i.d(it, "iterator(...)");
                while (true) {
                    int i8 = 0;
                    if (!it.hasNext()) {
                        copyOnWriteArrayList.clear();
                        int size = arrayList.size();
                        while (i8 < size) {
                            Object obj3 = arrayList.get(i8);
                            i8++;
                            ((b.o) obj3).b();
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
                                    if (i8 == 0) {
                                        executorService.shutdownNow();
                                        i8 = 1;
                                    }
                                }
                            }
                            if (i8 != 0) {
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
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((o4.d) obj2).f5626k.f6571j.f((p4.l) obj);
                return;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                Iterator it2 = ((List) ((t2) obj2).getValue()).iterator();
                while (it2.hasNext()) {
                    ((p4.i) obj).b().c((o4.d) it2.next());
                }
                return;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((r.c0) obj2).f6242a.j((r.a0) obj);
                return;
            case 5:
                ((r.l1) obj2).f6354j.remove((r.l1) obj);
                return;
            case 6:
                r.l1 l1Var = (r.l1) obj2;
                l1Var.getClass();
                r.e1 e1Var = (r.e1) ((r.f1) obj).f6293b.getValue();
                if (e1Var != null) {
                    l1Var.i.remove(e1Var.f6285d);
                    return;
                }
                return;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                x.s0 s0Var = (x.s0) obj2;
                View view = (View) obj;
                int i9 = s0Var.f8291s - 1;
                s0Var.f8291s = i9;
                if (i9 == 0) {
                    Field field = q3.k0.f6120a;
                    q3.c0.i(view, null);
                    q3.k0.m(view, null);
                    view.removeOnAttachStateChangeListener(s0Var.f8292t);
                    return;
                }
                return;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((x1.i0) obj);
                return;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((x1.j0) obj);
                return;
        }
    }
}
