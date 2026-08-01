package b7;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Objects;
import s7.b1;
import s7.d1;
import s7.f1;
import s7.f2;
import s7.g2;
import s7.g3;
import s7.h1;
import s7.j3;
import s7.j4;
import s7.k1;
import s7.k3;
import s7.l3;
import s7.n3;
import s7.o1;
import s7.p4;
import s7.q1;
import s7.q2;
import s7.q3;
import s7.s3;
import s7.t3;
import s7.y3;
import s7.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1304e;

    public k(q0 q0Var) {
        this.f1303d = 3;
        Objects.requireNonNull(q0Var);
        this.f1304e = q0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0326, code lost:
    
        if (r0.d0() >= 242600) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int actionMasked;
        m.j jVar;
        int i3 = 2;
        int i10 = 1;
        int i11 = 0;
        switch (this.f1303d) {
            case 0:
                s sVar = (s) this.f1304e;
                z6.g gVar = sVar.f1347r;
                Context context = sVar.f1346i;
                gVar.getClass();
                if (z6.i.f10883a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e2) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e2);
                    return;
                }
            case 1:
                ((b0) this.f1304e).a();
                return;
            case 2:
                b0 b0Var = (b0) ((d9.c) this.f1304e).f3701e;
                b0Var.f1242e.e(b0Var.f1242e.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((q0) this.f1304e).f1338k.b(new z6.b(4, null, null));
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                d2.v vVar = (d2.v) this.f1304e;
                vVar.removeCallbacks(this);
                MotionEvent motionEvent = vVar.I0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                vVar.J(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, vVar.J0, false);
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                ((f4.e) this.f1304e).f4075z.onDismiss(null);
                return;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                f4.f fVar = (f4.f) this.f1304e;
                if (fVar.f4081s != null) {
                    if (fVar.f4081s == null) {
                        a1.n nVar = new a1.n(15, (boolean) (null == true ? 1 : 0));
                        Object obj = f4.f.f4076y;
                        nVar.f41i = obj;
                        nVar.f40e = obj;
                        nVar.f42r = obj;
                        fVar.f4081s = nVar;
                    }
                    fVar.f4081s.getClass();
                    return;
                }
                return;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((f4.j) this.f1304e).i();
                throw null;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                m.q0 q0Var = (m.q0) this.f1304e;
                q0Var.f6170z = null;
                q0Var.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f1304e;
                if (searchView$SearchAutoComplete.f439t) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f439t = false;
                    return;
                }
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) this.f1304e).f444d;
                if (actionMenuView == null || (jVar = actionMenuView.G) == null) {
                    return;
                }
                jVar.j();
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                s7.m mVar = (s7.m) this.f1304e;
                try {
                    SQLiteDatabase j02 = mVar.j0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    j02.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e9) {
                    s7.v0 v0Var = ((q1) mVar.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.b(e9, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 12:
                ((b1) this.f1304e).f8513a.N();
                return;
            case 13:
                l3 l3Var = ((k3) this.f1304e).f8796c;
                l3Var.D(new ComponentName(((q1) l3Var.f1478d).f8932d, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 14:
                l3 l3Var2 = ((k3) ((f8.j0) this.f1304e).f4154i).f8796c;
                o1 o1Var = ((q1) l3Var2.f1478d).f8938u;
                q1.l(o1Var);
                o1Var.B(new j3(l3Var2, i11));
                return;
            case 15:
                q3 q3Var = (q3) this.f1304e;
                t3 t3Var = (t3) q3Var.f8956i.f1830i;
                t3Var.s();
                q1 q1Var = (q1) t3Var.f1478d;
                s7.v0 v0Var2 = q1Var.f8937t;
                Context context2 = q1Var.f8932d;
                q1.l(v0Var2);
                v0Var2.A.a("Application going to the background");
                f1 f1Var = q1Var.f8936s;
                q1.j(f1Var);
                f1Var.G.b(true);
                t3Var.s();
                t3Var.f9027r = true;
                s7.g gVar2 = q1Var.f8935r;
                if (!gVar2.H()) {
                    long j = q3Var.f8955e;
                    s3 s3Var = t3Var.f9029t;
                    s3Var.a(false, false, j);
                    s3Var.f9001c.c();
                }
                long j3 = q3Var.f8954d;
                q1.l(v0Var2);
                v0Var2.f9056z.b(Long.valueOf(j3), "Application backgrounded at: timestamp_millis");
                q2 q2Var = q1Var.A;
                q1.k(q2Var);
                q2Var.s();
                q1 q1Var2 = (q1) q2Var.f1478d;
                q2Var.t();
                l3 o6 = q1Var2.o();
                o6.s();
                o6.t();
                if (o6.z()) {
                    p4 p4Var = ((q1) o6.f1478d).f8940w;
                    q1.j(p4Var);
                    break;
                }
                l3 o10 = q1Var2.o();
                o10.s();
                o10.t();
                o10.G(new g3(o10, o10.I(true), i3));
                if (gVar2.D(null, s7.e0.N0)) {
                    p4 p4Var2 = q1Var.f8940w;
                    q1.j(p4Var2);
                    long A = p4Var2.X(context2.getPackageName(), gVar2.f8700i) ? 1000L : gVar2.A(context2.getPackageName(), s7.e0.E);
                    q1.l(v0Var2);
                    v0Var2.B.b(Long.valueOf(A), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    q1.i(q1Var.I);
                    q1Var.I.w(A);
                    return;
                }
                return;
            case 16:
                j4 j4Var = (j4) this.f1304e;
                j4Var.d().s();
                j4Var.f8770y = new h1(j4Var);
                s7.m mVar2 = new s7.m(j4Var);
                mVar2.u();
                j4Var.f8762i = mVar2;
                k1 k1Var = j4Var.f8760d;
                s7.g e02 = j4Var.e0();
                c7.c0.g(k1Var);
                e02.f8701r = k1Var;
                n3 n3Var = new n3(j4Var);
                n3Var.u();
                j4Var.f8768w = n3Var;
                s7.c cVar = new s7.c(j4Var);
                cVar.u();
                j4Var.f8765t = cVar;
                z0 z0Var = new z0(j4Var, i10);
                z0Var.u();
                j4Var.f8767v = z0Var;
                y3 y3Var = new y3(j4Var);
                y3Var.u();
                j4Var.f8764s = y3Var;
                j4Var.f8763r = new b1(j4Var);
                if (j4Var.F != j4Var.G) {
                    j4Var.b().f9050t.c(Integer.valueOf(j4Var.F), Integer.valueOf(j4Var.G), "Not all upload components initialized");
                }
                j4Var.A.set(true);
                j4Var.b().B.a("UploadController is now fully initialized");
                j4Var.d().s();
                s7.m mVar3 = j4Var.f8762i;
                j4.T(mVar3);
                mVar3.C();
                s7.m mVar4 = j4Var.f8762i;
                j4.T(mVar4);
                mVar4.s();
                mVar4.t();
                if (mVar4.d0()) {
                    s7.d0 d0Var = s7.e0.f8653u0;
                    if (((Long) d0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase j03 = mVar4.j0();
                        q1 q1Var3 = (q1) mVar4.f1478d;
                        q1Var3.f8942y.getClass();
                        int delete = j03.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(d0Var.a(null))});
                        if (delete > 0) {
                            s7.v0 v0Var3 = q1Var3.f8937t;
                            q1.l(v0Var3);
                            v0Var3.B.b(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (j4Var.f8768w.f8878v.a() == 0) {
                    d1 d1Var = j4Var.f8768w.f8878v;
                    j4Var.f().getClass();
                    d1Var.b(System.currentTimeMillis());
                }
                j4Var.N();
                return;
            case 17:
                q1 q1Var4 = (q1) ((a6.d) this.f1304e).f297b;
                q1.i(q1Var4.I);
                q1Var4.I.w(((Long) s7.e0.D.a(null)).longValue());
                return;
            case 18:
                q1 q1Var5 = (q1) this.f1304e;
                p4 p4Var3 = q1Var5.f8940w;
                q2 q2Var2 = q1Var5.A;
                q1.j(p4Var3);
                p4Var3.s();
                if (p4Var3.P() != 1) {
                    s7.v0 v0Var4 = q1Var5.f8937t;
                    q1.l(v0Var4);
                    v0Var4.f9053w.a("registerTrigger called but app not eligible");
                    return;
                }
                q1.k(q2Var2);
                q2Var2.s();
                g2 g2Var = q2Var2.f8953z;
                if (g2Var != null) {
                    g2Var.c();
                }
                q1.k(q2Var2);
                new Thread(new f2(q2Var2, 3)).start();
                return;
            case 19:
                t3.c cVar2 = (t3.c) this.f1304e;
                m.q0 q0Var2 = cVar2.f9263i;
                t3.a aVar = cVar2.f9261d;
                if (cVar2.C) {
                    if (cVar2.A) {
                        cVar2.A = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f9257e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f9258f = currentAnimationTimeMillis;
                        aVar.f9259h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.f9260i) || !cVar2.e()) {
                        cVar2.C = false;
                        return;
                    }
                    if (cVar2.B) {
                        cVar2.B = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        q0Var2.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f9258f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a9 = aVar.a(currentAnimationTimeMillis2);
                    long j10 = currentAnimationTimeMillis2 - aVar.f9258f;
                    aVar.f9258f = currentAnimationTimeMillis2;
                    cVar2.E.scrollListBy((int) (j10 * ((a9 * 4.0f) + ((-4.0f) * a9 * a9)) * aVar.f9256d));
                    Field field = o3.c0.f7378a;
                    q0Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 20:
                Worker worker = (Worker) this.f1304e;
                try {
                    worker.f757d.i(worker.a());
                    return;
                } catch (Throwable th) {
                    worker.f757d.j(th);
                    return;
                }
            case 21:
                try {
                    throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
                } catch (Throwable th2) {
                    ((e6.j) this.f1304e).j(th2);
                    return;
                }
            case 22:
                v7.a aVar2 = (v7.a) this.f1304e;
                synchronized (aVar2.f9986a) {
                    try {
                        if (aVar2.b()) {
                            Log.e("WakeLock", String.valueOf(aVar2.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar2.d();
                            if (aVar2.b()) {
                                aVar2.f9988c = 1;
                                aVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 23:
                ((w3.c) this.f1304e).i(0);
                return;
            case 24:
                w7.k kVar = (w7.k) this.f1304e;
                synchronized (kVar.f10127i) {
                    try {
                        w7.b bVar = (w7.b) kVar.f10128r;
                        if (bVar != null) {
                            bVar.a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((w7.g) this.f1304e).b(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k(int i3, Object obj) {
        this.f1303d = i3;
        this.f1304e = obj;
    }

    public k(b1 b1Var, boolean z10) {
        this.f1303d = 12;
        this.f1304e = b1Var;
    }

    public k(j4 j4Var, c4.o oVar) {
        this.f1303d = 16;
        this.f1304e = j4Var;
    }

    public k(Worker worker, e6.j jVar) {
        this.f1303d = 21;
        this.f1304e = jVar;
    }
}
