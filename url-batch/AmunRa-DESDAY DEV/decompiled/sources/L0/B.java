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
import f0.AbstractC0088E;
import f0.C0093d;
import f0.C0096g;
import f0.C0097h;
import f0.C0098i;
import f0.C0101l;
import f0.RunnableC0092c;
import f0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0223k;
import l.C0229n;
import l.C0242t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f484b;

    public /* synthetic */ B(int i, Object obj) {
        this.f483a = i;
        this.f484b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0223k c0223k;
        n1.a c2;
        long j2;
        switch (this.f483a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f484b).f1817c.f534g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f484b;
                if (gVar.f678o) {
                    boolean z3 = gVar.f676m;
                    Q.a aVar = gVar.f667a;
                    if (z3) {
                        gVar.f676m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f663e = currentAnimationTimeMillis;
                        aVar.f665g = -1L;
                        aVar.f664f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f665g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f665g + aVar.i) || !gVar.e()) {
                        gVar.f678o = false;
                        return;
                    }
                    boolean z4 = gVar.f677n;
                    ListView listView = gVar.f669c;
                    if (z4) {
                        gVar.f677n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f664f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f664f;
                    aVar.f664f = currentAnimationTimeMillis2;
                    gVar.f680q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f362a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f484b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0036e animationAnimationListenerC0036e = (AnimationAnimationListenerC0036e) this.f484b;
                animationAnimationListenerC0036e.f956b.endViewTransition(animationAnimationListenerC0036e.f957c);
                animationAnimationListenerC0036e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0044m dialogInterfaceOnCancelListenerC0044m = (DialogInterfaceOnCancelListenerC0044m) this.f484b;
                dialogInterfaceOnCancelListenerC0044m.f969U.onDismiss(dialogInterfaceOnCancelListenerC0044m.f977c0);
                return;
            case 5:
                ((I) this.f484b).y(true);
                return;
            case 6:
                C0101l c0101l = (C0101l) this.f484b;
                int i2 = c0101l.f2170A;
                ValueAnimator valueAnimator = c0101l.f2194z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0101l.f2170A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f484b;
                AbstractC0088E abstractC0088E = recyclerView.f1453H;
                if (abstractC0088E != null) {
                    C0098i c0098i = (C0098i) abstractC0088E;
                    ArrayList arrayList = c0098i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0098i.f2156j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0098i.f2157k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0098i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0098i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2075a;
                                ViewPropertyAnimator animate = view.animate();
                                c0098i.f2163q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0093d(c0098i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0098i.f2159m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0092c runnableC0092c = new RunnableC0092c(c0098i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0092c.run();
                                    } else {
                                        View view2 = ((C0097h) arrayList5.get(0)).f2147a.f2075a;
                                        WeakHashMap weakHashMap2 = S.f362a;
                                        view2.postOnAnimationDelayed(runnableC0092c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0098i.f2160n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0092c runnableC0092c2 = new RunnableC0092c(c0098i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0092c2.run();
                                    } else {
                                        View view3 = ((C0096g) arrayList6.get(0)).f2138a.f2075a;
                                        WeakHashMap weakHashMap3 = S.f362a;
                                        view3.postOnAnimationDelayed(runnableC0092c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0098i.f2158l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0092c runnableC0092c3 = new RunnableC0092c(c0098i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0092c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0098i.f2017e : 0L, !isEmpty3 ? c0098i.f2018f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2075a;
                                        WeakHashMap weakHashMap4 = S.f362a;
                                        view4.postOnAnimationDelayed(runnableC0092c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1483i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f484b).B0();
                return;
            case 9:
                C0242t0 c0242t0 = (C0242t0) this.f484b;
                c0242t0.f3145l = null;
                c0242t0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f484b;
                if (searchView$SearchAutoComplete.f1241f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1241f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f484b).f1259a;
                if (actionMenuView == null || (c0223k = actionMenuView.f1223t) == null) {
                    return;
                }
                c0223k.l();
                return;
            case 12:
                break;
            default:
                J0.e eVar = (J0.e) this.f484b;
                eVar.f348c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f349e;
                S.e eVar2 = bottomSheetBehavior.f1584M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f347b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1583L == 2) {
                        bottomSheetBehavior.C(eVar.f347b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            n1.d dVar = (n1.d) this.f484b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            n1.c cVar = c2.f3283c;
            Z0.d.b(cVar);
            n1.d dVar2 = (n1.d) this.f484b;
            boolean isLoggable = n1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0229n c0229n = cVar.f3286a.f3291a;
                j2 = System.nanoTime();
                k0.y.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                n1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0229n c0229n2 = cVar.f3286a.f3291a;
                    k0.y.a(c2, cVar, "finished run in ".concat(k0.y.e(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3291a.f3111a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C0229n c0229n3 = cVar.f3286a.f3291a;
                        k0.y.a(c2, cVar, "failed a run in ".concat(k0.y.e(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
