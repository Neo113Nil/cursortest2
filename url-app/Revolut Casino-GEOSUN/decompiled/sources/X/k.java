package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import u0.C0247g;
import v0.l;

/* loaded from: classes.dex */
public final class k implements V.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f1077c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1078d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f1079a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1080b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f1079a = iVar;
        if (iVar != null) {
            iVar.h(new A.j(12, this));
        }
    }

    @Override // V.a
    public final void a(U.i iVar) {
        synchronized (f1078d) {
            try {
                if (this.f1079a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f1080b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f1075b == iVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f1080b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f1074a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f1080b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f1074a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar2 = this.f1079a;
                    if (iVar2 != null) {
                        iVar2.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, U.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0247g c0247g = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f3013e;
        if (activity != null) {
            ReentrantLock reentrantLock = f1078d;
            reentrantLock.lock();
            try {
                i iVar2 = this.f1079a;
                if (iVar2 == null) {
                    iVar.accept(new U.k(lVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f1080b;
                boolean z2 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f1074a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, dVar, iVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f1074a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    U.k kVar = jVar2 != null ? jVar2.f1076c : null;
                    if (kVar != null) {
                        jVar.f1076c = kVar;
                        jVar.f1075b.accept(kVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar2.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar2, activity));
                    }
                }
                reentrantLock.unlock();
                c0247g = C0247g.f3005a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0247g == null) {
            iVar.accept(new U.k(lVar));
        }
    }
}
