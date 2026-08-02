package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import defpackage.asp;
import defpackage.ekk;
import defpackage.ekn;
import defpackage.evb;
import defpackage.gcb;
import defpackage.gcv;
import defpackage.gty;
import defpackage.guc;
import defpackage.gut;
import defpackage.gva;
import defpackage.gvx;
import defpackage.hkf;
import defpackage.hkh;
import defpackage.hnu;
import defpackage.hoq;
import defpackage.huf;
import defpackage.hvi;
import defpackage.koe;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TikTokListenableWorker extends asp {
    private final gva f;
    private final Map g;
    private final koe h;
    private final WorkerParameters i;
    private final guc j;
    private gcb k;
    private boolean l;
    private static final hkh e = hkh.l("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final ekk d = new ekn("UNKNOWN");

    public TikTokListenableWorker(Context context, gva gvaVar, Map map, koe koeVar, WorkerParameters workerParameters, guc gucVar) {
        super(context, workerParameters);
        this.k = null;
        this.l = false;
        this.g = map;
        this.h = koeVar;
        this.f = gvaVar;
        this.i = workerParameters;
        this.j = gucVar;
    }

    public static /* synthetic */ void c(hvi hviVar, ekk ekkVar) {
        try {
            hnu.aR(hviVar);
        } catch (CancellationException unused) {
            ((hkf) ((hkf) e.g()).i("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 194, "TikTokListenableWorker.java")).u("TikTokListenableWorker was cancelled while running client worker: %s", ekkVar);
        } catch (ExecutionException e2) {
            ((hkf) ((hkf) ((hkf) e.f()).h(e2.getCause())).i("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 189, "TikTokListenableWorker.java")).u("TikTokListenableWorker encountered an exception while running client worker: %s", ekkVar);
        }
    }

    @Override // defpackage.asp
    public final hvi a() {
        gva gvaVar = this.f;
        WorkerParameters workerParameters = this.i;
        String b = gcv.b(workerParameters);
        gut d2 = gvaVar.d(126, "WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            boolean z = true;
            gty aB = hoq.aB(127, b + " getForegroundInfoAsync()", this.j, true);
            try {
                if (this.k != null) {
                    z = false;
                }
                hoq.I(z, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                gcb gcbVar = (gcb) this.h.b();
                this.k = gcbVar;
                hvi b2 = gcbVar.b(workerParameters);
                aB.b(b2);
                aB.close();
                d2.close();
                return b2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                d2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.asp
    public final hvi b() {
        gva gvaVar = this.f;
        WorkerParameters workerParameters = this.i;
        String b = gcv.b(workerParameters);
        gut d2 = gvaVar.d(128, "WorkManager:TikTokListenableWorker startWork");
        try {
            gty aB = hoq.aB(129, b + " startWork()", this.j, true);
            try {
                String b2 = gcv.b(workerParameters);
                gty aC = hoq.aC(130, String.valueOf(b2).concat(" startWork()"));
                try {
                    hoq.I(!this.l, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.l = true;
                    gcb gcbVar = this.k;
                    if (gcbVar == null) {
                        gcbVar = (gcb) this.h.b();
                        this.k = gcbVar;
                    }
                    gcbVar.d();
                    this.k.c(new Supplier() { // from class: gbs
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return Integer.valueOf(Build.VERSION.SDK_INT >= 31 ? TikTokListenableWorker.this.d() : -1);
                        }
                    });
                    hvi a = this.k.a(workerParameters);
                    a.c(gvx.h(new evb(a, (ekk) Map.EL.getOrDefault(this.g, b2, d), 10, null)), huf.a);
                    aC.b(a);
                    aC.close();
                    aB.b(a);
                    aB.close();
                    d2.close();
                    return a;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                d2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
