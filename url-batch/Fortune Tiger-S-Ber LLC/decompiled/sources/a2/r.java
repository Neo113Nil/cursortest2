package a2;

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
import androidx.emoji2.text.w;
import androidx.fragment.app.w0;
import androidx.lifecycle.b0;
import com.gglhk.bofio.fortunetiger.MainActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f66f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r(int i4, Object obj) {
        this.f66f = i4;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f5  */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z3;
        boolean z4;
        Object obj;
        Application application = null;
        switch (this.f66f) {
            case 0:
                View view = (View) this.g;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                androidx.activity.k kVar = (androidx.activity.k) this.g;
                Runnable runnable = kVar.g;
                if (runnable != null) {
                    runnable.run();
                    kVar.g = null;
                    return;
                }
                return;
            case 2:
                androidx.activity.q.b((androidx.activity.q) this.g);
                return;
            case 3:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.g;
                synchronized (tVar.f360i) {
                    try {
                        if (tVar.f364m == null) {
                            return;
                        }
                        try {
                            h0.i b2 = tVar.b();
                            int i4 = b2.f1997e;
                            if (i4 == 2) {
                                synchronized (tVar.f360i) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                int i5 = g0.f.f1759a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                g2.f fVar = tVar.h;
                                Context context = tVar.f359f;
                                fVar.getClass();
                                h0.i[] iVarArr = {b2};
                                k3.d dVar = c0.f.f984a;
                                k3.m.i("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface r3 = c0.f.f984a.r(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer H = k3.m.H(tVar.f359f, b2.f1994a);
                                    if (H == null || r3 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        w wVar = new w(r3, k3.m.P(H));
                                        Trace.endSection();
                                        synchronized (tVar.f360i) {
                                            try {
                                                k3.m mVar = tVar.f364m;
                                                if (mVar != null) {
                                                    mVar.M(wVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        tVar.a();
                                        return;
                                    } finally {
                                        int i6 = g0.f.f1759a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (tVar.f360i) {
                                try {
                                    k3.m mVar2 = tVar.f364m;
                                    if (mVar2 != null) {
                                        mVar2.J(th);
                                    }
                                    tVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 4:
                b0 b0Var = (b0) this.g;
                androidx.lifecycle.t tVar2 = b0Var.f574k;
                if (b0Var.g == 0) {
                    z3 = true;
                    b0Var.h = true;
                    tVar2.d(androidx.lifecycle.l.ON_PAUSE);
                } else {
                    z3 = true;
                }
                if (b0Var.f571f == 0 && b0Var.h) {
                    tVar2.d(androidx.lifecycle.l.ON_STOP);
                    b0Var.f572i = z3;
                    return;
                }
                return;
            case 5:
                h2.e eVar = (h2.e) this.g;
                eVar.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f2016e;
                q0.e eVar2 = sideSheetBehavior.f1375i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f2014b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f2014b);
                        return;
                    }
                    return;
                }
            case 6:
                MainActivity mainActivity = (MainActivity) this.g;
                int i7 = MainActivity.I;
                mainActivity.u();
                return;
            case 7:
                ((j2.e) this.g).s(true);
                return;
            case 8:
                j2.m mVar3 = (j2.m) this.g;
                boolean isPopupShowing = mVar3.h.isPopupShowing();
                mVar3.s(isPopupShowing);
                mVar3.f2324m = isPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.g).f1402j.requestLayout();
                return;
            case 10:
                n0.b bVar = ((n0.d) this.g).f2942a;
                ViewParent parent = bVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(bVar);
                    return;
                }
                return;
            case 11:
                r0.d dVar2 = (r0.d) ((r0.d) this.g).c.f3139f;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = dVar2.f3145b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    r0.g gVar = (r0.g) arrayList.get(i8);
                    if (gVar != null) {
                        n.j jVar = dVar2.f3144a;
                        Long l4 = (Long) jVar.get(gVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                jVar.remove(gVar);
                            } else {
                                continue;
                            }
                        }
                        long j4 = gVar.f3162f;
                        if (j4 == 0) {
                            gVar.f3162f = uptimeMillis;
                            gVar.c(gVar.f3159b);
                        } else {
                            long j5 = uptimeMillis - j4;
                            gVar.f3162f = uptimeMillis;
                            float f4 = r0.g.b().g;
                            long j6 = f4 == 0.0f ? 2147483647L : (long) (j5 / f4);
                            if (gVar.f3166l) {
                                float f5 = gVar.f3165k;
                                if (f5 != Float.MAX_VALUE) {
                                    gVar.f3164j.f3172i = f5;
                                    gVar.f3165k = Float.MAX_VALUE;
                                }
                                gVar.f3159b = (float) gVar.f3164j.f3172i;
                                gVar.f3158a = 0.0f;
                                gVar.f3166l = false;
                            } else {
                                if (gVar.f3165k != Float.MAX_VALUE) {
                                    long j7 = j6 / 2;
                                    r0.f a4 = gVar.f3164j.a(gVar.f3159b, gVar.f3158a, j7);
                                    r0.h hVar = gVar.f3164j;
                                    hVar.f3172i = gVar.f3165k;
                                    gVar.f3165k = Float.MAX_VALUE;
                                    r0.f a5 = hVar.a(a4.f3150a, a4.f3151b, j7);
                                    gVar.f3159b = a5.f3150a;
                                    gVar.f3158a = a5.f3151b;
                                } else {
                                    r0.f a6 = gVar.f3164j.a(gVar.f3159b, gVar.f3158a, j6);
                                    gVar.f3159b = a6.f3150a;
                                    gVar.f3158a = a6.f3151b;
                                }
                                float max = Math.max(gVar.f3159b, -3.4028235E38f);
                                gVar.f3159b = max;
                                gVar.f3159b = Math.min(max, Float.MAX_VALUE);
                                float f6 = gVar.f3158a;
                                r0.h hVar2 = gVar.f3164j;
                                hVar2.getClass();
                                if (Math.abs(f6) >= hVar2.f3170e || Math.abs(r3 - ((float) hVar2.f3172i)) >= hVar2.f3169d) {
                                    z4 = false;
                                    float min = Math.min(gVar.f3159b, Float.MAX_VALUE);
                                    gVar.f3159b = min;
                                    float max2 = Math.max(min, -3.4028235E38f);
                                    gVar.f3159b = max2;
                                    gVar.c(max2);
                                    if (z4) {
                                        continue;
                                    } else {
                                        ArrayList arrayList2 = gVar.h;
                                        gVar.f3161e = false;
                                        r0.d b4 = r0.g.b();
                                        b4.f3144a.remove(gVar);
                                        ArrayList arrayList3 = b4.f3145b;
                                        int indexOf = arrayList3.indexOf(gVar);
                                        if (indexOf >= 0) {
                                            arrayList3.set(indexOf, null);
                                            b4.f3148f = true;
                                        }
                                        gVar.f3162f = 0L;
                                        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                            if (arrayList2.get(i9) != null) {
                                                throw w0.d(arrayList2, i9);
                                            }
                                        }
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    }
                                } else {
                                    gVar.f3159b = (float) gVar.f3164j.f3172i;
                                    gVar.f3158a = 0.0f;
                                }
                            }
                            z4 = true;
                            float min2 = Math.min(gVar.f3159b, Float.MAX_VALUE);
                            gVar.f3159b = min2;
                            float max22 = Math.max(min2, -3.4028235E38f);
                            gVar.f3159b = max22;
                            gVar.c(max22);
                            if (z4) {
                            }
                        }
                    }
                }
                if (dVar2.f3148f) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        s sVar = dVar2.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((r0.b) sVar.g);
                        sVar.g = null;
                    }
                    dVar2.f3148f = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) dVar2.f3147e.g).postFrameCallback(new r0.c(dVar2.f3146d));
                    return;
                }
                return;
            case 12:
                MaterialButton.a((MaterialButton) this.g);
                return;
            case 13:
                ((CarouselLayoutManager) this.g).m0();
                return;
            default:
                Activity activity = (Activity) this.g;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = z.b.g;
                Method method = z.b.f3630f;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i10 != 26 && i10 != 27) || method != null) && (z.b.f3629e != null || z.b.f3628d != null)) {
                    try {
                        Object obj2 = z.b.c.get(activity);
                        if (obj2 != null && (obj = z.b.f3627b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            z.a aVar = new z.a(activity);
                            application2.registerActivityLifecycleCallbacks(aVar);
                            handler.post(new androidx.fragment.app.e(aVar, obj2, 4));
                            ?? r5 = (i10 == 26 || i10 == 27) ? 1 : 0;
                            int i11 = 5;
                            try {
                                if (r5 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r5 = aVar;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        application = application2;
                                        z.a aVar2 = aVar;
                                        handler.post(new androidx.fragment.app.e(application, aVar2, i11));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r5 = aVar;
                                    activity.recreate();
                                }
                                handler.post(new androidx.fragment.app.e(application, (Object) r5, i11));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
