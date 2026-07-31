package Y;

import D0.h;
import E0.o;
import P0.p;
import W.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c implements X.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f991a;

    /* renamed from: b, reason: collision with root package name */
    public final S.a f992b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f993c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f994d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f995e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f996f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, S.a aVar) {
        this.f991a = windowLayoutComponent;
        this.f992b = aVar;
    }

    @Override // X.a
    public final void a(i iVar) {
        LinkedHashMap linkedHashMap = this.f994d;
        LinkedHashMap linkedHashMap2 = this.f995e;
        ReentrantLock reentrantLock = this.f993c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(iVar);
            if (context == null) {
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f1004d;
            ReentrantLock reentrantLock2 = fVar.f1002b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(iVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(iVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    T.d dVar = (T.d) this.f996f.remove(fVar);
                    if (dVar != null) {
                        dVar.f837a.invoke(dVar.f838b, dVar.f839c);
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

    @Override // X.a
    public final void b(Context context, L.e eVar, i iVar) {
        h hVar;
        LinkedHashMap linkedHashMap = this.f994d;
        ReentrantLock reentrantLock = this.f993c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f995e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                hVar = h.f206a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(o.f219e));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f996f.put(fVar2, this.f992b.a(this.f991a, p.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
