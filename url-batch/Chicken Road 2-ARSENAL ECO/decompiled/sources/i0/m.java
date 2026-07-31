package i0;

import D3.p;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import g0.InterfaceC0390a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import k5.v;
import l5.C0512p;

/* loaded from: classes.dex */
public final class m implements InterfaceC0390a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile m f4413c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f4414d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0418a f4415a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4416b = new CopyOnWriteArrayList();

    public m(k kVar) {
        this.f4415a = kVar;
        if (kVar != null) {
            kVar.d(new V5.g(6, this));
        }
    }

    @Override // g0.InterfaceC0390a
    public final void a(p pVar) {
        synchronized (f4414d) {
            try {
                if (this.f4415a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f4416b.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    if (lVar.f4411b == pVar) {
                        arrayList.add(lVar);
                    }
                }
                this.f4416b.removeAll(arrayList);
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    Activity activity = ((l) obj).f4410a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f4416b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()).f4410a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    InterfaceC0418a interfaceC0418a = this.f4415a;
                    if (interfaceC0418a != null) {
                        ((k) interfaceC0418a).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.InterfaceC0390a
    public final void b(Context context, P.c cVar, p pVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        v vVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C0512p c0512p = C0512p.f5303f;
        if (activity != null) {
            ReentrantLock reentrantLock = f4414d;
            reentrantLock.lock();
            try {
                InterfaceC0418a interfaceC0418a = this.f4415a;
                if (interfaceC0418a == null) {
                    pVar.accept(new f0.j(c0512p));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f4416b;
                boolean z5 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((l) it.next()).f4410a.equals(activity)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                l lVar = new l(activity, cVar, pVar);
                copyOnWriteArrayList.add(lVar);
                if (z5) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((l) obj).f4410a)) {
                                break;
                            }
                        }
                    }
                    l lVar2 = (l) obj;
                    f0.j jVar = lVar2 != null ? lVar2.f4412c : null;
                    if (jVar != null) {
                        lVar.f4412c = jVar;
                        lVar.f4411b.accept(jVar);
                    }
                } else {
                    k kVar = (k) interfaceC0418a;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        kVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j(kVar, activity));
                    }
                }
                reentrantLock.unlock();
                vVar = v.f5219a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (vVar == null) {
            pVar.accept(new f0.j(c0512p));
        }
    }
}
