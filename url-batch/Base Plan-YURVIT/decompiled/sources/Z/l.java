package Z;

import B0.E;
import E0.o;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class l implements X.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l f1067c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1068d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final a f1069a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1070b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f1069a = jVar;
        if (jVar != null) {
            jVar.d(new E(11, this));
        }
    }

    @Override // X.a
    public final void a(W.i iVar) {
        synchronized (f1068d) {
            try {
                if (this.f1069a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1070b.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f1065b == iVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f1070b.removeAll(arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Activity activity = ((k) obj).f1064a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1070b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()).f1064a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f1069a;
                    if (aVar != null) {
                        ((j) aVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X.a
    public final void b(Context context, L.e eVar, W.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        D0.h hVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        o oVar = o.f219e;
        if (activity != null) {
            ReentrantLock reentrantLock = f1068d;
            reentrantLock.lock();
            try {
                a aVar = this.f1069a;
                if (aVar == null) {
                    iVar.accept(new W.k(oVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1070b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f1064a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, eVar, iVar);
                copyOnWriteArrayList.add(kVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((k) obj).f1064a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) obj;
                    W.k kVar3 = kVar2 != null ? kVar2.f1066c : null;
                    if (kVar3 != null) {
                        kVar.f1066c = kVar3;
                        kVar.f1065b.accept(kVar3);
                    }
                } else {
                    j jVar = (j) aVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar, activity));
                    }
                }
                reentrantLock.unlock();
                hVar = D0.h.f206a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (hVar == null) {
            iVar.accept(new W.k(oVar));
        }
    }
}
