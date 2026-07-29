package K0;

import K.T;
import X.AnimationAnimationListenerC0036e;
import X.DialogInterfaceOnCancelListenerC0044m;
import X.I;
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
import f0.C0087d;
import f0.C0090g;
import f0.C0091h;
import f0.C0092i;
import f0.C0095l;
import f0.RunnableC0086c;
import f0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0242k;
import l.C0244l;
import l.C0261t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ B(int i, Object obj) {
        this.f475a = i;
        this.f476b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0244l c0244l;
        l1.a c2;
        long j2;
        switch (this.f475a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f476b).f1782c.f526g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f476b;
                if (gVar.f647o) {
                    boolean z3 = gVar.f645m;
                    Q.a aVar = gVar.f636a;
                    if (z3) {
                        gVar.f645m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f632e = currentAnimationTimeMillis;
                        aVar.f634g = -1L;
                        aVar.f633f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f634g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f634g + aVar.i) || !gVar.e()) {
                        gVar.f647o = false;
                        return;
                    }
                    boolean z4 = gVar.f646n;
                    ListView listView = gVar.f638c;
                    if (z4) {
                        gVar.f646n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f633f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f633f;
                    aVar.f633f = currentAnimationTimeMillis2;
                    gVar.f649q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f381a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f476b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f476b;
                animationAnimationListenerC0036e.f908b.endViewTransition(animationAnimationListenerC0036e.f909c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f476b;
                dialogInterfaceOnCancelListenerC0044m.f923U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f931c0);
                return;
            case 5:
                ((I) this.f476b).y(true);
                return;
            case 6:
                C0095l c0095l = (C0095l) this.f476b;
                int i2 = c0095l.f2102A;
                ValueAnimator valueAnimator = c0095l.f2126z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0095l.f2102A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f476b;
                f0.E e2 = recyclerView.f1415H;
                if (e2 != null) {
                    C0092i c0092i = (C0092i) e2;
                    ArrayList arrayList = c0092i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0092i.f2088j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0092i.f2089k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0092i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0092i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2007a;
                                ViewPropertyAnimator animate = view.animate();
                                c0092i.f2095q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0087d(c0092i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0092i.f2091m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0086c runnableC0086c = new RunnableC0086c(c0092i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0086c.run();
                                    } else {
                                        View view2 = ((C0091h) arrayList5.get(0)).f2079a.f2007a;
                                        WeakHashMap weakHashMap2 = T.f381a;
                                        view2.postOnAnimationDelayed(runnableC0086c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0092i.f2092n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0086c runnableC0086c2 = new RunnableC0086c(c0092i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0086c2.run();
                                    } else {
                                        View view3 = ((C0090g) arrayList6.get(0)).f2070a.f2007a;
                                        WeakHashMap weakHashMap3 = T.f381a;
                                        view3.postOnAnimationDelayed(runnableC0086c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0092i.f2090l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0086c runnableC0086c3 = new RunnableC0086c(c0092i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0086c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0092i.f1949e : 0L, !isEmpty3 ? c0092i.f1950f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2007a;
                                        WeakHashMap weakHashMap4 = T.f381a;
                                        view4.postOnAnimationDelayed(runnableC0086c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1445i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f476b).B0();
                return;
            case 9:
                C0261t0 c0261t0 = (C0261t0) this.f476b;
                c0261t0.f3045l = null;
                c0261t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f476b;
                if (searchView$SearchAutoComplete.f1203f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1203f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f476b).f1221a;
                if (actionMenuView == null || (c0244l = actionMenuView.f1185t) == null) {
                    return;
                }
                c0244l.l();
                return;
            case 12:
                break;
            default:
                I0.e eVar = (I0.e) this.f476b;
                eVar.f350c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f351e;
                S.e eVar2 = bottomSheetBehavior.f1549M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f349b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1548L == 2) {
                        bottomSheetBehavior.C(eVar.f349b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            l1.d dVar = (l1.d) this.f476b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            l1.c cVar = c2.f3152c;
            X0.e.b(cVar);
            l1.d dVar2 = (l1.d) this.f476b;
            boolean isLoggable = l1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0242k c0242k = cVar.f3155a.f3160a;
                j2 = System.nanoTime();
                i1.r.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                l1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0242k c0242k2 = cVar.f3155a.f3160a;
                    i1.r.a(c2, cVar, "finished run in ".concat(i1.r.g(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3160a.f2986a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0242k c0242k3 = cVar.f3155a.f3160a;
                        i1.r.a(c2, cVar, "failed a run in ".concat(i1.r.g(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
