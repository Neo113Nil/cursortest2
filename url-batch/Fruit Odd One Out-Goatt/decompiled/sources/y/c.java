package y;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import t0.g;
import u0.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements x.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final s.b f1237b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1238c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1239d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1240e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1241f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, s.b bVar) {
        this.f1236a = windowLayoutComponent;
        this.f1237b = bVar;
    }

    @Override // x.a
    public final void a(q qVar) {
        LinkedHashMap linkedHashMap = this.f1239d;
        LinkedHashMap linkedHashMap2 = this.f1240e;
        ReentrantLock reentrantLock = this.f1238c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(qVar);
            if (context == null) {
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f1249d;
            ReentrantLock reentrantLock2 = fVar.f1247b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(qVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(qVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    t.d dVar = (t.d) this.f1241f.remove(fVar);
                    if (dVar != null) {
                        dVar.f1155a.invoke(dVar.f1156b, dVar.f1157c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x.a
    public final void b(Context context, o.e eVar, q qVar) {
        g gVar;
        LinkedHashMap linkedHashMap = this.f1239d;
        ReentrantLock reentrantLock = this.f1238c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1240e;
            if (fVar != null) {
                fVar.b(qVar);
                linkedHashMap2.put(qVar, context);
                gVar = g.f1178a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(qVar, context);
                fVar2.b(qVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f1186b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1241f.put(fVar2, this.f1237b.a(this.f1236a, d1.l.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
