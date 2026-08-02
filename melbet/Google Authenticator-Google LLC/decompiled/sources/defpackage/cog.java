package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cog implements Handler.Callback {
    public static cog d;
    public final Context g;
    public final cll h;
    public final Handler o;
    public volatile boolean p;
    public final fwm q;
    private crg t;
    private cpt u;
    private crv v;
    private crt w;
    private volatile cbp x;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status b = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object c = new Object();
    private static final Object r = new Object();
    private static volatile boolean s = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public cnz l = null;
    public final Set m = new qk(0);
    public final Set n = new qk(0);

    private cog(Context context, Looper looper, cll cllVar) {
        Collections.newSetFromMap(new WeakHashMap());
        Collections.newSetFromMap(new WeakHashMap());
        this.p = true;
        this.g = context;
        gbg gbgVar = new gbg(looper, this);
        this.o = gbgVar;
        this.h = cllVar;
        this.q = new fwm(cllVar);
        if (csk.a(context)) {
            this.p = false;
        }
        gbgVar.sendMessage(gbgVar.obtainMessage(6));
    }

    public static Status a(cno cnoVar, clg clgVar) {
        return new Status(clgVar, "API: " + cnoVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(clgVar));
    }

    public static cog c(Context context) {
        cog cogVar;
        synchronized (c) {
            cogVar = d;
            if (cogVar == null) {
                Looper looper = cqj.a().getLooper();
                boolean a2 = cqh.a(context.getPackageName());
                s = a2;
                cog cogVar2 = new cog(context.getApplicationContext(), looper, cll.a);
                if (a2) {
                    cqd.t = cqf.a(cogVar2.g);
                }
                d = cogVar2;
                cogVar = cogVar2;
            }
        }
        return cogVar;
    }

    private final coc k(cms cmsVar) {
        Map map = this.k;
        cno cnoVar = cmsVar.e;
        coc cocVar = (coc) map.get(cnoVar);
        if (cocVar == null) {
            cocVar = new coc(this, cmsVar);
            map.put(cnoVar, cocVar);
        }
        if (cocVar.q()) {
            this.n.add(cnoVar);
        }
        cocVar.d();
        return cocVar;
    }

    private final void l() {
        crg crgVar = this.t;
        if (crgVar != null) {
            if (crgVar.a > 0 || g()) {
                n().a(crgVar);
            }
            this.t = null;
        }
    }

    private final void m() {
        cpt cptVar = this.u;
        if (cptVar != null) {
            Context context = this.g;
            crt crtVar = this.w;
            if (crtVar == null) {
                crtVar = new crt(context);
                this.w = crtVar;
            }
            crtVar.a(cptVar);
            this.u = null;
        }
    }

    private final crv n() {
        crv crvVar = this.v;
        if (crvVar != null) {
            return crvVar;
        }
        crv crvVar2 = new crv(this.g, crh.b);
        this.v = crvVar2;
        return crvVar2;
    }

    final coc b(cno cnoVar) {
        return (coc) this.k.get(cnoVar);
    }

    public final void d(clg clgVar, int i) {
        if (h(clgVar, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, clgVar));
    }

    public final void e() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(cnz cnzVar) {
        synchronized (c) {
            if (this.l != cnzVar) {
                this.l = cnzVar;
                this.m.clear();
            }
            this.m.addAll(cnzVar.e);
        }
    }

    final boolean g() {
        if (this.f) {
            return false;
        }
        cre creVar = crd.a().a;
        if (creVar != null && !creVar.b) {
            return false;
        }
        int R = this.q.R(203400000);
        return R == -1 || R == 0;
    }

    final boolean h(clg clgVar, int i) {
        PendingIntent a2;
        cll cllVar = this.h;
        int i2 = clgVar.c;
        if (!cllVar.f(i2)) {
            Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(clgVar))));
            return false;
        }
        Context context = this.g;
        if (csp.f(context) || (a2 = cllVar.a(context, clgVar)) == null) {
            return false;
        }
        Intent a3 = GoogleApiActivity.a(context, a2, i, true);
        int i3 = cxa.b | 134217728;
        boolean z = cxa.a;
        cllVar.j(context, new clg(1, i2, PendingIntent.getActivity(context, 0, a3, i3), clgVar.e, clgVar.f));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        coc cocVar;
        boolean isIsolated;
        cli[] d2;
        switch (message.what) {
            case 1:
                this.e = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.o;
                handler.removeMessages(12);
                Iterator it = this.k.keySet().iterator();
                while (it.hasNext()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, (cno) it.next()), this.e);
                }
                return true;
            case 2:
                gam gamVar = (gam) message.obj;
                Iterator it2 = ((qi) gamVar.d).keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        cno cnoVar = (cno) it2.next();
                        coc cocVar2 = (coc) this.k.get(cnoVar);
                        if (cocVar2 == null) {
                            gamVar.g(cnoVar, new clg(1, 13, null, null, null), null);
                        } else {
                            cml cmlVar = cocVar2.b;
                            if (cmlVar.m()) {
                                gamVar.g(cnoVar, clg.a, cmlVar.h());
                            } else {
                                Handler handler2 = cocVar2.k.o;
                                oy.an(handler2);
                                clg clgVar = cocVar2.i;
                                if (clgVar != null) {
                                    gamVar.g(cnoVar, clgVar, null);
                                } else {
                                    oy.an(handler2);
                                    cocVar2.d.add(gamVar);
                                    cocVar2.d();
                                }
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (coc cocVar3 : this.k.values()) {
                    cocVar3.c();
                    cocVar3.d();
                }
                return true;
            case 4:
            case 8:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                evt evtVar = (evt) message.obj;
                Map map = this.k;
                cms cmsVar = (cms) evtVar.b;
                coc cocVar4 = (coc) map.get(cmsVar.e);
                if (cocVar4 == null) {
                    cocVar4 = k(cmsVar);
                }
                if (!cocVar4.q() || this.j.get() == evtVar.a) {
                    cocVar4.e((cnn) evtVar.c);
                } else {
                    ((cnn) evtVar.c).f(a);
                    cocVar4.o();
                }
                return true;
            case 5:
                int i = message.arg1;
                clg clgVar2 = (clg) message.obj;
                Iterator it3 = this.k.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        cocVar = (coc) it3.next();
                        if (cocVar.f == i) {
                        }
                    } else {
                        cocVar = null;
                    }
                }
                if (cocVar == null) {
                    Log.wtf("GoogleApiManager", a.ai(i, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                } else if (clgVar2.c == 13) {
                    boolean z = cmd.a;
                    cocVar.f(new Status(17, "Error resolution was canceled by the user, original error message: " + clg.a(13) + ": " + clgVar2.e, null, null));
                } else {
                    cocVar.f(a(cocVar.c, clgVar2));
                }
                return true;
            case 6:
                Context context = this.g;
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    cnp cnpVar = cnp.a;
                    synchronized (cnpVar) {
                        if (!cnpVar.e) {
                            application.registerActivityLifecycleCallbacks(cnpVar);
                            application.registerComponentCallbacks(cnpVar);
                            cnpVar.e = true;
                        }
                    }
                    cnp cnpVar2 = cnp.a;
                    kee keeVar = new kee(this);
                    synchronized (cnpVar2) {
                        cnpVar2.d.add(keeVar);
                    }
                    cnp cnpVar3 = cnp.a;
                    AtomicBoolean atomicBoolean = cnpVar3.c;
                    if (!atomicBoolean.get()) {
                        Boolean bool = cso.b;
                        if (bool == null) {
                            isIsolated = Process.isIsolated();
                            bool = Boolean.valueOf(isIsolated);
                            cso.b = bool;
                        }
                        if (!bool.booleanValue()) {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                cnpVar3.b.set(true);
                            }
                        }
                    }
                    if (!cnpVar3.b.get()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                k((cms) message.obj);
                return true;
            case 9:
                Map map2 = this.k;
                if (map2.containsKey(message.obj)) {
                    coc cocVar5 = (coc) map2.get(message.obj);
                    oy.an(cocVar5.k.o);
                    if (cocVar5.g) {
                        cocVar5.d();
                    }
                }
                return true;
            case 10:
                Set set = this.n;
                qj qjVar = new qj((qk) set);
                while (qjVar.hasNext()) {
                    coc cocVar6 = (coc) this.k.remove((cno) qjVar.next());
                    if (cocVar6 != null) {
                        cocVar6.o();
                    }
                }
                set.clear();
                return true;
            case 11:
                Map map3 = this.k;
                if (map3.containsKey(message.obj)) {
                    coc cocVar7 = (coc) map3.get(message.obj);
                    cog cogVar = cocVar7.k;
                    oy.an(cogVar.o);
                    if (cocVar7.g) {
                        cocVar7.p();
                        cocVar7.f(cogVar.h.k(cogVar.g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        cocVar7.b.l("Timing out connection while resuming.");
                    }
                }
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Map map4 = this.k;
                if (map4.containsKey(message.obj)) {
                    coc cocVar8 = (coc) map4.get(message.obj);
                    oy.an(cocVar8.k.o);
                    cml cmlVar2 = cocVar8.b;
                    if (cmlVar2.m() && cocVar8.e.isEmpty()) {
                        fwm fwmVar = cocVar8.l;
                        if (fwmVar.a.isEmpty() && fwmVar.b.isEmpty()) {
                            cmlVar2.l("Timing out service connection.");
                        } else {
                            cocVar8.n();
                        }
                    }
                }
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                throw null;
            case 15:
                cod codVar = (cod) message.obj;
                Map map5 = this.k;
                cno cnoVar2 = codVar.a;
                if (map5.containsKey(cnoVar2)) {
                    coc cocVar9 = (coc) map5.get(cnoVar2);
                    if (cocVar9.h.contains(codVar) && !cocVar9.g) {
                        if (cocVar9.b.m()) {
                            cocVar9.g();
                        } else {
                            cocVar9.d();
                        }
                    }
                }
                return true;
            case 16:
                cod codVar2 = (cod) message.obj;
                Map map6 = this.k;
                cno cnoVar3 = codVar2.a;
                if (map6.containsKey(cnoVar3)) {
                    coc cocVar10 = (coc) map6.get(cnoVar3);
                    if (cocVar10.h.remove(codVar2)) {
                        Handler handler3 = cocVar10.k.o;
                        handler3.removeMessages(15, codVar2);
                        handler3.removeMessages(16, codVar2);
                        cli cliVar = codVar2.b;
                        Queue<cnn> queue = cocVar10.a;
                        ArrayList arrayList = new ArrayList(queue.size());
                        for (cnn cnnVar : queue) {
                            if ((cnnVar instanceof cng) && (d2 = ((cng) cnnVar).d(cocVar10)) != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= d2.length) {
                                        break;
                                    }
                                    if (Objects.equals(d2[0], cliVar)) {
                                        arrayList.add(cnnVar);
                                    } else {
                                        i2 = 1;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            cnn cnnVar2 = (cnn) arrayList.get(i3);
                            queue.remove(cnnVar2);
                            cnnVar2.g(new cnf(cliVar));
                        }
                    }
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                cos cosVar = (cos) message.obj;
                long j = cosVar.c;
                if (j == 0) {
                    n().a(new crg(cosVar.b, Arrays.asList(cosVar.a)));
                } else {
                    crg crgVar = this.t;
                    if (crgVar != null) {
                        List list = crgVar.b;
                        if (crgVar.a != cosVar.b || (list != null && list.size() >= cosVar.d)) {
                            this.o.removeMessages(17);
                            l();
                        } else {
                            crg crgVar2 = this.t;
                            cqy cqyVar = cosVar.a;
                            if (crgVar2.b == null) {
                                crgVar2.b = new ArrayList();
                            }
                            crgVar2.b.add(cqyVar);
                        }
                    }
                    if (this.t == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(cosVar.a);
                        this.t = new crg(cosVar.b, arrayList2);
                        Handler handler4 = this.o;
                        handler4.sendMessageDelayed(handler4.obtainMessage(17), j);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            case 20:
                m();
                return true;
            case 21:
                cpc cpcVar = (cpc) message.obj;
                long j2 = cpcVar.b;
                cpt cptVar = this.u;
                if (cptVar != null) {
                    List a2 = cptVar.a();
                    if (a2 != null) {
                        int size2 = a2.size();
                        int i4 = cpcVar.c;
                        if (size2 >= 100) {
                            this.o.removeMessages(20);
                            m();
                        }
                    }
                    cpt cptVar2 = this.u;
                    cps cpsVar = cpcVar.a;
                    if (cptVar2.a == null) {
                        cptVar2.a = new ArrayList();
                    }
                    cptVar2.a.add(cpsVar);
                }
                if (this.u == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(cpcVar.a);
                    this.u = new cpt(arrayList3);
                    Handler handler5 = this.o;
                    handler5.sendMessageDelayed(handler5.obtainMessage(20), 5000L);
                }
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    public final cbp i() {
        cbp cbpVar;
        cbp cbpVar2 = this.x;
        if (cbpVar2 != null) {
            return cbpVar2;
        }
        synchronized (r) {
            cbpVar = this.x;
            if (cbpVar == null) {
                cbpVar = new cbp();
                this.x = cbpVar;
            }
        }
        return cbpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(bst bstVar, int i, cms cmsVar) {
        cog cogVar;
        if (i == 0) {
            return;
        }
        cno cnoVar = cmsVar.e;
        cor corVar = null;
        if (g()) {
            cre creVar = crd.a().a;
            boolean z = true;
            if (creVar != null) {
                if (creVar.b) {
                    boolean z2 = creVar.c;
                    coc b2 = b(cnoVar);
                    if (b2 != null) {
                        Object obj = b2.b;
                        if (obj instanceof cpo) {
                            cpo cpoVar = (cpo) obj;
                            if (cpoVar.B() && !cpoVar.n()) {
                                cpw b3 = cor.b(b2, cpoVar, i);
                                if (b3 != null) {
                                    b2.j++;
                                    z = b3.c;
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            long currentTimeMillis = z ? System.currentTimeMillis() : 0L;
            long elapsedRealtime = z ? SystemClock.elapsedRealtime() : 0L;
            cogVar = this;
            corVar = new cor(cogVar, i, cnoVar, currentTimeMillis, elapsedRealtime);
            if (corVar == null) {
                Object obj2 = bstVar.a;
                Handler handler = cogVar.o;
                handler.getClass();
                ((ddi) obj2).h(new cob(handler, 0), corVar);
                return;
            }
            return;
        }
        cogVar = this;
        if (corVar == null) {
        }
    }
}
