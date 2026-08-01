package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class v7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0189  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        x80 x80Var;
        Object obj;
        gh0 c;
        long j;
        int i3 = 0;
        switch (this.f) {
            case 0:
                py pyVar = (py) this.g;
                xk xkVar = pyVar.h;
                u7 u7Var = pyVar.f;
                if (pyVar.t) {
                    if (pyVar.r) {
                        pyVar.r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        u7Var.e = currentAnimationTimeMillis;
                        u7Var.g = -1L;
                        u7Var.f = currentAnimationTimeMillis;
                        u7Var.h = 0.5f;
                    }
                    if ((u7Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > u7Var.g + u7Var.i) || !pyVar.e()) {
                        pyVar.t = false;
                        return;
                    }
                    if (pyVar.s) {
                        pyVar.s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        xkVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (u7Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = u7Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - u7Var.f;
                    u7Var.f = currentAnimationTimeMillis2;
                    pyVar.v.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * u7Var.d));
                    WeakHashMap weakHashMap = hm0.a;
                    xkVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.g;
                i9Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) i9Var.e;
                jm0 jm0Var = bottomSheetBehavior.Q;
                if (jm0Var != null && jm0Var.f()) {
                    i9Var.a(i9Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.M(i9Var.b);
                        return;
                    }
                    return;
                }
            case 2:
                vi viVar = (vi) this.g;
                viVar.b.endViewTransition(viVar.c);
                viVar.d.d();
                return;
            case 3:
                vj vjVar = (vj) this.g;
                vjVar.b0.onDismiss(vjVar.j0);
                return;
            case 4:
                xk xkVar2 = (xk) this.g;
                xkVar2.q = null;
                xkVar2.drawableStateChanged();
                return;
            case 5:
                ko koVar = (ko) this.g;
                ValueAnimator valueAnimator = koVar.z;
                int i4 = koVar.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                koVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 6:
                ((c) this.g).y(true);
                return;
            case 7:
                aw awVar = (aw) this.g;
                if (awVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = awVar.B;
                    long j4 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    h80 layoutManager = awVar.r.getLayoutManager();
                    if (awVar.A == null) {
                        awVar.A = new Rect();
                    }
                    View view = awVar.c.a;
                    Rect rect = awVar.A;
                    RecyclerView recyclerView = layoutManager.b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.K(view));
                    }
                    if (layoutManager.d()) {
                        int i5 = (int) (awVar.j + awVar.h);
                        int paddingLeft = (i5 - awVar.A.left) - awVar.r.getPaddingLeft();
                        float f = awVar.h;
                        if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((awVar.c.a.getWidth() + i5) + awVar.A.right) - (awVar.r.getWidth() - awVar.r.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (layoutManager.e()) {
                                int i6 = (int) (awVar.k + awVar.i);
                                int paddingTop = (i6 - awVar.A.top) - awVar.r.getPaddingTop();
                                float f2 = awVar.i;
                                if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((awVar.c.a.getHeight() + i6) + awVar.A.bottom) - (awVar.r.getHeight() - awVar.r.getPaddingBottom())) > 0)) {
                                    i3 = paddingTop;
                                }
                            }
                            if (i != 0) {
                                nz nzVar = awVar.m;
                                RecyclerView recyclerView2 = awVar.r;
                                int width = awVar.c.a.getWidth();
                                awVar.r.getWidth();
                                i = nzVar.f(recyclerView2, width, i, j4);
                            }
                            i2 = i;
                            if (i3 == 0) {
                                nz nzVar2 = awVar.m;
                                RecyclerView recyclerView3 = awVar.r;
                                int height = awVar.c.a.getHeight();
                                awVar.r.getHeight();
                                i3 = nzVar2.f(recyclerView3, height, i3, j4);
                            }
                            if (i2 != 0 && i3 == 0) {
                                awVar.B = Long.MIN_VALUE;
                                return;
                            }
                            if (awVar.B == Long.MIN_VALUE) {
                                awVar.B = currentTimeMillis;
                            }
                            awVar.r.scrollBy(i2, i3);
                            x80Var = awVar.c;
                            if (x80Var != null) {
                                awVar.n(x80Var);
                            }
                            awVar.r.removeCallbacks(awVar.s);
                            RecyclerView recyclerView4 = awVar.r;
                            WeakHashMap weakHashMap2 = hm0.a;
                            recyclerView4.postOnAnimation(this);
                            return;
                        }
                    }
                    i = 0;
                    if (layoutManager.e()) {
                    }
                    if (i != 0) {
                    }
                    i2 = i;
                    if (i3 == 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (awVar.B == Long.MIN_VALUE) {
                    }
                    awVar.r.scrollBy(i2, i3);
                    x80Var = awVar.c;
                    if (x80Var != null) {
                    }
                    awVar.r.removeCallbacks(awVar.s);
                    RecyclerView recyclerView42 = awVar.r;
                    WeakHashMap weakHashMap22 = hm0.a;
                    recyclerView42.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                synchronized (((ty) this.g).a) {
                    obj = ((ty) this.g).f;
                    ((ty) this.g).f = ty.k;
                }
                ((ty) this.g).h(obj);
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
                ((Toolbar) this.g).u();
                return;
            case 13:
                wi0 wi0Var = (wi0) this.g;
                Window.Callback callback = wi0Var.t;
                Menu W = wi0Var.W();
                r10 r10Var = W instanceof r10 ? (r10) W : null;
                if (r10Var != null) {
                    r10Var.w();
                }
                try {
                    W.clear();
                    if (callback.onCreatePanelMenu(0, W)) {
                        if (!callback.onPreparePanel(0, null, W)) {
                        }
                        if (r10Var == null) {
                            r10Var.v();
                            return;
                        }
                        return;
                    }
                    W.clear();
                    if (r10Var == null) {
                    }
                } catch (Throwable th) {
                    if (r10Var != null) {
                        r10Var.v();
                    }
                    throw th;
                }
            default:
                ((jm0) this.g).m(0);
                return;
        }
        while (true) {
            kh0 kh0Var = (kh0) this.g;
            synchronized (kh0Var) {
                c = kh0Var.c();
            }
            if (c == null) {
                return;
            }
            jh0 jh0Var = c.c;
            jh0Var.getClass();
            kh0 kh0Var2 = (kh0) this.g;
            boolean isLoggable = kh0.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                zb0.a(c, jh0Var, "starting");
            } else {
                j = -1;
            }
            try {
                kh0.a(kh0Var2, c);
                if (isLoggable) {
                    zb0.a(c, jh0Var, "finished run in ".concat(zb0.g(System.nanoTime() - j)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) kh0Var2.a.f).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        zb0.a(c, jh0Var, "failed a run in ".concat(zb0.g(System.nanoTime() - j)));
                    }
                    throw th3;
                }
            }
        }
    }
}
