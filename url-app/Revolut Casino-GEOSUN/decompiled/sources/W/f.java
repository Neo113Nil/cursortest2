package W;

import F0.i;
import U.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import v.InterfaceC0248a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0248a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1058a;

    /* renamed from: c, reason: collision with root package name */
    public k f1060c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1059b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1061d = new LinkedHashSet();

    public f(Context context) {
        this.f1058a = context;
    }

    @Override // v.InterfaceC0248a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1059b;
        reentrantLock.lock();
        try {
            this.f1060c = e.c(this.f1058a, windowLayoutInfo);
            Iterator it = this.f1061d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0248a) it.next()).accept(this.f1060c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(U.i iVar) {
        ReentrantLock reentrantLock = this.f1059b;
        reentrantLock.lock();
        try {
            k kVar = this.f1060c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1061d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1061d.isEmpty();
    }

    public final void d(U.i iVar) {
        ReentrantLock reentrantLock = this.f1059b;
        reentrantLock.lock();
        try {
            this.f1061d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
