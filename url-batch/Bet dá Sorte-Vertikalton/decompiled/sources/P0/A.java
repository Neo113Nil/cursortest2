package P0;

import K.S;
import X.AnimationAnimationListenerC0035e;
import X.DialogInterfaceOnCancelListenerC0043m;
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
import f0.C0090d;
import f0.C0093g;
import f0.C0094h;
import f0.C0095i;
import f0.C0098l;
import f0.RunnableC0089c;
import f0.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0219k;
import l.C0234r0;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f584b;

    public /* synthetic */ A(int i, Object obj) {
        this.f583a = i;
        this.f584b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z2;
        C0219k c0219k;
        p1.a c2;
        long j2;
        switch (this.f583a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f584b).f1913c.f633g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f584b;
                if (gVar.f722o) {
                    boolean z3 = gVar.f720m;
                    Q.a aVar = gVar.f711a;
                    if (z3) {
                        gVar.f720m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f707e = currentAnimationTimeMillis;
                        aVar.f709g = -1L;
                        aVar.f708f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f709g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f709g + aVar.i) || !gVar.e()) {
                        gVar.f722o = false;
                        return;
                    }
                    boolean z4 = gVar.f721n;
                    ListView listView = gVar.f713c;
                    if (z4) {
                        gVar.f721n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f708f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f708f;
                    aVar.f708f = currentAnimationTimeMillis2;
                    gVar.f724q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = S.f351a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f584b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0035e animationAnimationListenerC0035e = (AnimationAnimationListenerC0035e) this.f584b;
                animationAnimationListenerC0035e.f999b.endViewTransition(animationAnimationListenerC0035e.f1000c);
                animationAnimationListenerC0035e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0043m dialogInterfaceOnCancelListenerC0043m = (DialogInterfaceOnCancelListenerC0043m) this.f584b;
                dialogInterfaceOnCancelListenerC0043m.f1014U.onDismiss(dialogInterfaceOnCancelListenerC0043m.f1022c0);
                return;
            case 5:
                ((I) this.f584b).y(true);
                return;
            case 6:
                C0098l c0098l = (C0098l) this.f584b;
                int i2 = c0098l.f2213A;
                ValueAnimator valueAnimator = c0098l.f2237z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0098l.f2213A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f584b;
                f0.E e2 = recyclerView.f1495H;
                if (e2 != null) {
                    C0095i c0095i = (C0095i) e2;
                    ArrayList arrayList = c0095i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0095i.f2199j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0095i.f2200k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0095i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0095i.d;
                            if (hasNext) {
                                X x2 = (X) it.next();
                                View view = x2.f2118a;
                                ViewPropertyAnimator animate = view.animate();
                                c0095i.f2206q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0090d(c0095i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0095i.f2202m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0089c runnableC0089c = new RunnableC0089c(c0095i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0089c.run();
                                    } else {
                                        View view2 = ((C0094h) arrayList5.get(0)).f2190a.f2118a;
                                        WeakHashMap weakHashMap2 = S.f351a;
                                        view2.postOnAnimationDelayed(runnableC0089c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0095i.f2203n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0089c runnableC0089c2 = new RunnableC0089c(c0095i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0089c2.run();
                                    } else {
                                        View view3 = ((C0093g) arrayList6.get(0)).f2181a.f2118a;
                                        WeakHashMap weakHashMap3 = S.f351a;
                                        view3.postOnAnimationDelayed(runnableC0089c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0095i.f2201l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0089c runnableC0089c3 = new RunnableC0089c(c0095i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0089c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0095i.f2060e : 0L, !isEmpty3 ? c0095i.f2061f : 0L) + j4;
                                        View view4 = ((X) arrayList7.get(0)).f2118a;
                                        WeakHashMap weakHashMap4 = S.f351a;
                                        view4.postOnAnimationDelayed(runnableC0089c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f1525i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f584b).B0();
                return;
            case 9:
                C0234r0 c0234r0 = (C0234r0) this.f584b;
                c0234r0.f3027l = null;
                c0234r0.drawableStateChanged();
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f584b;
                if (searchView$SearchAutoComplete.f1283f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1283f = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f584b).f1301a;
                if (actionMenuView == null || (c0219k = actionMenuView.f1262t) == null) {
                    return;
                }
                c0219k.l();
                return;
            case 12:
                break;
            default:
                N0.e eVar = (N0.e) this.f584b;
                eVar.f571c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f572e;
                S.e eVar2 = bottomSheetBehavior.f1680M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f570b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1679L == 2) {
                        bottomSheetBehavior.C(eVar.f570b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            p1.d dVar = (p1.d) this.f584b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            p1.c cVar = c2.f3424c;
            b1.d.b(cVar);
            p1.d dVar2 = (p1.d) this.f584b;
            boolean isLoggable = p1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                m1.g gVar2 = cVar.f3427a.f3432a;
                j2 = System.nanoTime();
                k0.w.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                p1.d.a(dVar2, c2);
                if (isLoggable) {
                    m1.g gVar3 = cVar.f3427a.f3432a;
                    k0.w.a(c2, cVar, "finished run in ".concat(k0.w.i(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3432a.f3189a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        m1.g gVar4 = cVar.f3427a.f3432a;
                        k0.w.a(c2, cVar, "failed a run in ".concat(k0.w.i(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
