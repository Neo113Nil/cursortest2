package A1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c3.C0297i;
import d3.q;
import j1.ExecutorC1174c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import y1.i;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1581a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f52a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.b f53b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f54c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f55d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f56e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f57f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, u1.b bVar) {
        this.f52a = windowLayoutComponent;
        this.f53b = bVar;
    }

    @Override // z1.InterfaceC1581a
    public final void a(Context context, ExecutorC1174c executorC1174c, i iVar) {
        C0297i c0297i;
        LinkedHashMap linkedHashMap = this.f55d;
        ReentrantLock reentrantLock = this.f54c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f56e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                c0297i = C0297i.f5732a;
            } else {
                c0297i = null;
            }
            if (c0297i == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(q.f8333a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f57f.put(fVar2, this.f53b.a(this.f52a, kotlin.jvm.internal.q.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // z1.InterfaceC1581a
    public final void b(i iVar) {
        LinkedHashMap linkedHashMap = this.f55d;
        LinkedHashMap linkedHashMap2 = this.f56e;
        ReentrantLock reentrantLock = this.f54c;
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
            LinkedHashSet linkedHashSet = fVar.f65d;
            ReentrantLock reentrantLock2 = fVar.f63b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(iVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(iVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    v1.d dVar = (v1.d) this.f57f.remove(fVar);
                    if (dVar != null) {
                        dVar.f15542a.invoke(dVar.f15543b, dVar.f15544c);
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
}
