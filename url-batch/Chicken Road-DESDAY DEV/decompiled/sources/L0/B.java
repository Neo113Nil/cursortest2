package L0;

import K.S;
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
import f0.AbstractC0090E;
import f0.C0095d;
import f0.C0098g;
import f0.C0099h;
import f0.C0100i;
import f0.C0103l;
import f0.RunnableC0094c;
import f0.X;
import j0.AbstractC0143a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0207a0;
import l.C0226k;
import l.C0245t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f495b;

    public /* synthetic */ B(int i, Object obj) {
        this.f494a = i;
        this.f495b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0226k c0226k;
        p1.a c2;
        long j2;
        switch (this.f494a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f495b).f1848c.f546g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f495b;
                if (gVar.f664o) {
                    boolean z3 = gVar.f662m;
                    Q.a aVar = gVar.f653a;
                    if (z3) {
                        gVar.f662m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f649e = currentAnimationTimeMillis;
                        aVar.f651g = -1L;
                        aVar.f650f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f651g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f651g + aVar.i) || !gVar.e()) {
                        gVar.f664o = false;
                        return;
                    }
                    boolean z4 = gVar.f663n;
                    ListView listView = gVar.f655c;
                    if (z4) {
                        gVar.f663n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f650f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f650f;
                    aVar.f650f = currentAnimationTimeMillis2;
                    gVar.f666q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f369a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f495b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f495b;
                animationAnimationListenerC0036e.f985b.endViewTransition(animationAnimationListenerC0036e.f986c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f495b;
                dialogInterfaceOnCancelListenerC0044m.f1000U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f1008c0);
                return;
            case 5:
                ((I) this.f495b).y(true);
                return;
            case 6:
                C0103l c0103l = (C0103l) this.f495b;
                int i2 = c0103l.f2171A;
                ValueAnimator valueAnimator = c0103l.f2195z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0103l.f2171A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f495b;
                AbstractC0090E abstractC0090E = recyclerView.f1478H;
                if (abstractC0090E != null) {
                    C0100i c0100i = (C0100i) abstractC0090E;
                    ArrayList arrayList = c0100i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0100i.f2157j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0100i.f2158k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0100i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0100i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2076a;
                                ViewPropertyAnimator animate = view.animate();
                                c0100i.f2164q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0095d(c0100i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0100i.f2160m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0094c runnableC0094c = new RunnableC0094c(c0100i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0094c.run();
                                    } else {
                                        View view2 = ((C0099h) arrayList5.get(0)).f2148a.f2076a;
                                        WeakHashMap weakHashMap2 = S.f369a;
                                        view2.postOnAnimationDelayed(runnableC0094c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0100i.f2161n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0094c runnableC0094c2 = new RunnableC0094c(c0100i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0094c2.run();
                                    } else {
                                        View view3 = ((C0098g) arrayList6.get(0)).f2139a.f2076a;
                                        WeakHashMap weakHashMap3 = S.f369a;
                                        view3.postOnAnimationDelayed(runnableC0094c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0100i.f2159l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0094c runnableC0094c3 = new RunnableC0094c(c0100i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0094c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0100i.f2018e : 0L, !isEmpty3 ? c0100i.f2019f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2076a;
                                        WeakHashMap weakHashMap4 = S.f369a;
                                        view4.postOnAnimationDelayed(runnableC0094c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1508i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f495b).B0();
                return;
            case 9:
                C0245t0 c0245t0 = (C0245t0) this.f495b;
                c0245t0.f3003l = null;
                c0245t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f495b;
                if (searchView$SearchAutoComplete.f1266f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1266f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f495b).f1284a;
                if (actionMenuView == null || (c0226k = actionMenuView.f1248t) == null) {
                    return;
                }
                c0226k.l();
                return;
            case 12:
                break;
            default:
                J0.e eVar = (J0.e) this.f495b;
                eVar.f355c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f356e;
                S.e eVar2 = bottomSheetBehavior.f1614M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f354b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1613L == 2) {
                        bottomSheetBehavior.C(eVar.f354b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            p1.d dVar = (p1.d) this.f495b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            p1.c cVar = c2.f3391c;
            b1.d.b(cVar);
            p1.d dVar2 = (p1.d) this.f495b;
            boolean isLoggable = p1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0207a0 c0207a0 = cVar.f3394a.f3399a;
                j2 = System.nanoTime();
                AbstractC0143a.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                p1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0207a0 c0207a02 = cVar.f3394a.f3399a;
                    AbstractC0143a.a(c2, cVar, "finished run in ".concat(AbstractC0143a.j(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3399a.f2889a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0207a0 c0207a03 = cVar.f3394a.f3399a;
                        AbstractC0143a.a(c2, cVar, "failed a run in ".concat(AbstractC0143a.j(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
