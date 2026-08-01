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
import com.awerser.monnit.betplay.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q1(int i, Object obj) {
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
                Handler handler = u1.g;
                Method method = u1.f;
                ?? r5 = Build.VERSION.SDK_INT;
                if (r5 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r6 = 27;
                if (((r5 != 26 && r5 != 27) || method != null) && (u1.e != null || u1.d != null)) {
                    try {
                        Object obj3 = u1.c.get(activity);
                        if (obj3 != null && (obj = u1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            t1 t1Var = new t1(activity);
                            application.registerActivityLifecycleCallbacks(t1Var);
                            int i4 = 1;
                            handler.post(new h1(t1Var, obj3, i4, false));
                            if (r5 != 26 && r5 != 27) {
                                i4 = 0;
                            }
                            try {
                                if (i4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r5 = application;
                                        r6 = t1Var;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        Application application2 = application;
                                        t1 t1Var2 = t1Var;
                                        handler.post(new h1(application2, t1Var2, i3, false));
                                        throw th;
                                    }
                                } else {
                                    r5 = application;
                                    r6 = t1Var;
                                    activity.recreate();
                                }
                                handler.post(new h1(r5, r6, i3, false));
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
                    u30 u30Var = (u30) arrayList.get(i5);
                    if (u30Var != null) {
                        h30 h30Var = n3Var.a;
                        Long l = (Long) h30Var.get(u30Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                h30Var.remove(u30Var);
                            }
                        }
                        long j2 = u30Var.f;
                        if (j2 == 0) {
                            u30Var.f = uptimeMillis;
                            u30Var.c(u30Var.b);
                        } else {
                            long j3 = uptimeMillis - j2;
                            u30Var.f = uptimeMillis;
                            float f = u30.b().g;
                            long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                            boolean z4 = u30Var.l;
                            float f2 = u30Var.k;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    i = i5;
                                    u30Var.j.i = f2;
                                    u30Var.k = Float.MAX_VALUE;
                                } else {
                                    i = i5;
                                }
                                u30Var.b = (float) u30Var.j.i;
                                u30Var.a = 0.0f;
                                u30Var.l = z3;
                                z = z2;
                                j = uptimeMillis;
                            } else {
                                i = i5;
                                v30 v30Var = u30Var.j;
                                float f3 = u30Var.b;
                                float f4 = u30Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j5 = j4 / 2;
                                    lg a = v30Var.a(f3, f4, j5);
                                    v30 v30Var2 = u30Var.j;
                                    v30Var2.i = u30Var.k;
                                    u30Var.k = Float.MAX_VALUE;
                                    lg a2 = v30Var2.a(a.a, a.b, j5);
                                    u30Var.b = a2.a;
                                    u30Var.a = a2.b;
                                } else {
                                    lg a3 = v30Var.a(f3, f4, j4);
                                    u30Var.b = a3.a;
                                    u30Var.a = a3.b;
                                }
                                float max = Math.max(u30Var.b, -3.4028235E38f);
                                u30Var.b = max;
                                u30Var.b = Math.min(max, Float.MAX_VALUE);
                                float f5 = u30Var.a;
                                v30 v30Var3 = u30Var.j;
                                v30Var3.getClass();
                                j = uptimeMillis;
                                if (Math.abs(f5) >= v30Var3.e || Math.abs(r2 - ((float) v30Var3.i)) >= v30Var3.d) {
                                    z = false;
                                } else {
                                    u30Var.b = (float) u30Var.j.i;
                                    u30Var.a = 0.0f;
                                    z = true;
                                }
                            }
                            float min = Math.min(u30Var.b, Float.MAX_VALUE);
                            u30Var.b = min;
                            float max2 = Math.max(min, -3.4028235E38f);
                            u30Var.b = max2;
                            u30Var.c(max2);
                            if (z) {
                                ArrayList arrayList2 = u30Var.h;
                                u30Var.e = false;
                                n3 b = u30.b();
                                b.a.remove(u30Var);
                                ArrayList arrayList3 = b.b;
                                int indexOf = arrayList3.indexOf(u30Var);
                                if (indexOf >= 0) {
                                    arrayList3.set(indexOf, null);
                                    b.f = true;
                                }
                                u30Var.f = 0L;
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    if (arrayList2.get(i6) != null) {
                                        arrayList2.get(i6).getClass();
                                        o8.c();
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
                        h5 h5Var = n3Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((l3) h5Var.g);
                        h5Var.g = null;
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
                ((xa) obj2).s(true);
                return;
            case 4:
                wb wbVar = (wb) obj2;
                Runnable runnable = wbVar.g;
                if (runnable != null) {
                    runnable.run();
                    wbVar.g = null;
                    return;
                }
                return;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                cc.a((cc) obj2);
                return;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                jg jgVar = (jg) obj2;
                boolean isPopupShowing = jgVar.h.isPopupShowing();
                jgVar.s(isPopupShowing);
                jgVar.m = isPopupShowing;
                return;
            case 7:
                oj ojVar = (oj) obj2;
                synchronized (ojVar.i) {
                    try {
                        if (ojVar.m == null) {
                            return;
                        }
                        try {
                            yj b2 = ojVar.b();
                            int i7 = b2.f;
                            if (i7 == 2) {
                                synchronized (ojVar.i) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                int i8 = t60.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                vg vgVar = ojVar.h;
                                Context context = ojVar.f;
                                vgVar.getClass();
                                yj[] yjVarArr = {b2};
                                op opVar = n70.a;
                                vw.h("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface p = n70.a.p(context, yjVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer Y = vw.Y(ojVar.f, b2.a);
                                    if (Y == null || p == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        h8 h8Var = new h8(p, op.H(Y));
                                        Trace.endSection();
                                        synchronized (ojVar.i) {
                                            try {
                                                j8 j8Var = ojVar.m;
                                                if (j8Var != null) {
                                                    j8Var.H(h8Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        ojVar.a();
                                        return;
                                    } finally {
                                        int i9 = t60.a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (ojVar.i) {
                                try {
                                    j8 j8Var2 = ojVar.m;
                                    if (j8Var2 != null) {
                                        j8Var2.G(th3);
                                    }
                                    ojVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case BottomSheetBehavior.SAVE_SKIP_COLLAPSED /* 8 */:
                int i10 = MainActivity.L;
                ((MainActivity) obj2).s();
                return;
            case 9:
                MaterialButton.a((MaterialButton) obj2);
                return;
            case 10:
                ux uxVar = (ux) obj2;
                a aVar = uxVar.k;
                if (uxVar.g == 0) {
                    uxVar.h = true;
                    aVar.e(gq.ON_PAUSE);
                }
                if (uxVar.f == 0 && uxVar.h) {
                    aVar.e(gq.ON_STOP);
                    uxVar.i = true;
                    return;
                }
                return;
            case 11:
                ((ny) obj2).m();
                return;
            case 12:
                g30 g30Var = (g30) obj2;
                g30Var.b = false;
                SideSheetBehavior sideSheetBehavior = g30Var.d;
                h90 h90Var = sideSheetBehavior.i;
                if (h90Var != null && h90Var.f()) {
                    g30Var.a(g30Var.a);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.setStateInternal(g30Var.a);
                        return;
                    }
                    return;
                }
            case 13:
                e50 e50Var = ((h50) obj2).a;
                ViewParent parent = e50Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(e50Var);
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
