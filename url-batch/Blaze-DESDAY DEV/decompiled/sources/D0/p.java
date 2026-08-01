package D0;

import M0.C0032e;
import U.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.winworm.neongrid.MainActivity;
import com.winworm.neongrid.game.SnakeGameView;
import com.winworm.neongrid.ui.GameActivity;
import com.winworm.neongrid.ui.ResultActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.NoSuchElementException;
import z.AbstractC0322b;
import z.C0321a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182b;

    public /* synthetic */ p(int i, Object obj) {
        this.f181a = i;
        this.f182b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // java.lang.Runnable
    public final void run() {
        S0.c cVar;
        S0.c cVar2;
        S0.e eVar;
        S0.i b2;
        int i;
        Object obj;
        C0321a c0321a = null;
        ?? r5 = 1;
        r5 = 1;
        switch (this.f181a) {
            case 0:
                View view = (View) this.f182b;
                ((InputMethodManager) A.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                K0.e eVar2 = (K0.e) this.f182b;
                eVar2.f546c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) eVar2.f547e;
                T.e eVar3 = sideSheetBehavior.i;
                if (eVar3 != null && eVar3.f()) {
                    eVar2.a(eVar2.f545b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(eVar2.f545b);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0032e) this.f182b).t(true);
                return;
            case 3:
                M0.l lVar = (M0.l) this.f182b;
                boolean isPopupShowing = lVar.h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f608m = isPopupShowing;
                return;
            case 4:
                ((TextInputLayout) this.f182b).d.requestLayout();
                return;
            case 5:
                int i2 = MainActivity.F;
                ((MainActivity) this.f182b).v();
                return;
            case 6:
                SnakeGameView snakeGameView = (SnakeGameView) this.f182b;
                S0.f fVar = snakeGameView.i;
                if (fVar != null && snakeGameView.f2041o && (cVar = fVar.f784k) == (cVar2 = S0.c.f768a)) {
                    if (cVar != cVar2) {
                        b2 = S0.i.f786a;
                    } else {
                        fVar.f780e = fVar.f781f;
                        V0.e eVar4 = fVar.d;
                        if (eVar4.isEmpty()) {
                            throw new NoSuchElementException("ArrayDeque is empty.");
                        }
                        S0.e eVar5 = (S0.e) eVar4.f912b[eVar4.f911a];
                        int ordinal = fVar.f780e.ordinal();
                        if (ordinal == 0) {
                            eVar = new S0.e(eVar5.f775a, eVar5.f776b - 1);
                        } else if (ordinal == 1) {
                            eVar = new S0.e(eVar5.f775a, eVar5.f776b + 1);
                        } else if (ordinal == 2) {
                            eVar = new S0.e(eVar5.f775a - 1, eVar5.f776b);
                        } else {
                            if (ordinal != 3) {
                                throw new U0.b();
                            }
                            eVar = new S0.e(eVar5.f775a + 1, eVar5.f776b);
                        }
                        int i3 = eVar.f775a;
                        if (i3 < 0 || i3 >= fVar.f778b || (i = eVar.f776b) < 0 || i >= fVar.f779c) {
                            b2 = fVar.b();
                        } else {
                            List<S0.e> D02 = eVar.equals(fVar.f782g) ? V0.g.D0(eVar4) : V0.g.z0(eVar4);
                            if (!D02.isEmpty()) {
                                for (S0.e eVar6 : D02) {
                                    if (eVar6.f775a == i3 && eVar6.f776b == i) {
                                        b2 = fVar.b();
                                    }
                                }
                            }
                            eVar4.addFirst(eVar);
                            if (eVar.equals(fVar.f782g)) {
                                int i4 = fVar.i + 1;
                                fVar.i = i4;
                                fVar.h += 10;
                                if (i4 >= fVar.f777a.f774c) {
                                    fVar.f784k = S0.c.d;
                                    b2 = S0.i.f790f;
                                } else {
                                    fVar.e();
                                    b2 = S0.i.f788c;
                                }
                            } else {
                                eVar4.removeLast();
                                b2 = S0.i.f787b;
                            }
                        }
                    }
                    int ordinal2 = b2.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            snakeGameView.d();
                            snakeGameView.invalidate();
                            snakeGameView.f();
                            return;
                        }
                        if (ordinal2 == 2) {
                            S0.g gVar = snakeGameView.f2036j;
                            if (gVar != null) {
                                Q0.a aVar = (Q0.a) ((GameActivity) gVar).f2050z.a();
                                int i5 = aVar.f734a.getInt("total_crystals", 0) + 1;
                                SharedPreferences sharedPreferences = aVar.f734a;
                                g1.d.d(sharedPreferences, "prefs");
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putInt("total_crystals", i5);
                                edit.apply();
                            }
                            snakeGameView.d();
                            snakeGameView.invalidate();
                            snakeGameView.f();
                            return;
                        }
                        if (ordinal2 == 3) {
                            S0.g gVar2 = snakeGameView.f2036j;
                            if (gVar2 != null) {
                                GameActivity gameActivity = (GameActivity) gVar2;
                                gameActivity.v(gameActivity.f2048E, gameActivity.F, fVar.f783j);
                            }
                            snakeGameView.d();
                            snakeGameView.invalidate();
                            snakeGameView.f();
                            return;
                        }
                        if (ordinal2 == 4) {
                            snakeGameView.f2041o = false;
                            snakeGameView.d();
                            snakeGameView.invalidate();
                            S0.g gVar3 = snakeGameView.f2036j;
                            if (gVar3 != null) {
                                int i6 = fVar.h;
                                GameActivity gameActivity2 = (GameActivity) gVar3;
                                gameActivity2.f2047D = true;
                                Q0.a aVar2 = (Q0.a) gameActivity2.f2050z.a();
                                int i7 = gameActivity2.f2044A;
                                aVar2.getClass();
                                String str = "high_score_level_" + i7;
                                SharedPreferences sharedPreferences2 = aVar2.f734a;
                                if (i6 > sharedPreferences2.getInt(str, 0)) {
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putInt("high_score_level_" + i7, i6);
                                    edit2.apply();
                                }
                                Intent putExtra = new Intent(gameActivity2, (Class<?>) ResultActivity.class).putExtra("extra_level", gameActivity2.f2044A).putExtra("extra_score", i6).putExtra("extra_food", gameActivity2.F).putExtra("extra_victory", false);
                                g1.d.d(putExtra, "putExtra(...)");
                                gameActivity2.startActivity(putExtra);
                                gameActivity2.finish();
                                return;
                            }
                            return;
                        }
                        if (ordinal2 != 5) {
                            throw new U0.b();
                        }
                        snakeGameView.f2041o = false;
                        snakeGameView.d();
                        snakeGameView.invalidate();
                        S0.g gVar4 = snakeGameView.f2036j;
                        if (gVar4 != null) {
                            int i8 = fVar.h;
                            GameActivity gameActivity3 = (GameActivity) gVar4;
                            gameActivity3.f2047D = true;
                            U0.e eVar7 = gameActivity3.f2050z;
                            Q0.a aVar3 = (Q0.a) eVar7.a();
                            int i9 = gameActivity3.f2044A;
                            aVar3.getClass();
                            String str2 = "high_score_level_" + i9;
                            SharedPreferences sharedPreferences3 = aVar3.f734a;
                            if (i8 > sharedPreferences3.getInt(str2, 0)) {
                                SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                edit3.putInt("high_score_level_" + i9, i8);
                                edit3.apply();
                            }
                            Q0.a aVar4 = (Q0.a) eVar7.a();
                            int i10 = gameActivity3.f2044A;
                            int i11 = i10 + 1;
                            if (i11 > i0.g.e(aVar4.f734a.getInt("max_unlocked_level", 1), 1, 12) && i10 < 12) {
                                SharedPreferences sharedPreferences4 = aVar4.f734a;
                                g1.d.d(sharedPreferences4, "prefs");
                                SharedPreferences.Editor edit4 = sharedPreferences4.edit();
                                edit4.putInt("max_unlocked_level", i11);
                                edit4.apply();
                            }
                            Intent putExtra2 = new Intent(gameActivity3, (Class<?>) ResultActivity.class).putExtra("extra_level", gameActivity3.f2044A).putExtra("extra_score", i8).putExtra("extra_food", gameActivity3.f2045B).putExtra("extra_victory", true);
                            g1.d.d(putExtra2, "putExtra(...)");
                            gameActivity3.startActivity(putExtra2);
                            gameActivity3.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                U.r rVar = (U.r) this.f182b;
                synchronized (rVar.d) {
                    try {
                        if (rVar.h == null) {
                            return;
                        }
                        try {
                            H.k b3 = rVar.b();
                            int i12 = b3.f297e;
                            if (i12 == 2) {
                                synchronized (rVar.d) {
                                }
                            }
                            if (i12 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i12 + ")");
                            }
                            try {
                                int i13 = G.h.f251a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                J0.e eVar8 = rVar.f877c;
                                Context context = rVar.f875a;
                                eVar8.getClass();
                                Typeface z2 = C.h.f81a.z(context, new H.k[]{b3}, 0);
                                MappedByteBuffer H2 = z1.l.H(rVar.f875a, b3.f294a);
                                if (H2 == null || z2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    u uVar = new u(z2, z1.l.Q(H2));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (rVar.d) {
                                        try {
                                            z1.l lVar2 = rVar.h;
                                            if (lVar2 != null) {
                                                lVar2.J(uVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                    int i14 = G.h.f251a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.d) {
                                try {
                                    z1.l lVar3 = rVar.h;
                                    if (lVar3 != null) {
                                        lVar3.I(th2);
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
                a.i iVar = (a.i) this.f182b;
                g1.d.e(iVar, "this$0");
                Runnable runnable = iVar.f1194b;
                if (runnable != null) {
                    runnable.run();
                    iVar.f1194b = null;
                    return;
                }
                return;
            case 9:
                a.m.a((a.m) this.f182b);
                return;
            case 10:
                A a2 = (A) this.f182b;
                g1.d.e(a2, "this$0");
                int i15 = a2.f1481b;
                t tVar = a2.f1484f;
                if (i15 == 0) {
                    a2.f1482c = true;
                    tVar.d(EnumC0072l.ON_PAUSE);
                }
                if (a2.f1480a == 0 && a2.f1482c) {
                    tVar.d(EnumC0072l.ON_STOP);
                    a2.d = true;
                    return;
                }
                return;
            case 11:
                ((com.google.android.material.timepicker.e) this.f182b).m();
                return;
            case 12:
                ((CarouselLayoutManager) this.f182b).n0();
                return;
            default:
                Activity activity = (Activity) this.f182b;
                if (activity.isFinishing()) {
                    return;
                }
                ?? r6 = Build.VERSION.SDK_INT;
                if (r6 >= 28) {
                    Class cls = AbstractC0322b.f4337a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0322b.f4337a;
                boolean z3 = r6 == 26 || r6 == 27;
                Method method = AbstractC0322b.f4341f;
                if ((!z3 || method != null) && (AbstractC0322b.f4340e != null || AbstractC0322b.d != null)) {
                    try {
                        Object obj2 = AbstractC0322b.f4339c.get(activity);
                        if (obj2 != null && (obj = AbstractC0322b.f4338b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0321a c0321a2 = new C0321a(activity);
                            application.registerActivityLifecycleCallbacks(c0321a2);
                            Handler handler = AbstractC0322b.f4342g;
                            handler.post(new H.a(c0321a2, 3, obj2));
                            if (r6 != 26 && r6 != 27) {
                                r5 = 0;
                            }
                            try {
                                if (r5 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r5 = handler;
                                        c0321a = c0321a2;
                                        r6 = application;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Handler handler2 = handler;
                                        c0321a = c0321a2;
                                        Application application2 = application;
                                        handler2.post(new H.a(application2, 4, c0321a));
                                        throw th;
                                    }
                                } else {
                                    r5 = handler;
                                    c0321a = c0321a2;
                                    r6 = application;
                                    activity.recreate();
                                }
                                r5.post(new H.a((Object) r6, 4, c0321a));
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
