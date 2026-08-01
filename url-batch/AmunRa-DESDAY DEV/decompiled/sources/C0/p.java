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
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.t;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.visualfortune.eyerest.EyeBreakCanvasView;
import com.visualfortune.eyerest.MainActivity;
import com.visualfortune.eyerest.SessionActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0337b;
import z.C0336a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159b;

    public /* synthetic */ p(int i, Object obj) {
        this.f158a = i;
        this.f159b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
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
        switch (this.f158a) {
            case 0:
                View view = (View) this.f159b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                J0.e eVar = (J0.e) this.f159b;
                eVar.f348c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f349e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f347b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f347b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0029e) this.f159b).t(true);
                return;
            case 3:
                L0.l lVar = (L0.l) this.f159b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f516m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f159b).d.requestLayout();
                return;
            case 5:
                int i = MainActivity.f1928E;
                ((MainActivity) this.f159b).v();
                return;
            case 6:
                int i2 = SessionActivity.f1937H;
                EyeBreakCanvasView eyeBreakCanvasView = ((SessionActivity) this.f159b).u().f654f;
                eyeBreakCanvasView.f1902c = true;
                eyeBreakCanvasView.d = 0L;
                eyeBreakCanvasView.f1904f = 0;
                eyeBreakCanvasView.d();
                Choreographer.getInstance().postFrameCallback(eyeBreakCanvasView);
                return;
            case 7:
                T.r rVar = (T.r) this.f159b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i3 = b2.f218e;
                            if (i3 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = G.h.f187a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                I0.e eVar3 = rVar.f785c;
                                Context context = rVar.f783a;
                                eVar3.getClass();
                                Typeface r2 = C.h.f65a.r(context, new H.k[]{b2}, 0);
                                MappedByteBuffer N2 = s1.l.N(rVar.f783a, b2.f215a);
                                if (N2 == null || r2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(r2, s1.d.b0(N2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            s1.d dVar = rVar.h;
                                            if (dVar != null) {
                                                dVar.U(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i5 = G.h.f187a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    s1.d dVar2 = rVar.h;
                                    if (dVar2 != null) {
                                        dVar2.T(th2);
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
                a.i iVar = (a.i) this.f159b;
                Z0.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1082b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1082b = null;
                    return;
                }
                return;
            case 9:
                a.m.a((a.m) this.f159b);
                return;
            case 10:
                A a2 = (A) this.f159b;
                Z0.d.e(a2, "this$0");
                int i6 = a2.f1366b;
                t tVar = a2.f1369f;
                if (i6 == 0) {
                    a2.f1367c = true;
                    tVar.d(EnumC0070l.ON_PAUSE);
                }
                if (a2.f1365a == 0 && a2.f1367c) {
                    tVar.d(EnumC0070l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.f159b).m();
                return;
            case 12:
                ((CarouselLayoutManager) this.f159b).l0();
                return;
            default:
                Activity activity = (Activity) this.f159b;
                if (activity.isFinishing()) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28) {
                    Class cls = AbstractC0337b.f4283a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0337b.f4283a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i7 == 26 || i7 == 27;
                Method method = AbstractC0337b.f4287f;
                if ((!z2 || method != null) && (AbstractC0337b.f4286e != null || AbstractC0337b.d != null)) {
                    try {
                        Object obj2 = AbstractC0337b.f4285c.get(activity);
                        if (obj2 != null && (obj = AbstractC0337b.f4284b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0336a c0336a = new C0336a(activity);
                            application.registerActivityLifecycleCallbacks(c0336a);
                            Handler handler = AbstractC0337b.f4288g;
                            handler.post(new H.a(c0336a, 3, obj2));
                            if (i7 != 26 && i7 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0336a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0336a c0336a2 = c0336a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0336a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0336a;
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
