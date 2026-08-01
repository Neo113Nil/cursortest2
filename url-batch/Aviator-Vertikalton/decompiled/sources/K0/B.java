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
import e0.AbstractC0111E;
import e0.C0116d;
import e0.C0119g;
import e0.C0120h;
import e0.C0121i;
import e0.C0124l;
import e0.RunnableC0115c;
import g.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.MenuC0200m;
import l.C0274n;
import l.C0289u0;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f524b;

    public /* synthetic */ B(int i, Object obj) {
        this.f523a = i;
        this.f524b = obj;
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
        switch (this.f523a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f524b).f2006c.f578g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f524b;
                if (gVar.f721o) {
                    boolean z3 = gVar.f719m;
                    Q.a aVar = gVar.f709a;
                    if (z3) {
                        gVar.f719m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f705e = currentAnimationTimeMillis;
                        aVar.f707g = -1L;
                        aVar.f706f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f707g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f707g + aVar.i) || !gVar.e()) {
                        gVar.f721o = false;
                        return;
                    }
                    boolean z4 = gVar.f720n;
                    ListView listView = gVar.f711c;
                    if (z4) {
                        gVar.f720n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f706f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f706f;
                    aVar.f706f = currentAnimationTimeMillis2;
                    gVar.f723q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f704d));
                    WeakHashMap weakHashMap = X.f418a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((S.e) this.f524b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0048e animationAnimationListenerC0048e = (AnimationAnimationListenerC0048e) this.f524b;
                animationAnimationListenerC0048e.f1336b.endViewTransition(animationAnimationListenerC0048e.f1337c);
                animationAnimationListenerC0048e.f1338d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0056m dialogInterfaceOnCancelListenerC0056m = (DialogInterfaceOnCancelListenerC0056m) this.f524b;
                dialogInterfaceOnCancelListenerC0056m.f1353U.onDismiss(dialogInterfaceOnCancelListenerC0056m.f1361c0);
                return;
            case 5:
                ((K) this.f524b).y(true);
                return;
            case 6:
                C0124l c0124l = (C0124l) this.f524b;
                int i2 = c0124l.f2277A;
                ValueAnimator valueAnimator = c0124l.f2302z;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0124l.f2277A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f524b;
                AbstractC0111E abstractC0111E = recyclerView.f1549H;
                if (abstractC0111E != null) {
                    C0121i c0121i = (C0121i) abstractC0111E;
                    ArrayList arrayList = c0121i.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0121i.f2263j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0121i.f2264k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0121i.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j4 = c0121i.f2101d;
                            if (hasNext) {
                                e0.X x2 = (e0.X) it.next();
                                View view = x2.f2168a;
                                ViewPropertyAnimator animate = view.animate();
                                c0121i.f2270q.add(x2);
                                animate.setDuration(j4).alpha(0.0f).setListener(new C0116d(c0121i, x2, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0121i.f2266m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0115c runnableC0115c = new RunnableC0115c(c0121i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0115c.run();
                                    } else {
                                        View view2 = ((C0120h) arrayList5.get(0)).f2252a.f2168a;
                                        WeakHashMap weakHashMap2 = X.f418a;
                                        view2.postOnAnimationDelayed(runnableC0115c, j4);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0121i.f2267n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0115c runnableC0115c2 = new RunnableC0115c(c0121i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0115c2.run();
                                    } else {
                                        View view3 = ((C0119g) arrayList6.get(0)).f2241a.f2168a;
                                        WeakHashMap weakHashMap3 = X.f418a;
                                        view3.postOnAnimationDelayed(runnableC0115c2, j4);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0121i.f2265l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0115c runnableC0115c3 = new RunnableC0115c(c0121i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0115c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j4 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0121i.f2102e : 0L, !isEmpty3 ? c0121i.f2103f : 0L) + j4;
                                        View view4 = ((e0.X) arrayList7.get(0)).f2168a;
                                        WeakHashMap weakHashMap4 = X.f418a;
                                        view4.postOnAnimationDelayed(runnableC0115c3, max);
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
                ((StaggeredGridLayoutManager) this.f524b).B0();
                return;
            case 9:
                J j5 = (J) this.f524b;
                g.x xVar = j5.f2498b;
                Menu p2 = j5.p();
                MenuC0200m menuC0200m = p2 instanceof MenuC0200m ? (MenuC0200m) p2 : null;
                if (menuC0200m != null) {
                    menuC0200m.w();
                }
                try {
                    p2.clear();
                    if (xVar.onCreatePanelMenu(0, p2)) {
                        if (!xVar.onPreparePanel(0, null, p2)) {
                        }
                        if (menuC0200m == null) {
                            menuC0200m.v();
                            return;
                        }
                        return;
                    }
                    p2.clear();
                    if (menuC0200m == null) {
                    }
                } catch (Throwable th) {
                    if (menuC0200m != null) {
                        menuC0200m.v();
                    }
                    throw th;
                }
            case 10:
                C0289u0 c0289u0 = (C0289u0) this.f524b;
                c0289u0.f3462l = null;
                c0289u0.drawableStateChanged();
                return;
            case 11:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f524b;
                if (searchView$SearchAutoComplete.f1059f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1059f = false;
                    return;
                }
                return;
            case 12:
                ((Toolbar) this.f524b).v();
                return;
            case 13:
                break;
            default:
                I0.e eVar = (I0.e) this.f524b;
                eVar.f377c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f379e;
                S.e eVar2 = bottomSheetBehavior.f1765M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f376b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1764L == 2) {
                        bottomSheetBehavior.C(eVar.f376b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            l1.d dVar = (l1.d) this.f524b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            l1.c cVar = c2.f3514c;
            X0.f.b(cVar);
            l1.d dVar2 = (l1.d) this.f524b;
            boolean isLoggable = l1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                C0274n c0274n = cVar.f3518a.f3524a;
                j2 = System.nanoTime();
                i1.m.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                l1.d.a(dVar2, c2);
                if (isLoggable) {
                    C0274n c0274n2 = cVar.f3518a.f3524a;
                    i1.m.a(c2, cVar, "finished run in ".concat(i1.m.j(System.nanoTime() - j2)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3524a.f3416a).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        C0274n c0274n3 = cVar.f3518a.f3524a;
                        i1.m.a(c2, cVar, "failed a run in ".concat(i1.m.j(System.nanoTime() - j2)));
                    }
                    throw th3;
                }
            }
        }
    }
}
