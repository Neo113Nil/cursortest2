package B0;

import K0.C0030e;
import T.t;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.EnumC0068l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.playminus.quickmatch.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0345b;
import z.C0344a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142b;

    public /* synthetic */ q(int i, Object obj) {
        this.f141a = i;
        this.f142b = obj;
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
        switch (this.f141a) {
            case 0:
                View view = (View) this.f142b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                I0.e eVar = (I0.e) this.f142b;
                eVar.f350c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f351e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f349b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f349b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0030e) this.f142b).t(true);
                return;
            case 3:
                K0.l lVar = (K0.l) this.f142b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f508m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f142b).d.requestLayout();
                return;
            case 5:
                int i = MainActivity.f1864D;
                ((MainActivity) this.f142b).w();
                return;
            case 6:
                T.q qVar = (T.q) this.f142b;
                synchronized (qVar.d) {
                    try {
                        if (qVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = qVar.b();
                            int i2 = b2.f232e;
                            if (i2 == 2) {
                                synchronized (qVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = G.h.f194a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                H0.e eVar3 = qVar.f741c;
                                Context context = qVar.f739a;
                                eVar3.getClass();
                                Typeface r2 = C.h.f154a.r(context, new H.k[]{b2}, 0);
                                MappedByteBuffer b02 = q1.d.b0(qVar.f739a, b2.f229a);
                                if (b02 == null || r2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    t tVar = new t(r2, q1.d.i0(b02));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (qVar.d) {
                                        try {
                                            q1.d dVar = qVar.h;
                                            if (dVar != null) {
                                                dVar.f0(tVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    qVar.a();
                                    return;
                                } finally {
                                    int i4 = G.h.f194a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (qVar.d) {
                                try {
                                    q1.d dVar2 = qVar.h;
                                    if (dVar2 != null) {
                                        dVar2.c0(th2);
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
            case 7:
                a.i iVar = (a.i) this.f142b;
                X0.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1046b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1046b = null;
                    return;
                }
                return;
            case 8:
                a.m.a((a.m) this.f142b);
                return;
            case 9:
                A a2 = (A) this.f142b;
                X0.d.e(a2, "this$0");
                int i5 = a2.f1330b;
                androidx.lifecycle.t tVar2 = a2.f1333f;
                if (i5 == 0) {
                    a2.f1331c = true;
                    tVar2.d(EnumC0068l.ON_PAUSE);
                }
                if (a2.f1329a == 0 && a2.f1331c) {
                    tVar2.d(EnumC0068l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f142b).m();
                return;
            case 11:
                ((CarouselLayoutManager) this.f142b).l0();
                return;
            default:
                Activity activity = (Activity) this.f142b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0345b.f4202a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0345b.f4202a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0345b.f4206f;
                if ((!z2 || method != null) && (AbstractC0345b.f4205e != null || AbstractC0345b.d != null)) {
                    try {
                        Object obj2 = AbstractC0345b.f4204c.get(activity);
                        if (obj2 != null && (obj = AbstractC0345b.f4203b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0344a c0344a = new C0344a(activity);
                            application.registerActivityLifecycleCallbacks(c0344a);
                            Handler handler = AbstractC0345b.f4207g;
                            handler.post(new H.a(c0344a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0344a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0344a c0344a2 = c0344a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0344a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0344a;
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
