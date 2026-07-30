package defpackage;

import com.facebook.internal.NativeProtocol;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vg2 extends v00 implements vs1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(vg2.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public vg2(long j, vg2 vg2Var, int i) {
        super(vg2Var);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.v00
    public final boolean f() {
        return f.get(this) == k() && c() != null;
    }

    public final boolean j() {
        return f.addAndGet(this, -65536) == k() && c() != null;
    }

    public abstract int k();

    public abstract void l(int i, CoroutineContext coroutineContext);

    public final void m() {
        if (f.incrementAndGet(this) == k()) {
            h();
        }
    }

    public final boolean n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == k() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST + i));
        return true;
    }
}
