package x;

import D.C0018t;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k.InterfaceC0041a;
import v.C0108k;

/* loaded from: classes.dex */
public final class f implements InterfaceC0041a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1305a;

    /* renamed from: c, reason: collision with root package name */
    public C0108k f1307c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1306b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1308d = new LinkedHashSet();

    public f(Context context) {
        this.f1305a = context;
    }

    @Override // k.InterfaceC0041a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1306b;
        reentrantLock.lock();
        try {
            this.f1307c = e.b(this.f1305a, windowLayoutInfo);
            Iterator it = this.f1308d.iterator();
            while (it.hasNext()) {
                ((InterfaceC0041a) it.next()).accept(this.f1307c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0018t c0018t) {
        ReentrantLock reentrantLock = this.f1306b;
        reentrantLock.lock();
        try {
            C0108k c0108k = this.f1307c;
            if (c0108k != null) {
                c0018t.accept(c0108k);
            }
            this.f1308d.add(c0018t);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1308d.isEmpty();
    }

    public final void d(C0018t c0018t) {
        ReentrantLock reentrantLock = this.f1306b;
        reentrantLock.lock();
        try {
            this.f1308d.remove(c0018t);
        } finally {
            reentrantLock.unlock();
        }
    }
}
