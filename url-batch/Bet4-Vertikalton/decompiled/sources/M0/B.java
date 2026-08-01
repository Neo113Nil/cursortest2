package M0;

import K.T;
import Y.AnimationAnimationListenerC0039e;
import Y.DialogInterfaceOnCancelListenerC0047m;
import Y.I;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
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
import g0.C0128n;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import l.C0216k;
import l.C0233s0;
import l.Z;

/* loaded from: classes.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f559b;

    public /* synthetic */ B(int i, Object obj) {
        this.f558a = i;
        this.f559b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0216k c0216k;
        r1.a c2;
        long j2;
        switch (this.f558a) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f559b).f1909c.f609g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                Q.g gVar = (Q.g) this.f559b;
                if (gVar.f738o) {
                    boolean z2 = gVar.f736m;
                    Q.a aVar = gVar.f727a;
                    if (z2) {
                        gVar.f736m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f723e = currentAnimationTimeMillis;
                        aVar.f725g = -1L;
                        aVar.f724f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f725g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f725g + aVar.i) || !gVar.e()) {
                        gVar.f738o = false;
                        return;
                    }
                    boolean z3 = gVar.f737n;
                    ListView listView = gVar.f729c;
                    if (z3) {
                        gVar.f737n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f1530C0, RecyclerView.f1530C0, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f724f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f724f;
                    aVar.f724f = currentAnimationTimeMillis2;
                    gVar.f740q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = T.f423a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((T.e) this.f559b).n(0);
                return;
            case 3:
                AnimationAnimationListenerC0039e animationAnimationListenerC0039e = (AnimationAnimationListenerC0039e) this.f559b;
                animationAnimationListenerC0039e.f1045b.endViewTransition(animationAnimationListenerC0039e.f1046c);
                animationAnimationListenerC0039e.d.d();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0047m dialogInterfaceOnCancelListenerC0047m = (DialogInterfaceOnCancelListenerC0047m) this.f559b;
                dialogInterfaceOnCancelListenerC0047m.f1060U.onDismiss(dialogInterfaceOnCancelListenerC0047m.f1068c0);
                return;
            case 5:
                ((I) this.f559b).y(true);
                return;
            case 6:
                C0128n c0128n = (C0128n) this.f559b;
                int i = c0128n.f2433A;
                ValueAnimator valueAnimator = c0128n.f2457z;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c0128n.f2433A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), RecyclerView.f1530C0);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.f559b).D0();
                return;
            case 8:
                C0233s0 c0233s0 = (C0233s0) this.f559b;
                c0233s0.f2990l = null;
                c0233s0.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f559b;
                if (searchView$SearchAutoComplete.f1325f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1325f = false;
                    return;
                }
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) this.f559b).f1343a;
                if (actionMenuView == null || (c0216k = actionMenuView.f1307t) == null) {
                    return;
                }
                c0216k.l();
                return;
            case 11:
                break;
            default:
                K0.e eVar = (K0.e) this.f559b;
                eVar.f529c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f530e;
                T.e eVar2 = bottomSheetBehavior.f1676M;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f528b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1675L == 2) {
                        bottomSheetBehavior.C(eVar.f528b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            r1.d dVar = (r1.d) this.f559b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            r1.c cVar = c2.f3511c;
            d1.d.b(cVar);
            r1.d dVar2 = (r1.d) this.f559b;
            boolean isLoggable = r1.d.i.isLoggable(Level.FINE);
            if (isLoggable) {
                Z z4 = cVar.f3514a.f3519a;
                j2 = System.nanoTime();
                h1.d.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                r1.d.a(dVar2, c2);
                if (isLoggable) {
                    Z z5 = cVar.f3514a.f3519a;
                    h1.d.a(c2, cVar, "finished run in ".concat(h1.d.g(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f3519a.f2878a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        Z z6 = cVar.f3514a.f3519a;
                        h1.d.a(c2, cVar, "failed a run in ".concat(h1.d.g(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
