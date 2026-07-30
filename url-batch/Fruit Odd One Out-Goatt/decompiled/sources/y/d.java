package y;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import e0.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import t0.g;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d implements x.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1242a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1243b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1244c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1245d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1242a = windowLayoutComponent;
    }

    @Override // x.a
    public final void a(q qVar) {
        LinkedHashMap linkedHashMap = this.f1244c;
        LinkedHashMap linkedHashMap2 = this.f1245d;
        ReentrantLock reentrantLock = this.f1243b;
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
                    this.f1242a.removeWindowLayoutInfoListener(fVar);
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
        LinkedHashMap linkedHashMap = this.f1244c;
        ReentrantLock reentrantLock = this.f1243b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1245d;
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
                this.f1242a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
