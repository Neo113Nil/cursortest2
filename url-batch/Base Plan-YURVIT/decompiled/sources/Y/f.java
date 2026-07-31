package Y;

import P0.h;
import W.i;
import W.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import x.InterfaceC0249a;

/* loaded from: classes.dex */
public final class f implements InterfaceC0249a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1001a;

    /* renamed from: c, reason: collision with root package name */
    public k f1003c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1002b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1004d = new LinkedHashSet();

    public f(Context context) {
        this.f1001a = context;
    }

    @Override // x.InterfaceC0249a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1002b;
        reentrantLock.lock();
        try {
            this.f1003c = e.c(this.f1001a, windowLayoutInfo);
            Iterator it = this.f1004d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0249a) it.next()).accept(this.f1003c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f1002b;
        reentrantLock.lock();
        try {
            k kVar = this.f1003c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1004d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
