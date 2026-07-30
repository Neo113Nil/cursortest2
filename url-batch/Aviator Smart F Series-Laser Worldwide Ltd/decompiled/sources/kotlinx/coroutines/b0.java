package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public class b0 {
    private static final AtomicIntegerFieldUpdater _handled$FU = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_handled");
    private volatile int _handled;
    public final Throwable cause;

    public b0(Throwable th, boolean z7) {
        this.cause = th;
        this._handled = z7 ? 1 : 0;
    }

    public final boolean getHandled() {
        return _handled$FU.get(this) != 0;
    }

    public final boolean makeHandled() {
        return _handled$FU.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return k0.getClassSimpleName(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ b0(Throwable th, boolean z7, int i8, kotlin.jvm.internal.o oVar) {
        this(th, (i8 & 2) != 0 ? false : z7);
    }
}
