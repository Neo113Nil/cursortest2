package h0;

import D3.p;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import g0.InterfaceC0390a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k5.v;

/* loaded from: classes.dex */
public final class d implements InterfaceC0390a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4325a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4326b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4327c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4328d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f4325a = windowLayoutComponent;
    }

    @Override // g0.InterfaceC0390a
    public final void a(p pVar) {
        LinkedHashMap linkedHashMap = this.f4327c;
        LinkedHashMap linkedHashMap2 = this.f4328d;
        ReentrantLock reentrantLock = this.f4326b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(pVar);
            if (context == null) {
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f4332d;
            ReentrantLock reentrantLock2 = fVar.f4330b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(pVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(pVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f4325a.removeWindowLayoutInfoListener(fVar);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // g0.InterfaceC0390a
    public final void b(Context context, P.c cVar, p pVar) {
        v vVar;
        LinkedHashMap linkedHashMap = this.f4327c;
        ReentrantLock reentrantLock = this.f4326b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4328d;
            if (fVar != null) {
                fVar.b(pVar);
                linkedHashMap2.put(pVar, context);
                vVar = v.f5219a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(pVar, context);
                fVar2.b(pVar);
                this.f4325a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
