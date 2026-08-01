package E0;

import C0.j;
import G.h;
import H1.l;
import T0.m;
import U.s;
import U0.k;
import a.i;
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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.v;
import com.fortunequest.neontrack.MainActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import z.AbstractC0399b;
import z.C0398a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f219b;

    public /* synthetic */ b(int i, Object obj) {
        this.f218a = i;
        this.f219b = obj;
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
        switch (this.f218a) {
            case 0:
                ((CarouselLayoutManager) this.f219b).n0();
                return;
            case 1:
                View view = (View) this.f219b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                j jVar = (j) this.f219b;
                jVar.f106c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) jVar.f107e;
                T.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.f()) {
                    jVar.a(jVar.f105b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(jVar.f105b);
                        return;
                    }
                    return;
                }
            case 3:
                s sVar = (s) this.f219b;
                synchronized (sVar.d) {
                    try {
                        if (sVar.h == null) {
                            return;
                        }
                        try {
                            H.j b2 = sVar.b();
                            int i = b2.f500e;
                            if (i == 2) {
                                synchronized (sVar.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = h.f291a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                R0.e eVar2 = sVar.f1112c;
                                Context context = sVar.f1110a;
                                eVar2.getClass();
                                Typeface s2 = C.h.f74a.s(context, new H.j[]{b2}, 0);
                                MappedByteBuffer U2 = l.U(sVar.f1110a, b2.f497a);
                                if (U2 == null || s2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    m mVar = new m(s2, H1.d.b0(U2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (sVar.d) {
                                        try {
                                            H1.d dVar = sVar.h;
                                            if (dVar != null) {
                                                dVar.V(mVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    sVar.a();
                                    return;
                                } finally {
                                    int i3 = h.f291a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (sVar.d) {
                                try {
                                    H1.d dVar2 = sVar.h;
                                    if (dVar2 != null) {
                                        dVar2.S(th2);
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
            case 4:
                ((U0.e) this.f219b).t(true);
                return;
            case 5:
                k kVar = (k) this.f219b;
                boolean isPopupShowing = kVar.h.isPopupShowing();
                kVar.t(isPopupShowing);
                kVar.f1157m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f219b).d.requestLayout();
                return;
            case 7:
                i iVar = (i) this.f219b;
                k1.e.e(iVar, "this$0");
                Runnable runnable = iVar.f1568b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1568b = null;
                    return;
                }
                return;
            case 8:
                a.m.a((a.m) this.f219b);
                return;
            case 9:
                C c2 = (C) this.f219b;
                k1.e.e(c2, "this$0");
                int i4 = c2.f1854b;
                v vVar = c2.f1857f;
                if (i4 == 0) {
                    c2.f1855c = true;
                    vVar.d(EnumC0071l.ON_PAUSE);
                }
                if (c2.f1853a == 0 && c2.f1855c) {
                    vVar.d(EnumC0071l.ON_STOP);
                    c2.d = true;
                    return;
                }
                return;
            case 10:
                ((com.google.android.material.timepicker.e) this.f219b).m();
                return;
            case 11:
                int i5 = MainActivity.f2083E;
                ((MainActivity) this.f219b).v();
                return;
            default:
                Activity activity = (Activity) this.f219b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC0399b.f4616a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0399b.f4616a;
                ?? r6 = 27;
                ?? r7 = 26;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC0399b.f4620f;
                if ((!z2 || method != null) && (AbstractC0399b.f4619e != null || AbstractC0399b.d != null)) {
                    try {
                        Object obj2 = AbstractC0399b.f4618c.get(activity);
                        if (obj2 != null && (obj = AbstractC0399b.f4617b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0398a c0398a = new C0398a(activity);
                            application.registerActivityLifecycleCallbacks(c0398a);
                            Handler handler = AbstractC0399b.f4621g;
                            handler.post(new H.a(c0398a, 3, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r4 = 0;
                            }
                            try {
                                if (r4 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r4 = handler;
                                        r6 = c0398a;
                                        r7 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        C0398a c0398a2 = c0398a;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0398a2));
                                        throw th;
                                    }
                                } else {
                                    r4 = handler;
                                    r6 = c0398a;
                                    r7 = application;
                                    activity.recreate();
                                }
                                r4.post(new H.a(r7, 4, r6));
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
