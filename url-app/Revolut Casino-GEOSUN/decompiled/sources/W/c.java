package W;

import F0.q;
import U.i;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import u0.C0247g;
import v0.l;

/* loaded from: classes.dex */
public final class c implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1048a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.a f1049b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f1050c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1051d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1052e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1053f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, Q.a aVar) {
        this.f1048a = windowLayoutComponent;
        this.f1049b = aVar;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1050c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1052e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1051d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f1061d.isEmpty()) {
                linkedHashMap2.remove(context);
                R.d dVar = (R.d) this.f1053f.remove(fVar);
                if (dVar != null) {
                    dVar.f875a.invoke(dVar.f876b, dVar.f877c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        C0247g c0247g;
        ReentrantLock reentrantLock = this.f1050c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1051d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1052e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                c0247g = C0247g.f3005a;
            } else {
                c0247g = null;
            }
            if (c0247g == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f3013e));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f1053f.put(fVar2, this.f1049b.a(this.f1048a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
