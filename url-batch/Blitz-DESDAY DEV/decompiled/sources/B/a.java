package B;

import J.j;
import O0.C0029e;
import O0.l;
import V.q;
import a.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.winfour.neondrop.MainActivity;
import com.winfour.neondrop.MainActivity2;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86b;

    public /* synthetic */ a(int i, Object obj) {
        this.f85a = i;
        this.f86b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        c cVar;
        switch (this.f85a) {
            case 0:
                Activity activity = (Activity) this.f86b;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class cls = d.f95a;
                    activity.recreate();
                    return;
                }
                Class cls2 = d.f95a;
                ?? r6 = 26;
                boolean z2 = i == 26 || i == 27;
                Method method = d.f99f;
                if ((!z2 || method != null) && (d.f98e != null || d.d != null)) {
                    try {
                        Object obj2 = d.f97c.get(activity);
                        if (obj2 != null && (obj = d.f96b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            c cVar2 = new c(activity);
                            application2.registerActivityLifecycleCallbacks(cVar2);
                            Handler handler = d.f100g;
                            handler.post(new b(cVar2, 0, obj2));
                            try {
                                if (i == 26 || i == 27) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r6 = handler;
                                        cVar = cVar2;
                                        application = application2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r6 = handler;
                                        cVar = cVar2;
                                        application = application2;
                                        r6.post(new b(application, cVar, 1, false));
                                        throw th;
                                    }
                                } else {
                                    r6 = handler;
                                    cVar = cVar2;
                                    application = application2;
                                    activity.recreate();
                                }
                                r6.post(new b(application, cVar, 1, false));
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
                View view = (View) this.f86b;
                ((InputMethodManager) C.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                M0.e eVar = (M0.e) this.f86b;
                eVar.f615c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f616e;
                U.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f614b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f614b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0029e) this.f86b).t(true);
                return;
            case 4:
                l lVar = (l) this.f86b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f678m = isPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f86b).d.requestLayout();
                return;
            case 6:
                int i2 = MainActivity.f2077C;
                MainActivity mainActivity = (MainActivity) this.f86b;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MainActivity2.class));
                return;
            case 7:
                q qVar = (q) this.f86b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            j b2 = qVar.b();
                            int i3 = b2.f378e;
                            if (i3 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = I.h.f335a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                L0.e eVar3 = qVar.f905c;
                                Context context = qVar.f903a;
                                eVar3.getClass();
                                Typeface l2 = E.h.f171a.l(context, new j[]{b2}, 0);
                                MappedByteBuffer b02 = z1.l.b0(qVar.f903a, b2.f375a);
                                if (b02 == null || l2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    T0.g gVar = new T0.g(l2, z1.d.Q(b02));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (qVar.d) {
                                        try {
                                            z1.d dVar = qVar.h;
                                            if (dVar != null) {
                                                dVar.N(gVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                    int i5 = I.h.f335a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            synchronized (qVar.d) {
                                try {
                                    z1.d dVar2 = qVar.h;
                                    if (dVar2 != null) {
                                        dVar2.M(th4);
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 8:
                a.i iVar = (a.i) this.f86b;
                g1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1249b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1249b = null;
                    return;
                }
                return;
            case 9:
                m.a((m) this.f86b);
                return;
            case 10:
                A a2 = (A) this.f86b;
                g1.d.e(a2, "this$0");
                int i6 = a2.f1538b;
                t tVar = a2.f1541f;
                if (i6 == 0) {
                    a2.f1539c = true;
                    tVar.d(EnumC0069l.ON_PAUSE);
                }
                if (a2.f1537a == 0 && a2.f1539c) {
                    tVar.d(EnumC0069l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.f86b).m();
                return;
            default:
                ((CarouselLayoutManager) this.f86b).l0();
                return;
        }
    }
}
