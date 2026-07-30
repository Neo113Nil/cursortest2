package com.chad.library.adapter.base.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import f6.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.jvm.internal.s;
import y5.f;

/* loaded from: classes2.dex */
public abstract class BaseItemProvider<T> {
    private final f clickViewIds$delegate;
    public Context context;
    private final f longClickViewIds$delegate;
    private WeakReference<BaseProviderMultiAdapter<T>> weakAdapter;

    public BaseItemProvider() {
        f lazy;
        f lazy2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = b.lazy(lazyThreadSafetyMode, (a) new a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$clickViewIds$2
            @Override // f6.a
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.clickViewIds$delegate = lazy;
        lazy2 = b.lazy(lazyThreadSafetyMode, (a) new a() { // from class: com.chad.library.adapter.base.provider.BaseItemProvider$longClickViewIds$2
            @Override // f6.a
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.longClickViewIds$delegate = lazy2;
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.clickViewIds$delegate.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.longClickViewIds$delegate.getValue();
    }

    public final void addChildClickViewIds(@IdRes int... ids) {
        s.checkNotNullParameter(ids, "ids");
        for (int i8 : ids) {
            getClickViewIds().add(Integer.valueOf(i8));
        }
    }

    public final void addChildLongClickViewIds(@IdRes int... ids) {
        s.checkNotNullParameter(ids, "ids");
        for (int i8 : ids) {
            getLongClickViewIds().add(Integer.valueOf(i8));
        }
    }

    public abstract void convert(BaseViewHolder baseViewHolder, T t7);

    public void convert(BaseViewHolder helper, T t7, List<? extends Object> payloads) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(payloads, "payloads");
    }

    public BaseProviderMultiAdapter<T> getAdapter() {
        WeakReference<BaseProviderMultiAdapter<T>> weakReference = this.weakAdapter;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        s.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public abstract int getItemViewType();

    @LayoutRes
    public abstract int getLayoutId();

    public void onChildClick(BaseViewHolder helper, View view, T t7, int i8) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(view, "view");
    }

    public boolean onChildLongClick(BaseViewHolder helper, View view, T t7, int i8) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(view, "view");
        return false;
    }

    public void onClick(BaseViewHolder helper, View view, T t7, int i8) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(view, "view");
    }

    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        return new BaseViewHolder(AdapterUtilsKt.getItemView(parent, getLayoutId()));
    }

    public boolean onLongClick(BaseViewHolder helper, View view, T t7, int i8) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(view, "view");
        return false;
    }

    public void onViewAttachedToWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
    }

    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
    }

    public void onViewHolderCreated(BaseViewHolder viewHolder, int i8) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
    }

    public final void setAdapter$com_github_CymChad_brvah(BaseProviderMultiAdapter<T> adapter) {
        s.checkNotNullParameter(adapter, "adapter");
        this.weakAdapter = new WeakReference<>(adapter);
    }

    public final void setContext(Context context) {
        s.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
