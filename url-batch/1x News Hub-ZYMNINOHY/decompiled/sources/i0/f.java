package i0;

import E1.p;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g0.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f implements D.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5082a;

    /* renamed from: c, reason: collision with root package name */
    public j f5084c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5083b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5085d = new LinkedHashSet();

    public f(Context context) {
        this.f5082a = context;
    }

    @Override // D.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        kotlin.jvm.internal.j.e(value, "value");
        ReentrantLock reentrantLock = this.f5083b;
        reentrantLock.lock();
        try {
            this.f5084c = e.b(this.f5082a, value);
            Iterator it = this.f5085d.iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).accept(this.f5084c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(p pVar) {
        ReentrantLock reentrantLock = this.f5083b;
        reentrantLock.lock();
        try {
            j jVar = this.f5084c;
            if (jVar != null) {
                pVar.accept(jVar);
            }
            this.f5085d.add(pVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
