package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wv0 implements Handler.Callback {
    public static final Status A = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status B = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object C = new Object();
    public static wv0 D;
    public long m;
    public boolean n;
    public st2 o;
    public wa3 p;
    public final Context q;
    public final sv0 r;
    public final tt1 s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public final ConcurrentHashMap v;
    public final ii w;
    public final ii x;
    public final bb3 y;
    public volatile boolean z;

    public wv0(Context context, Looper looper) {
        sv0 sv0Var = sv0.d;
        this.m = 10000L;
        this.n = false;
        this.t = new AtomicInteger(1);
        this.u = new AtomicInteger(0);
        this.v = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new ii(0);
        this.x = new ii(0);
        this.z = true;
        this.q = context;
        bb3 bb3Var = new bb3(looper, this);
        Looper.getMainLooper();
        this.y = bb3Var;
        this.r = sv0Var;
        this.s = new tt1(20);
        PackageManager packageManager = context.getPackageManager();
        if (tk3.q == null) {
            tk3.q = Boolean.valueOf(s03.A() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (tk3.q.booleanValue()) {
            this.z = false;
        }
        bb3Var.sendMessage(bb3Var.obtainMessage(6));
    }

    public static Status b(oe oeVar, c10 c10Var) {
        return new Status(17, "API: " + ((String) oeVar.b.o) + " is not available on this device. Connection failed with: " + String.valueOf(c10Var), c10Var.o, c10Var);
    }

    public static wv0 d(Context context) {
        wv0 wv0Var;
        HandlerThread handlerThread;
        synchronized (C) {
            if (D == null) {
                synchronized (rs3.g) {
                    try {
                        handlerThread = rs3.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            rs3.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = rs3.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = sv0.c;
                D = new wv0(applicationContext, looper);
            }
            wv0Var = D;
        }
        return wv0Var;
    }

    public final boolean a(c10 c10Var, int i) {
        sv0 sv0Var = this.r;
        sv0Var.getClass();
        Context context = this.q;
        if (!k31.p(context)) {
            int i2 = c10Var.n;
            PendingIntent pendingIntent = c10Var.o;
            if (!((i2 == 0 || pendingIntent == null) ? false : true)) {
                pendingIntent = null;
                Intent a = sv0Var.a(context, null, i2);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.n;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                sv0Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, ya3.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final aa3 c(rv0 rv0Var) {
        oe oeVar = rv0Var.e;
        ConcurrentHashMap concurrentHashMap = this.v;
        aa3 aa3Var = (aa3) concurrentHashMap.get(oeVar);
        if (aa3Var == null) {
            aa3Var = new aa3(this, rv0Var);
            concurrentHashMap.put(oeVar, aa3Var);
        }
        if (aa3Var.h.k()) {
            this.x.add(oeVar);
        }
        aa3Var.m();
        return aa3Var;
    }

    public final void e(c10 c10Var, int i) {
        if (a(c10Var, i)) {
            return;
        }
        bb3 bb3Var = this.y;
        bb3Var.sendMessage(bb3Var.obtainMessage(5, i, 0, c10Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0126, code lost:
    
        if (r0 != 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x033f  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        aa3 aa3Var;
        boolean z;
        mk0[] b;
        qb2 qb2Var;
        qb2 qb2Var2;
        Context context = this.q;
        ii iiVar = this.x;
        bb3 bb3Var = this.y;
        ConcurrentHashMap concurrentHashMap = this.v;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.m = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                bb3Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    bb3Var.sendMessageDelayed(bb3Var.obtainMessage(12, (oe) it.next()), this.m);
                }
                return true;
            case 2:
                throw q40.h(message.obj);
            case 3:
                for (aa3 aa3Var2 : concurrentHashMap.values()) {
                    ll3.r(aa3Var2.r.y);
                    aa3Var2.q = null;
                    aa3Var2.m();
                }
                return true;
            case 4:
            case 8:
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ia3 ia3Var = (ia3) message.obj;
                wa3 wa3Var = ia3Var.c;
                ra3 ra3Var = ia3Var.a;
                aa3 aa3Var3 = (aa3) concurrentHashMap.get(wa3Var.e);
                if (aa3Var3 == null) {
                    aa3Var3 = c(ia3Var.c);
                }
                if (!aa3Var3.h.k() || this.u.get() == ia3Var.b) {
                    aa3Var3.n(ra3Var);
                    return true;
                }
                ra3Var.c(A);
                aa3Var3.q();
                return true;
            case 5:
                int i3 = message.arg1;
                c10 c10Var = (c10) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aa3Var = (aa3) it2.next();
                        if (aa3Var.m == i3) {
                        }
                    } else {
                        aa3Var = null;
                    }
                }
                if (aa3Var == null) {
                    Log.wtf("GoogleApiManager", in1.l(i3, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i4 = c10Var.n;
                if (i4 != 13) {
                    aa3Var.e(b(aa3Var.i, c10Var));
                    return true;
                }
                this.r.getClass();
                int i5 = xv0.e;
                aa3Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + c10.a(i4) + ": " + c10Var.p, null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    an.a((Application) context.getApplicationContext());
                    an anVar = an.q;
                    z93 z93Var = new z93(this);
                    anVar.getClass();
                    synchronized (anVar) {
                        anVar.o.add(z93Var);
                    }
                    AtomicBoolean atomicBoolean = anVar.m;
                    AtomicBoolean atomicBoolean2 = anVar.n;
                    if (!atomicBoolean2.get()) {
                        if (km.y()) {
                            z = true;
                            if (!z) {
                                this.m = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z = atomicBoolean.get();
                    if (!z) {
                    }
                }
                return true;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                c((rv0) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    aa3 aa3Var4 = (aa3) concurrentHashMap.get(message.obj);
                    ll3.r(aa3Var4.r.y);
                    if (aa3Var4.o) {
                        aa3Var4.m();
                        return true;
                    }
                }
                return true;
            case 10:
                iiVar.getClass();
                di diVar = new di(iiVar);
                while (diVar.hasNext()) {
                    aa3 aa3Var5 = (aa3) concurrentHashMap.remove((oe) diVar.next());
                    if (aa3Var5 != null) {
                        aa3Var5.q();
                    }
                }
                iiVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    aa3 aa3Var6 = (aa3) concurrentHashMap.get(message.obj);
                    wv0 wv0Var = aa3Var6.r;
                    ll3.r(wv0Var.y);
                    boolean z2 = aa3Var6.o;
                    if (z2) {
                        oe oeVar = aa3Var6.i;
                        bb3 bb3Var2 = aa3Var6.r.y;
                        if (z2) {
                            bb3Var2.removeMessages(11, oeVar);
                            bb3Var2.removeMessages(9, oeVar);
                            aa3Var6.o = false;
                        }
                        aa3Var6.e(wv0Var.r.b(wv0Var.q, tv0.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        aa3Var6.h.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    aa3 aa3Var7 = (aa3) concurrentHashMap.get(message.obj);
                    ll3.r(aa3Var7.r.y);
                    ce ceVar = aa3Var7.h;
                    if (ceVar.a() && aa3Var7.l.isEmpty()) {
                        tt1 tt1Var = aa3Var7.j;
                        if (((Map) tt1Var.n).isEmpty() && ((Map) tt1Var.o).isEmpty()) {
                            ceVar.c("Timing out service connection.");
                            return true;
                        }
                        aa3Var7.j();
                    }
                    return true;
                }
                return true;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                throw q40.h(message.obj);
            case 15:
                ba3 ba3Var = (ba3) message.obj;
                if (concurrentHashMap.containsKey(ba3Var.a)) {
                    aa3 aa3Var8 = (aa3) concurrentHashMap.get(ba3Var.a);
                    if (aa3Var8.p.contains(ba3Var) && !aa3Var8.o) {
                        if (aa3Var8.h.a()) {
                            aa3Var8.g();
                            return true;
                        }
                        aa3Var8.m();
                        return true;
                    }
                }
                return true;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                ba3 ba3Var2 = (ba3) message.obj;
                if (concurrentHashMap.containsKey(ba3Var2.a)) {
                    aa3 aa3Var9 = (aa3) concurrentHashMap.get(ba3Var2.a);
                    ArrayList arrayList = aa3Var9.p;
                    wv0 wv0Var2 = aa3Var9.r;
                    LinkedList<ga3> linkedList = aa3Var9.g;
                    if (arrayList.remove(ba3Var2)) {
                        wv0Var2.y.removeMessages(15, ba3Var2);
                        wv0Var2.y.removeMessages(16, ba3Var2);
                        mk0 mk0Var = ba3Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (ga3 ga3Var : linkedList) {
                            if (ga3Var != null && (b = ga3Var.b(aa3Var9)) != null) {
                                int length = b.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!ll3.C(b[i6], mk0Var)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList2.add(ga3Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            ga3 ga3Var2 = (ga3) arrayList2.get(i2);
                            linkedList.remove(ga3Var2);
                            ga3Var2.d(new x23(mk0Var));
                            i2++;
                        }
                    }
                }
                return true;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                st2 st2Var = this.o;
                if (st2Var != null) {
                    if (st2Var.m <= 0) {
                        if (!this.n) {
                            synchronized (qb2.class) {
                                try {
                                    if (qb2.n == null) {
                                        qb2.n = new qb2(i2);
                                    }
                                    qb2Var = qb2.n;
                                } finally {
                                }
                            }
                            qb2Var.getClass();
                            int i7 = ((SparseIntArray) this.s.n).get(203400000, -1);
                            if (i7 != -1) {
                            }
                        }
                        this.o = null;
                        return true;
                    }
                    if (this.p == null) {
                        this.p = new wa3(this.q, wa3.i, tt2.b, qv0.b);
                    }
                    this.p.b(st2Var);
                    this.o = null;
                    return true;
                }
                return true;
            case 18:
                ((ha3) message.obj).getClass();
                if (0 == 0) {
                    st2 st2Var2 = new st2(0, Arrays.asList(null));
                    if (this.p == null) {
                        this.p = new wa3(this.q, wa3.i, tt2.b, qv0.b);
                    }
                    this.p.b(st2Var2);
                    return true;
                }
                st2 st2Var3 = this.o;
                if (st2Var3 != null) {
                    List list = st2Var3.n;
                    if (st2Var3.m != 0 || (list != null && list.size() >= 0)) {
                        bb3Var.removeMessages(17);
                        st2 st2Var4 = this.o;
                        if (st2Var4 != null) {
                            if (st2Var4.m <= 0) {
                                if (!this.n) {
                                    synchronized (qb2.class) {
                                        try {
                                            if (qb2.n == null) {
                                                qb2.n = new qb2(i2);
                                            }
                                            qb2Var2 = qb2.n;
                                        } finally {
                                        }
                                    }
                                    qb2Var2.getClass();
                                    int i8 = ((SparseIntArray) this.s.n).get(203400000, -1);
                                    if (i8 != -1) {
                                    }
                                }
                                this.o = null;
                            }
                            if (this.p == null) {
                                this.p = new wa3(this.q, wa3.i, tt2.b, qv0.b);
                            }
                            this.p.b(st2Var4);
                            this.o = null;
                        }
                    } else {
                        st2 st2Var5 = this.o;
                        if (st2Var5.n == null) {
                            st2Var5.n = new ArrayList();
                        }
                        st2Var5.n.add(null);
                    }
                }
                if (this.o == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.o = new st2(0, arrayList3);
                    bb3Var.sendMessageDelayed(bb3Var.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.n = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
