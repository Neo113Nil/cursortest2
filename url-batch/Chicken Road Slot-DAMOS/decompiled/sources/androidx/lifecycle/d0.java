package androidx.lifecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.se;
import com.google.common.util.concurrent.ListenableFuture;
import com.onesignal.notifications.activities.a;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f679e;

    public /* synthetic */ d0(int i3, Object obj) {
        this.f678d = i3;
        this.f679e = obj;
    }

    private final void a() {
        se seVar = (se) this.f679e;
        synchronized (((ArrayDeque) seVar.f2801r)) {
            SharedPreferences.Editor edit = ((SharedPreferences) seVar.f2798d).edit();
            String str = (String) seVar.f2799e;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) seVar.f2801r).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) seVar.f2800i);
            }
            edit.putString(str, sb2.toString()).apply();
        }
    }

    private final void b() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f679e;
        if (constraintTrackingWorker.f792r.f3948d instanceof e6.a) {
            return;
        }
        String b10 = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        t5.o d10 = t5.o.d();
        d10.getClass();
        if (b10 == null || b10.length() == 0) {
            d10.b(g6.a.f4274a, "No worker to delegate to.");
            e6.j jVar = constraintTrackingWorker.f792r;
            jVar.getClass();
            jVar.i(new t5.j());
            return;
        }
        t5.n a9 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), b10, constraintTrackingWorker.f789d);
        constraintTrackingWorker.f793s = a9;
        if (a9 == null) {
            d10.a(g6.a.f4274a, "No worker to delegate to.");
            e6.j jVar2 = constraintTrackingWorker.f792r;
            jVar2.getClass();
            jVar2.i(new t5.j());
            return;
        }
        u5.m a10 = u5.m.a(constraintTrackingWorker.getApplicationContext());
        c6.q B = a10.f9651c.B();
        String uuid = constraintTrackingWorker.getId().toString();
        uuid.getClass();
        c6.p k10 = B.k(uuid);
        if (k10 == null) {
            e6.j jVar3 = constraintTrackingWorker.f792r;
            jVar3.getClass();
            String str = g6.a.f4274a;
            jVar3.i(new t5.j());
            return;
        }
        c6.i iVar = a10.j;
        iVar.getClass();
        p.e eVar = new p.e(iVar, constraintTrackingWorker);
        eVar.g(kotlin.collections.x.c(k10));
        String uuid2 = constraintTrackingWorker.getId().toString();
        uuid2.getClass();
        if (!eVar.c(uuid2)) {
            d10.a(g6.a.f4274a, "Constraints not met for delegate " + b10 + ". Requesting retry.");
            e6.j jVar4 = constraintTrackingWorker.f792r;
            jVar4.getClass();
            jVar4.i(new t5.k());
            return;
        }
        d10.a(g6.a.f4274a, "Constraints met for delegate ".concat(b10));
        try {
            t5.n nVar = constraintTrackingWorker.f793s;
            nVar.getClass();
            ListenableFuture startWork = nVar.startWork();
            startWork.getClass();
            startWork.a(new a6.f(11, constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable th) {
            String str2 = g6.a.f4274a;
            String g = n0.l.g("Delegated worker ", b10, " threw exception in startWork.");
            if (d10.f9314a <= 3) {
                Log.d(str2, g, th);
            }
            synchronized (constraintTrackingWorker.f790e) {
                try {
                    if (!constraintTrackingWorker.f791i) {
                        e6.j jVar5 = constraintTrackingWorker.f792r;
                        jVar5.getClass();
                        jVar5.i(new t5.j());
                    } else {
                        d10.a(str2, "Constraints were unmet, Retrying.");
                        e6.j jVar6 = constraintTrackingWorker.f792r;
                        jVar6.getClass();
                        jVar6.i(new t5.k());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        int[] iArr2;
        switch (this.f678d) {
            case 0:
                g0 g0Var = (g0) this.f679e;
                w wVar = g0Var.f689t;
                if (g0Var.f685e == 0) {
                    g0Var.f686i = true;
                    wVar.d(o.ON_PAUSE);
                }
                if (g0Var.f684d == 0 && g0Var.f686i) {
                    wVar.d(o.ON_STOP);
                    g0Var.f687r = true;
                    return;
                }
                return;
            case 1:
                c4.s sVar = (c4.s) this.f679e;
                synchronized (sVar.f1782r) {
                    try {
                        if (sVar.f1786v == null) {
                            return;
                        }
                        try {
                            l3.h c10 = sVar.c();
                            int i3 = c10.f5858f;
                            if (i3 == 2) {
                                synchronized (sVar.f1782r) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i10 = k3.h.f5384a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                u8.d dVar = sVar.f1781i;
                                Context context = sVar.f1779d;
                                dVar.getClass();
                                l3.h[] hVarArr = {c10};
                                a.a aVar = h3.c.f4447a;
                                i7.a.n("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface n10 = h3.c.f4447a.n(context, hVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer R = c6.f.R(sVar.f1779d, c10.f5853a);
                                    if (R == null || n10 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        c6.n nVar = new c6.n(n10, cf.c.F(R));
                                        Trace.endSection();
                                        synchronized (sVar.f1782r) {
                                            try {
                                                a.a aVar2 = sVar.f1786v;
                                                if (aVar2 != null) {
                                                    aVar2.S(nVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        sVar.a();
                                        return;
                                    } finally {
                                        int i11 = k3.h.f5384a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (sVar.f1782r) {
                                try {
                                    a.a aVar3 = sVar.f1786v;
                                    if (aVar3 != null) {
                                        aVar3.R(th);
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 2:
                AFLogger.getMonetizationNetwork((Function1) this.f679e);
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                a();
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                com.google.firebase.messaging.g0 g0Var2 = (com.google.firebase.messaging.g0) this.f679e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + g0Var2.f3135a.getAction() + " finishing.");
                g0Var2.f3136b.c(null);
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                com.onesignal.core.internal.application.impl.a.waitUntilActivityReady$lambda$0((com.onesignal.common.threading.c) this.f679e);
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                com.onesignal.core.internal.purchases.impl.a.queryBoughtItems$lambda$0((com.onesignal.core.internal.purchases.impl.a) this.f679e);
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                a.b.invoke$lambda$0((com.onesignal.notifications.activities.a) this.f679e);
                return;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                d.i iVar = (d.i) this.f679e;
                Runnable runnable = iVar.f3234e;
                if (runnable != null) {
                    runnable.run();
                    iVar.f3234e = null;
                    return;
                }
                return;
            case 9:
                b3.q.d((b3.q) this.f679e);
                return;
            case 10:
                ((d2.a) this.f679e).c();
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                d2.b0 b0Var = (d2.b0) this.f679e;
                Trace.beginSection("measureAndLayout");
                try {
                    b0Var.f3338r.w(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        b0Var.h();
                        Trace.endSection();
                        b0Var.T = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 12:
                f1.e eVar = (f1.e) this.f679e;
                boolean g = eVar.g();
                d2.v vVar = eVar.f4045d;
                if (g) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        vVar.w(true);
                        s.w wVar2 = eVar.f4055y;
                        int[] iArr3 = wVar2.f8337b;
                        long[] jArr = wVar2.f8336a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j = jArr[i12];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    int i14 = 0;
                                    while (i14 < i13) {
                                        if ((255 & j) < 128) {
                                            int i15 = iArr3[(i12 << 3) + i14];
                                            if (!eVar.f().a(i15)) {
                                                iArr2 = iArr3;
                                                eVar.f4048r.add(new f1.f(i15, eVar.f4054x, f1.g.f4062e, null));
                                                eVar.f4052v.b(Unit.f5554a);
                                                j >>= 8;
                                                i14++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j >>= 8;
                                        i14++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i13 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i12 != length) {
                                    i12++;
                                    iArr3 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        eVar.k(vVar.getSemanticsOwner().a(), eVar.f4056z);
                        Trace.endSection();
                        eVar.c(eVar.f());
                        eVar.o();
                        eVar.A = false;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    } finally {
                    }
                }
                return;
            case 13:
                Iterator it = ((f4.j) this.f679e).f4094f.iterator();
                if (it.hasNext()) {
                    throw v4.a.i(it);
                }
                return;
            case 14:
                b();
                return;
            case 15:
                i0.e.setRippleState$lambda$1((i0.e) this.f679e);
                return;
            case 16:
                c6.i iVar2 = (c6.i) this.f679e;
                ((r6.g) iVar2.f1823d).m(new b1.h(10, iVar2));
                return;
            case 17:
                ra.c.scheduleStart$lambda$2((ra.c) this.f679e);
                return;
            default:
                CoroutineWorker.a((CoroutineWorker) this.f679e);
                return;
        }
    }
}
