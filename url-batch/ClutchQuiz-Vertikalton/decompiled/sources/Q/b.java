package Q;

import K.S;
import X.AnimationAnimationListenerC0036e;
import X.DialogInterfaceOnCancelListenerC0044m;
import X.I;
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
import f0.C0098d;
import f0.C0101g;
import f0.C0102h;
import f0.C0103i;
import f0.C0106l;
import f0.D;
import f0.RunnableC0097c;
import f0.W;
import i0.InterfaceC0142a;
import i0.InterfaceC0146e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import l.C0221k;
import l.C0236r0;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f615b;

    public /* synthetic */ b(int i, Object obj) {
        this.f614a = i;
        this.f615b = obj;
    }

    public W0.i a() {
        androidx.room.o oVar = (androidx.room.o) this.f615b;
        W0.i iVar = new W0.i();
        Cursor query$default = androidx.room.t.query$default(oVar.f1667a, new B.j("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        T.d.k(query$default, null);
        W0.i i = T.d.i(iVar);
        if (!i.f923a.isEmpty()) {
            if (((androidx.room.o) this.f615b).f1672g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            InterfaceC0146e interfaceC0146e = ((androidx.room.o) this.f615b).f1672g;
            if (interfaceC0146e == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            interfaceC0146e.w();
        }
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        int i;
        boolean z2;
        C0221k c0221k;
        switch (this.f614a) {
            case 0:
                h hVar = (h) this.f615b;
                if (hVar.f628o) {
                    boolean z3 = hVar.f626m;
                    a aVar = hVar.f617a;
                    if (z3) {
                        hVar.f626m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f611e = currentAnimationTimeMillis;
                        aVar.f613g = -1L;
                        aVar.f612f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f613g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f613g + aVar.i) || !hVar.e()) {
                        hVar.f628o = false;
                        return;
                    }
                    boolean z4 = hVar.f627n;
                    ListView listView = hVar.f619c;
                    if (z4) {
                        hVar.f627n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f612f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f612f;
                    aVar.f612f = currentAnimationTimeMillis2;
                    hVar.f630q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f365a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f615b).f1993c.f695g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 2:
                ((S.e) this.f615b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f615b;
                animationAnimationListenerC0036e.f1051b.endViewTransition(animationAnimationListenerC0036e.f1052c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f615b;
                dialogInterfaceOnCancelListenerC0044m.f1066U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f1074c0);
                return;
            case 5:
                ((I) this.f615b).y(true);
                return;
            case 6:
                Lock closeLock$room_runtime_release = ((androidx.room.o) this.f615b).f1667a.getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                    } finally {
                        closeLock$room_runtime_release.unlock();
                        ((androidx.room.o) this.f615b).getClass();
                    }
                } catch (SQLiteException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    set = V0.o.f891a;
                } catch (IllegalStateException e3) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                    set = V0.o.f891a;
                }
                if (((androidx.room.o) this.f615b).a() && ((androidx.room.o) this.f615b).f1670e.compareAndSet(true, false) && !((androidx.room.o) this.f615b).f1667a.inTransaction()) {
                    InterfaceC0142a a3 = ((j0.h) ((androidx.room.o) this.f615b).f1667a.getOpenHelper()).a();
                    a3.b();
                    try {
                        set = a();
                        a3.t();
                        if (set.isEmpty()) {
                            return;
                        }
                        androidx.room.o oVar = (androidx.room.o) this.f615b;
                        synchronized (oVar.i) {
                            Iterator it = oVar.i.iterator();
                            while (true) {
                                n.b bVar = (n.b) it;
                                if (bVar.hasNext()) {
                                    ((androidx.room.n) ((Map.Entry) bVar.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        a3.c();
                    }
                }
                return;
            case 7:
                C0106l c0106l = (C0106l) this.f615b;
                int i2 = c0106l.f2287A;
                ValueAnimator valueAnimator = c0106l.f2311z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0106l.f2287A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                RecyclerView recyclerView = (RecyclerView) this.f615b;
                D d = recyclerView.f1565H;
                if (d != null) {
                    C0103i c0103i = (C0103i) d;
                    ArrayList arrayList = c0103i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0103i.f2273j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0103i.f2274k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0103i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j3 = c0103i.d;
                            if (hasNext) {
                                W w2 = (W) it2.next();
                                View view = w2.f2193a;
                                ViewPropertyAnimator animate = view.animate();
                                c0103i.f2280q.add(w2);
                                animate.setDuration(j3).alpha(0.0f).setListener(new C0098d(c0103i, w2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0103i.f2276m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0097c runnableC0097c = new RunnableC0097c(c0103i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0097c.run();
                                    } else {
                                        View view2 = ((C0102h) arrayList5.get(0)).f2267a.f2193a;
                                        WeakHashMap weakHashMap2 = S.f365a;
                                        view2.postOnAnimationDelayed(runnableC0097c, j3);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0103i.f2277n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0097c runnableC0097c2 = new RunnableC0097c(c0103i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0097c2.run();
                                    } else {
                                        View view3 = ((C0101g) arrayList6.get(0)).f2259a.f2193a;
                                        WeakHashMap weakHashMap3 = S.f365a;
                                        view3.postOnAnimationDelayed(runnableC0097c2, j3);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0103i.f2275l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0097c runnableC0097c3 = new RunnableC0097c(c0103i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0097c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0103i.f2135e : 0L, !isEmpty3 ? c0103i.f2136f : 0L) + j3;
                                        View view4 = ((W) arrayList7.get(0)).f2193a;
                                        WeakHashMap weakHashMap4 = S.f365a;
                                        view4.postOnAnimationDelayed(runnableC0097c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1595i0 = z2;
                return;
            case 9:
                ((StaggeredGridLayoutManager) this.f615b).B0();
                return;
            case 10:
                C0236r0 c0236r0 = (C0236r0) this.f615b;
                c0236r0.f3042l = null;
                c0236r0.drawableStateChanged();
                return;
            case 11:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f615b;
                if (searchView$SearchAutoComplete.f1348f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1348f = false;
                    return;
                }
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.f615b).f1366a;
                if (actionMenuView == null || (c0221k = actionMenuView.f1327t) == null) {
                    return;
                }
                c0221k.l();
                return;
            default:
                P0.e eVar = (P0.e) this.f615b;
                eVar.f606c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f607e;
                S.e eVar2 = bottomSheetBehavior.f1758M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f605b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1757L == 2) {
                        bottomSheetBehavior.C(eVar.f605b);
                        return;
                    }
                    return;
                }
        }
    }
}
