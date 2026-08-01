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
import f0.AbstractC0089E;
import f0.C0094d;
import f0.C0097g;
import f0.C0098h;
import f0.C0099i;
import f0.C0102l;
import f0.RunnableC0093c;
import f0.X;
import j0.AbstractC0142a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0225k;
import l.C0242s0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f548b;

    public /* synthetic */ B(int i, Object obj) {
        this.f547a = i;
        this.f548b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0225k c0225k;
        s1.a c2;
        long j2;
        switch (this.f547a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f548b).f1885c.f598g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f548b;
                if (gVar.f717o) {
                    boolean z3 = gVar.f715m;
                    Q.a aVar = gVar.f706a;
                    if (z3) {
                        gVar.f715m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f702e = currentAnimationTimeMillis;
                        aVar.f704g = -1L;
                        aVar.f703f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f704g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f704g + aVar.i) || !gVar.e()) {
                        gVar.f717o = false;
                        return;
                    }
                    boolean z4 = gVar.f716n;
                    ListView listView = gVar.f708c;
                    if (z4) {
                        gVar.f716n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f703f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f703f;
                    aVar.f703f = currentAnimationTimeMillis2;
                    gVar.f719q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f422a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f548b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f548b;
                animationAnimationListenerC0036e.f1025b.endViewTransition(animationAnimationListenerC0036e.f1026c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f548b;
                dialogInterfaceOnCancelListenerC0044m.f1040U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f1048c0);
                return;
            case 5:
                ((I) this.f548b).y(true);
                return;
            case 6:
                C0102l c0102l = (C0102l) this.f548b;
                int i2 = c0102l.f2238A;
                ValueAnimator valueAnimator = c0102l.f2262z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0102l.f2238A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f548b;
                AbstractC0089E abstractC0089E = recyclerView.f1523H;
                if (abstractC0089E != null) {
                    C0099i c0099i = (C0099i) abstractC0089E;
                    ArrayList arrayList = c0099i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0099i.f2224j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0099i.f2225k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0099i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0099i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2143a;
                                ViewPropertyAnimator animate = view.animate();
                                c0099i.f2231q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0094d(c0099i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0099i.f2227m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0093c runnableC0093c = new RunnableC0093c(c0099i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0093c.run();
                                    } else {
                                        View view2 = ((C0098h) arrayList5.get(0)).f2215a.f2143a;
                                        WeakHashMap weakHashMap2 = S.f422a;
                                        view2.postOnAnimationDelayed(runnableC0093c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0099i.f2228n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0093c runnableC0093c2 = new RunnableC0093c(c0099i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0093c2.run();
                                    } else {
                                        View view3 = ((C0097g) arrayList6.get(0)).f2206a.f2143a;
                                        WeakHashMap weakHashMap3 = S.f422a;
                                        view3.postOnAnimationDelayed(runnableC0093c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0099i.f2226l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0093c runnableC0093c3 = new RunnableC0093c(c0099i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0093c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0099i.f2085e : 0L, !isEmpty3 ? c0099i.f2086f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2143a;
                                        WeakHashMap weakHashMap4 = S.f422a;
                                        view4.postOnAnimationDelayed(runnableC0093c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1553i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f548b).B0();
                return;
            case 9:
                C0242s0 c0242s0 = (C0242s0) this.f548b;
                c0242s0.f3051l = null;
                c0242s0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f548b;
                if (searchView$SearchAutoComplete.f1311f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1311f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f548b).f1329a;
                if (actionMenuView == null || (c0225k = actionMenuView.f1293t) == null) {
                    return;
                }
                c0225k.l();
                return;
            case 12:
                break;
            default:
                J0.e eVar = (J0.e) this.f548b;
                eVar.f408c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f409e;
                S.e eVar2 = bottomSheetBehavior.f1651M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f407b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1650L == 2) {
                        bottomSheetBehavior.C(eVar.f407b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            s1.d dVar = (s1.d) this.f548b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            s1.c cVar = c2.f3668c;
            e1.d.b(cVar);
            s1.d dVar2 = (s1.d) this.f548b;
            boolean isLoggable = s1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                p1.g gVar2 = cVar.f3671a.f3676a;
                j2 = System.nanoTime();
                AbstractC0142a.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                s1.d.a(dVar2, c2);
                if (isLoggable) {
                    p1.g gVar3 = cVar.f3671a.f3676a;
                    AbstractC0142a.a(c2, cVar, "finished run in ".concat(AbstractC0142a.h(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3676a.f3336a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        p1.g gVar4 = cVar.f3671a.f3676a;
                        AbstractC0142a.a(c2, cVar, "failed a run in ".concat(AbstractC0142a.h(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
