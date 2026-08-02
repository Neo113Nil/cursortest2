package B1;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import c3.C0297i;
import d3.q;
import j1.ExecutorC1174c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class n implements InterfaceC1581a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n f214c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f215d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final a f216a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f217b = new CopyOnWriteArrayList();

    public n(l lVar) {
        this.f216a = lVar;
        if (lVar != null) {
            lVar.d(new t1.h(1, this));
        }
    }

    @Override // z1.InterfaceC1581a
    public final void a(Context context, ExecutorC1174c executorC1174c, y1.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0297i c0297i = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        q qVar = q.f8333a;
        if (activity != null) {
            ReentrantLock reentrantLock = f215d;
            reentrantLock.lock();
            try {
                a aVar = this.f216a;
                if (aVar == null) {
                    iVar.accept(new y1.k(qVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f217b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((m) it.next()).f211a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                m mVar = new m(activity, executorC1174c, iVar);
                copyOnWriteArrayList.add(mVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((m) obj).f211a)) {
                                break;
                            }
                        }
                    }
                    m mVar2 = (m) obj;
                    y1.k kVar = mVar2 != null ? mVar2.f213c : null;
                    if (kVar != null) {
                        mVar.f213c = kVar;
                        mVar.f212b.accept(kVar);
                    }
                } else {
                    l lVar = (l) aVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        lVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new k(lVar, activity));
                    }
                }
                reentrantLock.unlock();
                c0297i = C0297i.f5732a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0297i == null) {
            iVar.accept(new y1.k(qVar));
        }
    }

    @Override // z1.InterfaceC1581a
    public final void b(y1.i iVar) {
        synchronized (f215d) {
            try {
                if (this.f216a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f217b.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (mVar.f212b == iVar) {
                        arrayList.add(mVar);
                    }
                }
                this.f217b.removeAll(arrayList);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Activity activity = ((m) obj).f211a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f217b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((m) it2.next()).f211a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f216a;
                    if (aVar != null) {
                        ((l) aVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
