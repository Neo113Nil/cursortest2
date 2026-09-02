package A;

import D.D;
import D3.M;
import M5.v;
import T0.B;
import T0.L;
import T0.Q;
import a.AbstractC0219a;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.A;
import androidx.work.Worker;
import com.onesignal.inAppMessages.internal.display.impl.a;
import j1.C0435a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.C0450i;
import k.E;
import l5.r;
import m.C0514b;
import m5.C0532i;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f3f = i7;
        this.f4g = obj;
    }

    private final void b() {
        Object obj;
        synchronized (((A) this.f4g).f3447a) {
            obj = ((A) this.f4g).f3450d;
            ((A) this.f4g).f3450d = A.f3446i;
        }
        ((A) this.f4g).b(obj);
    }

    private final void c() {
        C0435a c0435a = (C0435a) this.f4g;
        synchronized (c0435a.f4879a) {
            try {
                if (c0435a.b()) {
                    Log.e("WakeLock", String.valueOf(c0435a.f4888j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    c0435a.d();
                    if (c0435a.b()) {
                        c0435a.f4881c = 1;
                        c0435a.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (((k1.k) this.f4g).f5166h) {
            ((k1.b) ((k1.k) this.f4g).f5167i).a();
        }
    }

    public C0532i a() {
        Q.f fVar = (Q.f) this.f4g;
        C0532i c0532i = new C0532i();
        Cursor m4 = fVar.f1916a.m(new v("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (m4.moveToNext()) {
            try {
                c0532i.add(Integer.valueOf(m4.getInt(0)));
            } finally {
            }
        }
        m4.close();
        C0532i e4 = AbstractC0219a.e(c0532i);
        if (e4.f5486f.isEmpty()) {
            return e4;
        }
        if (((Q.f) this.f4g).f1922g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        V.i iVar = ((Q.f) this.f4g).f1922g;
        if (iVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        iVar.a();
        return e4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        a6.a b7;
        long j4;
        C0450i c0450i;
        switch (this.f3f) {
            case 0:
                Object obj = ((a6.d) this.f4g).f3172f;
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                I.f fVar = (I.f) this.f4g;
                E e4 = fVar.f1137c;
                I.a aVar = fVar.f1135a;
                if (fVar.f1149o) {
                    if (fVar.f1147m) {
                        fVar.f1147m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1128e = currentAnimationTimeMillis;
                        aVar.f1130g = -1L;
                        aVar.f1129f = currentAnimationTimeMillis;
                        aVar.f1131h = 0.5f;
                    }
                    if ((aVar.f1130g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1130g + aVar.f1132i) || !fVar.e()) {
                        fVar.f1149o = false;
                        return;
                    }
                    if (fVar.f1148n) {
                        fVar.f1148n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        e4.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f1129f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a7 = aVar.a(currentAnimationTimeMillis2);
                    long j7 = currentAnimationTimeMillis2 - aVar.f1129f;
                    aVar.f1129f = currentAnimationTimeMillis2;
                    fVar.f1151q.scrollListBy((int) (j7 * ((a7 * 4.0f) + ((-4.0f) * a7 * a7)) * aVar.f1127d));
                    Field field = D.f240a;
                    e4.postOnAnimation(this);
                    return;
                }
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((L.c) this.f4g).i(0);
                return;
            case 3:
                ((F3.g) this.f4g).n();
                throw null;
            case 4:
                ReentrantReadWriteLock.ReadLock readLock = ((Q.f) this.f4g).f1916a.f3568h.readLock();
                kotlin.jvm.internal.i.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } finally {
                        readLock.unlock();
                    }
                } catch (SQLiteException e7) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                    set = r.f5305f;
                } catch (IllegalStateException e8) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                    set = r.f5305f;
                }
                if (((Q.f) this.f4g).a() && ((Q.f) this.f4g).f1920e.compareAndSet(true, false) && !((Q.f) this.f4g).f1916a.h().E().n()) {
                    V.c E6 = ((Q.f) this.f4g).f1916a.h().E();
                    E6.d();
                    try {
                        set = a();
                        E6.G();
                        if (set.isEmpty()) {
                            return;
                        }
                        Q.f fVar2 = (Q.f) this.f4g;
                        synchronized (fVar2.f1924i) {
                            Iterator it = fVar2.f1924i.iterator();
                            while (true) {
                                C0514b c0514b = (C0514b) it;
                                if (c0514b.hasNext()) {
                                    ((Q.e) ((Map.Entry) c0514b.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        E6.g();
                    }
                }
                return;
            case 5:
                if (((k1.h) this.f4g).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 6:
                T0.r rVar = (T0.r) this.f4g;
                R0.e eVar = rVar.f2323i;
                Context context = rVar.f2322h;
                eVar.getClass();
                if (R0.f.f2065a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e9) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e9);
                    return;
                }
            case 7:
                ((B) this.f4g).e();
                return;
            case 8:
                S0.a aVar2 = ((B) ((M) this.f4g).f401g).f2223e;
                aVar2.d(aVar2.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 9:
                ((L) this.f4g).f2255j.b(new R0.a(4));
                return;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return;
            case 11:
                a6.e eVar2 = (a6.e) this.f4g;
                synchronized (eVar2) {
                    eVar2.f3181g++;
                    b7 = eVar2.b();
                }
                if (b7 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    a6.a aVar3 = b7;
                    try {
                        currentThread.setName(aVar3.f3160a);
                        Logger logger = ((a6.e) this.f4g).f3176b;
                        a6.c cVar = aVar3.f3162c;
                        kotlin.jvm.internal.i.b(cVar);
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j4 = System.nanoTime();
                            AbstractC0676f.a(logger, aVar3, cVar, "starting");
                        } else {
                            j4 = -1;
                        }
                        try {
                            long a8 = aVar3.a();
                            if (isLoggable) {
                                AbstractC0676f.a(logger, aVar3, cVar, "finished run in " + AbstractC0676f.g(System.nanoTime() - j4));
                            }
                            a6.e eVar3 = (a6.e) this.f4g;
                            synchronized (eVar3) {
                                a6.e.a(eVar3, aVar3, a8, true);
                                b7 = eVar3.b();
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                AbstractC0676f.a(logger, aVar3, cVar, "failed a run in " + AbstractC0676f.g(System.nanoTime() - j4));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            a6.e eVar4 = (a6.e) this.f4g;
                            synchronized (eVar4) {
                                a6.e.a(eVar4, aVar3, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (b7 != null);
                currentThread.setName(name);
                return;
            case 12:
                b();
                return;
            case 13:
                c();
                return;
            case 14:
                E e10 = (E) this.f4g;
                e10.f4909r = null;
                e10.drawableStateChanged();
                return;
            case 15:
                ActionMenuView actionMenuView = ((Toolbar) this.f4g).f3371f;
                if (actionMenuView == null || (c0450i = actionMenuView.f3301x) == null) {
                    return;
                }
                c0450i.h();
                return;
            case 16:
                d();
                return;
            case 17:
                ((N3.j) this.f4g).b();
                return;
            default:
                Worker worker = (Worker) this.f4g;
                try {
                    worker.f3550f.i(worker.a());
                    return;
                } catch (Throwable th4) {
                    worker.f3550f.j(th4);
                    return;
                }
        }
    }

    public b(Q q6, j jVar) {
        this.f3f = 10;
        this.f4g = jVar;
    }

    public b(a6.d dVar, int i7) {
        this.f3f = 0;
        this.f4g = dVar;
    }
}
