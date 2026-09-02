package a;

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
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f34g;

    public /* synthetic */ j(int i, Object obj) {
        this.f33f = i;
        this.f34g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z3;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        boolean z5 = false;
        switch (this.f33f) {
            case 0:
                k kVar = (k) this.f34g;
                Runnable runnable = kVar.f36g;
                if (runnable != null) {
                    runnable.run();
                    kVar.f36g = null;
                    return;
                }
                return;
            case 1:
                o.a((o) this.f34g);
                return;
            case 2:
                androidx.emoji2.text.u uVar = (androidx.emoji2.text.u) this.f34g;
                synchronized (uVar.i) {
                    try {
                        if (uVar.f363m == null) {
                            return;
                        }
                        try {
                            k0.i b4 = uVar.b();
                            int i = b4.f2154f;
                            if (i == 2) {
                                synchronized (uVar.i) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i4 = j0.g.f1893a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                l2.f fVar = uVar.f359h;
                                Context context = uVar.f357f;
                                fVar.getClass();
                                k0.i[] iVarArr = {b4};
                                y yVar = f0.g.f1272a;
                                h.a.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface s3 = f0.g.f1272a.s(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer K = y.K(uVar.f357f, b4.f2150a);
                                    if (K == null || s3 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        a0.j jVar = new a0.j(s3, y.Q(K));
                                        Trace.endSection();
                                        synchronized (uVar.i) {
                                            try {
                                                y yVar2 = uVar.f363m;
                                                if (yVar2 != null) {
                                                    yVar2.O(jVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        uVar.a();
                                        return;
                                    } finally {
                                        int i5 = j0.g.f1893a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (uVar.i) {
                                try {
                                    y yVar3 = uVar.f363m;
                                    if (yVar3 != null) {
                                        yVar3.L(th);
                                    }
                                    uVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 3:
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f34g;
                androidx.lifecycle.t tVar = b0Var.f597k;
                if (b0Var.f594g == 0) {
                    z3 = true;
                    b0Var.f595h = true;
                    tVar.d(androidx.lifecycle.l.ON_PAUSE);
                } else {
                    z3 = true;
                }
                if (b0Var.f593f == 0 && b0Var.f595h) {
                    tVar.d(androidx.lifecycle.l.ON_STOP);
                    b0Var.i = z3;
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) this.f34g;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = c0.b.f752g;
                Method method = c0.b.f751f;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i6 != 26 && i6 != 27) || method != null) && (c0.b.f750e != null || c0.b.d != null)) {
                    try {
                        Object obj2 = c0.b.f749c.get(activity);
                        if (obj2 != null && (obj = c0.b.f748b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            c0.a aVar = new c0.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar);
                            handler.post(new androidx.fragment.app.e(aVar, obj2, 1));
                            try {
                                if (i6 == 26 || i6 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new androidx.fragment.app.e(application, aVar, 2));
                                return;
                            } catch (Throwable th2) {
                                handler.post(new androidx.fragment.app.e(application, aVar, 2));
                                throw th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 5:
                View view = (View) this.f34g;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 6:
                m2.e eVar = (m2.e) this.f34g;
                eVar.f2694c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f2695e;
                t0.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f2693b);
                    return;
                } else {
                    if (sideSheetBehavior.f990h == 2) {
                        sideSheetBehavior.r(eVar.f2693b);
                        return;
                    }
                    return;
                }
            case 7:
                ((o2.d) this.f34g).s(true);
                return;
            case 8:
                o2.k kVar2 = (o2.k) this.f34g;
                boolean isPopupShowing = kVar2.f2896h.isPopupShowing();
                kVar2.s(isPopupShowing);
                kVar2.f2900m = isPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.f34g).f1020j.requestLayout();
                return;
            case 10:
                q0.e eVar3 = ((q0.g) this.f34g).f3066a;
                ViewParent parent = eVar3.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(eVar3);
                    return;
                }
                return;
            case 11:
                u0.b bVar = (u0.b) ((u0.b) this.f34g).f3316c.f81g;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = bVar.f3315b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (i7 < arrayList3.size()) {
                    u0.e eVar4 = (u0.e) arrayList3.get(i7);
                    if (eVar4 != null) {
                        q.j jVar2 = bVar.f3314a;
                        Long l4 = (Long) jVar2.get(eVar4);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                jVar2.remove(eVar4);
                            }
                        }
                        long j4 = eVar4.f3334f;
                        if (j4 == 0) {
                            eVar4.f3334f = uptimeMillis;
                            eVar4.c(eVar4.f3331b);
                        } else {
                            long j5 = uptimeMillis - j4;
                            eVar4.f3334f = uptimeMillis;
                            float f2 = u0.e.b().f3319g;
                            long j6 = f2 == 0.0f ? 2147483647L : (long) (j5 / f2);
                            if (eVar4.f3339l) {
                                float f4 = eVar4.f3338k;
                                if (f4 != Float.MAX_VALUE) {
                                    arrayList2 = arrayList3;
                                    eVar4.f3337j.i = f4;
                                    eVar4.f3338k = Float.MAX_VALUE;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                eVar4.f3331b = (float) eVar4.f3337j.i;
                                eVar4.f3330a = 0.0f;
                                eVar4.f3339l = z5;
                            } else {
                                arrayList2 = arrayList3;
                                if (eVar4.f3338k != Float.MAX_VALUE) {
                                    long j7 = j6 / 2;
                                    u0.d a2 = eVar4.f3337j.a(eVar4.f3331b, eVar4.f3330a, j7);
                                    u0.f fVar2 = eVar4.f3337j;
                                    fVar2.i = eVar4.f3338k;
                                    eVar4.f3338k = Float.MAX_VALUE;
                                    u0.d a4 = fVar2.a(a2.f3322a, a2.f3323b, j7);
                                    eVar4.f3331b = a4.f3322a;
                                    eVar4.f3330a = a4.f3323b;
                                } else {
                                    u0.d a5 = eVar4.f3337j.a(eVar4.f3331b, eVar4.f3330a, j6);
                                    eVar4.f3331b = a5.f3322a;
                                    eVar4.f3330a = a5.f3323b;
                                }
                                float max = Math.max(eVar4.f3331b, -3.4028235E38f);
                                eVar4.f3331b = max;
                                eVar4.f3331b = Math.min(max, Float.MAX_VALUE);
                                float f5 = eVar4.f3330a;
                                u0.f fVar3 = eVar4.f3337j;
                                fVar3.getClass();
                                if (Math.abs(f5) >= fVar3.f3343e || Math.abs(r2 - ((float) fVar3.i)) >= fVar3.d) {
                                    z4 = false;
                                    float min = Math.min(eVar4.f3331b, Float.MAX_VALUE);
                                    eVar4.f3331b = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    eVar4.f3331b = max2;
                                    eVar4.c(max2);
                                    if (z4) {
                                        continue;
                                    } else {
                                        ArrayList arrayList4 = eVar4.f3336h;
                                        eVar4.f3333e = false;
                                        u0.b b5 = u0.e.b();
                                        b5.f3314a.remove(eVar4);
                                        ArrayList arrayList5 = b5.f3315b;
                                        int indexOf = arrayList5.indexOf(eVar4);
                                        if (indexOf >= 0) {
                                            arrayList5.set(indexOf, null);
                                            b5.f3318f = true;
                                        }
                                        eVar4.f3334f = 0L;
                                        for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                                            if (arrayList4.get(i8) != null) {
                                                arrayList4.get(i8).getClass();
                                                throw new ClassCastException();
                                            }
                                        }
                                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                            if (arrayList4.get(size) == null) {
                                                arrayList4.remove(size);
                                            }
                                        }
                                    }
                                    i7++;
                                    arrayList3 = arrayList2;
                                    z5 = false;
                                } else {
                                    eVar4.f3331b = (float) eVar4.f3337j.i;
                                    eVar4.f3330a = 0.0f;
                                }
                            }
                            z4 = true;
                            float min2 = Math.min(eVar4.f3331b, Float.MAX_VALUE);
                            eVar4.f3331b = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            eVar4.f3331b = max22;
                            eVar4.c(max22);
                            if (z4) {
                            }
                            i7++;
                            arrayList3 = arrayList2;
                            z5 = false;
                        }
                    }
                    arrayList2 = arrayList3;
                    i7++;
                    arrayList3 = arrayList2;
                    z5 = false;
                }
                ArrayList arrayList6 = arrayList3;
                if (bVar.f3318f) {
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList7 = arrayList6;
                        if (arrayList7.get(size2) == null) {
                            arrayList7.remove(size2);
                        }
                        size2--;
                        arrayList6 = arrayList7;
                    }
                    arrayList = arrayList6;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        androidx.emoji2.text.q qVar = bVar.f3320h;
                        ValueAnimator.unregisterDurationScaleChangeListener((u0.a) qVar.f346g);
                        qVar.f346g = null;
                    }
                    bVar.f3318f = false;
                } else {
                    arrayList = arrayList6;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) bVar.f3317e.f346g).postFrameCallback(new d1.g(bVar.d));
                    return;
                }
                return;
            case 12:
                MaterialButton.a((MaterialButton) this.f34g);
                return;
            default:
                ((CarouselLayoutManager) this.f34g).m0();
                return;
        }
    }
}
