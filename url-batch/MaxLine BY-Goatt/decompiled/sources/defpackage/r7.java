package defpackage;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r7 implements Runnable {
    public final /* synthetic */ int m;
    public final Object n;

    public r7(x93 x93Var, r5 r5Var) {
        this.m = 14;
        this.n = r5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0208, code lost:
    
        if (r0.d0() >= 242600) goto L38;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        DialogInterface.OnDismissListener onDismissListener;
        Dialog dialog;
        it2 c;
        long j;
        e3 e3Var;
        int i = 2;
        int i2 = 3;
        int i3 = 1;
        switch (this.m) {
            case 0:
                t7 t7Var = (t7) this.n;
                t7Var.removeCallbacks(this);
                MotionEvent motionEvent = t7Var.D0;
                if (motionEvent != null) {
                    r9 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r9 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    t7Var.I(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, t7Var.E0, false);
                    return;
                }
                return;
            case 1:
                af1 af1Var = (af1) this.n;
                ne0 ne0Var = af1Var.o;
                pl plVar = af1Var.m;
                if (af1Var.A) {
                    if (af1Var.y) {
                        af1Var.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        plVar.e = currentAnimationTimeMillis;
                        plVar.g = -1L;
                        plVar.f = currentAnimationTimeMillis;
                        plVar.h = 0.5f;
                    }
                    if ((plVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > plVar.g + plVar.i) || !af1Var.e()) {
                        af1Var.A = false;
                        return;
                    }
                    if (af1Var.z) {
                        af1Var.z = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        ne0Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (plVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = plVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - plVar.f;
                    plVar.f = currentAnimationTimeMillis2;
                    af1Var.C.scrollListBy((int) (j2 * ((a * 4.0f) + ((-4.0f) * a * a)) * plVar.d));
                    WeakHashMap weakHashMap = e53.a;
                    ne0Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                y80 y80Var = (y80) this.n;
                y80Var.b.endViewTransition(y80Var.c);
                y80Var.d.d();
                return;
            case 3:
                qs0.a(4, (ArrayList) this.n);
                return;
            case 4:
                ta0 ta0Var = (ta0) this.n;
                onDismissListener = ta0Var.mOnDismissListener;
                dialog = ta0Var.mDialog;
                onDismissListener.onDismiss(dialog);
                return;
            case 5:
                ne0 ne0Var2 = (ne0) this.n;
                ne0Var2.x = null;
                ne0Var2.drawableStateChanged();
                return;
            case 6:
                ((d90) this.n).d();
                return;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((as0) this.n).x(true);
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.n;
                if (searchView$SearchAutoComplete.r) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.r = false;
                    return;
                }
                return;
            case 9:
                break;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) this.n).m;
                if (actionMenuView == null || (e3Var = actionMenuView.F) == null) {
                    return;
                }
                e3Var.l();
                return;
            case 11:
                ((aa3) this.n).h();
                return;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ce ceVar = ((aa3) ((ot2) this.n).n).h;
                ceVar.c(ceVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((ja3) this.n).n.a(new c10(4));
                return;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                throw null;
            case 15:
                i63 i63Var = (i63) this.n;
                synchronized (i63Var.a) {
                    try {
                        if (i63Var.b()) {
                            Log.e("WakeLock", String.valueOf(i63Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            i63Var.d();
                            if (i63Var.b()) {
                                i63Var.c = 1;
                                i63Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                if (((kt2) this.n).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                synchronized (((ei3) this.n).o) {
                    ((tu1) ((ei3) this.n).p).b();
                }
                return;
            case 18:
                ((hi3) this.n).a.N();
                return;
            case 19:
                jo3 jo3Var = ((eo3) this.n).o;
                jo3Var.H(new ComponentName(((pj3) jo3Var.m).m, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 20:
                jo3 jo3Var2 = ((eo3) ((pn3) this.n).o).o;
                lj3 lj3Var = ((pj3) jo3Var2.m).s;
                pj3.m(lj3Var);
                lj3Var.F(new do3(jo3Var2, r9));
                return;
            case 21:
                xo3 xo3Var = (xo3) this.n;
                ep3 ep3Var = (ep3) xo3Var.o.o;
                ep3Var.v();
                pj3 pj3Var = (pj3) ep3Var.m;
                vh3 vh3Var = pj3Var.r;
                Context context = pj3Var.m;
                pj3.m(vh3Var);
                vh3Var.y.b("Application going to the background");
                qi3 qi3Var = pj3Var.q;
                pj3.k(qi3Var);
                qi3Var.E.b(true);
                ep3Var.v();
                ep3Var.p = true;
                ec3 ec3Var = pj3Var.p;
                if (!ec3Var.K()) {
                    long j3 = xo3Var.n;
                    o42 o42Var = ep3Var.r;
                    o42Var.b(false, false, j3);
                    ((zo3) o42Var.c).c();
                }
                long j4 = xo3Var.m;
                pj3.m(vh3Var);
                vh3Var.x.c(Long.valueOf(j4), "Application backgrounded at: timestamp_millis");
                jm3 jm3Var = pj3Var.y;
                pj3.l(jm3Var);
                jm3Var.v();
                pj3 pj3Var2 = (pj3) jm3Var.m;
                jm3Var.x();
                jo3 p = pj3Var2.p();
                p.v();
                p.x();
                if (p.D()) {
                    zq3 zq3Var = ((pj3) p.m).u;
                    pj3.k(zq3Var);
                    break;
                }
                jo3 p2 = pj3Var2.p();
                p2.v();
                p2.x();
                p2.K(new ln3(p2, p2.M(true), i));
                if (ec3Var.G(null, ug3.N0)) {
                    zq3 zq3Var2 = pj3Var.u;
                    pj3.k(zq3Var2);
                    long D = zq3Var2.X(context.getPackageName(), ec3Var.o) ? 1000L : ec3Var.D(context.getPackageName(), ug3.E);
                    pj3.m(vh3Var);
                    vh3Var.z.c(Long.valueOf(D), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    pj3.j(pj3Var.G);
                    pj3Var.G.A(D);
                    return;
                }
                return;
            case 22:
                oq3 oq3Var = (oq3) this.n;
                oq3Var.c().v();
                oq3Var.w = new ti3(oq3Var);
                tc3 tc3Var = new tc3(oq3Var);
                tc3Var.y();
                oq3Var.o = tc3Var;
                dj3 dj3Var = oq3Var.m;
                ec3 e0 = oq3Var.e0();
                ll3.v(dj3Var);
                e0.p = dj3Var;
                lo3 lo3Var = new lo3(oq3Var);
                lo3Var.y();
                oq3Var.u = lo3Var;
                nb3 nb3Var = new nb3(oq3Var);
                nb3Var.y();
                oq3Var.r = nb3Var;
                bi3 bi3Var = new bi3(oq3Var, i3);
                bi3Var.y();
                oq3Var.t = bi3Var;
                kp3 kp3Var = new kp3(oq3Var);
                kp3Var.y();
                oq3Var.q = kp3Var;
                oq3Var.p = new hi3(oq3Var);
                if (oq3Var.D != oq3Var.E) {
                    oq3Var.a().r.d(Integer.valueOf(oq3Var.D), Integer.valueOf(oq3Var.E), "Not all upload components initialized");
                }
                oq3Var.y.set(true);
                oq3Var.a().z.b("UploadController is now fully initialized");
                oq3Var.c().v();
                tc3 tc3Var2 = oq3Var.o;
                oq3.U(tc3Var2);
                tc3Var2.G();
                tc3 tc3Var3 = oq3Var.o;
                oq3.U(tc3Var3);
                tc3Var3.v();
                tc3Var3.x();
                if (tc3Var3.d0()) {
                    tg3 tg3Var = ug3.v0;
                    if (((Long) tg3Var.a(null)).longValue() != 0) {
                        SQLiteDatabase l0 = tc3Var3.l0();
                        pj3 pj3Var3 = (pj3) tc3Var3.m;
                        pj3Var3.w.getClass();
                        int delete = l0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(tg3Var.a(null))});
                        if (delete > 0) {
                            vh3 vh3Var2 = pj3Var3.r;
                            pj3.m(vh3Var2);
                            vh3Var2.z.c(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (oq3Var.u.t.a() == 0) {
                    li3 li3Var = oq3Var.u.t;
                    oq3Var.e().getClass();
                    li3Var.b(System.currentTimeMillis());
                }
                oq3Var.N();
                return;
            case 23:
                pj3 pj3Var4 = (pj3) ((nf) this.n).b;
                pj3.j(pj3Var4.G);
                pj3Var4.G.A(((Long) ug3.D.a(null)).longValue());
                return;
            default:
                pj3 pj3Var5 = (pj3) this.n;
                zq3 zq3Var3 = pj3Var5.u;
                jm3 jm3Var2 = pj3Var5.y;
                pj3.k(zq3Var3);
                zq3Var3.v();
                if (zq3Var3.S() != 1) {
                    vh3 vh3Var3 = pj3Var5.r;
                    pj3.m(vh3Var3);
                    vh3Var3.u.b("registerTrigger called but app not eligible");
                    return;
                }
                pj3.l(jm3Var2);
                jm3Var2.v();
                hl3 hl3Var = jm3Var2.x;
                if (hl3Var != null) {
                    hl3Var.c();
                }
                pj3.l(jm3Var2);
                new Thread(new fl3(jm3Var2, i2)).start();
                return;
        }
        while (true) {
            pt2 pt2Var = (pt2) this.n;
            synchronized (pt2Var) {
                c = pt2Var.c();
            }
            if (c == null) {
                return;
            }
            nt2 nt2Var = c.c;
            nt2Var.getClass();
            pt2 pt2Var2 = (pt2) this.n;
            boolean isLoggable = pt2.i.isLoggable(Level.FINE);
            if (isLoggable) {
                j = System.nanoTime();
                ci2.b(c, nt2Var, "starting");
            } else {
                j = -1;
            }
            try {
                try {
                    pt2.a(pt2Var2, c);
                    Unit unit = Unit.a;
                    if (isLoggable) {
                        ci2.b(c, nt2Var, "finished run in ".concat(ci2.c(System.nanoTime() - j)));
                    }
                } catch (Throwable th) {
                    ((ThreadPoolExecutor) pt2Var2.a.n).execute(this);
                    throw th;
                }
            } catch (Throwable th2) {
                if (isLoggable) {
                    ci2.b(c, nt2Var, "failed a run in ".concat(ci2.c(System.nanoTime() - j)));
                }
                throw th2;
            }
        }
    }

    public /* synthetic */ r7(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    public r7(hi3 hi3Var, boolean z) {
        this.m = 18;
        this.n = hi3Var;
    }

    public r7(oq3 oq3Var, u9 u9Var) {
        this.m = 22;
        this.n = oq3Var;
    }
}
