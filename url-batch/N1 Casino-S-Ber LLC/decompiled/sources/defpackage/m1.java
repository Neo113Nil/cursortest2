package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.a;
import com.derinko.gbini.n1casino.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        long j;
        boolean z;
        int i2 = this.f;
        int i3 = 2;
        boolean z2 = true;
        boolean z3 = false;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = q1.g;
                Method method = q1.f;
                ?? r5 = Build.VERSION.SDK_INT;
                if (r5 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r6 = 27;
                if (((r5 != 26 && r5 != 27) || method != null) && (q1.e != null || q1.d != null)) {
                    try {
                        Object obj3 = q1.c.get(activity);
                        if (obj3 != null && (obj = q1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            p1 p1Var = new p1(activity);
                            application.registerActivityLifecycleCallbacks(p1Var);
                            int i4 = 1;
                            handler.post(new f1(p1Var, obj3, i4, false));
                            if (r5 != 26 && r5 != 27) {
                                i4 = 0;
                            }
                            try {
                                if (i4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r5 = application;
                                        r6 = p1Var;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        p1 p1Var2 = p1Var;
                                        handler.post(new f1(application2, p1Var2, i3, false));
                                        throw th;
                                    }
                                } else {
                                    r5 = application;
                                    r6 = p1Var;
                                    activity.recreate();
                                }
                                handler.post(new f1(r5, r6, i3, false));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                v2 v2Var = (v2) ((v2) obj2).c.g;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = v2Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    l30 l30Var = (l30) arrayList.get(i5);
                    if (l30Var != null) {
                        u20 u20Var = v2Var.a;
                        Long l = (Long) u20Var.get(l30Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                u20Var.remove(l30Var);
                            }
                        }
                        long j2 = l30Var.f;
                        if (j2 == 0) {
                            l30Var.f = uptimeMillis;
                            l30Var.c(l30Var.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            l30Var.f = uptimeMillis;
                            float f = l30.b().g;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            boolean z4 = l30Var.l;
                            float f2 = l30Var.k;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    i = i5;
                                    l30Var.j.i = f2;
                                    l30Var.k = Float.MAX_VALUE;
                                } else {
                                    i = i5;
                                }
                                l30Var.b = (float) l30Var.j.i;
                                l30Var.a = 0.0f;
                                l30Var.l = z3;
                                z = z2;
                                j = uptimeMillis;
                            } else {
                                i = i5;
                                m30 m30Var = l30Var.j;
                                float f3 = l30Var.b;
                                float f4 = l30Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    tg a = m30Var.a(f3, f4, j5);
                                    m30 m30Var2 = l30Var.j;
                                    m30Var2.i = l30Var.k;
                                    l30Var.k = Float.MAX_VALUE;
                                    tg a2 = m30Var2.a(a.a, a.b, j5);
                                    l30Var.b = a2.a;
                                    l30Var.a = a2.b;
                                } else {
                                    tg a3 = m30Var.a(f3, f4, j4);
                                    l30Var.b = a3.a;
                                    l30Var.a = a3.b;
                                }
                                float max = Math.max(l30Var.b, -3.4028235E38f);
                                l30Var.b = max;
                                l30Var.b = Math.min(max, Float.MAX_VALUE);
                                float f5 = l30Var.a;
                                m30 m30Var3 = l30Var.j;
                                m30Var3.getClass();
                                j = uptimeMillis;
                                if (Math.abs(f5) >= m30Var3.e || Math.abs(r2 - ((float) m30Var3.i)) >= m30Var3.d) {
                                    z = false;
                                } else {
                                    l30Var.b = (float) l30Var.j.i;
                                    l30Var.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min = Math.min(l30Var.b, Float.MAX_VALUE);
                            l30Var.b = min;
                            float max2 = Math.max(min, -3.4028235E38f);
                            l30Var.b = max2;
                            l30Var.c(max2);
                            if (z) {
                                ArrayList arrayList2 = l30Var.h;
                                l30Var.e = false;
                                v2 b = l30.b();
                                b.a.remove(l30Var);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(l30Var);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    b.f = true;
                                }
                                l30Var.f = 0L;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (arrayList2.get(i6) != null) {
                                        arrayList2.get(i6).getClass();
                                        t8.c();
                                        return;
                                    }
                                }
                                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                    if (arrayList2.get(size) == null) {
                                        arrayList2.remove(size);
                                    }
                                }
                            } else {
                                continue;
                            }
                            i5 = i + 1;
                            uptimeMillis = j;
                            z2 = true;
                            z3 = false;
                        }
                    }
                    i = i5;
                    j = uptimeMillis;
                    i5 = i + 1;
                    uptimeMillis = j;
                    z2 = true;
                    z3 = false;
                }
                if (v2Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        q4 q4Var = v2Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((t2) q4Var.g);
                        q4Var.g = null;
                    }
                    v2Var.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) v2Var.e.g).postFrameCallback(new u2(v2Var.d));
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).m0();
                return;
            case 3:
                ((ua) obj2).s(true);
                return;
            case 4:
                tb tbVar = (tb) obj2;
                Runnable runnable = tbVar.g;
                if (runnable != null) {
                    runnable.run();
                    tbVar.g = null;
                    return;
                }
                return;
            case 5:
                yb.b((yb) obj2);
                return;
            case 6:
                rg rgVar = (rg) obj2;
                boolean isPopupShowing = rgVar.h.isPopupShowing();
                rgVar.s(isPopupShowing);
                rgVar.m = isPopupShowing;
                return;
            case 7:
                tj tjVar = (tj) obj2;
                synchronized (tjVar.i) {
                    try {
                        if (tjVar.m == null) {
                            return;
                        }
                        try {
                            dk b2 = tjVar.b();
                            int i7 = b2.f;
                            if (i7 == 2) {
                                synchronized (tjVar.i) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = n60.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                dh dhVar = tjVar.h;
                                Context context = tjVar.f;
                                dhVar.getClass();
                                dk[] dkVarArr = {b2};
                                e70 e70Var = g70.a;
                                o8.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface n = g70.a.n(context, dkVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer V = o8.V(tjVar.f, b2.a);
                                    if (V == null || n == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        we weVar = new we(n, e70.H(V));
                                        Trace.endSection();
                                        synchronized (tjVar.i) {
                                            try {
                                                zo zoVar = tjVar.m;
                                                if (zoVar != null) {
                                                    zoVar.D(weVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        tjVar.a();
                                        return;
                                    } finally {
                                        int i9 = n60.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (tjVar.i) {
                                try {
                                    zo zoVar2 = tjVar.m;
                                    if (zoVar2 != null) {
                                        zoVar2.A(th3);
                                    }
                                    tjVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                int i10 = MainActivity.L;
                ((MainActivity) obj2).r();
                return;
            case 9:
                MaterialButton.a((MaterialButton) obj2);
                return;
            case 10:
                gx gxVar = (gx) obj2;
                a aVar = gxVar.k;
                if (gxVar.g == 0) {
                    gxVar.h = true;
                    aVar.d(up.ON_PAUSE);
                }
                if (gxVar.f == 0 && gxVar.h) {
                    aVar.d(up.ON_STOP);
                    gxVar.i = true;
                    return;
                }
                return;
            case 11:
                ((xx) obj2).m();
                return;
            case 12:
                i8 i8Var = (i8) obj2;
                i8Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) i8Var.e;
                z80 z80Var = sideSheetBehavior.i;
                if (z80Var != null && z80Var.f()) {
                    i8Var.a(i8Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.x(i8Var.b);
                        return;
                    }
                    return;
                }
            case 13:
                y40 y40Var = ((a50) obj2).a;
                ViewParent parent = y40Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(y40Var);
                    return;
                }
                return;
            case 14:
                ((TextInputLayout) obj2).j.requestLayout();
                return;
            default:
                View view = (View) obj2;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
