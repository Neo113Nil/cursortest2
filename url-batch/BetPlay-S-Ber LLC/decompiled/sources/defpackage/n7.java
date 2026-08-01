package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.n;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class n7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        k50 c;
        long j;
        k1 k1Var;
        switch (this.f) {
            case 0:
                mr mrVar = (mr) this.g;
                dg dgVar = mrVar.h;
                m7 m7Var = mrVar.f;
                if (mrVar.t) {
                    if (mrVar.r) {
                        mrVar.r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        m7Var.e = currentAnimationTimeMillis;
                        m7Var.g = -1L;
                        m7Var.f = currentAnimationTimeMillis;
                        m7Var.h = 0.5f;
                    }
                    if ((m7Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > m7Var.g + m7Var.i) || !mrVar.e()) {
                        mrVar.t = false;
                        return;
                    }
                    if (mrVar.s) {
                        mrVar.s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        dgVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (m7Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = m7Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - m7Var.f;
                    m7Var.f = currentAnimationTimeMillis2;
                    mrVar.v.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * m7Var.d));
                    WeakHashMap weakHashMap = e90.a;
                    dgVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                we weVar = (we) this.g;
                weVar.b.endViewTransition(weVar.c);
                weVar.d.a();
                return;
            case 2:
                fl.a((ArrayList) this.g, 4);
                return;
            case 3:
                g gVar = (g) this.g;
                onDismissListener = gVar.mOnDismissListener;
                dialog = gVar.mDialog;
                onDismissListener.onDismiss(dialog);
                return;
            case 4:
                dg dgVar2 = (dg) this.g;
                dgVar2.q = null;
                dgVar2.drawableStateChanged();
                return;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                wi wiVar = (wi) this.g;
                ValueAnimator valueAnimator = wiVar.z;
                int i = wiVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                wiVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                ((f) this.g).d();
                return;
            case 7:
                ((n) this.g).x(true);
                return;
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
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
                if (actionMenuView == null || (k1Var = actionMenuView.y) == null) {
                    return;
                }
                k1Var.l();
                return;
            default:
                ((h90) this.g).m(0);
                return;
        }
        while (true) {
            m50 m50Var = (m50) this.g;
            synchronized (m50Var) {
                c = m50Var.c();
            }
            if (c == null) {
                return;
            }
            l50 l50Var = c.c;
            l50Var.getClass();
            m50 m50Var2 = (m50) this.g;
            boolean isLoggable = m50.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                vw.d(c, l50Var, "starting");
            } else {
                j = -1;
            }
            try {
                m50.a(m50Var2, c);
                if (isLoggable) {
                    vw.d(c, l50Var, "finished run in ".concat(vw.x(System.nanoTime() - j)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) m50Var2.a.f).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        vw.d(c, l50Var, "failed a run in ".concat(vw.x(System.nanoTime() - j)));
                    }
                    throw th2;
                }
            }
        }
    }
}
