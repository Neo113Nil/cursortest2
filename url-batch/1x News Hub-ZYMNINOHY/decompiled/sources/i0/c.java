package i0;

import E1.p;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import b0.s;
import b2.C0195i;
import c2.m;
import h0.InterfaceC0338a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c implements InterfaceC0338a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5073a;

    /* renamed from: b, reason: collision with root package name */
    public final s f5074b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f5075c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5076d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f5077e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, s sVar) {
        this.f5073a = windowLayoutComponent;
        this.f5074b = sVar;
    }

    @Override // h0.InterfaceC0338a
    public final void a(p pVar) {
        ReentrantLock reentrantLock = this.f5075c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5077e;
        try {
            Context context = (Context) linkedHashMap.get(pVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5076d;
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
                    d0.d dVar = (d0.d) this.f.remove(fVar);
                    if (dVar != null) {
                        dVar.f4915a.invoke(dVar.f4916b, dVar.f4917c);
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

    @Override // h0.InterfaceC0338a
    public final void b(Context context, S.c cVar, p pVar) {
        C0195i c0195i;
        ReentrantLock reentrantLock = this.f5075c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5076d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f5077e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(m.f2637a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(fVar2, this.f5074b.e(this.f5073a, r.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
