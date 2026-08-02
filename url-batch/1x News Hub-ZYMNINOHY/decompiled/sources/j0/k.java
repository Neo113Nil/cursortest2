package j0;

import E1.p;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import b0.r;
import b2.C0195i;
import c2.m;
import h0.InterfaceC0338a;
import io.flutter.plugin.platform.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements InterfaceC0338a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile k f9511c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f9512d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final i f9513a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f9514b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f9513a = iVar;
        if (iVar != null) {
            iVar.d(new r(this));
        }
    }

    @Override // h0.InterfaceC0338a
    public final void a(p pVar) {
        synchronized (f9512d) {
            try {
                if (this.f9513a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f9514b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f9509b == pVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f9514b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f9508a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9514b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f9508a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar = this.f9513a;
                    if (iVar != null) {
                        iVar.b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.InterfaceC0338a
    public final void b(Context context, S.c cVar, p pVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        C0195i c0195i = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        m mVar = m.f2637a;
        if (activity != null) {
            ReentrantLock reentrantLock = f9512d;
            reentrantLock.lock();
            try {
                i iVar = this.f9513a;
                if (iVar == null) {
                    pVar.accept(new g0.j(mVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f9514b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f9508a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, cVar, pVar);
                copyOnWriteArrayList.add(jVar);
                if (z) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f9508a)) {
                                break;
                            }
                        }
                    }
                    j jVar2 = (j) obj;
                    g0.j jVar3 = jVar2 != null ? jVar2.f9510c : null;
                    if (jVar3 != null) {
                        jVar.f9510c = jVar3;
                        jVar.f9509b.accept(jVar3);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new B(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                c0195i = C0195i.f2555a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0195i == null) {
            pVar.accept(new g0.j(mVar));
        }
    }
}
