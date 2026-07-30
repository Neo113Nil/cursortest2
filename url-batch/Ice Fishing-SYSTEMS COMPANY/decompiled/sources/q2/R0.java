package q2;

import B2.C0280n;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.internal.ads.AbstractC2513Da;
import com.google.android.gms.internal.ads.C4264z8;
import com.google.android.gms.internal.ads.InterfaceC3587mf;
import com.google.android.gms.internal.ads.InterfaceC4231yc;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C4819b;
import s2.BinderC4994b;
import s2.BinderC4996d;
import s7.C5009i;
import t0.AbstractC5032P;
import t0.AbstractC5063z;
import t0.C5040c;
import t0.C5043f;
import t0.C5044g;
import t0.C5045h;
import t0.C5048k;
import t0.RunnableC5039b;
import u0.AbstractC5094e;
import u0.C5095f;
import u1.C5101a;
import z0.C5260c;
import z0.C5266i;

/* loaded from: classes.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39982n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f39983u;

    public /* synthetic */ R0(int i, Object obj) {
        this.f39982n = i;
        this.f39983u = obj;
    }

    public C5009i a() {
        C5095f c5095f = (C5095f) this.f39983u;
        C5009i c5009i = new C5009i();
        Cursor m8 = c5095f.f41016a.m(new C0280n("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 3));
        while (m8.moveToNext()) {
            try {
                c5009i.add(Integer.valueOf(m8.getInt(0)));
            } finally {
            }
        }
        m8.close();
        C5009i a9 = K3.b.a(c5009i);
        if (a9.f40524n.isEmpty()) {
            return a9;
        }
        if (((C5095f) this.f39983u).f41022g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C5266i c5266i = ((C5095f) this.f39983u).f41022g;
        if (c5266i == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c5266i.b();
        return a9;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0125, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0158, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        RecyclerView recyclerView;
        Set set;
        boolean z8 = false;
        switch (this.f39982n) {
            case 0:
                InterfaceC4231yc interfaceC4231yc = ((S0) this.f39983u).f39984n;
                if (interfaceC4231yc != null) {
                    try {
                        interfaceC4231yc.R2(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e6) {
                        u2.i.g("Could not notify onComplete event.", e6);
                        return;
                    }
                }
                return;
            case 1:
                InterfaceC3587mf interfaceC3587mf = (InterfaceC3587mf) this.f39983u;
                if (interfaceC3587mf != null) {
                    try {
                        interfaceC3587mf.s(1);
                        return;
                    } catch (RemoteException e9) {
                        u2.i.i("#007 Could not call remote method.", e9);
                        return;
                    }
                }
                return;
            case 2:
                BinderC4994b binderC4994b = (BinderC4994b) this.f39983u;
                if (binderC4994b.f40429A) {
                    binderC4994b.f40432v.finish();
                    return;
                }
                return;
            case 3:
                ((BinderC4996d) this.f39983u).H3();
                return;
            case 4:
                C5048k c5048k = (C5048k) this.f39983u;
                int i4 = c5048k.f40717A;
                ValueAnimator valueAnimator = c5048k.f40743z;
                if (i4 != 1) {
                    i = 2;
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c5048k.f40717A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 5:
                RecyclerView recyclerView2 = (RecyclerView) this.f39983u;
                AbstractC5063z abstractC5063z = recyclerView2.f5372q0;
                if (abstractC5063z != null) {
                    C5045h c5045h = (C5045h) abstractC5063z;
                    ArrayList arrayList = c5045h.f40702h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c5045h.f40703j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c5045h.f40704k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c5045h.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        recyclerView = recyclerView2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView = recyclerView2;
                            long j9 = c5045h.f40804d;
                            if (hasNext) {
                                AbstractC5032P abstractC5032P = (AbstractC5032P) it.next();
                                View view = abstractC5032P.f40615a;
                                ViewPropertyAnimator animate = view.animate();
                                c5045h.f40710q.add(abstractC5032P);
                                animate.setDuration(j9).alpha(0.0f).setListener(new C5040c(c5045h, abstractC5032P, animate, view)).start();
                                recyclerView2 = recyclerView;
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c5045h.f40706m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC5039b runnableC5039b = new RunnableC5039b(c5045h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC5039b.run();
                                    } else {
                                        View view2 = ((C5044g) arrayList5.get(0)).f40695a.f40615a;
                                        WeakHashMap weakHashMap = O.X.f2240a;
                                        view2.postOnAnimationDelayed(runnableC5039b, j9);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c5045h.f40707n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC5039b runnableC5039b2 = new RunnableC5039b(c5045h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC5039b2.run();
                                    } else {
                                        View view3 = ((C5043f) arrayList6.get(0)).f40689a.f40615a;
                                        WeakHashMap weakHashMap2 = O.X.f2240a;
                                        view3.postOnAnimationDelayed(runnableC5039b2, j9);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c5045h.f40705l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC5039b runnableC5039b3 = new RunnableC5039b(c5045h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC5039b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j9 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c5045h.f40805e : 0L, isEmpty3 ? 0L : c5045h.f40806f) + j9;
                                        View view4 = ((AbstractC5032P) arrayList7.get(0)).f40615a;
                                        WeakHashMap weakHashMap3 = O.X.f2240a;
                                        view4.postOnAnimationDelayed(runnableC5039b3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView2 = recyclerView;
                    z8 = false;
                }
                recyclerView2.f5350O0 = z8;
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.f39983u).A0();
                return;
            case 7:
                Thread.currentThread();
                d1.f fVar = (d1.f) this.f39983u;
                fVar.getClass();
                fVar.k();
                return;
            case 8:
                t2.E e10 = (t2.E) this.f39983u;
                if (e10.f40831b) {
                    if (!(e10.l() && e10.m()) && ((Boolean) AbstractC2513Da.f24444b.r()).booleanValue()) {
                        synchronized (e10.f40830a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (e10.f40834e == null) {
                                    e10.f40834e = new C4264z8();
                                }
                                C4264z8 c4264z8 = e10.f40834e;
                                synchronized (c4264z8.f35491v) {
                                    if (c4264z8.f35489n) {
                                        int i9 = t2.C.f40822b;
                                        u2.i.a("Content hash thread already started, quitting...");
                                    } else {
                                        c4264z8.f35489n = true;
                                        c4264z8.start();
                                    }
                                }
                                int i10 = t2.C.f40822b;
                                u2.i.e("start fetching content...");
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
            case 9:
                ReentrantReadWriteLock.ReadLock readLock = ((C5095f) this.f39983u).f41016a.f5485h.readLock();
                kotlin.jvm.internal.h.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } finally {
                        readLock.unlock();
                        ((C5095f) this.f39983u).getClass();
                    }
                } catch (SQLiteException e11) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                    set = r7.r.f40360n;
                } catch (IllegalStateException e12) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e12);
                    set = r7.r.f40360n;
                }
                if (((C5095f) this.f39983u).a() && ((C5095f) this.f39983u).f41020e.compareAndSet(true, false) && !((C5095f) this.f39983u).f41016a.h().R().C()) {
                    C5260c R8 = ((C5095f) this.f39983u).f41016a.h().R();
                    R8.j();
                    try {
                        set = a();
                        R8.G();
                        if (set.isEmpty()) {
                            return;
                        }
                        C5095f c5095f = (C5095f) this.f39983u;
                        synchronized (c5095f.i) {
                            Iterator it2 = c5095f.i.iterator();
                            while (true) {
                                C4819b c4819b = (C4819b) it2;
                                if (c4819b.hasNext()) {
                                    ((AbstractC5094e) ((Map.Entry) c4819b.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        R8.z();
                    }
                }
                return;
            default:
                S0.n nVar = (S0.n) this.f39983u;
                nVar.getClass();
                while (true) {
                    try {
                        nVar.b((C5101a) ((ReferenceQueue) nVar.f2916v).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
        }
    }

    public R0(d1.f fVar) {
        this.f39982n = 7;
        Objects.requireNonNull(fVar);
        this.f39983u = fVar;
    }
}
