package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class br1 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final ur1 b;
    public final String c;
    public final ArrayList d;
    public final HashSet e;
    public final Object f;
    public boolean g;
    public final Intent h;
    public final j50 i;
    public final WeakReference j;
    public final wr1 k;
    public final AtomicInteger l;
    public ar1 m;
    public tr1 n;

    /* JADX WARN: Type inference failed for: r1v3, types: [wr1] */
    public br1(Context context, ur1 ur1Var, Intent intent) {
        j50 j50Var = j50.D;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = new Object();
        this.k = new IBinder.DeathRecipient() { // from class: wr1
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                br1 br1Var = br1.this;
                int i = 0;
                br1Var.b.a("reportBinderDeath", new Object[0]);
                if (br1Var.j.get() != null) {
                    af.c();
                    return;
                }
                br1Var.b.a("%s : Binder has died.", br1Var.c);
                ArrayList arrayList = br1Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vr1) obj).a(new RemoteException(String.valueOf(br1Var.c).concat(" : Binder has died.")));
                }
                br1Var.d.clear();
                synchronized (br1Var.f) {
                    br1Var.c();
                }
            }
        };
        this.l = new AtomicInteger(0);
        this.a = context;
        this.b = ur1Var;
        this.c = "IntegrityService";
        this.h = intent;
        this.i = j50Var;
        this.j = new WeakReference(null);
    }

    public static void b(br1 br1Var, dr1 dr1Var) {
        tr1 tr1Var = br1Var.n;
        ur1 ur1Var = br1Var.b;
        ArrayList arrayList = br1Var.d;
        int i = 0;
        if (tr1Var != null || br1Var.g) {
            if (!br1Var.g) {
                dr1Var.run();
                return;
            } else {
                ur1Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dr1Var);
                return;
            }
        }
        ur1Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(dr1Var);
        ar1 ar1Var = new ar1(br1Var);
        br1Var.m = ar1Var;
        br1Var.g = true;
        if (br1Var.a.bindService(br1Var.h, ar1Var, 1)) {
            return;
        }
        ur1Var.a("Failed to bind to the service.", new Object[0]);
        br1Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vr1) obj).a(new cr1("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ng1) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
