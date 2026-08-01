package O0;

import M.Q;
import Z.AnimationAnimationListenerC0035e;
import Z.DialogInterfaceOnCancelListenerC0043m;
import Z.I;
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
import h0.C0117d;
import h0.C0120g;
import h0.C0121h;
import h0.C0122i;
import h0.C0125l;
import h0.RunnableC0116c;
import h0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0176a0;
import l.C0195k;
import l.C0213t0;
import m.C0227a;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f646b;

    public /* synthetic */ B(int i, Object obj) {
        this.f645a = i;
        this.f646b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0195k c0195k;
        u1.a c2;
        long j2;
        switch (this.f645a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f646b).f1996c.f696g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                S.g gVar = (S.g) this.f646b;
                if (gVar.f790o) {
                    boolean z3 = gVar.f788m;
                    S.a aVar = gVar.f779a;
                    if (z3) {
                        gVar.f788m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f775e = currentAnimationTimeMillis;
                        aVar.f777g = -1L;
                        aVar.f776f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f777g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f777g + aVar.i) || !gVar.e()) {
                        gVar.f790o = false;
                        return;
                    }
                    boolean z4 = gVar.f789n;
                    ListView listView = gVar.f781c;
                    if (z4) {
                        gVar.f789n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f776f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f776f;
                    aVar.f776f = currentAnimationTimeMillis2;
                    gVar.f792q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = Q.f513a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((U.e) this.f646b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0035e animationAnimationListenerC0035e = (AnimationAnimationListenerC0035e) this.f646b;
                animationAnimationListenerC0035e.f1134b.endViewTransition(animationAnimationListenerC0035e.f1135c);
                animationAnimationListenerC0035e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = (DialogInterfaceOnCancelListenerC0043m) this.f646b;
                dialogInterfaceOnCancelListenerC0043m.f1149U.onDismiss(dialogInterfaceOnCancelListenerC0043m.f1157c0);
                return;
            case 5:
                ((I) this.f646b).y(true);
                return;
            case 6:
                C0125l c0125l = (C0125l) this.f646b;
                int i2 = c0125l.f2529A;
                ValueAnimator valueAnimator = c0125l.f2553z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0125l.f2529A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f646b;
                h0.E e2 = recyclerView.H;
                if (e2 != null) {
                    C0122i c0122i = (C0122i) e2;
                    ArrayList arrayList = c0122i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0122i.f2512j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0122i.f2513k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0122i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0122i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2430a;
                                ViewPropertyAnimator animate = view.animate();
                                c0122i.f2519q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0117d(c0122i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0122i.f2515m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0116c runnableC0116c = new RunnableC0116c(c0122i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0116c.run();
                                    } else {
                                        View view2 = ((C0121h) arrayList5.get(0)).f2502a.f2430a;
                                        WeakHashMap weakHashMap2 = Q.f513a;
                                        view2.postOnAnimationDelayed(runnableC0116c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0122i.f2516n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0116c runnableC0116c2 = new RunnableC0116c(c0122i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0116c2.run();
                                    } else {
                                        View view3 = ((C0120g) arrayList6.get(0)).f2492a.f2430a;
                                        WeakHashMap weakHashMap3 = Q.f513a;
                                        view3.postOnAnimationDelayed(runnableC0116c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0122i.f2514l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0116c runnableC0116c3 = new RunnableC0116c(c0122i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0116c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0122i.f2372e : 0L, !isEmpty3 ? c0122i.f2373f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2430a;
                                        WeakHashMap weakHashMap4 = Q.f513a;
                                        view4.postOnAnimationDelayed(runnableC0116c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1655i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f646b).B0();
                return;
            case 9:
                C0213t0 c0213t0 = (C0213t0) this.f646b;
                c0213t0.f3076l = null;
                c0213t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f646b;
                if (searchView$SearchAutoComplete.f1413f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1413f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f646b).f1431a;
                if (actionMenuView == null || (c0195k = actionMenuView.f1395t) == null) {
                    return;
                }
                c0195k.l();
                return;
            case 12:
                break;
            default:
                M0.e eVar = (M0.e) this.f646b;
                eVar.f615c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f616e;
                U.e eVar2 = bottomSheetBehavior.f1755M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f614b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1754L == 2) {
                        bottomSheetBehavior.C(eVar.f614b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            u1.d dVar = (u1.d) this.f646b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            u1.c cVar = c2.f3785c;
            g1.d.b(cVar);
            u1.d dVar2 = (u1.d) this.f646b;
            boolean isLoggable = u1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0176a0 c0176a0 = cVar.f3788a.f3793a;
                j2 = System.nanoTime();
                C0227a.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                u1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0176a0 c0176a02 = cVar.f3788a.f3793a;
                    C0227a.a(c2, cVar, "finished run in ".concat(C0227a.i(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3793a.f2962a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0176a0 c0176a03 = cVar.f3788a.f3793a;
                        C0227a.a(c2, cVar, "failed a run in ".concat(C0227a.i(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
