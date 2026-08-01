package M0;

import K.T;
import Y.AnimationAnimationListenerC0039e;
import Y.DialogInterfaceOnCancelListenerC0047m;
import Y.I;
import android.animation.ValueAnimator;
import android.os.SystemClock;
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
import g0.AbstractC0116F;
import g0.C0121e;
import g0.C0124h;
import g0.C0125i;
import g0.C0126j;
import g0.C0129m;
import g0.RunnableC0120d;
import g0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0219k;
import l.C0236s0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f576b;

    public /* synthetic */ B(int i, Object obj) {
        this.f575a = i;
        this.f576b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0219k c0219k;
        u1.a c2;
        long j2;
        switch (this.f575a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f576b).f1941c.f626g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f576b;
                if (gVar.f724o) {
                    boolean z3 = gVar.f722m;
                    Q.a aVar = gVar.f713a;
                    if (z3) {
                        gVar.f722m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f709e = currentAnimationTimeMillis;
                        aVar.f711g = -1L;
                        aVar.f710f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f711g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f711g + aVar.i) || !gVar.e()) {
                        gVar.f724o = false;
                        return;
                    }
                    boolean z4 = gVar.f723n;
                    ListView listView = gVar.f715c;
                    if (z4) {
                        gVar.f723n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1559A0, RecyclerView.f1559A0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f710f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f710f;
                    aVar.f710f = currentAnimationTimeMillis2;
                    gVar.f726q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f440a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((T.e) this.f576b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0039e animationAnimationListenerC0039e = (AnimationAnimationListenerC0039e) this.f576b;
                animationAnimationListenerC0039e.f1072b.endViewTransition(animationAnimationListenerC0039e.f1073c);
                animationAnimationListenerC0039e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = (DialogInterfaceOnCancelListenerC0047m) this.f576b;
                dialogInterfaceOnCancelListenerC0047m.f1087U.onDismiss(dialogInterfaceOnCancelListenerC0047m.f1095c0);
                return;
            case 5:
                ((I) this.f576b).y(true);
                return;
            case 6:
                C0129m c0129m = (C0129m) this.f576b;
                int i2 = c0129m.f2463A;
                ValueAnimator valueAnimator = c0129m.f2487z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0129m.f2463A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f576b;
                AbstractC0116F abstractC0116F = recyclerView.f1574J;
                if (abstractC0116F != null) {
                    C0126j c0126j = (C0126j) abstractC0116F;
                    ArrayList arrayList = c0126j.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0126j.f2442j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0126j.f2443k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0126j.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0126j.d;
                            if (hasNext) {
                                a0 a0Var = (a0) it.next();
                                View view = a0Var.f2366a;
                                ViewPropertyAnimator animate = view.animate();
                                c0126j.f2449q.add(a0Var);
                                animate.setDuration(j4).alpha(RecyclerView.f1559A0).setListener(new C0121e(c0126j, a0Var, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0126j.f2445m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0120d runnableC0120d = new RunnableC0120d(c0126j, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0120d.run();
                                    } else {
                                        View view2 = ((C0125i) arrayList5.get(0)).f2431a.f2366a;
                                        WeakHashMap weakHashMap2 = T.f440a;
                                        view2.postOnAnimationDelayed(runnableC0120d, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0126j.f2446n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0120d runnableC0120d2 = new RunnableC0120d(c0126j, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0120d2.run();
                                    } else {
                                        View view3 = ((C0124h) arrayList6.get(0)).f2419a.f2366a;
                                        WeakHashMap weakHashMap3 = T.f440a;
                                        view3.postOnAnimationDelayed(runnableC0120d2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0126j.f2444l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0120d runnableC0120d3 = new RunnableC0120d(c0126j, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0120d3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0126j.f2303e : 0L, !isEmpty3 ? c0126j.f2304f : 0L) + j4;
                                        View view4 = ((a0) arrayList7.get(0)).f2366a;
                                        WeakHashMap weakHashMap4 = T.f440a;
                                        view4.postOnAnimationDelayed(runnableC0120d3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1606k0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f576b).D0();
                return;
            case 9:
                C0236s0 c0236s0 = (C0236s0) this.f576b;
                c0236s0.f3015l = null;
                c0236s0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f576b;
                if (searchView$SearchAutoComplete.f1356f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1356f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f576b).f1374a;
                if (actionMenuView == null || (c0219k = actionMenuView.f1338t) == null) {
                    return;
                }
                c0219k.l();
                return;
            case 12:
                K0.e eVar = (K0.e) this.f576b;
                eVar.f546c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f547e;
                T.e eVar2 = bottomSheetBehavior.f1707M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f545b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1706L == 2) {
                        bottomSheetBehavior.C(eVar.f545b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            u1.d dVar = (u1.d) this.f576b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            u1.c cVar = c2.f3778c;
            g1.d.b(cVar);
            u1.d dVar2 = (u1.d) this.f576b;
            boolean isLoggable = u1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                r1.g gVar2 = cVar.f3781a.f3786a;
                j2 = System.nanoTime();
                i0.g.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                u1.d.a(dVar2, c2);
                if (isLoggable) {
                    r1.g gVar3 = cVar.f3781a.f3786a;
                    i0.g.a(c2, cVar, "finished run in ".concat(i0.g.j(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3786a.f3436a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        r1.g gVar4 = cVar.f3781a.f3786a;
                        i0.g.a(c2, cVar, "failed a run in ".concat(i0.g.j(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
