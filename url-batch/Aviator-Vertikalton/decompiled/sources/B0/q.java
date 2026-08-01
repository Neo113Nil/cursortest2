package B0;

import K0.C0034e;
import T.v;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0080m;
import com.fortuneink.neonpad.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f152b;

    public /* synthetic */ q(int i, Object obj) {
        this.f151a = i;
        this.f152b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r4 = 1;
        r4 = 1;
        switch (this.f151a) {
            case 0:
                View view = (View) this.f152b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                I0.e eVar = (I0.e) this.f152b;
                eVar.f377c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f379e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f376b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f376b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0034e) this.f152b).t(true);
                return;
            case 3:
                K0.l lVar = (K0.l) this.f152b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f558m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f152b).f2008d.requestLayout();
                return;
            case 5:
                T.s sVar = (T.s) this.f152b;
                synchronized (sVar.f816d) {
                    try {
                        if (sVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = sVar.b();
                            int i = b2.f247e;
                            if (i == 2) {
                                synchronized (sVar.f816d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = G.i.f204a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                H0.e eVar3 = sVar.f815c;
                                Context context = sVar.f813a;
                                eVar3.getClass();
                                Typeface p2 = C.h.f165a.p(context, new H.k[]{b2}, 0);
                                MappedByteBuffer Q2 = q1.d.Q(sVar.f813a, b2.f243a);
                                if (Q2 == null || p2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    v vVar = new v(p2, q1.l.b0(Q2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (sVar.f816d) {
                                        try {
                                            q1.l lVar2 = sVar.h;
                                            if (lVar2 != null) {
                                                lVar2.U(vVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                    int i3 = G.i.f204a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (sVar.f816d) {
                                try {
                                    q1.l lVar3 = sVar.h;
                                    if (lVar3 != null) {
                                        lVar3.P(th2);
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 6:
                a.l lVar4 = (a.l) this.f152b;
                X0.f.e(lVar4, "this$0");
                Runnable runnable = lVar4.f915b;
                if (runnable != null) {
                    runnable.run();
                    lVar4.f915b = null;
                    return;
                }
                return;
            case 7:
                a.q.a((a.q) this.f152b);
                return;
            case 8:
                C c2 = (C) this.f152b;
                X0.f.e(c2, "this$0");
                int i4 = c2.f1436b;
                C0088v c0088v = c2.f1440f;
                if (i4 == 0) {
                    c2.f1437c = true;
                    c0088v.e(EnumC0080m.ON_PAUSE);
                }
                if (c2.f1435a == 0 && c2.f1437c) {
                    c0088v.e(EnumC0080m.ON_STOP);
                    c2.f1438d = true;
                    return;
                }
                return;
            case 9:
                MainActivity.access$loadFallbackGame((MainActivity) this.f152b);
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f152b).m();
                return;
            case 11:
                ((CarouselLayoutManager) this.f152b).l0();
                return;
            default:
                Activity activity = (Activity) this.f152b;
                if (activity.isFinishing()) {
                    return;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    Class cls = z.e.f4622a;
                    activity.recreate();
                    return;
                }
                Class cls2 = z.e.f4622a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i5 == 26 || i5 == 27;
                Method method = z.e.f4627f;
                if ((!z2 || method != null) && (z.e.f4626e != null || z.e.f4625d != null)) {
                    try {
                        Object obj2 = z.e.f4624c.get(activity);
                        if (obj2 != null && (obj = z.e.f4623b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            z.d dVar = new z.d(activity);
                            application.registerActivityLifecycleCallbacks(dVar);
                            Handler handler = z.e.f4628g;
                            handler.post(new H.a(dVar, 3, obj2));
                            if (i5 != 26 && i5 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = dVar;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        z.d dVar2 = dVar;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, dVar2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = dVar;
                                    r7 = application;
                                    activity.recreate();
                                }
                                r4.post(new H.a((Object) r7, 4, (Object) r6));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
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
