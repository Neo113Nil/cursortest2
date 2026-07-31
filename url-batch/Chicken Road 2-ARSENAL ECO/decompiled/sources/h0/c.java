package h0;

import D3.p;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import b0.C0263b;
import c0.C0271d;
import g0.InterfaceC0390a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k5.v;
import kotlin.jvm.internal.t;
import l5.C0512p;

/* loaded from: classes.dex */
public final class c implements InterfaceC0390a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final C0263b f4320b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4321c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4322d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4323e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4324f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, C0263b c0263b) {
        this.f4319a = windowLayoutComponent;
        this.f4320b = c0263b;
    }

    @Override // g0.InterfaceC0390a
    public final void a(p pVar) {
        LinkedHashMap linkedHashMap = this.f4322d;
        LinkedHashMap linkedHashMap2 = this.f4323e;
        ReentrantLock reentrantLock = this.f4321c;
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
                    C0271d c0271d = (C0271d) this.f4324f.remove(fVar);
                    if (c0271d != null) {
                        c0271d.f3757a.invoke(c0271d.f3758b, c0271d.f3759c);
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

    @Override // g0.InterfaceC0390a
    public final void b(Context context, P.c cVar, p pVar) {
        v vVar;
        LinkedHashMap linkedHashMap = this.f4322d;
        ReentrantLock reentrantLock = this.f4321c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4323e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(C0512p.f5303f));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f4324f.put(fVar2, this.f4320b.a(this.f4319a, t.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
