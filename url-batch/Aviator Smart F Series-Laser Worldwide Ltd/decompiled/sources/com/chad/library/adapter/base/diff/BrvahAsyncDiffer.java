package com.chad.library.adapter.base.diff;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class BrvahAsyncDiffer<T> implements DifferImp<T> {
    private final BaseQuickAdapter<T, ?> adapter;
    private final BrvahAsyncDifferConfig<T> config;
    private final List<ListChangeListener<T>> mListeners;
    private Executor mMainThreadExecutor;
    private int mMaxScheduledGeneration;
    private final ListUpdateCallback mUpdateCallback;
    private final Executor sMainThreadExecutor;

    private static final class MainThreadExecutor implements Executor {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            s.checkNotNullParameter(command, "command");
            this.mHandler.post(command);
        }

        public final Handler getMHandler() {
            return this.mHandler;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor] */
    public BrvahAsyncDiffer(BaseQuickAdapter<T, ?> adapter, BrvahAsyncDifferConfig<T> config) {
        s.checkNotNullParameter(adapter, "adapter");
        s.checkNotNullParameter(config, "config");
        this.adapter = adapter;
        this.config = config;
        this.mUpdateCallback = new BrvahListUpdateCallback(adapter);
        MainThreadExecutor mainThreadExecutor = new MainThreadExecutor();
        this.sMainThreadExecutor = mainThreadExecutor;
        ?? mainThreadExecutor2 = config.getMainThreadExecutor();
        this.mMainThreadExecutor = mainThreadExecutor2 != 0 ? mainThreadExecutor2 : mainThreadExecutor;
        this.mListeners = new CopyOnWriteArrayList();
    }

    private final void latchList(List<T> list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.setData$com_github_CymChad_brvah(list);
        diffResult.dispatchUpdatesTo(this.mUpdateCallback);
        onCurrentListChanged(data, runnable);
    }

    private final void onCurrentListChanged(List<? extends T> list, Runnable runnable) {
        Iterator<ListChangeListener<T>> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onCurrentListChanged(list, this.adapter.getData());
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void submitList$default(BrvahAsyncDiffer brvahAsyncDiffer, List list, Runnable runnable, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            runnable = null;
        }
        brvahAsyncDiffer.submitList(list, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitList$lambda-1, reason: not valid java name */
    public static final void m137submitList$lambda1(final BrvahAsyncDiffer this$0, final List oldList, final List list, final int i8, final Runnable runnable) {
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(oldList, "$oldList");
        final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: com.chad.library.adapter.base.diff.BrvahAsyncDiffer$submitList$1$result$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i9, int i10) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = oldList.get(i9);
                Object obj2 = list.get(i10);
                if (obj != null && obj2 != null) {
                    brvahAsyncDifferConfig = ((BrvahAsyncDiffer) this$0).config;
                    return brvahAsyncDifferConfig.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i9, int i10) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = oldList.get(i9);
                Object obj2 = list.get(i10);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                brvahAsyncDifferConfig = ((BrvahAsyncDiffer) this$0).config;
                return brvahAsyncDifferConfig.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i9, int i10) {
                BrvahAsyncDifferConfig brvahAsyncDifferConfig;
                Object obj = oldList.get(i9);
                Object obj2 = list.get(i10);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                brvahAsyncDifferConfig = ((BrvahAsyncDiffer) this$0).config;
                return brvahAsyncDifferConfig.getDiffCallback().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return oldList.size();
            }
        });
        s.checkNotNullExpressionValue(calculateDiff, "@JvmOverloads\n    fun su…        }\n        }\n    }");
        this$0.mMainThreadExecutor.execute(new Runnable() { // from class: com.chad.library.adapter.base.diff.a
            @Override // java.lang.Runnable
            public final void run() {
                BrvahAsyncDiffer.m138submitList$lambda1$lambda0(BrvahAsyncDiffer.this, i8, list, calculateDiff, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitList$lambda-1$lambda-0, reason: not valid java name */
    public static final void m138submitList$lambda1$lambda0(BrvahAsyncDiffer this$0, int i8, List list, DiffUtil.DiffResult result, Runnable runnable) {
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(result, "$result");
        if (this$0.mMaxScheduledGeneration == i8) {
            this$0.latchList(list, result, runnable);
        }
    }

    public final void addData(int i8, T t7) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().add(i8, t7);
        this.mUpdateCallback.onInserted(i8, 1);
        onCurrentListChanged(data, null);
    }

    public final void addList(List<? extends T> list) {
        if (list == null) {
            return;
        }
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().addAll(list);
        this.mUpdateCallback.onInserted(data.size(), list.size());
        onCurrentListChanged(data, null);
    }

    @Override // com.chad.library.adapter.base.diff.DifferImp
    public void addListListener(ListChangeListener<T> listener) {
        s.checkNotNullParameter(listener, "listener");
        this.mListeners.add(listener);
    }

    public final void changeData(int i8, T t7, T t8) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().set(i8, t7);
        this.mUpdateCallback.onChanged(i8, 1, t8);
        onCurrentListChanged(data, null);
    }

    public final void clearAllListListener() {
        this.mListeners.clear();
    }

    public final void remove(T t7) {
        List<? extends T> data = this.adapter.getData();
        int indexOf = this.adapter.getData().indexOf(t7);
        if (indexOf == -1) {
            return;
        }
        this.adapter.getData().remove(indexOf);
        this.mUpdateCallback.onRemoved(indexOf, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeAt(int i8) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().remove(i8);
        this.mUpdateCallback.onRemoved(i8, 1);
        onCurrentListChanged(data, null);
    }

    public final void removeListListener(ListChangeListener<T> listener) {
        s.checkNotNullParameter(listener, "listener");
        this.mListeners.remove(listener);
    }

    public final void submitList(List<T> list) {
        submitList$default(this, list, null, 2, null);
    }

    public final void submitList(final List<T> list, final Runnable runnable) {
        final int i8 = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = i8;
        if (list == this.adapter.getData()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final List<? extends T> data = this.adapter.getData();
        if (list == null) {
            int size = this.adapter.getData().size();
            this.adapter.setData$com_github_CymChad_brvah(new ArrayList());
            this.mUpdateCallback.onRemoved(0, size);
            onCurrentListChanged(data, runnable);
            return;
        }
        if (!this.adapter.getData().isEmpty()) {
            this.config.getBackgroundThreadExecutor().execute(new Runnable() { // from class: com.chad.library.adapter.base.diff.b
                @Override // java.lang.Runnable
                public final void run() {
                    BrvahAsyncDiffer.m137submitList$lambda1(BrvahAsyncDiffer.this, data, list, i8, runnable);
                }
            });
            return;
        }
        this.adapter.setData$com_github_CymChad_brvah(list);
        this.mUpdateCallback.onInserted(0, list.size());
        onCurrentListChanged(data, runnable);
    }

    public final void addData(T t7) {
        List<? extends T> data = this.adapter.getData();
        this.adapter.getData().add(t7);
        this.mUpdateCallback.onInserted(data.size(), 1);
        onCurrentListChanged(data, null);
    }
}
