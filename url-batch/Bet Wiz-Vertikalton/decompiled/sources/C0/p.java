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
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0344b;
import z.C0343a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164b;

    public /* synthetic */ p(int i, Object obj) {
        this.f163a = i;
        this.f164b = obj;
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
        switch (this.f163a) {
            case 0:
                View view = (View) this.f164b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                J0.e eVar = (J0.e) this.f164b;
                eVar.f408c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f409e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f407b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f407b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0029e) this.f164b).t(true);
                return;
            case 3:
                L0.l lVar = (L0.l) this.f164b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f580m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f164b).d.requestLayout();
                return;
            case 5:
                int i = GameplayActivity.f1965G;
                ((GameplayActivity) this.f164b).u(true);
                return;
            case 6:
                int i2 = MainActivity.F;
                ((MainActivity) this.f164b).v();
                return;
            case 7:
                T.r rVar = (T.r) this.f164b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i3 = b2.f278e;
                            if (i3 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = G.h.f247a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                I0.e eVar3 = rVar.f822c;
                                Context context = rVar.f820a;
                                eVar3.getClass();
                                Typeface t2 = C.h.f68a.t(context, new H.k[]{b2}, 0);
                                MappedByteBuffer L2 = x1.d.L(rVar.f820a, b2.f275a);
                                if (L2 == null || t2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(t2, x1.d.W(L2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            x1.d dVar = rVar.h;
                                            if (dVar != null) {
                                                dVar.R(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i5 = G.h.f247a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    x1.d dVar2 = rVar.h;
                                    if (dVar2 != null) {
                                        dVar2.M(th2);
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
            case 8:
                a.i iVar = (a.i) this.f164b;
                e1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1151b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1151b = null;
                    return;
                }
                return;
            case 9:
                a.m.a((a.m) this.f164b);
                return;
            case 10:
                A a2 = (A) this.f164b;
                e1.d.e(a2, "this$0");
                int i6 = a2.f1436b;
                t tVar = a2.f1439f;
                if (i6 == 0) {
                    a2.f1437c = true;
                    tVar.d(EnumC0069l.ON_PAUSE);
                }
                if (a2.f1435a == 0 && a2.f1437c) {
                    tVar.d(EnumC0069l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.f164b).m();
                return;
            case 12:
                ((CarouselLayoutManager) this.f164b).l0();
                return;
            default:
                Activity activity = (Activity) this.f164b;
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = AbstractC0344b.f4311a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0344b.f4311a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i7 == 26 || i7 == 27;
                Method method = AbstractC0344b.f4315f;
                if ((!z2 || method != null) && (AbstractC0344b.f4314e != null || AbstractC0344b.d != null)) {
                    try {
                        Object obj2 = AbstractC0344b.f4313c.get(activity);
                        if (obj2 != null && (obj = AbstractC0344b.f4312b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0343a c0343a = new C0343a(activity);
                            application.registerActivityLifecycleCallbacks(c0343a);
                            Handler handler = AbstractC0344b.f4316g;
                            handler.post(new H.a(c0343a, 3, obj2));
                            if (i7 != 26 && i7 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0343a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0343a c0343a2 = c0343a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0343a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0343a;
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
