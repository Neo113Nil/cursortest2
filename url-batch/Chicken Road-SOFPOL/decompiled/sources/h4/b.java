package h4;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import l.x0;
import q3.k0;
import w4.a0;
import w4.p0;
import x.v0;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3169e;

    public /* synthetic */ b(int i, Object obj) {
        this.f3168d = i;
        this.f3169e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.i iVar;
        long j7;
        int i = this.f3168d;
        int i8 = 1;
        int i9 = 2;
        Object obj = this.f3169e;
        switch (i) {
            case 0:
                ((e) obj).f3172n.onDismiss(null);
                return;
            case 1:
                ((j) obj).i();
                throw null;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                a aVar = (a) obj;
                aVar.f3165c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) aVar.f3167e;
                x3.c cVar = bottomSheetBehavior.O;
                if (cVar != null && cVar.f()) {
                    aVar.a(aVar.f3164b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(aVar.f3164b);
                        return;
                    }
                    return;
                }
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                x0 x0Var = (x0) obj;
                x0Var.f4451o = null;
                x0Var.drawableStateChanged();
                return;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.i) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.i = false;
                    return;
                }
                return;
            case 5:
                ActionMenuView actionMenuView = ((Toolbar) obj).f419d;
                if (actionMenuView == null || (iVar = actionMenuView.f402v) == null) {
                    return;
                }
                iVar.k();
                return;
            case 6:
                u3.d dVar = (u3.d) obj;
                x0 x0Var2 = dVar.f7360f;
                u3.a aVar2 = dVar.f7358d;
                if (dVar.f7371r) {
                    if (dVar.f7369p) {
                        dVar.f7369p = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f7353e = currentAnimationTimeMillis;
                        aVar2.f7355g = -1L;
                        aVar2.f7354f = currentAnimationTimeMillis;
                        aVar2.f7356h = 0.5f;
                    }
                    if ((aVar2.f7355g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f7355g + aVar2.i) || !dVar.e()) {
                        dVar.f7371r = false;
                        return;
                    }
                    if (dVar.f7370q) {
                        dVar.f7370q = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        x0Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f7354f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a8 = aVar2.a(currentAnimationTimeMillis2);
                    long j8 = currentAnimationTimeMillis2 - aVar2.f7354f;
                    aVar2.f7354f = currentAnimationTimeMillis2;
                    dVar.f7373t.scrollListBy((int) (j8 * ((a8 * 4.0f) + ((-4.0f) * a8 * a8)) * aVar2.f7352d));
                    Field field = k0.f6120a;
                    x0Var2.postOnAnimation(this);
                    return;
                }
                return;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                w4.j jVar = (w4.j) obj;
                ValueAnimator valueAnimator = jVar.f7950u;
                int i10 = jVar.f7951v;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                    return;
                }
                jVar.f7951v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                a0 a0Var = ((RecyclerView) obj).I;
                if (a0Var != null) {
                    w4.g gVar = (w4.g) a0Var;
                    ArrayList arrayList = gVar.f7912h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = gVar.f7913j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = gVar.f7914k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = gVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    if (arrayList.size() > 0) {
                        ((p0) arrayList.get(0)).getClass();
                        throw null;
                    }
                    arrayList.clear();
                    if (isEmpty2) {
                        j7 = 0;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        j7 = 0;
                        gVar.f7916m.add(arrayList5);
                        arrayList2.clear();
                        w4.b bVar = new w4.b(gVar, arrayList5, r8);
                        if (!isEmpty) {
                            ((w4.f) arrayList5.get(0)).getClass();
                            throw null;
                        }
                        bVar.run();
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        gVar.f7917n.add(arrayList6);
                        arrayList3.clear();
                        w4.b bVar2 = new w4.b(gVar, arrayList6, i8);
                        if (!isEmpty) {
                            ((w4.e) arrayList6.get(0)).getClass();
                            throw null;
                        }
                        bVar2.run();
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    gVar.f7915l.add(arrayList7);
                    arrayList4.clear();
                    w4.b bVar3 = new w4.b(gVar, arrayList7, i9);
                    if (isEmpty && isEmpty2 && isEmpty3) {
                        bVar3.run();
                        return;
                    }
                    Math.max(!isEmpty2 ? gVar.f7882e : j7, !isEmpty3 ? gVar.f7883f : j7);
                    ((p0) arrayList7.get(0)).getClass();
                    Field field2 = k0.f6120a;
                    throw null;
                }
                return;
            case v0.f8304b /* 9 */:
                ((StaggeredGridLayoutManager) obj).c0();
                return;
            case v0.f8306d /* 10 */:
                t tVar = (t) obj;
                tVar.removeCallbacks(this);
                MotionEvent motionEvent = tVar.f8576t0;
                if (motionEvent != null) {
                    r8 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r8 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    t tVar2 = (t) obj;
                    tVar2.G(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, tVar2.f8578u0, false);
                    return;
                }
                return;
            case 11:
                ((x3.c) obj).n(0);
                return;
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f1970f.f9222j;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
    }
}
