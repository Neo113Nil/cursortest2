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
import l.p1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f541g;

    public /* synthetic */ g(int i, Object obj) {
        this.f540f = i;
        this.f541g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.j jVar;
        w3.a c5;
        long j2;
        switch (this.f540f) {
            case 0:
                h hVar = (h) this.f541g;
                hVar.f544b.endViewTransition(hVar.f545c);
                hVar.d.d();
                return;
            case 1:
                p pVar = (p) this.f541g;
                pVar.f607b0.onDismiss(pVar.f613j0);
                return;
            case 2:
                ((k0) this.f541g).y(true);
                return;
            case 3:
                g1.x xVar = (g1.x) this.f541g;
                ValueAnimator valueAnimator = xVar.f1842z;
                int i = xVar.A;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                xVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                ((StaggeredGridLayoutManager) this.f541g).D0();
                return;
            case 5:
                p1 p1Var = (p1) this.f541g;
                p1Var.f2539q = null;
                p1Var.drawableStateChanged();
                return;
            case 6:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f541g;
                if (searchView$SearchAutoComplete.f343k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f343k = false;
                    return;
                }
                return;
            case 7:
                ActionMenuView actionMenuView = ((Toolbar) this.f541g).f345f;
                if (actionMenuView == null || (jVar = actionMenuView.f331y) == null) {
                    return;
                }
                jVar.l();
                return;
            case 8:
                r0.c cVar = (r0.c) this.f541g;
                p1 p1Var2 = cVar.h;
                r0.a aVar = cVar.f3184f;
                if (cVar.f3196t) {
                    if (cVar.f3194r) {
                        cVar.f3194r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3180e = currentAnimationTimeMillis;
                        aVar.f3182g = -1L;
                        aVar.f3181f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f3182g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3182g + aVar.i) || !cVar.e()) {
                        cVar.f3196t = false;
                        return;
                    }
                    if (cVar.f3195s) {
                        cVar.f3195s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        p1Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f3181f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a5 = aVar.a(currentAnimationTimeMillis2);
                    long j4 = currentAnimationTimeMillis2 - aVar.f3181f;
                    aVar.f3181f = currentAnimationTimeMillis2;
                    cVar.f3198v.scrollListBy((int) (j4 * ((a5 * 4.0f) + ((-4.0f) * a5 * a5)) * aVar.d));
                    WeakHashMap weakHashMap = n0.p0.f2816a;
                    p1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f541g).h.f3277l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 10:
                ((u0.e) this.f541g).m(0);
                return;
            case 11:
                p2.e eVar = (p2.e) this.f541g;
                eVar.f3087c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f3088e;
                u0.e eVar2 = bottomSheetBehavior.Q;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f3086b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.F(eVar.f3086b);
                        return;
                    }
                    return;
                }
        }
        while (true) {
            w3.c cVar2 = (w3.c) this.f541g;
            synchronized (cVar2) {
                c5 = cVar2.c();
            }
            if (c5 == null) {
                return;
            }
            w3.b bVar = c5.f3824c;
            i3.d.b(bVar);
            w3.c cVar3 = (w3.c) this.f541g;
            boolean isLoggable = w3.c.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j2 = System.nanoTime();
                s.a.a(c5, bVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                w3.c.a(cVar3, c5);
                if (isLoggable) {
                    s.a.a(c5, bVar, "finished run in ".concat(s.a.k(System.nanoTime() - j2)));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) cVar3.f3830a.f3172a).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        s.a.a(c5, bVar, "failed a run in ".concat(s.a.k(System.nanoTime() - j2)));
                    }
                    throw th2;
                }
            }
        }
    }
}
