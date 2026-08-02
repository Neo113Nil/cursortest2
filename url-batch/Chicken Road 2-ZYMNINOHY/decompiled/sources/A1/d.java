package A1;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import c3.C0297i;
import j1.ExecutorC1174c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import y1.i;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class d implements InterfaceC1581a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f58a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f59b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f60c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f61d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f58a = windowLayoutComponent;
    }

    @Override // z1.InterfaceC1581a
    public final void a(Context context, ExecutorC1174c executorC1174c, i iVar) {
        C0297i c0297i;
        LinkedHashMap linkedHashMap = this.f60c;
        ReentrantLock reentrantLock = this.f59b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f61d;
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
                this.f58a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // z1.InterfaceC1581a
    public final void b(i iVar) {
        LinkedHashMap linkedHashMap = this.f60c;
        LinkedHashMap linkedHashMap2 = this.f61d;
        ReentrantLock reentrantLock = this.f59b;
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
                    this.f58a.removeWindowLayoutInfoListener(fVar);
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
