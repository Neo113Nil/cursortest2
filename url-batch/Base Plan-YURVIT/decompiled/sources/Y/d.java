package Y;

import D0.h;
import W.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements X.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f997a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f998b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f999c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1000d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f997a = windowLayoutComponent;
    }

    @Override // X.a
    public final void a(i iVar) {
        LinkedHashMap linkedHashMap = this.f999c;
        LinkedHashMap linkedHashMap2 = this.f1000d;
        ReentrantLock reentrantLock = this.f998b;
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
                    this.f997a.removeWindowLayoutInfoListener(fVar);
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
        LinkedHashMap linkedHashMap = this.f999c;
        ReentrantLock reentrantLock = this.f998b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1000d;
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
                this.f997a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
