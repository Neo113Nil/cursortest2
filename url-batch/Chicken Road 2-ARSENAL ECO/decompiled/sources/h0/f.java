package h0;

import D3.p;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f0.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f implements C.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4329a;

    /* renamed from: c, reason: collision with root package name */
    public j f4331c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4330b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f4332d = new LinkedHashSet();

    public f(Context context) {
        this.f4329a = context;
    }

    @Override // C.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        i.e(value, "value");
        ReentrantLock reentrantLock = this.f4330b;
        reentrantLock.lock();
        try {
            this.f4331c = e.b(this.f4329a, value);
            Iterator it = this.f4332d.iterator();
            while (it.hasNext()) {
                ((C.a) it.next()).accept(this.f4331c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(p pVar) {
        ReentrantLock reentrantLock = this.f4330b;
        reentrantLock.lock();
        try {
            j jVar = this.f4331c;
            if (jVar != null) {
                pVar.accept(jVar);
            }
            this.f4332d.add(pVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
