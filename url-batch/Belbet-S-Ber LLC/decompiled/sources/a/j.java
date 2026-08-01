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
import com.gdmhkmf.belbet.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32g;

    public /* synthetic */ j(int i, Object obj) {
        this.f31f = i;
        this.f32g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z4;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z5;
        int i = 2;
        boolean z6 = false;
        switch (this.f31f) {
            case 0:
                k kVar = (k) this.f32g;
                Runnable runnable = kVar.f36g;
                if (runnable != null) {
                    runnable.run();
                    kVar.f36g = null;
                    return;
                }
                return;
            case 1:
                o.b((o) this.f32g);
                return;
            case 2:
                androidx.emoji2.text.u uVar = (androidx.emoji2.text.u) this.f32g;
                synchronized (uVar.i) {
                    try {
                        if (uVar.f480m == null) {
                            return;
                        }
                        try {
                            k0.i b2 = uVar.b();
                            int i4 = b2.f2302f;
                            if (i4 == 2) {
                                synchronized (uVar.i) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                Method method = j0.h.f2137b;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                o2.f fVar = uVar.h;
                                Context context = uVar.f475f;
                                fVar.getClass();
                                k0.i[] iVarArr = {b2};
                                b4.d dVar = f0.f.f1420a;
                                b4.d.j("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface p4 = f0.f.f1420a.p(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer R = b4.l.R(uVar.f475f, b2.f2298a);
                                    if (R == null || p4 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        a0.k kVar2 = new a0.k(p4, b4.d.M(R));
                                        Trace.endSection();
                                        synchronized (uVar.i) {
                                            try {
                                                b4.d dVar2 = uVar.f480m;
                                                if (dVar2 != null) {
                                                    dVar2.K(kVar2);
                                                }
                                            } finally {
                                            }
                                        }
                                        uVar.a();
                                        return;
                                    } finally {
                                        Method method2 = j0.h.f2137b;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (uVar.i) {
                                try {
                                    b4.d dVar3 = uVar.f480m;
                                    if (dVar3 != null) {
                                        dVar3.F(th);
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
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f32g;
                androidx.lifecycle.t tVar = b0Var.f701k;
                if (b0Var.f699g == 0) {
                    z4 = true;
                    b0Var.h = true;
                    tVar.d(androidx.lifecycle.l.ON_PAUSE);
                } else {
                    z4 = true;
                }
                if (b0Var.f698f == 0 && b0Var.h) {
                    tVar.d(androidx.lifecycle.l.ON_STOP);
                    b0Var.i = z4;
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) this.f32g;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = c0.b.f869g;
                Method method3 = c0.b.f868f;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i5 != 26 && i5 != 27) || method3 != null) && (c0.b.f867e != null || c0.b.d != null)) {
                    try {
                        Object obj2 = c0.b.f866c.get(activity);
                        if (obj2 != null && (obj = c0.b.f865b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            c0.a aVar = new c0.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar);
                            handler.post(new androidx.fragment.app.e(aVar, obj2, 1));
                            try {
                                if (i5 == 26 || i5 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method3.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new androidx.fragment.app.e(application, aVar, i));
                                return;
                            } finally {
                                handler.post(new androidx.fragment.app.e(application, aVar, i));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 5:
                View view = (View) this.f32g;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 6:
                MainActivity mainActivity = (MainActivity) this.f32g;
                int i6 = MainActivity.L;
                mainActivity.s();
                return;
            case 7:
                p2.e eVar = (p2.e) this.f32g;
                eVar.f3087c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f3088e;
                u0.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f3086b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f3086b);
                        return;
                    }
                    return;
                }
            case 8:
                q0.d dVar4 = ((q0.f) this.f32g).f3136a;
                ViewParent parent = dVar4.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(dVar4);
                    return;
                }
                return;
            case 9:
                ((s2.d) this.f32g).s(true);
                return;
            case 10:
                s2.k kVar3 = (s2.k) this.f32g;
                boolean isPopupShowing = kVar3.h.isPopupShowing();
                kVar3.s(isPopupShowing);
                kVar3.f3260m = isPopupShowing;
                return;
            case 11:
                ((TextInputLayout) this.f32g).f1209j.requestLayout();
                return;
            case 12:
                v0.b bVar = (v0.b) ((v0.b) this.f32g).f3695c.f3172a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = bVar.f3694b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i7 = 0;
                while (i7 < arrayList3.size()) {
                    v0.e eVar3 = (v0.e) arrayList3.get(i7);
                    if (eVar3 != null) {
                        q.j jVar = bVar.f3693a;
                        Long l4 = (Long) jVar.get(eVar3);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                jVar.remove(eVar3);
                            }
                        }
                        long j2 = eVar3.f3712f;
                        if (j2 == 0) {
                            eVar3.f3712f = uptimeMillis;
                            eVar3.c(eVar3.f3709b);
                        } else {
                            long j4 = uptimeMillis - j2;
                            eVar3.f3712f = uptimeMillis;
                            float f5 = v0.e.b().f3698g;
                            long j5 = f5 == 0.0f ? 2147483647L : (long) (j4 / f5);
                            if (eVar3.f3716l) {
                                float f6 = eVar3.f3715k;
                                if (f6 != Float.MAX_VALUE) {
                                    arrayList2 = arrayList3;
                                    eVar3.f3714j.i = f6;
                                    eVar3.f3715k = Float.MAX_VALUE;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                eVar3.f3709b = (float) eVar3.f3714j.i;
                                eVar3.f3708a = 0.0f;
                                eVar3.f3716l = z6;
                            } else {
                                arrayList2 = arrayList3;
                                if (eVar3.f3715k != Float.MAX_VALUE) {
                                    long j6 = j5 / 2;
                                    v0.d a5 = eVar3.f3714j.a(eVar3.f3709b, eVar3.f3708a, j6);
                                    v0.f fVar2 = eVar3.f3714j;
                                    fVar2.i = eVar3.f3715k;
                                    eVar3.f3715k = Float.MAX_VALUE;
                                    v0.d a6 = fVar2.a(a5.f3700a, a5.f3701b, j6);
                                    eVar3.f3709b = a6.f3700a;
                                    eVar3.f3708a = a6.f3701b;
                                } else {
                                    v0.d a7 = eVar3.f3714j.a(eVar3.f3709b, eVar3.f3708a, j5);
                                    eVar3.f3709b = a7.f3700a;
                                    eVar3.f3708a = a7.f3701b;
                                }
                                float max = Math.max(eVar3.f3709b, -3.4028235E38f);
                                eVar3.f3709b = max;
                                eVar3.f3709b = Math.min(max, Float.MAX_VALUE);
                                float f7 = eVar3.f3708a;
                                v0.f fVar3 = eVar3.f3714j;
                                fVar3.getClass();
                                if (Math.abs(f7) >= fVar3.f3720e || Math.abs(r2 - ((float) fVar3.i)) >= fVar3.d) {
                                    z5 = false;
                                    float min = Math.min(eVar3.f3709b, Float.MAX_VALUE);
                                    eVar3.f3709b = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    eVar3.f3709b = max2;
                                    eVar3.c(max2);
                                    if (z5) {
                                        continue;
                                    } else {
                                        ArrayList arrayList4 = eVar3.h;
                                        eVar3.f3711e = false;
                                        v0.b b5 = v0.e.b();
                                        b5.f3693a.remove(eVar3);
                                        ArrayList arrayList5 = b5.f3694b;
                                        int indexOf = arrayList5.indexOf(eVar3);
                                        if (indexOf >= 0) {
                                            arrayList5.set(indexOf, null);
                                            b5.f3697f = true;
                                        }
                                        eVar3.f3712f = 0L;
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
                                    z6 = false;
                                } else {
                                    eVar3.f3709b = (float) eVar3.f3714j.i;
                                    eVar3.f3708a = 0.0f;
                                }
                            }
                            z5 = true;
                            float min2 = Math.min(eVar3.f3709b, Float.MAX_VALUE);
                            eVar3.f3709b = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            eVar3.f3709b = max22;
                            eVar3.c(max22);
                            if (z5) {
                            }
                            i7++;
                            arrayList3 = arrayList2;
                            z6 = false;
                        }
                    }
                    arrayList2 = arrayList3;
                    i7++;
                    arrayList3 = arrayList2;
                    z6 = false;
                }
                ArrayList arrayList6 = arrayList3;
                if (bVar.f3697f) {
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
                        androidx.emoji2.text.q qVar = bVar.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((v0.a) qVar.f466g);
                        qVar.f466g = null;
                    }
                    bVar.f3697f = false;
                } else {
                    arrayList = arrayList6;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) bVar.f3696e.f466g).postFrameCallback(new e1.g(bVar.d));
                    return;
                }
                return;
            case 13:
                MaterialButton.a((MaterialButton) this.f32g);
                return;
            default:
                ((CarouselLayoutManager) this.f32g).o0();
                return;
        }
    }
}
