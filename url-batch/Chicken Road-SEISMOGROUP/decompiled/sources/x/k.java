package x;

import E.s;
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
import m.ExecutorC0069e;
import v.InterfaceC0094a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0094a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f1321c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1322d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f1323a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1324b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f1323a = iVar;
        if (iVar != null) {
            iVar.h(new io.flutter.plugin.editing.a(7, this));
        }
    }

    @Override // v.InterfaceC0094a
    public final void a(Context context, ExecutorC0069e executorC0069e, s sVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        U.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        m mVar = m.f441b;
        if (activity != null) {
            ReentrantLock reentrantLock = f1322d;
            reentrantLock.lock();
            try {
                i iVar = this.f1323a;
                if (iVar == null) {
                    sVar.accept(new u.k(mVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1324b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f1318a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, executorC0069e, sVar);
                copyOnWriteArrayList.add(jVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f1318a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    u.k kVar = jVar2 != null ? jVar2.f1320c : null;
                    if (kVar != null) {
                        jVar.f1320c = kVar;
                        jVar.f1319b.accept(kVar);
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
                gVar = U.g.f433a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            sVar.accept(new u.k(mVar));
        }
    }

    @Override // v.InterfaceC0094a
    public final void b(s sVar) {
        synchronized (f1322d) {
            try {
                if (this.f1323a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1324b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f1319b == sVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f1324b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f1318a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1324b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f1318a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f1323a;
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
