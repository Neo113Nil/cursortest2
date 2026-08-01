package D0;

import M0.C0032e;
import U.u;
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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.playbag.tripgear.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0318b;
import z.C0317a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220b;

    public /* synthetic */ p(int i, Object obj) {
        this.f219a = i;
        this.f220b = obj;
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
        switch (this.f219a) {
            case 0:
                View view = (View) this.f220b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                K0.e eVar = (K0.e) this.f220b;
                eVar.f529c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f530e;
                T.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f528b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f528b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0032e) this.f220b).t(true);
                return;
            case 3:
                M0.l lVar = (M0.l) this.f220b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f591m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f220b).d.requestLayout();
                return;
            case 5:
                int i = MainActivity.F;
                ((MainActivity) this.f220b).v();
                return;
            case 6:
                U.r rVar = (U.r) this.f220b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i2 = b2.f280e;
                            if (i2 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = G.h.f234a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                J0.e eVar3 = rVar.f868c;
                                Context context = rVar.f866a;
                                eVar3.getClass();
                                Typeface p2 = C.h.f116a.p(context, new H.k[]{b2}, 0);
                                MappedByteBuffer b02 = w1.d.b0(rVar.f866a, b2.f277a);
                                if (b02 == null || p2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(p2, w1.l.R(b02));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            w1.l lVar2 = rVar.h;
                                            if (lVar2 != null) {
                                                lVar2.K(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i4 = G.h.f234a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    w1.l lVar3 = rVar.h;
                                    if (lVar3 != null) {
                                        lVar3.H(th2);
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
                a.i iVar = (a.i) this.f220b;
                d1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1164b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1164b = null;
                    return;
                }
                return;
            case 8:
                a.m.a((a.m) this.f220b);
                return;
            case 9:
                A a2 = (A) this.f220b;
                d1.d.e(a2, "this$0");
                int i5 = a2.f1450b;
                t tVar = a2.f1453f;
                if (i5 == 0) {
                    a2.f1451c = true;
                    tVar.d(EnumC0071l.ON_PAUSE);
                }
                if (a2.f1449a == 0 && a2.f1451c) {
                    tVar.d(EnumC0071l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f220b).m();
                return;
            case 11:
                ((CarouselLayoutManager) this.f220b).n0();
                return;
            default:
                Activity activity = (Activity) this.f220b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0318b.f4318a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0318b.f4318a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0318b.f4322f;
                if ((!z2 || method != null) && (AbstractC0318b.f4321e != null || AbstractC0318b.d != null)) {
                    try {
                        Object obj2 = AbstractC0318b.f4320c.get(activity);
                        if (obj2 != null && (obj = AbstractC0318b.f4319b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0317a c0317a = new C0317a(activity);
                            application.registerActivityLifecycleCallbacks(c0317a);
                            Handler handler = AbstractC0318b.f4323g;
                            handler.post(new H.a(c0317a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0317a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0317a c0317a2 = c0317a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0317a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0317a;
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
