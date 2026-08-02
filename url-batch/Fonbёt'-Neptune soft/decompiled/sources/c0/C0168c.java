package c0;

import F0.h;
import G0.l;
import Q0.p;
import a0.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import b0.InterfaceC0164a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168c implements InterfaceC0164a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1984a;

    /* renamed from: b, reason: collision with root package name */
    public final W.a f1985b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1986c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1987d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1988e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1989f = new LinkedHashMap();

    public C0168c(WindowLayoutComponent windowLayoutComponent, W.a aVar) {
        this.f1984a = windowLayoutComponent;
        this.f1985b = aVar;
    }

    @Override // b0.InterfaceC0164a
    public final void a(Context context, N.d dVar, i iVar) {
        h hVar;
        ReentrantLock reentrantLock = this.f1986c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1987d;
        try {
            C0171f c0171f = (C0171f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1988e;
            if (c0171f != null) {
                c0171f.b(iVar);
                linkedHashMap2.put(iVar, context);
                hVar = h.f469a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                C0171f c0171f2 = new C0171f(context);
                linkedHashMap.put(context, c0171f2);
                linkedHashMap2.put(iVar, context);
                c0171f2.b(iVar);
                if (!(context instanceof Activity)) {
                    c0171f2.accept(new WindowLayoutInfo(l.f490e));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1989f.put(c0171f2, this.f1985b.a(this.f1984a, p.a(WindowLayoutInfo.class), (Activity) context, new C0167b(c0171f2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // b0.InterfaceC0164a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f1986c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1988e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1987d;
            C0171f c0171f = (C0171f) linkedHashMap2.get(context);
            if (c0171f == null) {
                return;
            }
            c0171f.d(iVar);
            linkedHashMap.remove(iVar);
            if (c0171f.f1997d.isEmpty()) {
                linkedHashMap2.remove(context);
                X.d dVar = (X.d) this.f1989f.remove(c0171f);
                if (dVar != null) {
                    dVar.f1127a.invoke(dVar.f1128b, dVar.f1129c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
