package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewv implements ewq {
    private final koe a;

    public ewv(koe koeVar) {
        this.a = koeVar;
    }

    @Override // defpackage.ewq
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new ewu(this, Thread.getDefaultUncaughtExceptionHandler(), 0));
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set b = ((jsd) this.a).b();
                ArrayList arrayList2 = new ArrayList(b.size());
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((gvn) ((gti) it.next()).a).a().isEmpty() ? hve.a : hve.a);
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                hvi[] hviVarArr = (hvi[]) arrayList2.toArray(new hvi[0]);
                hux huxVar = new hux(hviVarArr);
                heg d = hel.d(hviVarArr.length);
                for (int i = 0; i < hviVarArr.length; i++) {
                    d.h(new huw(huxVar));
                }
                hel g = d.g();
                for (int i2 = 0; i2 < hviVarArr.length; i2++) {
                    hviVarArr[i2].c(new mr(huxVar, g, i2, 10), huf.a);
                }
                hjs listIterator = g.listIterator(0);
                while (listIterator.hasNext()) {
                    hvi hviVar = (hvi) listIterator.next();
                    try {
                        try {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(4000 - (SystemClock.elapsedRealtime() - elapsedRealtime));
                            long nanoTime = System.nanoTime() + nanos;
                            z = false;
                            while (true) {
                                try {
                                    try {
                                        hviVar.get(nanos, TimeUnit.NANOSECONDS);
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (z) {
                                            Thread.currentThread().interrupt();
                                        }
                                        throw th;
                                    }
                                } catch (InterruptedException unused) {
                                    z = true;
                                    nanos = nanoTime - System.nanoTime();
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z = false;
                        }
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th5) {
                        arrayList.add(th5);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Throwable) it2.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
