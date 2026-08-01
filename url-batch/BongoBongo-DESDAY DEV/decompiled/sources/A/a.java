package A;

import A1.m;
import I.j;
import N0.C0032e;
import N0.l;
import V.r;
import a.ViewTreeObserverOnDrawListenerC0064i;
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
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.winfour.winrandom.MainActivity;
import com.winfour.winrandom.MainActivity2;
import com.winfour.winrandom.ui.GeneratorActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1b;

    public /* synthetic */ a(int i, Object obj) {
        this.f0a = i;
        this.f1b = obj;
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
        switch (this.f0a) {
            case 0:
                Activity activity = (Activity) this.f1b;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class cls = d.f10a;
                    activity.recreate();
                    return;
                }
                Class cls2 = d.f10a;
                ?? r6 = 26;
                boolean z2 = i == 26 || i == 27;
                Method method = d.f14f;
                if ((!z2 || method != null) && (d.f13e != null || d.d != null)) {
                    try {
                        Object obj2 = d.f12c.get(activity);
                        if (obj2 != null && (obj = d.f11b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            c cVar2 = new c(activity);
                            application2.registerActivityLifecycleCallbacks(cVar2);
                            Handler handler = d.f15g;
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
                View view = (View) this.f1b;
                ((InputMethodManager) B.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                L0.e eVar = (L0.e) this.f1b;
                eVar.f599c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f600e;
                U.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f598b);
                    return;
                } else {
                    if (sideSheetBehavior.f1963h == 2) {
                        sideSheetBehavior.r(eVar.f598b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0032e) this.f1b).t(true);
                return;
            case 4:
                l lVar = (l) this.f1b;
                boolean isPopupShowing = lVar.f661h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f665m = isPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f1b).d.requestLayout();
                return;
            case 6:
                int i2 = MainActivity.f2098E;
                MainActivity mainActivity = (MainActivity) this.f1b;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) MainActivity2.class));
                return;
            case 7:
                int i3 = GeneratorActivity.f2105B;
                ((GeneratorActivity) this.f1b).t();
                return;
            case 8:
                r rVar = (r) this.f1b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.f923h == null) {
                            return;
                        }
                        try {
                            j b2 = rVar.b();
                            int i4 = b2.f340e;
                            if (i4 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i4 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                            }
                            try {
                                int i5 = H.h.f295a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                K0.e eVar3 = rVar.f919c;
                                Context context = rVar.f917a;
                                eVar3.getClass();
                                Typeface o2 = D.h.f123a.o(context, new j[]{b2}, 0);
                                MappedByteBuffer X2 = A1.d.X(rVar.f917a, b2.f337a);
                                if (X2 == null || o2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    S0.g gVar = new S0.g(o2, m.W(X2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            m mVar = rVar.f923h;
                                            if (mVar != null) {
                                                mVar.Q(gVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i6 = H.h.f295a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            synchronized (rVar.d) {
                                try {
                                    m mVar2 = rVar.f923h;
                                    if (mVar2 != null) {
                                        mVar2.N(th4);
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 9:
                ViewTreeObserverOnDrawListenerC0064i viewTreeObserverOnDrawListenerC0064i = (ViewTreeObserverOnDrawListenerC0064i) this.f1b;
                h1.d.e(viewTreeObserverOnDrawListenerC0064i, "this$0");
                Runnable runnable = viewTreeObserverOnDrawListenerC0064i.f1239b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0064i.f1239b = null;
                    return;
                }
                return;
            case 10:
                a.m.a((a.m) this.f1b);
                return;
            case 11:
                A a2 = (A) this.f1b;
                h1.d.e(a2, "this$0");
                int i7 = a2.f1541b;
                t tVar = a2.f1544f;
                if (i7 == 0) {
                    a2.f1542c = true;
                    tVar.d(EnumC0078l.ON_PAUSE);
                }
                if (a2.f1540a == 0 && a2.f1542c) {
                    tVar.d(EnumC0078l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 12:
                ((com.google.android.material.timepicker.e) this.f1b).m();
                return;
            default:
                ((CarouselLayoutManager) this.f1b).n0();
                return;
        }
    }
}
