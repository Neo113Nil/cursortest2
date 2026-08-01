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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z6 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z6(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        nz nzVar;
        d50 c;
        long j;
        int i3 = 0;
        switch (this.f) {
            case 0:
                ar arVar = (ar) this.g;
                lg lgVar = arVar.h;
                y6 y6Var = arVar.f;
                if (arVar.t) {
                    if (arVar.r) {
                        arVar.r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        y6Var.e = currentAnimationTimeMillis;
                        y6Var.g = -1L;
                        y6Var.f = currentAnimationTimeMillis;
                        y6Var.h = 0.5f;
                    }
                    if ((y6Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > y6Var.g + y6Var.i) || !arVar.e()) {
                        arVar.t = false;
                        return;
                    }
                    if (arVar.s) {
                        arVar.s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        lgVar.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (y6Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = y6Var.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - y6Var.f;
                    y6Var.f = currentAnimationTimeMillis2;
                    arVar.v.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * y6Var.d));
                    WeakHashMap weakHashMap = x80.a;
                    lgVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                i8 i8Var = (i8) this.g;
                i8Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) i8Var.e;
                z80 z80Var = bottomSheetBehavior.Q;
                if (z80Var != null && z80Var.f()) {
                    i8Var.a(i8Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.P == 2) {
                        bottomSheetBehavior.M(i8Var.b);
                        return;
                    }
                    return;
                }
            case 2:
                ve veVar = (ve) this.g;
                veVar.b.endViewTransition(veVar.c);
                veVar.d.d();
                return;
            case 3:
                qf qfVar = (qf) this.g;
                qfVar.b0.onDismiss(qfVar.j0);
                return;
            case 4:
                lg lgVar2 = (lg) this.g;
                lgVar2.q = null;
                lgVar2.drawableStateChanged();
                return;
            case 5:
                cj cjVar = (cj) this.g;
                ValueAnimator valueAnimator = cjVar.z;
                int i4 = cjVar.A;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                cjVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 6:
                ((bl) this.g).y(true);
                return;
            case 7:
                ep epVar = (ep) this.g;
                if (epVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = epVar.B;
                    long j4 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    xy layoutManager = epVar.r.getLayoutManager();
                    if (epVar.A == null) {
                        epVar.A = new Rect();
                    }
                    View view = epVar.c.a;
                    Rect rect = epVar.A;
                    RecyclerView recyclerView = layoutManager.b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.K(view));
                    }
                    if (layoutManager.d()) {
                        int i5 = (int) (epVar.j + epVar.h);
                        int paddingLeft = (i5 - epVar.A.left) - epVar.r.getPaddingLeft();
                        float f = epVar.h;
                        if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((epVar.c.a.getWidth() + i5) + epVar.A.right) - (epVar.r.getWidth() - epVar.r.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (layoutManager.e()) {
                                int i6 = (int) (epVar.k + epVar.i);
                                int paddingTop = (i6 - epVar.A.top) - epVar.r.getPaddingTop();
                                float f2 = epVar.i;
                                if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((epVar.c.a.getHeight() + i6) + epVar.A.bottom) - (epVar.r.getHeight() - epVar.r.getPaddingBottom())) > 0)) {
                                    i3 = paddingTop;
                                }
                            }
                            if (i != 0) {
                                or orVar = epVar.m;
                                RecyclerView recyclerView2 = epVar.r;
                                int width = epVar.c.a.getWidth();
                                epVar.r.getWidth();
                                i = orVar.i(recyclerView2, width, i, j4);
                            }
                            i2 = i;
                            if (i3 == 0) {
                                or orVar2 = epVar.m;
                                RecyclerView recyclerView3 = epVar.r;
                                int height = epVar.c.a.getHeight();
                                epVar.r.getHeight();
                                i3 = orVar2.i(recyclerView3, height, i3, j4);
                            }
                            if (i2 != 0 && i3 == 0) {
                                epVar.B = Long.MIN_VALUE;
                                return;
                            }
                            if (epVar.B == Long.MIN_VALUE) {
                                epVar.B = currentTimeMillis;
                            }
                            epVar.r.scrollBy(i2, i3);
                            nzVar = epVar.c;
                            if (nzVar != null) {
                                epVar.n(nzVar);
                            }
                            epVar.r.removeCallbacks(epVar.s);
                            RecyclerView recyclerView4 = epVar.r;
                            WeakHashMap weakHashMap2 = x80.a;
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
                    if (epVar.B == Long.MIN_VALUE) {
                    }
                    epVar.r.scrollBy(i2, i3);
                    nzVar = epVar.c;
                    if (nzVar != null) {
                    }
                    epVar.r.removeCallbacks(epVar.s);
                    RecyclerView recyclerView42 = epVar.r;
                    WeakHashMap weakHashMap22 = x80.a;
                    recyclerView42.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.g).B0();
                return;
            case 9:
                break;
            case 10:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.g).h.l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 11:
                ((Toolbar) this.g).u();
                return;
            case 12:
                i60 i60Var = (i60) this.g;
                Window.Callback callback = i60Var.t;
                Menu F0 = i60Var.F0();
                mt mtVar = F0 instanceof mt ? (mt) F0 : null;
                if (mtVar != null) {
                    mtVar.w();
                }
                try {
                    F0.clear();
                    if (callback.onCreatePanelMenu(0, F0)) {
                        if (!callback.onPreparePanel(0, null, F0)) {
                        }
                        if (mtVar == null) {
                            mtVar.v();
                            return;
                        }
                        return;
                    }
                    F0.clear();
                    if (mtVar == null) {
                    }
                } catch (Throwable th) {
                    if (mtVar != null) {
                        mtVar.v();
                    }
                    throw th;
                }
            default:
                ((z80) this.g).m(0);
                return;
        }
        while (true) {
            f50 f50Var = (f50) this.g;
            synchronized (f50Var) {
                c = f50Var.c();
            }
            if (c == null) {
                return;
            }
            e50 e50Var = c.c;
            e50Var.getClass();
            f50 f50Var2 = (f50) this.g;
            boolean isLoggable = f50.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                o8.b(c, e50Var, "starting");
            } else {
                j = -1;
            }
            try {
                f50.a(f50Var2, c);
                if (isLoggable) {
                    o8.b(c, e50Var, "finished run in ".concat(o8.t(System.nanoTime() - j)));
                }
            } catch (Throwable th2) {
                try {
                    ((ThreadPoolExecutor) f50Var2.a.f).execute(this);
                    throw th2;
                } catch (Throwable th3) {
                    if (isLoggable) {
                        o8.b(c, e50Var, "failed a run in ".concat(o8.t(System.nanoTime() - j)));
                    }
                    throw th3;
                }
            }
        }
    }
}
