package N0;

import L.T;
import Z.AnimationAnimationListenerC0038e;
import Z.DialogInterfaceOnCancelListenerC0046m;
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
import h.AbstractC0112a;
import h0.AbstractC0118F;
import h0.C0123e;
import h0.C0126h;
import h0.C0127i;
import h0.C0128j;
import h0.C0131m;
import h0.RunnableC0122d;
import h0.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import m.C0202a0;
import m.C0221k;
import m.C0246w0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f631b;

    public /* synthetic */ B(int i, Object obj) {
        this.f630a = i;
        this.f631b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0221k c0221k;
        v1.a c2;
        long j2;
        switch (this.f630a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f631b).f2016c.f683g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                R.g gVar = (R.g) this.f631b;
                if (gVar.f784o) {
                    boolean z3 = gVar.f782m;
                    R.a aVar = gVar.f772a;
                    if (z3) {
                        gVar.f782m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f767e = currentAnimationTimeMillis;
                        aVar.f769g = -1L;
                        aVar.f768f = currentAnimationTimeMillis;
                        aVar.f770h = 0.5f;
                    }
                    if ((aVar.f769g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f769g + aVar.i) || !gVar.e()) {
                        gVar.f784o = false;
                        return;
                    }
                    boolean z4 = gVar.f783n;
                    ListView listView = gVar.f774c;
                    if (z4) {
                        gVar.f783n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A0, RecyclerView.A0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f768f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f768f;
                    aVar.f768f = currentAnimationTimeMillis2;
                    gVar.f786q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f490a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((U.e) this.f631b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0038e animationAnimationListenerC0038e = (AnimationAnimationListenerC0038e) this.f631b;
                animationAnimationListenerC0038e.f1123b.endViewTransition(animationAnimationListenerC0038e.f1124c);
                animationAnimationListenerC0038e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0046m dialogInterfaceOnCancelListenerC0046m = (DialogInterfaceOnCancelListenerC0046m) this.f631b;
                dialogInterfaceOnCancelListenerC0046m.f1138U.onDismiss(dialogInterfaceOnCancelListenerC0046m.f1146c0);
                return;
            case 5:
                ((I) this.f631b).y(true);
                return;
            case 6:
                C0131m c0131m = (C0131m) this.f631b;
                int i2 = c0131m.f2558A;
                ValueAnimator valueAnimator = c0131m.f2583z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0131m.f2558A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f631b;
                AbstractC0118F abstractC0118F = recyclerView.f1637J;
                if (abstractC0118F != null) {
                    C0128j c0128j = (C0128j) abstractC0118F;
                    ArrayList arrayList = c0128j.f2531h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0128j.f2532j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0128j.f2533k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0128j.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0128j.d;
                            if (hasNext) {
                                a0 a0Var = (a0) it.next();
                                View view = a0Var.f2455a;
                                ViewPropertyAnimator animate = view.animate();
                                c0128j.f2539q.add(a0Var);
                                animate.setDuration(j4).alpha(RecyclerView.A0).setListener(new C0123e(c0128j, a0Var, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0128j.f2535m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0122d runnableC0122d = new RunnableC0122d(c0128j, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0122d.run();
                                    } else {
                                        View view2 = ((C0127i) arrayList5.get(0)).f2517a.f2455a;
                                        WeakHashMap weakHashMap2 = T.f490a;
                                        view2.postOnAnimationDelayed(runnableC0122d, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0128j.f2536n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0122d runnableC0122d2 = new RunnableC0122d(c0128j, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0122d2.run();
                                    } else {
                                        View view3 = ((C0126h) arrayList6.get(0)).f2509a.f2455a;
                                        WeakHashMap weakHashMap3 = T.f490a;
                                        view3.postOnAnimationDelayed(runnableC0122d2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0128j.f2534l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0122d runnableC0122d3 = new RunnableC0122d(c0128j, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0122d3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0128j.f2389e : 0L, !isEmpty3 ? c0128j.f2390f : 0L) + j4;
                                        View view4 = ((a0) arrayList7.get(0)).f2455a;
                                        WeakHashMap weakHashMap4 = T.f490a;
                                        view4.postOnAnimationDelayed(runnableC0122d3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1670k0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f631b).D0();
                return;
            case 9:
                C0246w0 c0246w0 = (C0246w0) this.f631b;
                c0246w0.f3207l = null;
                c0246w0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f631b;
                if (searchView$SearchAutoComplete.f1411f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1411f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f631b).f1429a;
                if (actionMenuView == null || (c0221k = actionMenuView.f1392t) == null) {
                    return;
                }
                c0221k.l();
                return;
            case 12:
                L0.e eVar = (L0.e) this.f631b;
                eVar.f599c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f600e;
                U.e eVar2 = bottomSheetBehavior.f1771M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f598b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1770L == 2) {
                        bottomSheetBehavior.C(eVar.f598b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            v1.d dVar = (v1.d) this.f631b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            v1.c cVar = c2.f3959c;
            h1.d.b(cVar);
            v1.d dVar2 = (v1.d) this.f631b;
            boolean isLoggable = v1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0202a0 c0202a0 = cVar.f3962a.f3968a;
                j2 = System.nanoTime();
                AbstractC0112a.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                v1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0202a0 c0202a02 = cVar.f3962a.f3968a;
                    AbstractC0112a.a(c2, cVar, "finished run in ".concat(AbstractC0112a.j(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3968a.f3068a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0202a0 c0202a03 = cVar.f3962a.f3968a;
                        AbstractC0112a.a(c2, cVar, "failed a run in ".concat(AbstractC0112a.j(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
