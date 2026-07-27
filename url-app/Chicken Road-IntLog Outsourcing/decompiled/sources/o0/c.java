package o0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f4.v;
import g4.C0471p;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;
import m0.i;
import n0.InterfaceC1296a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1296a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f11484a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.b f11485b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f11486c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11487d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f11488e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f11489f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, i0.b bVar) {
        this.f11484a = windowLayoutComponent;
        this.f11485b = bVar;
    }

    @Override // n0.InterfaceC1296a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f11486c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f11488e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f11487d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f11497d.isEmpty()) {
                linkedHashMap2.remove(context);
                j0.d dVar = (j0.d) this.f11489f.remove(fVar);
                if (dVar != null) {
                    dVar.f10447a.invoke(dVar.f10448b, dVar.f10449c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // n0.InterfaceC1296a
    public final void b(Context context, U.d dVar, i iVar) {
        v vVar;
        ReentrantLock reentrantLock = this.f11486c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f11487d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f11488e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                vVar = v.f5689a;
            } else {
                vVar = null;
            }
            if (vVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(C0471p.f5750a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f11489f.put(fVar2, this.f11485b.a(this.f11484a, t.a(WindowLayoutInfo.class), (Activity) context, new C1355b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
