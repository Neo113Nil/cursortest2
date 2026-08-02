package c0;

import Q0.h;
import a0.i;
import a0.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171f implements z.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1994a;

    /* renamed from: c, reason: collision with root package name */
    public k f1996c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1995b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f1997d = new LinkedHashSet();

    public C0171f(Context context) {
        this.f1994a = context;
    }

    @Override // z.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f1995b;
        reentrantLock.lock();
        try {
            this.f1996c = AbstractC0170e.c(this.f1994a, windowLayoutInfo);
            Iterator it = this.f1997d.iterator();
            while (it.hasNext()) {
                ((z.a) it.next()).accept(this.f1996c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f1995b;
        reentrantLock.lock();
        try {
            k kVar = this.f1996c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f1997d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f1997d.isEmpty();
    }

    public final void d(i iVar) {
        ReentrantLock reentrantLock = this.f1995b;
        reentrantLock.lock();
        try {
            this.f1997d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
