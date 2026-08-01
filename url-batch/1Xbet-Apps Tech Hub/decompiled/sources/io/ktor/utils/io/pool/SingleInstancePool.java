package io.ktor.utils.io.pool;

import io.ktor.utils.io.pool.ObjectPool;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pool.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/pool/SingleInstancePool;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "borrow", "()Ljava/lang/Object;", "", "dispose", "()V", "instance", "disposeInstance", "(Ljava/lang/Object;)V", "produceInstance", "recycle", "", "getCapacity", "()I", "capacity", "<init>", "ktor-io"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SingleInstancePool<T> implements ObjectPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater borrowed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "borrowed");
    private static final /* synthetic */ AtomicIntegerFieldUpdater disposed$FU = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "disposed");
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ Object instance = null;

    protected abstract void disposeInstance(T instance);

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final int getCapacity() {
        return 1;
    }

    protected abstract T produceInstance();

    @Override // io.ktor.utils.io.pool.ObjectPool, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ObjectPool.DefaultImpls.close(this);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void recycle(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!disposed$FU.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        disposeInstance(instance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.utils.io.pool.ObjectPool
    public final void dispose() {
        Object obj;
        if (!disposed$FU.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        disposeInstance(obj);
    }

    @Override // io.ktor.utils.io.pool.ObjectPool
    public final T borrow() {
        int i;
        do {
            i = this.borrowed;
            if (i != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!borrowed$FU.compareAndSet(this, i, 1));
        T produceInstance = produceInstance();
        this.instance = produceInstance;
        return produceInstance;
    }
}
