package D2;

import M1.B;
import M1.w;
import N1.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.view.MotionEvent;
import androidx.room.n;
import androidx.room.o;
import androidx.room.s;
import i.C0457b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.logging.Level;
import u0.C0997t;
import v1.InterfaceC1018a;
import w1.g;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f599e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f598d = i3;
        this.f599e = obj;
    }

    public i a() {
        o oVar = (o) this.f599e;
        i iVar = new i();
        Cursor query$default = s.query$default(oVar.f4089a, new C2.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        I2.d.u(query$default, null);
        i n3 = I2.d.n(iVar);
        if (!n3.f2891d.isEmpty()) {
            if (((o) this.f599e).f4096h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            v1.e eVar = ((o) this.f599e).f4096h;
            if (eVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            eVar.v();
        }
        return n3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c3;
        long j3;
        Set set;
        switch (this.f598d) {
            case 0:
                break;
            case 1:
                Lock closeLock$room_runtime_release = ((o) this.f599e).f4089a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                    } finally {
                        closeLock$room_runtime_release.unlock();
                        ((o) this.f599e).getClass();
                    }
                } catch (SQLiteException e3) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                    set = w.f2805d;
                } catch (IllegalStateException e4) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
                    set = w.f2805d;
                }
                if (((o) this.f599e).a() && ((o) this.f599e).f4094f.compareAndSet(true, false) && !((o) this.f599e).f4089a.inTransaction()) {
                    InterfaceC1018a a3 = ((g) ((o) this.f599e).f4089a.getOpenHelper()).a();
                    a3.y();
                    try {
                        set = a();
                        a3.s();
                        if (set.isEmpty()) {
                            return;
                        }
                        o oVar = (o) this.f599e;
                        synchronized (oVar.f4098j) {
                            Iterator it = oVar.f4098j.iterator();
                            while (true) {
                                C0457b c0457b = (C0457b) it;
                                if (c0457b.hasNext()) {
                                    ((n) ((Map.Entry) c0457b.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        a3.d();
                    }
                }
                return;
            default:
                C0997t c0997t = (C0997t) this.f599e;
                c0997t.removeCallbacks(this);
                MotionEvent motionEvent = c0997t.f8456o0;
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
                    C0997t c0997t2 = (C0997t) this.f599e;
                    c0997t2.G(motionEvent, i3, c0997t2.f8457p0, false);
                    return;
                }
                return;
        }
        while (true) {
            e eVar = (e) this.f599e;
            synchronized (eVar) {
                c3 = eVar.c();
            }
            if (c3 == null) {
                return;
            }
            c cVar = c3.f588c;
            Z1.i.c(cVar);
            e eVar2 = (e) this.f599e;
            boolean isLoggable = e.f601i.isLoggable(Level.FINE);
            if (isLoggable) {
                A2.g gVar = cVar.f592a.f602a;
                j3 = System.nanoTime();
                B.k(c3, cVar, "starting");
            } else {
                j3 = -1;
            }
            try {
                e.a(eVar2, c3);
                if (isLoggable) {
                    A2.g gVar2 = cVar.f592a.f602a;
                    B.k(c3, cVar, "finished run in ".concat(B.A(System.nanoTime() - j3)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) eVar2.f602a.f83b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        A2.g gVar3 = cVar.f592a.f602a;
                        B.k(c3, cVar, "failed a run in ".concat(B.A(System.nanoTime() - j3)));
                    }
                    throw th2;
                }
            }
        }
    }
}
