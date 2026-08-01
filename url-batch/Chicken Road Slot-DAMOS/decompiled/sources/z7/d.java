package z7;

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
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f10923o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f10924a;

    /* renamed from: b, reason: collision with root package name */
    public final o f10925b;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f10930h;

    /* renamed from: m, reason: collision with root package name */
    public c f10934m;

    /* renamed from: n, reason: collision with root package name */
    public n f10935n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10927d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f10928e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f10929f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final q f10932k = new IBinder.DeathRecipient() { // from class: z7.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            d dVar = d.this;
            int i3 = 0;
            dVar.f10925b.a("reportBinderDeath", new Object[0]);
            if (dVar.j.get() != null) {
                i0.j();
                return;
            }
            dVar.f10925b.a("%s : Binder has died.", dVar.f10926c);
            ArrayList arrayList = dVar.f10927d;
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((p) obj).a(new RemoteException(String.valueOf(dVar.f10926c).concat(" : Binder has died.")));
            }
            dVar.f10927d.clear();
            synchronized (dVar.f10929f) {
                dVar.c();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f10933l = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f10926c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    public final x7.d f10931i = x7.d.f10522e;
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [z7.q] */
    public d(Context context, o oVar, Intent intent) {
        this.f10924a = context;
        this.f10925b = oVar;
        this.f10930h = intent;
    }

    public static void b(d dVar, x7.e eVar) {
        n nVar = dVar.f10935n;
        o oVar = dVar.f10925b;
        ArrayList arrayList = dVar.f10927d;
        int i3 = 0;
        if (nVar != null || dVar.g) {
            if (!dVar.g) {
                eVar.run();
                return;
            } else {
                oVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar);
                return;
            }
        }
        oVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar);
        c cVar = new c(dVar);
        dVar.f10934m = cVar;
        dVar.g = true;
        if (dVar.f10924a.bindService(dVar.f10930h, cVar, 1)) {
            return;
        }
        oVar.a("Failed to bind to the service.", new Object[0]);
        dVar.g = false;
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((p) obj).a(new e("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f10923o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f10926c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f10926c, 10);
                    handlerThread.start();
                    hashMap.put(this.f10926c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f10926c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f10928e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((w7.g) it.next()).b(new RemoteException(String.valueOf(this.f10926c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
