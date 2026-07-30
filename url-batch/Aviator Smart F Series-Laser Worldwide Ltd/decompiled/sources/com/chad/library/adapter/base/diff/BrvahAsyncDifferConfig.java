package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes2.dex */
public final class BrvahAsyncDifferConfig<T> {
    private final Executor backgroundThreadExecutor;
    private final DiffUtil.ItemCallback<T> diffCallback;
    private final Executor mainThreadExecutor;

    public static final class Builder<T> {
        private static Executor sDiffExecutor;
        private Executor mBackgroundThreadExecutor;
        private final DiffUtil.ItemCallback<T> mDiffCallback;
        private Executor mMainThreadExecutor;
        public static final Companion Companion = new Companion(null);
        private static final Object sExecutorLock = new Object();

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public Builder(DiffUtil.ItemCallback<T> mDiffCallback) {
            s.checkNotNullParameter(mDiffCallback, "mDiffCallback");
            this.mDiffCallback = mDiffCallback;
        }

        public final BrvahAsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    try {
                        if (sDiffExecutor == null) {
                            sDiffExecutor = Executors.newFixedThreadPool(2);
                        }
                        w wVar = w.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            Executor executor = this.mMainThreadExecutor;
            Executor executor2 = this.mBackgroundThreadExecutor;
            s.checkNotNull(executor2);
            return new BrvahAsyncDifferConfig<>(executor, executor2, this.mDiffCallback);
        }

        public final Builder<T> setBackgroundThreadExecutor(Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        public final Builder<T> setMainThreadExecutor(Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }
    }

    public BrvahAsyncDifferConfig(Executor executor, Executor backgroundThreadExecutor, DiffUtil.ItemCallback<T> diffCallback) {
        s.checkNotNullParameter(backgroundThreadExecutor, "backgroundThreadExecutor");
        s.checkNotNullParameter(diffCallback, "diffCallback");
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = backgroundThreadExecutor;
        this.diffCallback = diffCallback;
    }

    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    public final DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.diffCallback;
    }

    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }
}
