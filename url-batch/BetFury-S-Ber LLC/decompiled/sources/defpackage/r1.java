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
import com.trembin.nirefon.betfury.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r1(int i, Object obj) {
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
        dg dgVar = null;
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
                Handler handler = t1.g;
                Method method = t1.f;
                ?? r5 = Build.VERSION.SDK_INT;
                if (r5 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r6 = 27;
                if (((r5 != 26 && r5 != 27) || method != null) && (t1.e != null || t1.d != null)) {
                    try {
                        Object obj3 = t1.c.get(activity);
                        if (obj3 != null && (obj = t1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            s1 s1Var = new s1(activity);
                            application.registerActivityLifecycleCallbacks(s1Var);
                            int i4 = 1;
                            handler.post(new j1(s1Var, obj3, i4, false));
                            if (r5 != 26 && r5 != 27) {
                                i4 = 0;
                            }
                            try {
                                if (i4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r5 = application;
                                        r6 = s1Var;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        s1 s1Var2 = s1Var;
                                        handler.post(new j1(application2, s1Var2, i3, false));
                                        throw th;
                                    }
                                } else {
                                    r5 = application;
                                    r6 = s1Var;
                                    activity.recreate();
                                }
                                handler.post(new j1(r5, r6, i3, false));
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
                n3 n3Var = (n3) ((n3) obj2).c.g;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = n3Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    te0 te0Var = (te0) arrayList.get(i5);
                    if (te0Var != null) {
                        zd0 zd0Var = n3Var.a;
                        Long l = (Long) zd0Var.get(te0Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                zd0Var.remove(te0Var);
                            }
                        }
                        long j2 = te0Var.f;
                        if (j2 == 0) {
                            te0Var.f = uptimeMillis;
                            te0Var.c(te0Var.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            te0Var.f = uptimeMillis;
                            float f = te0.b().g;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            boolean z4 = te0Var.l;
                            float f2 = te0Var.k;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    i = i5;
                                    te0Var.j.i = f2;
                                    te0Var.k = Float.MAX_VALUE;
                                } else {
                                    i = i5;
                                }
                                te0Var.b = (float) te0Var.j.i;
                                te0Var.a = 0.0f;
                                te0Var.l = z3;
                                z = z2;
                                j = uptimeMillis;
                            } else {
                                i = i5;
                                ue0 ue0Var = te0Var.j;
                                float f3 = te0Var.b;
                                float f4 = te0Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    il a = ue0Var.a(f3, f4, j5);
                                    ue0 ue0Var2 = te0Var.j;
                                    ue0Var2.i = te0Var.k;
                                    te0Var.k = Float.MAX_VALUE;
                                    il a2 = ue0Var2.a(a.a, a.b, j5);
                                    te0Var.b = a2.a;
                                    te0Var.a = a2.b;
                                } else {
                                    il a3 = ue0Var.a(f3, f4, j4);
                                    te0Var.b = a3.a;
                                    te0Var.a = a3.b;
                                }
                                float max = Math.max(te0Var.b, -3.4028235E38f);
                                te0Var.b = max;
                                te0Var.b = Math.min(max, Float.MAX_VALUE);
                                float f5 = te0Var.a;
                                ue0 ue0Var3 = te0Var.j;
                                ue0Var3.getClass();
                                j = uptimeMillis;
                                if (Math.abs(f5) >= ue0Var3.e || Math.abs(r2 - ((float) ue0Var3.i)) >= ue0Var3.d) {
                                    z = false;
                                } else {
                                    te0Var.b = (float) te0Var.j.i;
                                    te0Var.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min = Math.min(te0Var.b, Float.MAX_VALUE);
                            te0Var.b = min;
                            float max2 = Math.max(min, -3.4028235E38f);
                            te0Var.b = max2;
                            te0Var.c(max2);
                            if (z) {
                                ArrayList arrayList2 = te0Var.h;
                                te0Var.e = false;
                                n3 b = te0.b();
                                b.a.remove(te0Var);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(te0Var);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    b.f = true;
                                }
                                te0Var.f = 0L;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (arrayList2.get(i6) != null) {
                                        arrayList2.get(i6).getClass();
                                        s9.c();
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
                if (n3Var.f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        i5 i5Var = n3Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((l3) i5Var.g);
                        i5Var.g = null;
                    }
                    n3Var.f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) n3Var.e.g).postFrameCallback(new m3(n3Var.d));
                    return;
                }
                return;
            case 2:
                ((CarouselLayoutManager) obj2).m0();
                return;
            case 3:
                ((lc) obj2).s(true);
                return;
            case 4:
                ud udVar = (ud) obj2;
                Runnable runnable = udVar.g;
                if (runnable != null) {
                    runnable.run();
                    udVar.g = null;
                    return;
                }
                return;
            case 5:
                ae.b((ae) obj2);
                return;
            case 6:
                dl dlVar = (dl) obj2;
                boolean isPopupShowing = dlVar.h.isPopupShowing();
                dlVar.s(isPopupShowing);
                dlVar.m = isPopupShowing;
                return;
            case 7:
                dp dpVar = (dp) obj2;
                synchronized (dpVar.i) {
                    try {
                        if (dpVar.m == null) {
                            return;
                        }
                        try {
                            np c = dpVar.c();
                            int i7 = c.f;
                            if (i7 == 2) {
                                synchronized (dpVar.i) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = bj0.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                sl slVar = dpVar.h;
                                Context context = dpVar.f;
                                slVar.getClass();
                                np[] npVarArr = {c};
                                ud0 ud0Var = ik0.a;
                                zb0.b("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface f6 = ik0.a.f(context, npVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer k = zb0.k(dpVar.f, c.a);
                                    if (k == null || f6 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        wi wiVar = new wi(f6, bi.V(k));
                                        Trace.endSection();
                                        synchronized (dpVar.i) {
                                            try {
                                                bi biVar = dpVar.m;
                                                if (biVar != null) {
                                                    biVar.Q(wiVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        dpVar.a();
                                        return;
                                    } finally {
                                        int i9 = bj0.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (dpVar.i) {
                                try {
                                    bi biVar2 = dpVar.m;
                                    if (biVar2 != null) {
                                        biVar2.L(th3);
                                    }
                                    dpVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                int i10 = MainActivity.K;
                ((MainActivity) obj2).m();
                return;
            case 9:
                MaterialButton.a((MaterialButton) obj2);
                return;
            case 10:
                m60 m60Var = (m60) obj2;
                nx nxVar = m60Var.k;
                if (m60Var.g == 0) {
                    m60Var.h = true;
                    nxVar.d(fx.ON_PAUSE);
                }
                if (m60Var.f == 0 && m60Var.h) {
                    nxVar.d(fx.ON_STOP);
                    m60Var.i = true;
                    return;
                }
                return;
            case 11:
                ((e70) obj2).m();
                return;
            case 12:
                na0 na0Var = (na0) obj2;
                boolean z5 = na0Var.c > 0;
                if (na0Var.o.compareAndSet(false, true) && z5) {
                    gk0.y(na0Var.l.getCoroutineScope(), na0Var.r, new ra0(na0Var, dgVar, false ? 1 : 0), 2);
                    return;
                }
                return;
            case 13:
                i9 i9Var = (i9) obj2;
                i9Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) i9Var.e;
                jm0 jm0Var = sideSheetBehavior.i;
                if (jm0Var != null && jm0Var.f()) {
                    i9Var.a(i9Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.x(i9Var.b);
                        return;
                    }
                    return;
                }
            case 14:
                xg0 xg0Var = ((zg0) obj2).a;
                ViewParent parent = xg0Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(xg0Var);
                    return;
                }
                return;
            case 15:
                ((TextInputLayout) obj2).j.requestLayout();
                return;
            default:
                View view = (View) obj2;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
