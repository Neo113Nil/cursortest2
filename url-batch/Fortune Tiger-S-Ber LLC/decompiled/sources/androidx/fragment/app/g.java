package androidx.fragment.app;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import k.p1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f423f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(int i4, Object obj) {
        this.f423f = i4;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f3.a c;
        long j4;
        k.k kVar;
        switch (this.f423f) {
            case 0:
                h hVar = (h) this.g;
                hVar.f426b.endViewTransition(hVar.c);
                hVar.f427d.d();
                return;
            case 1:
                p pVar = (p) this.g;
                pVar.Z.onDismiss(pVar.f492h0);
                return;
            case 2:
                ((k0) this.g).y(true);
                return;
            case 3:
                b1.n nVar = (b1.n) this.g;
                ValueAnimator valueAnimator = nVar.f873z;
                int i4 = nVar.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                nVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                ((StaggeredGridLayoutManager) this.g).B0();
                return;
            case 5:
                break;
            case 6:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.g).h.f2340l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 7:
                p1 p1Var = (p1) this.g;
                p1Var.f2627q = null;
                p1Var.drawableStateChanged();
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.g;
                if (searchView$SearchAutoComplete.f234k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f234k = false;
                    return;
                }
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.g).f236f;
                if (actionMenuView == null || (kVar = actionMenuView.f223y) == null) {
                    return;
                }
                kVar.l();
                return;
            case 10:
                o0.d dVar = (o0.d) this.g;
                p1 p1Var2 = dVar.h;
                o0.a aVar = dVar.f2965f;
                if (dVar.f2977t) {
                    if (dVar.f2975r) {
                        dVar.f2975r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f2961e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f2962f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.f2963i) || !dVar.e()) {
                        dVar.f2977t = false;
                        return;
                    }
                    if (dVar.f2976s) {
                        dVar.f2976s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        p1Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f2962f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a4 = aVar.a(currentAnimationTimeMillis2);
                    long j5 = currentAnimationTimeMillis2 - aVar.f2962f;
                    aVar.f2962f = currentAnimationTimeMillis2;
                    dVar.f2979v.scrollListBy((int) (j5 * ((a4 * 4.0f) + ((-4.0f) * a4 * a4)) * aVar.f2960d));
                    WeakHashMap weakHashMap = k0.j0.f2752a;
                    p1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                ((q0.e) this.g).m(0);
                return;
            default:
                h2.e eVar = (h2.e) this.g;
                eVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f2016e;
                q0.e eVar2 = bottomSheetBehavior.Q;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f2014b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.F(eVar.f2014b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            f3.d dVar2 = (f3.d) this.g;
            synchronized (dVar2) {
                c = dVar2.c();
            }
            if (c == null) {
                return;
            }
            f3.c cVar = c.c;
            u2.c.b(cVar);
            f3.d dVar3 = (f3.d) this.g;
            boolean isLoggable = f3.d.f1747i.isLoggable(Level.FINE);
            if (isLoggable) {
                j4 = System.nanoTime();
                k3.d.a(c, cVar, "starting");
            } else {
                j4 = -1;
            }
            try {
                f3.d.a(dVar3, c);
                if (isLoggable) {
                    k3.d.a(c, cVar, "finished run in ".concat(k3.d.B(System.nanoTime() - j4)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar3.f1748a.g).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        k3.d.a(c, cVar, "failed a run in ".concat(k3.d.B(System.nanoTime() - j4)));
                    }
                    throw th2;
                }
            }
        }
    }
}
