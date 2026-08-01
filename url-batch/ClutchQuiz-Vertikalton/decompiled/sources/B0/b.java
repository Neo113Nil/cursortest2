package B0;

import G.h;
import R0.k;
import T.t;
import T.w;
import a.i;
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
import androidx.lifecycle.C;
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.v;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0389b;
import z.C0388a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f82b;

    public /* synthetic */ b(int i, Object obj) {
        this.f81a = i;
        this.f82b = obj;
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
        switch (this.f81a) {
            case 0:
                ((CarouselLayoutManager) this.f82b).l0();
                return;
            case 1:
                View view = (View) this.f82b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                P0.e eVar = (P0.e) this.f82b;
                eVar.f606c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar.f607e;
                S.e eVar2 = sideSheetBehavior.i;
                if (eVar2 != null && eVar2.f()) {
                    eVar.a(eVar.f605b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar.f605b);
                        return;
                    }
                    return;
                }
            case 3:
                ((R0.e) this.f82b).t(true);
                return;
            case 4:
                k kVar = (k) this.f82b;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f677m = isPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f82b).d.requestLayout();
                return;
            case 6:
                t tVar = (t) this.f82b;
                synchronized (tVar.d) {
                    try {
                        if (tVar.h == null) {
                            return;
                        }
                        try {
                            H.k b2 = tVar.b();
                            int i = b2.f240e;
                            if (i == 2) {
                                synchronized (tVar.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = h.f211a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                O0.e eVar3 = tVar.f839c;
                                Context context = tVar.f837a;
                                eVar3.getClass();
                                Typeface w2 = C.h.f100a.w(context, new H.k[]{b2}, 0);
                                MappedByteBuffer l02 = A.c.l0(tVar.f837a, b2.f237a);
                                if (l02 == null || w2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    w wVar = new w(w2, T.d.J(l02));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (tVar.d) {
                                        try {
                                            T.d dVar = tVar.h;
                                            if (dVar != null) {
                                                dVar.E(wVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    tVar.a();
                                    return;
                                } finally {
                                    int i3 = h.f211a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (tVar.d) {
                                try {
                                    T.d dVar2 = tVar.h;
                                    if (dVar2 != null) {
                                        dVar2.B(th2);
                                    }
                                    tVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 7:
                i iVar = (i) this.f82b;
                g1.f.e(iVar, "this$0");
                Runnable runnable = iVar.f1188b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1188b = null;
                    return;
                }
                return;
            case 8:
                m.a((m) this.f82b);
                return;
            case 9:
                C c2 = (C) this.f82b;
                g1.f.e(c2, "this$0");
                int i4 = c2.f1473b;
                v vVar = c2.f1476f;
                if (i4 == 0) {
                    c2.f1474c = true;
                    vVar.d(EnumC0071l.ON_PAUSE);
                }
                if (c2.f1472a == 0 && c2.f1474c) {
                    vVar.d(EnumC0071l.ON_STOP);
                    c2.d = true;
                    return;
                }
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f82b).m();
                return;
            case 11:
                MainActivity mainActivity = (MainActivity) this.f82b;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) GameActivity.class));
                return;
            default:
                Activity activity = (Activity) this.f82b;
                if (activity.isFinishing()) {
                    return;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    Class cls = AbstractC0389b.f4024a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0389b.f4024a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i5 == 26 || i5 == 27;
                Method method = AbstractC0389b.f4028f;
                if ((!z2 || method != null) && (AbstractC0389b.f4027e != null || AbstractC0389b.d != null)) {
                    try {
                        Object obj2 = AbstractC0389b.f4026c.get(activity);
                        if (obj2 != null && (obj = AbstractC0389b.f4025b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0388a c0388a = new C0388a(activity);
                            application.registerActivityLifecycleCallbacks(c0388a);
                            Handler handler = AbstractC0389b.f4029g;
                            handler.post(new H.a(c0388a, 4, obj2));
                            if (i5 != 26 && i5 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0388a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0388a c0388a2 = c0388a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 5, c0388a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0388a;
                                    r7 = application;
                                    activity.recreate();
                                }
                                r4.post(new H.a((Object) r7, 5, (Object) r6));
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
