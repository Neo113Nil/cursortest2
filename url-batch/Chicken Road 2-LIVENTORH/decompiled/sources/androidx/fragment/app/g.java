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
import l.s1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f428g;

    public /* synthetic */ g(int i, Object obj) {
        this.f427f = i;
        this.f428g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.l lVar;
        int i = this.f427f;
        Object obj = this.f428g;
        switch (i) {
            case 0:
                h hVar = (h) obj;
                hVar.f431b.endViewTransition(hVar.f432c);
                hVar.d.d();
                return;
            case 1:
                p pVar = (p) obj;
                pVar.Z.onDismiss(pVar.f503h0);
                return;
            case 2:
                ((k0) obj).x(true);
                return;
            case 3:
                f1.m mVar = (f1.m) obj;
                ValueAnimator valueAnimator = mVar.f1443z;
                int i4 = mVar.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                mVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 4:
                ((StaggeredGridLayoutManager) obj).B0();
                return;
            case 5:
                s1 s1Var = (s1) obj;
                s1Var.f2452q = null;
                s1Var.drawableStateChanged();
                return;
            case 6:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f216k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f216k = false;
                    return;
                }
                return;
            case 7:
                ActionMenuView actionMenuView = ((Toolbar) obj).f218f;
                if (actionMenuView == null || (lVar = actionMenuView.f202y) == null) {
                    return;
                }
                lVar.n();
                return;
            case 8:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f1018h.f2916l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 9:
                r0.d dVar = (r0.d) obj;
                s1 s1Var2 = dVar.f3126h;
                r0.a aVar = dVar.f3124f;
                if (dVar.f3137t) {
                    if (dVar.f3135r) {
                        dVar.f3135r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3119e = currentAnimationTimeMillis;
                        aVar.f3121g = -1L;
                        aVar.f3120f = currentAnimationTimeMillis;
                        aVar.f3122h = 0.5f;
                    }
                    if ((aVar.f3121g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3121g + aVar.i) || !dVar.e()) {
                        dVar.f3137t = false;
                        return;
                    }
                    if (dVar.f3136s) {
                        dVar.f3136s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f3120f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j4 = currentAnimationTimeMillis2 - aVar.f3120f;
                    aVar.f3120f = currentAnimationTimeMillis2;
                    dVar.f3139v.scrollListBy((int) (j4 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                    WeakHashMap weakHashMap = n0.l0.f2757a;
                    s1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                ((t0.e) obj).n(0);
                return;
            default:
                m2.e eVar = (m2.e) obj;
                eVar.f2694c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f2695e;
                t0.e eVar2 = bottomSheetBehavior.O;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f2693b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(eVar.f2693b);
                        return;
                    }
                    return;
                }
        }
    }
}
