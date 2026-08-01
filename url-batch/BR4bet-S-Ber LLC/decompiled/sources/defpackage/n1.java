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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.moontiko.really.admiralcasino.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n1(int i, Object obj) {
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
                Handler handler = r1.g;
                Method method = r1.f;
                ?? r5 = Build.VERSION.SDK_INT;
                if (r5 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r6 = 27;
                if (((r5 != 26 && r5 != 27) || method != null) && (r1.e != null || r1.d != null)) {
                    try {
                        Object obj3 = r1.c.get(activity);
                        if (obj3 != null && (obj = r1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            q1 q1Var = new q1(activity);
                            application.registerActivityLifecycleCallbacks(q1Var);
                            int i4 = 1;
                            handler.post(new g1(q1Var, obj3, i4, false));
                            if (r5 != 26 && r5 != 27) {
                                i4 = 0;
                            }
                            try {
                                if (i4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r5 = application;
                                        r6 = q1Var;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        q1 q1Var2 = q1Var;
                                        handler.post(new g1(application2, q1Var2, i3, false));
                                        throw th;
                                    }
                                } else {
                                    r5 = application;
                                    r6 = q1Var;
                                    activity.recreate();
                                }
                                handler.post(new g1(r5, r6, i3, false));
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
                f3 f3Var = (f3) ((f3) obj2).c.g;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = f3Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    n60 n60Var = (n60) arrayList.get(i5);
                    if (n60Var != null) {
                        w50 w50Var = f3Var.a;
                        Long l = (Long) w50Var.get(n60Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                w50Var.remove(n60Var);
                            }
                        }
                        long j2 = n60Var.f;
                        if (j2 == 0) {
                            n60Var.f = uptimeMillis;
                            n60Var.c(n60Var.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            n60Var.f = uptimeMillis;
                            float f = n60.b().g;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            boolean z4 = n60Var.l;
                            float f2 = n60Var.k;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    i = i5;
                                    n60Var.j.i = f2;
                                    n60Var.k = Float.MAX_VALUE;
                                } else {
                                    i = i5;
                                }
                                n60Var.b = (float) n60Var.j.i;
                                n60Var.a = 0.0f;
                                n60Var.l = z3;
                                z = z2;
                                j = uptimeMillis;
                            } else {
                                i = i5;
                                o60 o60Var = n60Var.j;
                                float f3 = n60Var.b;
                                float f4 = n60Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    ui a = o60Var.a(f3, f4, j5);
                                    o60 o60Var2 = n60Var.j;
                                    o60Var2.i = n60Var.k;
                                    n60Var.k = Float.MAX_VALUE;
                                    ui a2 = o60Var2.a(a.a, a.b, j5);
                                    n60Var.b = a2.a;
                                    n60Var.a = a2.b;
                                } else {
                                    ui a3 = o60Var.a(f3, f4, j4);
                                    n60Var.b = a3.a;
                                    n60Var.a = a3.b;
                                }
                                float max = Math.max(n60Var.b, -3.4028235E38f);
                                n60Var.b = max;
                                n60Var.b = Math.min(max, Float.MAX_VALUE);
                                float f5 = n60Var.a;
                                o60 o60Var3 = n60Var.j;
                                o60Var3.getClass();
                                j = uptimeMillis;
                                if (Math.abs(f5) >= o60Var3.e || Math.abs(r2 - ((float) o60Var3.i)) >= o60Var3.d) {
                                    z = false;
                                } else {
                                    n60Var.b = (float) n60Var.j.i;
                                    n60Var.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min = Math.min(n60Var.b, Float.MAX_VALUE);
                            n60Var.b = min;
                            float max2 = Math.max(min, -3.4028235E38f);
                            n60Var.b = max2;
                            n60Var.c(max2);
                            if (z) {
                                ArrayList arrayList2 = n60Var.h;
                                n60Var.e = false;
                                f3 b = n60.b();
                                b.a.remove(n60Var);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(n60Var);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    b.f = true;
                                }
                                n60Var.f = 0L;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (arrayList2.get(i6) != null) {
                                        arrayList2.get(i6).getClass();
                                        g9.b();
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
                if (f3Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        a5 a5Var = f3Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((d3) a5Var.g);
                        a5Var.g = null;
                    }
                    f3Var.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) f3Var.e.g).postFrameCallback(new e3(f3Var.d));
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).m0();
                return;
            case 3:
                ((ob) obj2).s(true);
                return;
            case 4:
                tc tcVar = (tc) obj2;
                Runnable runnable = tcVar.g;
                if (runnable != null) {
                    runnable.run();
                    tcVar.g = null;
                    return;
                }
                return;
            case 5:
                yc.b((yc) obj2);
                return;
            case 6:
                si siVar = (si) obj2;
                boolean isPopupShowing = siVar.h.isPopupShowing();
                siVar.s(isPopupShowing);
                siVar.m = isPopupShowing;
                return;
            case 7:
                xl xlVar = (xl) obj2;
                synchronized (xlVar.i) {
                    try {
                        if (xlVar.m == null) {
                            return;
                        }
                        try {
                            hm b2 = xlVar.b();
                            int i7 = b2.f;
                            if (i7 == 2) {
                                synchronized (xlVar.i) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = v90.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                ej ejVar = xlVar.h;
                                Context context = xlVar.f;
                                ejVar.getClass();
                                hm[] hmVarArr = {b2};
                                xf xfVar = na0.a;
                                mz.f("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface l2 = na0.a.l(context, hmVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer K = kr.K(xlVar.f, b2.a);
                                    if (K == null || l2 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        rg rgVar = new rg(l2, xf.F(K));
                                        Trace.endSection();
                                        synchronized (xlVar.i) {
                                            try {
                                                b9 b9Var = xlVar.m;
                                                if (b9Var != null) {
                                                    b9Var.C(rgVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        xlVar.a();
                                        return;
                                    } finally {
                                        int i9 = v90.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (xlVar.i) {
                                try {
                                    b9 b9Var2 = xlVar.m;
                                    if (b9Var2 != null) {
                                        b9Var2.y(th3);
                                    }
                                    xlVar.a();
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
                ((MainActivity) obj2).s();
                return;
            case 9:
                MaterialButton.a((MaterialButton) obj2);
                return;
            case 10:
                j00 j00Var = (j00) obj2;
                os osVar = j00Var.k;
                if (j00Var.g == 0) {
                    j00Var.h = true;
                    osVar.d(gs.ON_PAUSE);
                }
                if (j00Var.f == 0 && j00Var.h) {
                    osVar.d(gs.ON_STOP);
                    j00Var.i = true;
                    return;
                }
                return;
            case 11:
                ((a10) obj2).m();
                return;
            case 12:
                w8 w8Var = (w8) obj2;
                w8Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w8Var.e;
                kc0 kc0Var = sideSheetBehavior.i;
                if (kc0Var != null && kc0Var.f()) {
                    w8Var.a(w8Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.x(w8Var.b);
                        return;
                    }
                    return;
                }
            case 13:
                b80 b80Var = ((d80) obj2).a;
                ViewParent parent = b80Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(b80Var);
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
