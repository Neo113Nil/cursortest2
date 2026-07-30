package N1;

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

/* loaded from: classes.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f1801o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1803b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1808g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f1809h;

    /* renamed from: m, reason: collision with root package name */
    public c f1813m;

    /* renamed from: n, reason: collision with root package name */
    public o f1814n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1805d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1806e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f1807f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final r f1811k = new IBinder.DeathRecipient() { // from class: N1.r
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = d.this;
            int i2 = 0;
            dVar.f1803b.a("reportBinderDeath", new Object[0]);
            if (dVar.j.get() != null) {
                throw new ClassCastException();
            }
            dVar.f1803b.a("%s : Binder has died.", dVar.f1804c);
            ArrayList arrayList = dVar.f1805d;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((q) obj).a(new RemoteException(String.valueOf(dVar.f1804c).concat(" : Binder has died.")));
            }
            dVar.f1805d.clear();
            synchronized (dVar.f1807f) {
                dVar.c();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f1812l = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f1804c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    public final L1.c f1810i = L1.c.f1663e;
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [N1.r] */
    public d(Context context, p pVar, Intent intent) {
        this.f1802a = context;
        this.f1803b = pVar;
        this.f1809h = intent;
    }

    public static void b(d dVar, L1.d dVar2) {
        o oVar = dVar.f1814n;
        p pVar = dVar.f1803b;
        ArrayList arrayList = dVar.f1805d;
        int i2 = 0;
        if (oVar != null || dVar.f1808g) {
            if (!dVar.f1808g) {
                dVar2.run();
                return;
            } else {
                pVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dVar2);
                return;
            }
        }
        pVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar2);
        c cVar = new c(dVar);
        dVar.f1813m = cVar;
        dVar.f1808g = true;
        if (dVar.f1802a.bindService(dVar.f1809h, cVar, 1)) {
            return;
        }
        pVar.a("Failed to bind to the service.", new Object[0]);
        dVar.f1808g = false;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((q) obj).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f1801o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f1804c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f1804c, 10);
                    handlerThread.start();
                    hashMap.put(this.f1804c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f1804c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f1806e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((K1.h) it.next()).c(new RemoteException(String.valueOf(this.f1804c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
