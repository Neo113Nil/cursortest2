package i0;

import E1.p;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import b2.C0195i;
import h0.InterfaceC0338a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements InterfaceC0338a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5078a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5079b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5080c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5081d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f5078a = windowLayoutComponent;
    }

    @Override // h0.InterfaceC0338a
    public final void a(p pVar) {
        ReentrantLock reentrantLock = this.f5079b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5081d;
        try {
            Context context = (Context) linkedHashMap.get(pVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5080c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = fVar.f5083b;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = fVar.f5085d;
            try {
                linkedHashSet.remove(pVar);
                reentrantLock2.unlock();
                linkedHashMap.remove(pVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    this.f5078a.removeWindowLayoutInfoListener(fVar);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // h0.InterfaceC0338a
    public final void b(Context context, S.c cVar, p pVar) {
        C0195i c0195i;
        ReentrantLock reentrantLock = this.f5079b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5080c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f5081d;
            if (fVar != null) {
                fVar.b(pVar);
                linkedHashMap2.put(pVar, context);
                c0195i = C0195i.f2555a;
            } else {
                c0195i = null;
            }
            if (c0195i == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(pVar, context);
                fVar2.b(pVar);
                this.f5078a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
