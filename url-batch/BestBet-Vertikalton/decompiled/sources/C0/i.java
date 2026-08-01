package C0;

import K.Q;
import U.q;
import Y.AnimationAnimationListenerC0038e;
import Y.DialogInterfaceOnCancelListenerC0046m;
import Y.I;
import Y0.u;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.AbstractC0134D;
import g0.C0140d;
import g0.C0143g;
import g0.C0144h;
import g0.C0145i;
import g0.C0148l;
import g0.RunnableC0139c;
import g0.Y;
import h0.k;
import h0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import l.C0242k;
import l.C0257r0;
import l0.C0276c;
import l0.C0283j;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103b;

    public /* synthetic */ i(int i, Object obj) {
        this.f102a = i;
        this.f103b = obj;
    }

    public Z0.i a() {
        l lVar = (l) this.f103b;
        Z0.i iVar = new Z0.i();
        Cursor l2 = lVar.f2971a.l(new q("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (l2.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(l2.getInt(0)));
            } finally {
            }
        }
        b1.g.d(l2, null);
        Z0.i e2 = H1.d.e(iVar);
        if (!e2.f1554a.isEmpty()) {
            if (((l) this.f103b).f2976g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C0283j c0283j = ((l) this.f103b).f2976g;
            if (c0283j == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c0283j.d();
        }
        return e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1.a c2;
        long j2;
        int i;
        boolean z2;
        Set set;
        C0242k c0242k;
        switch (this.f102a) {
            case 0:
                j jVar = (j) this.f103b;
                jVar.f106c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) jVar.f107e;
                T.e eVar = bottomSheetBehavior.f2156M;
                if (eVar != null && eVar.f()) {
                    jVar.a(jVar.f105b);
                    return;
                } else {
                    if (bottomSheetBehavior.f2155L == 2) {
                        bottomSheetBehavior.C(jVar.f105b);
                        return;
                    }
                    return;
                }
            case 1:
                break;
            case 2:
                Q.g gVar = (Q.g) this.f103b;
                if (gVar.f879o) {
                    boolean z3 = gVar.f877m;
                    Q.a aVar = gVar.f868a;
                    if (z3) {
                        gVar.f877m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f864e = currentAnimationTimeMillis;
                        aVar.f866g = -1L;
                        aVar.f865f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f866g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f866g + aVar.i) || !gVar.e()) {
                        gVar.f879o = false;
                        return;
                    }
                    boolean z4 = gVar.f878n;
                    ListView listView = gVar.f870c;
                    if (z4) {
                        gVar.f878n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1937A0, RecyclerView.f1937A0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f865f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f865f;
                    aVar.f865f = currentAnimationTimeMillis2;
                    gVar.f881q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = Q.f578a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((T.e) this.f103b).n(0);
                return;
            case 4:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f103b).f2390c.f1175g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 5:
                AnimationAnimationListenerC0038e animationAnimationListenerC0038e = (AnimationAnimationListenerC0038e) this.f103b;
                animationAnimationListenerC0038e.f1404b.endViewTransition(animationAnimationListenerC0038e.f1405c);
                animationAnimationListenerC0038e.d.d();
                return;
            case 6:
                DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = (DialogInterfaceOnCancelListenerC0046m) this.f103b;
                dialogInterfaceOnCancelListenerC0046m.f1419U.onDismiss(dialogInterfaceOnCancelListenerC0046m.f1427c0);
                return;
            case 7:
                ((I) this.f103b).y(true);
                return;
            case 8:
                C0148l c0148l = (C0148l) this.f103b;
                int i2 = c0148l.f2874A;
                ValueAnimator valueAnimator = c0148l.f2898z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0148l.f2874A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                RecyclerView recyclerView = (RecyclerView) this.f103b;
                AbstractC0134D abstractC0134D = recyclerView.f1954J;
                if (abstractC0134D != null) {
                    C0145i c0145i = (C0145i) abstractC0134D;
                    ArrayList arrayList = c0145i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0145i.f2857j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0145i.f2858k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0145i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0145i.d;
                            if (hasNext) {
                                Y y2 = (Y) it.next();
                                View view = y2.f2777a;
                                ViewPropertyAnimator animate = view.animate();
                                c0145i.f2864q.add(y2);
                                animate.setDuration(j4).alpha(RecyclerView.f1937A0).setListener(new C0140d(c0145i, y2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0145i.f2860m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0139c runnableC0139c = new RunnableC0139c(c0145i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0139c.run();
                                    } else {
                                        View view2 = ((C0144h) arrayList5.get(0)).f2847a.f2777a;
                                        WeakHashMap weakHashMap2 = Q.f578a;
                                        view2.postOnAnimationDelayed(runnableC0139c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0145i.f2861n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0139c runnableC0139c2 = new RunnableC0139c(c0145i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0139c2.run();
                                    } else {
                                        View view3 = ((C0143g) arrayList6.get(0)).f2837a.f2777a;
                                        WeakHashMap weakHashMap3 = Q.f578a;
                                        view3.postOnAnimationDelayed(runnableC0139c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0145i.f2859l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0139c runnableC0139c3 = new RunnableC0139c(c0145i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0139c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0145i.f2717e : 0L, !isEmpty3 ? c0145i.f2718f : 0L) + j4;
                                        View view4 = ((Y) arrayList7.get(0)).f2777a;
                                        WeakHashMap weakHashMap4 = Q.f578a;
                                        view4.postOnAnimationDelayed(runnableC0139c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1986k0 = z2;
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f103b).D0();
                return;
            case 11:
                ReentrantReadWriteLock.ReadLock readLock = ((l) this.f103b).f2971a.h.readLock();
                k1.e.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } catch (SQLiteException e2) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                            set = u.f1518a;
                        }
                    } catch (IllegalStateException e3) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                        set = u.f1518a;
                    }
                    if (((l) this.f103b).a() && ((l) this.f103b).f2974e.compareAndSet(true, false) && !((l) this.f103b).f2971a.f().m().r()) {
                        C0276c m2 = ((l) this.f103b).f2971a.f().m();
                        m2.d();
                        try {
                            set = a();
                            m2.v();
                            if (set.isEmpty()) {
                                return;
                            }
                            l lVar = (l) this.f103b;
                            synchronized (lVar.i) {
                                Iterator it2 = lVar.i.iterator();
                                while (true) {
                                    n.b bVar = (n.b) it2;
                                    if (bVar.hasNext()) {
                                        ((k) ((Map.Entry) bVar.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        } finally {
                            m2.k();
                        }
                    }
                    return;
                } finally {
                    readLock.unlock();
                    ((l) this.f103b).getClass();
                }
            case 12:
                C0257r0 c0257r0 = (C0257r0) this.f103b;
                c0257r0.f3463l = null;
                c0257r0.drawableStateChanged();
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f103b;
                if (searchView$SearchAutoComplete.f1729f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1729f = false;
                    return;
                }
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.f103b).f1747a;
                if (actionMenuView == null || (c0242k = actionMenuView.f1711t) == null) {
                    return;
                }
                c0242k.l();
                return;
        }
        while (true) {
            C1.d dVar = (C1.d) this.f103b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            C1.c cVar = c2.f110c;
            k1.e.b(cVar);
            C1.d dVar2 = (C1.d) this.f103b;
            boolean isLoggable = C1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                A0.c cVar2 = cVar.f113a.f118a;
                j2 = System.nanoTime();
                H1.d.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                C1.d.a(dVar2, c2);
                if (isLoggable) {
                    A0.c cVar3 = cVar.f113a.f118a;
                    H1.d.a(c2, cVar, "finished run in ".concat(H1.d.y(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f118a.f6b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        A0.c cVar4 = cVar.f113a.f118a;
                        H1.d.a(c2, cVar, "failed a run in ".concat(H1.d.y(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
