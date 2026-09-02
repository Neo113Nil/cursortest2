package y;

import D.C0018t;
import V.m;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC0078e;
import v.C0108k;
import w.InterfaceC0112a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0112a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f1324c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1325d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f1326a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1327b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f1326a = iVar;
        if (iVar != null) {
            iVar.h(new io.flutter.plugin.platform.c(6, this));
        }
    }

    @Override // w.InterfaceC0112a
    public final void a(Context context, ExecutorC0078e executorC0078e, C0018t c0018t) {
        Object obj;
        WindowManager.LayoutParams attributes;
        U.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        m mVar = m.f386b;
        if (activity != null) {
            ReentrantLock reentrantLock = f1325d;
            reentrantLock.lock();
            try {
                i iVar = this.f1326a;
                if (iVar == null) {
                    c0018t.accept(new C0108k(mVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1327b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f1321a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, executorC0078e, c0018t);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f1321a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    C0108k c0108k = jVar2 != null ? jVar2.f1323c : null;
                    if (c0108k != null) {
                        jVar.f1323c = c0108k;
                        jVar.f1322b.accept(c0108k);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = U.g.f378a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            c0018t.accept(new C0108k(mVar));
        }
    }

    @Override // w.InterfaceC0112a
    public final void b(C0018t c0018t) {
        synchronized (f1325d) {
            try {
                if (this.f1326a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1327b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f1322b == c0018t) {
                        arrayList.add(jVar);
                    }
                }
                this.f1327b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f1321a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1327b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f1321a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f1326a;
                    if (iVar != null) {
                        iVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
