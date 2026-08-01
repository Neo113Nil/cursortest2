package A0;

import I.h;
import J.i;
import Q0.C0034e;
import Q0.l;
import V.s;
import V.v;
import a.AbstractC0058a;
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
import androidx.lifecycle.EnumC0077l;
import b.m;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.winpower.neonfit.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6b;

    public /* synthetic */ b(int i, Object obj) {
        this.f5a = i;
        this.f6b = obj;
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
        B.b bVar;
        switch (this.f5a) {
            case 0:
                ((CarouselLayoutManager) this.f6b).l0();
                return;
            case 1:
                Activity activity = (Activity) this.f6b;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class cls = B.c.f33a;
                    activity.recreate();
                    return;
                }
                Class cls2 = B.c.f33a;
                ?? r6 = 26;
                boolean z2 = i == 26 || i == 27;
                Method method = B.c.f37f;
                if ((!z2 || method != null) && (B.c.e != null || B.c.f36d != null)) {
                    try {
                        Object obj2 = B.c.f35c.get(activity);
                        if (obj2 != null && (obj = B.c.f34b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            B.b bVar2 = new B.b(activity);
                            application2.registerActivityLifecycleCallbacks(bVar2);
                            Handler handler = B.c.f38g;
                            handler.post(new B.a(bVar2, 0, obj2));
                            try {
                                if (i == 26 || i == 27) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r6 = handler;
                                        bVar = bVar2;
                                        application = application2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r6 = handler;
                                        bVar = bVar2;
                                        application = application2;
                                        r6.post(new B.a(application, bVar, 1, false));
                                        throw th;
                                    }
                                } else {
                                    r6 = handler;
                                    bVar = bVar2;
                                    application = application2;
                                    activity.recreate();
                                }
                                r6.post(new B.a(application, bVar, 1, false));
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
            case 2:
                View view = (View) this.f6b;
                ((InputMethodManager) C.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 3:
                O0.f fVar = (O0.f) this.f6b;
                fVar.f984c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) fVar.e;
                U.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.f()) {
                    fVar.a(fVar.f983b);
                    return;
                } else {
                    if (sideSheetBehavior.f2458h == 2) {
                        sideSheetBehavior.w(fVar.f983b);
                        return;
                    }
                    return;
                }
            case 4:
                ((C0034e) this.f6b).t(true);
                return;
            case 5:
                l lVar = (l) this.f6b;
                boolean isPopupShowing = lVar.f1026h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f1029m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f6b).f2514d.requestLayout();
                return;
            case 7:
                int i2 = MainActivity.f2602D;
                ((MainActivity) this.f6b).v();
                return;
            case 8:
                s sVar = (s) this.f6b;
                synchronized (sVar.f1298d) {
                    try {
                        if (sVar.f1301h == null) {
                            return;
                        }
                        try {
                            i b2 = sVar.b();
                            int i3 = b2.e;
                            if (i3 == 2) {
                                synchronized (sVar.f1298d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = h.f579a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                N0.e eVar2 = sVar.f1297c;
                                Context context = sVar.f1295a;
                                eVar2.getClass();
                                Typeface t2 = E.g.f286a.t(context, new i[]{b2}, 0);
                                MappedByteBuffer J2 = H1.l.J(sVar.f1295a, b2.f641a);
                                if (J2 == null || t2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    v vVar = new v(t2, H1.l.O(J2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (sVar.f1298d) {
                                        try {
                                            AbstractC0058a abstractC0058a = sVar.f1301h;
                                            if (abstractC0058a != null) {
                                                abstractC0058a.P(vVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                    int i5 = h.f579a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            synchronized (sVar.f1298d) {
                                try {
                                    AbstractC0058a abstractC0058a2 = sVar.f1301h;
                                    if (abstractC0058a2 != null) {
                                        abstractC0058a2.O(th4);
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
            case 9:
                C c2 = (C) this.f6b;
                j1.h.e(c2, "this$0");
                int i6 = c2.f1901b;
                androidx.lifecycle.v vVar2 = c2.f1904f;
                if (i6 == 0) {
                    c2.f1902c = true;
                    vVar2.d(EnumC0077l.ON_PAUSE);
                }
                if (c2.f1900a == 0 && c2.f1902c) {
                    vVar2.d(EnumC0077l.ON_STOP);
                    c2.f1903d = true;
                    return;
                }
                return;
            case 10:
                b.i iVar = (b.i) this.f6b;
                j1.h.e(iVar, "this$0");
                Runnable runnable = iVar.f2165b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f2165b = null;
                    return;
                }
                return;
            case 11:
                m.a((m) this.f6b);
                return;
            default:
                ((com.google.android.material.timepicker.e) this.f6b).m();
                return;
        }
    }
}
