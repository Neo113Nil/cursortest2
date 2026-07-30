package W;

import U.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import u0.C0247g;

/* loaded from: classes.dex */
public final class d implements V.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f1054a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1055b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1056c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1057d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f1054a = windowLayoutComponent;
    }

    @Override // V.a
    public final void a(i iVar) {
        ReentrantLock reentrantLock = this.f1055b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1057d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f1056c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f1054a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // V.a
    public final void b(Context context, J.d dVar, i iVar) {
        C0247g c0247g;
        ReentrantLock reentrantLock = this.f1055b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f1056c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f1057d;
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
                this.f1054a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
