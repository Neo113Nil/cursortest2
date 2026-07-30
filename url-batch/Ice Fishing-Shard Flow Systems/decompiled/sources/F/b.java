package F;

import I.T;
import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC0228t;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0226q;
import androidx.fragment.app.Q;
import androidx.lifecycle.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.work.Worker;
import com.appsflyer.attribution.RequestError;
import g0.AbstractC0439s;
import g0.C0422b;
import g0.C0426f;
import h0.AbstractC0459e;
import h0.C0460f;
import i.C0508J;
import i.C0511M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.L;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import m0.C0684c;
import n.C0742w0;
import p.C0812b;
import s1.BinderC0864F;
import s1.C0883n;
import s1.v;
import s4.p;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f718e;

    public /* synthetic */ b(int i2, Object obj) {
        this.f717d = i2;
        this.f718e = obj;
    }

    private final void b() {
        K1.k kVar = (K1.k) this.f718e;
        synchronized (kVar.f1437i) {
            try {
                K1.c cVar = (K1.c) kVar.f1438l;
                if (cVar != null) {
                    cVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        Object obj;
        synchronized (((C) this.f718e).f3838a) {
            obj = ((C) this.f718e).f3843f;
            ((C) this.f718e).f3843f = C.f3837k;
        }
        ((C) this.f718e).d(obj);
    }

    private final void d() {
        Set set;
        ReentrantReadWriteLock.ReadLock readLock = ((C0460f) this.f718e).f5076a.f4098h.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            try {
            } catch (SQLiteException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                set = kotlin.collections.C.f6117d;
            } catch (IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                set = kotlin.collections.C.f6117d;
            }
            if (((C0460f) this.f718e).a()) {
                if (((C0460f) this.f718e).f5080e.compareAndSet(true, false)) {
                    if (((C0460f) this.f718e).f5076a.h().C().t()) {
                        return;
                    }
                    C0684c C7 = ((C0460f) this.f718e).f5076a.h().C();
                    C7.d();
                    try {
                        set = a();
                        C7.G();
                        if (set.isEmpty()) {
                            return;
                        }
                        C0460f c0460f = (C0460f) this.f718e;
                        synchronized (c0460f.f5084i) {
                            try {
                                Iterator it = c0460f.f5084i.iterator();
                                while (true) {
                                    C0812b c0812b = (C0812b) it;
                                    if (c0812b.hasNext()) {
                                        ((AbstractC0459e) ((Map.Entry) c0812b.next()).getValue()).a(set);
                                    } else {
                                        Unit unit = Unit.f6114a;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } finally {
                        C7.h();
                    }
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    public S5.n a() {
        C0460f c0460f = (C0460f) this.f718e;
        S5.n nVar = new S5.n();
        Cursor m2 = c0460f.f5076a.m(new C0654a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 0));
        while (m2.moveToNext()) {
            try {
                nVar.add(Integer.valueOf(m2.getInt(0)));
            } finally {
            }
        }
        Unit unit = Unit.f6114a;
        m2.close();
        S5.n a7 = L.a(nVar);
        if (a7.f2547d.isEmpty()) {
            return a7;
        }
        if (((C0460f) this.f718e).f5082g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m0.j jVar = ((C0460f) this.f718e).f5082g;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jVar.a();
        return a7;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        G6.a b7;
        long j;
        switch (this.f717d) {
            case 0:
                Object obj = ((B.f) this.f718e).f152e;
                return;
            case 1:
                Worker worker = (Worker) this.f718e;
                try {
                    worker.f4081d.i(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.f4081d.j(th);
                    return;
                }
            case 2:
                G6.d dVar = (G6.d) this.f718e;
                synchronized (dVar) {
                    dVar.f866g++;
                    b7 = dVar.b();
                }
                if (b7 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    G6.a aVar = b7;
                    try {
                        currentThread.setName(aVar.f846a);
                        Logger logger = ((G6.d) this.f718e).f861b;
                        G6.c cVar = aVar.f848c;
                        Intrinsics.b(cVar);
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            B.f fVar = cVar.f852a.f860a;
                            j = System.nanoTime();
                            d4.c.d(logger, aVar, cVar, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long a7 = aVar.a();
                            if (isLoggable) {
                                B.f fVar2 = cVar.f852a.f860a;
                                d4.c.d(logger, aVar, cVar, "finished run in " + d4.c.p(System.nanoTime() - j));
                            }
                            G6.d dVar2 = (G6.d) this.f718e;
                            synchronized (dVar2) {
                                G6.d.a(dVar2, aVar, a7, true);
                                b7 = dVar2.b();
                            }
                        } catch (Throwable th2) {
                            if (isLoggable) {
                                B.f fVar3 = cVar.f852a.f860a;
                                d4.c.d(logger, aVar, cVar, "failed a run in " + d4.c.p(System.nanoTime() - j));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            G6.d dVar3 = (G6.d) this.f718e;
                            synchronized (dVar3) {
                                G6.d.a(dVar3, aVar, -1L, false);
                                Unit unit = Unit.f6114a;
                                if (!(th3 instanceof InterruptedException)) {
                                    throw th3;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th4) {
                            currentThread.setName(name);
                            throw th4;
                        }
                    }
                } while (b7 != null);
                currentThread.setName(name);
                return;
            case 3:
                J1.a aVar2 = (J1.a) this.f718e;
                synchronized (aVar2.f1363a) {
                    try {
                        if (aVar2.b()) {
                            Log.e("WakeLock", String.valueOf(aVar2.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar2.d();
                            if (aVar2.b()) {
                                aVar2.f1365c = 1;
                                aVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 4:
                b();
                return;
            case 5:
                L.c cVar2 = (L.c) this.f718e;
                C0742w0 c0742w0 = cVar2.f1634i;
                L.a aVar3 = cVar2.f1632d;
                if (cVar2.f1646w) {
                    if (cVar2.f1644u) {
                        cVar2.f1644u = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar3.f1626e = currentAnimationTimeMillis;
                        aVar3.f1628g = -1L;
                        aVar3.f1627f = currentAnimationTimeMillis;
                        aVar3.f1629h = 0.5f;
                    }
                    if ((aVar3.f1628g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f1628g + aVar3.f1630i) || !cVar2.e()) {
                        cVar2.f1646w = false;
                        return;
                    }
                    if (cVar2.f1645v) {
                        cVar2.f1645v = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        c0742w0.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar3.f1627f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a8 = aVar3.a(currentAnimationTimeMillis2);
                    long j7 = currentAnimationTimeMillis2 - aVar3.f1627f;
                    aVar3.f1627f = currentAnimationTimeMillis2;
                    cVar2.f1648y.scrollListBy((int) (j7 * ((a8 * 4.0f) + ((-4.0f) * a8 * a8)) * aVar3.f1625d));
                    WeakHashMap weakHashMap = T.f1153a;
                    c0742w0.postOnAnimation(this);
                    return;
                }
                return;
            case 6:
                ((p) this.f718e).notImplemented();
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((O.c) this.f718e).i(0);
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                DialogInterfaceOnCancelListenerC0226q dialogInterfaceOnCancelListenerC0226q = (DialogInterfaceOnCancelListenerC0226q) this.f718e;
                dialogInterfaceOnCancelListenerC0226q.f3751b0.onDismiss(dialogInterfaceOnCancelListenerC0226q.f3759j0);
                return;
            case 9:
                ComponentCallbacksC0228t componentCallbacksC0228t = (ComponentCallbacksC0228t) this.f718e;
                if (componentCallbacksC0228t.f3790P != null) {
                    componentCallbacksC0228t.b().getClass();
                    return;
                }
                return;
            case 10:
                ((Q) this.f718e).A(true);
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                c();
                return;
            case 12:
                C0426f c0426f = (C0426f) this.f718e;
                ValueAnimator valueAnimator = c0426f.f4928u;
                int i2 = c0426f.f4929v;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0426f.f4929v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL);
                valueAnimator.start();
                return;
            case 13:
                AbstractC0439s abstractC0439s = ((RecyclerView) this.f718e).f3966L;
                if (abstractC0439s != null) {
                    C0422b c0422b = (C0422b) abstractC0439s;
                    ArrayList arrayList = c0422b.f4894e;
                    ArrayList arrayList2 = c0422b.f4898i;
                    ArrayList arrayList3 = c0422b.f4899k;
                    ArrayList arrayList4 = c0422b.j;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = c0422b.f4896g;
                    boolean isEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = c0422b.f4897h;
                    boolean isEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = c0422b.f4895f;
                    boolean isEmpty4 = arrayList7.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.addAll(arrayList5);
                        arrayList4.add(arrayList8);
                        arrayList5.clear();
                        if (!isEmpty) {
                            C4.p.o(arrayList8.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList8.iterator();
                        if (it2.hasNext()) {
                            C4.p.o(it2.next());
                            throw null;
                        }
                        arrayList8.clear();
                        arrayList4.remove(arrayList8);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList3.add(arrayList9);
                        arrayList6.clear();
                        if (!isEmpty) {
                            C4.p.o(arrayList9.get(0));
                            throw null;
                        }
                        if (arrayList9.size() > 0) {
                            C4.p.o(arrayList9.get(0));
                            throw null;
                        }
                        arrayList9.clear();
                        arrayList3.remove(arrayList9);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList2.add(arrayList10);
                    arrayList7.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0422b.f4960c : 0L, isEmpty3 ? 0L : c0422b.f4961d);
                        throw C4.p.f(arrayList10, 0);
                    }
                    Iterator it3 = arrayList10.iterator();
                    if (it3.hasNext()) {
                        it3.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList10.clear();
                    arrayList2.remove(arrayList10);
                    return;
                }
                return;
            case 14:
                ((StaggeredGridLayoutManager) this.f718e).J();
                return;
            case 15:
                d();
                return;
            case 16:
                C0508J c0508j = (C0508J) this.f718e;
                Window.Callback callback = c0508j.f5370b;
                Menu v7 = c0508j.v();
                m.m mVar = v7 instanceof m.m ? (m.m) v7 : null;
                if (mVar != null) {
                    mVar.w();
                }
                try {
                    v7.clear();
                    if (callback.onCreatePanelMenu(0, v7)) {
                        if (!callback.onPreparePanel(0, null, v7)) {
                        }
                        if (mVar == null) {
                            mVar.v();
                            return;
                        }
                        return;
                    }
                    v7.clear();
                    if (mVar == null) {
                    }
                } catch (Throwable th5) {
                    if (mVar != null) {
                        mVar.v();
                    }
                    throw th5;
                }
            case 17:
                C0742w0 c0742w02 = (C0742w0) this.f718e;
                c0742w02.f6940t = null;
                c0742w02.drawableStateChanged();
                return;
            case 18:
                ((Toolbar) this.f718e).u();
                return;
            case 19:
                if (((K1.h) this.f718e).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 20:
                C0883n c0883n = (C0883n) this.f718e;
                q1.f fVar4 = c0883n.f7679l;
                Context context = c0883n.f7678i;
                fVar4.getClass();
                if (q1.g.f7327a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e7) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e7);
                    return;
                }
            case 21:
                ((v) this.f718e).a();
                return;
            case 22:
                v vVar = (v) ((C0511M) this.f718e).f5381e;
                ((com.google.android.gms.common.internal.a) vVar.f7736f).e(vVar.f7736f.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((BinderC0864F) this.f718e).f7617k.b(new q1.b(4, null, null));
                return;
        }
    }

    public b(BinderC0864F binderC0864F) {
        this.f717d = 23;
        Objects.requireNonNull(binderC0864F);
        this.f718e = binderC0864F;
    }

    public b(B.f fVar, int i2) {
        this.f717d = 0;
        this.f718e = fVar;
    }
}
