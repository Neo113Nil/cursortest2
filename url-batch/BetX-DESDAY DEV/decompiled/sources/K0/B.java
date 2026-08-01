package K0;

import K.X;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AnimationAnimationListenerC0048e;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0056m;
import androidx.fragment.app.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.luckyarcade.spinthrow.GameConfig;
import e0.AbstractC0112E;
import e0.C0117d;
import e0.C0120g;
import e0.C0121h;
import e0.C0122i;
import e0.C0125l;
import e0.RunnableC0116c;
import g.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.MenuC0202m;
import l.C0289t0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f525b;

    public /* synthetic */ B(int i, Object obj) {
        this.f524a = i;
        this.f525b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z2;
        l1.a c2;
        long j2;
        switch (this.f524a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f525b).f1984c.f579g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f525b;
                if (gVar.f722o) {
                    boolean z3 = gVar.f720m;
                    Q.a aVar = gVar.f710a;
                    if (z3) {
                        gVar.f720m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f706e = currentAnimationTimeMillis;
                        aVar.f708g = -1L;
                        aVar.f707f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f708g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f708g + aVar.i) || !gVar.e()) {
                        gVar.f722o = false;
                        return;
                    }
                    boolean z4 = gVar.f721n;
                    ListView listView = gVar.f712c;
                    if (z4) {
                        gVar.f721n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f707f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f707f;
                    aVar.f707f = currentAnimationTimeMillis2;
                    gVar.f724q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f705d));
                    WeakHashMap weakHashMap = X.f419a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f525b).n(0);
                return;
            case GameConfig.COMBO_EVERY /* 3 */:
                AnimationAnimationListenerC0048e animationAnimationListenerC0048e = (AnimationAnimationListenerC0048e) this.f525b;
                animationAnimationListenerC0048e.f1337b.endViewTransition(animationAnimationListenerC0048e.f1338c);
                animationAnimationListenerC0048e.f1339d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = (DialogInterfaceOnCancelListenerC0056m) this.f525b;
                dialogInterfaceOnCancelListenerC0056m.f1354U.onDismiss(dialogInterfaceOnCancelListenerC0056m.f1362c0);
                return;
            case 5:
                ((K) this.f525b).y(true);
                return;
            case 6:
                C0125l c0125l = (C0125l) this.f525b;
                int i2 = c0125l.f2281A;
                ValueAnimator valueAnimator = c0125l.f2306z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0125l.f2281A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f525b;
                AbstractC0112E abstractC0112E = recyclerView.f1550H;
                if (abstractC0112E != null) {
                    C0122i c0122i = (C0122i) abstractC0112E;
                    ArrayList arrayList = c0122i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0122i.f2267j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0122i.f2268k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0122i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0122i.f2105d;
                            if (hasNext) {
                                e0.X x2 = (e0.X) it.next();
                                View view = x2.f2172a;
                                ViewPropertyAnimator animate = view.animate();
                                c0122i.f2274q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0117d(c0122i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0122i.f2270m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0116c runnableC0116c = new RunnableC0116c(c0122i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0116c.run();
                                    } else {
                                        View view2 = ((C0121h) arrayList5.get(0)).f2256a.f2172a;
                                        WeakHashMap weakHashMap2 = X.f419a;
                                        view2.postOnAnimationDelayed(runnableC0116c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0122i.f2271n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0116c runnableC0116c2 = new RunnableC0116c(c0122i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0116c2.run();
                                    } else {
                                        View view3 = ((C0120g) arrayList6.get(0)).f2245a.f2172a;
                                        WeakHashMap weakHashMap3 = X.f419a;
                                        view3.postOnAnimationDelayed(runnableC0116c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0122i.f2269l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0116c runnableC0116c3 = new RunnableC0116c(c0122i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0116c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0122i.f2106e : 0L, !isEmpty3 ? c0122i.f2107f : 0L) + j4;
                                        View view4 = ((e0.X) arrayList7.get(0)).f2172a;
                                        WeakHashMap weakHashMap4 = X.f419a;
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
                recyclerView.i0 = z2;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f525b).B0();
                return;
            case 9:
                J j5 = (J) this.f525b;
                g.x xVar = j5.f2502b;
                Menu p2 = j5.p();
                MenuC0202m menuC0202m = p2 instanceof MenuC0202m ? (MenuC0202m) p2 : null;
                if (menuC0202m != null) {
                    menuC0202m.w();
                }
                try {
                    p2.clear();
                    if (xVar.onCreatePanelMenu(0, p2)) {
                        if (!xVar.onPreparePanel(0, null, p2)) {
                        }
                        if (menuC0202m == null) {
                            menuC0202m.v();
                            return;
                        }
                        return;
                    }
                    p2.clear();
                    if (menuC0202m == null) {
                    }
                } catch (Throwable th) {
                    if (menuC0202m != null) {
                        menuC0202m.v();
                    }
                    throw th;
                }
            case GameConfig.SCORE_PER_STICK /* 10 */:
                C0289t0 c0289t0 = (C0289t0) this.f525b;
                c0289t0.f3461l = null;
                c0289t0.drawableStateChanged();
                return;
            case 11:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f525b;
                if (searchView$SearchAutoComplete.f1060f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1060f = false;
                    return;
                }
                return;
            case 12:
                ((Toolbar) this.f525b).v();
                return;
            case 13:
                break;
            default:
                I0.e eVar = (I0.e) this.f525b;
                eVar.f376c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f378e;
                S.e eVar2 = bottomSheetBehavior.f1743M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f375b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1742L == 2) {
                        bottomSheetBehavior.C(eVar.f375b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            l1.e eVar3 = (l1.e) this.f525b;
            synchronized (eVar3) {
                c2 = eVar3.c();
            }
            if (c2 == null) {
                return;
            }
            l1.c cVar = c2.f3517c;
            X0.f.b(cVar);
            l1.e eVar4 = (l1.e) this.f525b;
            boolean isLoggable = l1.e.i.isLoggable(Level.FINE);
            if (isLoggable) {
                l1.d dVar = cVar.f3521a.f3528a;
                j2 = System.nanoTime();
                i1.m.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                l1.e.a(eVar4, c2);
                if (isLoggable) {
                    l1.d dVar2 = cVar.f3521a.f3528a;
                    i1.m.a(c2, cVar, "finished run in ".concat(i1.m.j(System.nanoTime() - j2)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) eVar4.f3528a.f3527a).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        l1.d dVar3 = cVar.f3521a.f3528a;
                        i1.m.a(c2, cVar, "failed a run in ".concat(i1.m.j(System.nanoTime() - j2)));
                    }
                    throw th3;
                }
            }
        }
    }
}
