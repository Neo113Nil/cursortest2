package A1;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import y1.k;

/* loaded from: classes.dex */
public final class f implements D.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62a;

    /* renamed from: c, reason: collision with root package name */
    public k f64c;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f63b = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f65d = new LinkedHashSet();

    public f(Context context) {
        this.f62a = context;
    }

    @Override // D.a, androidx.window.extensions.core.util.function.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        i.e(value, "value");
        ReentrantLock reentrantLock = this.f63b;
        reentrantLock.lock();
        try {
            this.f64c = e.b(this.f62a, value);
            Iterator it = this.f65d.iterator();
            while (it.hasNext()) {
                ((D.a) it.next()).accept(this.f64c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(y1.i iVar) {
        ReentrantLock reentrantLock = this.f63b;
        reentrantLock.lock();
        try {
            k kVar = this.f64c;
            if (kVar != null) {
                iVar.accept(kVar);
            }
            this.f65d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
