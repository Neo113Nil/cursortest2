package z;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class l implements x.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l f1268c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1269d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final a f1270a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1271b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f1270a = jVar;
        if (jVar != null) {
            jVar.d(new o0.a(4, this));
        }
    }

    @Override // x.a
    public final void a(q qVar) {
        synchronized (f1269d) {
            try {
                if (this.f1270a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1271b.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f1266b == qVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f1271b.removeAll(arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Activity activity = ((k) obj).f1265a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1271b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()).f1265a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f1270a;
                    if (aVar != null) {
                        ((j) aVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x.a
    public final void b(Context context, o.e eVar, q qVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        t0.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        u0.l lVar = u0.l.f1186b;
        if (activity != null) {
            ReentrantLock reentrantLock = f1269d;
            reentrantLock.lock();
            try {
                a aVar = this.f1270a;
                if (aVar == null) {
                    qVar.accept(new w.j(lVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1271b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f1265a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, eVar, qVar);
                copyOnWriteArrayList.add(kVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((k) obj).f1265a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) obj;
                    w.j jVar = kVar2 != null ? kVar2.f1267c : null;
                    if (jVar != null) {
                        kVar.f1267c = jVar;
                        kVar.f1266b.accept(jVar);
                    }
                } else {
                    j jVar2 = (j) aVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar2.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar2, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = t0.g.f1178a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            qVar.accept(new w.j(lVar));
        }
    }
}
