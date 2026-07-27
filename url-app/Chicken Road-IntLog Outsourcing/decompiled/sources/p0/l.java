package p0;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import f4.v;
import g4.C0471p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import n0.InterfaceC1296a;

/* loaded from: classes.dex */
public final class l implements InterfaceC1296a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile l f11634c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f11635d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final j f11636a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11637b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f11636a = jVar;
        if (jVar != null) {
            jVar.h(new U.e(this));
        }
    }

    @Override // n0.InterfaceC1296a
    public final void a(m0.i iVar) {
        synchronized (f11635d) {
            try {
                if (this.f11636a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f11637b.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f11632b == iVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f11637b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((k) it2.next()).f11631a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f11637b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((k) it3.next()).f11631a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    j jVar = this.f11636a;
                    if (jVar != null) {
                        jVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.InterfaceC1296a
    public final void b(Context context, U.d dVar, m0.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        v vVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C0471p c0471p = C0471p.f5750a;
        if (activity != null) {
            ReentrantLock reentrantLock = f11635d;
            reentrantLock.lock();
            try {
                j jVar = this.f11636a;
                if (jVar == null) {
                    iVar.accept(new m0.k(c0471p));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f11637b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f11631a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, dVar, iVar);
                copyOnWriteArrayList.add(kVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((k) obj).f11631a)) {
                                break;
                            }
                        }
                    }
                    k kVar2 = (k) obj;
                    m0.k kVar3 = kVar2 != null ? kVar2.f11633c : null;
                    if (kVar3 != null) {
                        kVar.f11633c = kVar3;
                        kVar.f11632b.accept(kVar3);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i(jVar, activity));
                    }
                }
                reentrantLock.unlock();
                vVar = v.f5689a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (vVar == null) {
            iVar.accept(new m0.k(c0471p));
        }
    }
}
