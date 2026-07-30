package y;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import w.j;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f implements k.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1246a;

    /* renamed from: c, reason: collision with root package name */
    public j f1248c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1247b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1249d = new LinkedHashSet();

    public f(Context context) {
        this.f1246a = context;
    }

    @Override // k.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f1247b;
        reentrantLock.lock();
        try {
            this.f1248c = e.b(this.f1246a, windowLayoutInfo);
            Iterator it = this.f1249d.iterator();
            while (it.hasNext()) {
                ((k.a) it.next()).accept(this.f1248c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(q qVar) {
        ReentrantLock reentrantLock = this.f1247b;
        reentrantLock.lock();
        try {
            j jVar = this.f1248c;
            if (jVar != null) {
                qVar.accept(jVar);
            }
            this.f1249d.add(qVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
