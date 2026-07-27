package o0;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import m0.k;

/* loaded from: classes.dex */
public final class f implements D.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11494a;

    /* renamed from: c, reason: collision with root package name */
    public k f11496c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11495b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11497d = new LinkedHashSet();

    public f(Context context) {
        this.f11494a = context;
    }

    @Override // D.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        i.e(value, "value");
        ReentrantLock reentrantLock = this.f11495b;
        reentrantLock.lock();
        try {
            this.f11496c = e.b(this.f11494a, value);
            Iterator it = this.f11497d.iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).accept(this.f11496c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(m0.i iVar) {
        ReentrantLock reentrantLock = this.f11495b;
        reentrantLock.lock();
        try {
            k kVar = this.f11496c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f11497d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f11497d.isEmpty();
    }

    public final void d(m0.i iVar) {
        ReentrantLock reentrantLock = this.f11495b;
        reentrantLock.lock();
        try {
            this.f11497d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
