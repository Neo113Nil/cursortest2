package w;

import E.s;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k.InterfaceC0039a;
import u.k;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100f implements InterfaceC0039a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1302a;

    /* renamed from: c, reason: collision with root package name */
    public k f1304c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1303b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1305d = new LinkedHashSet();

    public C0100f(Context context) {
        this.f1302a = context;
    }

    @Override // k.InterfaceC0039a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1303b;
        reentrantLock.lock();
        try {
            this.f1304c = AbstractC0099e.b(this.f1302a, windowLayoutInfo);
            Iterator it = this.f1305d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0039a) it.next()).accept(this.f1304c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(s sVar) {
        ReentrantLock reentrantLock = this.f1303b;
        reentrantLock.lock();
        try {
            k kVar = this.f1304c;
            if (kVar != null) {
                sVar.accept(kVar);
            }
            this.f1305d.add(sVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1305d.isEmpty();
    }

    public final void d(s sVar) {
        ReentrantLock reentrantLock = this.f1303b;
        reentrantLock.lock();
        try {
            this.f1305d.remove(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
