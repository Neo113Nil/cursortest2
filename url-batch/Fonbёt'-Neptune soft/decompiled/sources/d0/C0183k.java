package d0;

import B.m;
import G0.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import b0.InterfaceC0164a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: d0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183k implements InterfaceC0164a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0183k f2056c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f2057d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final C0181i f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f2059b = new CopyOnWriteArrayList();

    public C0183k(C0181i c0181i) {
        this.f2058a = c0181i;
        if (c0181i != null) {
            c0181i.h(new m(18, this));
        }
    }

    @Override // b0.InterfaceC0164a
    public final void a(Context context, N.d dVar, a0.i iVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        F0.h hVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f490e;
        if (activity != null) {
            ReentrantLock reentrantLock = f2057d;
            reentrantLock.lock();
            try {
                C0181i c0181i = this.f2058a;
                if (c0181i == null) {
                    iVar.accept(new a0.k(lVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f2059b;
                boolean z2 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((C0182j) it.next()).f2053a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                C0182j c0182j = new C0182j(activity, dVar, iVar);
                copyOnWriteArrayList.add(c0182j);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((C0182j) obj).f2053a)) {
                                break;
                            }
                        }
                    }
                    C0182j c0182j2 = (C0182j) obj;
                    a0.k kVar = c0182j2 != null ? c0182j2.f2055c : null;
                    if (kVar != null) {
                        c0182j.f2055c = kVar;
                        c0182j.f2054b.accept(kVar);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        c0181i.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0180h(c0181i, activity));
                    }
                }
                reentrantLock.unlock();
                hVar = F0.h.f469a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (hVar == null) {
            iVar.accept(new a0.k(lVar));
        }
    }

    @Override // b0.InterfaceC0164a
    public final void b(a0.i iVar) {
        synchronized (f2057d) {
            try {
                if (this.f2058a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f2059b.iterator();
                while (it.hasNext()) {
                    C0182j c0182j = (C0182j) it.next();
                    if (c0182j.f2054b == iVar) {
                        arrayList.add(c0182j);
                    }
                }
                this.f2059b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C0182j) it2.next()).f2053a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f2059b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((C0182j) it3.next()).f2053a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    C0181i c0181i = this.f2058a;
                    if (c0181i != null) {
                        c0181i.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
