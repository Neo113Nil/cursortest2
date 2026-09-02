package x;

import D.C0018t;
import U.g;
import V.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.l;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n.ExecutorC0078e;
import s.C0096d;
import w.InterfaceC0112a;

/* loaded from: classes.dex */
public final class c implements InterfaceC0112a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1295a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f1296b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1297c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1298d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1299e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1300f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, r.b bVar) {
        this.f1295a = windowLayoutComponent;
        this.f1296b = bVar;
    }

    @Override // w.InterfaceC0112a
    public final void a(Context context, ExecutorC0078e executorC0078e, C0018t c0018t) {
        g gVar;
        ReentrantLock reentrantLock = this.f1297c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1298d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1299e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(m.f386b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1300f.put(fVar2, this.f1296b.a(this.f1295a, l.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // w.InterfaceC0112a
    public final void b(C0018t c0018t) {
        ReentrantLock reentrantLock = this.f1297c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1299e;
        try {
            Context context = (Context) linkedHashMap.get(c0018t);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1298d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(c0018t);
            linkedHashMap.remove(c0018t);
            if (fVar.f1308d.isEmpty()) {
                linkedHashMap2.remove(context);
                C0096d c0096d = (C0096d) this.f1300f.remove(fVar);
                if (c0096d != null) {
                    c0096d.f1242a.invoke(c0096d.f1243b, c0096d.f1244c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
