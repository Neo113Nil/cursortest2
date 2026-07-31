package J2;

import A1.k;
import B.Y;
import O2.l;
import S1.w;
import T1.h;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.view.MotionEvent;
import f2.j;
import h2.AbstractC0508a;
import i.C0510b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import u0.C1123s;
import w1.p;
import w1.q;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3198e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f3197d = i3;
        this.f3198e = obj;
    }

    public h a() {
        q qVar = (q) this.f3198e;
        h hVar = new h();
        Cursor k3 = qVar.f9889a.k(new m1.q("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (k3.moveToNext()) {
            try {
                hVar.add(Integer.valueOf(k3.getInt(0)));
            } finally {
            }
        }
        O2.d.t(k3, null);
        h q3 = AbstractC0508a.q(hVar);
        if (!q3.f4371d.isEmpty()) {
            if (((q) this.f3198e).f9896h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k kVar = ((q) this.f3198e).f9896h;
            if (kVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVar.b();
        }
        return q3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c2;
        long j3;
        Set set;
        switch (this.f3197d) {
            case 0:
                break;
            case 1:
                C1123s c1123s = (C1123s) this.f3198e;
                c1123s.removeCallbacks(this);
                MotionEvent motionEvent = c1123s.f9502p0;
                if (motionEvent != null) {
                    boolean z3 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z3) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i3 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i3 = 2;
                    }
                    C1123s c1123s2 = (C1123s) this.f3198e;
                    c1123s2.G(motionEvent, i3, c1123s2.q0, false);
                    return;
                }
                return;
            default:
                ReentrantReadWriteLock.ReadLock readLock = ((q) this.f3198e).f9889a.f9926h.readLock();
                j.e(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e3) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                            set = w.f4322d;
                        }
                    } catch (IllegalStateException e4) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                        set = w.f4322d;
                    }
                    if (((q) this.f3198e).b() && ((q) this.f3198e).f9894f.compareAndSet(true, false) && !((q) this.f3198e).f9889a.g().t().h()) {
                        A1.c t3 = ((q) this.f3198e).f9889a.g().t();
                        t3.b();
                        try {
                            set = a();
                            t3.r();
                            if (set.isEmpty()) {
                                return;
                            }
                            q qVar = (q) this.f3198e;
                            synchronized (qVar.f9898j) {
                                Iterator it = qVar.f9898j.iterator();
                                while (true) {
                                    C0510b c0510b = (C0510b) it;
                                    if (c0510b.hasNext()) {
                                        ((p) ((Map.Entry) c0510b.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        } finally {
                            t3.e();
                        }
                    }
                    return;
                } finally {
                    readLock.unlock();
                    ((q) this.f3198e).getClass();
                }
        }
        while (true) {
            e eVar = (e) this.f3198e;
            synchronized (eVar) {
                c2 = eVar.c();
            }
            if (c2 == null) {
                return;
            }
            c cVar = c2.f3187c;
            j.c(cVar);
            e eVar2 = (e) this.f3198e;
            boolean isLoggable = e.f3200i.isLoggable(Level.FINE);
            if (isLoggable) {
                Y y3 = cVar.f3191a.f3201a;
                j3 = System.nanoTime();
                l.L(c2, cVar, "starting");
            } else {
                j3 = -1;
            }
            try {
                e.a(eVar2, c2);
                if (isLoggable) {
                    Y y4 = cVar.f3191a.f3201a;
                    l.L(c2, cVar, "finished run in ".concat(l.b0(System.nanoTime() - j3)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) eVar2.f3201a.f334d).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        Y y5 = cVar.f3191a.f3201a;
                        l.L(c2, cVar, "failed a run in ".concat(l.b0(System.nanoTime() - j3)));
                    }
                    throw th2;
                }
            }
        }
    }
}
