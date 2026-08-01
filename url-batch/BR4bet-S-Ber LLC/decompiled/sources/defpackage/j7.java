package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        h80 c;
        long j;
        i1 i1Var;
        switch (this.f) {
            case 0:
                rt rtVar = (rt) this.g;
                mi miVar = rtVar.h;
                i7 i7Var = rtVar.f;
                if (rtVar.t) {
                    if (rtVar.r) {
                        rtVar.r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        i7Var.e = currentAnimationTimeMillis;
                        i7Var.g = -1L;
                        i7Var.f = currentAnimationTimeMillis;
                        i7Var.h = 0.5f;
                    }
                    if ((i7Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > i7Var.g + i7Var.i) || !rtVar.e()) {
                        rtVar.t = false;
                        return;
                    }
                    if (rtVar.s) {
                        rtVar.s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        miVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (i7Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = i7Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - i7Var.f;
                    i7Var.f = currentAnimationTimeMillis2;
                    rtVar.v.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * i7Var.d));
                    WeakHashMap weakHashMap = ic0.a;
                    miVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                w8 w8Var = (w8) this.g;
                w8Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) w8Var.e;
                kc0 kc0Var = bottomSheetBehavior.Q;
                if (kc0Var != null && kc0Var.f()) {
                    w8Var.a(w8Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.M(w8Var.b);
                        return;
                    }
                    return;
                }
            case 2:
                qg qgVar = (qg) this.g;
                qgVar.b.endViewTransition(qgVar.c);
                qgVar.d.d();
                return;
            case 3:
                ph phVar = (ph) this.g;
                phVar.b0.onDismiss(phVar.j0);
                return;
            case 4:
                mi miVar2 = (mi) this.g;
                miVar2.q = null;
                miVar2.drawableStateChanged();
                return;
            case 5:
                ll llVar = (ll) this.g;
                ValueAnimator valueAnimator = llVar.z;
                int i = llVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                llVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 6:
                ((en) this.g).y(true);
                return;
            case 7:
                synchronized (((rx) this.g).a) {
                    obj = ((rx) this.g).f;
                    ((rx) this.g).f = rx.k;
                }
                ((rx) this.g).d(obj);
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.g;
                if (searchView$SearchAutoComplete.k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.k = false;
                    return;
                }
                return;
            case 9:
                ((StaggeredGridLayoutManager) this.g).B0();
                return;
            case 10:
                break;
            case 11:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.g).h.l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.g).f;
                if (actionMenuView == null || (i1Var = actionMenuView.y) == null) {
                    return;
                }
                i1Var.l();
                return;
            default:
                ((kc0) this.g).m(0);
                return;
        }
        while (true) {
            l80 l80Var = (l80) this.g;
            synchronized (l80Var) {
                c = l80Var.c();
            }
            if (c == null) {
                return;
            }
            k80 k80Var = c.c;
            k80Var.getClass();
            l80 l80Var2 = (l80) this.g;
            boolean isLoggable = l80.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                la0.c(c, k80Var, "starting");
            } else {
                j = -1;
            }
            try {
                l80.a(l80Var2, c);
                if (isLoggable) {
                    la0.c(c, k80Var, "finished run in ".concat(la0.u(System.nanoTime() - j)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) l80Var2.a.f).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        la0.c(c, k80Var, "failed a run in ".concat(la0.u(System.nanoTime() - j)));
                    }
                    throw th2;
                }
            }
        }
    }
}
