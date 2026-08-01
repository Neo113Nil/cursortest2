package C0;

import L0.C0029e;
import T.u;
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
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.playgen.securelock.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0342b;
import z.C0341a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163b;

    public /* synthetic */ p(int i, Object obj) {
        this.f162a = i;
        this.f163b = obj;
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
        switch (this.f162a) {
            case 0:
                View view = (View) this.f163b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                J0.e eVar = (J0.e) this.f163b;
                eVar.f355c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f356e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f354b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f354b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0029e) this.f163b).t(true);
                return;
            case 3:
                L0.l lVar = (L0.l) this.f163b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f528m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f163b).d.requestLayout();
                return;
            case 5:
                int i = MainActivity.f1934D;
                ((MainActivity) this.f163b).v();
                return;
            case 6:
                T.r rVar = (T.r) this.f163b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i2 = b2.f225e;
                            if (i2 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = G.h.f194a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                I0.e eVar3 = rVar.f795c;
                                Context context = rVar.f793a;
                                eVar3.getClass();
                                Typeface x2 = C.h.f67a.x(context, new H.k[]{b2}, 0);
                                MappedByteBuffer J2 = u1.l.J(rVar.f793a, b2.f222a);
                                if (J2 == null || x2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(x2, u1.l.R(J2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            u1.l lVar2 = rVar.h;
                                            if (lVar2 != null) {
                                                lVar2.P(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i4 = G.h.f194a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    u1.l lVar3 = rVar.h;
                                    if (lVar3 != null) {
                                        lVar3.K(th2);
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
            case 7:
                a.i iVar = (a.i) this.f163b;
                b1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1107b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1107b = null;
                    return;
                }
                return;
            case 8:
                a.m.a((a.m) this.f163b);
                return;
            case 9:
                A a2 = (A) this.f163b;
                b1.d.e(a2, "this$0");
                int i5 = a2.f1391b;
                t tVar = a2.f1394f;
                if (i5 == 0) {
                    a2.f1392c = true;
                    tVar.d(EnumC0072l.ON_PAUSE);
                }
                if (a2.f1390a == 0 && a2.f1392c) {
                    tVar.d(EnumC0072l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f163b).m();
                return;
            case 11:
                ((CarouselLayoutManager) this.f163b).l0();
                return;
            default:
                Activity activity = (Activity) this.f163b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0342b.f4242a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0342b.f4242a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0342b.f4246f;
                if ((!z2 || method != null) && (AbstractC0342b.f4245e != null || AbstractC0342b.d != null)) {
                    try {
                        Object obj2 = AbstractC0342b.f4244c.get(activity);
                        if (obj2 != null && (obj = AbstractC0342b.f4243b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0341a c0341a = new C0341a(activity);
                            application.registerActivityLifecycleCallbacks(c0341a);
                            Handler handler = AbstractC0342b.f4247g;
                            handler.post(new H.a(c0341a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0341a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0341a c0341a2 = c0341a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0341a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0341a;
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
