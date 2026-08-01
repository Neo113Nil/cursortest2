package G0;

import P0.C0029e;
import T.r;
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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.t;
import com.glasspulse.glasspulse.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0329b;
import z.C0328a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f262b;

    public /* synthetic */ o(int i, Object obj) {
        this.f261a = i;
        this.f262b = obj;
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
        switch (this.f261a) {
            case 0:
                View view = (View) this.f262b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                N0.e eVar = (N0.e) this.f262b;
                eVar.f571c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f572e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f570b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f570b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0029e) this.f262b).t(true);
                return;
            case 3:
                P0.k kVar = (P0.k) this.f262b;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f615m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f262b).d.requestLayout();
                return;
            case 5:
                r rVar = (r) this.f262b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = rVar.b();
                            int i = b2.f294e;
                            if (i == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = G.h.f178a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                M0.e eVar3 = rVar.f810c;
                                Context context = rVar.f808a;
                                eVar3.getClass();
                                Typeface o2 = C.i.f151a.o(context, new H.k[]{b2}, 0);
                                MappedByteBuffer R2 = u1.d.R(rVar.f808a, b2.f291a);
                                if (R2 == null || o2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(o2, u1.l.c0(R2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            u1.l lVar = rVar.h;
                                            if (lVar != null) {
                                                lVar.Z(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i3 = G.h.f178a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    u1.l lVar2 = rVar.h;
                                    if (lVar2 != null) {
                                        lVar2.U(th2);
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
            case 6:
                a.i iVar = (a.i) this.f262b;
                b1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1121b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1121b = null;
                    return;
                }
                return;
            case 7:
                a.m.a((a.m) this.f262b);
                return;
            case 8:
                A a2 = (A) this.f262b;
                b1.d.e(a2, "this$0");
                int i4 = a2.f1408b;
                t tVar = a2.f1411f;
                if (i4 == 0) {
                    a2.f1409c = true;
                    tVar.d(EnumC0071l.ON_PAUSE);
                }
                if (a2.f1407a == 0 && a2.f1409c) {
                    tVar.d(EnumC0071l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 9:
                ((com.google.android.material.timepicker.e) this.f262b).m();
                return;
            case 10:
                int i5 = MainActivity.f1604E;
                ((MainActivity) this.f262b).v();
                return;
            case 11:
                Activity activity = (Activity) this.f262b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0329b.f4238a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0329b.f4238a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0329b.f4242f;
                if ((!z2 || method != null) && (AbstractC0329b.f4241e != null || AbstractC0329b.d != null)) {
                    try {
                        Object obj2 = AbstractC0329b.f4240c.get(activity);
                        if (obj2 != null && (obj = AbstractC0329b.f4239b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0328a c0328a = new C0328a(activity);
                            application.registerActivityLifecycleCallbacks(c0328a);
                            Handler handler = AbstractC0329b.f4243g;
                            handler.post(new H.a(c0328a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0328a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0328a c0328a2 = c0328a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0328a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0328a;
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
            default:
                ((CarouselLayoutManager) this.f262b).l0();
                return;
        }
    }
}
