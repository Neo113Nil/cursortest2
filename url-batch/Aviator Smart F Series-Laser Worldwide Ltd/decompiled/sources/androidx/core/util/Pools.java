package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t7);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(@IntRange(from = 1) int i8) {
            if (i8 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.pool = new Object[i8];
        }

        private final boolean isInPool(T t7) {
            int i8 = this.poolSize;
            for (int i9 = 0; i9 < i8; i9++) {
                if (this.pool[i9] == t7) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i8 = this.poolSize;
            if (i8 <= 0) {
                return null;
            }
            int i9 = i8 - 1;
            T t7 = (T) this.pool[i9];
            s.checkNotNull(t7, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i9] = null;
            this.poolSize--;
            return t7;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            s.checkNotNullParameter(instance, "instance");
            if (!(!isInPool(instance))) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i8 = this.poolSize;
            Object[] objArr = this.pool;
            if (i8 >= objArr.length) {
                return false;
            }
            objArr[i8] = instance;
            this.poolSize = i8 + 1;
            return true;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i8) {
            super(i8);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t7;
            synchronized (this.lock) {
                t7 = (T) super.acquire();
            }
            return t7;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean release;
            s.checkNotNullParameter(instance, "instance");
            synchronized (this.lock) {
                release = super.release(instance);
            }
            return release;
        }
    }

    private Pools() {
    }
}
