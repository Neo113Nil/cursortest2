package w;

import E.s;
import U.g;
import V.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.l;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import m.ExecutorC0069e;
import v.InterfaceC0094a;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097c implements InterfaceC0094a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1292a;

    /* renamed from: b, reason: collision with root package name */
    public final q.b f1293b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1294c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1295d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1296e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1297f = new LinkedHashMap();

    public C0097c(WindowLayoutComponent windowLayoutComponent, q.b bVar) {
        this.f1292a = windowLayoutComponent;
        this.f1293b = bVar;
    }

    @Override // v.InterfaceC0094a
    public final void a(Context context, ExecutorC0069e executorC0069e, s sVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f1294c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1295d;
        try {
            C0100f c0100f = (C0100f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1296e;
            if (c0100f != null) {
                c0100f.b(sVar);
                linkedHashMap2.put(sVar, context);
                gVar = g.f433a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                C0100f c0100f2 = new C0100f(context);
                linkedHashMap.put(context, c0100f2);
                linkedHashMap2.put(sVar, context);
                c0100f2.b(sVar);
                if (!(context instanceof Activity)) {
                    c0100f2.accept(new WindowLayoutInfo(m.f441b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1297f.put(c0100f2, this.f1293b.a(this.f1292a, l.a(WindowLayoutInfo.class), (Activity) context, new C0096b(c0100f2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // v.InterfaceC0094a
    public final void b(s sVar) {
        ReentrantLock reentrantLock = this.f1294c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1296e;
        try {
            Context context = (Context) linkedHashMap.get(sVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1295d;
            C0100f c0100f = (C0100f) linkedHashMap2.get(context);
            if (c0100f == null) {
                return;
            }
            c0100f.d(sVar);
            linkedHashMap.remove(sVar);
            if (c0100f.f1305d.isEmpty()) {
                linkedHashMap2.remove(context);
                r.d dVar = (r.d) this.f1297f.remove(c0100f);
                if (dVar != null) {
                    dVar.f1239a.invoke(dVar.f1240b, dVar.f1241c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
