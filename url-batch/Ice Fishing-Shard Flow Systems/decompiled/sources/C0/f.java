package C0;

import A0.i;
import A0.l;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements H.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f284a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f285b;

    /* renamed from: c, reason: collision with root package name */
    public l f286c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f287d;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f284a = context;
        this.f285b = new ReentrantLock();
        this.f287d = new LinkedHashSet();
    }

    @Override // H.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.f285b;
        reentrantLock.lock();
        try {
            this.f286c = e.c(this.f284a, value);
            Iterator it = this.f287d.iterator();
            while (it.hasNext()) {
                ((H.a) it.next()).accept(this.f286c);
            }
            Unit unit = Unit.f6114a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f285b;
        reentrantLock.lock();
        try {
            l lVar = this.f286c;
            if (lVar != null) {
                listener.accept(lVar);
            }
            this.f287d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
