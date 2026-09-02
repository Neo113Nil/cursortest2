package x;

import D.C0018t;
import U.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC0078e;
import w.InterfaceC0112a;

/* loaded from: classes.dex */
public final class d implements InterfaceC0112a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1301a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1302b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1303c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1304d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1301a = windowLayoutComponent;
    }

    @Override // w.InterfaceC0112a
    public final void a(Context context, ExecutorC0078e executorC0078e, C0018t c0018t) {
        g gVar;
        ReentrantLock reentrantLock = this.f1302b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1303c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1304d;
            if (fVar != null) {
                fVar.b(c0018t);
                linkedHashMap2.put(c0018t, context);
                gVar = g.f378a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(c0018t, context);
                fVar2.b(c0018t);
                this.f1301a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // w.InterfaceC0112a
    public final void b(C0018t c0018t) {
        ReentrantLock reentrantLock = this.f1302b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1304d;
        try {
            Context context = (Context) linkedHashMap.get(c0018t);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1303c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(c0018t);
            linkedHashMap.remove(c0018t);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1301a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
